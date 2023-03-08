//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.network.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.client.*;
import net.minecraft.init.*;
import java.util.*;

public class Class1036
{
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
    
    public static IBlockState Method4188(final BlockPos blockPos) {
        return Class1036.Field12558.world.getBlockState(blockPos);
    }
    
    public static boolean Method4189(final BlockPos blockPos) {
        final IBlockState getBlockState = Class1036.Field12558.world.getBlockState(blockPos);
        return getBlockState.getBlock().getBlockHardness(getBlockState, (World)Class1036.Field12558.world, blockPos) != Float.intBitsToFloat(-1082130432);
    }
    
    public static int Method4190(final BlockPos blockPos, final boolean b) {
        return Method4191(blockPos, b, true);
    }
    
    public static int Method4191(final BlockPos blockPos, final boolean b, final boolean b2) {
        final Block getBlock = Class1036.Field12558.world.getBlockState(blockPos).getBlock();
        if (!(getBlock instanceof BlockAir) && !(getBlock instanceof BlockLiquid) && !(getBlock instanceof BlockTallGrass) && !(getBlock instanceof BlockFire) && !(getBlock instanceof BlockDeadBush) && !(getBlock instanceof BlockSnow)) {
            return 0;
        }
        if (!Method4198(blockPos, b, 0.0f)) {
            return -1;
        }
        if (b2) {
            for (final Entity entity : Class1036.Field12558.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
                if (!(entity instanceof EntityItem)) {
                    if (entity instanceof EntityXPOrb) {
                        continue;
                    }
                    return 1;
                }
            }
        }
        final Iterator<EnumFacing> iterator2 = Method4213(blockPos).iterator();
        while (iterator2.hasNext()) {
            if (!Method4205(blockPos.offset((EnumFacing)iterator2.next()))) {
                continue;
            }
            return 3;
        }
        return 2;
    }
    
    public static Vec3d[] Method4192(final Vec3d vec3d, final Vec3d[] array) {
        final Vec3d[] array2 = new Vec3d[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = vec3d.add(array[i]);
        }
        return array2;
    }
    
    public static Vec3d[] Method4193(final EntityPlayer entityPlayer, final Vec3d[] array) {
        return Method4192(entityPlayer.getPositionVector(), array);
    }
    
    public static List Method4194(final Vec3d vec3d, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6) {
        final ArrayList<Vec3d> c = new ArrayList<Vec3d>();
        if (b5) {
            Collections.addAll(c, Method4192(vec3d, Class1036.Field12559));
        }
        if (b4) {
            Collections.addAll(c, Method4192(vec3d, Class1036.Field12560));
        }
        if (b3) {
            Collections.addAll(c, Method4192(vec3d, Class1036.Field12561));
        }
        Collections.addAll(c, Method4192(vec3d, Class1036.Field12562));
        if (b2) {
            Collections.addAll(c, Method4192(vec3d, Class1036.Field12563));
        }
        else {
            final List method4197 = Method4197(vec3d, 2, false);
            if (method4197.size() == 4) {
                for (final Vec3d vec3d2 : method4197) {
                    switch (Method4190(new BlockPos(vec3d).add(vec3d2.x, vec3d2.y, vec3d2.z), b6)) {
                        case -1:
                        case 1:
                        case 2: {
                            continue;
                        }
                        case 3: {
                            c.add(vec3d.add(vec3d2));
                            break;
                        }
                    }
                    if (b) {
                        Collections.addAll(c, Method4192(vec3d, Class1036.Field12564));
                    }
                    return c;
                }
            }
        }
        if (b) {
            Collections.addAll(c, Method4192(vec3d, Class1036.Field12564));
        }
        return c;
    }
    
    public static List Method4195(final int n, final boolean b) {
        final ArrayList<Vec3d> list = new ArrayList<Vec3d>();
        list.add(new Vec3d(Double.longBitsToDouble(-4616189618054758400L), (double)n, 0.0));
        list.add(new Vec3d(1.0, (double)n, 0.0));
        list.add(new Vec3d(0.0, (double)n, Double.longBitsToDouble((long)1740209116 ^ 0xBFF0000067B97BDCL)));
        list.add(new Vec3d(0.0, (double)n, 1.0));
        if (b) {
            list.add(new Vec3d(0.0, (double)(n - 1), 0.0));
        }
        return list;
    }
    
