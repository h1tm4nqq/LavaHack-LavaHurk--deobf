//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector3f
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.ItemRenderer
 *  net.minecraft.client.settings.GameSettings
 *  net.minecraft.item.ItemSword
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.Timer
 *  net.minecraftforge.client.event.EntityViewRenderEvent$FogColors
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.function.Predicate;
import javax.vecmath.Vector3f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1047;
import lavahack.client.Class1474;
import lavahack.client.Class1750;
import lavahack.client.Class1756;
import lavahack.client.Class1796;
import lavahack.client.Class1991;
import lavahack.client.Class1996;
import lavahack.client.Class2097;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class826;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Timer;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J \u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u001dH\u0002J\b\u0010?\u001a\u000208H\u0016J\b\u0010@\u001a\u000208H\u0016J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020CH\u0007J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0016H\u0002J\b\u0010G\u001a\u000208H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\"\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010&\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0019\u0010(\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0016\u0010*\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00100\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00101\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00102\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00103\u001a\n \u0005*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00104\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2={"Lcom/kisman/cc/features/module/client/Changer;", "Lcom/kisman/cc/features/module/Module;", "()V", "ambience", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "ambienceColor", "ambienceGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "animation", "animationGroup", "animationListener", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventArmSwingAnimationEnd;", "animationSpeed", "aspect", "aspectEvent", "Lcom/kisman/cc/event/events/EventAspect;", "aspectGroup", "aspectHeight", "aspectWidth", "circle", "", "customFog", "customFogColor", "customFogGroup", "fov", "gamma", "oldFov", "", "receive", "Lcom/kisman/cc/event/events/PacketEvent$Receive;", "getReceive", "()Lme/zero/alpine/listener/Listener;", "shadowTextModifier", "getShadowTextModifier", "()Lcom/kisman/cc/settings/Setting;", "shadowTextModifierGroup", "shadowX", "getShadowX", "shadowY", "getShadowY", "swing", "swingGroup", "swingHand", "time", "timeGroup", "timeInfCircle", "timeSpeed", "timeVal", "timer", "timerGroup", "timerSpeed", "updateLightmap", "Lcom/kisman/cc/event/events/EventUpdateLightmap$Post;", "doSwing", "", "doTimer", "mix", "Ljavax/vecmath/Vector3f;", "first", "second", "factor", "onDisable", "onEnable", "onFog", "event", "Lnet/minecraftforge/client/event/EntityViewRenderEvent$FogColors;", "toRGBAArray", "", "colorBuffer", "update", "kisman.cc"})
public final class Class1783
extends Class42 {
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
        return Field16188;
    }

    public final Class44 Method6747() {
        return Field16189;
    }

    public final Class44 Method6748() {
        return Field16190;
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(Field16198);
        Class1796.Field16242.Method706(Field16199);
        Class1796.Field16242.Method706(Field16197);
        Class1796.Field16242.Method706(Field16196);
        Field16195 = Class1783.Method6755().gameSettings.fovSetting;
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(Field16196);
        Class1796.Field16242.Method711(Field16197);
        Class1796.Field16242.Method711(Field16199);
        Class1796.Field16242.Method711(Field16198);
        Class1783.Method6755().timer.tickLength = Float.intBitsToFloat(1112014848);
        Class1783.Method6755().gameSettings.gammaSetting = 1.0f;
        Class1783.Method6755().gameSettings.fovSetting = Field16195;
        if (Class1783.Method6755().player == null) return;
        if (Class1783.Method6755().world == null) {
            return;
        }
        Class1783.Method6755().player.swingingHand = EnumHand.MAIN_HAND;
    }

    @Override
    public void Method45() {
        if (Class1783.Method6755().player == null || Class1783.Method6755().world == null) {
            Class1783.Method6755().timer.tickLength = Float.intBitsToFloat(1112014848);
            return;
        }
        GameSettings gameSettings = Class1783.Method6755().gameSettings;
        Class44 class44 = Field16164;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"gamma");
        gameSettings.gammaSetting = class44.Method368();
        GameSettings gameSettings2 = Class1783.Method6755().gameSettings;
        Class44 class442 = Field16165;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"fov");
        gameSettings2.fovSetting = class442.Method368();
        Class44 class443 = Field16170;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"time");
        if (class443.Method365()) {
            long l;
            Class44 class444 = Field16173;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"timeSpeed");
            Field16194 += class444.Method335();
            WorldClient worldClient = Class1783.Method6755().world;
            Intrinsics.checkExpressionValueIsNotNull((Object)worldClient, (String)"mc.world");
            Class44 class445 = Field16172;
            Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"timeInfCircle");
            if (class445.Method365()) {
                l = Field16194;
            } else {
                Class44 class446 = Field16171;
                Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"timeVal");
                l = class446.Method369() * 1000L;
            }
            worldClient.setWorldTime(l);
            if (Field16194 >= 24000) {
                Field16194 = 0;
            }
        }
        this.Method6750();
        this.Method6749();
    }

    private final void Method6749() {
        Class44 class44 = Field16192;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"timer");
        if (class44.Method365()) {
            Timer timer = Class1783.Method6755().timer;
            float f = Float.intBitsToFloat(1112014848);
            Class44 class442 = Field16193;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"timerSpeed");
            timer.tickLength = f / Class1047.Method4280(class442.Method368(), Float.intBitsToFloat(0x3DCCCCCD));
            return;
        }
        Class1783.Method6755().timer.tickLength = Float.intBitsToFloat(1112014848);
    }

    private final void Method6750() {
        Class44 class44 = Field16182;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"swing");
        if (!class44.Method365()) return;
        Class44 class442 = Field16183;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"swingHand");
        Enum enum_ = class442.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SwingHands");
        }
        switch (Class1474.Field14877[((Class1991)enum_).ordinal()]) {
            case 1: {
                Class1783.Method6755().player.swingingHand = EnumHand.MAIN_HAND;
                return;
            }
            case 2: {
                Class1783.Method6755().player.swingingHand = EnumHand.OFF_HAND;
                return;
            }
            case 3: {
                EntityPlayerSP entityPlayerSP = Class1783.Method6755().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemSword)) return;
                if (!((double)Class1783.Method6755().entityRenderer.itemRenderer.prevEquippedProgressMainHand >= Double.longBitsToDouble((long)543815809 ^ 0x3FECCCCCECA5344CL))) return;
                Class1783.Method6755().entityRenderer.itemRenderer.equippedProgressMainHand = 1.0f;
                ItemRenderer itemRenderer = Class1783.Method6755().entityRenderer.itemRenderer;
                EntityPlayerSP entityPlayerSP2 = Class1783.Method6755().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
                itemRenderer.itemStackMainHand = entityPlayerSP2.getHeldItemMainhand();
                return;
            }
        }
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method6751(@NotNull @NotNull EntityViewRenderEvent.FogColors fogColors) {
        Intrinsics.checkParameterIsNotNull((Object)fogColors, (String)"event");
        Class44 class44 = Field16179;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"customFog");
        if (!class44.Method365()) return;
        Class44 class442 = Field16180;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"customFogColor");
        fogColors.setRed(class442.Method339().Field17325);
        Class44 class443 = Field16180;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"customFogColor");
        fogColors.setGreen(class443.Method339().Field17326);
        Class44 class444 = Field16180;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"customFogColor");
        fogColors.setBlue(class444.Method339().Field17327);
    }

    @NotNull
    @NotNull
    public final Class618 Method6752() {
        return Field16198;
    }

    private final int[] Method6753(int n) {
        return new int[]{n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF};
    }

    private final Vector3f Method6754(Vector3f vector3f, Vector3f vector3f2, float f) {
        return new Vector3f(vector3f.x * (1.0f - f) + vector3f2.x * f, vector3f.y * (1.0f - f) + vector3f2.y * f, vector3f.z * (1.0f - f) + vector3f.z * f);
    }

    private Class1783() {
        super("Changer", "Changes your minecraft", Class97.Field8339);
    }

    static {
        Class1783 class1783;
        Field16200 = class1783 = new Class1783();
        Field16164 = class1783.Method23(new Class44("Gamma", (Class42)class1783, Double.longBitsToDouble((long)897229327 ^ 0x40590000357AA20FL), 1.0, Double.longBitsToDouble((long)2015487023 ^ 0x405900007821E42FL), true));
        Field16165 = class1783.Method23(new Class44("Fov", (Class42)class1783, Double.longBitsToDouble(4638144666238189568L), Double.longBitsToDouble(4629137466983448576L), Double.longBitsToDouble(4639481672377565184L), true));
        Field16166 = class1783.Method24(new Class1996(new Class44("Ambience", class1783)));
        Field16167 = class1783.Method23(Field16166.Method7405(new Class44("Ambience", (Class42)class1783, false)));
        Class44 class44 = new Class44("Ambience Color", (Class42)class1783, "Color", new Class2027(-1)).Method312(Field16167);
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Ambience Color\"\u2026-1)).setVisible(ambience)");
        Field16168 = class1783.Method23(Field16166.Method7405(class44));
        Field16169 = class1783.Method24(new Class1996(new Class44("Time", class1783)));
        Field16170 = class1783.Method23(Field16169.Method7405(new Class44("Time", (Class42)class1783, false)));
        Class44 class442 = new Class44("Time Value", (Class42)class1783, Double.longBitsToDouble((long)1184330047 ^ 0x403800004697713FL), Double.longBitsToDouble((long)905603667 ^ 0x4014000035FA6A53L), Double.longBitsToDouble(4627730092099895296L), true).Method312(Field16170).Method355("Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Time Value\", th\u2026e(time).setTitle(\"Value\")");
        Field16171 = class1783.Method23(Field16169.Method7405(class442));
        Class44 class443 = new Class44("Time Infinity Circle", (Class42)class1783, true).Method312(Field16170).Method355("Infinity Circle");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Time Infinity C\u2026tTitle(\"Infinity Circle\")");
        Field16172 = class1783.Method23(Field16169.Method7405(class443));
        Class44 class444 = new Class44("Time Speed", (Class42)class1783, Double.longBitsToDouble((long)317772339 ^ 0x4059000012F0D233L), Double.longBitsToDouble((long)125756394 ^ 0x40240000077EE3EAL), Double.longBitsToDouble(4652007308841189376L), Class467.Field9943).Method312(Field16170).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Time Speed\", th\u2026e(time).setTitle(\"Speed\")");
        Field16173 = class1783.Method23(Field16169.Method7405(class444));
        Field16174 = class1783.Method24(new Class1996(new Class44("Aspect", class1783)));
        Field16175 = class1783.Method23(Field16174.Method7405(new Class44("Aspect", (Class42)class1783, false)));
        Class44 class445 = new Class44("Aspect Width", (Class42)class1783, Double.longBitsToDouble((long)827171853 ^ 0x40100000314DA40DL), 1.0, Double.longBitsToDouble((long)1167118118 ^ 0x402400004590CF26L), true).Method312(Field16175).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Aspect Width\", \u2026aspect).setTitle(\"Width\")");
        Field16176 = class1783.Method23(Field16174.Method7405(class445));
        Class44 class446 = new Class44("Aspect Height", (Class42)class1783, Double.longBitsToDouble(0x4008000000000000L), 1.0, Double.longBitsToDouble(0x4024000000000000L), true).Method312(Field16175).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"Setting(\"Aspect Height\",\u2026spect).setTitle(\"Height\")");
        Field16177 = class1783.Method23(Field16174.Method7405(class446));
        Field16178 = class1783.Method24(new Class1996(new Class44("Custom Fog", class1783)));
        Field16179 = class1783.Method23(Field16178.Method7405(new Class44("Custom Fog", (Class42)class1783, false)));
        Class44 class447 = new Class44("Custom Fog Color", (Class42)class1783, "Custom Fog Color", new Class2027(-1)).Method312(Field16179).Method355("Color");
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"Setting(\"Custom Fog Colo\u2026tomFog).setTitle(\"Color\")");
        Field16180 = class1783.Method23(Field16178.Method7405(class447));
        Field16181 = class1783.Method24(new Class1996(new Class44("Swing", class1783)));
        Field16182 = class1783.Method23(Field16181.Method7405(new Class44("Swing", (Class42)class1783, false)));
        Class44 class448 = new Class44("Swing Hand", (Class42)class1783, Class1991.Field17156).Method312(Field16182).Method355("Hand");
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"Setting(\"Swing Hand\", th\u2026e(swing).setTitle(\"Hand\")");
        Field16183 = class1783.Method23(Field16181.Method7405(class448));
        Field16184 = class1783.Method24(new Class1996(new Class44("Animation", class1783)));
        Field16185 = class1783.Method23(Field16184.Method7405(new Class44("Animation", (Class42)class1783, false)));
        Class44 class449 = new Class44("Animation Speed", (Class42)class1783, Double.longBitsToDouble((long)1016404686 ^ 0x402A00003C951ACEL), 1.0, Double.longBitsToDouble((long)1320729271 ^ 0x403400004EB8BAB7L), true).Method312(Field16185).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"Setting(\"Animation Speed\u2026mation).setTitle(\"Speed\")");
        Field16186 = class1783.Method23(Field16184.Method7405(class449));
        Field16187 = class1783.Method24(new Class1996(new Class44("Shadow Text Mod", class1783)));
        Class44 class4410 = new Class44("Shadow Text Modifier", (Class42)class1783, false).Method355("Modify");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"Setting(\"Shadow Text Mod\u2026false).setTitle(\"Modify\")");
        Field16188 = class1783.Method23(Field16187.Method7405(class4410));
        Class44 class4411 = new Class44("Shadow X", (Class42)class1783, 1.0, 0.0, Double.longBitsToDouble((long)1253903570 ^ 0x400000004ABD0CD2L), false).Method312(Field16188);
        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"Setting(\"Shadow X\", this\u2026sible(shadowTextModifier)");
        Field16189 = class1783.Method23(Field16187.Method7405(class4411));
        Class44 class4412 = new Class44("Shadow Y", (Class42)class1783, 1.0, 0.0, Double.longBitsToDouble(0x4000000000000000L), false).Method312(Field16188);
        Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"Setting(\"Shadow Y\", this\u2026sible(shadowTextModifier)");
        Field16190 = class1783.Method23(Field16187.Method7405(class4412));
        Field16191 = class1783.Method24(new Class1996(new Class44("Timer", class1783)));
        Field16192 = class1783.Method23(Field16191.Method7405(new Class44("Timer", (Class42)class1783, false)));
        Class44 class4413 = new Class44("Timer Speed", (Class42)class1783, Double.longBitsToDouble(0x4010000000000000L), Double.longBitsToDouble((long)1473772684 ^ 0x3FB99999CE4E6516L), Double.longBitsToDouble(0x4024000000000000L), false).Method312(Field16192).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4413, (String)"Setting(\"Timer Speed\", t\u2026(timer).setTitle(\"Speed\")");
        Field16193 = class1783.Method23(Field16191.Method7405(class4413));
        Field16196 = new Class618((Class254)Class1756.Field16048, new Predicate[0]);
        Field16197 = new Class618((Class254)Class826.Field11520, new Predicate[0]);
        Field16198 = new Class618((Class254)Class1750.Field16028, new Predicate[0]);
        Field16199 = new Class618((Class254)Class2097.Field17556, new Predicate[0]);
    }

    public static final Minecraft Method6755() {
        return Class42.Field8052;
    }

    public static final void Method6756(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method6757(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16185;
    }

    public static final Class44 Method6758(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16186;
    }

    public static final Class44 Method6759(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16175;
    }

    public static final Class44 Method6760(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16176;
    }

    public static final Class44 Method6761(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16177;
    }

    public static final Class44 Method6762(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16170;
    }

    public static final Class44 Method6763(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16167;
    }

    public static final Class44 Method6764(Class1783 class1783) {
        Class1783 class17832 = class1783;
        return Field16168;
    }

    public static final int[] Method6765(Class1783 class1783, int n) {
        return class1783.Method6753(n);
    }

    public static final Vector3f Method6766(Class1783 class1783, Vector3f vector3f, Vector3f vector3f2, float f) {
        return class1783.Method6754(vector3f, vector3f2, f);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 245;
            cArray2[n] = (char)(cArray[n] ^ (0xD07 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

