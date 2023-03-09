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
import lavahack.client.Class1036;
import lavahack.client.Class237;
import lavahack.client.Class447;
import lavahack.client.Class9;
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

public class Class1486 {
    private static final Minecraft Field14935 = Minecraft.getMinecraft();
    private String Field14936 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5941(Entity entity, double d, double d2, double d3) {
        BlockPos blockPos = new BlockPos(d, d2, d3);
        double d4 = d - (double)blockPos.getX();
        double d5 = d2 - (double)blockPos.getY();
        double d6 = d3 - (double)blockPos.getZ();
        if (!Class1486.Field14935.world.collidesWithAnyBlock(entity.getEntityBoundingBox())) return;
        EnumFacing enumFacing = EnumFacing.UP;
        double d7 = Double.longBitsToDouble(0x7FEFFFFFFFFFFFFFL);
        if (!Class1486.Field14935.world.isBlockFullCube(blockPos.west()) && d4 < d7) {
            d7 = d4;
            enumFacing = EnumFacing.WEST;
        }
        if (!Class1486.Field14935.world.isBlockFullCube(blockPos.east()) && 1.0 - d4 < d7) {
            d7 = 1.0 - d4;
            enumFacing = EnumFacing.EAST;
        }
        if (!Class1486.Field14935.world.isBlockFullCube(blockPos.north()) && d6 < d7) {
            d7 = d6;
            enumFacing = EnumFacing.NORTH;
        }
        if (!Class1486.Field14935.world.isBlockFullCube(blockPos.south()) && 1.0 - d6 < d7) {
            d7 = 1.0 - d6;
            enumFacing = EnumFacing.SOUTH;
        }
        if (!Class1486.Field14935.world.isBlockFullCube(blockPos.up()) && 1.0 - d5 < d7) {
            enumFacing = EnumFacing.UP;
        }
        float f = new Random().nextFloat() * Float.intBitsToFloat(1045220557) + Float.intBitsToFloat(0x3DCCCCCD);
        float f2 = enumFacing.getAxisDirection().getOffset();
        if (enumFacing.getAxis() == EnumFacing.Axis.X) {
            entity.motionX = f2 * f;
            entity.motionY *= Double.longBitsToDouble(4604930618986332160L);
            entity.motionZ *= Double.longBitsToDouble(4604930618986332160L);
            return;
        }
        if (enumFacing.getAxis() == EnumFacing.Axis.Y) {
            entity.motionX *= Double.longBitsToDouble(4604930618986332160L);
            entity.motionY = f2 * f;
            entity.motionZ *= Double.longBitsToDouble((long)708643341 ^ 0x3FE800002A3D0A0DL);
            return;
        }
        if (enumFacing.getAxis() != EnumFacing.Axis.Z) return;
        entity.motionX *= Double.longBitsToDouble(4604930618986332160L);
        entity.motionY *= Double.longBitsToDouble(4604930618986332160L);
        entity.motionZ = f2 * f;
    }

    public static double Method5942(BlockPos blockPos, ItemStack itemStack, long l) {
        return Class447.Method2118(1.0 - (double)(System.currentTimeMillis() - l) / (double)Class9.Method107(blockPos, itemStack), 0.0, 1.0);
    }

    public static AxisAlignedBB Method5943(BlockPos blockPos, ItemStack itemStack, long l) {
        return Class1486.Method5946(Class1486.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1486.Field14935.world, blockPos), Class1486.Method5942(blockPos, itemStack, l));
    }

    public static AxisAlignedBB Method5944(BlockPos blockPos, ItemStack itemStack, long l, Class237 class237) {
        return Class1486.Method5946(Class1486.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1486.Field14935.world, blockPos), class237.Method1309(Class1486.Method5942(blockPos, itemStack, l)));
    }

    public static AxisAlignedBB Method5945(BlockPos blockPos, ItemStack itemStack, long l, Class237 class237) {
        return Class1486.Method5946(Class1486.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1486.Field14935.world, blockPos), class237.Method1309(Class1486.Method5942(blockPos, itemStack, l)));
    }

    public static AxisAlignedBB Method5946(AxisAlignedBB axisAlignedBB, double d) {
        return new AxisAlignedBB(axisAlignedBB.minX + (axisAlignedBB.getCenter().x - axisAlignedBB.minX) * d, axisAlignedBB.minY + (axisAlignedBB.getCenter().y - axisAlignedBB.minY) * d, axisAlignedBB.minZ + (axisAlignedBB.getCenter().z - axisAlignedBB.minZ) * d, axisAlignedBB.maxX + (axisAlignedBB.getCenter().x - axisAlignedBB.maxX) * d, axisAlignedBB.maxY + (axisAlignedBB.getCenter().y - axisAlignedBB.maxY) * d, axisAlignedBB.maxZ + (axisAlignedBB.getCenter().z - axisAlignedBB.maxZ) * d);
    }

    public static float Method5947(BlockPos blockPos) {
        return Class1486.Field14935.world.getBlockState(blockPos).getPlayerRelativeBlockHardness((EntityPlayer)Class1486.Field14935.player, (World)Class1486.Field14935.world, blockPos);
    }

    public static boolean Method5948(BlockPos blockPos, boolean bl, boolean bl2) {
        if (!Class1486.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1486.Field14935.world, blockPos)) {
            return false;
        }
        if (bl2) {
            for (Entity entity : Class1486.Field14935.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos))) {
                if (entity instanceof EntityItem) continue;
                if (!(entity instanceof EntityXPOrb)) return false;
            }
        }
        if (!bl) return true;
        if (Class1036.Method4215(blockPos) == null) return false;
        return true;
    }

    public static boolean Method5949(BlockPos blockPos, EnumHand enumHand, boolean bl) {
        if (!Class1486.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1486.Field14935.world, blockPos)) {
            return false;
        }
        if (Class1036.Method4215(blockPos) == null) {
            return false;
        }
        Class1486.Method5950(blockPos, Class1036.Method4215(blockPos), enumHand, bl);
        Class1486.Field14935.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        return true;
    }

    public static void Method5950(BlockPos blockPos, EnumFacing enumFacing, EnumHand enumHand, boolean bl) {
        if (bl) {
            Class1486.Field14935.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos.offset(enumFacing), enumFacing.getOpposite(), enumHand, Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1099817537)) ^ 0x7E8DE241), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1104613179)) ^ 0x7ED70F3B), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1078263379)) ^ 0x7F44FE53)));
            return;
        }
        Class1486.Field14935.playerController.processRightClickBlock(Class1486.Field14935.player, Class1486.Field14935.world, blockPos.offset(enumFacing), enumFacing.getOpposite(), new Vec3d((Vec3i)blockPos), enumHand);
    }

    public static boolean Method5951(BlockPos blockPos, boolean bl, boolean bl2, boolean bl3) {
        if (!Class1486.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1486.Field14935.world, blockPos)) {
            return false;
        }
        if (bl2) {
            for (Entity entity : Class1486.Field14935.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos))) {
                if (entity instanceof EntityItem || entity instanceof EntityXPOrb) continue;
                if (!(entity instanceof EntityEnderCrystal)) return false;
                if (!bl3) return false;
            }
        }
        if (!bl) return true;
        if (Class1036.Method4215(blockPos) != null) return true;
        return false;
    }
}

