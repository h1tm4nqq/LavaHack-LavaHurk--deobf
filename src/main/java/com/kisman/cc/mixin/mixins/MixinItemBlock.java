//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.spongepowered.asm.mixin.Dynamic
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.mixin.mixins;

import java.util.Iterator;
import lavahack.client.AgUkNNp6h0gOf2NNPecFmCotl8eelugl;
import lavahack.client.vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={ItemBlock.class})
public class MixinItemBlock {
    @Shadow
    @Final
    public Block Field11230;

    @Shadow
    @Shadow
    public boolean Method3149(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, IBlockState iBlockState) {
        return false;
    }

    @Redirect(method={"onItemUse"}, at=@At(value="INVOKE", target="net/minecraft/item/ItemBlock.placeBlockAt(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFLnet/minecraft/block/state/IBlockState;)Z", remap=false))
    @Redirect(method={"onItemUse"}, at=@At(value="INVOKE", target="net/minecraft/item/ItemBlock.placeBlockAt(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFLnet/minecraft/block/state/IBlockState;)Z", remap=false))
    @Dynamic
    @Dynamic
    private boolean Method3150(ItemBlock itemBlock, ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, IBlockState iBlockState) {
        if (world.isRemote && vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH.Field16021.Method35()) {
            if (vmk2KC76Gk3jq4U4tZAKwjULuiPcF7GH.Field16021.Method6669()) return true;
        }
        if (this.Method3149(itemStack, entityPlayer, world, blockPos, enumFacing, f, f2, f3, iBlockState)) return true;
        return false;
    }

    private boolean Method3151(World world, Block block, BlockPos blockPos, boolean bl, EnumFacing enumFacing, Entity entity) {
        AxisAlignedBB axisAlignedBB;
        IBlockState iBlockState = world.getBlockState(blockPos);
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB = bl ? null : block.getDefaultState().getCollisionBoundingBox((IBlockAccess)world, blockPos);
        if (axisAlignedBB != Block.NULL_AABB && axisAlignedBB != null && !this.Method3152(world, axisAlignedBB.offset(blockPos), entity)) {
            return false;
        }
        if (iBlockState.getMaterial() == Material.CIRCUITS && block == Blocks.ANVIL) {
            return true;
        }
        if (!iBlockState.getBlock().isReplaceable((IBlockAccess)world, blockPos)) return false;
        if (!block.canPlaceBlockOnSide(world, blockPos, enumFacing)) return false;
        return true;
    }

    private boolean Method3152(World world, AxisAlignedBB axisAlignedBB, Entity entity) {
        Iterator iterator = world.getEntitiesWithinAABBExcludingEntity(null, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity2 = (Entity)iterator.next();
            if (entity2 == null || entity2.isDead || !entity2.preventEntitySpawning || entity2.equals((Object)entity) || entity2.equals((Object)Minecraft.getMinecraft().player)) continue;
            if (entity == null) return false;
            if (!entity2.isRidingSameEntity(entity)) return false;
        }
        return true;
    }

    @SideOnly(value=Side.CLIENT)
    @Overwrite
    @SideOnly(value=Side.CLIENT)
    @Overwrite
    public boolean Method3153(World world, BlockPos blockPos, EnumFacing enumFacing, EntityPlayer entityPlayer, ItemStack itemStack) {
        boolean bl;
        MixinItemBlock mixinItemBlock;
        Block block = world.getBlockState(blockPos).getBlock();
        if (block == Blocks.SNOW_LAYER && block.isReplaceable((IBlockAccess)world, blockPos)) {
            enumFacing = EnumFacing.UP;
        } else if (!block.isReplaceable((IBlockAccess)world, blockPos)) {
            blockPos = blockPos.offset(enumFacing);
        }
        if (AgUkNNp6h0gOf2NNPecFmCotl8eelugl.Field9377.Method35()) {
            mixinItemBlock = this;
            bl = super.Method3151((World)this, null, blockPos, false, enumFacing, null);
            return bl;
        }
        mixinItemBlock = world;
        bl = this.mayPlace(null, blockPos, false, enumFacing, null);
        return bl;
    }
}

