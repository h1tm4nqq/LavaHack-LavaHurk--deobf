//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import org.apache.logging.log4j.*;
import java.util.concurrent.*;
import java.util.*;
import javax.net.ssl.*;
import java.io.*;
import java.nio.channels.*;
import java.net.*;

public class Class566 implements ByteChannel, Class1608, Class1784
{
    protected static ByteBuffer Field10402;
    private final Logger Field10403;
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
    protected int Field10414;
    private byte[] Field10415;
    static final boolean Field10416;
    private String Field10417 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class566(final SocketChannel field10409, final SSLEngine field10410, final ExecutorService field10411, final SelectionKey field10412) throws IOException {
        this.Field10403 = LogManager.getLogger((Class)Class566.class);
        this.Field10414 = 0;
        this.Field10415 = null;
        if (field10409 == null || field10410 == null || field10411 == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.Field10409 = field10409;
        this.Field10411 = field10410;
        this.Field10404 = field10411;
        final SSLEngineResult sslEngineResult = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, field10410.getHandshakeStatus(), 0, 0);
        this.Field10413 = sslEngineResult;
        this.Field10412 = sslEngineResult;
        this.Field10405 = new ArrayList(3);
        if (field10412 != null) {
            field10412.interestOps(field10412.interestOps() | 0x4);
            this.Field10410 = field10412;
        }
        this.Method2493(field10410.getSession());
        this.Field10409.write(this.Method2490(Class566.Field10402));
        this.Method2489();
    }
    
    private void Method2488(final Future future) {
        future.get();
    }
    
