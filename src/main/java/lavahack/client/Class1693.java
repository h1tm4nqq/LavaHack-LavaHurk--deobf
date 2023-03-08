//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;
import kotlin.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 2, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0004" }, d2 = { "d2i", "Lnet/minecraft/util/math/Vec3i;", "vec", "Lnet/minecraft/util/math/Vec3d;", "kisman.cc" })
public final class Class1693
{
    private String Field15852 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static final Vec3i Method6497(@NotNull @NotNull final Vec3d vec3d) {
        Intrinsics.checkParameterIsNotNull((Object)vec3d, "vec");
        return new Vec3i(MathKt.roundToInt(vec3d.x), MathKt.roundToInt(vec3d.y), MathKt.roundToInt(vec3d.z));
    }
    
    private static String Method6498(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x36C0 ^ 0x25));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
