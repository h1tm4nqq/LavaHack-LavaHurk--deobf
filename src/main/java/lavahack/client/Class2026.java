/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;

public class Class2026
extends Class2157 {
    private final BlockPos Field17315;
    private IBlockState Field17316 = null;
    private int Field17317;

    public Class2026(BlockPos blockPos) {
        super(new Object[0]);
        this.Field17315 = blockPos;
    }

    public BlockPos Method7493() {
        return this.Field17315;
    }

    public IBlockState Method7494() {
        return this.Field17316;
    }

    public void Method7495(IBlockState iBlockState) {
        this.Field17316 = iBlockState;
    }
}

