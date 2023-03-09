//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemFood
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.network.play.client.CPacketPlayer$PositionRotation
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;
import lavahack.client.Class1036;
import lavahack.client.Class1306;
import lavahack.client.Class1517;
import lavahack.client.Class394;
import net.minecraft.block.BlockAir;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class1744 {
    private static final Minecraft Field16007 = Minecraft.getMinecraft();
    public static final Map Field16008 = new HashMap();
    private String Field16009 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method6632(Class1517 class1517) {
        switch (Class1306.Field13969[class1517.ordinal()]) {
            case 1: {
                Class1744.Field16007.player.swingArm(EnumHand.MAIN_HAND);
                return;
            }
            case 2: {
                Class1744.Field16007.player.swingArm(EnumHand.OFF_HAND);
                return;
            }
            case 3: {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketAnimation(Class1744.Field16007.player.getHeldItemMainhand().getItem().equals(Items.END_CRYSTAL) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND));
                return;
            }
        }
    }

    public static void Method6633(int n) {
        if (n > 0 && n != 5) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY, Class1744.Field16007.player.posZ, true));
        }
        if (n > 1) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble((long)737400028 ^ 0x3FDAE1478BF3D556L), Class1744.Field16007.player.posZ, true));
        }
        if (n > 2) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble(4604959441848497898L), Class1744.Field16007.player.posZ, true));
        }
        if (n > 3) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble((long)928711823 ^ 0x3FF00578D772870BL), Class1744.Field16007.player.posZ, true));
        }
        if (n <= 4) return;
        Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + Double.longBitsToDouble(4607930508405681474L), Class1744.Field16007.player.posZ, true));
    }

    public static EntityOtherPlayerMP Method6634(GameProfile gameProfile) {
        return Class1744.Method6635(gameProfile, EntityOtherPlayerMP::new);
    }

    public static EntityOtherPlayerMP Method6635(GameProfile gameProfile, BiFunction biFunction) {
        EntityOtherPlayerMP entityOtherPlayerMP = Class1744.Method6636(gameProfile, biFunction);
        int n = -1000;
        while (true) {
            if (!Field16008.containsKey(n) && Class1744.Field16007.world.getEntityByID(n) == null) {
                Field16008.put(n, entityOtherPlayerMP);
                Class1744.Field16007.world.addEntityToWorld(n, (Entity)entityOtherPlayerMP);
                return entityOtherPlayerMP;
            }
            n = ThreadLocalRandom.current().nextInt(-100000, -100);
        }
    }

    public static EntityOtherPlayerMP Method6636(GameProfile gameProfile, BiFunction biFunction) {
        EntityOtherPlayerMP entityOtherPlayerMP = (EntityOtherPlayerMP)biFunction.apply(Class1744.Field16007.world, gameProfile);
        entityOtherPlayerMP.inventory = Class1744.Field16007.player.inventory;
        entityOtherPlayerMP.inventoryContainer = Class1744.Field16007.player.inventoryContainer;
        entityOtherPlayerMP.setPositionAndRotation(Class1744.Field16007.player.posX, Class1744.Field16007.player.getEntityBoundingBox().minY, Class1744.Field16007.player.posZ, Class1744.Field16007.player.rotationYaw, Class1744.Field16007.player.rotationPitch);
        entityOtherPlayerMP.rotationYawHead = Class1744.Field16007.player.rotationYawHead;
        entityOtherPlayerMP.onGround = Class1744.Field16007.player.onGround;
        entityOtherPlayerMP.setSneaking(Class1744.Field16007.player.isSneaking());
        entityOtherPlayerMP.setHealth(Class1744.Field16007.player.getHealth());
        entityOtherPlayerMP.setAbsorptionAmount(Class1744.Field16007.player.getAbsorptionAmount());
        Iterator iterator = Class1744.Field16007.player.getActivePotionEffects().iterator();
        while (iterator.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)iterator.next();
            entityOtherPlayerMP.addPotionEffect(potionEffect);
        }
        return entityOtherPlayerMP;
    }

    public static void Method6637(EntityOtherPlayerMP entityOtherPlayerMP) {
        Field16007.addScheduledTask(() -> Class1744.Method6665(entityOtherPlayerMP));
    }

    public static BlockPos Method6638() {
        return new BlockPos(Math.floor(Class1744.Field16007.player.posX), Math.floor(Class1744.Field16007.player.posY), Math.floor(Class1744.Field16007.player.posZ));
    }

    public static BlockPos Method6639(EntityPlayer entityPlayer) {
        return new BlockPos(Math.floor(entityPlayer.posX), Math.floor(entityPlayer.posY), Math.floor(entityPlayer.posZ));
    }

    public static List Method6640(double d) {
        return Class1744.Method6641(Class1744.Field16007.player.getPositionVector(), d);
    }

    public static List Method6641(Vec3d vec3d, double d) {
        return Class1744.Method6642(EntityPlayer.class, vec3d, d);
    }

    public static List Method6642(Class clazz, Vec3d vec3d, double d) {
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        Iterator iterator = Class1744.Field16007.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!((double)entity.getDistance((Entity)Class1744.Field16007.player) <= d)) continue;
            arrayList.add(entity);
        }
        return arrayList;
    }

    public static EntityPlayer Method6643(double d, EntityPlayer entityPlayer) {
        d *= d;
        List list = Class1744.Field16007.world.playerEntities;
        EntityPlayer entityPlayer2 = null;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer3 = (EntityPlayer)iterator.next();
            if (Class394.Method1949((Entity)entityPlayer3)) continue;
            if (entityPlayer == null && Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer3) <= d) {
                entityPlayer2 = entityPlayer3;
                continue;
            }
            if (entityPlayer == null || !(Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer3) <= d) || !(Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer3) < Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer))) continue;
            entityPlayer2 = entityPlayer3;
        }
        return entityPlayer2;
    }

    public static EntityPlayer Method6644() {
        List list = Class1744.Field16007.world.playerEntities;
        EntityPlayer entityPlayer = null;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer2 = (EntityPlayer)iterator.next();
            if (Class394.Method1949((Entity)entityPlayer2)) continue;
            if (entityPlayer == null) {
                entityPlayer = entityPlayer2;
                continue;
            }
            if (!(Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer2) < Class1744.Field16007.player.getDistanceSq((Entity)entityPlayer))) continue;
            entityPlayer = entityPlayer2;
        }
        return entityPlayer;
    }

    public static double Method6645(EntityPlayer entityPlayer) {
        return entityPlayer.getPositionVector().y + (double)entityPlayer.getEyeHeight();
    }

    public static EntityPlayer Method6646(double d) {
        EntityPlayer entityPlayer2;
        ArrayList<EntityPlayer> arrayList = new ArrayList<EntityPlayer>();
        for (EntityPlayer entityPlayer2 : Class1744.Field16007.world.playerEntities) {
            if (Class394.Method1949((Entity)entityPlayer2) || !((double)Class1744.Field16007.player.getDistance((Entity)entityPlayer2) <= d)) continue;
            arrayList.add(entityPlayer2);
        }
        EntityPlayer entityPlayer3 = null;
        entityPlayer2 = Class1744.Field16007.player.getPositionEyes(Field16007.getRenderPartialTicks());
        Vec3d vec3d = Class1744.Field16007.player.getLook(Field16007.getRenderPartialTicks());
        int n = 2;
        int n2 = 0;
        if (n2 >= (int)d) return entityPlayer3;
        int n3 = n;
        while (true) {
            for (EntityPlayer entityPlayer4 : arrayList) {
                AxisAlignedBB axisAlignedBB = entityPlayer4.getEntityBoundingBox();
                double d2 = entityPlayer2.x + vec3d.x * (double)n2 + vec3d.x / (double)n3;
                double d3 = entityPlayer2.y + vec3d.y * (double)n2 + vec3d.y / (double)n3;
                double d4 = entityPlayer2.z + vec3d.z * (double)n2 + vec3d.z / (double)n3;
                if (!(axisAlignedBB.maxY >= d3) || !(axisAlignedBB.minY <= d3) || !(axisAlignedBB.maxX >= d2) || !(axisAlignedBB.minX <= d2) || !(axisAlignedBB.maxZ >= d4) || !(axisAlignedBB.minZ <= d4)) continue;
                entityPlayer3 = entityPlayer4;
            }
            --n3;
        }
    }

    public static float Method6647() {
        return Class1744.Field16007.player.getHealth() + Class1744.Field16007.player.getAbsorptionAmount();
    }

    public static void Method6648(Vec3d vec3d) {
        int n;
        double d = Math.abs(vec3d.x - Class1744.Field16007.player.posX);
        double d2 = Math.abs(vec3d.z - Class1744.Field16007.player.posZ);
        if (d <= Double.longBitsToDouble(4591870180066957722L) && d2 <= Double.longBitsToDouble(4591870180066957722L)) {
            vec3d = Vec3d.ZERO;
            return;
        }
        double d3 = Double.longBitsToDouble(-4611686018427387904L);
        double d4 = Double.longBitsToDouble(-4611686018427387904L);
        int n2 = Class1744.Field16007.player.posX < 0.0 ? -1 : 1;
        int n3 = n = Class1744.Field16007.player.posZ < 0.0 ? -1 : 1;
        if (Class1036.Method4204(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY - 1.0, Class1744.Field16007.player.posZ) instanceof BlockAir) {
            if (Math.abs(Class1744.Field16007.player.posX % 1.0) * Double.longBitsToDouble(4636737291354636288L) <= Double.longBitsToDouble((long)1316183906 ^ 0x403E00004E735F62L)) {
                d3 = (double)Math.round(Class1744.Field16007.player.posX - Double.longBitsToDouble(0x3FD3333333333333L) * (double)n2) + Double.longBitsToDouble((long)187500139 ^ 0x3FE000000B2D066BL) * (double)(-n2);
            } else if (Math.abs(Class1744.Field16007.player.posX % 1.0) * Double.longBitsToDouble(4636737291354636288L) >= Double.longBitsToDouble((long)247576963 ^ 0x405180000EC1B983L)) {
                d3 = (double)Math.round(Class1744.Field16007.player.posX + Double.longBitsToDouble((long)1853836329 ^ 0x3FD333335D4C7F1AL) * (double)n2) - Double.longBitsToDouble(4602678819172646912L) * (double)(-n2);
            }
            if (Math.abs(Class1744.Field16007.player.posZ % 1.0) * Double.longBitsToDouble(4636737291354636288L) <= Double.longBitsToDouble(4629137466983448576L)) {
                d4 = (double)Math.round(Class1744.Field16007.player.posZ - Double.longBitsToDouble(0x3FD3333333333333L) * (double)n) + Double.longBitsToDouble(4602678819172646912L) * (double)(-n);
            } else if (Math.abs(Class1744.Field16007.player.posZ % 1.0) * Double.longBitsToDouble(4636737291354636288L) >= Double.longBitsToDouble(4634626229029306368L)) {
                d4 = (double)Math.round(Class1744.Field16007.player.posZ + Double.longBitsToDouble(0x3FD3333333333333L) * (double)n) - Double.longBitsToDouble((long)746340084 ^ 0x3FE000002C7C3EF4L) * (double)(-n);
            }
        }
        Double.compare(d3, Double.longBitsToDouble((long)898096542 ^ 0xC00000003587DD9EL));
        d3 = Class1744.Field16007.player.posX > (double)Math.round(Class1744.Field16007.player.posX) ? (double)Math.round(Class1744.Field16007.player.posX) + Double.longBitsToDouble((long)1211057283 ^ 0x3FE00000482F4483L) : (Class1744.Field16007.player.posX < (double)Math.round(Class1744.Field16007.player.posX) ? (double)Math.round(Class1744.Field16007.player.posX) - Double.longBitsToDouble((long)1952656241 ^ 0x3FE0000074632B71L) : Class1744.Field16007.player.posX);
        Double.compare(d4, Double.longBitsToDouble((long)1138608152 ^ 0xC000000043DDC818L));
        d4 = Class1744.Field16007.player.posZ > (double)Math.round(Class1744.Field16007.player.posZ) ? (double)Math.round(Class1744.Field16007.player.posZ) + Double.longBitsToDouble((long)1345364376 ^ 0x3FE000005030A198L) : (Class1744.Field16007.player.posZ < (double)Math.round(Class1744.Field16007.player.posZ) ? (double)Math.round(Class1744.Field16007.player.posZ) - Double.longBitsToDouble((long)190426707 ^ 0x3FE000000B59AE53L) : Class1744.Field16007.player.posZ);
        Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d3, Class1744.Field16007.player.posY, d4, true));
        Class1744.Field16007.player.setPosition(d3, Class1744.Field16007.player.posY, d4);
    }

    public static double[] Method6649(double d) {
        float f = Class1744.Field16007.player.movementInput.moveForward;
        float f2 = Class1744.Field16007.player.movementInput.moveStrafe;
        float f3 = Class1744.Field16007.player.prevRotationYaw + (Class1744.Field16007.player.rotationYaw - Class1744.Field16007.player.prevRotationYaw) * Field16007.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? -45 : 45);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? 45 : -45);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat(-1082130432);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        return new double[]{d4, d5};
    }

    public static double Method6650() {
        double d = Double.longBitsToDouble((long)955732261 ^ 0x3FD2631FB2FE53FBL);
        if (Class1744.Field16007.player == null) return d;
        if (!Class1744.Field16007.player.isPotionActive(Potion.getPotionById((int)1))) return d;
        int n = Class1744.Field16007.player.getActivePotionEffect(Potion.getPotionById((int)1)).getAmplifier();
        d *= 1.0 + Double.longBitsToDouble((long)268705110 ^ 0x3FC99999899D84CCL) * (double)(n + 1);
        return d;
    }

    public static boolean Method6651(EntityLivingBase entityLivingBase) {
        if (entityLivingBase.moveForward != 0.0f) return true;
        if (entityLivingBase.moveStrafing != 0.0f) return true;
        return false;
    }

    public static void Method6652(EntityLivingBase entityLivingBase, double d) {
        double[] dArray = Class1744.Method6649(d);
        entityLivingBase.motionX = dArray[0];
        entityLivingBase.motionZ = dArray[1];
    }

    public static boolean Method6653() {
        if (Class1744.Field16007.player == null) return false;
        if (!(Class1744.Field16007.player.getHeldItemMainhand().getItem() instanceof ItemFood)) return false;
        if (!Class1744.Field16007.player.isHandActive()) return false;
        if (!Class1744.Field16007.player.getActiveHand().equals((Object)EnumHand.MAIN_HAND)) return false;
        return true;
    }

    public static boolean Method6654() {
        if (Class1744.Field16007.player == null) return false;
        if (!(Class1744.Field16007.player.getHeldItemOffhand().getItem() instanceof ItemFood)) return false;
        if (!Class1744.Field16007.player.isHandActive()) return false;
        if (!Class1744.Field16007.player.getActiveHand().equals((Object)EnumHand.OFF_HAND)) return false;
        return true;
    }

    public static boolean Method6655() {
        if (Field16007.getRenderViewEntity() != Class1744.Field16007.player) return false;
        return true;
    }

    public static boolean Method6656(BlockPos blockPos) {
        if (Class1744.Field16007.player == null) {
            return false;
        }
        if (Class1744.Field16007.world.rayTraceBlocks(new Vec3d(Class1744.Field16007.player.posX, Class1744.Field16007.player.posY + (double)Class1744.Field16007.player.getEyeHeight(), Class1744.Field16007.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ()), false, true, false) != null) return false;
        return true;
    }

    public static BlockPos Method6657() {
        return new BlockPos(Math.floor(Class1744.Field16007.player.posX), Math.floor(Class1744.Field16007.player.posY), Math.floor(Class1744.Field16007.player.posZ));
    }

    public static BlockPos Method6658(EntityPlayer entityPlayer) {
        return new BlockPos(Math.floor(entityPlayer.posX), Math.floor(entityPlayer.posY), Math.floor(entityPlayer.posZ));
    }

    public static BlockPos Method6659(Entity entity) {
        return new BlockPos(Math.floor(entity.posX), Math.floor(entity.posY), Math.floor(entity.posZ));
    }

    public static int Method6660(Item item) {
        if (Class1744.Field16007.player == null) {
            return 0;
        }
        int n = 0;
        while (n < Class1744.Field16007.player.inventoryContainer.getInventory().size()) {
            ++n;
        }
        return -1;
    }

    public static int Method6661(Item item) {
        if (Class1744.Field16007.player == null) {
            return 0;
        }
        int n = Class1744.Field16007.player.inventoryContainer.getInventory().size() - 1;
        while (n > 0) {
            ItemStack itemStack;
            if (n != 5 && n != 6 && n != 7 && n != 8 && !(itemStack = (ItemStack)Class1744.Field16007.player.inventoryContainer.getInventory().get(n)).isEmpty() && itemStack.getItem() == item) {
                return n;
            }
            --n;
        }
        return -1;
    }

    public static void Method6662(float f, float f2) {
        boolean bl;
        boolean bl2;
        boolean bl3 = Class1744.Field16007.player.isSprinting();
        if (bl3 != Class1744.Field16007.player.serverSprintState) {
            if (bl3) {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction.Action.START_SPRINTING));
            } else {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction.Action.STOP_SPRINTING));
            }
            Class1744.Field16007.player.serverSprintState = bl3;
        }
        if ((bl2 = Class1744.Field16007.player.isSneaking()) != Class1744.Field16007.player.serverSneakState) {
            if (bl2) {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction.Action.START_SNEAKING));
            } else {
                Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)Class1744.Field16007.player, CPacketEntityAction.Action.STOP_SNEAKING));
            }
            Class1744.Field16007.player.serverSneakState = bl2;
        }
        if (!Class1744.Method6655()) return;
        float f3 = f;
        float f4 = f2;
        AxisAlignedBB axisAlignedBB = Class1744.Field16007.player.getEntityBoundingBox();
        double d = Class1744.Field16007.player.posX - Class1744.Field16007.player.lastReportedPosX;
        double d2 = axisAlignedBB.minY - Class1744.Field16007.player.lastReportedPosY;
        double d3 = Class1744.Field16007.player.posZ - Class1744.Field16007.player.lastReportedPosZ;
        double d4 = f4 - Class1744.Field16007.player.lastReportedYaw;
        double d5 = f3 - Class1744.Field16007.player.lastReportedPitch;
        ++Class1744.Field16007.player.positionUpdateTicks;
        boolean bl4 = d * d + d2 * d2 + d3 * d3 > Double.longBitsToDouble((long)1598423075 ^ 0x3F4D7DBF1739CBB1L) || Class1744.Field16007.player.positionUpdateTicks >= 20;
        boolean bl5 = bl = d4 != 0.0 || d5 != 0.0;
        if (Class1744.Field16007.player.isRiding()) {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(Class1744.Field16007.player.motionX, Double.longBitsToDouble(-4571373524106608640L), Class1744.Field16007.player.motionZ, f4, f3, Class1744.Field16007.player.onGround));
            bl4 = false;
        } else {
            Class1744.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(Class1744.Field16007.player.posX, axisAlignedBB.minY, Class1744.Field16007.player.posZ, f4, f3, Class1744.Field16007.player.onGround));
        }
        Class1744.Field16007.player.lastReportedPosX = Class1744.Field16007.player.posX;
        Class1744.Field16007.player.lastReportedPosY = axisAlignedBB.minY;
        Class1744.Field16007.player.lastReportedPosZ = Class1744.Field16007.player.posZ;
        Class1744.Field16007.player.positionUpdateTicks = 0;
        Class1744.Field16007.player.lastReportedYaw = f4;
        Class1744.Field16007.player.lastReportedPitch = f3;
        Class1744.Field16007.player.prevOnGround = Class1744.Field16007.player.onGround;
        Class1744.Field16007.player.autoJumpEnabled = Class1744.Field16007.player.mc.gameSettings.autoJump;
    }

    public static boolean Method6663() {
        BlockPos[] blockPosArray;
        BlockPos blockPos = Class1744.Method6657();
        BlockPos[] blockPosArray2 = blockPosArray = new BlockPos[]{blockPos.down(), blockPos.up().up(), blockPos.north(), blockPos.south(), blockPos.east(), blockPos.west(), blockPos.north().up(), blockPos.south().up(), blockPos.east().up(), blockPos.west().up()};
        int n = blockPosArray2.length;
        int n2 = 0;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray2[n2];
            IBlockState iBlockState = Class1744.Field16007.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.OBSIDIAN && Class1744.Field16007.world.getBlockState(blockPos2).getBlock() != Blocks.BEDROCK) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public static boolean Method6664(Entity entity) {
        BlockPos[] blockPosArray;
        BlockPos blockPos = Class1744.Method6659(entity);
        BlockPos[] blockPosArray2 = blockPosArray = new BlockPos[]{blockPos.up().up(), blockPos.north(), blockPos.south(), blockPos.east(), blockPos.west(), blockPos.north().up(), blockPos.south().up(), blockPos.east().up(), blockPos.west().up()};
        int n = blockPosArray2.length;
        int n2 = 0;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray2[n2];
            IBlockState iBlockState = Class1744.Field16007.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.OBSIDIAN && Class1744.Field16007.world.getBlockState(blockPos2).getBlock() != Blocks.BEDROCK) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    private static void Method6665(EntityOtherPlayerMP entityOtherPlayerMP) {
        Field16008.remove(entityOtherPlayerMP.getEntityId());
        entityOtherPlayerMP.isDead = true;
        if (Class1744.Field16007.world == null) return;
        Class1744.Field16007.world.removeEntity((Entity)entityOtherPlayerMP);
    }
}

