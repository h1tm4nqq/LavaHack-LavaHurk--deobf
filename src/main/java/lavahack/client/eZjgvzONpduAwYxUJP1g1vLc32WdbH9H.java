/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;

public class eZjgvzONpduAwYxUJP1g1vLc32WdbH9H
extends Event {
    private final BlockPos Field17315;
    private IBlockState Field17316 = null;
    private int Field17317;

    public eZjgvzONpduAwYxUJP1g1vLc32WdbH9H(BlockPos blockPos) {
        super(new Object[(int)1369402493L ^ 0x519F6C7D]);
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

