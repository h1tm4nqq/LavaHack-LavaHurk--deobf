//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import java.util.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.passive.*;

public class Class67 extends Class42
{
    private final Class44 Field8221;
    private final Class44 Field8222;
    private final Class44 Field8223;
    private final Class44 Field8224;
    private final Class44 Field8225;
    private final Class44 Field8226;
    private final Class44 Field8227;
    private final Class44 Field8228;
    private final Class44 Field8229;
    private final Class44 Field8230;
    private final Class650 Field8231;
    private String Field8232 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class67() {
        super("AutoMount", Class97.Field8341);
        this.Field8221 = this.Method23(new Class44("Range", (Class42)this, Double.longBitsToDouble((long)799096553 ^ 0x401400002FA13EE9L), 1.0, Double.longBitsToDouble(4618441417868443648L), false));
        this.Field8222 = this.Method23(new Class44("DelayTicks", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)696697046 ^ 0x405900002986C0D6L), true));
        this.Field8223 = this.Method23(new Class44("Rotate", (Class42)this, false));
        this.Field8224 = this.Method23(new Class44("OnlyTamed", (Class42)this, false));
        this.Field8225 = this.Method23(new Class44("Horses", (Class42)this, false));
        this.Field8226 = this.Method23(new Class44("SkeletonHorses", (Class42)this, false));
        this.Field8227 = this.Method23(new Class44("Donkeys", (Class42)this, false));
        this.Field8228 = this.Method23(new Class44("Llamas", (Class42)this, false));
        this.Field8229 = this.Method23(new Class44("Pigs", (Class42)this, false));
        this.Field8230 = this.Method23(new Class44("Boats", (Class42)this, false));
        this.Field8231 = new Class650();
    }
    
    public void Method38() {
        super.Method38();
        if (Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Field8231.Method2801();
    }
    
    public void Method45() {
        if (Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isRiding()) {
            return;
        }
        if (!this.Field8231.Method2797(this.Field8222.Method335() * 50L)) {
            return;
        }
        this.Field8231.Method2801();
        final Entity entity = (Entity)Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.loadedEntityList.stream().filter(this::Method655).filter(this::Method651).filter(this::Method654).min(Comparator.comparing((Function<? super T, ? extends Comparable>)Class67::Method653)).orElse(null);
        if (entity == null) {
            return;
        }
        final Vec3d vec3d = new Vec3d(entity.posX, entity.posY + (entity.getEntityBoundingBox().maxY - entity.getEntityBoundingBox().minY) / Double.longBitsToDouble((long)1378216366 ^ 0x400000005225E9AEL), entity.posZ);
        final float[] array = { Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch };
        if (this.Field8223.Method365()) {
            final float[] method4303 = Class1055.Method4303(Class1036.Method4206(), vec3d);
            Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(method4303[0], method4303[1], Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
        Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.interactWithEntity((EntityPlayer)Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, entity, EnumHand.MAIN_HAND);
        if (this.Field8223.Method365()) {
            Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer$Rotation(array[0], array[1], Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        }
    }
    
    private boolean Method651(final Entity entity) {
        if (entity instanceof EntityHorse && this.Field8225.Method365()) {
            return !((EntityHorse)entity).isChild();
        }
        if (entity instanceof EntitySkeletonHorse && this.Field8226.Method365()) {
            return !((EntitySkeletonHorse)entity).isChild();
        }
        if (entity instanceof EntityDonkey && this.Field8227.Method365()) {
            return !((EntityDonkey)entity).isChild();
        }
        if (entity instanceof EntityLlama && this.Field8228.Method365()) {
            return !((EntityLlama)entity).isChild();
        }
        if (entity instanceof EntityPig && this.Field8229.Method365()) {
            return ((EntityPig)entity).getSaddled();
        }
        return entity instanceof EntityBoat && this.Field8230.Method365();
    }
    
    private boolean Method652(final Entity entity) {
        return !(entity instanceof AbstractHorse) || ((AbstractHorse)entity).isTame();
    }
    
    private static Float Method653(final Entity entity) {
        return Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity);
    }
    
    private boolean Method654(final Entity entity) {
        return !this.Field8224.Method365() || this.Method652(entity);
    }
    
    private boolean Method655(final Entity entity) {
        return Class67.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(entity) <= this.Field8221.Method367();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1240 ^ 0x9C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
