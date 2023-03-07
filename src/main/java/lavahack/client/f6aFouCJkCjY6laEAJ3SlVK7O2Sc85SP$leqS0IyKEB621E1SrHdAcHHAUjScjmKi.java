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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.mojang.authlib.GameProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU;
import lavahack.client.f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.util.Session;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    public static final f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15324 = new f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field15325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        TwXdeBiuuoJXHJVKYgcK26JEmDa5FXuU twXdeBiuuoJXHJVKYgcK26JEmDa5FXuU = f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1450();
        StringBuilder stringBuilder = new StringBuilder().append("clientstatus ");
        Session session = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.session;
        Intrinsics.checkExpressionValueIsNotNull((Object)session, (String)"mc.session");
        GameProfile gameProfile = session.getProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)gameProfile, (String)"mc.session.profile");
        twXdeBiuuoJXHJVKYgcK26JEmDa5FXuU.Method541(stringBuilder.append(gameProfile.getId()).append(" 2").toString());
        f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP.Method1450().Method541("removemanager " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16231);
    }

    f6aFouCJkCjY6laEAJ3SlVK7O2Sc85SP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method6195(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-105118503L ^ 0xF9BC04D9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1635971704L ^ 0x9E7D0D77);
            int n2 = (int)1581353973L ^ 0x5E418B9A;
            cArray2[n] = (char)(cArray[n] ^ (((int)712929436L ^ 0x2A7E7055) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

