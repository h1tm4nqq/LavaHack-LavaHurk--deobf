//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1074;
import lavahack.client.Class1185;
import lavahack.client.Class1334;
import lavahack.client.Class1744;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1917;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class331
extends Class42 {
    public static Class331 Field9377;
    private final Class44 Field9378 = this.Method23(new Class44("Speed", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4024000000000000L), false));
    private EntityOtherPlayerMP Field9379;
    @Class1801
    private final Class618 Field9380 = new Class618(Class331::Method1658, new Predicate[0]);
    @Class1801
    private final Class618 Field9381 = new Class618(Class331::Method1657, new Predicate[0]);
    @Class1801
    private final Class618 Field9382 = new Class618(this::Method1655, new Predicate[0]);
    @Class1801
    private final Class618 Field9383 = new Class618(Class1185::Method158, new Predicate[0]);
    private String Field9384 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class331() {
        super("FreeCamRewrite", Class97.Field8341);
        Field9377 = this;
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field9380);
        Class1796.Field16242.Method706(this.Field9381);
        Class1796.Field16242.Method706(this.Field9382);
        Class1796.Field16242.Method706(this.Field9383);
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dismountRidingEntity();
            this.Field9379 = Class1744.Method6634(Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getGameProfile());
            this.Field9379.onGround = Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround;
            return;
        }
        super.Method21(false);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field9380);
        Class1796.Field16242.Method711(this.Field9381);
        Class1796.Field16242.Method711(this.Field9382);
        Class1796.Field16242.Method711(this.Field9383);
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(this.Field9379.posX, this.Field9379.posY, this.Field9379.posZ);
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = false;
        Class1744.Method6637(this.Field9379);
        this.Field9379 = null;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1652(EntityJoinWorldEvent entityJoinWorldEvent) {
        if (entityJoinWorldEvent.getEntity() != Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        super.Method21(false);
    }

    public EntityOtherPlayerMP Method1653() {
        return this.Field9379;
    }

    public void Method1654(float f, float f2) {
        if (this.Field9379 == null) return;
        this.Field9379.rotationYawHead = f;
        this.Field9379.setPositionAndRotation(this.Field9379.posX, this.Field9379.posY, this.Field9379.posZ, f, f2);
        this.Field9379.setPositionAndRotationDirect(this.Field9379.posX, this.Field9379.posY, this.Field9379.posZ, f, f2, 3, false);
    }

    @Override
    public void Method45() {
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jumpMovementFactor = (float)this.Field9378.Method367();
        if (Class1917.Method7159()) {
            double[] dArray = Class1917.Method7166(this.Field9378.Method367());
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[1];
        } else {
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        }
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(false);
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY += this.Field9378.Method367();
        }
        if (!Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) return;
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= this.Field9378.Method367();
    }

    private void Method1655(Class544 class544) {
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.addScheduledTask(() -> this.Method1656(class544));
        class544.Method158();
    }

    private void Method1656(Class544 class544) {
        if (Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        Class1074.Method4344((SPacketPlayerPosLook)class544.Method982(), (Entity)(this.Method1653() == null ? Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player : this.Method1653()), false);
        this.Method1653().onGround = true;
    }

    private static void Method1657(Class805 class805) {
        if (!(class805.Method982() instanceof CPacketPlayer)) return;
        class805.Method158();
    }

    private static void Method1658(Class1334 class1334) {
        Class331.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 176;
            cArray2[n] = (char)(cArray[n] ^ (0x1FED ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

