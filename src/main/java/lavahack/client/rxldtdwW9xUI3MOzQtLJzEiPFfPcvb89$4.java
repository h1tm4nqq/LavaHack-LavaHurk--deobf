//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CjzMEJvuBWIs0JH3fdtolwet3Z498EUb;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"}, d2={"com/kisman/cc/util/enums/BlockESPBlocks$4", "Lcom/kisman/cc/util/interfaces/Validable;", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "t", "kisman.cc"})
public final class rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89$4
implements CjzMEJvuBWIs0JH3fdtolwet3Z498EUb {
    private String Field14060 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method5357(@NotNull @NotNull BlockPos blockPos) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"t");
        IBlockState iBlockState = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)iBlockState, (String)"mc.world.getBlockState(t)");
        if ((Intrinsics.areEqual((Object)iBlockState.getBlock(), (Object)Blocks.AIR) ^ (int)((long)-848959645 ^ (long)-848959646)) == 0) return ((int)1056895724L ^ 0x3EFEF2EC) != 0;
        List list = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getEntitiesWithinAABB(EntityPlayer.class, Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world.getBlockState(blockPos).getSelectedBoundingBox((World)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.world, blockPos));
        Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.getEntitiesWith\u2026BoundingBox(mc.world, t))");
        Collection collection = list;
        int n2 = (int)((long)-832625407 ^ (long)-832625407);
        if (!collection.isEmpty()) {
            n = (int)((long)1881945475 ^ (long)1881945474);
            return ((int)1056895724L ^ 0x3EFEF2EC) != 0;
        }
        n = (int)((long)-490406506 ^ (long)-490406506);
        return ((int)1056895724L ^ 0x3EFEF2EC) != 0;
    }

    @Override
    public boolean Method5352(Object object) {
        return this.Method5357((BlockPos)object);
    }

    rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89$4() {
    }

    private static String Method5358(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)754950935L ^ 0x2CFFA317;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1049249295L ^ 0xC175B90E);
            int n2 = ((int)1213287122L ^ 0x48514AD7) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-759987737L ^ 0xD2B382B4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

