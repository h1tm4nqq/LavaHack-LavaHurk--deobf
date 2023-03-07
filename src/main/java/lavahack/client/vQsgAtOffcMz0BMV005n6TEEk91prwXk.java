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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8;
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

public class vQsgAtOffcMz0BMV005n6TEEk91prwXk
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15256 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Teleport", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (int)((long)1644783625 ^ (long)1644783644) << 1));
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field15257 = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this).Method3788().Method3789();
    private final Queue Field15258 = new LinkedList();
    private SPacketPlayerPosLook Field15259 = null;
    private BlockPos Field15260 = null;
    private boolean Field15261 = (int)((long)1715034364 ^ (long)1715034364);
    private boolean Field15262 = (int)((long)-2032221943 ^ (long)-2032221943);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field15263 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6134, new Predicate[(int)413248896L ^ 0x18A1AD80]);
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field15264 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method6133, new Predicate[(int)-2065541435L ^ 0x84E256C5]);
    private int Field15265;

    public vQsgAtOffcMz0BMV005n6TEEk91prwXk() {
        super("ChorusDelay", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6130(LivingEntityUseItemEvent.Finish finish) {
        if (finish.getEntity() != vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player) return;
        if (finish.getItem().getItem() != Items.CHORUS_FRUIT) return;
        this.Field15261 = (int)1846100183L ^ 0x6E0940D6;
        this.Field15260 = vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition();
        this.Field15262 = (int)((long)1999548856 ^ (long)1999548856);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6131(RenderWorldLastEvent renderWorldLastEvent) {
        if (this.Field15259 == null) return;
        if (!this.Field15261) return;
        tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8 tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg82 = tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8.Field16968.Method6696(vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getEntityBoundingBox());
        tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg82.Method7193(new Vec3d(this.Field15259.x, this.Field15259.y, this.Field15259.z));
        this.Field15257.Method3804(tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg82.Method7190());
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field15263);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field15264);
        this.Method20();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field15264);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field15263);
        this.Method20();
    }

    @Override
    public void Method45() {
        if (vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field15261) return;
        if (!vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPosition().equals((Object)this.Field15260) && !this.Field15262 && vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance((double)this.Field15260.getX(), (double)this.Field15260.getY(), (double)this.Field15260.getZ()) > 1.0) {
            vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition((double)((float)this.Field15260.getX() + Float.intBitsToFloat((int)((long)1127274386 ^ (long)2083575698))), (double)this.Field15260.getY(), (double)((float)this.Field15260.getZ() + Float.intBitsToFloat((int)((long)1166358127 ^ (long)2055550575))));
            this.Field15262 = (int)((long)1471753370 ^ (long)1471753371);
        }
        if (!Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method7142(this.Field15256)) return;
        this.Method6132();
    }

    private void Method20() {
        this.Field15261 = (int)1343775977L ^ 0x501864E9;
        this.Field15259 = null;
        this.Field15262 = (int)((long)1123173047 ^ (long)1123173047);
        this.Field15260 = null;
    }

    private void Method6132() {
        this.Method20();
        while (!this.Field15258.isEmpty()) {
            vQsgAtOffcMz0BMV005n6TEEk91prwXk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)this.Field15258.poll());
        }
    }

    private void Method6133(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982() instanceof SPacketPlayerPosLook)) return;
        this.Field15259 = (SPacketPlayerPosLook)tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method982();
    }

    private void Method6134(TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV) {
        if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketConfirmTeleport)) {
            if (!(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982() instanceof CPacketPlayer)) return;
        }
        if (!this.Field15261) return;
        this.Field15258.add(tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method982());
        tAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)332979704L ^ 0x13D8DDF8;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1575769204 ^ (long)1575769227);
            int n2 = ((int)1180041169L ^ 0x4655FFD2) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)1467223619L ^ 0x57746D8A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

