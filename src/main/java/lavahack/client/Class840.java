//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "Lcom/kisman/cc/util/math/vectors/xyz/Vec3dColored;", "vec1", "kotlin.jvm.PlatformType", "vec2", "transform" })
final class Class840 implements Class495
{
    final double Field11567;
    private String Field11568 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class814 Method2282(final Class814 class814, final Class814 class815) {
        final Vec3d scale = class814.Method3427().add(Class192.Method1152(class815.Method3427(), class814.Method3427())).scale(this.Field11567);
        Intrinsics.checkExpressionValueIsNotNull((Object)scale, "vec1.vec.add(\n          \u2026      ).scale(multiplier)");
        return new Class814(scale, class815.Method3429());
    }
    
    Class840(final double field11567) {
        this.Field11567 = field11567;
    }
    
    private static String Method3565(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1121 ^ 0x22));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
