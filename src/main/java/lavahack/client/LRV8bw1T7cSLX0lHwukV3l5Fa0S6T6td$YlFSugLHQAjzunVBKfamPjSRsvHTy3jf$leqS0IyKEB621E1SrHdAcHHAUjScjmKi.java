//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HxNufwqIKdASUlhzDMzyCRUIub26n5S3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.JeYx12lqUujCMKn4MrLDhXikgfUCcw2h;
import lavahack.client.ZL1odW2XJDzzCmKJR66p1Ynf5DXx2MCL;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "Lcom/kisman/cc/util/math/vectors/xyz/Vec3dColored;", "vec1", "kotlin.jvm.PlatformType", "vec2", "transform"})
final class LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements HxNufwqIKdASUlhzDMzyCRUIub26n5S3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    final double Field11567;
    private String Field11568 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public final JeYx12lqUujCMKn4MrLDhXikgfUCcw2h Method2282(JeYx12lqUujCMKn4MrLDhXikgfUCcw2h jeYx12lqUujCMKn4MrLDhXikgfUCcw2h, JeYx12lqUujCMKn4MrLDhXikgfUCcw2h jeYx12lqUujCMKn4MrLDhXikgfUCcw2h2) {
        Vec3d vec3d = jeYx12lqUujCMKn4MrLDhXikgfUCcw2h.Method3427().add(ZL1odW2XJDzzCmKJR66p1Ynf5DXx2MCL.Method1152(jeYx12lqUujCMKn4MrLDhXikgfUCcw2h2.Method3427(), jeYx12lqUujCMKn4MrLDhXikgfUCcw2h.Method3427())).scale(this.Field11567);
        Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"vec1.vec.add(\n          \u2026      ).scale(multiplier)");
        return new JeYx12lqUujCMKn4MrLDhXikgfUCcw2h(vec3d, jeYx12lqUujCMKn4MrLDhXikgfUCcw2h2.Method3429());
    }

    LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(double d) {
        this.Field11567 = d;
    }

    private static String Method3565(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1109250643L ^ 0x421DD253;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1879942407 ^ (long)1879942648);
            int n2 = ((int)471819090L ^ 0x1C1F6343) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-504928495L ^ 0xE1E77630 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

