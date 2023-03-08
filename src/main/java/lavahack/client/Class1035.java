//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import net.minecraft.network.*;
import net.minecraft.network.play.client.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001d" }, d2 = { "Lcom/kisman/cc/features/module/movement/AutoPacketFly;", "Lcom/kisman/cc/features/module/Module;", "()V", "flyTime", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "flyTimer", "Lcom/kisman/cc/util/TimerUtils;", "ground", "groundPacket", "instantJump", "iterations", "", "iterationsLimit", "prevFactor", "", "stage", "Lcom/kisman/cc/features/module/movement/AutoPacketFly$Stage;", "takeoffDelay", "takeoffFactor", "takeoffLogic", "takeoffStopMoving", "takeoffTimer", "onDisable", "", "onEnable", "update", "Stage", "TakeoffLogic", "kisman.cc" })
public final class Class1035 extends Class42
{
    private final Class44 Field12541;
    private final Class44 Field12542;
    private final Class44 Field12543;
    private final Class44 Field12544;
    private final Class44 Field12545;
    private final Class44 Field12546;
    private final Class44 Field12547;
    private final Class44 Field12548;
    private final Class44 Field12549;
    private final Class650 Field12550;
    private final Class650 Field12551;
    private Class644 Field12552;
    private int Field12553;
    private double Field12554;
    private int Field12555;
    
    @Override
    public void Method38() {
        super.Method38();
        if (Method4186().player == null || Method4186().world == null) {
            this.Method22();
            return;
        }
        this.Field12553 = 0;
        this.Field12554 = Double.longBitsToDouble((long)1250046270 ^ 0xBFF000004A82313EL);
        this.Field12550.Method2801();
        this.Field12552 = Class644.Field10776;
    }
    
    @Override
    public void Method39() {
        super.Method39();
        final Object o = null;
        Intrinsics.checkExpressionValueIsNotNull(o, "PacketFly.instance");
        if (((Class42)o).Method35()) {
            null.Method22();
        }
        if (Method4186().player == null || Method4186().world == null) {
            return;
        }
        Method4186().gameSettings.keyBindForward.pressed = false;
    }
    
