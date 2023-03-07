//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.material.EnumPushReaction
 *  net.minecraft.block.material.MapColor
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.BlockFaceShape
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.EnumBlockRenderType
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.Mirror
 *  net.minecraft.util.Rotation
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.Nullable;

public class NpLD4Y9BQz09xupQ5Y4k0cWtQD2oQqfE
implements IBlockState {
    private final Block Field8780;
    private final IBlockState Field8781;
    private String Field8782 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public NpLD4Y9BQz09xupQ5Y4k0cWtQD2oQqfE(Block block, IBlockState iBlockState) {
        this.Field8780 = block;
        this.Field8781 = iBlockState;
    }

    public Collection getPropertyKeys() {
        return this.Field8781.getPropertyKeys();
    }

    public Comparable getValue(IProperty iProperty) {
        return this.Field8781.getValue(iProperty);
    }

    public IBlockState withProperty(IProperty iProperty, Comparable comparable) {
        return this.Field8781.withProperty(iProperty, comparable);
    }

    public IBlockState cycleProperty(IProperty iProperty) {
        return this.Field8781.cycleProperty(iProperty);
    }

    public ImmutableMap getProperties() {
        return this.Field8781.getProperties();
    }

    public Block getBlock() {
        return this.Field8780;
    }

    public boolean onBlockEventReceived(World world, BlockPos blockPos, int n, int n2) {
        return this.Field8781.onBlockEventReceived(world, blockPos, n, n2);
    }

    public void neighborChanged(World world, BlockPos blockPos, Block block, BlockPos blockPos2) {
        this.Field8781.neighborChanged(world, blockPos, block, blockPos2);
    }

    public Material getMaterial() {
        return this.Field8781.getMaterial();
    }

    public boolean isFullBlock() {
        return this.Field8781.isFullBlock();
    }

    public boolean canEntitySpawn(Entity entity) {
        return this.Field8781.canEntitySpawn(entity);
    }

    @Deprecated
    @Deprecated
    public int getLightOpacity() {
        return this.Field8781.getLightOpacity();
    }

    public int getLightOpacity(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getLightOpacity(iBlockAccess, blockPos);
    }

    @Deprecated
    @Deprecated
    public int getLightValue() {
        return this.Field8781.getLightValue();
    }

    public int getLightValue(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getLightValue(iBlockAccess, blockPos);
    }

    @SideOnly(value=Side.CLIENT)
    @SideOnly(value=Side.CLIENT)
    public boolean isTranslucent() {
        return this.Field8781.isTranslucent();
    }

    public boolean useNeighborBrightness() {
        return this.Field8781.useNeighborBrightness();
    }

    public MapColor getMapColor(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getMapColor(iBlockAccess, blockPos);
    }

    public IBlockState withRotation(Rotation rotation) {
        return this.Field8781.withRotation(rotation);
    }

    public IBlockState withMirror(Mirror mirror) {
        return this.Field8781.withMirror(mirror);
    }

    public boolean isFullCube() {
        return this.Field8781.isFullCube();
    }

    @SideOnly(value=Side.CLIENT)
    @SideOnly(value=Side.CLIENT)
    public boolean hasCustomBreakingProgress() {
        return this.Field8781.hasCustomBreakingProgress();
    }

    public EnumBlockRenderType getRenderType() {
        return this.Field8781.getRenderType();
    }

    @SideOnly(value=Side.CLIENT)
    @SideOnly(value=Side.CLIENT)
    public int getPackedLightmapCoords(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getPackedLightmapCoords(iBlockAccess, blockPos);
    }

    @SideOnly(value=Side.CLIENT)
    @SideOnly(value=Side.CLIENT)
    public float getAmbientOcclusionLightValue() {
        return this.Field8781.getAmbientOcclusionLightValue();
    }

    public boolean isBlockNormalCube() {
        return this.Field8781.isBlockNormalCube();
    }

    public boolean isNormalCube() {
        return this.Field8781.isNormalCube();
    }

    public boolean canProvidePower() {
        return this.Field8781.canProvidePower();
    }

    public int getWeakPower(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return this.Field8781.getWeakPower(iBlockAccess, blockPos, enumFacing);
    }

    public boolean hasComparatorInputOverride() {
        return this.Field8781.hasComparatorInputOverride();
    }

    public int getComparatorInputOverride(World world, BlockPos blockPos) {
        return this.Field8781.getComparatorInputOverride(world, blockPos);
    }

    public float getBlockHardness(World world, BlockPos blockPos) {
        return this.Field8781.getBlockHardness(world, blockPos);
    }

    public float getPlayerRelativeBlockHardness(EntityPlayer entityPlayer, World world, BlockPos blockPos) {
        return this.Field8781.getPlayerRelativeBlockHardness(entityPlayer, world, blockPos);
    }

    public int getStrongPower(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return this.Field8781.getStrongPower(iBlockAccess, blockPos, enumFacing);
    }

    public EnumPushReaction getPushReaction() {
        return this.Field8781.getPushReaction();
    }

    public IBlockState getActualState(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getActualState(iBlockAccess, blockPos);
    }

    @SideOnly(value=Side.CLIENT)
    @SideOnly(value=Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBox(World world, BlockPos blockPos) {
        return this.Field8781.getSelectedBoundingBox(world, blockPos);
    }

    @SideOnly(value=Side.CLIENT)
    @SideOnly(value=Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return this.Field8781.shouldSideBeRendered(iBlockAccess, blockPos, enumFacing);
    }

    public boolean isOpaqueCube() {
        return this.Field8781.isOpaqueCube();
    }

    @javax.annotation.Nullable
    @javax.annotation.Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getCollisionBoundingBox(iBlockAccess, blockPos);
    }

    public void addCollisionBoxToList(World world, BlockPos blockPos, AxisAlignedBB axisAlignedBB, List list, @Nullable @Nullable Entity entity, boolean bl) {
        this.Field8781.addCollisionBoxToList(world, blockPos, axisAlignedBB, list, entity, bl);
    }

    public AxisAlignedBB getBoundingBox(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getBoundingBox(iBlockAccess, blockPos);
    }

    public RayTraceResult collisionRayTrace(World world, BlockPos blockPos, Vec3d vec3d, Vec3d vec3d2) {
        return this.Field8781.collisionRayTrace(world, blockPos, vec3d, vec3d2);
    }

    @Deprecated
    @Deprecated
    public boolean isTopSolid() {
        return this.Field8781.isTopSolid();
    }

    public boolean doesSideBlockRendering(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return this.Field8781.doesSideBlockRendering(iBlockAccess, blockPos, enumFacing);
    }

    public boolean isSideSolid(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return this.Field8781.isSideSolid(iBlockAccess, blockPos, enumFacing);
    }

    public boolean doesSideBlockChestOpening(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return this.Field8781.doesSideBlockChestOpening(iBlockAccess, blockPos, enumFacing);
    }

    public Vec3d getOffset(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return this.Field8781.getOffset(iBlockAccess, blockPos);
    }

    public boolean causesSuffocation() {
        return this.Field8781.causesSuffocation();
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return this.Field8781.getBlockFaceShape(iBlockAccess, blockPos, enumFacing);
    }
}

