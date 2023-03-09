/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class886;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class168;
import lavahack.client.Class1796;
import lavahack.client.Class482;
import lavahack.client.Class649;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2={"Lcom/kisman/cc/websockets/WebClient;", "Lcom/kisman/cc/websockets/api/client/WebSocketClient;", "ip", "", "port", "", "messageProcessor", "Lcom/kisman/cc/websockets/IMessageProcessor;", "(Ljava/lang/String;ILcom/kisman/cc/websockets/IMessageProcessor;)V", "callerThread", "Ljava/lang/Thread;", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "reconnectionTriesCount", "connect", "", "onClose", "code", "reason", "remote", "onError", "ex", "Ljava/lang/Exception;", "onMessage", "bytes", "Ljava/nio/ByteBuffer;", "message", "onOpen", "handshakedata", "Lcom/kisman/cc/websockets/api/handshake/ServerHandshake;", "kisman.cc"})
public final class Class62
extends Class168 {
    private int Field8205;
    private boolean Field8206;
    private Thread Field8207;
    private final Class649 Field8208;
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
    public void Method583(@NotNull @NotNull Class482 class482) {
        Intrinsics.checkParameterIsNotNull((Object)class482, (String)"handshakedata");
        Class1796.Field16243.info("Successfully connected to remote sever!");
        this.Field8206 = true;
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
        this.Field8206 = false;
        if (n == 1000) {
            Class1796.Field16243.info("Disconnected from remote server");
            return;
        }
        if (this.Field8205 > 5) {
            Class1796.Field16243.error("Stopping reconnection to remote server, shutting down!");
            Class886.Method3717("Stopping reconnection to remote server, shutting down!", true);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder().append("Lost connection to remote server with code: \"").append(n).append("\" and reason: \"");
        String string2 = string;
        if (string2 == null) {
            string2 = "no reason";
        }
        Class1796.Field16243.error(stringBuilder.append(string2).append('\"').toString());
        Class1796.Field16243.error("Trying to reconnect!");
        Class886.Method3717("Lost connection to remote server!", false);
        this.Method571();
        int n2 = this.Field8205;
        this.Field8205 = n2 + 1;
    }

    @Override
    public void Method586(@NotNull @NotNull Exception exception) {
        Intrinsics.checkParameterIsNotNull((Object)exception, (String)"ex");
        if (Intrinsics.areEqual((Object)exception.getMessage(), (Object)"Connection refused: connect")) {
            Class1796.Field16243.error("Remove server is offline, shutting down!");
            Class886.Method3717("Remove server is offline, shutting down!", true);
            return;
        }
        Class1796.Field16243.error("Received error from web client", (Throwable)exception);
    }

    public Class62(@NotNull @NotNull String string, int n, @NotNull @NotNull Class649 class649) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"ip");
        Intrinsics.checkParameterIsNotNull((Object)class649, (String)"messageProcessor");
        super(new URI("ws://" + string + ':' + n));
        this.Field8208 = class649;
    }

    private static String Method536(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 236;
            cArray2[n] = (char)(cArray[n] ^ (0x6465 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

