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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ;
import lavahack.client.cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x;
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

public class q1JKwy52TMxvizRt5jiGJiROVLAEPCKA
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17049 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)1286337847 ^ 0x402400004CABF537L), (boolean)((long)-1914349639 ^ (long)-1914349639));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17050 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cancel Packets", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-183734117L ^ 0xF50C709A) != 0);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17051 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14977);
    private Entity Field17052;
    private EntityOtherPlayerMP Field17053;
    private Vec3d Field17054;
    private float Field17055;
    private float Field17056;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17057 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7289, new Predicate[(int)-507877041L ^ 0xE1BA694F]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17058 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA::Method7288, new Predicate[(int)1812163691L ^ 0x6C036C6B]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17059 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7287, new Predicate[(int)1617180160L ^ 0x60643600]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17060 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method7286, new Predicate[(int)((long)-2002734112 ^ (long)-2002734112)]);
    private int Field17061;

    public q1JKwy52TMxvizRt5jiGJiROVLAEPCKA() {
        super("FreeCamBypass", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17049);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17050);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field17051);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17060);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17059);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17057);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field17058);
        if (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field17051.Method359().equals(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14977.name())) {
            this.Field17053 = new EntityOtherPlayerMP((World)q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getSession().getProfile());
            this.Field17053.copyLocationAndAnglesFrom((Entity)q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
            this.Field17053.prevRotationYaw = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
            this.Field17053.rotationYawHead = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
            this.Field17053.inventory.copyInventory(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
            this.Field17053.noClip = (int)954190096L ^ 0x38DFC911;
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld((int)-34144528L ^ 0x209014B, (Entity)this.Field17053);
            vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.setRenderViewEntity((Entity)this.Field17053);
            return;
        }
        this.Field17052 = null;
        if (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity() != null) {
            this.Field17052 = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getRidingEntity();
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.dismountRidingEntity();
        }
        this.Field17053 = new EntityOtherPlayerMP((World)q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getSession().getProfile());
        this.Field17053.copyLocationAndAnglesFrom((Entity)q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        this.Field17053.prevRotationYaw = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        this.Field17053.rotationYawHead = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYawHead;
        this.Field17053.inventory.copyInventory(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.addEntityToWorld((int)68982234L ^ 0xFBE36A61, (Entity)this.Field17053);
        this.Field17054 = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionVector();
        this.Field17055 = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw;
        this.Field17056 = q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = (int)((long)-554787307 ^ (long)-554787308);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17060);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17059);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17057);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field17058);
        if (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field17051.Method359().equals(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14977.name())) {
            if (this.Field17052 != null) {
                q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.startRiding(this.Field17052, (boolean)((long)-50591427 ^ (long)-50591428));
                this.Field17052 = null;
            }
            if (this.Field17053 != null) {
                q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)this.Field17053);
            }
            if (this.Field17054 != null) {
                q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(this.Field17054.x, this.Field17054.y, this.Field17054.z);
            }
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw = this.Field17055;
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = this.Field17056;
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = (int)((long)1044625510 ^ (long)1044625510);
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
            return;
        }
        if (this.Field17053 != null) {
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.removeEntity((Entity)this.Field17053);
        }
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.setRenderViewEntity((Entity)q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method7285(EntityJoinWorldEvent entityJoinWorldEvent) {
        if (entityJoinWorldEvent.getEntity() != q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        super.Method21((boolean)((long)-1837837731 ^ (long)-1837837731));
    }

    private void Method7286(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!this.Field17050.Method365()) return;
        if (!this.Field17051.Method359().equals(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14977.name())) return;
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketUseEntity || tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayerTryUseItem || tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayerTryUseItemOnBlock || tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketVehicleMove)) {
            if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketChatMessage)) return;
        }
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private void Method7287(ZzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ zzCthbNQzHwe8k28Qcjjz6P4pBYX3BqZ) {
        if (!this.Field17051.Method359().equals(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14977.name())) return;
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = (int)((long)-1012742918 ^ (long)-1012742917);
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setVelocity(0.0, 0.0, 0.0);
        double[] dArray = dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2131(this.Field17049.Method368());
        if (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveStrafe != 0.0f || q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.movementInput.moveForward != 0.0f) {
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = dArray[(int)-114437771L ^ 0xF92DD175];
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = dArray[(int)((long)-2010003798 ^ (long)-2010003797)];
        } else {
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        }
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setSprinting((boolean)((long)1730108420 ^ (long)1730108420));
        if (q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindJump.isKeyDown()) {
            q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY += (double)this.Field17049.Method368();
        }
        if (!q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.keyBindSneak.isKeyDown()) return;
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY -= (double)this.Field17049.Method368();
    }

    private static void Method7288(cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9 cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX92) {
        cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX92.Method158();
    }

    private void Method7289(uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x uwE7kWOUin9fjWlKYd2g07AwOzCzWS4x2) {
        if (!this.Field17051.Method359().equals(q1JKwy52TMxvizRt5jiGJiROVLAEPCKA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field14977.name())) return;
        q1JKwy52TMxvizRt5jiGJiROVLAEPCKA.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = (int)((long)-1494047178 ^ (long)-1494047177);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1026070436L ^ 0xC2D7685C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)787849976 ^ (long)787849735);
            int n2 = ((int)-1423007634L ^ 0xAB2EA06D) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)322661942L ^ 0x133B41DD) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

