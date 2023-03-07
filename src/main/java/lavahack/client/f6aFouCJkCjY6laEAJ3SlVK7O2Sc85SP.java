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
import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.mojang.authlib.GameProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.LjmXEwby3D747HQ8yMDBamZ4Wtw8da73;
import lavahack.client.TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU;
import lavahack.client.f2idkNJUOQ8VA8kbJN00JVorBoX8bKd9;
import lavahack.client.f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.util.Session;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\f"}, d2={"client", "Lcom/kisman/cc/websockets/WebClient;", "getClient", "()Lcom/kisman/cc/websockets/WebClient;", "initClient", "", "reportIssue", "message", "", "setupClient", "messageProcessor", "Lcom/kisman/cc/websockets/IMessageProcessor;", "kisman.cc"})
public final class f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP {
    @NotNull
    private static final TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU Field9204 = f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1453(new f2idkNJUOQ8VA8kbJN00JVorBoX8bKd9());
    private String Field9205 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU Method1450() {
        return Field9204;
    }

    public static final void Method1451() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16243.info("Connecting to remove server");
        Field9204.Method541("addmanager " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16231);
        Runtime.getRuntime().addShutdownHook(new Thread(f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15324));
        StringBuilder stringBuilder = new StringBuilder().append("clientstatus ");
        Session session = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.session;
        Intrinsics.checkExpressionValueIsNotNull((Object)session, (String)"mc.session");
        GameProfile gameProfile = session.getProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)gameProfile, (String)"mc.session.profile");
        Field9204.Method541(stringBuilder.append(gameProfile.getId()).append(" 1").toString());
    }

    public static final void Method1452(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        Field9204.Method541("sendmessage Received new message: \"" + string + "\", from \"" + AccountData.Field8161.Method2220() + ((int)((long)-757358867 ^ (long)-757358852) << 1));
    }

    @NotNull
    @NotNull
    public static final TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU Method1453(@NotNull @NotNull LjmXEwby3D747HQ8yMDBamZ4Wtw8da73 ljmXEwby3D747HQ8yMDBamZ4Wtw8da73) {
        Intrinsics.checkParameterIsNotNull((Object)ljmXEwby3D747HQ8yMDBamZ4Wtw8da73, (String)"messageProcessor");
        TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU twXdeBiuuoJXHJVKYgcK26JEmDa5FXuU = new TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU("161.97.78.143", (int)-1991495348L ^ 0x894C5297, ljmXEwby3D747HQ8yMDBamZ4Wtw8da73);
        int n = (int)((long)0x22DD1DD2 ^ (long)0x22DD1DD2);
        int n2 = (int)((long)-2094715169 ^ (long)-2094715169);
        TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU twXdeBiuuoJXHJVKYgcK26JEmDa5FXuU2 = twXdeBiuuoJXHJVKYgcK26JEmDa5FXuU;
        int n3 = (int)-356613330L ^ 0xEABE832E;
        Thread thread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"Thread.currentThread()");
        twXdeBiuuoJXHJVKYgcK26JEmDa5FXuU2.Method599(thread);
        return twXdeBiuuoJXHJVKYgcK26JEmDa5FXuU;
    }

    private static String Method1454(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1316759938 ^ (long)1316759938);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1027571790L ^ 0x3D3F80B1);
            int n2 = (int)((long)1939392269 ^ (long)1939392268) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2011815077 ^ (long)-2011815012) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

