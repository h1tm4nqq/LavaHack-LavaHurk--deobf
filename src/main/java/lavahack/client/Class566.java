/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import lavahack.client.Class1608;
import lavahack.client.Class1784;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class566
implements ByteChannel,
Class1608,
Class1784 {
    protected static ByteBuffer Field10402;
    private final Logger Field10403 = LogManager.getLogger(Class566.class);
    protected ExecutorService Field10404;
    protected List Field10405;
    protected ByteBuffer Field10406;
    protected ByteBuffer Field10407;
    protected ByteBuffer Field10408;
    protected SocketChannel Field10409;
    protected SelectionKey Field10410;
    protected SSLEngine Field10411;
    protected SSLEngineResult Field10412;
    protected SSLEngineResult Field10413;
    protected int Field10414 = 0;
    private byte[] Field10415 = null;
    static final boolean Field10416;
    private String Field10417 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class566(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null) throw new IllegalArgumentException("parameter must not be null");
        if (sSLEngine == null) throw new IllegalArgumentException("parameter must not be null");
        if (executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.Field10409 = socketChannel;
        this.Field10411 = sSLEngine;
        this.Field10404 = executorService;
        this.Field10412 = this.Field10413 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.Field10405 = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.Field10410 = selectionKey;
        }
        this.Method2493(sSLEngine.getSession());
        this.Field10409.write(this.Method2490(Field10402));
        this.Method2489();
    }

    private void Method2488(Future future) {
        future.get();
    }

    private synchronized void Method2489() throws IOException {
        if (this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return;
        }
        if (!this.Field10405.isEmpty()) {
            Iterator iterator = this.Field10405.iterator();
            while (iterator.hasNext()) {
                Future future = (Future)iterator.next();
                if (!future.isDone()) {
                    if (!this.Method2486()) return;
                    this.Method2488(future);
                    return;
                }
                iterator.remove();
            }
        }
        if (this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            if (!this.Method2486() || this.Field10412.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                this.Field10408.compact();
                int n = this.Field10409.read(this.Field10408);
                if (n == -1) {
                    throw new IOException("connection closed unexpectedly by peer");
                }
                this.Field10408.flip();
            }
            this.Field10406.compact();
            this.Method2491();
            if (this.Field10412.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.Method2493(this.Field10411.getSession());
                return;
            }
        }
        this.Method2492();
        if (this.Field10405.isEmpty() || this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            this.Field10409.write(this.Method2490(Field10402));
            if (this.Field10413.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.Method2493(this.Field10411.getSession());
                return;
            }
        }
        if (!Field10416 && this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            throw new AssertionError();
        }
        this.Field10414 = 1;
    }

    private synchronized ByteBuffer Method2490(ByteBuffer byteBuffer) throws SSLException {
        this.Field10407.compact();
        this.Field10413 = this.Field10411.wrap(byteBuffer, this.Field10407);
        this.Field10407.flip();
        return this.Field10407;
    }

    private synchronized ByteBuffer Method2491() throws SSLException {
        int n;
        if (this.Field10412.getStatus() == SSLEngineResult.Status.CLOSED && this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            this.close();
        }
        do {
            n = this.Field10406.remaining();
            this.Field10412 = this.Field10411.unwrap(this.Field10408, this.Field10406);
        } while (this.Field10412.getStatus() == SSLEngineResult.Status.OK && (n != this.Field10406.remaining() || this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP));
        this.Field10406.flip();
        return this.Field10406;
    }

    protected void Method2492() {
        Runnable runnable;
        while ((runnable = this.Field10411.getDelegatedTask()) != null) {
            this.Field10405.add(this.Field10404.submit(runnable));
        }
    }

    protected void Method2493(SSLSession sSLSession) {
        this.Method2503();
        int n = sSLSession.getPacketBufferSize();
        int n2 = Math.max(sSLSession.getApplicationBufferSize(), n);
        if (this.Field10406 == null) {
            this.Field10406 = ByteBuffer.allocate(n2);
            this.Field10407 = ByteBuffer.allocate(n);
            this.Field10408 = ByteBuffer.allocate(n);
        } else {
            if (this.Field10406.capacity() != n2) {
                this.Field10406 = ByteBuffer.allocate(n2);
            }
            if (this.Field10407.capacity() != n) {
                this.Field10407 = ByteBuffer.allocate(n);
            }
            if (this.Field10408.capacity() != n) {
                this.Field10408 = ByteBuffer.allocate(n);
            }
        }
        if (this.Field10406.remaining() != 0 && this.Field10403.isTraceEnabled()) {
            this.Field10403.trace(new String(this.Field10406.array(), this.Field10406.position(), this.Field10406.remaining()));
        }
        this.Field10406.rewind();
        this.Field10406.flip();
        if (this.Field10408.remaining() != 0 && this.Field10403.isTraceEnabled()) {
            this.Field10403.trace(new String(this.Field10408.array(), this.Field10408.position(), this.Field10408.remaining()));
        }
        this.Field10408.rewind();
        this.Field10408.flip();
        this.Field10407.rewind();
        this.Field10407.flip();
        ++this.Field10414;
    }

    @Override
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.Method2496()) {
            this.Method2489();
            return 0;
        }
        int n = this.Field10409.write(this.Method2490(byteBuffer));
        if (this.Field10413.getStatus() != SSLEngineResult.Status.CLOSED) return n;
        throw new EOFException("Connection is closed");
    }

    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        this.Method2504();
        while (byteBuffer.hasRemaining()) {
            int n;
            if (!this.Method2496()) {
                if (this.Method2486()) {
                    while (!this.Method2496()) {
                        this.Method2489();
                    }
                } else {
                    this.Method2489();
                    if (!this.Method2496()) {
                        return 0;
                    }
                }
            }
            if ((n = this.Method2494(byteBuffer)) != 0) {
                return n;
            }
            if (!Field10416 && this.Field10406.position() != 0) {
                throw new AssertionError();
            }
            this.Field10406.clear();
            if (!this.Field10408.hasRemaining()) {
                this.Field10408.clear();
            } else {
                this.Field10408.compact();
            }
            if ((this.Method2486() || this.Field10412.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.Field10409.read(this.Field10408) == -1) {
                return -1;
            }
            this.Field10408.flip();
            this.Method2491();
            int n2 = this.Method2502(this.Field10406, byteBuffer);
            if (n2 != 0) return n2;
            if (!this.Method2486()) return n2;
        }
        return 0;
    }

    private int Method2494(ByteBuffer byteBuffer) throws SSLException {
        if (this.Field10406.hasRemaining()) {
            return this.Method2502(this.Field10406, byteBuffer);
        }
        if (!this.Field10406.hasRemaining()) {
            this.Field10406.clear();
        }
        this.Method2504();
        if (!this.Field10408.hasRemaining()) return 0;
        this.Method2491();
        int n = this.Method2502(this.Field10406, byteBuffer);
        if (this.Field10412.getStatus() == SSLEngineResult.Status.CLOSED) {
            return -1;
        }
        if (n <= 0) return 0;
        return n;
    }

    public boolean Method2495() {
        return this.Field10409.isConnected();
    }

    @Override
    public void close() throws IOException {
        this.Field10411.closeOutbound();
        this.Field10411.getSession().invalidate();
        if (this.Field10409.isOpen()) {
            this.Field10409.write(this.Method2490(Field10402));
        }
        this.Field10409.close();
    }

    private boolean Method2496() {
        SSLEngineResult.HandshakeStatus handshakeStatus = this.Field10411.getHandshakeStatus();
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED) return true;
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) return true;
        return false;
    }

    public SelectableChannel Method2497(boolean bl) throws IOException {
        return this.Field10409.configureBlocking(bl);
    }

    public boolean Method2498(SocketAddress socketAddress) throws IOException {
        return this.Field10409.connect(socketAddress);
    }

    public boolean Method2499() throws IOException {
        return this.Field10409.finishConnect();
    }

    public Socket Method2500() {
        return this.Field10409.socket();
    }

    public boolean Method2501() {
        return this.Field10411.isInboundDone();
    }

    @Override
    public boolean isOpen() {
        return this.Field10409.isOpen();
    }

    @Override
    public boolean Method2482() {
        if (this.Field10407.hasRemaining()) return true;
        if (!this.Method2496()) return true;
        return false;
    }

    @Override
    public void Method2483() throws IOException {
        this.write(this.Field10407);
    }

    @Override
    public boolean Method2484() {
        if (this.Field10415 != null) return true;
        if (this.Field10406.hasRemaining()) return true;
        if (!this.Field10408.hasRemaining()) return false;
        if (this.Field10412.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) return false;
        if (this.Field10412.getStatus() == SSLEngineResult.Status.CLOSED) return false;
        return true;
    }

    @Override
    public int Method2485(ByteBuffer byteBuffer) throws SSLException {
        return this.Method2494(byteBuffer);
    }

    private int Method2502(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int n;
        int n2 = byteBuffer.remaining();
        if (n2 <= (n = byteBuffer2.remaining())) {
            byteBuffer2.put(byteBuffer);
            return n2;
        }
        int n3 = Math.min(n2, n);
        int n4 = 0;
        while (n4 < n3) {
            byteBuffer2.put(byteBuffer.get());
            ++n4;
        }
        return n3;
    }

    @Override
    public boolean Method2486() {
        return this.Field10409.isBlocking();
    }

    @Override
    public SSLEngine Method2487() {
        return this.Field10411;
    }

    private void Method2503() {
        if (this.Field10408 == null) return;
        if (this.Field10408.remaining() <= 0) return;
        int n = this.Field10408.remaining();
        this.Field10415 = new byte[n];
        this.Field10408.get(this.Field10415);
    }

    private void Method2504() {
        if (this.Field10415 == null) return;
        this.Field10408.clear();
        this.Field10408.put(this.Field10415);
        this.Field10408.flip();
        this.Field10415 = null;
    }

    static {
        Field10416 = !Class566.class.desiredAssertionStatus();
        Field10402 = ByteBuffer.allocate(0);
    }

    private static String Method2505(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 153;
            cArray2[n] = (char)(cArray[n] ^ (0x38F7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

