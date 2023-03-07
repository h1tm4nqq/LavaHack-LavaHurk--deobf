/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package lavahack.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import lavahack.client.DFErp9T9eeNlJpVC6NLojB02MDiAMZoy;
import lavahack.client.mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ;
import lavahack.client.qcN6GMzSxw5IRGtqQaLaxz5Iw1NKZzsc;
import lavahack.client.yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1
implements ByteChannel,
DFErp9T9eeNlJpVC6NLojB02MDiAMZoy,
qcN6GMzSxw5IRGtqQaLaxz5Iw1NKZzsc {
    private final Logger Field13906 = LogManager.getLogger(yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1.class);
    private final SocketChannel Field13907;
    private final SSLEngine Field13908;
    private ByteBuffer Field13909;
    private ByteBuffer Field13910;
    private ByteBuffer Field13911;
    private ByteBuffer Field13912;
    private ExecutorService Field13913;
    private String Field13914 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null) throw new IllegalArgumentException("parameter must not be null");
        if (sSLEngine == null) throw new IllegalArgumentException("parameter must not be null");
        if (this.Field13913 == executorService) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.Field13907 = socketChannel;
        this.Field13908 = sSLEngine;
        this.Field13913 = executorService;
        this.Field13910 = ByteBuffer.allocate(this.Field13908.getSession().getPacketBufferSize());
        this.Field13912 = ByteBuffer.allocate(this.Field13908.getSession().getPacketBufferSize());
        this.Field13908.beginHandshake();
        if (this.Method5253()) {
            if (selectionKey == null) return;
            selectionKey.interestOps(selectionKey.interestOps() | (int)((long)856793786 ^ (long)856793787) << 2);
            return;
        }
        this.Field13907.close();
    }

    @Override
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return (int)1335216269L ^ 0x4F95C88D;
        }
        if (this.Field13911.hasRemaining()) {
            this.Field13911.flip();
            return mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ.Method6268(this.Field13911, byteBuffer);
        }
        this.Field13912.compact();
        int n = this.Field13907.read(this.Field13912);
        if (n > 0 || this.Field13912.hasRemaining()) {
            this.Field13912.flip();
            if (this.Field13912.hasRemaining()) {
                this.Field13911.compact();
                SSLEngineResult sSLEngineResult = this.Field13908.unwrap(this.Field13912, this.Field13911);
                switch (yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15046[sSLEngineResult.getStatus().ordinal()]) {
                    case 1: {
                        this.Field13911.flip();
                        return mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ.Method6268(this.Field13911, byteBuffer);
                    }
                    case 2: {
                        this.Field13911.flip();
                        return mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ.Method6268(this.Field13911, byteBuffer);
                    }
                    case 3: {
                        this.Field13911 = this.Method5255(this.Field13911);
                        return this.read(byteBuffer);
                    }
                    case 4: {
                        this.Method5258();
                        byteBuffer.clear();
                        return (int)-1858420860L ^ 0x6EC5407B;
                    }
                }
                throw new IllegalStateException("Invalid SSL status: " + (Object)((Object)sSLEngineResult.getStatus()));
            }
        } else if (n < 0) {
            this.Method5259();
        }
        mS1YzPN2WkRcDNTD0pk5CFFQfS7K85mZ.Method6268(this.Field13911, byteBuffer);
        return n;
    }

    /*
     * Exception decompiling
     */
    @Override
    public synchronized int write(ByteBuffer var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private boolean Method5253() throws IOException {
        int n = this.Field13908.getSession().getApplicationBufferSize();
        this.Field13909 = ByteBuffer.allocate(n);
        this.Field13911 = ByteBuffer.allocate(n);
        this.Field13910.clear();
        this.Field13912.clear();
        SSLEngineResult.HandshakeStatus handshakeStatus = this.Field13908.getHandshakeStatus();
        int n2 = (int)416478571L ^ 0x18D2F56B;
        block19: while (true) {
            switch (yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15047[handshakeStatus.ordinal()]) {
                case 1: {
                    n2 = !this.Field13912.hasRemaining() ? (int)-143498264L ^ 0xF77263E9 : (int)-118426943L ^ 0xF8F0F2C1;
                    this.Field13907.write(this.Field13912);
                    continue block19;
                }
                case 2: {
                    if (this.Field13907.read(this.Field13912) < 0) {
                        if (this.Field13908.isInboundDone() && this.Field13908.isOutboundDone()) {
                            return ((int)1025313843L ^ 0x3D1D0C33) != 0;
                        }
                        this.Field13908.closeInbound();
                        this.Field13908.closeOutbound();
                        handshakeStatus = this.Field13908.getHandshakeStatus();
                        continue block19;
                    }
                    this.Field13912.flip();
                    SSLEngineResult sSLEngineResult = this.Field13908.unwrap(this.Field13912, this.Field13911);
                    this.Field13912.compact();
                    handshakeStatus = sSLEngineResult.getHandshakeStatus();
                    switch (yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15046[sSLEngineResult.getStatus().ordinal()]) {
                        case 1: {
                            continue block19;
                        }
                        case 3: {
                            this.Field13911 = this.Method5255(this.Field13911);
                            continue block19;
                        }
                        case 2: {
                            this.Field13912 = this.Method5257(this.Field13912);
                            continue block19;
                        }
                        case 4: {
                            if (this.Field13908.isOutboundDone()) {
                                return ((int)851852596L ^ 0x32C63D34) != 0;
                            }
                            this.Field13908.closeOutbound();
                            handshakeStatus = this.Field13908.getHandshakeStatus();
                            continue block19;
                        }
                    }
                    throw new IllegalStateException("Invalid SSL status: " + (Object)((Object)sSLEngineResult.getStatus()));
                }
                case 3: {
                    this.Field13910.clear();
                    SSLEngineResult sSLEngineResult = this.Field13908.wrap(this.Field13909, this.Field13910);
                    handshakeStatus = sSLEngineResult.getHandshakeStatus();
                    switch (yaTDqQ9ZwMAUrRQYramfpuVWQo8oJkh1$1.Field15046[sSLEngineResult.getStatus().ordinal()]) {
                        case 1: {
                            this.Field13910.flip();
                            while (true) {
                                if (!this.Field13910.hasRemaining()) continue block19;
                                this.Field13907.write(this.Field13910);
                            }
                        }
                        case 3: {
                            this.Field13910 = this.Method5254(this.Field13910);
                            continue block19;
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
                            continue block19;
                        }
                    }
                    throw new IllegalStateException("Invalid SSL status: " + (Object)((Object)sSLEngineResult.getStatus()));
                }
                case 4: {
                    Runnable runnable;
                    while ((runnable = this.Field13908.getDelegatedTask()) != null) {
                        this.Field13913.execute(runnable);
                    }
                    handshakeStatus = this.Field13908.getHandshakeStatus();
                    continue block19;
                }
                case 5: {
                    continue block19;
                }
            }
            break;
        }
        throw new IllegalStateException("Invalid SSL status: " + (Object)((Object)handshakeStatus));
    }

    private ByteBuffer Method5254(ByteBuffer byteBuffer) {
        return this.Method5256(byteBuffer, this.Field13908.getSession().getPacketBufferSize());
    }

    private ByteBuffer Method5255(ByteBuffer byteBuffer) {
        return this.Method5256(byteBuffer, this.Field13908.getSession().getApplicationBufferSize());
    }

    private ByteBuffer Method5256(ByteBuffer byteBuffer, int n) {
        if (n <= byteBuffer.capacity()) return ByteBuffer.allocate(byteBuffer.capacity() * (((int)1323108572L ^ 0x4EDD08DD) << 1));
        return ByteBuffer.allocate(n);
    }

    private ByteBuffer Method5257(ByteBuffer byteBuffer) {
        if (this.Field13908.getSession().getPacketBufferSize() < byteBuffer.limit()) {
            return byteBuffer;
        }
        ByteBuffer byteBuffer2 = this.Method5254(byteBuffer);
        byteBuffer.flip();
        byteBuffer2.put(byteBuffer);
        return byteBuffer2;
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
        return ((int)261026853L ^ 0xF8EF425) != 0;
    }

    @Override
    public void Method2483() throws IOException {
    }

    @Override
    public boolean Method2484() {
        int n;
        if (!this.Field13912.hasRemaining() && !this.Field13911.hasRemaining()) {
            n = (int)-1552579292L ^ 0xA3758524;
            return n != 0;
        }
        n = (int)((long)248135602 ^ (long)248135603);
        return n != 0;
    }

    @Override
    public int Method2485(ByteBuffer byteBuffer) throws IOException {
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

    private static String Method5260(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)23704269L ^ 0x169B2CD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1070642156 ^ (long)1070641939);
            int n2 = ((int)-1582950299L ^ 0xA1A61814) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1051572650 ^ (long)-1051587277) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

