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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.function.Predicate;
import javax.vecmath.Vector3f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.AJ2FnB8fdoqBiVEms70GxKyOrqj1xJnZ;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF;
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
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
public final class TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16164;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16165;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16166;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16167;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16168;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16169;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16170;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16171;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16172;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16173;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16174;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16175;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16176;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16177;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16178;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16179;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16180;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16181;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16182;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16183;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16184;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16185;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16186;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16187;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16188;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16189;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16190;
    private static final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16191;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16192;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16193;
    private static int Field16194;
    private static float Field16195;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16196;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16197;
    @NotNull
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16198;
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16199;
    public static final TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI Field16200;
    private String Field16201 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6746() {
        return Field16188;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6747() {
        return Field16189;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6748() {
        return Field16190;
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field16198);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field16199);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field16197);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(Field16196);
        Field16195 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().gameSettings.fovSetting;
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field16196);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field16197);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field16199);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(Field16198);
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().timer.tickLength = Float.intBitsToFloat((int)((long)869501105 ^ (long)1906018481));
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().gameSettings.gammaSetting = 1.0f;
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().gameSettings.fovSetting = Field16195;
        if (TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().player == null) return;
        if (TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().world == null) {
            return;
        }
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().player.swingingHand = EnumHand.MAIN_HAND;
    }

    @Override
    public void Method45() {
        if (TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().player == null || TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().world == null) {
            TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().timer.tickLength = Float.intBitsToFloat(0x258C2ED3 ^ 0x67C42ED3);
            return;
        }
        GameSettings gameSettings = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().gameSettings;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field16164;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"gamma");
        gameSettings.gammaSetting = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method368();
        GameSettings gameSettings2 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().gameSettings;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Field16165;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"fov");
        gameSettings2.fovSetting = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Field16170;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"time");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
            long l;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = Field16173;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"timeSpeed");
            Field16194 += qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335();
            WorldClient worldClient = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().world;
            Intrinsics.checkExpressionValueIsNotNull((Object)worldClient, (String)"mc.world");
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = Field16172;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"timeInfCircle");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
                l = Field16194;
            } else {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = Field16171;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"timeVal");
                l = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method369() * (0x1129ABE8L & 0x220403EBL);
            }
            worldClient.setWorldTime(l);
            if (Field16194 >= ((int)893346212L ^ 0x353F60D3) << 6) {
                Field16194 = (int)-103155945L ^ 0xF9D9F717;
            }
        }
        this.Method6750();
        this.Method6749();
    }

    private final void Method6749() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field16192;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"timer");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            Timer timer = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().timer;
            float f = Float.intBitsToFloat((int)((long)997577711 ^ (long)2034095087));
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Field16193;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"timerSpeed");
            timer.tickLength = f / HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4280(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368(), Float.intBitsToFloat(0x51E470D7 ^ 0x6C28BC1A));
            return;
        }
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().timer.tickLength = Float.intBitsToFloat((int)((long)1154795979 ^ (long)110938571));
    }

    private final void Method6750() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field16182;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"swing");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Field16183;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"swingHand");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SwingHands");
        }
        switch (AJ2FnB8fdoqBiVEms70GxKyOrqj1xJnZ.Field14877[((KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF)enum_).ordinal()]) {
            case 1: {
                TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().player.swingingHand = EnumHand.MAIN_HAND;
                return;
            }
            case 2: {
                TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().player.swingingHand = EnumHand.OFF_HAND;
                return;
            }
            case 3: {
                EntityPlayerSP entityPlayerSP = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (!(entityPlayerSP.getHeldItemMainhand().item instanceof ItemSword)) return;
                if (!((double)TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().entityRenderer.itemRenderer.prevEquippedProgressMainHand >= Double.longBitsToDouble((long)543815809 ^ 0x3FECCCCCECA5344CL))) return;
                TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().entityRenderer.itemRenderer.equippedProgressMainHand = 1.0f;
                ItemRenderer itemRenderer = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().entityRenderer.itemRenderer;
                EntityPlayerSP entityPlayerSP2 = TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6755().player;
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
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field16179;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"customFog");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = Field16180;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"customFogColor");
        fogColors.setRed(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method339().Field17325);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = Field16180;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"customFogColor");
        fogColors.setGreen(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method339().Field17326);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = Field16180;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"customFogColor");
        fogColors.setBlue(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method339().Field17327);
    }

    @NotNull
    @NotNull
    public final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Method6752() {
        return Field16198;
    }

    private final int[] Method6753(int n) {
        int[] nArray = new int[(int)((long)-1044307279 ^ (long)-1044307278)];
        nArray[(int)((long)-1985100621 ^ (long)-1985100621)] = n >> ((int)((long)-6749627 ^ (long)-6749628) << 4) & ((int)1101110800L ^ 0x41A19EEF);
        nArray[(int)((long)794074033 ^ (long)794074032)] = n >> (((int)-1788525233L ^ 0x9565454E) << 3) & ((int)-1042940125L ^ 0xC1D5FFDC);
        nArray[((int)-480644646L ^ 0xE359F1DB) << 1] = n & (int)((long)-1153007228 ^ (long)-1153007237);
        return nArray;
    }

    private final Vector3f Method6754(Vector3f vector3f, Vector3f vector3f2, float f) {
        return new Vector3f(vector3f.x * (1.0f - f) + vector3f2.x * f, vector3f.y * (1.0f - f) + vector3f2.y * f, vector3f.z * (1.0f - f) + vector3f.z * f);
    }

    private TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI() {
        super("Changer", "Changes your minecraft", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8339);
    }

    static {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        Field16200 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI = new TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI();
        Field16164 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Gamma", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble((long)897229327 ^ 0x40590000357AA20FL), 1.0, Double.longBitsToDouble((long)2015487023 ^ 0x405900007821E42FL), ((int)181799659L ^ 0xAD60AEA) != 0));
        Field16165 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fov", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble(0x57103B7D0174A5ABL ^ 0x174E3B7D0174A5ABL), Double.longBitsToDouble(0xC1A9217839CE7FF3L ^ 0x8197217839CE7FF3L), Double.longBitsToDouble(0x45A66A0D3F9C4390L ^ 0x5C4AA0D3F9C4390L), ((int)-1731796191L ^ 0x98C6E320) != 0));
        Field16166 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ambience", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        Field16167 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16166.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ambience", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, ((int)-1513091711L ^ 0xA5D00D81) != 0)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ambience Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, "Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1537570260L ^ 0x5BA575D3)).Method312(Field16167);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Ambience Color\"\u2026-1)).setVisible(ambience)");
        Field16168 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16166.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        Field16169 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Time", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        Field16170 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16169.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, ((int)1785060370L ^ 0x6A65DC12) != 0)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Time Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble((long)1184330047 ^ 0x403800004697713FL), Double.longBitsToDouble((long)905603667 ^ 0x4014000035FA6A53L), Double.longBitsToDouble(0x997B8B7BDDDEB93BL ^ 0xD9428B7BDDDEB93BL), ((int)945886677L ^ 0x386115D4) != 0).Method312(Field16170).Method355("Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Time Value\", th\u2026e(time).setTitle(\"Value\")");
        Field16171 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16169.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Time Infinity Circle", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, (boolean)((long)-792230468 ^ (long)-792230467)).Method312(Field16170).Method355("Infinity Circle");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Time Infinity C\u2026tTitle(\"Infinity Circle\")");
        Field16172 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16169.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Time Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble((long)317772339 ^ 0x4059000012F0D233L), Double.longBitsToDouble((long)125756394 ^ 0x40240000077EE3EAL), Double.longBitsToDouble(0xF59DF164DB53973L ^ 0x4FD69F164DB53973L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method312(Field16170).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Time Speed\", th\u2026e(time).setTitle(\"Speed\")");
        Field16173 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16169.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5));
        Field16174 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Aspect", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        Field16175 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16174.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Aspect", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, (boolean)((long)1989321080 ^ (long)1989321080))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Aspect Width", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble((long)827171853 ^ 0x40100000314DA40DL), 1.0, Double.longBitsToDouble((long)1167118118 ^ 0x402400004590CF26L), (boolean)((long)-2070681457 ^ (long)-2070681458)).Method312(Field16175).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Aspect Width\", \u2026aspect).setTitle(\"Width\")");
        Field16176 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16174.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Aspect Height", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble(0x1700968C4E797F9FL ^ 0x5708968C4E797F9FL), 1.0, Double.longBitsToDouble(0x3C40F178C88CC138L ^ 0x7C64F178C88CC138L), (boolean)((long)1824641810 ^ (long)1824641811)).Method312(Field16175).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"Setting(\"Aspect Height\",\u2026spect).setTitle(\"Height\")");
        Field16177 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16174.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7));
        Field16178 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Fog", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        Field16179 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16178.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Fog", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, (boolean)((long)-1010882594 ^ (long)-1010882594))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom Fog Color", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, "Custom Fog Color", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-570714271L ^ 0x2204689E)).Method312(Field16179).Method355("Color");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"Setting(\"Custom Fog Colo\u2026tomFog).setTitle(\"Color\")");
        Field16180 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16178.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8));
        Field16181 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        Field16182 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16181.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, (boolean)((long)1668346085 ^ (long)1668346085))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Swing Hand", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF.Field17156).Method312(Field16182).Method355("Hand");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"Setting(\"Swing Hand\", th\u2026e(swing).setTitle(\"Hand\")");
        Field16183 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16181.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9));
        Field16184 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Animation", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        Field16185 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16184.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Animation", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, (boolean)((long)799518653 ^ (long)799518653))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Animation Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble((long)1016404686 ^ 0x402A00003C951ACEL), 1.0, Double.longBitsToDouble((long)1320729271 ^ 0x403400004EB8BAB7L), (boolean)((long)591935961 ^ (long)591935960)).Method312(Field16185).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"Setting(\"Animation Speed\u2026mation).setTitle(\"Speed\")");
        Field16186 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16184.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10));
        Field16187 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow Text Mod", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow Text Modifier", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, (boolean)((long)-1591603813 ^ (long)-1591603813)).Method355("Modify");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"Setting(\"Shadow Text Mod\u2026false).setTitle(\"Modify\")");
        Field16188 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16187.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow X", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, 1.0, 0.0, Double.longBitsToDouble((long)1253903570 ^ 0x400000004ABD0CD2L), (boolean)((long)-1645380572 ^ (long)-1645380572)).Method312(Field16188);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"Setting(\"Shadow X\", this\u2026sible(shadowTextModifier)");
        Field16189 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16187.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shadow Y", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, 1.0, 0.0, Double.longBitsToDouble(0xDDCFBA3140451983L ^ 0x9DCFBA3140451983L), ((int)-2070687743L ^ 0x8493D001) != 0).Method312(Field16188);
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"Setting(\"Shadow Y\", this\u2026sible(shadowTextModifier)");
        Field16190 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16187.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13));
        Field16191 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer", txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI)));
        Field16192 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16191.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, (boolean)((long)-486945798 ^ (long)-486945798))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Timer Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Double.longBitsToDouble(0x5D89CA4462647968L ^ 0x1D99CA4462647968L), Double.longBitsToDouble((long)1473772684 ^ 0x3FB99999CE4E6516L), Double.longBitsToDouble(0xE0ECD37A9E1E718CL ^ 0xA0C8D37A9E1E718CL), ((int)-746599661L ^ 0xD37FCB13) != 0).Method312(Field16192).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"Setting(\"Timer Speed\", t\u2026(timer).setTitle(\"Speed\")");
        Field16193 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method23(Field16191.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14));
        Field16196 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16048, new Predicate[(int)((long)2102713552 ^ (long)2102713552)]);
        Field16197 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field11520, new Predicate[(int)727389375L ^ 0x2B5B14BF]);
        Field16198 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field16028, new Predicate[(int)2053599364L ^ 0x7A677084]);
        Field16199 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field17556, new Predicate[(int)((long)202854552 ^ (long)202854552)]);
    }

    public static final Minecraft Method6755() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method6756(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6757(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16185;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6758(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16186;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6759(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16175;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6760(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16176;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6761(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16177;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6762(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16170;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6763(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16167;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method6764(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI) {
        TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI2 = txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI;
        return Field16168;
    }

    public static final int[] Method6765(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, int n) {
        return txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6753(n);
    }

    public static final Vector3f Method6766(TxB0kElQBINTN6oqsj5ZzeZfOhnqeVDI txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI, Vector3f vector3f, Vector3f vector3f2, float f) {
        return txB0kElQBINTN6oqsj5ZzeZfOhnqeVDI.Method6754(vector3f, vector3f2, f);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1359806203 ^ (long)-1359806203);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)191992926L ^ 0xB7194A1);
            int n2 = (int)((long)2031461067 ^ (long)2031460926);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1072697115 ^ (long)-1072693790) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

