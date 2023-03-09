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

import com.kisman.cc.util.Class2142;
import com.mojang.authlib.GameProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1796;
import lavahack.client.Class273;
import lavahack.client.Class62;
import net.minecraft.util.Session;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1570
implements Runnable {
    public static final Class1570 Field15324 = new Class1570();
    private String Field15325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Class62 class62 = Class273.Method1450();
        StringBuilder stringBuilder = new StringBuilder().append("clientstatus ");
        Session session = Class2142.Field17803.session;
        Intrinsics.checkExpressionValueIsNotNull((Object)session, (String)"mc.session");
        GameProfile gameProfile = session.getProfile();
        Intrinsics.checkExpressionValueIsNotNull((Object)gameProfile, (String)"mc.session.profile");
        class62.Method541(stringBuilder.append(gameProfile.getId()).append(" 2").toString());
        Class273.Method1450().Method541("removemanager " + Class1796.Field16231);
    }

    Class1570() {
    }

    private static String Method6195(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 111;
            cArray2[n] = (char)(cArray[n] ^ (0x324 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

