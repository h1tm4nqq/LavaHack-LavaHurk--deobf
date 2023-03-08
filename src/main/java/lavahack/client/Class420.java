//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n?\u0006\u0002\b\u0005" }, d2 = { "valid", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "obby", "invoke" })
final class Class420 extends Lambda implements Function2
{
    final Class1923 Field9766;
    private int Field9767;
    
    public Object invoke(final Object o, final Object o2) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)o, (boolean)o2);
    }
    
    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final BlockPos blockPos, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        return b ? Class1281.Method5185(this.Field9766.Field16933, blockPos) : Class1281.Method5182(this.Field9766.Field16933, blockPos);
    }
    
    Class420(final Class1923 field9766) {
        this.Field9766 = field9766;
        super(2);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F0 ^ 0x7B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
