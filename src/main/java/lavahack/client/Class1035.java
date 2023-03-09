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

import com.kisman.cc.util.Class650;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class2091;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class644;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2={"Lcom/kisman/cc/features/module/movement/AutoPacketFly;", "Lcom/kisman/cc/features/module/Module;", "()V", "flyTime", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "flyTimer", "Lcom/kisman/cc/util/TimerUtils;", "ground", "groundPacket", "instantJump", "iterations", "", "iterationsLimit", "prevFactor", "", "stage", "Lcom/kisman/cc/features/module/movement/AutoPacketFly$Stage;", "takeoffDelay", "takeoffFactor", "takeoffLogic", "takeoffStopMoving", "takeoffTimer", "onDisable", "", "onEnable", "update", "Stage", "TakeoffLogic", "kisman.cc"})
public final class Class1035
extends Class42 {
    private final Class44 Field12541 = this.Method23(new Class44("Fly Time", (Class42)this, Double.longBitsToDouble(4656510908468559872L), Double.longBitsToDouble((long)1943303984 ^ 0x407F400073D47730L), Double.longBitsToDouble((long)86191017 ^ 0x40C3880005232BA9L), Class467.Field9943));
    private final Class44 Field12542 = this.Method23(new Class44("Takeoff Delay", (Class42)this, Double.longBitsToDouble((long)281028557 ^ 0x408F400010C027CDL), Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble((long)44716202 ^ 0x40C3880002AA50AAL), Class467.Field9943));
    private final Class44 Field12543 = this.Method23(new Class44("Ground", (Class42)this, true));
    private final Class44 Field12544 = this.Method23(new Class44("Ground Packet", (Class42)this, true));
    private final Class44 Field12545 = this.Method23(new Class44("Takeoff Logic", (Class42)this, Class2091.Field17542));
    private final Class44 Field12546 = this.Method23(new Class44("Takeoff Factor", (Class42)this, 1.0, Double.longBitsToDouble((long)718472011 ^ 0x3FB99999B34A9AD1L), Double.longBitsToDouble((long)753544619 ^ 0x402400002CEA2DABL), false));
    private final Class44 Field12547 = this.Method23(new Class44("Takeoff Stop Moving", (Class42)this, true));
    private final Class44 Field12548 = this.Method23(new Class44("Iterations Limit", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)268744822 ^ 0x402400001004B876L), true));
    private final Class44 Field12549 = this.Method23(new Class44("Instant Jump", (Class42)this, true));
    private final Class650 Field12550 = new Class650();
    private final Class650 Field12551 = new Class650();
    private Class644 Field12552 = Class644.Field10778;
    private int Field12553;
    private double Field12554 = Double.longBitsToDouble((long)1364824244 ^ 0xBFF00000515990B4L);
    private int Field12555;

    @Override
    public void Method38() {
        super.Method38();
        if (Class1035.Method4186().player != null && Class1035.Method4186().world != null) {
            this.Field12553 = 0;
            this.Field12554 = Double.longBitsToDouble((long)1250046270 ^ 0xBFF000004A82313EL);
            this.Field12550.Method2801();
            this.Field12552 = Class644.Field10776;
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Intrinsics.checkExpressionValueIsNotNull(null, (String)"PacketFly.instance");
        if (((Class42)null).Method35()) {
            ((Class42)null).Method22();
        }
        if (Class1035.Method4186().player == null) return;
        if (Class1035.Method4186().world == null) {
            return;
        }
        Class1035.Method4186().gameSettings.keyBindForward.pressed = false;
    }

    @Override
    public void Method45() {
        if (Class1035.Method4186().player == null) return;
        if (Class1035.Method4186().world == null) {
            return;
        }
        if (this.Field12552 == Class644.Field10776) {
            if (Class1035.Method4186().player.onGround) {
                Class1035.Method4186().player.jump();
            }
            if (this.Field12554 != Double.longBitsToDouble((long)1568658803 ^ 0xBFF000005D7FD573L)) {
                Class44 class44 = null.Field8736;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"PacketFly.instance.factor");
                class44.Method370(this.Field12554);
            }
            Class1035.Method4186().gameSettings.keyBindForward.pressed = true;
            Intrinsics.checkExpressionValueIsNotNull(null, (String)"PacketFly.instance");
            if (!((Class42)null).Method35()) {
                ((Class42)null).Method22();
            }
            this.Field12552 = Class644.Field10777;
            return;
        }
        if (this.Field12552 == Class644.Field10777) {
            Class44 class44 = this.Field12549;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"instantJump");
            if (!class44.Method365()) {
                if (Class1035.Method4186().player.motionY != 0.0) return;
            }
            this.Field12552 = Class644.Field10778;
            return;
        }
        if (this.Field12552 == Class644.Field10778) {
            Class1035.Method4186().gameSettings.keyBindForward.pressed = true;
            Class44 class44 = this.Field12541;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"flyTime");
            if (!this.Field12550.Method2797(class44.Method369())) return;
            this.Field12551.Method2801();
            this.Field12552 = Class644.Field10779;
            return;
        }
        if (this.Field12552 == Class644.Field10779) {
            Class44 class44 = null.Field8736;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"PacketFly.instance.factor");
            this.Field12554 = class44.Method367();
            this.Field12552 = Class644.Field10780;
            return;
        }
        if (this.Field12552 != Class644.Field10780) return;
        int n = this.Field12553;
        this.Field12553 = n + 1;
        Class44 class44 = this.Field12548;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"iterationsLimit");
        if (this.Field12553 >= class44.Method335()) {
            this.Method22();
            return;
        }
        Class44 class442 = this.Field12545;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"takeoffLogic");
        if (class442.Method341() == Class2091.Field17542) {
            Intrinsics.checkExpressionValueIsNotNull(null, (String)"PacketFly.instance");
            if (((Class42)null).Method35()) {
                ((Class42)null).Method22();
            }
            this.Field12554 = Double.longBitsToDouble(-4616189618054758400L);
        } else {
            Class44 class443 = this.Field12545;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"takeoffLogic");
            if (class443.Method341() == Class2091.Field17543) {
                Class44 class444 = null.Field8736;
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"PacketFly.instance.factor");
                Class44 class445 = this.Field12546;
                Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"takeoffFactor");
                class444.Method370(class445.Method367());
            }
        }
        Class44 class446 = this.Field12544;
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"groundPacket");
        if (class446.Method365()) {
            Class1035.Method4186().player.connection.sendPacket((Packet)new CPacketPlayer.Position(Class1035.Method4186().player.posX, Class1035.Method4186().player.posY, Class1035.Method4186().player.posZ, true));
        }
        Class44 class447 = this.Field12543;
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"ground");
        if (class447.Method365()) {
            Class1035.Method4186().player.onGround = true;
        }
        Class44 class448 = this.Field12547;
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"takeoffStopMoving");
        if (class448.Method365()) {
            Class1035.Method4186().gameSettings.keyBindForward.pressed = false;
        }
        Class44 class449 = this.Field12542;
        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"takeoffDelay");
        if (!this.Field12551.Method2797(class449.Method369())) return;
        this.Field12550.Method2801();
        this.Field12552 = Class644.Field10776;
    }

    public Class1035() {
        super("AutoPacketFly", "fly for crystalpvp.cc", Class97.Field8340);
    }

    public static final Minecraft Method4186() {
        return Class42.Field8052;
    }

    public static final void Method4187(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 103;
            cArray2[n] = (char)(cArray[n] ^ (0x58B6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

