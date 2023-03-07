//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.ArraysKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CjzMEJvuBWIs0JH3fdtolwet3Z498EUb;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u001b\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/util/enums/XRayBlocks$Validator;", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/util/math/BlockPos;", "blocks", "", "Lnet/minecraft/block/Block;", "([Lnet/minecraft/block/Block;)V", "getBlocks", "()[Lnet/minecraft/block/Block;", "[Lnet/minecraft/block/Block;", "valid", "", "t", "kisman.cc"})
public final class CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements CjzMEJvuBWIs0JH3fdtolwet3Z498EUb {
    @NotNull
    private final Block[] Field16057;
    private String Field16058 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method6698(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"t");
        IBlockState iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(t)");
        return ArraysKt.contains((Object[])this.Field16057, (Object)iBlockState.getBlock());
    }

    @Override
    public boolean Method5352(Object object) {
        return this.Method6698((BlockPos)object);
    }

    @NotNull
    @NotNull
    public final Block[] Method6699() {
        return this.Field16057;
    }

    public CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Block ... blockArray) {
        Intrinsics.checkParameterIsNotNull((Object)blockArray, (String)"blocks");
        this.Field16057 = blockArray;
    }

    private static String Method6700(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1491782975L ^ 0x58EACD3F;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1071132140 ^ (long)-1071131925);
            int n2 = (int)((long)2096521770 ^ (long)2096521857);
            cArray2[n] = (char)(cArray[n] ^ ((int)919698283L ^ 0x36D16ADC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

