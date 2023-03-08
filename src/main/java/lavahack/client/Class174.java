//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.block.*;
import net.minecraft.block.properties.*;
import com.google.common.collect.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.block.material.*;
import javax.annotation.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;

public class Class174 implements IBlockState
{
    private final Block Field8780;
    private final IBlockState Field8781;
    private String Field8782 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class174(final Block field8780, final IBlockState field8781) {
        this.Field8780 = field8780;
        this.Field8781 = field8781;
    }
    
    public Collection getPropertyKeys() {
        return this.Field8781.getPropertyKeys();
    }
    
    public Comparable getValue(final IProperty property) {
        return this.Field8781.getValue(property);
    }
    
    public IBlockState withProperty(final IProperty property, final Comparable comparable) {
        return this.Field8781.withProperty(property, comparable);
    }
    
    public IBlockState cycleProperty(final IProperty property) {
        return this.Field8781.cycleProperty(property);
    }
    
    public ImmutableMap getProperties() {
        return this.Field8781.getProperties();
    }
    
    public Block getBlock() {
        return this.Field8780;
    }
    
    public boolean onBlockEventReceived(final World world, final BlockPos blockPos, final int n, final int n2) {
        return this.Field8781.onBlockEventReceived(world, blockPos, n, n2);
    }
    
    public void neighborChanged(final World world, final BlockPos blockPos, final Block block, final BlockPos blockPos2) {
        this.Field8781.neighborChanged(world, blockPos, block, blockPos2);
    }
    
    public Material getMaterial() {
        return this.Field8781.getMaterial();
    }
    
    public boolean isFullBlock() {
        return this.Field8781.isFullBlock();
    }
    
    public boolean canEntitySpawn(final Entity entity) {
        return this.Field8781.canEntitySpawn(entity);
    }
    
    @Deprecated
    @Deprecated
    public int getLightOpacity() {
        return this.Field8781.getLightOpacity();
    }
    
    public int getLightOpacity(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getLightOpacity(blockAccess, blockPos);
    }
    
    @Deprecated
    @Deprecated
    public int getLightValue() {
        return this.Field8781.getLightValue();
    }
    
    public int getLightValue(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getLightValue(blockAccess, blockPos);
    }
    
    @SideOnly(Side.CLIENT)
    @SideOnly(Side.CLIENT)
    public boolean isTranslucent() {
        return this.Field8781.isTranslucent();
    }
    
    public boolean useNeighborBrightness() {
        return this.Field8781.useNeighborBrightness();
    }
    
    public MapColor getMapColor(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getMapColor(blockAccess, blockPos);
    }
    
    public IBlockState withRotation(final Rotation rotation) {
        return this.Field8781.withRotation(rotation);
    }
    
    public IBlockState withMirror(final Mirror mirror) {
        return this.Field8781.withMirror(mirror);
    }
    
    public boolean isFullCube() {
        return this.Field8781.isFullCube();
    }
    
    @SideOnly(Side.CLIENT)
    @SideOnly(Side.CLIENT)
    public boolean hasCustomBreakingProgress() {
        return this.Field8781.hasCustomBreakingProgress();
    }
    
    public EnumBlockRenderType getRenderType() {
        return this.Field8781.getRenderType();
    }
    
    @SideOnly(Side.CLIENT)
    @SideOnly(Side.CLIENT)
    public int getPackedLightmapCoords(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getPackedLightmapCoords(blockAccess, blockPos);
    }
    
    @SideOnly(Side.CLIENT)
    @SideOnly(Side.CLIENT)
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
    
    public int getWeakPower(final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.Field8781.getWeakPower(blockAccess, blockPos, enumFacing);
    }
    
    public boolean hasComparatorInputOverride() {
        return this.Field8781.hasComparatorInputOverride();
    }
    
    public int getComparatorInputOverride(final World world, final BlockPos blockPos) {
        return this.Field8781.getComparatorInputOverride(world, blockPos);
    }
    
    public float getBlockHardness(final World world, final BlockPos blockPos) {
        return this.Field8781.getBlockHardness(world, blockPos);
    }
    
    public float getPlayerRelativeBlockHardness(final EntityPlayer entityPlayer, final World world, final BlockPos blockPos) {
        return this.Field8781.getPlayerRelativeBlockHardness(entityPlayer, world, blockPos);
    }
    
    public int getStrongPower(final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.Field8781.getStrongPower(blockAccess, blockPos, enumFacing);
    }
    
    public EnumPushReaction getPushReaction() {
        return this.Field8781.getPushReaction();
    }
    
    public IBlockState getActualState(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getActualState(blockAccess, blockPos);
    }
    
    @SideOnly(Side.CLIENT)
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBox(final World world, final BlockPos blockPos) {
        return this.Field8781.getSelectedBoundingBox(world, blockPos);
    }
    
    @SideOnly(Side.CLIENT)
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.Field8781.shouldSideBeRendered(blockAccess, blockPos, enumFacing);
    }
    
    public boolean isOpaqueCube() {
        return this.Field8781.isOpaqueCube();
    }
    
    @Nullable
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getCollisionBoundingBox(blockAccess, blockPos);
    }
    
    public void addCollisionBoxToList(final World world, final BlockPos blockPos, final AxisAlignedBB axisAlignedBB, final List list, @org.jetbrains.annotations.Nullable @org.jetbrains.annotations.Nullable final Entity entity, final boolean b) {
        this.Field8781.addCollisionBoxToList(world, blockPos, axisAlignedBB, list, entity, b);
    }
    
    public AxisAlignedBB getBoundingBox(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getBoundingBox(blockAccess, blockPos);
    }
    
    public RayTraceResult collisionRayTrace(final World world, final BlockPos blockPos, final Vec3d vec3d, final Vec3d vec3d2) {
        return this.Field8781.collisionRayTrace(world, blockPos, vec3d, vec3d2);
    }
    
    @Deprecated
    @Deprecated
    public boolean isTopSolid() {
        return this.Field8781.isTopSolid();
    }
    
    public boolean doesSideBlockRendering(final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.Field8781.doesSideBlockRendering(blockAccess, blockPos, enumFacing);
    }
    
    public boolean isSideSolid(final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.Field8781.isSideSolid(blockAccess, blockPos, enumFacing);
    }
    
    public boolean doesSideBlockChestOpening(final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.Field8781.doesSideBlockChestOpening(blockAccess, blockPos, enumFacing);
    }
    
    public Vec3d getOffset(final IBlockAccess blockAccess, final BlockPos blockPos) {
        return this.Field8781.getOffset(blockAccess, blockPos);
    }
    
    public boolean causesSuffocation() {
        return this.Field8781.causesSuffocation();
    }
    
    public BlockFaceShape getBlockFaceShape(final IBlockAccess blockAccess, final BlockPos blockPos, final EnumFacing enumFacing) {
        return this.Field8781.getBlockFaceShape(blockAccess, blockPos, enumFacing);
    }
}
