//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n?\u0006\u0002\b\u0006" }, d2 = { "valid", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "invoke" })
final class Class1513 extends Lambda implements Function2
{
    final Class1281 Field15080;
    private int Field15081;
    
    public Object invoke(final Object o, final Object o2) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)o, (EnumFacing)o2);
    }
    
    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        final Class1281 field15080 = this.Field15080;
        final BlockPos up = blockPos.up();
        Intrinsics.checkExpressionValueIsNotNull((Object)up, "pos.up()");
        if (Class1281.Method5179(field15080, up)) {
            final Class1281 field15081 = this.Field15080;
            final BlockPos up2 = blockPos.offset(enumFacing).up();
            Intrinsics.checkExpressionValueIsNotNull((Object)up2, "pos.offset(facing).up()");
            if (Class1281.Method5179(field15081, up2)) {
                final Class1281 field15082 = this.Field15080;
                final BlockPos offset = blockPos.offset(enumFacing);
                Intrinsics.checkExpressionValueIsNotNull((Object)offset, "pos.offset(facing)");
                if (Class1281.Method5179(field15082, offset)) {
                    final Class1281 field15083 = this.Field15080;
                    final BlockPos up3 = blockPos.offset(enumFacing).up();
                    Intrinsics.checkExpressionValueIsNotNull((Object)up3, "pos.offset(facing).up()");
                    if (Class1281.Method5179(field15083, up3)) {
                        return true;
                    }
                }
                final Class1281 field15084 = this.Field15080;
                final BlockPos offset2 = blockPos.offset(enumFacing);
                Intrinsics.checkExpressionValueIsNotNull((Object)offset2, "pos.offset(facing)");
                if (Class1281.Method5179(field15084, offset2)) {
                    return false;
                }
                final Class1281 field15085 = this.Field15080;
                final BlockPos up = blockPos.offset(enumFacing).up(2);
                Intrinsics.checkExpressionValueIsNotNull((Object)up, "pos.offset(facing).up(2)");
                if (!Class1281.Method5179(field15085, up)) {
                    return false;
                }
                final Class1281 field15086 = this.Field15080;
                final BlockPos up2 = blockPos.up(2);
                Intrinsics.checkExpressionValueIsNotNull((Object)up2, "pos.up(2)");
                if (!Class1281.Method5179(field15086, up2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    Class1513(final Class1281 field15080) {
        this.Field15080 = field15080;
        super(2);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x657F ^ 0x99));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
