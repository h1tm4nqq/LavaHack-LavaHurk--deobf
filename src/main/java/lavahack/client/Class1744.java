//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.network.*;
import com.mojang.authlib.*;
import java.util.function.*;
import java.util.concurrent.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.block.*;
import net.minecraft.potion.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.init.*;
import java.util.*;

public class Class1744
{
    private static final Minecraft Field16007;
    public static final Map Field16008;
    private String Field16009 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method6632(final Class1517 class1517) {
        switch (Class1306.Field13969[class1517.ordinal()]) {
            case 1: {
                Class1744.Field16007.player.swingArm(EnumHand.MAIN_HAND);
                break;
            }
            case 2: {
                Class1744.Field16007.player.swingArm(EnumHand.OFF_HAND);
                break;
            }
            case 3: {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketAnimation(Class1744.Field16007.player.getHeldItemMainhand().getItem().equals(Items.END_CRYSTAL) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND));
                break;
            }
        }
    }
    
    public static void Method6633(final int n) {
        if (n > 0 && n != 5) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY, Class1744.Field16007.player.posZ, true));
        }
        if (n > 1) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble((long)737400028 ^ 0x3FDAE1478BF3D556L), Class1744.Field16007.player.posZ, true));
        }
        if (n > 2) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble(4604959441848497898L), Class1744.Field16007.player.posZ, true));
        }
        if (n > 3) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble((long)928711823 ^ 0x3FF00578D772870BL), Class1744.Field16007.player.posZ, true));
        }
        if (n > 4) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble(4607930508405681474L), Class1744.Field16007.player.posZ, true));
        }
    }
    
    public static EntityOtherPlayerMP Method6634(final GameProfile gameProfile) {
        return Method6635(gameProfile, EntityOtherPlayerMP::new);
    }
    
    public static EntityOtherPlayerMP Method6635(final GameProfile gameProfile, final BiFunction biFunction) {
        final EntityOtherPlayerMP method6636 = Method6636(gameProfile, biFunction);
        int nextInt;
        for (nextInt = -1000; Class1744.Field16008.containsKey(nextInt) || Class1744.Field16007.world.getEntityByID(nextInt) != null; nextInt = ThreadLocalRandom.current().nextInt(-100000, -100)) {}
        Class1744.Field16008.put(nextInt, method6636);
        Class1744.Field16007.world.addEntityToWorld(nextInt, (Entity)method6636);
        return method6636;
    }
    
    public static EntityOtherPlayerMP Method6636(final GameProfile gameProfile, final BiFunction biFunction) {
        final EntityOtherPlayerMP entityOtherPlayerMP = biFunction.apply(Class1744.Field16007.world, gameProfile);
        entityOtherPlayerMP.inventory = Class1744.Field16007.player.inventory;
        entityOtherPlayerMP.inventoryContainer = Class1744.Field16007.player.inventoryContainer;
        entityOtherPlayerMP.setPositionAndRotation(Class1744.Field16007.player.posX, Class1744.Field16007.player.getEntityBoundingBox().minY, Class1744.Field16007.player.posZ, Class1744.Field16007.player.rotationYaw, Class1744.Field16007.player.rotationPitch);
        entityOtherPlayerMP.rotationYawHead = Class1744.Field16007.player.rotationYawHead;
        entityOtherPlayerMP.onGround = Class1744.Field16007.player.onGround;
        entityOtherPlayerMP.setSneaking(Class1744.Field16007.player.isSneaking());
        entityOtherPlayerMP.setHealth(Class1744.Field16007.player.getHealth());
        entityOtherPlayerMP.setAbsorptionAmount(Class1744.Field16007.player.getAbsorptionAmount());
        final Iterator<PotionEffect> iterator = Class1744.Field16007.player.getActivePotionEffects().iterator();
        while (iterator.hasNext()) {
            entityOtherPlayerMP.addPotionEffect((PotionEffect)iterator.next());
        }
        return entityOtherPlayerMP;
    }
    
    public static void Method6637(final EntityOtherPlayerMP entityOtherPlayerMP) {
        Class1744.Field16007.addScheduledTask(Class1744::Method6665);
    }
    
    public static BlockPos Method6638() {
        return new BlockPos(Math.floor(Class1744.Field16007.player.posX), Math.floor(Class1744.Field16007.player.posY), Math.floor(Class1744.Field16007.player.posZ));
    }
    
    public static BlockPos Method6639(final EntityPlayer entityPlayer) {
        return new BlockPos(Math.floor(entityPlayer.posX), Math.floor(entityPlayer.posY), Math.floor(entityPlayer.posZ));
    }
    
    public static List Method6640(final double n) {
        return Method6641(Class1744.Field16007.player.getPositionVector(), n);
    }
    
    public static List Method6641(final Vec3d vec3d, final double n) {
        return Method6642(EntityPlayer.class, vec3d, n);
    }
    
    public static List Method6642(final Class clazz, final Vec3d vec3d, final double n) {
        final ArrayList<Entity> list = new ArrayList<Entity>();
        for (final Entity entity : Class1744.Field16007.world.loadedEntityList) {
            if (entity.getDistance((Entity)Class1744.Field16007.player) <= n) {
                list.add(entity);
            }
        }
        return list;
    }
    
    public static EntityPlayer Method6643(double n, final EntityPlayer entityPlayer) {
        n *= n;
        final List playerEntities = Class1744.Field16007.world.playerEntities;
        EntityPlayer entityPlayer2 = null;
        for (final EntityPlayer entityPlayer3 : playerEntities) {
            if (Class394.Method1949((Entity)entityPlayer3)) {
                continue;
            }
            if (entityPlayer == null && Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer3) <= n) {
                entityPlayer2 = entityPlayer3;
            }
            else {
                if (entityPlayer == null || Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer3) > n || Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer3) >= Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer)) {
                    continue;
                }
                entityPlayer2 = entityPlayer3;
            }
        }
        return entityPlayer2;
    }
    
    public static EntityPlayer Method6644() {
        final List playerEntities = Class1744.Field16007.world.playerEntities;
        Entity entity = null;
        for (final EntityPlayer entityPlayer : playerEntities) {
            if (Class394.Method1949((Entity)entityPlayer)) {
                continue;
            }
            if (entity == null) {
                entity = (Entity)entityPlayer;
            }
            else {
                if (Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer) >= Class1744.Field16007.player.getDistanceSq(entity)) {
                    continue;
                }
                entity = (Entity)entityPlayer;
            }
        }
        return (EntityPlayer)entity;
    }
    
    public static double Method6645(final EntityPlayer entityPlayer) {
        return entityPlayer.getPositionVector().y + entityPlayer.getEyeHeight();
    }
    
    public static EntityPlayer Method6646(final double n) {
        final ArrayList<Entity> list = new ArrayList<Entity>();
        for (final EntityPlayer e : Class1744.Field16007.world.playerEntities) {
            if (Class394.Method1949((Entity)e)) {
                continue;
            }
            if (Class1744.Field16007.player.getDistance((Entity)e) > n) {
                continue;
            }
            list.add((Entity)e);
        }
        final EntityPlayer entityPlayer = null;
        final Vec3d getPositionEyes = Class1744.Field16007.player.getPositionEyes(Class1744.Field16007.getRenderPartialTicks());
        final Vec3d getLook = Class1744.Field16007.player.getLook(Class1744.Field16007.getRenderPartialTicks());
        final int n2 = 2;
        final int n3 = 0;
        if (n3 >= (int)n) {
            return entityPlayer;
        }
        int n4 = n2;
        while (true) {
            final Iterator<Entity> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                final AxisAlignedBB getEntityBoundingBox = ((EntityPlayer)iterator2.next()).getEntityBoundingBox();
                final double n5 = getPositionEyes.x + getLook.x * n3 + getLook.x / n4;
                final double n6 = getPositionEyes.y + getLook.y * n3 + getLook.y / n4;
                final double n7 = getPositionEyes.z + getLook.z * n3 + getLook.z / n4;
                if (getEntityBoundingBox.maxY >= n6 && getEntityBoundingBox.minY <= n6 && getEntityBoundingBox.maxX >= n5 && getEntityBoundingBox.minX <= n5 && getEntityBoundingBox.maxZ >= n7 && getEntityBoundingBox.minZ <= n7) {
                    continue;
                }
            }
            --n4;
        }
    }
    
    public static float Method6647() {
        return Class1744.Field16007.player.getHealth() + Class1744.Field16007.player.getAbsorptionAmount();
    }
    
    public static void Method6648(Vec3d ZERO) {
        final double abs = Math.abs(ZERO.x - Class1744.Field16007.player.posX);
        final double abs2 = Math.abs(ZERO.z - Class1744.Field16007.player.posZ);
        if (abs <= Double.longBitsToDouble(4591870180066957722L) && abs2 <= Double.longBitsToDouble(4591870180066957722L)) {
            ZERO = Vec3d.ZERO;
        }
        else {
            double longBitsToDouble = Double.longBitsToDouble(-4611686018427387904L);
            double longBitsToDouble2 = Double.longBitsToDouble(-4611686018427387904L);
            final int n = (Class1744.Field16007.player.posX < 0.0) ? -1 : 1;
            final int n2 = (Class1744.Field16007.player.posZ < 0.0) ? -1 : 1;
            if (Class1036.Method4204(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY - 1.0, Class1744.Field16007.player.posZ) instanceof BlockAir) {
                if (Math.abs(Class1744.Field16007.player.posX % 1.0) * Double.longBitsToDouble(4636737291354636288L) <= Double.longBitsToDouble((long)1316183906 ^ 0x403E00004E735F62L)) {
                    longBitsToDouble = Math.round(Class1744.Field16007.player.posX - Double.longBitsToDouble(4599075939470750515L) * n) + Double.longBitsToDouble((long)187500139 ^ 0x3FE000000B2D066BL) * -n;
                }
                else if (Math.abs(Class1744.Field16007.player.posX % 1.0) * Double.longBitsToDouble(4636737291354636288L) >= Double.longBitsToDouble((long)247576963 ^ 0x405180000EC1B983L)) {
                    longBitsToDouble = Math.round(Class1744.Field16007.player.posX + Double.longBitsToDouble((long)1853836329 ^ 0x3FD333335D4C7F1AL) * n) - Double.longBitsToDouble(4602678819172646912L) * -n;
                }
                if (Math.abs(Class1744.Field16007.player.posZ % 1.0) * Double.longBitsToDouble(4636737291354636288L) <= Double.longBitsToDouble(4629137466983448576L)) {
                    longBitsToDouble2 = Math.round(Class1744.Field16007.player.posZ - Double.longBitsToDouble(4599075939470750515L) * n2) + Double.longBitsToDouble(4602678819172646912L) * -n2;
                }
                else if (Math.abs(Class1744.Field16007.player.posZ % 1.0) * Double.longBitsToDouble(4636737291354636288L) >= Double.longBitsToDouble(4634626229029306368L)) {
                    longBitsToDouble2 = Math.round(Class1744.Field16007.player.posZ + Double.longBitsToDouble(4599075939470750515L) * n2) - Double.longBitsToDouble((long)746340084 ^ 0x3FE000002C7C3EF4L) * -n2;
                }
            }
            Double.compare(longBitsToDouble, Double.longBitsToDouble((long)898096542 ^ 0xC00000003587DD9EL));
            double posX;
            if (Class1744.Field16007.player.posX > Math.round(Class1744.Field16007.player.posX)) {
                posX = Math.round(Class1744.Field16007.player.posX) + Double.longBitsToDouble((long)1211057283 ^ 0x3FE00000482F4483L);
            }
            else if (Class1744.Field16007.player.posX < Math.round(Class1744.Field16007.player.posX)) {
                posX = Math.round(Class1744.Field16007.player.posX) - Double.longBitsToDouble((long)1952656241 ^ 0x3FE0000074632B71L);
            }
            else {
                posX = Class1744.Field16007.player.posX;
            }
            Double.compare(longBitsToDouble2, Double.longBitsToDouble((long)1138608152 ^ 0xC000000043DDC818L));
            double posZ;
            if (Class1744.Field16007.player.posZ > Math.round(Class1744.Field16007.player.posZ)) {
                posZ = Math.round(Class1744.Field16007.player.posZ) + Double.longBitsToDouble((long)1345364376 ^ 0x3FE000005030A198L);
            }
            else if (Class1744.Field16007.player.posZ < Math.round(Class1744.Field16007.player.posZ)) {
                posZ = Math.round(Class1744.Field16007.player.posZ) - Double.longBitsToDouble((long)190426707 ^ 0x3FE000000B59AE53L);
            }
            else {
                posZ = Class1744.Field16007.player.posZ;
            }
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$Position(posX, Class1744.Field16007.player.posY, posZ, true));
            Class1744.Field16007.player.setPosition(posX, Class1744.Field16007.player.posY, posZ);
        }
    }
    
    public static double[] Method6649(final double n) {
        float n2 = Class1744.Field16007.player.movementInput.moveForward;
        float moveStrafe = Class1744.Field16007.player.movementInput.moveStrafe;
        float n3 = Class1744.Field16007.player.prevRotationYaw + (Class1744.Field16007.player.rotationYaw - Class1744.Field16007.player.prevRotationYaw) * Class1744.Field16007.getRenderPartialTicks();
        if (n2 != 0.0f) {
            if (moveStrafe > 0.0f) {
                n3 += ((n2 > 0.0f) ? -45 : 45);
            }
            else if (moveStrafe < 0.0f) {
                n3 += ((n2 > 0.0f) ? 45 : -45);
            }
            moveStrafe = 0.0f;
            if (n2 > 0.0f) {
                n2 = 1.0f;
            }
            else if (n2 < 0.0f) {
                n2 = Float.intBitsToFloat(-1082130432);
            }
        }
        final double sin = Math.sin(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        final double cos = Math.cos(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        return new double[] { n2 * n * cos + moveStrafe * n * sin, n2 * n * sin - moveStrafe * n * cos };
    }
    
    public static double Method6650() {
        double longBitsToDouble = Double.longBitsToDouble((long)955732261 ^ 0x3FD2631FB2FE53FBL);
        if (Class1744.Field16007.player != null && Class1744.Field16007.player.isPotionActive(Potion.getPotionById(1))) {
            longBitsToDouble *= 1.0 + Double.longBitsToDouble((long)268705110 ^ 0x3FC99999899D84CCL) * (Class1744.Field16007.player.getActivePotionEffect(Potion.getPotionById(1)).getAmplifier() + 1);
        }
        return longBitsToDouble;
    }
    
    public static boolean Method6651(final EntityLivingBase entityLivingBase) {
        return entityLivingBase.moveForward != 0.0f || entityLivingBase.moveStrafing != 0.0f;
    }
    
    public static void Method6652(final EntityLivingBase entityLivingBase, final double n) {
        final double[] method6649 = Method6649(n);
        entityLivingBase.motionX = method6649[0];
        entityLivingBase.motionZ = method6649[1];
    }
    
    public static boolean Method6653() {
        return Class1744.Field16007.player != null && Class1744.Field16007.player.getHeldItemMainhand().getItem() instanceof ItemFood && Class1744.Field16007.player.isHandActive() && Class1744.Field16007.player.getActiveHand().equals((Object)EnumHand.MAIN_HAND);
    }
    
    public static boolean Method6654() {
        return Class1744.Field16007.player != null && Class1744.Field16007.player.getHeldItemOffhand().getItem() instanceof ItemFood && Class1744.Field16007.player.isHandActive() && Class1744.Field16007.player.getActiveHand().equals((Object)EnumHand.OFF_HAND);
    }
    
    public static boolean Method6655() {
        return Class1744.Field16007.getRenderViewEntity() == Class1744.Field16007.player;
    }
    
    public static boolean Method6656(final BlockPos blockPos) {
        return Class1744.Field16007.player != null && Class1744.Field16007.world.rayTraceBlocks(new Vec3d(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Class1744.Field16007.player.getEyeHeight(), Class1744.Field16007.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ()), false, true, false) == null;
    }
    
    public static BlockPos Method6657() {
        return new BlockPos(Math.floor(Class1744.Field16007.player.posX), Math.floor(Class1744.Field16007.player.posY), Math.floor(Class1744.Field16007.player.posZ));
    }
    
    public static BlockPos Method6658(final EntityPlayer entityPlayer) {
        return new BlockPos(Math.floor(entityPlayer.posX), Math.floor(entityPlayer.posY), Math.floor(entityPlayer.posZ));
    }
    
    public static BlockPos Method6659(final Entity entity) {
        return new BlockPos(Math.floor(entity.posX), Math.floor(entity.posY), Math.floor(entity.posZ));
    }
    
    public static int Method6660(final Item item) {
        if (Class1744.Field16007.player == null) {
            return 0;
        }
        for (int i = 0; i < Class1744.Field16007.player.inventoryContainer.getInventory().size(); ++i) {}
        return -1;
    }
    
    public static int Method6661(final Item item) {
        if (Class1744.Field16007.player == null) {
            return 0;
        }
        for (int i = Class1744.Field16007.player.inventoryContainer.getInventory().size() - 1; i > 0; --i) {
            if (i != 5 && i != 6 && i != 7) {
                if (i != 8) {
                    final ItemStack itemStack = (ItemStack)Class1744.Field16007.player.inventoryContainer.getInventory().get(i);
                    if (!itemStack.isEmpty()) {
                        if (itemStack.getItem() == item) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public static void Method6662(final float lastReportedPitch, final float lastReportedYaw) {
        final boolean isSprinting = Class1744.Field16007.player.isSprinting();
        if (isSprinting != Class1744.Field16007.player.serverSprintState) {
            if (isSprinting) {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction$Action.START_SPRINTING));
            }
            else {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction$Action.STOP_SPRINTING));
            }
            Class1744.Field16007.player.serverSprintState = isSprinting;
        }
        final boolean isSneaking = Class1744.Field16007.player.isSneaking();
        if (isSneaking != Class1744.Field16007.player.serverSneakState) {
            if (isSneaking) {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction$Action.START_SNEAKING));
            }
            else {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction$Action.STOP_SNEAKING));
            }
            Class1744.Field16007.player.serverSneakState = isSneaking;
        }
        if (Method6655()) {
            final AxisAlignedBB getEntityBoundingBox = Class1744.Field16007.player.getEntityBoundingBox();
            final double n = Class1744.Field16007.player.posX - Class1744.Field16007.player.lastReportedPosX;
            final double n2 = getEntityBoundingBox.minY - Class1744.Field16007.player.lastReportedPosY;
            final double n3 = Class1744.Field16007.player.posZ - Class1744.Field16007.player.lastReportedPosZ;
            final double n4 = lastReportedYaw - Class1744.Field16007.player.lastReportedYaw;
            final double n5 = lastReportedPitch - Class1744.Field16007.player.lastReportedPitch;
            final EntityPlayerSP player = Class1744.Field16007.player;
            ++player.positionUpdateTicks;
            final boolean b = n * n + n2 * n2 + n3 * n3 > Double.longBitsToDouble((long)1598423075 ^ 0x3F4D7DBF1739CBB1L) || Class1744.Field16007.player.positionUpdateTicks >= 20;
            final boolean b2 = n4 != 0.0 || n5 != 0.0;
            if (Class1744.Field16007.player.isRiding()) {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$PositionRotation(Class1744.Field16007.player.motionX, Double.longBitsToDouble(-4571373524106608640L), Class1744.Field16007.player.motionZ, lastReportedYaw, lastReportedPitch, Class1744.Field16007.player.onGround));
            }
            else {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer$PositionRotation(Class1744.Field16007.player.posX, getEntityBoundingBox.minY, Class1744.Field16007.player.posZ, lastReportedYaw, lastReportedPitch, Class1744.Field16007.player.onGround));
            }
            Class1744.Field16007.player.lastReportedPosX = Class1744.Field16007.player.posX;
            Class1744.Field16007.player.lastReportedPosY = getEntityBoundingBox.minY;
            Class1744.Field16007.player.lastReportedPosZ = Class1744.Field16007.player.posZ;
            Class1744.Field16007.player.positionUpdateTicks = 0;
            Class1744.Field16007.player.lastReportedYaw = lastReportedYaw;
            Class1744.Field16007.player.lastReportedPitch = lastReportedPitch;
            Class1744.Field16007.player.prevOnGround = Class1744.Field16007.player.onGround;
            Class1744.Field16007.player.autoJumpEnabled = Class1744.Field16007.player.mc.gameSettings.autoJump;
        }
    }
    
    public static boolean Method6663() {
        final BlockPos method6657 = Method6657();
        for (final BlockPos blockPos : new BlockPos[] { method6657.down(), method6657.up().up(), method6657.north(), method6657.south(), method6657.east(), method6657.west(), method6657.north().up(), method6657.south().up(), method6657.east().up(), method6657.west().up() }) {
            if (Class1744.Field16007.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN && Class1744.Field16007.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean Method6664(final Entity entity) {
        final BlockPos method6659 = Method6659(entity);
        for (final BlockPos blockPos : new BlockPos[] { method6659.up().up(), method6659.north(), method6659.south(), method6659.east(), method6659.west(), method6659.north().up(), method6659.south().up(), method6659.east().up(), method6659.west().up() }) {
            if (Class1744.Field16007.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN && Class1744.Field16007.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK) {
                return false;
            }
        }
        return true;
    }
    
    private static void Method6665(final EntityOtherPlayerMP entityOtherPlayerMP) {
        Class1744.Field16008.remove(entityOtherPlayerMP.getEntityId());
        entityOtherPlayerMP.isDead = true;
        if (Class1744.Field16007.world != null) {
            Class1744.Field16007.world.removeEntity((Entity)entityOtherPlayerMP);
        }
    }
    
    static {
        Field16007 = Minecraft.getMinecraft();
        Field16008 = new HashMap();
    }
}