    private synchronized void Method2489() throws IOException {
        if (this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            return;
        }
        if (!this.Field10405.isEmpty()) {
            final Iterator<Future> iterator = (Iterator<Future>)this.Field10405.iterator();
            while (iterator.hasNext()) {
                final Future future = iterator.next();
                if (!future.isDone()) {
                    if (this.Method2486()) {
                        this.Method2488(future);
                    }
                    return;
                }
                iterator.remove();
            }
        }
        if (this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            if (!this.Method2486() || this.Field10412.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                this.Field10408.compact();
                if (this.Field10409.read(this.Field10408) == -1) {
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
            this.Field10409.write(this.Method2490(Class566.Field10402));
            if (this.Field10413.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.Method2493(this.Field10411.getSession());
                return;
            }
        }
        if (!Class566.Field10416 && this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            throw new AssertionError();
        }
        this.Field10414 = 1;
    }
    
    private synchronized ByteBuffer Method2490(final ByteBuffer src) throws SSLException {
        this.Field10407.compact();
        this.Field10413 = this.Field10411.wrap(src, this.Field10407);
        this.Field10407.flip();
        return this.Field10407;
    }
    
    private synchronized ByteBuffer Method2491() throws SSLException {
        if (this.Field10412.getStatus() == SSLEngineResult.Status.CLOSED && this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING) {
            this.close();
        }
        int remaining;
        do {
            remaining = this.Field10406.remaining();
            this.Field10412 = this.Field10411.unwrap(this.Field10408, this.Field10406);
        } while (this.Field10412.getStatus() == SSLEngineResult.Status.OK && (remaining != this.Field10406.remaining() || this.Field10411.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP));
        this.Field10406.flip();
        return this.Field10406;
    }
    
    protected void Method2492() {
        Runnable delegatedTask;
        while ((delegatedTask = this.Field10411.getDelegatedTask()) != null) {
            this.Field10405.add(this.Field10404.submit(delegatedTask));
        }
    }
    
    protected void Method2493(final SSLSession sslSession) {
        this.Method2503();
        final int packetBufferSize = sslSession.getPacketBufferSize();
        final int max = Math.max(sslSession.getApplicationBufferSize(), packetBufferSize);
        if (this.Field10406 == null) {
            this.Field10406 = ByteBuffer.allocate(max);
            this.Field10407 = ByteBuffer.allocate(packetBufferSize);
            this.Field10408 = ByteBuffer.allocate(packetBufferSize);
        }
        else {
            if (this.Field10406.capacity() != max) {
                this.Field10406 = ByteBuffer.allocate(max);
            }
            if (this.Field10407.capacity() != packetBufferSize) {
                this.Field10407 = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.Field10408.capacity() != packetBufferSize) {
                this.Field10408 = ByteBuffer.allocate(packetBufferSize);
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
    
    public int write(final ByteBuffer byteBuffer) throws IOException {
        if (!this.Method2496()) {
            this.Method2489();
            return 0;
        }
        final int write = this.Field10409.write(this.Method2490(byteBuffer));
        if (this.Field10413.getStatus() == SSLEngineResult.Status.CLOSED) {
            throw new EOFException("Connection is closed");
        }
        return write;
    }
    
    public int read(final ByteBuffer byteBuffer) throws IOException {
        this.Method2504();
        while (byteBuffer.hasRemaining()) {
            if (!this.Method2496()) {
                if (this.Method2486()) {
                    while (!this.Method2496()) {
                        this.Method2489();
                    }
                }
                else {
                    this.Method2489();
                    if (!this.Method2496()) {
                        return 0;
                    }
                }
            }
            final int method2494 = this.Method2494(byteBuffer);
            if (method2494 != 0) {
                return method2494;
            }
            if (!Class566.Field10416 && this.Field10406.position() != 0) {
                throw new AssertionError();
            }
            this.Field10406.clear();
            if (!this.Field10408.hasRemaining()) {
                this.Field10408.clear();
            }
            else {
                this.Field10408.compact();
            }
            if ((this.Method2486() || this.Field10412.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) && this.Field10409.read(this.Field10408) == -1) {
                return -1;
            }
            this.Field10408.flip();
            this.Method2491();
            final int method2495 = this.Method2502(this.Field10406, byteBuffer);
            if (method2495 == 0 && this.Method2486()) {
                continue;
            }
            return method2495;
        }
        return 0;
    }
    
    private int Method2494(final ByteBuffer byteBuffer) throws SSLException {
        if (this.Field10406.hasRemaining()) {
            return this.Method2502(this.Field10406, byteBuffer);
        }
        if (!this.Field10406.hasRemaining()) {
            this.Field10406.clear();
        }
        this.Method2504();
        if (this.Field10408.hasRemaining()) {
            this.Method2491();
            final int method2502 = this.Method2502(this.Field10406, byteBuffer);
            if (this.Field10412.getStatus() == SSLEngineResult.Status.CLOSED) {
                return -1;
            }
            if (method2502 > 0) {
                return method2502;
            }
        }
        return 0;
    }
    
    public boolean Method2495() {
        return this.Field10409.isConnected();
    }
    
    public void close() throws IOException {
        this.Field10411.closeOutbound();
        this.Field10411.getSession().invalidate();
        if (this.Field10409.isOpen()) {
            this.Field10409.write(this.Method2490(Class566.Field10402));
        }
        this.Field10409.close();
    }
    
    private boolean Method2496() {
        final SSLEngineResult.HandshakeStatus handshakeStatus = this.Field10411.getHandshakeStatus();
        return handshakeStatus == SSLEngineResult.HandshakeStatus.FINISHED || handshakeStatus == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }
    
    public SelectableChannel Method2497(final boolean block) throws IOException {
        return this.Field10409.configureBlocking(block);
    }
    
    public boolean Method2498(final SocketAddress socketAddress) throws IOException {
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
    
    public boolean isOpen() {
        return this.Field10409.isOpen();
    }
    
    public boolean Method2482() {
        return this.Field10407.hasRemaining() || !this.Method2496();
    }
    
    public void Method2483() throws IOException {
        this.write(this.Field10407);
    }
    
    public boolean Method2484() {
        return this.Field10415 != null || this.Field10406.hasRemaining() || (this.Field10408.hasRemaining() && this.Field10412.getStatus() != SSLEngineResult.Status.BUFFER_UNDERFLOW && this.Field10412.getStatus() != SSLEngineResult.Status.CLOSED);
    }
    
    public int Method2485(final ByteBuffer byteBuffer) throws SSLException {
        return this.Method2494(byteBuffer);
    }
    
    private int Method2502(final ByteBuffer src, final ByteBuffer byteBuffer) {
        final int remaining = src.remaining();
        final int remaining2 = byteBuffer.remaining();
        if (remaining > remaining2) {
            final int min = Math.min(remaining, remaining2);
            for (int i = 0; i < min; ++i) {
                byteBuffer.put(src.get());
            }
            return min;
        }
        byteBuffer.put(src);
        return remaining;
    }
    
    public boolean Method2486() {
        return this.Field10409.isBlocking();
    }
    
    public SSLEngine Method2487() {
        return this.Field10411;
    }
    
    private void Method2503() {
        if (this.Field10408 != null && this.Field10408.remaining() > 0) {
            this.Field10415 = new byte[this.Field10408.remaining()];
            this.Field10408.get(this.Field10415);
        }
    }
    
    private void Method2504() {
        if (this.Field10415 != null) {
            this.Field10408.clear();
            this.Field10408.put(this.Field10415);
            this.Field10408.flip();
            this.Field10415 = null;
        }
    }
    
    static {
        Field10416 = !Class566.class.desiredAssertionStatus();
        Class566.Field10402 = ByteBuffer.allocate(0);
    }
    
    private static String Method2505(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x38F7 ^ 0x99));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
