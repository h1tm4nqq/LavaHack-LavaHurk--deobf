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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import com.kisman.cc.util.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import java.util.Comparator;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
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

public class A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8221 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Range", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)799096553 ^ 0x401400002FA13EE9L), 1.0, Double.longBitsToDouble(0xE6E87CFCE2F62A51L ^ 0xA6F07CFCE2F62A51L), (boolean)((long)-1878808529 ^ (long)-1878808529)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8222 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DelayTicks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)696697046 ^ 0x405900002986C0D6L), (boolean)((long)292830832 ^ (long)292830833)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8223 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-79885486 ^ (long)-79885486)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8224 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("OnlyTamed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1599703724L ^ 0x5F598AAC) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8225 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Horses", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-45449209L ^ 0xFD4A8007) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8226 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SkeletonHorses", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1877956368 ^ (long)1877956368)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8227 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Donkeys", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1977600350 ^ (long)1977600350)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8228 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Llamas", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1665439672 ^ (long)-1665439672)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8229 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Pigs", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-318778665 ^ (long)-318778665)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8230 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Boats", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-9357073 ^ (long)-9357073)));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field8231 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private String Field8232 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU() {
        super("AutoMount", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field8231.Method2801();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method45() {
        if (A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) {
            return;
        }
        if (!this.Field8231.Method2797((long)this.Field8222.Method335() * (0x67C42276L & 0x118432L))) {
            return;
        }
        this.Field8231.Method2801();
        Entity entity = A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(this::Method655).filter(this::Method651).filter(this::Method654).min(Comparator.comparing(A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU::Method653)).orElse(null);
        if (entity == null) {
            return;
        }
        Vec3d vec3d = new Vec3d(entity.posX, entity.posY + (entity.getEntityBoundingBox().maxY - entity.getEntityBoundingBox().minY) / Double.longBitsToDouble((long)1378216366 ^ 0x400000005225E9AEL), entity.posZ);
        float[] fArray = new float[(int)((long)605405939 ^ (long)605405938) << 1];
        fArray[(int)-897868622L ^ 0xCA7B9CB2] = A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        fArray[(int)852688605L ^ 0x32D2FEDC] = A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        float[] fArray2 = fArray;
        if (this.Field8223.Method365()) {
            float[] fArray3 = YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4206(), vec3d);
            A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray3[(int)-445660476L ^ 0xE56FC2C4], fArray3[(int)-1817977737L ^ 0x93A3DC76], A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
        A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, entity, EnumHand.MAIN_HAND);
        if (!this.Field8223.Method365()) return;
        A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray2[(int)((long)-1612721563 ^ (long)-1612721563)], fArray2[(int)1694928624L ^ 0x65068EF1], A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
    }

    private boolean Method651(Entity entity) {
        int n;
        if (entity instanceof EntityHorse && this.Field8225.Method365()) {
            int n2;
            if (!((EntityHorse)entity).isChild()) {
                n2 = (int)394988962L ^ 0x178B0DA3;
                return n2 != 0;
            }
            n2 = (int)((long)-379480254 ^ (long)-379480254);
            return n2 != 0;
        }
        if (entity instanceof EntitySkeletonHorse && this.Field8226.Method365()) {
            int n3;
            if (!((EntitySkeletonHorse)entity).isChild()) {
                n3 = (int)((long)-741648628 ^ (long)-741648627);
                return n3 != 0;
            }
            n3 = (int)-779860458L ^ 0xD1844616;
            return n3 != 0;
        }
        if (entity instanceof EntityDonkey && this.Field8227.Method365()) {
            int n4;
            if (!((EntityDonkey)entity).isChild()) {
                n4 = (int)827799808L ^ 0x31573901;
                return n4 != 0;
            }
            n4 = (int)((long)2102008756 ^ (long)2102008756);
            return n4 != 0;
        }
        if (entity instanceof EntityLlama && this.Field8228.Method365()) {
            int n5;
            if (!((EntityLlama)entity).isChild()) {
                n5 = (int)-1795231528L ^ 0x94FEF0D9;
                return n5 != 0;
            }
            n5 = (int)((long)-643802594 ^ (long)-643802594);
            return n5 != 0;
        }
        if (entity instanceof EntityPig && this.Field8229.Method365()) {
            return ((EntityPig)entity).getSaddled();
        }
        if (entity instanceof EntityBoat && this.Field8230.Method365()) {
            n = (int)((long)677423783 ^ (long)677423782);
            return n != 0;
        }
        n = (int)((long)-1336895114 ^ (long)-1336895114);
        return n != 0;
    }

    private boolean Method652(Entity entity) {
        if (!(entity instanceof AbstractHorse)) return ((int)1491726716L ^ 0x58E9F17D) != 0;
        return ((AbstractHorse)entity).isTame();
    }

    private static Float Method653(Entity entity) {
        return Float.valueOf(A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity));
    }

    private boolean Method654(Entity entity) {
        int n;
        if (this.Field8224.Method365() && !this.Method652(entity)) {
            n = (int)-1253631665L ^ 0xB547194F;
            return n != 0;
        }
        n = (int)((long)527383356 ^ (long)527383357);
        return n != 0;
    }

    private boolean Method655(Entity entity) {
        int n;
        if ((double)A3ZzrwiFKrnjS0A7nRDw0aOCryj4M7uU.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) <= this.Field8221.Method367()) {
            n = (int)((long)-1472791598 ^ (long)-1472791597);
            return n != 0;
        }
        n = (int)((long)1277675673 ^ (long)1277675673);
        return n != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)221726104L ^ 0xD374598;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)586189647 ^ (long)586189744);
            int n2 = (int)((long)-1358268862 ^ (long)-1358268827) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)2083123538L ^ 0x7C29F11B) << 6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