    @Override
    public void Method45() {
        if (Method4186().player == null || Method4186().world == null) {
            return;
        }
        if (this.Field12552 == Class644.Field10776) {
            if (Method4186().player.onGround) {
                Method4186().player.jump();
            }
            if (this.Field12554 != Double.longBitsToDouble((long)1568658803 ^ 0xBFF000005D7FD573L)) {
                final Class44 field8736 = null.Field8736;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8736, "PacketFly.instance.factor");
                field8736.Method370(this.Field12554);
            }
            Method4186().gameSettings.keyBindForward.pressed = true;
            final Class42 class42 = null;
            Intrinsics.checkExpressionValueIsNotNull((Object)class42, "PacketFly.instance");
            if (!class42.Method35()) {
                null.Method22();
            }
            this.Field12552 = Class644.Field10777;
        }
        else if (this.Field12552 == Class644.Field10777) {
            final Class44 field8737 = this.Field12549;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8737, "instantJump");
            if (field8737.Method365() || Method4186().player.motionY == 0.0) {
                this.Field12552 = Class644.Field10778;
            }
        }
        else if (this.Field12552 == Class644.Field10778) {
            Method4186().gameSettings.keyBindForward.pressed = true;
            final Class650 field8738 = this.Field12550;
            final Class44 field8739 = this.Field12541;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8739, "flyTime");
            if (field8738.Method2797(field8739.Method369())) {
                this.Field12551.Method2801();
                this.Field12552 = Class644.Field10779;
            }
        }
        else if (this.Field12552 == Class644.Field10779) {
            final Class44 field8740 = null.Field8736;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8740, "PacketFly.instance.factor");
            this.Field12554 = field8740.Method367();
            this.Field12552 = Class644.Field10780;
        }
        else if (this.Field12552 == Class644.Field10780) {
            this.Field12553++;
            final int field8741 = this.Field12553;
            final Class44 field8742 = this.Field12548;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8742, "iterationsLimit");
            if (field8741 >= field8742.Method335()) {
                this.Method22();
                return;
            }
            final Class44 field8743 = this.Field12545;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8743, "takeoffLogic");
            if (field8743.Method341() == Class2091.Field17542) {
                final Object o = null;
                Intrinsics.checkExpressionValueIsNotNull(o, "PacketFly.instance");
                if (((Class42)o).Method35()) {
                    null.Method22();
                }
                this.Field12554 = Double.longBitsToDouble(-4616189618054758400L);
            }
            else {
                final Class44 field8744 = this.Field12545;
                Intrinsics.checkExpressionValueIsNotNull((Object)field8744, "takeoffLogic");
                if (field8744.Method341() == Class2091.Field17543) {
                    final Class44 field8745 = null.Field8736;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field8745, "PacketFly.instance.factor");
                    final Class44 field8746 = this.Field12546;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field8746, "takeoffFactor");
                    field8745.Method370(field8746.Method367());
                }
            }
            final Class44 field8747 = this.Field12544;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8747, "groundPacket");
            if (field8747.Method365()) {
                Method4186().player.connection.sendPacket((Packet)new CPacketPlayer$Position(Method4186().player.posX, Method4186().player.posY, Method4186().player.posZ, true));
            }
            final Class44 field8748 = this.Field12543;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8748, "ground");
            if (field8748.Method365()) {
                Method4186().player.onGround = true;
            }
            final Class44 field8749 = this.Field12547;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8749, "takeoffStopMoving");
            if (field8749.Method365()) {
                Method4186().gameSettings.keyBindForward.pressed = false;
            }
            final Class650 field8750 = this.Field12551;
            final Class44 field8751 = this.Field12542;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8751, "takeoffDelay");
            if (field8750.Method2797(field8751.Method369())) {
                this.Field12550.Method2801();
                this.Field12552 = Class644.Field10776;
            }
        }
    }
    
    public Class1035() {
        super("AutoPacketFly", "fly for crystalpvp.cc", Class97.Field8340);
        this.Field12541 = this.Method23(new Class44("Fly Time", this, Double.longBitsToDouble(4656510908468559872L), Double.longBitsToDouble((long)1943303984 ^ 0x407F400073D47730L), Double.longBitsToDouble((long)86191017 ^ 0x40C3880005232BA9L), Class467.Field9943));
        this.Field12542 = this.Method23(new Class44("Takeoff Delay", this, Double.longBitsToDouble((long)281028557 ^ 0x408F400010C027CDL), Double.longBitsToDouble(4647503709213818880L), Double.longBitsToDouble((long)44716202 ^ 0x40C3880002AA50AAL), Class467.Field9943));
        this.Field12543 = this.Method23(new Class44("Ground", this, true));
        this.Field12544 = this.Method23(new Class44("Ground Packet", this, true));
        this.Field12545 = this.Method23(new Class44("Takeoff Logic", this, Class2091.Field17542));
        this.Field12546 = this.Method23(new Class44("Takeoff Factor", this, 1.0, Double.longBitsToDouble((long)718472011 ^ 0x3FB99999B34A9AD1L), Double.longBitsToDouble((long)753544619 ^ 0x402400002CEA2DABL), false));
        this.Field12547 = this.Method23(new Class44("Takeoff Stop Moving", this, true));
        this.Field12548 = this.Method23(new Class44("Iterations Limit", this, 0.0, 0.0, Double.longBitsToDouble((long)268744822 ^ 0x402400001004B876L), true));
        this.Field12549 = this.Method23(new Class44("Instant Jump", this, true));
        this.Field12550 = new Class650();
        this.Field12551 = new Class650();
        this.Field12552 = Class644.Field10778;
        this.Field12554 = Double.longBitsToDouble((long)1364824244 ^ 0xBFF00000515990B4L);
    }
    
    public static final Minecraft Method4186() {
        return Class42.Field8052;
    }
    
    public static final void Method4187(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x58B6 ^ 0x67));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
