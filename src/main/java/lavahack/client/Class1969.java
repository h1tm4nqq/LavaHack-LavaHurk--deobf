//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.play.client.CPacketChatMessage
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketVehicleMove
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.EntityJoinWorldEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1334;
import lavahack.client.Class1492;
import lavahack.client.Class1675;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class2036;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class447;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketVehicleMove;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1969
extends Class42 {
    private final Class44 Field17049 = new Class44("Speed", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)1286337847 ^ 0x402400004CABF537L), false);
    private final Class44 Field17050 = new Class44("Cancel Packets", (Class42)this, true);
    private final Class44 Field17051 = new Class44("Mode", (Class42)this, Class1492.Field14977);
    private Entity Field17052;
    private EntityOtherPlayerMP Field17053;
    private Vec3d Field17054;
    private float Field17055;
    private float Field17056;
    @Class1801
    private final Class618 Field17057 = new Class618(this::Method7289, new Predicate[0]);
    @Class1801
    private final Class618 Field17058 = new Class618(Class1969::Method7288, new Predicate[0]);
    @Class1801
    private final Class618 Field17059 = new Class618(this::Method7287, new Predicate[0]);
    @Class1801
    private final Class618 Field17060 = new Class618(this::Method7286, new Predicate[0]);
    private int Field17061;

    public Class1969() {
        super("FreeCamBypass", Class97.Field8341);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17049);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17050);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17051);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field17060);
        Class1796.Field16242.Method706(this.Field17059);
        Class1796.Field16242.Method706(this.Field17057);
        Class1796.Field16242.Method706(this.Field17058);
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field17051.Method359().equals(Class1492.Field14977.name())) {
            this.Field17053 = new EntityOtherPlayerMP((World)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getSession().getProfile());
            this.Field17053.copyLocationAndAnglesFrom((Entity)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            this.Field17053.prevRotationYaw = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            this.Field17053.rotationYawHead = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
            this.Field17053.inventory.copyInventory(Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
            this.Field17053.noClip = true;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld(-69, (Entity)this.Field17053);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.setRenderViewEntity((Entity)this.Field17053);
            return;
        }
        this.Field17052 = null;
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity() != null) {
            this.Field17052 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dismountRidingEntity();
        }
        this.Field17053 = new EntityOtherPlayerMP((World)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getSession().getProfile());
        this.Field17053.copyLocationAndAnglesFrom((Entity)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field17053.prevRotationYaw = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        this.Field17053.rotationYawHead = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
        this.Field17053.inventory.copyInventory(Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
        Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld(-69, (Entity)this.Field17053);
        this.Field17054 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
        this.Field17055 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        this.Field17056 = Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field17060);
        Class1796.Field16242.Method711(this.Field17059);
        Class1796.Field16242.Method711(this.Field17057);
        Class1796.Field16242.Method711(this.Field17058);
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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
            return;
        }
        if (this.Field17053 != null) {
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)this.Field17053);
        }
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.setRenderViewEntity((Entity)Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7285(EntityJoinWorldEvent entityJoinWorldEvent) {
        if (entityJoinWorldEvent.getEntity() != Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        super.Method21(false);
    }

    private void Method7286(Class805 class805) {
        if (!this.Field17050.Method365()) return;
        if (!this.Field17051.Method359().equals(Class1492.Field14977.name())) return;
        if (!(class805.Method982() instanceof CPacketUseEntity || class805.Method982() instanceof CPacketPlayerTryUseItem || class805.Method982() instanceof CPacketPlayerTryUseItemOnBlock || class805.Method982() instanceof CPacketVehicleMove)) {
            if (!(class805.Method982() instanceof CPacketChatMessage)) return;
        }
        class805.Method158();
    }

    private void Method7287(Class2036 class2036) {
        if (!this.Field17051.Method359().equals(Class1492.Field14977.name())) return;
        Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        double[] dArray = Class447.Method2131(this.Field17049.Method368());
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[0];
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[1];
        } else {
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting(false);
        if (Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY += (double)this.Field17049.Method368();
        }
        if (!Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) return;
        Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= (double)this.Field17049.Method368();
    }

    private static void Method7288(Class1675 class1675) {
        class1675.Method158();
    }

    private void Method7289(Class1334 class1334) {
        if (!this.Field17051.Method359().equals(Class1492.Field14977.name())) return;
        Class1969.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 24;
            cArray2[n] = (char)(cArray[n] ^ (0x5FD6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

