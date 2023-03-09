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
import lavahack.loader.Class122;
import lavahack.loader.Class800;
import lavahack.loader.Class922;
import lavahack.loader.agYEaptPUW8OPC6jB7DK1WZuIoCKRIex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2={"DUMMY_MESSAGE_PROCESSOR", "Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "getDUMMY_MESSAGE_PROCESSOR", "()Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "client", "Lcom/kisman/cc/loader/websockets/WebClient;", "getClient", "()Lcom/kisman/cc/loader/websockets/WebClient;", "setClient", "(Lcom/kisman/cc/loader/websockets/WebClient;)V", "initClient", "", "reportIssue", "message", "", "setupClient", "messageProcessor", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "kisman.cc"})
public final class Class964 {
    @Nullable
    private static Class800 Field12112;
    @NotNull
    private static final Class922 Field12113;
    private String Field12114 = "TheKisDevs & LavaHack Development owns you";

    @Nullable
    @Nullable
    public static final Class800 Method3953() {
        return Field12112;
    }

    public static final void Method3954(@Nullable @Nullable Class800 class800) {
        Field12112 = class800;
    }

    @NotNull
    @NotNull
    public static final Class922 Method3955() {
        return Field12113;
    }

    public static final void Method3956() {
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Connecting to remove server");
        Field12112 = Class964.Method3958((Class122)new agYEaptPUW8OPC6jB7DK1WZuIoCKRIex());
    }

    public static final void Method3957(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        Class800 class800 = Field12112;
        if (class800 == null) return;
        class800.Method3322("sendmessage Received new message: \"" + string + '\"');
    }

    @NotNull
    @NotNull
    public static final Class800 Method3958(@NotNull @NotNull Class122 class122) {
        Intrinsics.checkParameterIsNotNull((Object)class122, (String)"messageProcessor");
        Class800 class800 = new Class800("161.97.78.143", 25563, class122);
        boolean bl = false;
        boolean bl2 = false;
        Class800 class8002 = class800;
        boolean bl3 = false;
        Thread thread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"Thread.currentThread()");
        class8002.Method3380(thread);
        return class800;
    }

    static {
        Field12113 = new Class922();
    }

    private static String Method3959(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 139;
            cArray2[n] = (char)(cArray[n] ^ (0x5776 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

