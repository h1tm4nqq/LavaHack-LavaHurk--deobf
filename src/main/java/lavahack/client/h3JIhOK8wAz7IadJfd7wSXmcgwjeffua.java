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
import lavahack.client.AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y;
import lavahack.client.a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
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

public class h3JIhOK8wAz7IadJfd7wSXmcgwjeffua {
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
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos);
    }

    public static boolean Method4189(BlockPos blockPos) {
        int n;
        IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        if (block.getBlockHardness(iBlockState, (World)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world, blockPos) != Float.intBitsToFloat((int)((long)147103079 ^ (long)-1220240025))) {
            n = (int)((long)-1924979038 ^ (long)-1924979037);
            return n != 0;
        }
        n = (int)((long)1151245268 ^ (long)1151245268);
        return n != 0;
    }

    public static int Method4190(BlockPos blockPos, boolean bl) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4191(blockPos, bl, (boolean)((long)-497660970 ^ (long)-497660969));
    }

    public static int Method4191(BlockPos blockPos, boolean bl, boolean bl2) {
        Block block = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock();
        if (!(block instanceof BlockAir || block instanceof BlockLiquid || block instanceof BlockTallGrass || block instanceof BlockFire || block instanceof BlockDeadBush || block instanceof BlockSnow)) {
            return (int)-1699121977L ^ 0x9AB974C7;
        }
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4198(blockPos, bl, 0.0f)) {
            return (int)1465617133L ^ 0xA8A47512;
        }
        if (bl2) {
            for (EnumFacing enumFacing : h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos))) {
                if (enumFacing instanceof EntityItem) continue;
                if (!(enumFacing instanceof EntityXPOrb)) return (int)((long)-248796519 ^ (long)-248796520);
            }
        }
        Iterator iterator = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing;
            enumFacing = (EnumFacing)iterator.next();
            if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4205(blockPos.offset(enumFacing))) return (int)((long)324201209 ^ (long)324201210);
        }
        return (int)((long)-1043351343 ^ (long)-1043351344) << 1;
    }

    public static Vec3d[] Method4192(Vec3d vec3d, Vec3d[] vec3dArray) {
        Vec3d[] vec3dArray2 = new Vec3d[vec3dArray.length];
        int n = (int)((long)1227264231 ^ (long)1227264231);
        while (n < vec3dArray.length) {
            vec3dArray2[n] = vec3d.add(vec3dArray[n]);
            ++n;
        }
        return vec3dArray2;
    }

    public static Vec3d[] Method4193(EntityPlayer entityPlayer, Vec3d[] vec3dArray) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(entityPlayer.getPositionVector(), vec3dArray);
    }

    public static List Method4194(Vec3d vec3d, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        if (bl5) {
            Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(vec3d, Field12559));
        }
        if (bl4) {
            Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(vec3d, Field12560));
        }
        if (bl3) {
            Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(vec3d, Field12561));
        }
        Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(vec3d, Field12562));
        if (bl2) {
            Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(vec3d, Field12563));
        } else {
            List list = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4197(vec3d, (int)((long)-1229363182 ^ (long)-1229363181) << 1, ((int)727519202L ^ 0x2B5D0FE2) != 0);
            if (list.size() == ((int)-1682586896L ^ 0x9BB5C2F1) << 2) {
                block4: for (Vec3d vec3d2 : list) {
                    BlockPos blockPos = new BlockPos(vec3d).add(vec3d2.x, vec3d2.y, vec3d2.z);
                    switch (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4190(blockPos, bl6)) {
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
                    Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(vec3d, Field12564));
                    return arrayList;
                }
            }
        }
        if (!bl) return arrayList;
        Collections.addAll(arrayList, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4192(vec3d, Field12564));
        return arrayList;
    }

    public static List Method4195(int n, boolean bl) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        arrayList.add(new Vec3d(Double.longBitsToDouble(0x353ACEBAB5363019L ^ 0x8ACACEBAB5363019L), (double)n, 0.0));
        arrayList.add(new Vec3d(1.0, (double)n, 0.0));
        arrayList.add(new Vec3d(0.0, (double)n, Double.longBitsToDouble((long)1740209116 ^ 0xBFF0000067B97BDCL)));
        arrayList.add(new Vec3d(0.0, (double)n, 1.0));
        if (!bl) return arrayList;
        arrayList.add(new Vec3d(0.0, (double)(n - ((int)-1487561036L ^ 0xA7559EB5)), 0.0));
        return arrayList;
    }

    public static Vec3d[] Method4196(int n, boolean bl) {
        List list = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4195(n, bl);
        Vec3d[] vec3dArray = new Vec3d[list.size()];
        return list.toArray(vec3dArray);
    }

    public static List Method4197(Vec3d vec3d, int n, boolean bl) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        Vec3d[] vec3dArray = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4196(n, bl);
        int n2 = vec3dArray.length;
        int n3 = (int)238828772L ^ 0xE3C3CE4;
        while (n3 < n2) {
            Vec3d vec3d2 = vec3dArray[n3];
            BlockPos blockPos = new BlockPos(vec3d).add(vec3d2.x, vec3d2.y, vec3d2.z);
            Block block = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock();
            if (block instanceof BlockAir || block instanceof BlockLiquid || block instanceof BlockTallGrass || block instanceof BlockFire || block instanceof BlockDeadBush || block instanceof BlockSnow) {
                arrayList.add(vec3d2);
            }
            ++n3;
        }
        return arrayList;
    }

    public static boolean Method4198(BlockPos blockPos, boolean bl, float f) {
        int n;
        if (bl && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.rayTraceBlocks(new Vec3d(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posX, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posY + (double)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.getEyeHeight(), h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posZ), new Vec3d((double)blockPos.getX(), (double)((float)blockPos.getY() + f), (double)blockPos.getZ()), ((int)-789013833L ^ 0xD0F89AB7) != 0, ((int)1635135104L ^ 0x61762E81) != 0, ((int)43844285L ^ 0x29D02BD) != 0) != null) {
            n = (int)((long)1325089261 ^ (long)1325089261);
            return n != 0;
        }
        n = (int)((long)-1089291773 ^ (long)-1089291774);
        return n != 0;
    }

    public static boolean Method4199(BlockPos blockPos, boolean bl) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4198(blockPos, bl, 1.0f);
    }

    public static boolean Method4200(BlockPos blockPos) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4199(blockPos, ((int)1299184705L ^ 0x4D6FFC40) != 0);
    }

    public static void Method4201(BlockPos blockPos, Vec3d vec3d, EnumHand enumHand, EnumFacing enumFacing, boolean bl) {
        if (bl) {
            float f = (float)(vec3d.x - (double)blockPos.getX());
            float f2 = (float)(vec3d.y - (double)blockPos.getY());
            float f3 = (float)(vec3d.z - (double)blockPos.getZ());
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, enumHand, f, f2, f3));
        } else {
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.playerController.processRightClickBlock(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world, blockPos, enumFacing, vec3d, enumHand);
        }
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.rightClickDelayTimer = (int)((long)-1386500828 ^ (long)-1386500827) << 2;
    }

    public static double Method4202() {
        double d = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posY;
        while (d > 0.0) {
            if (!(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(new BlockPos(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posX, d, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posZ)).getBlock() instanceof BlockSlab) && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(new BlockPos(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posX, d, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posZ)).getBlock().getDefaultState().getCollisionBoundingBox((IBlockAccess)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world, new BlockPos((int)((long)-2130171166 ^ (long)-2130171166), (int)1940893783L ^ 0x73AFB057, (int)-1900668924L ^ 0x8EB61804)) != null) {
                return d;
            }
            d -= Double.longBitsToDouble(0xFC4CD1CAD7DB68AL ^ 0x3094AF517F8C1F76L);
        }
        return Double.longBitsToDouble((long)208102579 ^ 0xBFF000000C6764B3L);
    }

    public static Block Method4203(BlockPos blockPos) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4188(blockPos).getBlock();
    }

    public static Block Method4204(double d, double d2, double d3) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(new BlockPos(d, d2, d3)).getBlock();
    }

    public static boolean Method4205(BlockPos blockPos) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4203(blockPos).canCollideCheck(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4188(blockPos), (boolean)((long)-365994284 ^ (long)-365994284));
    }

    public static Vec3d Method4206() {
        return new Vec3d(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posX, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posY + (double)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.getEyeHeight(), h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posZ);
    }

    public static boolean Method4207(BlockPos blockPos, EnumHand enumHand, boolean bl, boolean bl2, boolean bl3) {
        int n;
        int n2 = (int)((long)-779249769 ^ (long)-779249769);
        EnumFacing enumFacing = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4211(blockPos);
        if (enumFacing == null) {
            return bl3;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble((long)412591460 ^ 0x3FE000001897A564L), Double.longBitsToDouble(0x6B82D8D09D1B844CL ^ 0x5462D8D09D1B844CL), Double.longBitsToDouble(0x6757213F1E87235FL ^ 0x58B7213F1E87235FL))).add(new Vec3d(enumFacing2.getDirectionVec()).scale(Double.longBitsToDouble(0xECF7D18A0EEE9114L ^ 0xD317D18A0EEE9114L)));
        Block block = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2).getBlock();
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.isSneaking() && (Field12556.contains(block) || Field12557.contains(block))) {
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            n2 = (int)-183372460L ^ 0xF511F555;
        }
        if (bl) {
            AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6171(vec3d);
        }
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4201(blockPos2, vec3d, enumHand, enumFacing2, bl2);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.rightClickDelayTimer = (int)((long)-220550089 ^ (long)-220550090) << 2;
        if (bl3) {
            n = (int)1722097838L ^ 0x66A520AF;
            return n != 0;
        }
        n = (int)((long)-2127111425 ^ (long)-2127111425);
        return n != 0;
    }

    public static void Method4208(BlockPos blockPos, EnumHand enumHand, boolean bl, boolean bl2) {
        EnumFacing enumFacing = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4211(blockPos);
        if (enumFacing == null) {
            return;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble(0xE6110D3D7A8C220BL ^ 0xD9F10D3D7A8C220BL), Double.longBitsToDouble(0x5C9A1CDD841C2AB6L ^ 0x637A1CDD841C2AB6L), Double.longBitsToDouble(0xEE72D4C5CEE74EC2L ^ 0xD192D4C5CEE74EC2L))).add(new Vec3d(enumFacing2.getDirectionVec()).scale(Double.longBitsToDouble((long)531801197 ^ 0x3FE000001FB2A46DL)));
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.isSneaking()) {
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.setSneaking((boolean)((long)683126990 ^ (long)683126991));
        }
        if (bl) {
            Vec3d vec3d2 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4206();
            double d = vec3d.x - vec3d2.x;
            double d2 = vec3d.y - vec3d2.y;
            double d3 = vec3d.z - vec3d2.z;
            double d4 = Math.sqrt(d * d + d3 * d3);
            float f = (float)Math.toDegrees(Math.atan2(d3, d)) - Float.intBitsToFloat((int)((long)1112095536 ^ (long)16595760));
            float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
            float f3 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationYaw + MathHelper.wrapDegrees((float)(f - h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationYaw));
            float f4 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationPitch + MathHelper.wrapDegrees((float)(f2 - h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationPitch));
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f3, (float)MathHelper.normalizeAngle((int)((int)f4), (int)(((int)1695977213L ^ 0x65168ED0) << 3)), h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.onGround));
        }
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4201(blockPos2, vec3d, enumHand, enumFacing2, bl2);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.rightClickDelayTimer = ((int)-1819217237L ^ 0x9390F2AA) << 2;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
    }

    public static void Method4209(BlockPos blockPos, EnumHand enumHand, a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, boolean bl) {
        EnumFacing enumFacing = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4211(blockPos);
        if (enumFacing == null) {
            return;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        EnumFacing enumFacing2 = enumFacing.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble(0x238FC43EA4869F9FL ^ 0x1C6FC43EA4869F9FL), Double.longBitsToDouble(0x2CAEC90CAF3E1609L ^ 0x134EC90CAF3E1609L), Double.longBitsToDouble((long)1683671664 ^ 0x3FE00000645ACA70L))).add(new Vec3d(enumFacing2.getDirectionVec()).scale(Double.longBitsToDouble(0xA092685F705061F5L ^ 0x9F72685F705061F5L)));
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.isSneaking()) {
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.setSneaking((boolean)((long)554371526 ^ (long)554371527));
        }
        if (a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf != null) {
            Object[] objectArray = new Object[((int)967472439L ^ 0x39AA7536) << 1];
            Object[] objectArray2 = new Object[(int)((long)1518576681 ^ (long)1518576680)];
            objectArray2[(int)-566903098L ^ 0xDE35BEC6] = blockPos;
            objectArray[(int)293847088L ^ 0x1183C030] = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method932().Method1726(objectArray2);
            objectArray[(int)-878580667L ^ 0xCBA1EC44] = (boolean)((long)637548033 ^ (long)637548033);
            a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method929().Method1726(objectArray);
        }
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4201(blockPos2, vec3d, enumHand, enumFacing2, bl);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.rightClickDelayTimer = ((int)1181750809L ^ 0x46701618) << 2;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
        if (a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf == null) return;
        Object[] objectArray = new Object[(int)((long)-589340699 ^ (long)-589340700) << 1];
        Object[] objectArray3 = new Object[(int)((long)-2006678072 ^ (long)-2006678071)];
        objectArray3[(int)((long)-664697532 ^ (long)-664697532)] = blockPos;
        objectArray[(int)-2122837143L ^ 0x81781369] = a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method932().Method1726(objectArray3);
        objectArray[(int)-1082503466L ^ 0xBF7A4ED7] = ((int)-1536261382L ^ 0xA46E82FB) != 0;
        a2RqMGLVL5eLhJgc0LAUR9msraZzFUNF$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method929().Method1726(objectArray);
    }

    public static void Method4210(BlockPos blockPos, EnumHand enumHand, boolean bl, boolean bl2, EnumFacing enumFacing) {
        EnumFacing enumFacing2 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4211(blockPos);
        if (enumFacing2 == null) {
            return;
        }
        BlockPos blockPos2 = blockPos.offset(enumFacing2);
        EnumFacing enumFacing3 = enumFacing2.getOpposite();
        Vec3d vec3d = new Vec3d((Vec3i)blockPos2).add(new Vec3d(Double.longBitsToDouble(0xA18547F2EE0E3335L ^ 0x9E6547F2EE0E3335L), Double.longBitsToDouble((long)1245619221 ^ 0x3FE000004A3EA415L), Double.longBitsToDouble(0xA7BB28F315B17394L ^ 0x985B28F315B17394L))).add(new Vec3d(enumFacing3.getDirectionVec()).scale(Double.longBitsToDouble(0xFE1DF35F6196E808L ^ 0xC1FDF35F6196E808L)));
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.isSneaking()) {
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.setSneaking(((int)-1028263978L ^ 0xC2B5EFD7) != 0);
        }
        if (bl) {
            Vec3d vec3d2 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4206();
            double d = vec3d.x - vec3d2.x;
            double d2 = vec3d.y - vec3d2.y;
            double d3 = vec3d.z - vec3d2.z;
            double d4 = Math.sqrt(d * d + d3 * d3);
            float f = (float)Math.toDegrees(Math.atan2(d3, d)) - Float.intBitsToFloat((int)547481282L ^ 0x6215E6C2);
            float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
            float f3 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationYaw + MathHelper.wrapDegrees((float)(f - h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationYaw));
            float f4 = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationPitch + MathHelper.wrapDegrees((float)(f2 - h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.rotationPitch));
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f3, (float)MathHelper.normalizeAngle((int)((int)f4), (int)(((int)359023596L ^ 0x156643C1) << 3)), h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.onGround));
        }
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4201(blockPos2, vec3d, enumHand, enumFacing, bl2);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.rightClickDelayTimer = ((int)435260830L ^ 0x19F18D9F) << 2;
        h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
    }

    public static EnumFacing Method4211(BlockPos blockPos) {
        Iterator iterator = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).iterator();
        if (!iterator.hasNext()) return null;
        return (EnumFacing)iterator.next();
    }

    public static EnumFacing Method4212(BlockPos blockPos) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = (int)((long)1733193778 ^ (long)1733193778);
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos.offset(enumFacing));
            boolean bl = iBlockState.getBlock().onBlockActivated((World)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world, blockPos, iBlockState, (EntityPlayer)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, EnumHand.MAIN_HAND, enumFacing, 0.0f, 0.0f, 0.0f);
            if (bl) {
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
                Field12565 = (int)-1817119787L ^ 0x93B0F3D4;
            }
            if (iBlockState.getBlock().canCollideCheck(iBlockState, (boolean)((long)787103560 ^ (long)787103560)) && !iBlockState.getMaterial().isReplaceable()) {
                return enumFacing;
            }
            ++n2;
        }
        return null;
    }

    public static List Method4213(BlockPos blockPos) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world == null) return arrayList;
        if (blockPos == null) {
            return arrayList;
        }
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = (int)((long)-1657701448 ^ (long)-1657701448);
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2);
            if (iBlockState != null && iBlockState.getBlock().canCollideCheck(iBlockState, ((int)-1587912892L ^ 0xA15A5F44) != 0) && !iBlockState.getMaterial().isReplaceable()) {
                arrayList.add(enumFacing);
            }
            ++n2;
        }
        return arrayList;
    }

    public static void Method4214(BlockPos blockPos, boolean bl, boolean bl2) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = (int)1705471739L ^ 0x65A76EFB;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4218(blockPos.offset(enumFacing)) != h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390) {
                for (Entity entity : h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.loadedEntityList) {
                    if (!new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox())) continue;
                    return;
                }
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.START_SNEAKING));
                if (bl) {
                    h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos.offset(enumFacing), enumFacing.getOpposite(), EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                } else {
                    h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.playerController.processRightClickBlock(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world, blockPos.offset(enumFacing), enumFacing.getOpposite(), new Vec3d((Vec3i)blockPos), EnumHand.MAIN_HAND);
                }
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player, CPacketEntityAction.Action.STOP_SNEAKING));
                if (!bl2) return;
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos.offset(enumFacing), enumFacing.getOpposite()));
                return;
            }
            ++n2;
        }
    }

    public static EnumFacing Method4215(BlockPos blockPos) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = (int)((long)1080633859 ^ (long)1080633859);
        while (n2 < n) {
            IBlockState iBlockState;
            EnumFacing enumFacing = enumFacingArray[n2];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2).getBlock().canCollideCheck(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2), ((int)1047241644L ^ 0x3E6BA3AC) != 0) && !(iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2)).getMaterial().isReplaceable()) {
                return enumFacing;
            }
            ++n2;
        }
        return null;
    }

    public static EnumFacing Method4216(BlockPos blockPos, ArrayList arrayList) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        int n2 = (int)1950448543L ^ 0x74417B9F;
        while (n2 < n) {
            IBlockState iBlockState;
            BlockPos blockPos2;
            EnumFacing enumFacing = enumFacingArray[n2];
            if (!arrayList.contains(enumFacing) && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2 = blockPos.offset(enumFacing)).getBlock().canCollideCheck(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2), (boolean)((long)567320456 ^ (long)567320456)) && !(iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2)).getMaterial().isReplaceable()) {
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

    public static h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method4218(BlockPos blockPos) {
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.isAirBlock(blockPos)) {
            return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12390;
        }
        if (!(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().getBlockHardness(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos), (World)h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world, blockPos) == Float.intBitsToFloat((int)1428675126L ^ 0xEAA7DA36) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST))) {
            return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12391;
        }
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN)) return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392;
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL)) return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392;
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE)) return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392;
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST)) {
            return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12392;
        }
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK)) return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393;
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.BARRIER)) return null;
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12393;
    }

    public static boolean Method4219() {
        BlockPos blockPos = new BlockPos(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posX, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posY, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.posZ);
        IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos);
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4220(iBlockState, blockPos);
    }

    public static boolean Method4220(IBlockState iBlockState, BlockPos blockPos) {
        int n;
        if (iBlockState.getBlock() == Blocks.AIR && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.player.getDistanceSq(blockPos) >= 1.0 && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos.up()).getBlock() == Blocks.AIR && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos.up((int)((long)560917504 ^ (long)560917505) << 1)).getBlock() == Blocks.AIR && (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4222(blockPos) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4221(blockPos) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4223(blockPos) || h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4224(blockPos))) {
            n = (int)27810176L ^ 0x1A85981;
            return n != 0;
        }
        n = (int)((long)40295151 ^ (long)40295151);
        return n != 0;
    }

    public static boolean Method4221(BlockPos blockPos) {
        BlockPos[] blockPosArray = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = (int)-1596449073L ^ 0xA0D81ECF;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return (int)((long)1700186556 ^ (long)1700186556) != 0;
            if (iBlockState.getBlock() != Blocks.OBSIDIAN) {
                return (int)((long)1700186556 ^ (long)1700186556) != 0;
            }
            ++n2;
        }
        return ((int)1690158906L ^ 0x64BDC73B) != 0;
    }

    public static boolean Method4222(BlockPos blockPos) {
        BlockPos[] blockPosArray = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = (int)-287083626L ^ 0xEEE37396;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return (int)((long)1048212090 ^ (long)1048212090) != 0;
            if (iBlockState.getBlock() != Blocks.BEDROCK) {
                return (int)((long)1048212090 ^ (long)1048212090) != 0;
            }
            ++n2;
        }
        return ((int)783438173L ^ 0x2EB2515C) != 0;
    }

    public static boolean Method4223(BlockPos blockPos) {
        BlockPos[] blockPosArray = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = (int)-990674991L ^ 0xC4F37FD1;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return ((int)-1777822368L ^ 0x96089560) != 0;
            if (iBlockState.getBlock() != Blocks.BEDROCK && iBlockState.getBlock() != Blocks.OBSIDIAN) {
                return ((int)-1777822368L ^ 0x96089560) != 0;
            }
            ++n2;
        }
        return (int)((long)-1676793261 ^ (long)-1676793262) != 0;
    }

    public static boolean Method4224(BlockPos blockPos) {
        BlockPos[] blockPosArray = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4225(blockPos);
        int n = blockPosArray.length;
        int n2 = (int)((long)1614441061 ^ (long)1614441061);
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray[n2];
            IBlockState iBlockState = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.AIR) return (int)((long)957906876 ^ (long)957906876) != 0;
            if (!iBlockState.isFullBlock()) {
                return (int)((long)957906876 ^ (long)957906876) != 0;
            }
            ++n2;
        }
        return ((int)924388688L ^ 0x37190D51) != 0;
    }

    public static BlockPos[] Method4225(BlockPos blockPos) {
        BlockPos[] blockPosArray = new BlockPos[(int)((long)1614419593 ^ (long)1614419596)];
        blockPosArray[(int)-902690707L ^ 0xCA32086D] = blockPos.north();
        blockPosArray[(int)2067629462L ^ 0x7B3D8597] = blockPos.south();
        blockPosArray[(int)((long)1412465354 ^ (long)1412465355) << 1] = blockPos.east();
        blockPosArray[(int)((long)-1546386228 ^ (long)-1546386225)] = blockPos.west();
        blockPosArray[((int)840059548L ^ 0x32124A9D) << 2] = blockPos.down();
        return blockPosArray;
    }

    public static boolean Method4226(BlockPos blockPos) {
        int n;
        for (Entity entity : h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos))) {
            if (entity instanceof EntityItem) continue;
            return ((int)343967943L ^ 0x148088C7) != 0;
        }
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4227(blockPos) && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4205(blockPos)) {
            n = (int)((long)679941513 ^ (long)679941512);
            return n != 0;
        }
        n = (int)((long)-16224152 ^ (long)-16224152);
        return n != 0;
    }

    public static boolean Method4227(BlockPos blockPos) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Field12558.world.getBlockState(blockPos).getMaterial().isSolid();
    }

    static {
        Field12558 = Minecraft.getMinecraft();
        Vec3d[] vec3dArray = new Vec3d[(int)1235556953L ^ 0x49A51A58];
        vec3dArray[(int)((long)1288437222 ^ (long)1288437222)] = new Vec3d(0.0, Double.longBitsToDouble((long)1968513715 ^ 0xC0000000755522B3L), 0.0);
        Field12559 = vec3dArray;
        Vec3d[] vec3dArray2 = new Vec3d[(int)1715768331L ^ 0x66448C0E];
        vec3dArray2[(int)((long)1342482884 ^ (long)1342482884)] = new Vec3d(0.0, Double.longBitsToDouble(0xC69FEE23708D3D4FL ^ 0x796FEE23708D3D4FL), 0.0);
        vec3dArray2[(int)((long)-2001028593 ^ (long)-2001028594)] = new Vec3d(0.0, Double.longBitsToDouble(0x3DFF3B041311D4D7L ^ 0x820F3B041311D4D7L), Double.longBitsToDouble((long)1037190475 ^ 0xBFF000003DD2454BL));
        vec3dArray2[((int)-1281963851L ^ 0xB396C8B4) << 1] = new Vec3d(0.0, Double.longBitsToDouble(0x27E9985803E2B5A5L ^ 0x9819985803E2B5A5L), 1.0);
        vec3dArray2[(int)1650511778L ^ 0x6260CFA1] = new Vec3d(Double.longBitsToDouble((long)1904417926 ^ 0xBFF0000071831C86L), Double.longBitsToDouble(0xA1C9CE16EA1E24A5L ^ 0x1E39CE16EA1E24A5L), 0.0);
        vec3dArray2[((int)-1666455247L ^ 0x9CABE930) << 2] = new Vec3d(1.0, Double.longBitsToDouble((long)1411088854 ^ 0xBFF00000541B81D6L), 0.0);
        Field12560 = vec3dArray2;
        Vec3d[] vec3dArray3 = new Vec3d[((int)-333658451L ^ 0xEC1CC6AC) << 2];
        vec3dArray3[(int)1810316222L ^ 0x6BE73BBE] = new Vec3d(Double.longBitsToDouble(0x23363B2991FDE922L ^ 0x9CC63B2991FDE922L), 0.0, 0.0);
        vec3dArray3[(int)-1594987435L ^ 0xA0EE6C54] = new Vec3d(1.0, 0.0, 0.0);
        vec3dArray3[(int)((long)606338054 ^ (long)606338055) << 1] = new Vec3d(0.0, 0.0, Double.longBitsToDouble(0xFAC67AD4E24593D0L ^ 0x45367AD4E24593D0L));
        vec3dArray3[(int)-846213850L ^ 0xCD8FCD25] = new Vec3d(0.0, 0.0, 1.0);
        Field12561 = vec3dArray3;
        Vec3d[] vec3dArray4 = new Vec3d[(int)((long)-550296959 ^ (long)-550296956)];
        vec3dArray4[(int)((long)85225829 ^ (long)85225829)] = new Vec3d(1.0, 1.0, 0.0);
        vec3dArray4[(int)((long)1932274919 ^ (long)1932274918)] = new Vec3d(Double.longBitsToDouble((long)22303020 ^ 0xBFF000000154512CL), 1.0, 0.0);
        vec3dArray4[((int)1414586481L ^ 0x5450E070) << 1] = new Vec3d(0.0, 1.0, 1.0);
        vec3dArray4[(int)((long)523528586 ^ (long)523528585)] = new Vec3d(0.0, 1.0, Double.longBitsToDouble((long)30113725 ^ 0xBFF0000001CB7FBDL));
        vec3dArray4[(int)((long)935454744 ^ (long)935454745) << 2] = new Vec3d(0.0, Double.longBitsToDouble(0x1C1DE5985EAE6744L ^ 0x5C1DE5985EAE6744L), 0.0);
        Field12562 = vec3dArray4;
        Vec3d[] vec3dArray5 = new Vec3d[((int)-737098518L ^ 0xD410C4EB) << 2];
        vec3dArray5[(int)((long)6331258 ^ (long)6331258)] = new Vec3d(Double.longBitsToDouble((long)1041305132 ^ 0xBFF000003E110E2CL), Double.longBitsToDouble(0xF891805BCA793732L ^ 0xB891805BCA793732L), 0.0);
        vec3dArray5[(int)((long)1316707208 ^ (long)1316707209)] = new Vec3d(1.0, Double.longBitsToDouble((long)834195224 ^ 0x4000000031B8CF18L), 0.0);
        vec3dArray5[((int)1063298112L ^ 0x3F60A441) << 1] = new Vec3d(0.0, Double.longBitsToDouble(0xB45659FEEE2EA93EL ^ 0xF45659FEEE2EA93EL), 1.0);
        vec3dArray5[(int)-1379157234L ^ 0xADCBBB0D] = new Vec3d(0.0, Double.longBitsToDouble(0xB713B3A50A964EC1L ^ 0xF713B3A50A964EC1L), Double.longBitsToDouble((long)720353403 ^ 0xBFF000002AEFB87BL));
        Field12563 = vec3dArray5;
        Vec3d[] vec3dArray6 = new Vec3d[(int)-1215692743L ^ 0xB78A0038];
        vec3dArray6[(int)((long)6891124 ^ (long)6891124)] = new Vec3d(0.0, Double.longBitsToDouble((long)703953491 ^ 0x4008000029F57A53L), 0.0);
        Field12564 = vec3dArray6;
        Field12565 = (int)((long)627279590 ^ (long)627279590);
        Block[] blockArray = new Block[(int)((long)1118089692 ^ (long)1118089685)];
        blockArray[(int)((long)1225007783 ^ (long)1225007783)] = Blocks.ENDER_CHEST;
        blockArray[(int)2130893690L ^ 0x7F02DB7B] = Blocks.CHEST;
        blockArray[(int)((long)-1033991826 ^ (long)-1033991825) << 1] = Blocks.TRAPPED_CHEST;
        blockArray[(int)((long)1155944710 ^ (long)1155944709)] = Blocks.CRAFTING_TABLE;
        blockArray[(int)((long)1937613945 ^ (long)1937613944) << 2] = Blocks.ANVIL;
        blockArray[(int)-1660950107L ^ 0x9CFFE9A0] = Blocks.BREWING_STAND;
        blockArray[(int)((long)38011020 ^ (long)38011023) << 1] = Blocks.HOPPER;
        blockArray[(int)-1033017761L ^ 0xC26D6658] = Blocks.DROPPER;
        blockArray[((int)422750129L ^ 0x1932A7B0) << 3] = Blocks.DISPENSER;
        Field12556 = Arrays.asList(blockArray);
        Block[] blockArray2 = new Block[(int)((long)-1975846057 ^ (long)-1975846058) << 4];
        blockArray2[(int)-1874106110L ^ 0x904B6902] = Blocks.WHITE_SHULKER_BOX;
        blockArray2[(int)-1871670148L ^ 0x9070947D] = Blocks.ORANGE_SHULKER_BOX;
        blockArray2[(int)((long)2118819578 ^ (long)2118819579) << 1] = Blocks.MAGENTA_SHULKER_BOX;
        blockArray2[(int)((long)-1251582956 ^ (long)-1251582953)] = Blocks.LIGHT_BLUE_SHULKER_BOX;
        blockArray2[(int)((long)1127979017 ^ (long)1127979016) << 2] = Blocks.YELLOW_SHULKER_BOX;
        blockArray2[(int)1085445088L ^ 0x40B293E5] = Blocks.LIME_SHULKER_BOX;
        blockArray2[((int)1944515318L ^ 0x73E6F2F5) << 1] = Blocks.PINK_SHULKER_BOX;
        blockArray2[(int)((long)-1855893592 ^ (long)-1855893585)] = Blocks.GRAY_SHULKER_BOX;
        blockArray2[(int)((long)-531810549 ^ (long)-531810550) << 3] = Blocks.SILVER_SHULKER_BOX;
        blockArray2[(int)((long)-169017044 ^ (long)-169017051)] = Blocks.CYAN_SHULKER_BOX;
        blockArray2[((int)-1476743838L ^ 0xA7FAAD67) << 1] = Blocks.PURPLE_SHULKER_BOX;
        blockArray2[(int)1940961929L ^ 0x73B0BA82] = Blocks.BLUE_SHULKER_BOX;
        blockArray2[(int)((long)-612062028 ^ (long)-612062025) << 2] = Blocks.BROWN_SHULKER_BOX;
        blockArray2[(int)294850388L ^ 0x11930F59] = Blocks.GREEN_SHULKER_BOX;
        blockArray2[(int)((long)423262346 ^ (long)423262349) << 1] = Blocks.RED_SHULKER_BOX;
        blockArray2[(int)((long)450900517 ^ (long)450900522)] = Blocks.BLACK_SHULKER_BOX;
        Field12557 = Arrays.asList(blockArray2);
    }
}

