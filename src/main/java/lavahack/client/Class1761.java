//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.block.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import kotlin.collections.*;
import net.minecraft.block.state.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005?\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004?\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b?\u0006\r" }, d2 = { "Lcom/kisman/cc/util/enums/XRayBlocks$Validator;", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/util/math/BlockPos;", "blocks", "", "Lnet/minecraft/block/Block;", "([Lnet/minecraft/block/Block;)V", "getBlocks", "()[Lnet/minecraft/block/Block;", "[Lnet/minecraft/block/Block;", "valid", "", "t", "kisman.cc" })
public final class Class1761 implements Class1776
{
    @NotNull
    private final Block[] Field16057;
    private String Field16058 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method6698(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "t");
        final Block[] field16057 = this.Field16057;
        final IBlockState getBlockState = Class2142.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getBlockState, "mc.world.getBlockState(t)");
        return ArraysKt.contains((Object[])field16057, (Object)getBlockState.getBlock());
    }
    
    @Override
    public boolean Method5352(final Object o) {
        return this.Method6698((BlockPos)o);
    }
    
    @NotNull
    @NotNull
    public final Block[] Method6699() {
        return this.Field16057;
    }
    
    public Class1761(@NotNull @NotNull final Block... field16057) {
        Intrinsics.checkParameterIsNotNull((Object)field16057, "blocks");
        this.Field16057 = field16057;
    }
    
    private static String Method6700(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x11B7 ^ 0xAB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
