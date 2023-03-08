//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n?\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Lnet/minecraft/util/math/AxisAlignedBB;", "it", "invoke" })
final class Class308 extends Lambda implements Function1
{
    public static final Class308 Field9315;
    private String Field9316 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Object invoke(final Object o) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((AxisAlignedBB)o);
    }
    
    @NotNull
    @NotNull
    public final AxisAlignedBB leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "it");
        return axisAlignedBB;
    }
    
    Class308() {
        super(1);
    }
    
    static {
        Field9315 = new Class308();
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2B88 ^ 0xE0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
