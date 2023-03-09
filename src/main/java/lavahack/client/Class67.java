//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityBoat
 *  net.minecraft.entity.passive.AbstractHorse
 *  net.minecraft.entity.passive.EntityDonkey
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.passive.EntityLlama
 *  net.minecraft.entity.passive.EntityPig
 *  net.minecraft.entity.passive.EntitySkeletonHorse
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class1055;
import com.kisman.cc.util.Class650;
import java.util.Comparator;
import lavahack.client.Class1036;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;

public class Class67
extends Class42 {
    private final Class44 Field8221 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)799096553 ^ 0x401400002FA13EE9L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
    private final Class44 Field8222 = this.Method23(new Class44("DelayTicks", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)696697046 ^ 0x405900002986C0D6L), true));
    private final Class44 Field8223 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field8224 = this.Method23(new Class44("OnlyTamed", (Class42)this, false));
    private final Class44 Field8225 = this.Method23(new Class44("Horses", (Class42)this, false));
    private final Class44 Field8226 = this.Method23(new Class44("SkeletonHorses", (Class42)this, false));
    private final Class44 Field8227 = this.Method23(new Class44("Donkeys", (Class42)this, false));
    private final Class44 Field8228 = this.Method23(new Class44("Llamas", (Class42)this, false));
    private final Class44 Field8229 = this.Method23(new Class44("Pigs", (Class42)this, false));
    private final Class44 Field8230 = this.Method23(new Class44("Boats", (Class42)this, false));
    private final Class650 Field8231 = new Class650();
    private String Field8232 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class67() {
        super("AutoMount", Class97.Field8341);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field8231.Method2801();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method45() {
        if (Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) {
            return;
        }
        if (!this.Field8231.Method2797((long)this.Field8222.Method335() * 50L)) {
            return;
        }
        this.Field8231.Method2801();
        Entity entity = Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(this::Method655).filter(this::Method651).filter(this::Method654).min(Comparator.comparing(Class67::Method653)).orElse(null);
        if (entity == null) {
            return;
        }
        Vec3d vec3d = new Vec3d(entity.posX, entity.posY + (entity.getEntityBoundingBox().maxY - entity.getEntityBoundingBox().minY) / Double.longBitsToDouble((long)1378216366 ^ 0x400000005225E9AEL), entity.posZ);
        float[] fArray = new float[]{Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch};
        if (this.Field8223.Method365()) {
            float[] fArray2 = Class1055.Method4303(Class1036.Method4206(), vec3d);
            Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray2[0], fArray2[1], Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
        Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, entity, EnumHand.MAIN_HAND);
        if (!this.Field8223.Method365()) return;
        Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[0], fArray[1], Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
    }

    private boolean Method651(Entity entity) {
        if (entity instanceof EntityHorse && this.Field8225.Method365()) {
            if (((EntityHorse)entity).isChild()) return false;
            return true;
        }
        if (entity instanceof EntitySkeletonHorse && this.Field8226.Method365()) {
            if (((EntitySkeletonHorse)entity).isChild()) return false;
            return true;
        }
        if (entity instanceof EntityDonkey && this.Field8227.Method365()) {
            if (((EntityDonkey)entity).isChild()) return false;
            return true;
        }
        if (entity instanceof EntityLlama && this.Field8228.Method365()) {
            if (((EntityLlama)entity).isChild()) return false;
            return true;
        }
        if (entity instanceof EntityPig && this.Field8229.Method365()) {
            return ((EntityPig)entity).getSaddled();
        }
        if (!(entity instanceof EntityBoat)) return false;
        if (!this.Field8230.Method365()) return false;
        return true;
    }

    private boolean Method652(Entity entity) {
        if (!(entity instanceof AbstractHorse)) return true;
        return ((AbstractHorse)entity).isTame();
    }

    private static Float Method653(Entity entity) {
        return Float.valueOf(Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity));
    }

    private boolean Method654(Entity entity) {
        if (!this.Field8224.Method365()) return true;
        if (this.Method652(entity)) return true;
        return false;
    }

    private boolean Method655(Entity entity) {
        if (!((double)Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) <= this.Field8221.Method367())) return false;
        return true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 156;
            cArray2[n] = (char)(cArray[n] ^ (0x1240 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

