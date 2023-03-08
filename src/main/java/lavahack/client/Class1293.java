//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.nio.*;
import java.util.concurrent.*;
import java.nio.channels.*;
import org.apache.logging.log4j.*;
import java.io.*;
import javax.net.ssl.*;

public class Class1293 implements ByteChannel, Class1608, Class1784
{
    private final Logger Field13906;
    private final SocketChannel Field13907;
    private final SSLEngine Field13908;
    private ByteBuffer Field13909;
    private ByteBuffer Field13910;
    private ByteBuffer Field13911;
    private ByteBuffer Field13912;
    private ExecutorService Field13913;
    private String Field13914 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1293(final SocketChannel field13907, final SSLEngine field13908, final ExecutorService field13909, final SelectionKey selectionKey) throws IOException {
        this.Field13906 = LogManager.getLogger((Class)Class1293.class);
        if (field13907 == null || field13908 == null || this.Field13913 == field13909) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.Field13907 = field13907;
        this.Field13908 = field13908;
        this.Field13913 = field13909;
        this.Field13910 = ByteBuffer.allocate(this.Field13908.getSession().getPacketBufferSize());
        this.Field13912 = ByteBuffer.allocate(this.Field13908.getSession().getPacketBufferSize());
        this.Field13908.beginHandshake();
        if (this.Method5253()) {
            if (selectionKey != null) {
                selectionKey.interestOps(selectionKey.interestOps() | 0x4);
            }
        }
        else {
            this.Field13907.close();
        }
    }
    
