//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketConfirmTeleport
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.server.SPacketPlayerPosLook
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Finish
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;
import lavahack.client.Class1612;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1934;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.init.Items;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1555
extends Class42 {
    private final Class44 Field15256 = this.Method23(new Class44("Teleport", (Class42)this, 42));
    private final Class1612 Field15257 = new Class1612(this).Method3788().Method3789();
    private final Queue Field15258 = new LinkedList();
    private SPacketPlayerPosLook Field15259 = null;
    private BlockPos Field15260 = null;
    private boolean Field15261 = false;
    private boolean Field15262 = false;
    @Class1801
    private final Class618 Field15263 = new Class618(this::Method6134, new Predicate[0]);
    @Class1801
    private final Class618 Field15264 = new Class618(this::Method6133, new Predicate[0]);
    private int Field15265;

    public Class1555() {
        super("ChorusDelay", Class97.Field8341);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6130(LivingEntityUseItemEvent.Finish finish) {
        if (finish.getEntity() != Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        if (finish.getItem().getItem() != Items.CHORUS_FRUIT) return;
        this.Field15261 = true;
        this.Field15260 = Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition();
        this.Field15262 = false;
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6131(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field15259 == null) return;
        if (!this.Field15261) return;
        Class1934 class1934 = Class1934.Field16968.Method6696(Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox());
        class1934.Method7193(new Vec3d(this.Field15259.x, this.Field15259.y, this.Field15259.z));
        this.Field15257.Method3804(class1934.Method7190());
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
        if (Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field15261) return;
        if (!Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().equals((Object)this.Field15260) && !this.Field15262 && Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)this.Field15260.getX(), (double)this.Field15260.getY(), (double)this.Field15260.getZ()) > 1.0) {
            Class1555.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition((double)((float)this.Field15260.getX() + Float.intBitsToFloat(0x3F000000)), (double)this.Field15260.getY(), (double)((float)this.Field15260.getZ() + Float.intBitsToFloat(0x3F000000)));
            this.Field15262 = true;
        }
        if (!Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7142(this.Field15256)) return;
        this.Method6132();
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

    private void Method6133(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPlayerPosLook)) return;
        this.Field15259 = (SPacketPlayerPosLook)class544.Method982();
    }

    private void Method6134(Class805 class805) {
        if (!(class805.Method982() instanceof CPacketConfirmTeleport)) {
            if (!(class805.Method982() instanceof CPacketPlayer)) return;
        }
        if (!this.Field15261) return;
        this.Field15258.add(class805.Method982());
        class805.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 48;
            cArray2[n] = (char)(cArray[n] ^ (0x63C9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

