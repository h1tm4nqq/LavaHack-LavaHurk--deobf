//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.settings.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.util.*;
import kotlin.*;
import net.minecraft.item.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import javax.vecmath.*;
import com.kisman.cc.util.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J \u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u001dH\u0002J\b\u0010?\u001a\u000208H\u0016J\b\u0010@\u001a\u000208H\u0016J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020CH\u0007J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0016H\u0002J\b\u0010G\u001a\u000208H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e?\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\f?\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0019\u0010&\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0019\u0010(\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0016\u0010*\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00100\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00101\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00102\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00103\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00104\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060\fX\u0082\u0004?\u0006\u0002\n\u0000?\u0006H" }, d2 = { "Lcom/kisman/cc/features/module/client/Changer;", "Lcom/kisman/cc/features/module/Module;", "()V", "ambience", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "ambienceColor", "ambienceGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "animation", "animationGroup", "animationListener", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventArmSwingAnimationEnd;", "animationSpeed", "aspect", "aspectEvent", "Lcom/kisman/cc/event/events/EventAspect;", "aspectGroup", "aspectHeight", "aspectWidth", "circle", "", "customFog", "customFogColor", "customFogGroup", "fov", "gamma", "oldFov", "", "receive", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "getReceive", "()Lme/zero/alpine/listener/Listener;", "shadowTextModifier", "getShadowTextModifier", "()Lcom/kisman/cc/settings/Setting;", "shadowTextModifierGroup", "shadowX", "getShadowX", "shadowY", "getShadowY", "swing", "swingGroup", "swingHand", "time", "timeGroup", "timeInfCircle", "timeSpeed", "timeVal", "timer", "timerGroup", "timerSpeed", "updateLightmap", "Lcom/kisman/cc/event/events/EventUpdateLightmap$Post;", "doSwing", "", "doTimer", "mix", "Ljavax/vecmath/Vector3f;", "first", "second", "factor", "onDisable", "onEnable", "onFog", "event", "Lnet/minecraftforge/client/event/EntityViewRenderEvent$FogColors;", "toRGBAArray", "", "colorBuffer", "update", "kisman.cc" })
public final class Class1783 extends Class42
{
    private static final Class44 Field16164;
    private static final Class44 Field16165;
    private static final Class1996 Field16166;
    private static final Class44 Field16167;
    private static final Class44 Field16168;
    private static final Class1996 Field16169;
    private static final Class44 Field16170;
    private static final Class44 Field16171;
    private static final Class44 Field16172;
    private static final Class44 Field16173;
    private static final Class1996 Field16174;
    private static final Class44 Field16175;
    private static final Class44 Field16176;
    private static final Class44 Field16177;
    private static final Class1996 Field16178;
    private static final Class44 Field16179;
    private static final Class44 Field16180;
    private static final Class1996 Field16181;
    private static final Class44 Field16182;
    private static final Class44 Field16183;
    private static final Class1996 Field16184;
    private static final Class44 Field16185;
    private static final Class44 Field16186;
    private static final Class1996 Field16187;
    private static final Class44 Field16188;
    private static final Class44 Field16189;
    private static final Class44 Field16190;
    private static final Class1996 Field16191;
    private static final Class44 Field16192;
    private static final Class44 Field16193;
    private static int Field16194;
    private static float Field16195;
    private static final Class618 Field16196;
    private static final Class618 Field16197;
    @NotNull
    private static final Class618 Field16198;
    private static final Class618 Field16199;
    public static final Class1783 Field16200;
    private String Field16201 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final Class44 Method6746() {
        return Class1783.Field16188;
    }
    
    public final Class44 Method6747() {
        return Class1783.Field16189;
    }
    
    public final Class44 Method6748() {
        return Class1783.Field16190;
    }
    
    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(Class1783.Field16198);
        Class1796.Field16242.Method706(Class1783.Field16199);
        Class1796.Field16242.Method706(Class1783.Field16197);
        Class1796.Field16242.Method706(Class1783.Field16196);
        Class1783.Field16195 = Method6755().gameSettings.fovSetting;
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(Class1783.Field16196);
        Class1796.Field16242.Method711(Class1783.Field16197);
        Class1796.Field16242.Method711(Class1783.Field16199);
        Class1796.Field16242.Method711(Class1783.Field16198);
        Method6755().timer.tickLength = Float.intBitsToFloat(1112014848);
        Method6755().gameSettings.gammaSetting = 1.0f;
        Method6755().gameSettings.fovSetting = Class1783.Field16195;
        if (Method6755().player == null || Method6755().world == null) {
            return;
        }
        Method6755().player.swingingHand = EnumHand.MAIN_HAND;
    }
    
    @Override
    public void Method45() {
        if (Method6755().player == null || Method6755().world == null) {
            Method6755().timer.tickLength = Float.intBitsToFloat(1112014848);
            return;
        }
        final GameSettings gameSettings = Method6755().gameSettings;
        final Class44 field16164 = Class1783.Field16164;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16164, "gamma");
        gameSettings.gammaSetting = field16164.Method368();
        final GameSettings gameSettings2 = Method6755().gameSettings;
        final Class44 field16165 = Class1783.Field16165;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16165, "fov");
        gameSettings2.fovSetting = field16165.Method368();
        final Class44 field16166 = Class1783.Field16170;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16166, "time");
        if (field16166.Method365()) {
            final int field16167 = Class1783.Field16194;
            final Class44 field16168 = Class1783.Field16173;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16168, "timeSpeed");
            Class1783.Field16194 = field16167 + field16168.Method335();
            final WorldClient world = Method6755().world;
            Intrinsics.checkExpressionValueIsNotNull((Object)world, "mc.world");
            final Class44 field16169 = Class1783.Field16172;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16169, "timeInfCircle");
            long n;
            if (field16169.Method365()) {
                n = Class1783.Field16194;
            }
            else {
                final Class44 field16170 = Class1783.Field16171;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16170, "timeVal");
                n = field16170.Method369() * 1000L;
            }
            world.setWorldTime(n);
            if (Class1783.Field16194 >= 24000) {
                Class1783.Field16194 = 0;
            }
        }
        this.Method6750();
        this.Method6749();
    }
    
    private final void Method6749() {
        final Class44 field16192 = Class1783.Field16192;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16192, "timer");
        if (field16192.Method365()) {
            final Timer timer = Method6755().timer;
            final float intBitsToFloat = Float.intBitsToFloat(1112014848);
            final Class44 field16193 = Class1783.Field16193;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16193, "timerSpeed");
            timer.tickLength = intBitsToFloat / Class1047.Method4280(field16193.Method368(), Float.intBitsToFloat(1036831949));
        }
        else {
            Method6755().timer.tickLength = Float.intBitsToFloat(1112014848);
        }
    }
    
    private final void Method6750() {
        final Class44 field16182 = Class1783.Field16182;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16182, "swing");
        if (field16182.Method365()) {
            final Class44 field16183 = Class1783.Field16183;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16183, "swingHand");
            final Enum method341 = field16183.Method341();
            if (method341 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SwingHands");
            }
            switch (Class1474.Field14877[((Class1991)method341).ordinal()]) {
                case 1: {
                    Method6755().player.swingingHand = EnumHand.MAIN_HAND;
                    break;
                }
                case 2: {
                    Method6755().player.swingingHand = EnumHand.OFF_HAND;
                    break;
                }
                case 3: {
                    final EntityPlayerSP player = Method6755().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
                    if (player.getHeldItemMainhand().item instanceof ItemSword && Method6755().entityRenderer.itemRenderer.prevEquippedProgressMainHand >= Double.longBitsToDouble((long)543815809 ^ 0x3FECCCCCECA5344CL)) {
                        Method6755().entityRenderer.itemRenderer.equippedProgressMainHand = 1.0f;
                        final ItemRenderer itemRenderer = Method6755().entityRenderer.itemRenderer;
                        final EntityPlayerSP player2 = Method6755().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                        itemRenderer.itemStackMainHand = player2.getHeldItemMainhand();
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method6751(@NotNull @NotNull final EntityViewRenderEvent$FogColors entityViewRenderEvent$FogColors) {
        Intrinsics.checkParameterIsNotNull((Object)entityViewRenderEvent$FogColors, "event");
        final Class44 field16179 = Class1783.Field16179;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16179, "customFog");
        if (field16179.Method365()) {
            final Class44 field16180 = Class1783.Field16180;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16180, "customFogColor");
            entityViewRenderEvent$FogColors.setRed(field16180.Method339().Field17325);
            final Class44 field16181 = Class1783.Field16180;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16181, "customFogColor");
            entityViewRenderEvent$FogColors.setGreen(field16181.Method339().Field17326);
            final Class44 field16182 = Class1783.Field16180;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16182, "customFogColor");
            entityViewRenderEvent$FogColors.setBlue(field16182.Method339().Field17327);
        }
    }
    
    @NotNull
    @NotNull
    public final Class618 Method6752() {
        return Class1783.Field16198;
    }
    
    private final int[] Method6753(final int n) {
        return new int[] { n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF };
    }
    
    private final Vector3f Method6754(final Vector3f vector3f, final Vector3f vector3f2, final float n) {
        return new Vector3f(vector3f.x * (1.0f - n) + vector3f2.x * n, vector3f.y * (1.0f - n) + vector3f2.y * n, vector3f.z * (1.0f - n) + vector3f.z * n);
    }
    
    private Class1783() {
        super("Changer", "Changes your minecraft", Class97.Field8339);
    }
    
    static {
        final Class1783 class1783 = Field16200 = new Class1783();
        Field16164 = class1783.Method23(new Class44("Gamma", class1783, Double.longBitsToDouble((long)897229327 ^ 0x40590000357AA20FL), 1.0, Double.longBitsToDouble((long)2015487023 ^ 0x405900007821E42FL), true));
        Field16165 = class1783.Method23(new Class44("Fov", class1783, Double.longBitsToDouble(4638144666238189568L), Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4639481672377565184L), true));
        Field16166 = class1783.Method24(new Class1996(new Class44("Ambience", class1783)));
        Field16167 = class1783.Method23(Class1783.Field16166.Method7405(new Class44("Ambience", class1783, false)));
        final Class1783 class1784 = class1783;
        final Class1996 field16166 = Class1783.Field16166;
        final Class44 method312 = new Class44("Ambience Color", class1783, "Color", new Class2027(-1)).Method312(Class1783.Field16167);
        Intrinsics.checkExpressionValueIsNotNull((Object)method312, "Setting(\"Ambience Color\"\u2026-1)).setVisible(ambience)");
        Field16168 = class1784.Method23(field16166.Method7405(method312));
        Field16169 = class1783.Method24(new Class1996(new Class44("Time", class1783)));
        Field16170 = class1783.Method23(Class1783.Field16169.Method7405(new Class44("Time", class1783, false)));
        final Class1783 class1785 = class1783;
        final Class1996 field16167 = Class1783.Field16169;
        final Class44 method313 = new Class44("Time Value", class1783, Double.longBitsToDouble((long)1184330047 ^ 0x403800004697713FL), Double.longBitsToDouble((long)905603667 ^ 0x4014000035FA6A53L), Double.longBitsToDouble(4627730092099895296L), true).Method312(Class1783.Field16170).Method355("Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method313, "Setting(\"Time Value\", th\u2026e(time).setTitle(\"Value\")");
        Field16171 = class1785.Method23(field16167.Method7405(method313));
        final Class1783 class1786 = class1783;
        final Class1996 field16168 = Class1783.Field16169;
        final Class44 method314 = new Class44("Time Infinity Circle", class1783, true).Method312(Class1783.Field16170).Method355("Infinity Circle");
        Intrinsics.checkExpressionValueIsNotNull((Object)method314, "Setting(\"Time Infinity C\u2026tTitle(\"Infinity Circle\")");
        Field16172 = class1786.Method23(field16168.Method7405(method314));
        final Class1783 class1787 = class1783;
        final Class1996 field16169 = Class1783.Field16169;
        final Class44 method315 = new Class44("Time Speed", class1783, Double.longBitsToDouble((long)317772339 ^ 0x4059000012F0D233L), Double.longBitsToDouble((long)125756394 ^ 0x40240000077EE3EAL), Double.longBitsToDouble(4652007308841189376L), Class467.Field9943).Method312(Class1783.Field16170).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)method315, "Setting(\"Time Speed\", th\u2026e(time).setTitle(\"Speed\")");
        Field16173 = class1787.Method23(field16169.Method7405(method315));
        Field16174 = class1783.Method24(new Class1996(new Class44("Aspect", class1783)));
        Field16175 = class1783.Method23(Class1783.Field16174.Method7405(new Class44("Aspect", class1783, false)));
        final Class1783 class1788 = class1783;
        final Class1996 field16170 = Class1783.Field16174;
        final Class44 method316 = new Class44("Aspect Width", class1783, Double.longBitsToDouble((long)827171853 ^ 0x40100000314DA40DL), 1.0, Double.longBitsToDouble((long)1167118118 ^ 0x402400004590CF26L), true).Method312(Class1783.Field16175).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)method316, "Setting(\"Aspect Width\", \u2026aspect).setTitle(\"Width\")");
        Field16176 = class1788.Method23(field16170.Method7405(method316));
        final Class1783 class1789 = class1783;
        final Class1996 field16171 = Class1783.Field16174;
        final Class44 method317 = new Class44("Aspect Height", class1783, Double.longBitsToDouble(4613937818241073152L), 1.0, Double.longBitsToDouble(4621819117588971520L), true).Method312(Class1783.Field16175).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)method317, "Setting(\"Aspect Height\",\u2026spect).setTitle(\"Height\")");
        Field16177 = class1789.Method23(field16171.Method7405(method317));
        Field16178 = class1783.Method24(new Class1996(new Class44("Custom Fog", class1783)));
        Field16179 = class1783.Method23(Class1783.Field16178.Method7405(new Class44("Custom Fog", class1783, false)));
        final Class1783 class1790 = class1783;
        final Class1996 field16172 = Class1783.Field16178;
        final Class44 method318 = new Class44("Custom Fog Color", class1783, "Custom Fog Color", new Class2027(-1)).Method312(Class1783.Field16179).Method355("Color");
        Intrinsics.checkExpressionValueIsNotNull((Object)method318, "Setting(\"Custom Fog Colo\u2026tomFog).setTitle(\"Color\")");
        Field16180 = class1790.Method23(field16172.Method7405(method318));
        Field16181 = class1783.Method24(new Class1996(new Class44("Swing", class1783)));
        Field16182 = class1783.Method23(Class1783.Field16181.Method7405(new Class44("Swing", class1783, false)));
        final Class1783 class1791 = class1783;
        final Class1996 field16173 = Class1783.Field16181;
        final Class44 method319 = new Class44("Swing Hand", class1783, Class1991.Field17156).Method312(Class1783.Field16182).Method355("Hand");
        Intrinsics.checkExpressionValueIsNotNull((Object)method319, "Setting(\"Swing Hand\", th\u2026e(swing).setTitle(\"Hand\")");
        Field16183 = class1791.Method23(field16173.Method7405(method319));
        Field16184 = class1783.Method24(new Class1996(new Class44("Animation", class1783)));
        Field16185 = class1783.Method23(Class1783.Field16184.Method7405(new Class44("Animation", class1783, false)));
        final Class1783 class1792 = class1783;
        final Class1996 field16174 = Class1783.Field16184;
        final Class44 method320 = new Class44("Animation Speed", class1783, Double.longBitsToDouble((long)1016404686 ^ 0x402A00003C951ACEL), 1.0, Double.longBitsToDouble((long)1320729271 ^ 0x403400004EB8BAB7L), true).Method312(Class1783.Field16185).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)method320, "Setting(\"Animation Speed\u2026mation).setTitle(\"Speed\")");
        Field16186 = class1792.Method23(field16174.Method7405(method320));
        Field16187 = class1783.Method24(new Class1996(new Class44("Shadow Text Mod", class1783)));
        final Class1783 class1793 = class1783;
        final Class1996 field16175 = Class1783.Field16187;
        final Class44 method321 = new Class44("Shadow Text Modifier", class1783, false).Method355("Modify");
        Intrinsics.checkExpressionValueIsNotNull((Object)method321, "Setting(\"Shadow Text Mod\u2026false).setTitle(\"Modify\")");
        Field16188 = class1793.Method23(field16175.Method7405(method321));
        final Class1783 class1794 = class1783;
        final Class1996 field16176 = Class1783.Field16187;
        final Class44 method322 = new Class44("Shadow X", class1783, 1.0, 0.0, Double.longBitsToDouble((long)1253903570 ^ 0x400000004ABD0CD2L), false).Method312(Class1783.Field16188);
        Intrinsics.checkExpressionValueIsNotNull((Object)method322, "Setting(\"Shadow X\", this\u2026sible(shadowTextModifier)");
        Field16189 = class1794.Method23(field16176.Method7405(method322));
        final Class1783 class1795 = class1783;
        final Class1996 field16177 = Class1783.Field16187;
        final Class44 method323 = new Class44("Shadow Y", class1783, 1.0, 0.0, Double.longBitsToDouble(4611686018427387904L), false).Method312(Class1783.Field16188);
        Intrinsics.checkExpressionValueIsNotNull((Object)method323, "Setting(\"Shadow Y\", this\u2026sible(shadowTextModifier)");
        Field16190 = class1795.Method23(field16177.Method7405(method323));
        Field16191 = class1783.Method24(new Class1996(new Class44("Timer", class1783)));
        Field16192 = class1783.Method23(Class1783.Field16191.Method7405(new Class44("Timer", class1783, false)));
        final Class1783 class1796 = class1783;
        final Class1996 field16178 = Class1783.Field16191;
        final Class44 method324 = new Class44("Timer Speed", class1783, Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble((long)1473772684 ^ 0x3FB99999CE4E6516L), Double.longBitsToDouble(4621819117588971520L), false).Method312(Class1783.Field16192).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)method324, "Setting(\"Timer Speed\", t\u2026(timer).setTitle(\"Speed\")");
        Field16193 = class1796.Method23(field16178.Method7405(method324));
        Field16196 = new Class618((Class254)Class1756.Field16048, new Predicate[0]);
        Field16197 = new Class618(Class826.Field11520, new Predicate[0]);
        Field16198 = new Class618((Class254)Class1750.Field16028, new Predicate[0]);
        Field16199 = new Class618(Class2097.Field17556, new Predicate[0]);
    }
    
    public static final Minecraft Method6755() {
        return Class42.Field8052;
    }
    
    public static final void Method6756(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method6757(final Class1783 class1783) {
        return Class1783.Field16185;
    }
    
    public static final Class44 Method6758(final Class1783 class1783) {
        return Class1783.Field16186;
    }
    
    public static final Class44 Method6759(final Class1783 class1783) {
        return Class1783.Field16175;
    }
    
    public static final Class44 Method6760(final Class1783 class1783) {
        return Class1783.Field16176;
    }
    
    public static final Class44 Method6761(final Class1783 class1783) {
        return Class1783.Field16177;
    }
    
    public static final Class44 Method6762(final Class1783 class1783) {
        return Class1783.Field16170;
    }
    
    public static final Class44 Method6763(final Class1783 class1783) {
        return Class1783.Field16167;
    }
    
    public static final Class44 Method6764(final Class1783 class1783) {
        return Class1783.Field16168;
    }
    
    public static final int[] Method6765(final Class1783 class1783, final int n) {
        return class1783.Method6753(n);
    }
    
    public static final Vector3f Method6766(final Class1783 class1783, final Vector3f vector3f, final Vector3f vector3f2, final float n) {
        return class1783.Method6754(vector3f, vector3f2, n);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD07 ^ 0xF5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
