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
import lavahack.client.EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$1;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
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

public class PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb {
    private static final Minecraft Field16007 = Minecraft.getMinecraft();
    public static final Map Field16008 = new HashMap();
    private String Field16009 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method6632(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        switch (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$1.Field13969[pzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.ordinal()]) {
            case 1: {
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.swingArm(EnumHand.MAIN_HAND);
                return;
            }
            case 2: {
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.swingArm(EnumHand.OFF_HAND);
                return;
            }
            case 3: {
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketAnimation(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getHeldItemMainhand().getItem().equals(Items.END_CRYSTAL) ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND));
                return;
            }
        }
    }

    public static void Method6633(int n) {
        if (n > 0 && n != ((int)9707363L ^ 0x941F66)) {
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ, ((int)-1781101348L ^ 0x95D68CDD) != 0));
        }
        if (n > (int)((long)577988922 ^ (long)577988923)) {
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY + Double.longBitsToDouble((long)737400028 ^ 0x3FDAE1478BF3D556L), PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ, ((int)1931105035L ^ 0x731A530A) != 0));
        }
        if (n > (int)((long)1796610862 ^ (long)1796610863) << 1) {
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY + Double.longBitsToDouble(0x467AE0F267B3A7B9L ^ 0x7992FAC4BFC65153L), PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ, ((int)928983115L ^ 0x375F284A) != 0));
        }
        if (n > ((int)324965741L ^ 0x135E956E)) {
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY + Double.longBitsToDouble((long)928711823 ^ 0x3FF00578D772870BL), PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ, ((int)1532221013L ^ 0x5B53D654) != 0));
        }
        if (n <= (int)((long)-2065540908 ^ (long)-2065540907) << 2) return;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY + Double.longBitsToDouble(0x652C30802541FAFFL ^ 0x5ADE98E20A7557BDL), PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ, ((int)1073436697L ^ 0x3FFB5818) != 0));
    }

    public static EntityOtherPlayerMP Method6634(GameProfile gameProfile) {
        return PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6635(gameProfile, EntityOtherPlayerMP::new);
    }

    public static EntityOtherPlayerMP Method6635(GameProfile gameProfile, BiFunction biFunction) {
        EntityOtherPlayerMP entityOtherPlayerMP = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6636(gameProfile, biFunction);
        int n = (int)2081878291L ^ 0x83E90D0B;
        while (true) {
            if (!Field16008.containsKey(n) && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.getEntityByID(n) == null) {
                Field16008.put(n, entityOtherPlayerMP);
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.addEntityToWorld(n, (Entity)entityOtherPlayerMP);
                return entityOtherPlayerMP;
            }
            n = ThreadLocalRandom.current().nextInt((int)((long)6523392 ^ (long)-6425760), (int)((long)1580606037 ^ (long)-1580606007));
        }
    }

    public static EntityOtherPlayerMP Method6636(GameProfile gameProfile, BiFunction biFunction) {
        EntityOtherPlayerMP entityOtherPlayerMP = (EntityOtherPlayerMP)biFunction.apply(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world, gameProfile);
        entityOtherPlayerMP.inventory = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.inventory;
        entityOtherPlayerMP.inventoryContainer = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.inventoryContainer;
        entityOtherPlayerMP.setPositionAndRotation(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getEntityBoundingBox().minY, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.rotationYaw, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.rotationPitch);
        entityOtherPlayerMP.rotationYawHead = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.rotationYawHead;
        entityOtherPlayerMP.onGround = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.onGround;
        entityOtherPlayerMP.setSneaking(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.isSneaking());
        entityOtherPlayerMP.setHealth(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getHealth());
        entityOtherPlayerMP.setAbsorptionAmount(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getAbsorptionAmount());
        Iterator iterator = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getActivePotionEffects().iterator();
        while (iterator.hasNext()) {
            PotionEffect potionEffect = (PotionEffect)iterator.next();
            entityOtherPlayerMP.addPotionEffect(potionEffect);
        }
        return entityOtherPlayerMP;
    }

    public static void Method6637(EntityOtherPlayerMP entityOtherPlayerMP) {
        Field16007.addScheduledTask(() -> PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6665(entityOtherPlayerMP));
    }

    public static BlockPos Method6638() {
        return new BlockPos(Math.floor(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX), Math.floor(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY), Math.floor(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ));
    }

    public static BlockPos Method6639(EntityPlayer entityPlayer) {
        return new BlockPos(Math.floor(entityPlayer.posX), Math.floor(entityPlayer.posY), Math.floor(entityPlayer.posZ));
    }

    public static List Method6640(double d) {
        return PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6641(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getPositionVector(), d);
    }

    public static List Method6641(Vec3d vec3d, double d) {
        return PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6642(EntityPlayer.class, vec3d, d);
    }

    public static List Method6642(Class clazz, Vec3d vec3d, double d) {
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        Iterator iterator = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.loadedEntityList.iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (!((double)entity.getDistance((Entity)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player) <= d)) continue;
            arrayList.add(entity);
        }
        return arrayList;
    }

    public static EntityPlayer Method6643(double d, EntityPlayer entityPlayer) {
        d *= d;
        List list = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.playerEntities;
        EntityPlayer entityPlayer2 = null;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer3 = (EntityPlayer)iterator.next();
            if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1949((Entity)entityPlayer3)) continue;
            if (entityPlayer == null && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getDistanceSq((Entity)entityPlayer3) <= d) {
                entityPlayer2 = entityPlayer3;
                continue;
            }
            if (entityPlayer == null || !(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getDistanceSq((Entity)entityPlayer3) <= d) || !(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getDistanceSq((Entity)entityPlayer3) < PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getDistanceSq((Entity)entityPlayer))) continue;
            entityPlayer2 = entityPlayer3;
        }
        return entityPlayer2;
    }

    public static EntityPlayer Method6644() {
        List list = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.playerEntities;
        EntityPlayer entityPlayer = null;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EntityPlayer entityPlayer2 = (EntityPlayer)iterator.next();
            if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1949((Entity)entityPlayer2)) continue;
            if (entityPlayer == null) {
                entityPlayer = entityPlayer2;
                continue;
            }
            if (!(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getDistanceSq((Entity)entityPlayer2) < PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getDistanceSq((Entity)entityPlayer))) continue;
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
        for (EntityPlayer entityPlayer2 : PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.playerEntities) {
            if (EgTcEaCfamrkxSs6F0wDOtNxAAaDK4bn.Method1949((Entity)entityPlayer2) || !((double)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getDistance((Entity)entityPlayer2) <= d)) continue;
            arrayList.add(entityPlayer2);
        }
        EntityPlayer entityPlayer3 = null;
        entityPlayer2 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getPositionEyes(Field16007.getRenderPartialTicks());
        Vec3d vec3d = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getLook(Field16007.getRenderPartialTicks());
        int n = ((int)1602890050L ^ 0x5F8A2943) << 1;
        int n2 = (int)((long)1827199101 ^ (long)1827199101);
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
        return PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getHealth() + PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getAbsorptionAmount();
    }

    public static void Method6648(Vec3d vec3d) {
        int n;
        double d = Math.abs(vec3d.x - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX);
        double d2 = Math.abs(vec3d.z - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ);
        if (d <= Double.longBitsToDouble(0xA37F931B598555AAL ^ 0x9CC60A82C01CCC30L) && d2 <= Double.longBitsToDouble(0x68C03D0406C76CEEL ^ 0x5779A49D9F5EF574L)) {
            vec3d = Vec3d.ZERO;
            return;
        }
        double d3 = Double.longBitsToDouble(0x9BB49D64B05BEBL ^ 0xC09BB49D64B05BEBL);
        double d4 = Double.longBitsToDouble(0xFDD0E2B658624883L ^ 0x3DD0E2B658624883L);
        int n2 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX < 0.0 ? (int)1575631205L ^ 0xA215C69A : (int)((long)1677588413 ^ (long)1677588412);
        int n3 = n = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ < 0.0 ? (int)-2137781021L ^ 0x7F6BF31C : (int)((long)437864877 ^ (long)437864876);
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4204(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY - 1.0, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ) instanceof BlockAir) {
            if (Math.abs(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX % 1.0) * Double.longBitsToDouble(0xA6F84F66AA93BA7DL ^ 0xE6A14F66AA93BA7DL) <= Double.longBitsToDouble((long)1316183906 ^ 0x403E00004E735F62L)) {
                d3 = (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX - Double.longBitsToDouble(0x6D23BB63AAF749C1L ^ 0x52F0885099C47AF2L) * (double)n2) + Double.longBitsToDouble((long)187500139 ^ 0x3FE000000B2D066BL) * (double)(-n2);
            } else if (Math.abs(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX % 1.0) * Double.longBitsToDouble(0xEE3661D82A40FE67L ^ 0xAE6F61D82A40FE67L) >= Double.longBitsToDouble((long)247576963 ^ 0x405180000EC1B983L)) {
                d3 = (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX + Double.longBitsToDouble((long)1853836329 ^ 0x3FD333335D4C7F1AL) * (double)n2) - Double.longBitsToDouble(0x1748F08E721034A2L ^ 0x28A8F08E721034A2L) * (double)(-n2);
            }
            if (Math.abs(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ % 1.0) * Double.longBitsToDouble(0xCCD2D13D0F16D068L ^ 0x8C8BD13D0F16D068L) <= Double.longBitsToDouble(0x73862747FDD8F681L ^ 0x33B82747FDD8F681L)) {
                d4 = (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ - Double.longBitsToDouble(0x422CAF53E67AB5EDL ^ 0x7DFF9C60D54986DEL) * (double)n) + Double.longBitsToDouble(0xB7009B499FC3FFBEL ^ 0x88E09B499FC3FFBEL) * (double)(-n);
            } else if (Math.abs(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ % 1.0) * Double.longBitsToDouble(0x667D2158C186668DL ^ 0x26242158C186668DL) >= Double.longBitsToDouble(0x7587909443571656L ^ 0x35D6109443571656L)) {
                d4 = (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ + Double.longBitsToDouble(0x9466DBA6EE359C96L ^ 0xABB5E895DD06AFA5L) * (double)n) - Double.longBitsToDouble((long)746340084 ^ 0x3FE000002C7C3EF4L) * (double)(-n);
            }
        }
        Double.compare(d3, Double.longBitsToDouble((long)898096542 ^ 0xC00000003587DD9EL));
        d3 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX > (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX) ? (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX) + Double.longBitsToDouble((long)1211057283 ^ 0x3FE00000482F4483L) : (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX < (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX) ? (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX) - Double.longBitsToDouble((long)1952656241 ^ 0x3FE0000074632B71L) : PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX);
        Double.compare(d4, Double.longBitsToDouble((long)1138608152 ^ 0xC000000043DDC818L));
        d4 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ > (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ) ? (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ) + Double.longBitsToDouble((long)1345364376 ^ 0x3FE000005030A198L) : (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ < (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ) ? (double)Math.round(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ) - Double.longBitsToDouble((long)190426707 ^ 0x3FE000000B59AE53L) : PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ);
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d3, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY, d4, ((int)-1060458848L ^ 0xC0CAAEA1) != 0));
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.setPosition(d3, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY, d4);
    }

    public static double[] Method6649(double d) {
        float f = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.movementInput.moveForward;
        float f2 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.movementInput.moveStrafe;
        float f3 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.prevRotationYaw + (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.rotationYaw - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.prevRotationYaw) * Field16007.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? (int)((long)21720621 ^ (long)-21720578) : (int)((long)-803358734 ^ (long)-803358753));
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? (int)((long)1596219341 ^ (long)1596219360) : (int)-985048069L ^ 0x3AB6A428);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat((int)((long)998198110 ^ (long)-2063643810));
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat((int)((long)1260670833 ^ (long)160452465))));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat((int)906663153L ^ 0x74BE94F1)));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        double[] dArray = new double[(int)((long)-993503000 ^ (long)-993502999) << 1];
        dArray[(int)((long)786609920 ^ (long)786609920)] = d4;
        dArray[(int)589599557L ^ 0x23249344] = d5;
        return dArray;
    }

    public static double Method6650() {
        double d = Double.longBitsToDouble((long)955732261 ^ 0x3FD2631FB2FE53FBL);
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player == null) return d;
        if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.isPotionActive(Potion.getPotionById((int)((int)((long)1997407384 ^ (long)1997407385))))) return d;
        int n = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getActivePotionEffect(Potion.getPotionById((int)((int)-1634788803L ^ 0x9E8F1A3C))).getAmplifier();
        d *= 1.0 + Double.longBitsToDouble((long)268705110 ^ 0x3FC99999899D84CCL) * (double)(n + ((int)-353380217L ^ 0xEAEFD886));
        return d;
    }

    public static boolean Method6651(EntityLivingBase entityLivingBase) {
        int n;
        if (entityLivingBase.moveForward == 0.0f && entityLivingBase.moveStrafing == 0.0f) {
            n = (int)((long)-2050881593 ^ (long)-2050881593);
            return n != 0;
        }
        n = (int)-333166575L ^ 0xEC244810;
        return n != 0;
    }

    public static void Method6652(EntityLivingBase entityLivingBase, double d) {
        double[] dArray = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6649(d);
        entityLivingBase.motionX = dArray[(int)1810139649L ^ 0x6BE48A01];
        entityLivingBase.motionZ = dArray[(int)((long)-671764600 ^ (long)-671764599)];
    }

    public static boolean Method6653() {
        int n;
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player != null && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getHeldItemMainhand().getItem() instanceof ItemFood && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.isHandActive() && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getActiveHand().equals((Object)EnumHand.MAIN_HAND)) {
            n = (int)((long)2113461054 ^ (long)2113461055);
            return n != 0;
        }
        n = (int)-1064106805L ^ 0xC09304CB;
        return n != 0;
    }

    public static boolean Method6654() {
        int n;
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player != null && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getHeldItemOffhand().getItem() instanceof ItemFood && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.isHandActive() && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getActiveHand().equals((Object)EnumHand.OFF_HAND)) {
            n = (int)-876369523L ^ 0xCBC3A98C;
            return n != 0;
        }
        n = (int)((long)1537842563 ^ (long)1537842563);
        return n != 0;
    }

    public static boolean Method6655() {
        int n;
        if (Field16007.getRenderViewEntity() == PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player) {
            n = (int)((long)1629298837 ^ (long)1629298836);
            return n != 0;
        }
        n = (int)870057448L ^ 0x33DC05E8;
        return n != 0;
    }

    public static boolean Method6656(BlockPos blockPos) {
        boolean bl;
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player == null) {
            return (int)((long)124384002 ^ (long)124384002) != 0;
        }
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.rayTraceBlocks(new Vec3d(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY + (double)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getEyeHeight(), PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ()), (boolean)((long)-1919123535 ^ (long)-1919123535), (boolean)((long)-1520732335 ^ (long)-1520732336), ((int)-1481969159L ^ 0xA7AAF1F9) != 0) == null) {
            bl = (int)-1080073208L ^ 0xBF9F6409;
            return bl;
        }
        bl = (int)259867928L ^ 0xF7D4518;
        return bl;
    }

    public static BlockPos Method6657() {
        return new BlockPos(Math.floor(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX), Math.floor(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posY), Math.floor(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ));
    }

    public static BlockPos Method6658(EntityPlayer entityPlayer) {
        return new BlockPos(Math.floor(entityPlayer.posX), Math.floor(entityPlayer.posY), Math.floor(entityPlayer.posZ));
    }

    public static BlockPos Method6659(Entity entity) {
        return new BlockPos(Math.floor(entity.posX), Math.floor(entity.posY), Math.floor(entity.posZ));
    }

    public static int Method6660(Item item) {
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player == null) {
            return (int)((long)-1317479239 ^ (long)-1317479239);
        }
        int n = (int)1423270047L ^ 0x54D5609F;
        while (n < PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.inventoryContainer.getInventory().size()) {
            ++n;
        }
        return (int)867042034L ^ 0xCC51FD0D;
    }

    public static int Method6661(Item item) {
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player == null) {
            return (int)((long)1117626147 ^ (long)1117626147);
        }
        int n = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.inventoryContainer.getInventory().size() - ((int)1906653727L ^ 0x71A53A1E);
        while (n > 0) {
            ItemStack itemStack;
            if (n != ((int)-1167653759L ^ 0xBA670484) && n != ((int)711294816L ^ 0x2A657F63) << 1 && n != (int)((long)1910878237 ^ (long)1910878234) && n != (int)((long)-872234593 ^ (long)-872234594) << 3 && !(itemStack = (ItemStack)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.inventoryContainer.getInventory().get(n)).isEmpty() && itemStack.getItem() == item) {
                return n;
            }
            --n;
        }
        return (int)((long)1952967764 ^ (long)-1952967765);
    }

    public static void Method6662(float f, float f2) {
        int n;
        boolean bl;
        boolean bl2 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.isSprinting();
        if (bl2 != PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.serverSprintState) {
            if (bl2) {
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player, CPacketEntityAction.Action.START_SPRINTING));
            } else {
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player, CPacketEntityAction.Action.STOP_SPRINTING));
            }
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.serverSprintState = bl2;
        }
        if ((bl = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.isSneaking()) != PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.serverSneakState) {
            if (bl) {
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player, CPacketEntityAction.Action.START_SNEAKING));
            } else {
                PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player, CPacketEntityAction.Action.STOP_SNEAKING));
            }
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.serverSneakState = bl;
        }
        if (!PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6655()) return;
        float f3 = f;
        float f4 = f2;
        AxisAlignedBB axisAlignedBB = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.getEntityBoundingBox();
        double d = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPosX;
        double d2 = axisAlignedBB.minY - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPosY;
        double d3 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPosZ;
        double d4 = f4 - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedYaw;
        double d5 = f3 - PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPitch;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.positionUpdateTicks += (int)-1799218382L ^ 0x94C21B33;
        int n2 = d * d + d2 * d2 + d3 * d3 > Double.longBitsToDouble((long)1598423075 ^ 0x3F4D7DBF1739CBB1L) || PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.positionUpdateTicks >= (int)((long)776814596 ^ (long)776814593) << 2 ? (int)928328116L ^ 0x375529B5 : (int)-1149901325L ^ 0xBB75E5F3;
        int n3 = n = d4 != 0.0 || d5 != 0.0 ? (int)((long)-1994554939 ^ (long)-1994554940) : (int)((long)921173445 ^ (long)921173445);
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.isRiding()) {
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.motionX, Double.longBitsToDouble(0x3058865194A5FF8AL ^ 0xF0D7BE5194A5FF8AL), PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.motionZ, f4, f3, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.onGround));
            n2 = (int)((long)857251870 ^ (long)857251870);
        } else {
            PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.connection.sendPacket((Packet)new CPacketPlayer.PositionRotation(PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX, axisAlignedBB.minY, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ, f4, f3, PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.onGround));
        }
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPosX = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posX;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPosY = axisAlignedBB.minY;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPosZ = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.posZ;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.positionUpdateTicks = (int)((long)921339567 ^ (long)921339567);
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedYaw = f4;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.lastReportedPitch = f3;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.prevOnGround = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.onGround;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.autoJumpEnabled = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.player.mc.gameSettings.autoJump;
    }

    public static boolean Method6663() {
        BlockPos[] blockPosArray;
        BlockPos blockPos = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6657();
        BlockPos[] blockPosArray2 = new BlockPos[(int)((long)-1664270201 ^ (long)-1664270206) << 1];
        blockPosArray2[(int)27494466L ^ 0x1A38842] = blockPos.down();
        blockPosArray2[(int)((long)-979490201 ^ (long)-979490202)] = blockPos.up().up();
        blockPosArray2[((int)-1345550414L ^ 0xAFCC87B3) << 1] = blockPos.north();
        blockPosArray2[(int)1578172311L ^ 0x5E10FF94] = blockPos.south();
        blockPosArray2[(int)((long)-1080848963 ^ (long)-1080848964) << 2] = blockPos.east();
        blockPosArray2[(int)-1407636277L ^ 0xAC192CCE] = blockPos.west();
        blockPosArray2[((int)319684137L ^ 0x130DFE2A) << 1] = blockPos.north().up();
        blockPosArray2[(int)-1073658905L ^ 0xC00143E0] = blockPos.south().up();
        blockPosArray2[(int)((long)-996236198 ^ (long)-996236197) << 3] = blockPos.east().up();
        blockPosArray2[(int)1517083537L ^ 0x5A6CDB98] = blockPos.west().up();
        BlockPos[] blockPosArray3 = blockPosArray = blockPosArray2;
        int n = blockPosArray3.length;
        int n2 = (int)392590864L ^ 0x17667610;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray3[n2];
            IBlockState iBlockState = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.OBSIDIAN && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.getBlockState(blockPos2).getBlock() != Blocks.BEDROCK) {
                return (int)((long)-1327036550 ^ (long)-1327036550) != 0;
            }
            ++n2;
        }
        return ((int)-1190145625L ^ 0xB90FD1A6) != 0;
    }

    public static boolean Method6664(Entity entity) {
        BlockPos[] blockPosArray;
        BlockPos blockPos = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6659(entity);
        BlockPos[] blockPosArray2 = new BlockPos[(int)((long)-1731428973 ^ (long)-1731428966)];
        blockPosArray2[(int)((long)-974757368 ^ (long)-974757368)] = blockPos.up().up();
        blockPosArray2[(int)((long)70481758 ^ (long)70481759)] = blockPos.north();
        blockPosArray2[((int)405684451L ^ 0x182E40E2) << 1] = blockPos.south();
        blockPosArray2[(int)-746214039L ^ 0xD385AD6A] = blockPos.east();
        blockPosArray2[((int)711057582L ^ 0x2A61E0AF) << 2] = blockPos.west();
        blockPosArray2[(int)-911205813L ^ 0xC9B01A4E] = blockPos.north().up();
        blockPosArray2[((int)72199298L ^ 0x44DAC81) << 1] = blockPos.south().up();
        blockPosArray2[(int)-350735879L ^ 0xEB1831FE] = blockPos.east().up();
        blockPosArray2[((int)-1761667802L ^ 0x96FF1527) << 3] = blockPos.west().up();
        BlockPos[] blockPosArray3 = blockPosArray = blockPosArray2;
        int n = blockPosArray3.length;
        int n2 = (int)-1219265825L ^ 0xB7537ADF;
        while (n2 < n) {
            BlockPos blockPos2 = blockPosArray3[n2];
            IBlockState iBlockState = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.OBSIDIAN && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.getBlockState(blockPos2).getBlock() != Blocks.BEDROCK) {
                return ((int)-610380403L ^ 0xDB9E558D) != 0;
            }
            ++n2;
        }
        return ((int)931461354L ^ 0x3784F8EB) != 0;
    }

    private static void Method6665(EntityOtherPlayerMP entityOtherPlayerMP) {
        Field16008.remove(entityOtherPlayerMP.getEntityId());
        entityOtherPlayerMP.isDead = (int)-1309478429L ^ 0xB1F2F1E2;
        if (PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world == null) return;
        PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Field16007.world.removeEntity((Entity)entityOtherPlayerMP);
    }
}

