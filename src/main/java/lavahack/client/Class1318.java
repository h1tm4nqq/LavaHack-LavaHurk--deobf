//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.math.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016?\u0006\u0006" }, d2 = { "com/kisman/cc/util/enums/BlockESPBlocks$2", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "t", "kisman.cc" })
public final class Class1318 implements Class1776
{
    private String Field14058 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method5353(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "t");
        final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(t)");
        return Intrinsics.areEqual((Object)getBlockState.getBlock(), (Object)Blocks.PORTAL);
    }
    
    @Override
    public boolean Method5352(final Object o) {
        return this.Method5353((BlockPos)o);
    }
    
    Class1318() {
    }
    
    private static String Method5354(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2A12 ^ 0x50));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
