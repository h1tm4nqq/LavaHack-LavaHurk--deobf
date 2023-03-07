/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.apache.logging.log4j.Logger
 */
package lavahack.loader;

import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import java.net.URI;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh;
import lavahack.loader.Z9isRG6BYbrxGGNGITuabJZMH69DuRSA;
import lavahack.loader.xthiG5kgsZ7gUpqshm3SOX812RpS42oo;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2={"Lcom/kisman/cc/loader/websockets/WebClient;", "Lcom/kisman/cc/loader/websockets/api/client/WebSocketClient;", "ip", "", "port", "", "messageProcessor", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "(Ljava/lang/String;ILcom/kisman/cc/loader/websockets/IMessageProcessor;)V", "callerThread", "Ljava/lang/Thread;", "connected", "", "getConnected", "()Z", "setConnected", "(Z)V", "reconnectionTriesCount", "connect", "", "onClose", "code", "reason", "remote", "onError", "ex", "Ljava/lang/Exception;", "onMessage", "bytes", "Ljava/nio/ByteBuffer;", "message", "onOpen", "handshakedata", "Lcom/kisman/cc/loader/websockets/api/handshake/ServerHandshake;", "kisman.cc"})
public final class qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6
extends Z9isRG6BYbrxGGNGITuabJZMH69DuRSA {
    private int Field11395;
    private boolean Field11396;
    private Thread Field11397;
    private final xthiG5kgsZ7gUpqshm3SOX812RpS42oo Field11398;
    private String Field11399 = "TheKisDevs & LavaHack Development owns you";

    public final boolean Method3378() {
        return this.Field11396;
    }

    public final void Method3379(boolean bl) {
        this.Field11396 = bl;
    }

    public final void Method3380(@NotNull @NotNull Thread thread) {
        Intrinsics.checkParameterIsNotNull((Object)thread, (String)"callerThread");
        this.Field11397 = thread;
        this.Method3352();
        thread.suspend();
    }

    @Override
    public void Method3364(@NotNull @NotNull BrWsHdiLAwYGSB35z3ypQAx8eRulUOBh brWsHdiLAwYGSB35z3ypQAx8eRulUOBh) {
        Intrinsics.checkParameterIsNotNull((Object)brWsHdiLAwYGSB35z3ypQAx8eRulUOBh, (String)"handshakedata");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Successfully connected to remote sever!");
        this.Field11396 = (int)((long)-585199188 ^ (long)-585199187);
        Thread thread = this.Field11397;
        if (thread == null) return;
        thread.resume();
    }

    @Override
    public void Method3365(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        this.Field11398.Method852(string);
    }

    @Override
    public void Method3368(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"bytes");
        this.Field11398.Method853(byteBuffer);
    }

    @Override
    public void Method3366(int n, @Nullable @Nullable String string, boolean bl) {
        this.Field11396 = (int)((long)307364363 ^ (long)307364363);
        if (n == (int)((long)-1174821402 ^ (long)-1174821477) << 3) {
            LavaHackLoaderCoreMod.Companion.getLOGGER().info("Disconnected from remote server");
            return;
        }
        if (this.Field11395 > (int)((long)-125457891 ^ (long)-125457896)) {
            LavaHackLoaderCoreMod.Companion.getLOGGER().error("Stopping reconnection to remote server, shutting down!");
            UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4893("Stopping reconnection to remote server, shutting down!", ((int)-393171638L ^ 0xE890AD4B) != 0);
            return;
        }
        Logger logger = LavaHackLoaderCoreMod.Companion.getLOGGER();
        StringBuilder stringBuilder = new StringBuilder().append("Lost connection to remote server with code: \"").append(n).append("\" and reason: \"");
        String string2 = string;
        if (string2 == null) {
            string2 = "no reason";
        }
        logger.error(stringBuilder.append(string2).append((int)((long)1471933215 ^ (long)1471933198) << 1).toString());
        LavaHackLoaderCoreMod.Companion.getLOGGER().error("Trying to reconnect!");
        UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4893("Lost connection to remote server!", ((int)-677011988L ^ 0xD7A59DEC) != 0);
        this.Method3352();
        int n2 = this.Field11395;
        this.Field11395 = n2 + ((int)-1829481078L ^ 0x92F4558B);
    }

    @Override
    public void Method3367(@NotNull @NotNull Exception exception) {
        Intrinsics.checkParameterIsNotNull((Object)exception, (String)"ex");
        if (Intrinsics.areEqual((Object)exception.getMessage(), (Object)"Connection refused: connect")) {
            LavaHackLoaderCoreMod.Companion.getLOGGER().error("Remove server is offline, shutting down!");
            UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4893("Remove server is offline, shutting down!", (boolean)((long)1039734908 ^ (long)1039734909));
            return;
        }
        LavaHackLoaderCoreMod.Companion.getLOGGER().error("Received error from web client", (Throwable)exception);
    }

    public qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6(@NotNull @NotNull String string, int n, @NotNull @NotNull xthiG5kgsZ7gUpqshm3SOX812RpS42oo xthiG5kgsZ7gUpqshm3SOX812RpS42oo2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"ip");
        Intrinsics.checkParameterIsNotNull((Object)xthiG5kgsZ7gUpqshm3SOX812RpS42oo2, (String)"messageProcessor");
        super(new URI("ws://" + string + ((int)((long)1378743614 ^ (long)1378743587) << 1) + n));
        this.Field11398 = xthiG5kgsZ7gUpqshm3SOX812RpS42oo2;
    }

    private static String Method2690(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1993071590L ^ 0x76CBDBE6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-170005621L ^ 0xF5DDEB74);
            int n2 = (int)((long)640909969 ^ (long)640909826);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1020814925 ^ (long)1020789974) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

