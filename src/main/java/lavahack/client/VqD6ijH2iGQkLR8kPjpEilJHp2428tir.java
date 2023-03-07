//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.entity.EntityPlayerSP
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.entity.EntityPlayerSP;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u00a8\u0006\f"}, d2={"makeMotionUpdate", "", "x", "", "y", "z", "yaw", "", "pitch", "ground", "", "spoofRotation", "kisman.cc"})
public final class VqD6ijH2iGQkLR8kPjpEilJHp2428tir {
    private String Field8238 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static final void Method657(double d, double d2, double d3, float f, float f2, boolean bl, boolean bl2) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715(new VxtGBIxlzwZB81UrEE9PRzCsi9pMS1Ao());
        EntityPlayerSP entityPlayerSP = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        entityPlayerSP.isRiding();
    }

    private static String Method658(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1522897918L ^ 0x5AC593FE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-660792664L ^ 0xD89D1A57);
            int n2 = (int)-1084125251L ^ 0xBF618FC6;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)882384258 ^ (long)882385373) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

