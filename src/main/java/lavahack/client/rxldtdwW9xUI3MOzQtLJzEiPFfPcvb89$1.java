//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CjzMEJvuBWIs0JH3fdtolwet3Z498EUb;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"}, d2={"com/kisman/cc/util/enums/BlockESPBlocks$1", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "t", "kisman.cc"})
public final class rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89$1
implements CjzMEJvuBWIs0JH3fdtolwet3Z498EUb {
    private String Field14059 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method5355(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"t");
        IBlockState iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(t)");
        return Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.WEB);
    }

    @Override
    public boolean Method5352(Object object) {
        return this.Method5355((BlockPos)object);
    }

    rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89$1() {
    }

    private static String Method5356(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1293704202 ^ (long)1293704202);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-223287305 ^ (long)-223287544);
            int n2 = (int)((long)-126660062 ^ (long)-126660061) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1294165119L ^ 0xB2DC8D3C) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

