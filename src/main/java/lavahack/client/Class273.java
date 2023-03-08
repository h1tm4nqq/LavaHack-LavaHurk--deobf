//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.*;
import com.mojang.authlib.*;
import com.kisman.cc.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001?\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003?\u0006\f" }, d2 = { "client", "Lcom/kisman/cc/websockets/WebClient;", "getClient", "()Lcom/kisman/cc/websockets/WebClient;", "initClient", "", "reportIssue", "message", "", "setupClient", "messageProcessor", "Lcom/kisman/cc/websockets/IMessageProcessor;", "kisman.cc" })
public final class Class273
{
    @NotNull
    private static final Class62 Field9204;
    private String Field9205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static final Class62 Method1450() {
        return Class273.Field9204;
    }
    
    public static final void Method1451() {
        Class1796.Field16243.info("Connecting to remove server");
        Class273.Field9204.Method541("addmanager " + Class1796.Field16231);
        Runtime.getRuntime().addShutdownHook(new Thread((Runnable)Class1570.Field15324));
        final Class62 field9204 = Class273.Field9204;
        final StringBuilder append = new StringBuilder().append("clientstatus ");
        final Session session = Class2142.Field17803.session;
        Intrinsics.checkExpressionValueIsNotNull((Object)session, "mc.session");
        final GameProfile getProfile = session.getProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)getProfile, "mc.session.profile");
        field9204.Method541(append.append(getProfile.getId()).append(" 1").toString());
    }
    
    public static final void Method1452(@NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)str, "message");
        Class273.Field9204.Method541("sendmessage Received new message: \"" + str + "\", from \"" + AccountData.Field8161.Method2220() + '\"');
    }
    
    @NotNull
    @NotNull
    public static final Class62 Method1453(@NotNull @NotNull final Class649 class649) {
        Intrinsics.checkParameterIsNotNull((Object)class649, "messageProcessor");
        final Class62 class650 = new Class62("161.97.78.143", 25563, class649);
        final Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull((Object)currentThread, "Thread.currentThread()");
        class650.Method599(currentThread);
        return class650;
    }
    
    static {
        Field9204 = Method1453(new Class682());
    }
    
    private static String Method1454(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x31C ^ 0x4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
