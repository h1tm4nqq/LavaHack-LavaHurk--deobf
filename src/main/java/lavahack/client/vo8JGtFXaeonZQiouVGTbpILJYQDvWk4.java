//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumFacing$Axis
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.Random;
import lavahack.client.bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class vo8JGtFXaeonZQiouVGTbpILJYQDvWk4 {
    private static final Minecraft Field14935 = Minecraft.getMinecraft();
    private String Field14936 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5941(Entity entity, double d, double d2, double d3) {
        BlockPos blockPos = new BlockPos(d, d2, d3);
        double d4 = d - (double)blockPos.getX();
        double d5 = d2 - (double)blockPos.getY();
        double d6 = d3 - (double)blockPos.getZ();
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.collidesWithAnyBlock(entity.getEntityBoundingBox())) return;
        EnumFacing enumFacing = EnumFacing.UP;
        double d7 = Double.longBitsToDouble(0x9643FD72979DA550L ^ 0xE9AC028D68625AAFL);
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.isBlockFullCube(blockPos.west()) && d4 < d7) {
            d7 = d4;
            enumFacing = EnumFacing.WEST;
        }
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.isBlockFullCube(blockPos.east()) && 1.0 - d4 < d7) {
            d7 = 1.0 - d4;
            enumFacing = EnumFacing.EAST;
        }
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.isBlockFullCube(blockPos.north()) && d6 < d7) {
            d7 = d6;
            enumFacing = EnumFacing.NORTH;
        }
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.isBlockFullCube(blockPos.south()) && 1.0 - d6 < d7) {
            d7 = 1.0 - d6;
            enumFacing = EnumFacing.SOUTH;
        }
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.isBlockFullCube(blockPos.up()) && 1.0 - d5 < d7) {
            enumFacing = EnumFacing.UP;
        }
        float f = new Random().nextFloat() * Float.intBitsToFloat((int)684600803L ^ 0x1682E12E) + Float.intBitsToFloat((int)((long)1527972417 ^ (long)1725943436));
        float f2 = enumFacing.getAxisDirection().getOffset();
        if (enumFacing.getAxis() == EnumFacing.Axis.X) {
            entity.motionX = f2 * f;
            entity.motionY *= Double.longBitsToDouble(0x7B80DC5CB85C4C69L ^ 0x4468DC5CB85C4C69L);
            entity.motionZ *= Double.longBitsToDouble(0x9764A3821C78B611L ^ 0xA88CA3821C78B611L);
            return;
        }
        if (enumFacing.getAxis() == EnumFacing.Axis.Y) {
            entity.motionX *= Double.longBitsToDouble(0x12D35A1245370506L ^ 0x2D3B5A1245370506L);
            entity.motionY = f2 * f;
            entity.motionZ *= Double.longBitsToDouble((long)708643341 ^ 0x3FE800002A3D0A0DL);
            return;
        }
        if (enumFacing.getAxis() != EnumFacing.Axis.Z) return;
        entity.motionX *= Double.longBitsToDouble(0xFC88F9C55D72BCF5L ^ 0xC360F9C55D72BCF5L);
        entity.motionY *= Double.longBitsToDouble(0xAA32C1DD4C4E55B0L ^ 0x95DAC1DD4C4E55B0L);
        entity.motionZ = f2 * f;
    }

    public static double Method5942(BlockPos blockPos, ItemStack itemStack, long l) {
        return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2118(1.0 - (double)(System.currentTimeMillis() - l) / (double)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method107(blockPos, itemStack), 0.0, 1.0);
    }

    public static AxisAlignedBB Method5943(BlockPos blockPos, ItemStack itemStack, long l) {
        return vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5946(vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos), vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5942(blockPos, itemStack, l));
    }

    public static AxisAlignedBB Method5944(BlockPos blockPos, ItemStack itemStack, long l, bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC2) {
        return vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5946(vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos), bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC2.Method1309(vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5942(blockPos, itemStack, l)));
    }

    public static AxisAlignedBB Method5945(BlockPos blockPos, ItemStack itemStack, long l, bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC2) {
        return vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5946(vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos), bAaIh3bYHxH7ANifZFFb4hVRX7sKeeUC2.Method1309(vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5942(blockPos, itemStack, l)));
    }

    public static AxisAlignedBB Method5946(AxisAlignedBB axisAlignedBB, double d) {
        return new AxisAlignedBB(axisAlignedBB.minX + (axisAlignedBB.getCenter().x - axisAlignedBB.minX) * d, axisAlignedBB.minY + (axisAlignedBB.getCenter().y - axisAlignedBB.minY) * d, axisAlignedBB.minZ + (axisAlignedBB.getCenter().z - axisAlignedBB.minZ) * d, axisAlignedBB.maxX + (axisAlignedBB.getCenter().x - axisAlignedBB.maxX) * d, axisAlignedBB.maxY + (axisAlignedBB.getCenter().y - axisAlignedBB.maxY) * d, axisAlignedBB.maxZ + (axisAlignedBB.getCenter().z - axisAlignedBB.maxZ) * d);
    }

    public static float Method5947(BlockPos blockPos) {
        return vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getBlockState(blockPos).getPlayerRelativeBlockHardness((EntityPlayer)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.player, (World)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos);
    }

    public static boolean Method5948(BlockPos blockPos, boolean bl, boolean bl2) {
        boolean bl3;
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos)) {
            return ((int)1000057364L ^ 0x3B9BAA14) != 0;
        }
        if (bl2) {
            for (Entity entity : vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos))) {
                if (entity instanceof EntityItem) continue;
                if (!(entity instanceof EntityXPOrb)) return (int)((long)487552295 ^ (long)487552295) != 0;
            }
        }
        if (!bl) return ((int)-1738957434L ^ 0x98599D87) != 0;
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos) != null) {
            bl3 = (int)183521698L ^ 0xAF051A3;
            return bl3;
        }
        bl3 = (int)-667982981L ^ 0xD82F637B;
        return bl3;
    }

    public static boolean Method5949(BlockPos blockPos, EnumHand enumHand, boolean bl) {
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos)) {
            return (int)((long)1091727393 ^ (long)1091727393) != 0;
        }
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos) == null) {
            return ((int)-860302939L ^ 0xCCB8D1A5) != 0;
        }
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5950(blockPos, h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos), enumHand, bl);
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        return (int)((long)2065889629 ^ (long)2065889628) != 0;
    }

    public static void Method5950(BlockPos blockPos, EnumFacing enumFacing, EnumHand enumHand, boolean bl) {
        if (bl) {
            vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos.offset(enumFacing), enumFacing.getOpposite(), enumHand, Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(0x2C444A10 ^ 0x6DC9A851)) ^ ((int)-1013229527L ^ 0xBD16BA68)), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)489774611L ^ 0x5CE65128)) ^ (int)((long)147399807 ^ (long)1981688644)), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat((int)((long)1732028426 ^ (long)662197849))) ^ (int)((long)-319651361 ^ (long)-1816756340))));
            return;
        }
        vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.playerController.processRightClickBlock(vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.player, vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos.offset(enumFacing), enumFacing.getOpposite(), new Vec3d((Vec3i)blockPos), enumHand);
    }

    public static boolean Method5951(BlockPos blockPos, boolean bl, boolean bl2, boolean bl3) {
        int n;
        if (!vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world, blockPos)) {
            return ((int)1705367230L ^ 0x65A5D6BE) != 0;
        }
        if (bl2) {
            for (Entity entity : vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Field14935.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos))) {
                if (entity instanceof EntityItem || entity instanceof EntityXPOrb) continue;
                if (!(entity instanceof EntityEnderCrystal)) return (int)((long)1478266759 ^ (long)1478266759) != 0;
                if (!bl3) return (int)((long)1478266759 ^ (long)1478266759) != 0;
            }
        }
        if (bl && h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4215(blockPos) == null) {
            n = (int)-535367090L ^ 0xE016F24E;
            return n != 0;
        }
        n = (int)((long)-226003757 ^ (long)-226003758);
        return n != 0;
    }
}

