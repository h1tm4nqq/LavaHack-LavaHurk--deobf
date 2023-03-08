//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.block.state.*;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.block.material.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.client.*;
import java.util.*;
import lavahack.client.*;
import net.minecraftforge.fml.relauncher.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ ItemBlock.class })
public class MixinItemBlock
{
    @Shadow
    @Final
    public Block Field11230;
    
    @Shadow
    @Shadow
    public boolean Method3149(final ItemStack itemStack, final EntityPlayer entityPlayer, final World world, final BlockPos blockPos, final EnumFacing enumFacing, final float n, final float n2, final float n3, final IBlockState blockState) {
        return false;
    }
    
    @Redirect(method = { "onItemUse" }, at = @At(value = "INVOKE", target = "net/minecraft/item/ItemBlock.placeBlockAt(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFLnet/minecraft/block/state/IBlockState;)Z", remap = false))
    @Redirect(method = { "onItemUse" }, at = @At(value = "INVOKE", target = "net/minecraft/item/ItemBlock.placeBlockAt(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFLnet/minecraft/block/state/IBlockState;)Z", remap = false))
    @Dynamic
    @Dynamic
    private boolean Method3150(final ItemBlock itemBlock, final ItemStack itemStack, final EntityPlayer entityPlayer, final World world, final BlockPos blockPos, final EnumFacing enumFacing, final float n, final float n2, final float n3, final IBlockState blockState) {
        return (world.isRemote && vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH.Field16021.Method35() && vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH.Field16021.Method6669()) || this.Method3149(itemStack, entityPlayer, world, blockPos, enumFacing, n, n2, n3, blockState);
    }
    
    private boolean Method3151(final World world, final Block block, final BlockPos blockPos, final boolean b, final EnumFacing enumFacing, final Entity entity) {
        final IBlockState getBlockState = world.getBlockState(blockPos);
        final AxisAlignedBB axisAlignedBB = b ? null : block.getDefaultState().getCollisionBoundingBox((IBlockAccess)world, blockPos);
        return (axisAlignedBB == Block.NULL_AABB || axisAlignedBB == null || this.Method3152(world, axisAlignedBB.offset(blockPos), entity)) && ((getBlockState.getMaterial() == Material.CIRCUITS && block == Blocks.ANVIL) || (getBlockState.getBlock().isReplaceable((IBlockAccess)world, blockPos) && block.canPlaceBlockOnSide(world, blockPos, enumFacing)));
    }
    
    private boolean Method3152(final World world, final AxisAlignedBB axisAlignedBB, final Entity entity) {
        for (final Entity entity2 : world.getEntitiesWithinAABBExcludingEntity((Entity)null, axisAlignedBB)) {
            if (entity2 != null && !entity2.isDead && entity2.preventEntitySpawning && !entity2.equals((Object)entity) && !entity2.equals((Object)Minecraft.getMinecraft().player) && (entity == null || !entity2.isRidingSameEntity(entity))) {
                return false;
            }
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    @Overwrite
    @SideOnly(Side.CLIENT)
    @Overwrite
    public boolean Method3153(final World world, BlockPos offset, EnumFacing up, final EntityPlayer entityPlayer, final ItemStack itemStack) {
        final Block getBlock = world.getBlockState(offset).getBlock();
        if (getBlock == Blocks.SNOW_LAYER && getBlock.isReplaceable((IBlockAccess)world, offset)) {
            up = EnumFacing.UP;
        }
        else if (!getBlock.isReplaceable((IBlockAccess)world, offset)) {
            offset = offset.offset(up);
        }
        return AgUkNNp6h0gOf2NNPecFmCotl8eelugl.Field9377.Method35() ? ((MixinItemBlock)world).Method3151(this, (Block)null, offset, false, up, (Entity)null) : ((World)this).mayPlace((Block)null, offset, false, up, (Entity)null);
    }
}
