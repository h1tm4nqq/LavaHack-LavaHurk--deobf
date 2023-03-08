//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.client.entity.*;
import net.minecraft.network.play.server.*;
import net.minecraft.entity.*;
import net.minecraft.network.play.client.*;

public class Class331 extends Class42
{
    public static Class331 Field9377;
    private final Class44 Field9378;
    private EntityOtherPlayerMP Field9379;
    @Class1801
    private final Class618 Field9380;
    @Class1801
    private final Class618 Field9381;
    @Class1801
    private final Class618 Field9382;
    @Class1801
    private final Class618 Field9383;
    private String Field9384 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class331() {
        super("FreeCamRewrite", Class97.Field8341);
        this.Field9378 = this.Method23(new Class44("Speed", this, 1.0, 0.0, Double.longBitsToDouble(4621819117588971520L), false));
        this.Field9380 = new Class618(Class331::Method1658, new Predicate[0]);
        this.Field9381 = new Class618(Class331::Method1657, new Predicate[0]);
        this.Field9382 = new Class618(this::Method1655, new Predicate[0]);
        this.Field9383 = new Class618(Class1185::Method158, new Predicate[0]);
        Class331.Field9377 = this;
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field9380);
        Class1796.Field16242.Method706(this.Field9381);
        Class1796.Field16242.Method706(this.Field9382);
        Class1796.Field16242.Method706(this.Field9383);
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            super.Method21(false);
            return;
        }
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dismountRidingEntity();
        this.Field9379 = Class1744.Method6634(Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getGameProfile());
        this.Field9379.onGround = Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround;
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field9380);
        Class1796.Field16242.Method711(this.Field9381);
        Class1796.Field16242.Method711(this.Field9382);
        Class1796.Field16242.Method711(this.Field9383);
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(this.Field9379.posX, this.Field9379.posY, this.Field9379.posZ);
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = false;
        Class1744.Method6637(this.Field9379);
        this.Field9379 = null;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method1652(final EntityJoinWorldEvent entityJoinWorldEvent) {
        if (entityJoinWorldEvent.getEntity() == Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
            super.Method21(false);
        }
    }
    
    public EntityOtherPlayerMP Method1653() {
        return this.Field9379;
    }
    
    public void Method1654(final float rotationYawHead, final float n) {
        if (this.Field9379 != null) {
            this.Field9379.rotationYawHead = rotationYawHead;
            this.Field9379.setPositionAndRotation(this.Field9379.posX, this.Field9379.posY, this.Field9379.posZ, rotationYawHead, n);
            this.Field9379.setPositionAndRotationDirect(this.Field9379.posX, this.Field9379.posY, this.Field9379.posZ, rotationYawHead, n, 3, false);
        }
    }
    
    @Override
    public void Method45() {
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = (float)this.Field9378.Method367();
        if (Class1917.Method7159()) {
            final double[] method7166 = Class1917.Method7166(this.Field9378.Method367());
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = method7166[0];
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = method7166[1];
        }
        else {
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(false);
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            final EntityPlayerSP player = Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player.motionY += this.Field9378.Method367();
        }
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) {
            final EntityPlayerSP player2 = Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
            player2.motionY -= this.Field9378.Method367();
        }
    }
    
    private void Method1655(final Class544 class544) {
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(this::Method1656);
        class544.Method158();
    }
    
    private void Method1656(final Class544 class544) {
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        Class1074.Method4344((SPacketPlayerPosLook)class544.Method982(), (Entity)((this.Method1653() == null) ? Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player : this.Method1653()), false);
        this.Method1653().onGround = true;
    }
    
    private static void Method1657(final Class805 class805) {
        if (class805.Method982() instanceof CPacketPlayer) {
            class805.Method158();
        }
    }
    
    private static void Method1658(final Class1334 class1334) {
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1FED ^ 0xB0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
