//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.play.server.*;
import java.util.*;
import java.util.function.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraft.init.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.client.event.*;
import net.minecraft.util.math.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;

public class Class1555 extends Class42
{
    private final Class44 Field15256;
    private final Class1612 Field15257;
    private final Queue Field15258;
    private SPacketPlayerPosLook Field15259;
    private BlockPos Field15260;
    private boolean Field15261;
    private boolean Field15262;
    @Class1801
    private final Class618 Field15263;
    @Class1801
    private final Class618 Field15264;
    private int Field15265;
    
    public Class1555() {
        super("ChorusDelay", Class97.Field8341);
        this.Field15256 = this.Method23(new Class44("Teleport", this, 42));
        this.Field15257 = new Class1612(this).Method3788().Method3789();
        this.Field15258 = new LinkedList();
        this.Field15259 = null;
        this.Field15260 = null;
        this.Field15261 = false;
        this.Field15262 = false;
        this.Field15263 = new Class618(this::Method6134, new Predicate[0]);
        this.Field15264 = new Class618(this::Method6133, new Predicate[0]);
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6130(final LivingEntityUseItemEvent$Finish livingEntityUseItemEvent$Finish) {
        if (livingEntityUseItemEvent$Finish.getEntity() == Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player && livingEntityUseItemEvent$Finish.getItem().getItem() == Items.CHORUS_FRUIT) {
            this.Field15261 = true;
            this.Field15260 = Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition();
            this.Field15262 = false;
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method6131(final RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field15259 != null && this.Field15261) {
            final Class1934 method6696 = Class1934.Field16968.Method6696(Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox());
            method6696.Method7193(new Vec3d(this.Field15259.x, this.Field15259.y, this.Field15259.z));
            this.Field15257.Method3804(method6696.Method7190());
        }
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field15263);
        Class1796.Field16242.Method706(this.Field15264);
        this.Method20();
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field15264);
        Class1796.Field16242.Method711(this.Field15263);
        this.Method20();
    }
    
    @Override
    public void Method45() {
        if (Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field15261) {
            if (!Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().equals((Object)this.Field15260) && !this.Field15262 && Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)this.Field15260.getX(), (double)this.Field15260.getY(), (double)this.Field15260.getZ()) > 1.0) {
                Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition((double)(this.Field15260.getX() + Float.intBitsToFloat(1056964608)), (double)this.Field15260.getY(), (double)(this.Field15260.getZ() + Float.intBitsToFloat(1056964608)));
                this.Field15262 = true;
            }
            if (Class1555.Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7142(this.Field15256)) {
                this.Method6132();
            }
        }
    }
    
    private void Method20() {
        this.Field15261 = false;
        this.Field15259 = null;
        this.Field15262 = false;
        this.Field15260 = null;
    }
    
    private void Method6132() {
        this.Method20();
        while (!this.Field15258.isEmpty()) {
            Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field15258.poll());
        }
    }
    
    private void Method6133(final Class544 class544) {
        if (class544.Method982() instanceof SPacketPlayerPosLook) {
            this.Field15259 = (SPacketPlayerPosLook)class544.Method982();
        }
    }
    
    private void Method6134(final Class805 class805) {
        if ((class805.Method982() instanceof CPacketConfirmTeleport || class805.Method982() instanceof CPacketPlayer) && this.Field15261) {
            this.Field15258.add(class805.Method982());
            class805.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x63C9 ^ 0x30));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
