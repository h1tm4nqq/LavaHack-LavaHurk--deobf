//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import java.util.function.*;
import net.minecraft.world.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.entity.*;

public class Class1969 extends Class42
{
    private final Class44 Field17049;
    private final Class44 Field17050;
    private final Class44 Field17051;
    private Entity Field17052;
    private EntityOtherPlayerMP Field17053;
    private Vec3d Field17054;
    private float Field17055;
    private float Field17056;
    @Class1801
    private final Class618 Field17057;
    @Class1801
    private final Class618 Field17058;
    @Class1801
    private final Class618 Field17059;
    @Class1801
    private final Class618 Field17060;
    private int Field17061;
    
    public Class1969() {
        super("FreeCamBypass", Class97.Field8341);
        this.Field17049 = new Class44("Speed", this, 1.0, 0.0, Double.longBitsToDouble((long)1286337847 ^ 0x402400004CABF537L), false);
        this.Field17050 = new Class44("Cancel Packets", this, true);
        this.Field17051 = new Class44("Mode", this, (Enum)Class1492.Field14977);
        this.Field17057 = new Class618(this::Method7289, new Predicate[0]);
        this.Field17058 = new Class618(Class1969::Method7288, new Predicate[0]);
        this.Field17059 = new Class618(this::Method7287, new Predicate[0]);
        this.Field17060 = new Class618(this::Method7286, new Predicate[0]);
        Class1969.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17049);
        Class1969.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17050);
        Class1969.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17051);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field17060);
        Class1796.Field16242.Method706(this.Field17059);
        Class1796.Field16242.Method706(this.Field17057);
        Class1796.Field16242.Method706(this.Field17058);
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field17051.Method359().equals(Class1492.Field14977.name())) {
            this.Field17052 = null;
            if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity() != null) {
                this.Field17052 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
                Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dismountRidingEntity();
            }
            (this.Field17053 = new EntityOtherPlayerMP((World)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getSession().getProfile())).copyLocationAndAnglesFrom((Entity)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            this.Field17053.prevRotationYaw = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            this.Field17053.rotationYawHead = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
            this.Field17053.inventory.copyInventory(Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld(-69, (Entity)this.Field17053);
            this.Field17054 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
            this.Field17055 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            this.Field17056 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        }
        else {
            (this.Field17053 = new EntityOtherPlayerMP((World)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getSession().getProfile())).copyLocationAndAnglesFrom((Entity)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            this.Field17053.prevRotationYaw = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            this.Field17053.rotationYawHead = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
            this.Field17053.inventory.copyInventory(Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
            this.Field17053.noClip = true;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld(-69, (Entity)this.Field17053);
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.setRenderViewEntity((Entity)this.Field17053);
        }
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field17060);
        Class1796.Field16242.Method711(this.Field17059);
        Class1796.Field16242.Method711(this.Field17057);
        Class1796.Field16242.Method711(this.Field17058);
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field17051.Method359().equals(Class1492.Field14977.name())) {
            if (this.Field17052 != null) {
                Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.startRiding(this.Field17052, true);
                this.Field17052 = null;
            }
            if (this.Field17053 != null) {
                Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)this.Field17053);
            }
            if (this.Field17054 != null) {
                Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(this.Field17054.x, this.Field17054.y, this.Field17054.z);
            }
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = this.Field17055;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = this.Field17056;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = false;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        }
        else {
            if (this.Field17053 != null) {
                Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)this.Field17053);
            }
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.setRenderViewEntity((Entity)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public void Method7285(final EntityJoinWorldEvent entityJoinWorldEvent) {
        if (entityJoinWorldEvent.getEntity() == Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) {
            super.Method21(false);
        }
    }
    
    private void Method7286(final Class805 class805) {
        if (this.Field17050.Method365() && this.Field17051.Method359().equals(Class1492.Field14977.name()) && (class805.Method982() instanceof CPacketUseEntity || class805.Method982() instanceof CPacketPlayerTryUseItem || class805.Method982() instanceof CPacketPlayerTryUseItemOnBlock || class805.Method982() instanceof CPacketVehicleMove || class805.Method982() instanceof CPacketChatMessage)) {
            class805.Method158();
        }
    }
    
    private void Method7287(final Class2036 class2036) {
        if (this.Field17051.Method359().equals(Class1492.Field14977.name())) {
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
            final double[] method2131 = Class447.Method2131(this.Field17049.Method368());
            if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
                Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = method2131[0];
                Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = method2131[1];
            }
            else {
                final EntityPlayerSP player = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                final EntityPlayerSP player2 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                final double n = 0.0;
                player2.motionZ = n;
                player.motionX = n;
            }
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(false);
            if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
                final EntityPlayerSP player3 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player3.motionY += this.Field17049.Method368();
            }
            if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) {
                final EntityPlayerSP player4 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player;
                player4.motionY -= this.Field17049.Method368();
            }
        }
    }
    
    private static void Method7288(final Class1675 class1675) {
        class1675.Method158();
    }
    
    private void Method7289(final Class1334 class1334) {
        if (this.Field17051.Method359().equals(Class1492.Field14977.name())) {
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5FD6 ^ 0x18));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
