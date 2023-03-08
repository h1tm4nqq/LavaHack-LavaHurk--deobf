//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;

public class Class1486
{
    private static final Minecraft Field14935;
    private String Field14936 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method5941(final Entity entity, final double n, final double n2, final double n3) {
        final BlockPos blockPos = new BlockPos(n, n2, n3);
        final double n4 = n - blockPos.getX();
        final double n5 = n2 - blockPos.getY();
        final double n6 = n3 - blockPos.getZ();
        if (Class1486.Field14935.world.collidesWithAnyBlock(entity.getEntityBoundingBox())) {
            EnumFacing enumFacing = EnumFacing.UP;
            double longBitsToDouble = Double.longBitsToDouble(9218868437227405311L);
            if (!Class1486.Field14935.world.isBlockFullCube(blockPos.west()) && n4 < longBitsToDouble) {
                longBitsToDouble = n4;
                enumFacing = EnumFacing.WEST;
            }
            if (!Class1486.Field14935.world.isBlockFullCube(blockPos.east()) && 1.0 - n4 < longBitsToDouble) {
                longBitsToDouble = 1.0 - n4;
                enumFacing = EnumFacing.EAST;
            }
            if (!Class1486.Field14935.world.isBlockFullCube(blockPos.north()) && n6 < longBitsToDouble) {
                longBitsToDouble = n6;
                enumFacing = EnumFacing.NORTH;
            }
            if (!Class1486.Field14935.world.isBlockFullCube(blockPos.south()) && 1.0 - n6 < longBitsToDouble) {
                longBitsToDouble = 1.0 - n6;
                enumFacing = EnumFacing.SOUTH;
            }
            if (!Class1486.Field14935.world.isBlockFullCube(blockPos.up()) && 1.0 - n5 < longBitsToDouble) {
                enumFacing = EnumFacing.UP;
            }
            final float n7 = new Random().nextFloat() * Float.intBitsToFloat(1045220557) + Float.intBitsToFloat(1036831949);
            final float n8 = (float)enumFacing.getAxisDirection().getOffset();
            if (enumFacing.getAxis() == EnumFacing$Axis.X) {
                entity.motionX = n8 * n7;
                entity.motionY *= Double.longBitsToDouble(4604930618986332160L);
                entity.motionZ *= Double.longBitsToDouble(4604930618986332160L);
            }
            else if (enumFacing.getAxis() == EnumFacing$Axis.Y) {
                entity.motionX *= Double.longBitsToDouble(4604930618986332160L);
                entity.motionY = n8 * n7;
                entity.motionZ *= Double.longBitsToDouble((long)708643341 ^ 0x3FE800002A3D0A0DL);
            }
            else if (enumFacing.getAxis() == EnumFacing$Axis.Z) {
                entity.motionX *= Double.longBitsToDouble(4604930618986332160L);
                entity.motionY *= Double.longBitsToDouble(4604930618986332160L);
                entity.motionZ = n8 * n7;
            }
        }
    }
    
    public static double Method5942(final BlockPos blockPos, final ItemStack itemStack, final long n) {
        return Class447.Method2118(1.0 - (System.currentTimeMillis() - n) / (double)Class9.Method107(blockPos, itemStack), 0.0, 1.0);
    }
    
    public static AxisAlignedBB Method5943(final BlockPos blockPos, final ItemStack itemStack, final long n) {
        return Method5946(Class1486.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1486.Field14935.world, blockPos), Method5942(blockPos, itemStack, n));
    }
    
    public static AxisAlignedBB Method5944(final BlockPos blockPos, final ItemStack itemStack, final long n, final Class237 class237) {
        return Method5946(Class1486.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1486.Field14935.world, blockPos), class237.Method1309(Method5942(blockPos, itemStack, n)));
    }
    
    public static AxisAlignedBB Method5945(final BlockPos blockPos, final ItemStack itemStack, final long n, final Class237 class237) {
        return Method5946(Class1486.Field14935.world.getBlockState(blockPos).getSelectedBoundingBox((World)Class1486.Field14935.world, blockPos), class237.Method1309(Method5942(blockPos, itemStack, n)));
    }
    
    public static AxisAlignedBB Method5946(final AxisAlignedBB axisAlignedBB, final double n) {
        return new AxisAlignedBB(axisAlignedBB.minX + (axisAlignedBB.getCenter().x - axisAlignedBB.minX) * n, axisAlignedBB.minY + (axisAlignedBB.getCenter().y - axisAlignedBB.minY) * n, axisAlignedBB.minZ + (axisAlignedBB.getCenter().z - axisAlignedBB.minZ) * n, axisAlignedBB.maxX + (axisAlignedBB.getCenter().x - axisAlignedBB.maxX) * n, axisAlignedBB.maxY + (axisAlignedBB.getCenter().y - axisAlignedBB.maxY) * n, axisAlignedBB.maxZ + (axisAlignedBB.getCenter().z - axisAlignedBB.maxZ) * n);
    }
    
    public static float Method5947(final BlockPos blockPos) {
        return Class1486.Field14935.world.getBlockState(blockPos).getPlayerRelativeBlockHardness((EntityPlayer)Class1486.Field14935.player, (World)Class1486.Field14935.world, blockPos);
    }
    
    public static boolean Method5948(final BlockPos blockPos, final boolean b, final boolean b2) {
        if (!Class1486.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1486.Field14935.world, blockPos)) {
            return false;
        }
        if (b2) {
            for (final Entity entity : Class1486.Field14935.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
                if (!(entity instanceof EntityItem)) {
                    if (entity instanceof EntityXPOrb) {
                        continue;
                    }
                    return false;
                }
            }
        }
        return !b || Class1036.Method4215(blockPos) != null;
    }
    
    public static boolean Method5949(final BlockPos blockPos, final EnumHand enumHand, final boolean b) {
        if (!Class1486.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1486.Field14935.world, blockPos)) {
            return false;
        }
        if (Class1036.Method4215(blockPos) == null) {
            return false;
        }
        Method5950(blockPos, Class1036.Method4215(blockPos), enumHand, b);
        Class1486.Field14935.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        return true;
    }
    
    public static void Method5950(final BlockPos blockPos, final EnumFacing enumFacing, final EnumHand enumHand, final boolean b) {
        if (b) {
            Class1486.Field14935.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos.offset(enumFacing), enumFacing.getOpposite(), enumHand, Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1099817537)) ^ 0x7E8DE241), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1104613179)) ^ 0x7ED70F3B), Float.intBitsToFloat(Float.floatToIntBits(Float.intBitsToFloat(1078263379)) ^ 0x7F44FE53)));
        }
        else {
            Class1486.Field14935.playerController.processRightClickBlock(Class1486.Field14935.player, Class1486.Field14935.world, blockPos.offset(enumFacing), enumFacing.getOpposite(), new Vec3d((Vec3i)blockPos), enumHand);
        }
    }
    
    public static boolean Method5951(final BlockPos blockPos, final boolean b, final boolean b2, final boolean b3) {
        if (!Class1486.Field14935.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class1486.Field14935.world, blockPos)) {
            return false;
        }
        if (b2) {
            for (final Entity entity : Class1486.Field14935.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
                if (!(entity instanceof EntityItem) && !(entity instanceof EntityXPOrb)) {
                    if (entity instanceof EntityEnderCrystal && b3) {
                        continue;
                    }
                    return false;
                }
            }
        }
        return !b || Class1036.Method4215(blockPos) != null;
    }
    
    static {
        Field14935 = Minecraft.getMinecraft();
    }
}