    @Override
    public synchronized int read(final ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.Field13911.hasRemaining()) {
            this.Field13911.flip();
            return Class1606.Method6268(this.Field13911, byteBuffer);
        }
        this.Field13912.compact();
        final int read = this.Field13907.read(this.Field13912);
        if (read > 0 || this.Field13912.hasRemaining()) {
            this.Field13912.flip();
            if (this.Field13912.hasRemaining()) {
                this.Field13911.compact();
                final SSLEngineResult unwrap = this.Field13908.unwrap(this.Field13912, this.Field13911);
                switch (Class1503.Field15046[unwrap.getStatus().ordinal()]) {
                    case 1: {
                        this.Field13911.flip();
                        return Class1606.Method6268(this.Field13911, byteBuffer);
                    }
                    case 2: {
                        this.Field13911.flip();
                        return Class1606.Method6268(this.Field13911, byteBuffer);
                    }
                    case 3: {
                        this.Field13911 = this.Method5255(this.Field13911);
                        return this.read(byteBuffer);
                    }
                    case 4: {
                        this.Method5258();
                        byteBuffer.clear();
                        return -1;
                    }
                    default: {
                        throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                    }
                }
            }
        }
        else if (read < 0) {
            this.Method5259();
        }
        Class1606.Method6268(this.Field13911, byteBuffer);
        return read;
    }
    
    @Override
    public synchronized int write(final ByteBuffer src) throws IOException {
        int n = 0;
        while (src.hasRemaining()) {
            this.Field13910.clear();
            final SSLEngineResult wrap = this.Field13908.wrap(src, this.Field13910);
            switch (Class1503.Field15046[wrap.getStatus().ordinal()]) {
                case 1: {
                    this.Field13910.flip();
                    while (this.Field13910.hasRemaining()) {
                        n += this.Field13907.write(this.Field13910);
                    }
                    continue;
                }
                case 3: {
                    this.Field13910 = this.Method5254(this.Field13910);
                    continue;
                }
                case 2: {
                    throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                }
                case 4: {
                    this.Method5258();
                    return 0;
                }
                default: {
                    throw new IllegalStateException("Invalid SSL status: " + wrap.getStatus());
                }
            }
        }
        return n;
    }
    
    private boolean Method5253() throws IOException {
        final int applicationBufferSize = this.Field13908.getSession().getApplicationBufferSize();
        this.Field13909 = ByteBuffer.allocate(applicationBufferSize);
        this.Field13911 = ByteBuffer.allocate(applicationBufferSize);
        this.Field13910.clear();
        this.Field13912.clear();
        SSLEngineResult.HandshakeStatus obj = this.Field13908.getHandshakeStatus();
        while (true) {
            switch (Class1503.Field15047[obj.ordinal()]) {
                case 1: {
                    final boolean b = !this.Field13912.hasRemaining();
                    this.Field13907.write(this.Field13912);
                    continue;
                }
                case 2: {
                    if (this.Field13907.read(this.Field13912) < 0) {
                        if (this.Field13908.isInboundDone() && this.Field13908.isOutboundDone()) {
                            return false;
                        }
                        this.Field13908.closeInbound();
                        this.Field13908.closeOutbound();
                        obj = this.Field13908.getHandshakeStatus();
                        continue;
                    }
                    else {
                        this.Field13912.flip();
                        final SSLEngineResult unwrap = this.Field13908.unwrap(this.Field13912, this.Field13911);
                        this.Field13912.compact();
                        obj = unwrap.getHandshakeStatus();
                        switch (Class1503.Field15046[unwrap.getStatus().ordinal()]) {
                            case 1: {
                                continue;
                            }
                            case 3: {
                                this.Field13911 = this.Method5255(this.Field13911);
                                continue;
                            }
                            case 2: {
                                this.Field13912 = this.Method5257(this.Field13912);
                                continue;
                            }
                            case 4: {
                                if (this.Field13908.isOutboundDone()) {
                                    return false;
                                }
                                this.Field13908.closeOutbound();
                                obj = this.Field13908.getHandshakeStatus();
                                continue;
                            }
                            default: {
                                throw new IllegalStateException("Invalid SSL status: " + unwrap.getStatus());
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    this.Field13910.clear();
                    final SSLEngineResult wrap = this.Field13908.wrap(this.Field13909, this.Field13910);
                    obj = wrap.getHandshakeStatus();
                    switch (Class1503.Field15046[wrap.getStatus().ordinal()]) {
                        case 1: {
                            this.Field13910.flip();
                            while (this.Field13910.hasRemaining()) {
                                this.Field13907.write(this.Field13910);
                            }
                            continue;
                        }
                        case 3: {
                            this.Field13910 = this.Method5254(this.Field13910);
                            continue;
                        }
                        case 2: {
                            throw new SSLException("Buffer underflow occurred after a wrap. I don't think we should ever get here.");
                        }
                        case 4: {
                            this.Field13910.flip();
                            while (this.Field13910.hasRemaining()) {
                                this.Field13907.write(this.Field13910);
                            }
                            this.Field13912.clear();
                            continue;
                        }
                        default: {
                            throw new IllegalStateException("Invalid SSL status: " + wrap.getStatus());
                        }
                    }
                    break;
                }
                case 4: {
                    Runnable delegatedTask;
                    while ((delegatedTask = this.Field13908.getDelegatedTask()) != null) {
                        this.Field13913.execute(delegatedTask);
                    }
                    obj = this.Field13908.getHandshakeStatus();
                    continue;
                }
                case 5: {
                    continue;
                }
                default: {
                    throw new IllegalStateException("Invalid SSL status: " + obj);
                }
            }
        }
    }
    
    private ByteBuffer Method5254(final ByteBuffer byteBuffer) {
        return this.Method5256(byteBuffer, this.Field13908.getSession().getPacketBufferSize());
    }
    
    private ByteBuffer Method5255(final ByteBuffer byteBuffer) {
        return this.Method5256(byteBuffer, this.Field13908.getSession().getApplicationBufferSize());
    }
    
    private ByteBuffer Method5256(ByteBuffer byteBuffer, final int capacity) {
        if (capacity > byteBuffer.capacity()) {
            byteBuffer = ByteBuffer.allocate(capacity);
        }
        else {
            byteBuffer = ByteBuffer.allocate(byteBuffer.capacity() * 2);
        }
        return byteBuffer;
    }
    
    private ByteBuffer Method5257(final ByteBuffer src) {
        if (this.Field13908.getSession().getPacketBufferSize() < src.limit()) {
            return src;
        }
        final ByteBuffer method5254 = this.Method5254(src);
        src.flip();
        method5254.put(src);
        return method5254;
    }
    
    private void Method5258() throws IOException {
        this.Field13908.closeOutbound();
        this.Method5253();
        this.Field13907.close();
    }
    
    private void Method5259() throws IOException {
        this.Field13908.closeInbound();
        this.Method5258();
    }
    
    @Override
    public boolean Method2482() {
        return false;
    }
    
    @Override
    public void Method2483() throws IOException {
    }
    
    @Override
    public boolean Method2484() {
        return this.Field13912.hasRemaining() || this.Field13911.hasRemaining();
    }
    
    @Override
    public int Method2485(final ByteBuffer byteBuffer) throws IOException {
        return this.read(byteBuffer);
    }
    
    @Override
    public boolean Method2486() {
        return this.Field13907.isBlocking();
    }
    
    @Override
    public boolean isOpen() {
        return this.Field13907.isOpen();
    }
    
    @Override
    public void close() throws IOException {
        this.Method5258();
    }
    
    @Override
    public SSLEngine Method2487() {
        return this.Field13908;
    }
    
    private static String Method5260(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B65 ^ 0xE2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
