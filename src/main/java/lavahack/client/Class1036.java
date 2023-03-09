//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockDeadBush
 *  net.minecraft.block.BlockFire
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.BlockSnow
 *  net.minecraft.block.BlockTallGrass
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1010;
import lavahack.client.Class135;
import lavahack.client.Class1568;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Class1036 {
    public static final List Field12556;
    public static final List Field12557;
    private static final Minecraft Field12558;
    public static Vec3d[] Field12559;
    public static Vec3d[] Field12560;
    public static Vec3d[] Field12561;
    public static Vec3d[] Field12562;
    public static Vec3d[] Field12563;
    public static Vec3d[] Field12564;
    private static boolean Field12565;
    private String Field12566 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static IBlockState Method4188(BlockPos blockPos) {
        return Class1036.Field12558.world.getBlockState(blockPos);
    }

    public static boolean Method4189(BlockPos blockPos) {
        IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if (block.getBlockHardness(iBlockState, (World)Class1036.Field12558.world, blockPos) == Float.intBitsToFloat(-1082130432)) return false;
        return true;
    }

    public static int Method4190(BlockPos blockPos, boolean bl) {
        return Class1036.Method4191(blockPos, bl, true);
    }

    public static int Method4191(BlockPos blockPos, boolean bl, boolean bl2) {
        Block block = Class1036.Field12558.world.getBlockState(blockPos).getBlock();
        if (!(block instanceof BlockAir || block instanceof BlockLiquid || block instanceof BlockTallGrass || block instanceof BlockFire || block instanceof BlockDeadBush || block instanceof BlockSnow)) {
            return 0;
        }
        if (!Class1036.Method4198(blockPos, bl, 0.0f)) {
            return -1;
        }
        if (bl2) {
            for (EnumFacing enumFacing : Class1036.Field12558.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos))) {
                if (enumFacing instanceof EntityItem) continue;
                if (!(enumFacing instanceof EntityXPOrb)) return 1;
            }
        }
        Iterator iterator = Class1036.Method4213(blockPos).iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing;
            enumFacing = (EnumFacing)iterator.next();
            if (Class1036.Method4205(blockPos.offset(enumFacing))) return 3;
        }
        return 2;
    }

    public static Vec3d[] Method4192(Vec3d vec3d, Vec3d[] vec3dArray) {
        Vec3d[] vec3dArray2 = new Vec3d[vec3dArray.length];
        int n = 0;
        while (n < vec3dArray.length) {
            vec3dArray2[n] = vec3d.add(vec3dArray[n]);
            ++n;
        }
        return vec3dArray2;
    }

    public static Vec3d[] Method4193(EntityPlayer entityPlayer, Vec3d[] vec3dArray) {
        return Class1036.Method4192(entityPlayer.getPositionVector(), vec3dArray);
    }

    public static List Method4194(Vec3d vec3d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        if (bl5) {
            Collections.addAll(arrayList, Class1036.Method4192(vec3d, Field12559));
        }
        if (bl4) {
            Collections.addAll(arrayList, Class1036.Method4192(vec3d, Field12560));
        }
        if (bl3) {
            Collections.addAll(arrayList, Class1036.Method4192(vec3d, Field12561));
        }
        Collections.addAll(arrayList, Class1036.Method4192(vec3d, Field12562));
        if (bl2) {
            Collections.addAll(arrayList, Class1036.Method4192(vec3d, Field12563));
        } else {
            List list = Class1036.Method4197(vec3d, 2, false);
            if (list.size() == 4) {
                block4: for (Vec3d vec3d2 : list) {
                    BlockPos blockPos = new BlockPos(vec3d).add(vec3d2.x, vec3d2.y, vec3d2.z);
                    switch (Class1036.Method4190(blockPos, bl6)) {
                        case -1: 
                        case 1: 
                        case 2: {
                            continue block4;
                        }
                        case 3: {
                            arrayList.add(vec3d.add(vec3d2));
                            break;
                        }
                    }
                    if (!bl) return arrayList;
                    Collections.addAll(arrayList, Class1036.Method4192(vec3d, Field12564));
                    return arrayList;
                }
            }
        }
        if (!bl) return arrayList;
        Collections.addAll(arrayList, Class1036.Method4192(vec3d, Field12564));
        return arrayList;
    }

    public static List Method4195(int n, boolean bl) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        arrayList.add(new Vec3d(Double.longBitsToDouble(-4616189618054758400L), (double)n, 0.0));
        arrayList.add(new Vec3d(1.0, (double)n, 0.0));
        arrayList.add(new Vec3d(0.0, (double)n, Double.longBitsToDouble((long)1740209116 ^ 0xBFF0000067B97BDCL)));
        arrayList.add(new Vec3d(0.0, (double)n, 1.0));
        if (!bl) return arrayList;
        arrayList.add(new Vec3d(0.0, (double)(n - 1), 0.0));
        return arrayList;
    }

    public static Vec3d[] Method4196(int n, boolean bl) {
        List list = Class1036.Method4195(n, bl);
        Vec3d[] vec3dArray = new Vec3d[list.size()];
        return list.toArray(vec3dArray);
    }

    public static List Method4197(Vec3d vec3d, int n, boolean bl) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        Vec3d[] vec3dArray = Class1036.Method4196(n, bl);
        int n2 = vec3dArray.length;
        int n3 = 0;
        while (n3 < n2) {
            Vec3d vec3d2 = vec3dArray[n3];
            BlockPos blockPos = new BlockPos(vec3d).add(vec3d2.x, vec3d2.y, vec3d2.z);
            Block block = Class1036.Field12558.world.getBlockState(blockPos).getBlock();
            if (block instanceof BlockAir || block instanceof BlockLiquid || block instanceof BlockTallGrass || block instanceof BlockFire || block instanceof BlockDeadBush || block instanceof BlockSnow) {
                arrayList.add(vec3d2);
            }
            ++n3;
        }
        return arrayList;
    }

    public static boolean Method4198(BlockPos blockPos, boolean bl, float f) {
        if (!bl) return true;
        if (Class1036.Field12558.world.rayTraceBlocks(new Vec3d(Class1036.Field12558.player.posX, Class1036.Field12558.player.posY + (double)Class1036.Field12558.player.getEyeHeight(), Class1036.Field12558.player.posZ), new Vec3d((double)blockPos.getX(), (double)((float)blockPos.getY() + f), (double)blockPos.getZ()), false, true, false) == null) return true;
        return false;
    }

    public static boolean Method4199(BlockPos blockPos, boolean bl) {
        return Class1036.Method4198(blockPos, bl, 1.0f);
    }

    public static boolean Method4200(BlockPos blockPos) {
        return Class1036.Method4199(blockPos, true);
    }

    public static void Method4201(BlockPos blockPos, Vec3d vec3d, EnumHand enumHand, EnumFacing enumFacing, boolean bl) {
        if (bl) {
            float f = (float)(vec3d.x - (double)blockPos.getX());
            float f2 = (float)(vec3d.y - (double)blockPos.getY());
            float f3 = (float)(vec3d.z - (double)blockPos.getZ());
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, enumHand, f, f2, f3));
        } else {
            Class1036.Field12558.playerController.processRightClickBlock(Class1036.Field12558.player, Class1036.Field12558.world, blockPos, enumFacing, vec3d, enumHand);
        }
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
    }

    public static double Method4202() {
        double d = Class1036.Field12558.player.posY;
        while (d > 0.0) {
            if (!(Class1036.Field12558.world.getBlockState(new BlockPos(Class1036.Field12558.player.posX, d, Class1036.Field12558.player.posZ)).getBlock() instanceof BlockSlab) && Class1036.Field12558.world.getBlockState(new BlockPos(Class1036.Field12558.player.posX, d, Class1036.Field12558.player.posZ)).getBlock().getDefaultState().getCollisionBoundingBox((IBlockAccess)Class1036.Field12558.world, new BlockPos(0, 0, 0)) != null) {
                return d;
            }
            d -= Double.longBitsToDouble(4562254508917369340L);
        }
        return Double.longBitsToDouble((long)208102579 ^ 0xBFF000000C6764B3L);
    }

    public static Block Method4203(BlockPos blockPos) {
        return Class1036.Method4188(blockPos).getBlock();
    }

    public static Block Method4204(double d, double d2, double d3) {
        return Class1036.Field12558.world.getBlockState(new BlockPos(d, d2, d3)).getBlock();
    }

    public static boolean Method4205(BlockPos blockPos) {
        return Class1036.Method4203(blockPos).canCollideCheck(Class1036.Method4188(blockPos), false);
    }

    public static Vec3d Method4206() {
        return new Vec3d(Class1036.Field12558.player.posX, Class1036.Field12558.player.posY + (double)Class1036.Field12558.player.getEyeHeight(), Class1036.Field12558.player.posZ);
    }

    public static boolean Method4207(BlockPos blockPos, EnumHand enumHand, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = false;
        EnumFacing enumFacing = Class1036.Method4211(blockPos);
        if (enumFacing == null) {
            return bl3;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble((long)412591460 ^ 0x3FE000001897A564L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L))).add(new Vec3d(enumFacing2.getDirectionVec()).scale(Double.longBitsToDouble(4602678819172646912L)));
        Block block = Class1036.Field12558.world.getBlockState(blockPos2).getBlock();
        if (!Class1036.Field12558.player.isSneaking() && (Field12556.contains(block) || Field12557.contains(block))) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            bl4 = true;
        }
        if (bl) {
            Class1568.Method6171(vec3d);
        }
        Class1036.Method4201(blockPos2, vec3d, enumHand, enumFacing2, bl2);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        if (!bl3) return false;
        return true;
    }

    public static void Method4208(BlockPos blockPos, EnumHand enumHand, boolean bl, boolean bl2) {
        EnumFacing enumFacing = Class1036.Method4211(blockPos);
        if (enumFacing == null) {
            return;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L))).add(new Vec3d(enumFacing2.getDirectionVec()).scale(Double.longBitsToDouble((long)531801197 ^ 0x3FE000001FB2A46DL)));
        if (!Class1036.Field12558.player.isSneaking()) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            Class1036.Field12558.player.setSneaking(true);
        }
        if (bl) {
            Vec3d vec3d2 = Class1036.Method4206();
            double d = vec3d.x - vec3d2.x;
            double d2 = vec3d.y - vec3d2.y;
            double d3 = vec3d.z - vec3d2.z;
            double d4 = Math.sqrt(d * d + d3 * d3);
            float f = (float)Math.toDegrees(Math.atan2(d3, d)) - Float.intBitsToFloat(1119092736);
            float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
            float f3 = Class1036.Field12558.player.rotationYaw + MathHelper.wrapDegrees((float)(f - Class1036.Field12558.player.rotationYaw));
            float f4 = Class1036.Field12558.player.rotationPitch + MathHelper.wrapDegrees((float)(f2 - Class1036.Field12558.player.rotationPitch));
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f3, (float)MathHelper.normalizeAngle((int)((int)f4), (int)360), Class1036.Field12558.player.onGround));
        }
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
        Class1036.Method4201(blockPos2, vec3d, enumHand, enumFacing2, bl2);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
    }

    public static void Method4209(BlockPos blockPos, EnumHand enumHand, Class135 class135, boolean bl) {
        EnumFacing enumFacing = Class1036.Method4211(blockPos);
        if (enumFacing == null) {
            return;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1683671664 ^ 0x3FE00000645ACA70L))).add(new Vec3d(enumFacing2.getDirectionVec()).scale(Double.longBitsToDouble(4602678819172646912L)));
        if (!Class1036.Field12558.player.isSneaking()) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            Class1036.Field12558.player.setSneaking(true);
        }
        if (class135 != null) {
            class135.Method929().Method1726(class135.Method932().Method1726(blockPos), false);
        }
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
        Class1036.Method4201(blockPos2, vec3d, enumHand, enumFacing2, bl);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
        if (class135 == null) return;
        class135.Method929().Method1726(class135.Method932().Method1726(blockPos), true);
    }

    public static void Method4210(BlockPos blockPos, EnumHand enumHand, boolean bl, boolean bl2, EnumFacing enumFacing) {
        EnumFacing enumFacing2 = Class1036.Method4211(blockPos);
        if (enumFacing2 == null) {
            return;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing2);
        EnumFacing enumFacing3 = enumFacing2.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1245619221 ^ 0x3FE000004A3EA415L), Double.longBitsToDouble(4602678819172646912L))).add(new Vec3d(enumFacing3.getDirectionVec()).scale(Double.longBitsToDouble(4602678819172646912L)));
        if (!Class1036.Field12558.player.isSneaking()) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            Class1036.Field12558.player.setSneaking(true);
        }
        if (bl) {
            Vec3d vec3d2 = Class1036.Method4206();
            double d = vec3d.x - vec3d2.x;
            double d2 = vec3d.y - vec3d2.y;
            double d3 = vec3d.z - vec3d2.z;
            double d4 = Math.sqrt(d * d + d3 * d3);
            float f = (float)Math.toDegrees(Math.atan2(d3, d)) - Float.intBitsToFloat(1119092736);
            float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
            float f3 = Class1036.Field12558.player.rotationYaw + MathHelper.wrapDegrees((float)(f - Class1036.Field12558.player.rotationYaw));
            float f4 = Class1036.Field12558.player.rotationPitch + MathHelper.wrapDegrees((float)(f2 - Class1036.Field12558.player.rotationPitch));
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f3, (float)MathHelper.normalizeAngle((int)((int)f4), (int)360), Class1036.Field12558.player.onGround));
        }
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
        Class1036.Method4201(blockPos2, vec3d, enumHand, enumFacing, bl2);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
    }

    public static EnumFacing Method4211(BlockPos blockPos) {
        Iterator iterator = Class1036.Method4213(blockPos).iterator();
        if (!iterator.hasNext()) return null;
        return (EnumFacing)iterator.next();
    }

    public static EnumFacing Method4212(BlockPos blockPos) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos.offset(enumFacing));
            boolean bl = iBlockState.getBlock().onBlockActivated((World)Class1036.Field12558.world, blockPos, iBlockState, (EntityPlayer)Class1036.Field12558.player, EnumHand.MAIN_HAND, enumFacing, 0.0f, 0.0f, 0.0f);
            if (bl) {
                Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
                Field12565 = true;
            }
            if (iBlockState.getBlock().canCollideCheck(iBlockState, false) && !iBlockState.getMaterial().isReplaceable()) {
                return enumFacing;
            }
            ++n2;
        }
        return null;
    }

    public static List Method4213(BlockPos blockPos) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        if (Class1036.Field12558.world == null) return arrayList;
        if (blockPos == null) {
            return arrayList;
        }
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos2);
            if (iBlockState != null && iBlockState.getBlock().canCollideCheck(iBlockState, false) && !iBlockState.getMaterial().isReplaceable()) {
                arrayList.add(enumFacing);
            }
            ++n2;
        }
        return arrayList;
    }

    public static void Method4214(BlockPos blockPos, boolean bl, boolean bl2) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            if (Class1036.Method4218(blockPos.offset(enumFacing)) != Class1010.Field12390) {
                for (Entity entity : Class1036.Field12558.world.loadedEntityList) {
                    if (!new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox())) continue;
                    return;
                }
                Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
                if (bl) {
                    Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos.offset(enumFacing), enumFacing.getOpposite(), EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                } else {
                    Class1036.Field12558.playerController.processRightClickBlock(Class1036.Field12558.player, Class1036.Field12558.world, blockPos.offset(enumFacing), enumFacing.getOpposite(), new Vec3d((Vec3i)blockPos), EnumHand.MAIN_HAND);
                }
                Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
                if (!bl2) return;
                Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos.offset(enumFacing), enumFacing.getOpposite()));
                return;
            }
            ++n2;
        }
    }

    public static EnumFacing Method4215(BlockPos blockPos) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            IBlockState iBlockState;
            EnumFacing enumFacing = enumFacingArray[n2];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            if (Class1036.Field12558.world.getBlockState(blockPos2).getBlock().canCollideCheck(Class1036.Field12558.world.getBlockState(blockPos2), false) && !(iBlockState = Class1036.Field12558.world.getBlockState(blockPos2)).getMaterial().isReplaceable()) {
                return enumFacing;
            }
            ++n2;
        }
        return null;
    }

    public static EnumFacing Method4216(BlockPos blockPos, ArrayList arrayList) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            IBlockState iBlockState;
            BlockPos blockPos2;
            EnumFacing enumFacing = enumFacingArray[n2];
            if (!arrayList.contains(enumFacing) && Class1036.Field12558.world.getBlockState(blockPos2 = blockPos.offset(enumFacing)).getBlock().canCollideCheck(Class1036.Field12558.world.getBlockState(blockPos2), false) && !(iBlockState = Class1036.Field12558.world.getBlockState(blockPos2)).getMaterial().isReplaceable()) {
                return enumFacing;
            }
            ++n2;
        }
        return null;
    }

    public static Vec3d Method4217(double d, double d2, double d3) {
        double d4 = Math.floor(d) + Double.longBitsToDouble((long)671430029 ^ 0x3FE000002805358DL);
        double d5 = Math.floor(d2);
        double d6 = Math.floor(d3) + Double.longBitsToDouble((long)492912441 ^ 0x3FE000001D613F39L);
        return new Vec3d(d4, d5, d6);
    }

    public static Class1010 Method4218(BlockPos blockPos) {
        if (Class1036.Field12558.world.isAirBlock(blockPos)) {
            return Class1010.Field12390;
        }
        if (!(Class1036.Field12558.world.getBlockState(blockPos).getBlock().getBlockHardness(Class1036.Field12558.world.getBlockState(blockPos), (World)Class1036.Field12558.world, blockPos) == Float.intBitsToFloat(-1082130432) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST))) {
            return Class1010.Field12391;
        }
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) return Class1010.Field12392;
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL)) return Class1010.Field12392;
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE)) return Class1010.Field12392;
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST)) {
            return Class1010.Field12392;
        }
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK)) return Class1010.Field12393;
        if (!Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.BARRIER)) return null;
        return Class1010.Field12393;
    }

    public static boolean Method4219() {
        BlockPos blockPos = new BlockPos(Class1036.Field12558.player.posX, Class1036.Field12558.player.posY, Class1036.Field12558.player.posZ);
        IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos);
        return Class1036.Method4220(iBlockState, blockPos);
    }

    public static boolean Method4220(IBlockState iBlockState, BlockPos blockPos) {
        if (iBlockState.getBlock() != Blocks.AIR) return false;
        if (!(Class1036.Field12558.player.getDistanceSq(blockPos) >= 1.0)) return false;
        if (Class1036.Field12558.world.getBlockState(blockPos.up()).getBlock() != Blocks.AIR) return false;
        if (Class1036.Field12558.world.getBlockState(blockPos.up(2)).getBlock() != Blocks.AIR) return false;
        if (Class1036.Method4222(blockPos)) return true;
        if (Class1036.Method4221(blockPos)) return true;
        if (Class1036.Method4223(blockPos)) return true;
        if (!Class1036.Method4224(blockPos)) return false;
        return true;
    }

    public static boolean Method4221(BlockPos blockPos) {
        BlockPos[] blockPosArray = Class1036.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = 0;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return false;
            if (iBlockState.getBlock() != Blocks.OBSIDIAN) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public static boolean Method4222(BlockPos blockPos) {
        BlockPos[] blockPosArray = Class1036.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = 0;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return false;
            if (iBlockState.getBlock() != Blocks.BEDROCK) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public static boolean Method4223(BlockPos blockPos) {
        BlockPos[] blockPosArray = Class1036.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = 0;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return false;
            if (iBlockState.getBlock() != Blocks.BEDROCK && iBlockState.getBlock() != Blocks.OBSIDIAN) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public static boolean Method4224(BlockPos blockPos) {
        BlockPos[] blockPosArray = Class1036.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = 0;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = Class1036.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return false;
            if (!iBlockState.isFullBlock()) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public static BlockPos[] Method4225(BlockPos blockPos) {
        return new BlockPos[]{blockPos.north(), blockPos.south(), blockPos.east(), blockPos.west(), blockPos.down()};
    }

    public static boolean Method4226(BlockPos blockPos) {
        for (Entity entity : Class1036.Field12558.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos))) {
            if (entity instanceof EntityItem) continue;
            return false;
        }
        if (Class1036.Method4227(blockPos)) return false;
        if (!Class1036.Method4205(blockPos)) return false;
        return true;
    }

    public static boolean Method4227(BlockPos blockPos) {
        return Class1036.Field12558.world.getBlockState(blockPos).getMaterial().isSolid();
    }

    static {
        Field12558 = Minecraft.getMinecraft();
        Field12559 = new Vec3d[]{new Vec3d(0.0, Double.longBitsToDouble((long)1968513715 ^ 0xC0000000755522B3L), 0.0)};
        Field12560 = new Vec3d[]{new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1037190475 ^ 0xBFF000003DD2454BL)), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble((long)1904417926 ^ 0xBFF0000071831C86L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(1.0, Double.longBitsToDouble((long)1411088854 ^ 0xBFF00000541B81D6L), 0.0)};
        Field12561 = new Vec3d[]{new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(0.0, 0.0, 1.0)};
        Field12562 = new Vec3d[]{new Vec3d(1.0, 1.0, 0.0), new Vec3d(Double.longBitsToDouble((long)22303020 ^ 0xBFF000000154512CL), 1.0, 0.0), new Vec3d(0.0, 1.0, 1.0), new Vec3d(0.0, 1.0, Double.longBitsToDouble((long)30113725 ^ 0xBFF0000001CB7FBDL)), new Vec3d(0.0, Double.longBitsToDouble(0x4000000000000000L), 0.0)};
        Field12563 = new Vec3d[]{new Vec3d(Double.longBitsToDouble((long)1041305132 ^ 0xBFF000003E110E2CL), Double.longBitsToDouble(0x4000000000000000L), 0.0), new Vec3d(1.0, Double.longBitsToDouble((long)834195224 ^ 0x4000000031B8CF18L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(0x4000000000000000L), 1.0), new Vec3d(0.0, Double.longBitsToDouble(0x4000000000000000L), Double.longBitsToDouble((long)720353403 ^ 0xBFF000002AEFB87BL))};
        Field12564 = new Vec3d[]{new Vec3d(0.0, Double.longBitsToDouble((long)703953491 ^ 0x4008000029F57A53L), 0.0)};
        Field12565 = false;
        Field12556 = Arrays.asList(Blocks.ENDER_CHEST, Blocks.CHEST, Blocks.TRAPPED_CHEST, Blocks.CRAFTING_TABLE, Blocks.ANVIL, Blocks.BREWING_STAND, Blocks.HOPPER, Blocks.DROPPER, Blocks.DISPENSER);
        Field12557 = Arrays.asList(Blocks.WHITE_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.SILVER_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.BLACK_SHULKER_BOX);
    }
}

