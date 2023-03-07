/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  lavahack.loader.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex
 */
package lavahack.loader;

import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.W3C0y9394VvVcZKAtDfQSnqXm5zLQGty;
import lavahack.loader.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import lavahack.loader.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.loader.xthiG5kgsZ7gUpqshm3SOX812RpS42oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2={"DUMMY_MESSAGE_PROCESSOR", "Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "getDUMMY_MESSAGE_PROCESSOR", "()Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "client", "Lcom/kisman/cc/loader/websockets/WebClient;", "getClient", "()Lcom/kisman/cc/loader/websockets/WebClient;", "setClient", "(Lcom/kisman/cc/loader/websockets/WebClient;)V", "initClient", "", "reportIssue", "message", "", "setupClient", "messageProcessor", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "kisman.cc"})
public final class eZjgvzONpduAwYxUJP1g1vLc32WdbH9H {
    @Nullable
    private static qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 Field12112;
    @NotNull
    private static final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty Field12113;
    private String Field12114 = "TheKisDevs & LavaHack Development owns you";

    @Nullable
    @Nullable
    public static final qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 Method3953() {
        return Field12112;
    }

    public static final void Method3954(@Nullable @Nullable qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62) {
        Field12112 = qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62;
    }

    @NotNull
    @NotNull
    public static final W3C0y9394VvVcZKAtDfQSnqXm5zLQGty Method3955() {
        return Field12113;
    }

    public static final void Method3956() {
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Connecting to remove server");
        Field12112 = eZjgvzONpduAwYxUJP1g1vLc32WdbH9H.Method3958((xthiG5kgsZ7gUpqshm3SOX812RpS42oo)new agYEaptPUW8OPC6jB7DK1WZuIoCKRIex());
    }

    public static final void Method3957(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 = Field12112;
        if (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 == null) return;
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method3322("sendmessage Received new message: \"" + string + (((int)815499443L ^ 0x309B88A2) << 1));
    }

    @NotNull
    @NotNull
    public static final qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 Method3958(@NotNull @NotNull xthiG5kgsZ7gUpqshm3SOX812RpS42oo xthiG5kgsZ7gUpqshm3SOX812RpS42oo2) {
        Intrinsics.checkParameterIsNotNull((Object)xthiG5kgsZ7gUpqshm3SOX812RpS42oo2, (String)"messageProcessor");
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 = new qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6("161.97.78.143", (int)53860791L ^ 0x335BA6C, xthiG5kgsZ7gUpqshm3SOX812RpS42oo2);
        int n = (int)((long)1226059487 ^ (long)1226059487);
        int n2 = (int)1913247891L ^ 0x7209D893;
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS63 = qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62;
        int n3 = (int)446962609L ^ 0x1AA41BB1;
        Thread thread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"Thread.currentThread()");
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS63.Method3380(thread);
        return qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62;
    }

    static {
        Field12113 = new W3C0y9394VvVcZKAtDfQSnqXm5zLQGty();
    }

    private static String Method3959(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1770468207L ^ 0x6987336F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1535230271 ^ (long)-1535230402);
            int n2 = (int)((long)-1093960822 ^ (long)-1093960959);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)996319638 ^ (long)996313645) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

