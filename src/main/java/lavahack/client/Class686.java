/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.List;
import javax.annotation.Nonnull;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

public interface Class686 {
    public IBlockState Method2880(BlockPos var1);

    public boolean Method2881(BlockPos var1, IBlockState var2);

    public TileEntity Method2882(BlockPos var1);

    public List Method2883();

    public void Method2884(BlockPos var1, TileEntity var2);

    public void Method2885(BlockPos var1);

    public List Method2886();

    public void Method2887(Entity var1);

    public void Method2888(Entity var1);

    public ItemStack Method2889();

    public void Method2890(ItemStack var1);

    public int Method2891();

    public int Method2892();

    public int Method2893();

    @Nonnull
    @Nonnull
    public String Method2894();

    public void Method2895(@Nonnull @Nonnull String var1);
}