    public static Vec3d[] Method4196(final int n, final boolean b) {
        final List method4195 = Method4195(n, b);
        return method4195.toArray(new Vec3d[method4195.size()]);
    }
    
    public static List Method4197(final Vec3d vec3d, final int n, final boolean b) {
        final ArrayList<Vec3d> list = new ArrayList<Vec3d>();
        for (final Vec3d e : Method4196(n, b)) {
            final Block getBlock = Class1036.Field12558.world.getBlockState(new BlockPos(vec3d).add(e.x, e.y, e.z)).getBlock();
            if (getBlock instanceof BlockAir || getBlock instanceof BlockLiquid || getBlock instanceof BlockTallGrass || getBlock instanceof BlockFire || getBlock instanceof BlockDeadBush || getBlock instanceof BlockSnow) {
                list.add(e);
            }
        }
        return list;
    }
    
    public static boolean Method4198(final BlockPos blockPos, final boolean b, final float n) {
        return !b || Class1036.Field12558.world.rayTraceBlocks(new Vec3d(Class1036.Field12558.player.posX, Class1036.Field12558.player.posY + Class1036.Field12558.player.getEyeHeight(), Class1036.Field12558.player.posZ), new Vec3d((double)blockPos.getX(), (double)(blockPos.getY() + n), (double)blockPos.getZ()), false, true, false) == null;
    }
    
    public static boolean Method4199(final BlockPos blockPos, final boolean b) {
        return Method4198(blockPos, b, 1.0f);
    }
    
    public static boolean Method4200(final BlockPos blockPos) {
        return Method4199(blockPos, true);
    }
    
