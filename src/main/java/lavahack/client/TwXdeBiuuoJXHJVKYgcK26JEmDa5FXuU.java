/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.LjmXEwby3D747HQ8yMDBamZ4Wtw8da73;
import lavahack.client.OGz3PksI7r7P3jgoDOLicddnQgIm4r0W;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2={"Lcom/kisman/cc/websockets/WebClient;", "Lcom/kisman/cc/websockets/api/client/WebSocketClient;", "ip", "", "port", "", "messageProcessor", "Lcom/kisman/cc/websockets/IMessageProcessor;", "(Ljava/lang/String;ILcom/kisman/cc/websockets/IMessageProcessor;)V", "callerThread", "Ljava/lang/Thread;", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "reconnectionTriesCount", "connect", "", "onClose", "code", "reason", "remote", "onError", "ex", "Ljava/lang/Exception;", "onMessage", "bytes", "Ljava/nio/ByteBuffer;", "message", "onOpen", "handshakedata", "Lcom/kisman/cc/websockets/api/handshake/ServerHandshake;", "kisman.cc"})
public final class TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU
extends OGz3PksI7r7P3jgoDOLicddnQgIm4r0W {
    private int Field8205;
    private boolean Field8206;
    private Thread Field8207;
    private final LjmXEwby3D747HQ8yMDBamZ4Wtw8da73 Field8208;
    private int Field8209;

    public final boolean Method597() {
        return this.Field8206;
    }

    public final void Method598(boolean bl) {
        this.Field8206 = bl;
    }

    public final void Method599(@NotNull @NotNull Thread thread) {
        Intrinsics.checkParameterIsNotNull((Object)thread, (String)"callerThread");
        this.Field8207 = thread;
        this.Method571();
        thread.suspend();
    }

    @Override
    public void Method583(@NotNull @NotNull vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC2) {
        Intrinsics.checkParameterIsNotNull((Object)vpFCZT43VpbVNYAPEbuutOMSD0jwE5QC2, (String)"handshakedata");
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Successfully connected to remote sever!");
        this.Field8206 = (int)((long)1992428516 ^ (long)1992428517);
        Thread thread = this.Field8207;
        if (thread == null) return;
        thread.resume();
    }

    @Override
    public void Method584(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        this.Field8208.Method665(string);
    }

    @Override
    public void Method587(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"bytes");
    }

    @Override
    public void Method585(int n, @Nullable @Nullable String string, boolean bl) {
        this.Field8206 = (int)((long)-1788267284 ^ (long)-1788267284);
        if (n == (int)((long)899922241 ^ (long)899922236) << 3) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Disconnected from remote server");
            return;
        }
        if (this.Field8205 > ((int)1985747156L ^ 0x765C18D1)) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Stopping reconnection to remote server, shutting down!");
            agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3717("Stopping reconnection to remote server, shutting down!", (boolean)((long)-240094236 ^ (long)-240094235));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder().append("Lost connection to remote server with code: \"").append(n).append("\" and reason: \"");
        String string2 = string;
        if (string2 == null) {
            string2 = "no reason";
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error(stringBuilder.append(string2).append((int)((long)-547259961 ^ (long)-547259946) << 1).toString());
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Trying to reconnect!");
        agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3717("Lost connection to remote server!", (boolean)((long)1629126373 ^ (long)1629126373));
        this.Method571();
        int n2 = this.Field8205;
        this.Field8205 = n2 + ((int)-56731782L ^ 0xFC9E577B);
    }

    @Override
    public void Method586(@NotNull @NotNull Exception exception) {
        Intrinsics.checkParameterIsNotNull((Object)exception, (String)"ex");
        if (Intrinsics.areEqual((Object)exception.getMessage(), (Object)"Connection refused: connect")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Remove server is offline, shutting down!");
            agYEaptPUW8OPC6jB7DK1WZuIoCKRIex.Method3717("Remove server is offline, shutting down!", (boolean)((long)-1852413634 ^ (long)-1852413633));
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.error("Received error from web client", (Throwable)exception);
    }

    public TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU(@NotNull @NotNull String string, int n, @NotNull @NotNull LjmXEwby3D747HQ8yMDBamZ4Wtw8da73 ljmXEwby3D747HQ8yMDBamZ4Wtw8da73) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"ip");
        Intrinsics.checkParameterIsNotNull((Object)ljmXEwby3D747HQ8yMDBamZ4Wtw8da73, (String)"messageProcessor");
        super(new URI("ws://" + string + (((int)1970656871L ^ 0x7575D67A) << 1) + n));
        this.Field8208 = ljmXEwby3D747HQ8yMDBamZ4Wtw8da73;
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)423169314L ^ 0x19390D22;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-497466056 ^ (long)-497465913);
            int n2 = ((int)-1987860715L ^ 0x8983A72E) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)375096807 ^ (long)375120258) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

