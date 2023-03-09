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
import lavahack.client.Class192;
import lavahack.client.Class495;
import lavahack.client.Class814;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "Lcom/kisman/cc/util/math/vectors/xyz/Vec3dColored;", "vec1", "kotlin.jvm.PlatformType", "vec2", "transform"})
final class Class840
implements Class495 {
    final double Field11567;
    private String Field11568 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public final Class814 Method2282(Class814 class814, Class814 class8142) {
        Vec3d vec3d = class814.Method3427().add(Class192.Method1152(class8142.Method3427(), class814.Method3427())).scale(this.Field11567);
        Intrinsics.checkExpressionValueIsNotNull((Object)vec3d, (String)"vec1.vec.add(\n          \u2026      ).scale(multiplier)");
        return new Class814(vec3d, class8142.Method3429());
    }

    Class840(double d) {
        this.Field11567 = d;
    }

    private static String Method3565(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 34;
            cArray2[n] = (char)(cArray[n] ^ (0x1121 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