    public static void Method4201(final BlockPos blockPos, final Vec3d vec3d, final EnumHand enumHand, final EnumFacing enumFacing, final boolean b) {
        if (b) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, enumHand, (float)(vec3d.x - blockPos.getX()), (float)(vec3d.y - blockPos.getY()), (float)(vec3d.z - blockPos.getZ())));
        }
        else {
            Class1036.Field12558.playerController.processRightClickBlock(Class1036.Field12558.player, Class1036.Field12558.world, blockPos, enumFacing, vec3d, enumHand);
        }
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
    }
    
    public static double Method4202() {
        for (double posY = Class1036.Field12558.player.posY; posY > 0.0; posY -= Double.longBitsToDouble(4562254508917369340L)) {
            if (!(Class1036.Field12558.world.getBlockState(new BlockPos(Class1036.Field12558.player.posX, posY, Class1036.Field12558.player.posZ)).getBlock() instanceof BlockSlab) && Class1036.Field12558.world.getBlockState(new BlockPos(Class1036.Field12558.player.posX, posY, Class1036.Field12558.player.posZ)).getBlock().getDefaultState().getCollisionBoundingBox((IBlockAccess)Class1036.Field12558.world, new BlockPos(0, 0, 0)) != null) {
                return posY;
            }
        }
        return Double.longBitsToDouble((long)208102579 ^ 0xBFF000000C6764B3L);
    }
    
    public static Block Method4203(final BlockPos blockPos) {
        return Method4188(blockPos).getBlock();
    }
    
    public static Block Method4204(final double n, final double n2, final double n3) {
        return Class1036.Field12558.world.getBlockState(new BlockPos(n, n2, n3)).getBlock();
    }
    
    public static boolean Method4205(final BlockPos blockPos) {
        return Method4203(blockPos).canCollideCheck(Method4188(blockPos), false);
    }
    
    public static Vec3d Method4206() {
        return new Vec3d(Class1036.Field12558.player.posX, Class1036.Field12558.player.posY + Class1036.Field12558.player.getEyeHeight(), Class1036.Field12558.player.posZ);
    }
    
    public static boolean Method4207(final BlockPos blockPos, final EnumHand enumHand, final boolean b, final boolean b2, final boolean b3) {
        final EnumFacing method4211 = Method4211(blockPos);
        if (method4211 == null) {
            return b3;
        }
        final BlockPos offset = blockPos.offset(method4211);
        final EnumFacing getOpposite = method4211.getOpposite();
        final Vec3d add = new Vec3d((Vec3i)offset).add(new Vec3d(Double.longBitsToDouble((long)412591460 ^ 0x3FE000001897A564L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L))).add(new Vec3d(getOpposite.getDirectionVec()).scale(Double.longBitsToDouble(4602678819172646912L)));
        final Block getBlock = Class1036.Field12558.world.getBlockState(offset).getBlock();
        if (!Class1036.Field12558.player.isSneaking() && (Class1036.Field12556.contains(getBlock) || Class1036.Field12557.contains(getBlock))) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
        }
        if (b) {
            Class1568.Method6171(add);
        }
        Method4201(offset, add, enumHand, getOpposite, b2);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        return b3;
    }
    
    public static void Method4208(final BlockPos blockPos, final EnumHand enumHand, final boolean b, final boolean b2) {
        final EnumFacing method4211 = Method4211(blockPos);
        if (method4211 == null) {
            return;
        }
        final BlockPos offset = blockPos.offset(method4211);
        final EnumFacing getOpposite = method4211.getOpposite();
        final Vec3d add = new Vec3d((Vec3i)offset).add(new Vec3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L))).add(new Vec3d(getOpposite.getDirectionVec()).scale(Double.longBitsToDouble((long)531801197 ^ 0x3FE000001FB2A46DL)));
        if (!Class1036.Field12558.player.isSneaking()) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
            Class1036.Field12558.player.setSneaking(true);
        }
        if (b) {
            final Vec3d method4212 = Method4206();
            final double x = add.x - method4212.x;
            final double y = add.y - method4212.y;
            final double y2 = add.z - method4212.z;
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(Class1036.Field12558.player.rotationYaw + MathHelper.wrapDegrees((float)Math.toDegrees(Math.atan2(y2, x)) - Float.intBitsToFloat(1119092736) - Class1036.Field12558.player.rotationYaw), (float)MathHelper.normalizeAngle((int)(Class1036.Field12558.player.rotationPitch + MathHelper.wrapDegrees((float)(-Math.toDegrees(Math.atan2(y, Math.sqrt(x * x + y2 * y2)))) - Class1036.Field12558.player.rotationPitch)), 360), Class1036.Field12558.player.onGround));
        }
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
        Method4201(offset, add, enumHand, getOpposite, b2);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.STOP_SNEAKING));
    }
    
    public static void Method4209(final BlockPos blockPos, final EnumHand enumHand, final Class135 class135, final boolean b) {
        final EnumFacing method4211 = Method4211(blockPos);
        if (method4211 == null) {
            return;
        }
        final BlockPos offset = blockPos.offset(method4211);
        final EnumFacing getOpposite = method4211.getOpposite();
        final Vec3d add = new Vec3d((Vec3i)offset).add(new Vec3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1683671664 ^ 0x3FE00000645ACA70L))).add(new Vec3d(getOpposite.getDirectionVec()).scale(Double.longBitsToDouble(4602678819172646912L)));
        if (!Class1036.Field12558.player.isSneaking()) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
            Class1036.Field12558.player.setSneaking(true);
        }
        if (class135 != null) {
            class135.Method929().Method1726(class135.Method932().Method1726(blockPos), false);
        }
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
        Method4201(offset, add, enumHand, getOpposite, b);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.STOP_SNEAKING));
        if (class135 != null) {
            class135.Method929().Method1726(class135.Method932().Method1726(blockPos), true);
        }
    }
    
    public static void Method4210(final BlockPos blockPos, final EnumHand enumHand, final boolean b, final boolean b2, final EnumFacing enumFacing) {
        final EnumFacing method4211 = Method4211(blockPos);
        if (method4211 == null) {
            return;
        }
        final BlockPos offset = blockPos.offset(method4211);
        final Vec3d add = new Vec3d((Vec3i)offset).add(new Vec3d(Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)1245619221 ^ 0x3FE000004A3EA415L), Double.longBitsToDouble(4602678819172646912L))).add(new Vec3d(method4211.getOpposite().getDirectionVec()).scale(Double.longBitsToDouble(4602678819172646912L)));
        if (!Class1036.Field12558.player.isSneaking()) {
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
            Class1036.Field12558.player.setSneaking(true);
        }
        if (b) {
            final Vec3d method4212 = Method4206();
            final double x = add.x - method4212.x;
            final double y = add.y - method4212.y;
            final double y2 = add.z - method4212.z;
            Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(Class1036.Field12558.player.rotationYaw + MathHelper.wrapDegrees((float)Math.toDegrees(Math.atan2(y2, x)) - Float.intBitsToFloat(1119092736) - Class1036.Field12558.player.rotationYaw), (float)MathHelper.normalizeAngle((int)(Class1036.Field12558.player.rotationPitch + MathHelper.wrapDegrees((float)(-Math.toDegrees(Math.atan2(y, Math.sqrt(x * x + y2 * y2)))) - Class1036.Field12558.player.rotationPitch)), 360), Class1036.Field12558.player.onGround));
        }
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
        Method4201(offset, add, enumHand, enumFacing, b2);
        Class1036.Field12558.player.swingArm(EnumHand.MAIN_HAND);
        Class1036.Field12558.rightClickDelayTimer = 4;
        Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.STOP_SNEAKING));
    }
    
    public static EnumFacing Method4211(final BlockPos blockPos) {
        final Iterator<EnumFacing> iterator = Method4213(blockPos).iterator();
        if (iterator.hasNext()) {
            return iterator.next();
        }
        return null;
    }
    
    public static EnumFacing Method4212(final BlockPos blockPos) {
        for (final EnumFacing enumFacing : EnumFacing.values()) {
            final IBlockState getBlockState = Class1036.Field12558.world.getBlockState(blockPos.offset(enumFacing));
            if (getBlockState.getBlock().onBlockActivated((World)Class1036.Field12558.world, blockPos, getBlockState, (EntityPlayer)Class1036.Field12558.player, EnumHand.MAIN_HAND, enumFacing, 0.0f, 0.0f, 0.0f)) {
                Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
                Class1036.Field12565 = true;
            }
            if (getBlockState.getBlock().canCollideCheck(getBlockState, false) && !getBlockState.getMaterial().isReplaceable()) {
                return enumFacing;
            }
        }
        return null;
    }
    
    public static List Method4213(final BlockPos blockPos) {
        final ArrayList<EnumFacing> list = new ArrayList<EnumFacing>();
        if (Class1036.Field12558.world == null || blockPos == null) {
            return list;
        }
        for (final EnumFacing e : EnumFacing.values()) {
            final IBlockState getBlockState = Class1036.Field12558.world.getBlockState(blockPos.offset(e));
            if (getBlockState != null && getBlockState.getBlock().canCollideCheck(getBlockState, false) && !getBlockState.getMaterial().isReplaceable()) {
                list.add(e);
            }
        }
        return list;
    }
    
    public static void Method4214(final BlockPos blockPos, final boolean b, final boolean b2) {
        for (final EnumFacing enumFacing : EnumFacing.values()) {
            if (Method4218(blockPos.offset(enumFacing)) != Class1010.Field12390) {
                final Iterator<Entity> iterator = (Iterator<Entity>)Class1036.Field12558.world.loadedEntityList.iterator();
                while (iterator.hasNext()) {
                    if (new AxisAlignedBB(blockPos).intersects(iterator.next().getEntityBoundingBox())) {
                        return;
                    }
                }
                Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.START_SNEAKING));
                if (b) {
                    Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos.offset(enumFacing), enumFacing.getOpposite(), EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                }
                else {
                    Class1036.Field12558.playerController.processRightClickBlock(Class1036.Field12558.player, Class1036.Field12558.world, blockPos.offset(enumFacing), enumFacing.getOpposite(), new Vec3d((Vec3i)blockPos), EnumHand.MAIN_HAND);
                }
                Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1036.Field12558.player, CPacketEntityAction$Action.STOP_SNEAKING));
                if (b2) {
                    Class1036.Field12558.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging$Action.START_DESTROY_BLOCK, blockPos.offset(enumFacing), enumFacing.getOpposite()));
                }
                return;
            }
        }
    }
    
    public static EnumFacing Method4215(final BlockPos blockPos) {
        for (final EnumFacing enumFacing : EnumFacing.values()) {
            final BlockPos offset = blockPos.offset(enumFacing);
            if (Class1036.Field12558.world.getBlockState(offset).getBlock().canCollideCheck(Class1036.Field12558.world.getBlockState(offset), false)) {
                if (!Class1036.Field12558.world.getBlockState(offset).getMaterial().isReplaceable()) {
                    return enumFacing;
                }
            }
        }
        return null;
    }
    
    public static EnumFacing Method4216(final BlockPos blockPos, final ArrayList list) {
        for (final EnumFacing o : EnumFacing.values()) {
            if (!list.contains(o)) {
                final BlockPos offset = blockPos.offset(o);
                if (Class1036.Field12558.world.getBlockState(offset).getBlock().canCollideCheck(Class1036.Field12558.world.getBlockState(offset), false)) {
                    if (!Class1036.Field12558.world.getBlockState(offset).getMaterial().isReplaceable()) {
                        return o;
                    }
                }
            }
        }
        return null;
    }
    
    public static Vec3d Method4217(final double a, final double a2, final double a3) {
        return new Vec3d(Math.floor(a) + Double.longBitsToDouble((long)671430029 ^ 0x3FE000002805358DL), Math.floor(a2), Math.floor(a3) + Double.longBitsToDouble((long)492912441 ^ 0x3FE000001D613F39L));
    }
    
    public static Class1010 Method4218(final BlockPos blockPos) {
        if (Class1036.Field12558.world.isAirBlock(blockPos)) {
            return Class1010.Field12390;
        }
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().getBlockHardness(Class1036.Field12558.world.getBlockState(blockPos), (World)Class1036.Field12558.world, blockPos) != Float.intBitsToFloat(-1082130432) && !Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN) && !Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL) && !Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE) && !Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST)) {
            return Class1010.Field12391;
        }
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST)) {
            return Class1010.Field12392;
        }
        if (Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK) || Class1036.Field12558.world.getBlockState(blockPos).getBlock().equals(Blocks.BARRIER)) {
            return Class1010.Field12393;
        }
        return null;
    }
    
    public static boolean Method4219() {
        final BlockPos blockPos = new BlockPos(Class1036.Field12558.player.posX, Class1036.Field12558.player.posY, Class1036.Field12558.player.posZ);
        return Method4220(Class1036.Field12558.world.getBlockState(blockPos), blockPos);
    }
    
    public static boolean Method4220(final IBlockState blockState, final BlockPos blockPos) {
        return blockState.getBlock() == Blocks.AIR && Class1036.Field12558.player.getDistanceSq(blockPos) >= 1.0 && Class1036.Field12558.world.getBlockState(blockPos.up()).getBlock() == Blocks.AIR && Class1036.Field12558.world.getBlockState(blockPos.up(2)).getBlock() == Blocks.AIR && (Method4222(blockPos) || Method4221(blockPos) || Method4223(blockPos) || Method4224(blockPos));
    }
    
    public static boolean Method4221(final BlockPos blockPos) {
        final BlockPos[] method4225 = Method4225(blockPos);
        for (int length = method4225.length, i = 0; i < length; ++i) {
            final IBlockState getBlockState = Class1036.Field12558.world.getBlockState(method4225[i]);
            if (getBlockState.getBlock() == Blocks.AIR || getBlockState.getBlock() != Blocks.OBSIDIAN) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Method4222(final BlockPos blockPos) {
        final BlockPos[] method4225 = Method4225(blockPos);
        for (int length = method4225.length, i = 0; i < length; ++i) {
            final IBlockState getBlockState = Class1036.Field12558.world.getBlockState(method4225[i]);
            if (getBlockState.getBlock() == Blocks.AIR || getBlockState.getBlock() != Blocks.BEDROCK) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Method4223(final BlockPos blockPos) {
        final BlockPos[] method4225 = Method4225(blockPos);
        for (int length = method4225.length, i = 0; i < length; ++i) {
            final IBlockState getBlockState = Class1036.Field12558.world.getBlockState(method4225[i]);
            if (getBlockState.getBlock() == Blocks.AIR || (getBlockState.getBlock() != Blocks.BEDROCK && getBlockState.getBlock() != Blocks.OBSIDIAN)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Method4224(final BlockPos blockPos) {
        final BlockPos[] method4225 = Method4225(blockPos);
        for (int length = method4225.length, i = 0; i < length; ++i) {
            final IBlockState getBlockState = Class1036.Field12558.world.getBlockState(method4225[i]);
            if (getBlockState.getBlock() == Blocks.AIR || !getBlockState.isFullBlock()) {
                return false;
            }
        }
        return true;
    }
    
    public static BlockPos[] Method4225(final BlockPos blockPos) {
        return new BlockPos[] { blockPos.north(), blockPos.south(), blockPos.east(), blockPos.west(), blockPos.down() };
    }
    
    public static boolean Method4226(final BlockPos blockPos) {
        final Iterator<Entity> iterator = Class1036.Field12558.world.getEntitiesWithinAABBExcludingEntity((Entity)null, new AxisAlignedBB(blockPos)).iterator();
        while (iterator.hasNext()) {
            if (!(iterator.next() instanceof EntityItem)) {
                return false;
            }
        }
        return !Method4227(blockPos) && Method4205(blockPos);
    }
    
    public static boolean Method4227(final BlockPos blockPos) {
        return Class1036.Field12558.world.getBlockState(blockPos).getMaterial().isSolid();
    }
    
    static {
        Field12558 = Minecraft.getMinecraft();
        Class1036.Field12559 = new Vec3d[] { new Vec3d(0.0, Double.longBitsToDouble((long)1968513715 ^ 0xC0000000755522B3L), 0.0) };
        Class1036.Field12560 = new Vec3d[] { new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), Double.longBitsToDouble((long)1037190475 ^ 0xBFF000003DD2454BL)), new Vec3d(0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0), new Vec3d(Double.longBitsToDouble((long)1904417926 ^ 0xBFF0000071831C86L), Double.longBitsToDouble(-4616189618054758400L), 0.0), new Vec3d(1.0, Double.longBitsToDouble((long)1411088854 ^ 0xBFF00000541B81D6L), 0.0) };
        Class1036.Field12561 = new Vec3d[] { new Vec3d(Double.longBitsToDouble(-4616189618054758400L), 0.0, 0.0), new Vec3d(1.0, 0.0, 0.0), new Vec3d(0.0, 0.0, Double.longBitsToDouble(-4616189618054758400L)), new Vec3d(0.0, 0.0, 1.0) };
        Class1036.Field12562 = new Vec3d[] { new Vec3d(1.0, 1.0, 0.0), new Vec3d(Double.longBitsToDouble((long)22303020 ^ 0xBFF000000154512CL), 1.0, 0.0), new Vec3d(0.0, 1.0, 1.0), new Vec3d(0.0, 1.0, Double.longBitsToDouble((long)30113725 ^ 0xBFF0000001CB7FBDL)), new Vec3d(0.0, Double.longBitsToDouble(4611686018427387904L), 0.0) };
        Class1036.Field12563 = new Vec3d[] { new Vec3d(Double.longBitsToDouble((long)1041305132 ^ 0xBFF000003E110E2CL), Double.longBitsToDouble(4611686018427387904L), 0.0), new Vec3d(1.0, Double.longBitsToDouble((long)834195224 ^ 0x4000000031B8CF18L), 0.0), new Vec3d(0.0, Double.longBitsToDouble(4611686018427387904L), 1.0), new Vec3d(0.0, Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble((long)720353403 ^ 0xBFF000002AEFB87BL)) };
        Class1036.Field12564 = new Vec3d[] { new Vec3d(0.0, Double.longBitsToDouble((long)703953491 ^ 0x4008000029F57A53L), 0.0) };
        Class1036.Field12565 = false;
        Field12556 = Arrays.asList(Blocks.ENDER_CHEST, (Block)Blocks.CHEST, Blocks.TRAPPED_CHEST, Blocks.CRAFTING_TABLE, Blocks.ANVIL, Blocks.BREWING_STAND, (Block)Blocks.HOPPER, Blocks.DROPPER, Blocks.DISPENSER);
        Field12557 = Arrays.asList(Blocks.WHITE_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.SILVER_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.BLACK_SHULKER_BOX);
    }
}
