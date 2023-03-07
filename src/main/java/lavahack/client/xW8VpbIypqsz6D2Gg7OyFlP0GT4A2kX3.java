//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2={"Lcom/kisman/cc/features/module/movement/AutoPacketFly;", "Lcom/kisman/cc/features/module/Module;", "()V", "flyTime", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "flyTimer", "Lcom/kisman/cc/util/TimerUtils;", "ground", "groundPacket", "instantJump", "iterations", "", "iterationsLimit", "prevFactor", "", "stage", "Lcom/kisman/cc/features/module/movement/AutoPacketFly$Stage;", "takeoffDelay", "takeoffFactor", "takeoffLogic", "takeoffStopMoving", "takeoffTimer", "onDisable", "", "onEnable", "update", "Stage", "TakeoffLogic", "kisman.cc"})
public final class xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12541 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fly Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x9A409A51E5A7769EL ^ 0xDADFDA51E5A7769EL), Double.longBitsToDouble((long)1943303984 ^ 0x407F400073D47730L), Double.longBitsToDouble((long)86191017 ^ 0x40C3880005232BA9L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12542 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Takeoff Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)281028557 ^ 0x408F400010C027CDL), Double.longBitsToDouble(0x34382305942D10A1L ^ 0x74476305942D10A1L), Double.longBitsToDouble((long)44716202 ^ 0x40C3880002AA50AAL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12543 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ground", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-616932867 ^ (long)-616932868)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12544 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ground Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1654725097 ^ (long)-1654725098)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12545 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Takeoff Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field17542));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12546 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Takeoff Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, Double.longBitsToDouble((long)718472011 ^ 0x3FB99999B34A9AD1L), Double.longBitsToDouble((long)753544619 ^ 0x402400002CEA2DABL), ((int)-1628981116L ^ 0x9EE7B884) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12547 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Takeoff Stop Moving", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2114128671L ^ 0x81FCF4E0) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12548 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Iterations Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)268744822 ^ 0x402400001004B876L), (boolean)((long)729041060 ^ (long)729041061)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12549 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant Jump", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-119030527L ^ 0xF8E7BD00) != 0));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12550 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field12551 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12552 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10778;
    private int Field12553;
    private double Field12554 = Double.longBitsToDouble((long)1364824244 ^ 0xBFF00000515990B4L);
    private int Field12555;

    @Override
    public void Method38() {
        super.Method38();
        if (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player != null && xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().world != null) {
            this.Field12553 = (int)-2002435560L ^ 0x88A54218;
            this.Field12554 = Double.longBitsToDouble((long)1250046270 ^ 0xBFF000004A82313EL);
            this.Field12550.Method2801();
            this.Field12552 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10776;
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Intrinsics.checkExpressionValueIsNotNull(null, (String)"PacketFly.instance");
        if (((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35()) {
            ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method22();
        }
        if (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player == null) return;
        if (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().world == null) {
            return;
        }
        xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().gameSettings.keyBindForward.pressed = (int)-1617165572L ^ 0x9F9C02FC;
    }

    @Override
    public void Method45() {
        if (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player == null) return;
        if (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().world == null) {
            return;
        }
        if (this.Field12552 == xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10776) {
            if (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.onGround) {
                xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.jump();
            }
            if (this.Field12554 != Double.longBitsToDouble((long)1568658803 ^ 0xBFF000005D7FD573L)) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = null.Field8736;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"PacketFly.instance.factor");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method370(this.Field12554);
            }
            xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().gameSettings.keyBindForward.pressed = (int)518108287L ^ 0x1EE1B47E;
            Intrinsics.checkExpressionValueIsNotNull(null, (String)"PacketFly.instance");
            if (!((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35()) {
                ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method22();
            }
            this.Field12552 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10777;
            return;
        }
        if (this.Field12552 == xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10777) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field12549;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"instantJump");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
                if (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.motionY != 0.0) return;
            }
            this.Field12552 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10778;
            return;
        }
        if (this.Field12552 == xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10778) {
            xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().gameSettings.keyBindForward.pressed = (int)((long)1786163057 ^ (long)1786163056);
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field12541;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"flyTime");
            if (!this.Field12550.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method369())) return;
            this.Field12551.Method2801();
            this.Field12552 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10779;
            return;
        }
        if (this.Field12552 == xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10779) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = null.Field8736;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"PacketFly.instance.factor");
            this.Field12554 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method367();
            this.Field12552 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10780;
            return;
        }
        if (this.Field12552 != xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10780) return;
        int n = this.Field12553;
        this.Field12553 = n + ((int)-736900013L ^ 0xD413CC52);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field12548;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"iterationsLimit");
        if (this.Field12553 >= qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method335()) {
            this.Method22();
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field12545;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"takeoffLogic");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method341() == xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field17542) {
            Intrinsics.checkExpressionValueIsNotNull(null, (String)"PacketFly.instance");
            if (((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method35()) {
                ((WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)null).Method22();
            }
            this.Field12554 = Double.longBitsToDouble(0xD3738B546A8CD7E3L ^ 0x6C838B546A8CD7E3L);
        } else {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field12545;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"takeoffLogic");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method341() == xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field17543) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = null.Field8736;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"PacketFly.instance.factor");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field12546;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"takeoffFactor");
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method370(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method367());
            }
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = this.Field12544;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"groundPacket");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method365()) {
            xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.connection.sendPacket((Packet)new CPacketPlayer.Position(xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.posX, xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.posY, xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.posZ, (boolean)((long)-654366607 ^ (long)-654366608)));
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = this.Field12543;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"ground");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method365()) {
            xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().player.onGround = (int)((long)472493630 ^ (long)472493631);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = this.Field12547;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"takeoffStopMoving");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13.Method365()) {
            xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.Method4186().gameSettings.keyBindForward.pressed = (int)((long)-1819908570 ^ (long)-1819908570);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = this.Field12542;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"takeoffDelay");
        if (!this.Field12551.Method2797(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14.Method369())) return;
        this.Field12550.Method2801();
        this.Field12552 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10776;
    }

    public xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3() {
        super("AutoPacketFly", "fly for crystalpvp.cc", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    public static final Minecraft Method4186() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method4187(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-261400122L ^ 0xF06B59C6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1414722112 ^ (long)-1414722241);
            int n2 = (int)2044927674L ^ 0x79E31EDD;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)30132683 ^ (long)30139792) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

