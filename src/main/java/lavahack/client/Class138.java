//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;
import java.util.*;
import net.minecraft.util.math.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/features/module/combat/cityboss/Cases$SimpleCase1;", "Lcom/kisman/cc/features/module/combat/cityboss/Cases;", "posses", "", "Lnet/minecraft/util/math/BlockPos;", "facing", "Lnet/minecraft/util/EnumFacing;", "kisman.cc" })
final class Class138 extends Class1868
{
    private String Field8526 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public List Method942(@NotNull @NotNull final EnumFacing enumFacing) {
        Intrinsics.checkParameterIsNotNull((Object)enumFacing, "facing");
        final BlockPos[] array = new BlockPos[2];
        final int n = 0;
        final BlockPos offset = BlockPos.ORIGIN.offset(enumFacing);
        Intrinsics.checkExpressionValueIsNotNull((Object)offset, "BlockPos.ORIGIN.offset(facing)");
        array[n] = offset;
        final int n2 = 1;
        final BlockPos up = BlockPos.ORIGIN.offset(enumFacing).up();
        Intrinsics.checkExpressionValueIsNotNull((Object)up, "BlockPos.ORIGIN.offset(facing).up()");
        array[n2] = up;
        return CollectionsKt.listOf((Object[])array);
    }
    
    Class138(final String s, final int n) {
        super(s, n, null);
    }
    
    private static String Method950(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1760 ^ 0x3C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
