//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.Session
 */
package lavahack.client;

import com.kisman.cc.util.AccountData;
import com.kisman.cc.util.Class2142;
import com.mojang.authlib.GameProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1570;
import lavahack.client.Class1796;
import lavahack.client.Class62;
import lavahack.client.Class649;
import lavahack.client.Class682;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\f"}, d2={"client", "Lcom/kisman/cc/websockets/WebClient;", "getClient", "()Lcom/kisman/cc/websockets/WebClient;", "initClient", "", "reportIssue", "message", "", "setupClient", "messageProcessor", "Lcom/kisman/cc/websockets/IMessageProcessor;", "kisman.cc"})
public final class Class273 {
    @NotNull
    private static final Class62 Field9204 = Class273.Method1453(new Class682());
    private String Field9205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final Class62 Method1450() {
        return Field9204;
    }

    public static final void Method1451() {
        Class1796.Field16243.info("Connecting to remove server");
        Field9204.Method541("addmanager " + Class1796.Field16231);
        Runtime.getRuntime().addShutdownHook(new Thread(Class1570.Field15324));
        StringBuilder stringBuilder = new StringBuilder().append("clientstatus ");
        Session session = Class2142.Field17803.session;
        Intrinsics.checkExpressionValueIsNotNull((Object)session, (String)"mc.session");
        GameProfile gameProfile = session.getProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)gameProfile, (String)"mc.session.profile");
        Field9204.Method541(stringBuilder.append(gameProfile.getId()).append(" 1").toString());
    }

    public static final void Method1452(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        Field9204.Method541("sendmessage Received new message: \"" + string + "\", from \"" + AccountData.Field8161.Method2220() + '\"');
    }

    @NotNull
    @NotNull
    public static final Class62 Method1453(@NotNull @NotNull Class649 class649) {
        Intrinsics.checkParameterIsNotNull((Object)class649, (String)"messageProcessor");
        Class62 class62 = new Class62("161.97.78.143", 25563, class649);
        boolean bl = false;
        boolean bl2 = false;
        Class62 class622 = class62;
        boolean bl3 = false;
        Thread thread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"Thread.currentThread()");
        class622.Method599(thread);
        return class62;
    }

    private static String Method1454(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 4;
            cArray2[n] = (char)(cArray[n] ^ (0x31C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

