//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n?\u0006\u0002\b\u0004" }, d2 = { "shouldMine", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke" })
final class Class1724 extends Lambda implements Function1
{
    final Class654 Field15923;
    private int Field15924;
    
    public Object invoke(final Object o) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)o);
    }
    
    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        return !Class1281.Method5179(this.Field15923.Field10800, blockPos) && !Class1281.Method5182(this.Field15923.Field10800, blockPos);
    }
    
    Class1724(final Class654 field15923) {
        this.Field15923 = field15923;
        super(1);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x65B0 ^ 0xA3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
