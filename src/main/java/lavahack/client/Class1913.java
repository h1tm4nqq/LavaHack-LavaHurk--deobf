//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.settings.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import java.util.function.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 `2\u00020\u0001:\u0003_`aB\u0005?\u0006\u0002\u0010\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020PH\u0002J\b\u0010R\u001a\u00020PH\u0002J\b\u0010S\u001a\u00020PH\u0002J\b\u0010T\u001a\u00020PH\u0002J\b\u0010U\u001a\u00020PH\u0002J\b\u0010V\u001a\u00020PH\u0002J\b\u0010W\u001a\u00020PH\u0002J\b\u0010X\u001a\u00020PH\u0002J\b\u0010Y\u001a\u00020PH\u0002J\b\u0010Z\u001a\u00020PH\u0002J\b\u0010[\u001a\u00020PH\u0016J\b\u0010\\\u001a\u00020PH\u0002J\b\u0010]\u001a\u00020PH\u0016J\b\u0010^\u001a\u00020PH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00100\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00101\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00102\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00103\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00104\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00105\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00106\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00107\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00108\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u00109\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010:\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010=\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b?\u0010\"R\u0016\u0010@\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010A\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010B\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010C\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u000fX\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010G\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\bH\u0010\"R\u0016\u0010I\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010J\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010K\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010L\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004?\u0006\u0002\n\u0000R\u0019\u0010M\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004?\u0006\b\n\u0000\u001a\u0004\bN\u0010\"?\u0006b" }, d2 = { "Lcom/kisman/cc/features/module/movement/MoveModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoJump", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "autoSneak", "autoWalk", "blocks", "Lcom/kisman/cc/settings/types/SettingGroup;", "controls", "delays", "entities", "entityControl", "entityControlListener", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventEntityControl;", "entitySpeed", "entitySpeedGroup", "entitySpeedVal", "entityStep", "entityStepGroup", "entityStepVal", "fastLadder", "fastSwim", "iceSpeed", "iceSpeedGroup", "iceSpeedVal", "instant", "instantGroup", "instantLiquids", "instantSlow", "keepSprint", "getKeepSprint", "()Lcom/kisman/cc/settings/Setting;", "lagTimer", "Lcom/kisman/cc/util/TimerUtils;", "levitationControl", "levitationControlDownSpeed", "levitationControlGroup", "levitationControlUpSpeed", "motionLimiter", "motionLimiterNegativeXState", "motionLimiterNegativeXValue", "motionLimiterNegativeYMode", "motionLimiterNegativeYValue", "motionLimiterNegativeZState", "motionLimiterNegativeZValue", "motionLimiterPositiveXState", "motionLimiterPositiveXValue", "motionLimiterPositiveYState", "motionLimiterPositiveYValue", "motionLimiterPositiveZState", "motionLimiterPositiveZValue", "motionLimiterX", "motionLimiterY", "motionLimiterZ", "move", "noJumpDelay", "noStepDelay", "parkour", "reverseAntiGlitch", "reverseStep", "getReverseStep", "reverseStepGroup", "reverseStepLagTime", "reverseStepLagTimeGroup", "reverseStepLagTimeVal", "reverseStepVal", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "sprint", "getSprint", "sprintGroup", "sprintOnlyWhileMoving", "step", "stepGroup", "stepVal", "getStepVal", "doAutoMoving", "", "doDelays", "doFastLadder", "doFastSwim", "doIceSpeed", "doInstant", "doLevitationControl", "doMotionLimiter", "doParkour", "doReverseStep", "doSprint", "onDisable", "onDisableIceSpeed", "onEnable", "update", "AutoWalkMode", "Companion", "MotionLimiterNegativeYMode", "kisman.cc" })
public final class Class1913 extends Class42
{
    private final Class1996 Field16833;
    private final Class1996 Field16834;
    private final Class44 Field16835;
    private final Class44 Field16836;
    private final Class1996 Field16837;
    private final Class44 Field16838;
    private final Class44 Field16839;
    private final Class1996 Field16840;
    private final Class1996 Field16841;
    private final Class44 Field16842;
    private final Class44 Field16843;
    private final Class1996 Field16844;
    @NotNull
    private final Class44 Field16845;
    private final Class44 Field16846;
    private final Class44 Field16847;
    private final Class1996 Field16848;
    private final Class44 Field16849;
    private final Class44 Field16850;
    private final Class44 Field16851;
    private final Class1996 Field16852;
    private final Class1996 Field16853;
    @NotNull
    private final Class44 Field16854;
    private final Class44 Field16855;
    @NotNull
    private final Class44 Field16856;
    private final Class44 Field16857;
    private final Class44 Field16858;
    private final Class44 Field16859;
    private final Class1996 Field16860;
    private final Class44 Field16861;
    private final Class44 Field16862;
    private final Class44 Field16863;
    private final Class44 Field16864;
    private final Class1996 Field16865;
    private final Class44 Field16866;
    private final Class1996 Field16867;
    private final Class44 Field16868;
    private final Class44 Field16869;
    private final Class44 Field16870;
    private final Class1996 Field16871;
    private final Class44 Field16872;
    private final Class44 Field16873;
    private final Class44 Field16874;
    private final Class1996 Field16875;
    private final Class1996 Field16876;
    private final Class44 Field16877;
    private final Class44 Field16878;
    private final Class44 Field16879;
    private final Class44 Field16880;
    private final Class1996 Field16881;
    private final Class44 Field16882;
    private final Class44 Field16883;
    private final Class44 Field16884;
    private final Class44 Field16885;
    private final Class1996 Field16886;
    private final Class44 Field16887;
    private final Class44 Field16888;
    private final Class44 Field16889;
    private final Class44 Field16890;
    private final Class1996 Field16891;
    private final Class44 Field16892;
    private final Class44 Field16893;
    private final Class650 Field16894;
    private final Class618 Field16895;
    private final Class618 Field16896;
    @Nullable
    private static Class1913 Field16897;
    public static final Class75 Field16898;
    private int Field16899;
    
    public final Class44 Method7101() {
        return this.Field16843;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7102() {
        return this.Field16845;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7103() {
        return this.Field16854;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method7104() {
        return this.Field16856;
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field16895);
        Class1796.Field16242.Method706(this.Field16896);
        this.Field16894.Method2801();
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16896);
        Class1796.Field16242.Method711(this.Field16895);
        if (Method7117().player == null || Method7117().world == null) {
            return;
        }
        Method7117().player.stepHeight = Float.intBitsToFloat(1056964608);
        final EntityPlayerSP player = Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        player.setSprinting(false);
        if (Method7117().player.ridingEntity != null) {
            Method7117().player.ridingEntity.stepHeight = Float.intBitsToFloat(1056964608);
        }
        this.Method7112();
        if (Class1495.Method5990()) {
            Class1495.Method5989();
        }
    }
    
    @Override
    public void Method45() {
        if (Method7117().player == null || Method7117().world == null || Method7117().playerController == null) {
            return;
        }
        final EntityPlayerSP player = Method7117().player;
        final Class44 field16842 = this.Field16842;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16842, "step");
        float stepHeight;
        if (field16842.Method365()) {
            final Class44 field16843 = this.Field16843;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16843, "stepVal");
            stepHeight = field16843.Method368();
        }
        else {
            stepHeight = Float.intBitsToFloat(1056964608);
        }
        player.stepHeight = stepHeight;
        if (Method7117().player.ridingEntity != null) {
            final Entity ridingEntity = Method7117().player.ridingEntity;
            final Class44 field16844 = this.Field16835;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16844, "entityStep");
            float stepHeight2;
            if (field16844.Method365()) {
                final Class44 field16845 = this.Field16836;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16845, "entityStepVal");
                stepHeight2 = field16845.Method368();
            }
            else {
                stepHeight2 = Float.intBitsToFloat(1056964608);
            }
            ridingEntity.stepHeight = stepHeight2;
            final Class44 field16846 = this.Field16838;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16846, "entitySpeed");
            if (field16846.Method365()) {
                final Class44 field16847 = this.Field16839;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16847, "entitySpeedVal");
                final double[] method7150 = Class1917.Method7150(field16847.Method367());
                Method7117().player.ridingEntity.motionX = method7150[0];
                Method7117().player.ridingEntity.motionZ = method7150[1];
            }
        }
        this.Method7116();
        this.Method7115();
        this.Method7114();
        this.Method7113();
        this.Method7111();
        this.Method7110();
        this.Method7109();
        this.Method7108();
        this.Method7107();
        this.Method7106();
        this.Method7105();
    }
    
    private final void Method7105() {
        final Class148 field8575 = Class148.Field8575;
        final EntityPlayerSP player = Method7117().player;
        final Class148 class148 = field8575;
        final double motionX = Method7117().player.motionX;
        final Class44 field8576 = this.Field16878;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8576, "motionLimiterPositiveXValue");
        final double method367 = field8576.Method367();
        final Class44 field8577 = this.Field16880;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8577, "motionLimiterNegativeXValue");
        final double method368 = field8577.Method367();
        final Class44 field8578 = this.Field16877;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8578, "motionLimiterPositiveXState");
        final boolean method369 = field8578.Method365();
        final Class44 field8579 = this.Field16879;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8579, "motionLimiterNegativeXState");
        player.motionX = class148.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(motionX, method367, method368, method369, field8579.Method365());
        final EntityPlayerSP player2 = Method7117().player;
        final Class148 class149 = field8575;
        final double motionY = Method7117().player.motionY;
        final Class44 field8580 = this.Field16883;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8580, "motionLimiterPositiveYValue");
        final double method370 = field8580.Method367();
        final Class44 field8581 = this.Field16885;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8581, "motionLimiterNegativeYValue");
        final double method371 = field8581.Method367();
        final Class44 field8582 = this.Field16882;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8582, "motionLimiterPositiveYState");
        final boolean method372 = field8582.Method365();
        final Class44 field8583 = this.Field16884;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8583, "motionLimiterNegativeYMode");
        player2.motionY = class149.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(motionY, method370, method371, method372, field8583.Method341() != Class1552.Field15239);
        final EntityPlayerSP player3 = Method7117().player;
        final Class148 class150 = field8575;
        final double motionZ = Method7117().player.motionZ;
        final Class44 field8584 = this.Field16888;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8584, "motionLimiterPositiveZValue");
        final double method373 = field8584.Method367();
        final Class44 field8585 = this.Field16890;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8585, "motionLimiterNegativeZValue");
        final double method374 = field8585.Method367();
        final Class44 field8586 = this.Field16887;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8586, "motionLimiterPositiveZState");
        final boolean method375 = field8586.Method365();
        final Class44 field8587 = this.Field16889;
        Intrinsics.checkExpressionValueIsNotNull((Object)field8587, "motionLimiterNegativeZState");
        player3.motionZ = class150.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(motionZ, method373, method374, method375, field8587.Method365());
        if (Method7117().player.onGround) {
            final Class44 field8588 = this.Field16884;
            Intrinsics.checkExpressionValueIsNotNull((Object)field8588, "motionLimiterNegativeYMode");
            if (field8588.Method341() == Class1552.Field15241 && this.Field16845.Method365()) {
                final double motionY2 = 0.0;
                double n = 0.0;
                while (true) {
                    final double n2 = n;
                    final Class44 field8589 = this.Field16846;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field8589, "reverseStepVal");
                    if (n2 >= field8589.Method335() + Double.longBitsToDouble(4602678819172646912L)) {
                        break;
                    }
                    final WorldClient world = Method7117().world;
                    final Entity entity = (Entity)Method7117().player;
                    final EntityPlayerSP player4 = Method7117().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player4, "mc.player");
                    final List getCollisionBoxes = world.getCollisionBoxes(entity, player4.getEntityBoundingBox().offset(0.0, -n, 0.0));
                    Intrinsics.checkExpressionValueIsNotNull((Object)getCollisionBoxes, "mc.world.getCollisionBox\u2026Box.offset(0.0, -y, 0.0))");
                    if (!getCollisionBoxes.isEmpty()) {}
                    n += Double.longBitsToDouble(4576918229304087675L);
                }
                if (Method7117().player.motionY < motionY2) {
                    Method7117().player.motionY = motionY2;
                }
            }
        }
    }
    
    private final void Method7106() {
        final Class44 field16872 = this.Field16872;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16872, "instant");
        if (field16872.Method365()) {
            final EntityPlayerSP player = Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            Label_0072: {
                if (!player.isInWater()) {
                    final EntityPlayerSP player2 = Method7117().player;
                    Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                    if (!player2.isInLava()) {
                        break Label_0072;
                    }
                }
                final Class44 field16873 = this.Field16873;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16873, "instantLiquids");
                if (!field16873.Method365()) {
                    return;
                }
            }
            final EntityPlayerSP player3 = Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
            if (!player3.isElytraFlying()) {
                final Class44 field16874 = this.Field16874;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16874, "instantSlow");
                final double[] method7166 = Class1917.Method7166(Class1917.Method7154(field16874.Method365(), Double.longBitsToDouble(4598847156609680094L)));
                Method7117().player.motionX = method7166[0];
                Method7117().player.motionZ = method7166[1];
            }
        }
    }
    
    private final void Method7107() {
        final Class44 field16868 = this.Field16868;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16868, "levitationControl");
        if (field16868.Method365() && Method7117().player.getActivePotionEffect(MobEffects.LEVITATION) != null) {
            final KeyBinding keyBindJump = Method7117().gameSettings.keyBindJump;
            Intrinsics.checkExpressionValueIsNotNull((Object)keyBindJump, "mc.gameSettings.keyBindJump");
            if (keyBindJump.isPressed()) {
                final EntityPlayerSP player = Method7117().player;
                final Class44 field16869 = this.Field16869;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16869, "levitationControlUpSpeed");
                player.motionY = field16869.Method367();
            }
            final KeyBinding keyBindSneak = Method7117().gameSettings.keyBindSneak;
            Intrinsics.checkExpressionValueIsNotNull((Object)keyBindSneak, "mc.gameSettings.keyBindSneak");
            if (keyBindSneak.isPressed()) {
                final EntityPlayerSP player2 = Method7117().player;
                final Class44 field16870 = this.Field16870;
                Intrinsics.checkExpressionValueIsNotNull((Object)field16870, "levitationControlDownSpeed");
                player2.motionY = field16870.Method367();
            }
            Method7117().player.motionY = 0.0;
        }
    }
    
    private final void Method7108() {
        final EntityPlayerSP player = Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        if (player.isOnLadder()) {
            final Class44 field16864 = this.Field16864;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16864, "fastLadder");
            if (field16864.Method365()) {
                Method7117().player.jump();
            }
        }
    }
    
    private final void Method7109() {
        final Class44 field16851 = this.Field16851;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16851, "parkour");
        if (field16851.Method365() && Method7117().player.onGround) {
            final EntityPlayerSP player = Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (!player.isSneaking() && !Method7117().gameSettings.keyBindJump.pressed) {
                final WorldClient world = Method7117().world;
                final Entity entity = (Entity)Method7117().player;
                final EntityPlayerSP player2 = Method7117().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                if (world.getCollisionBoxes(entity, player2.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble((long)278650793 ^ 0xBFE00000109BDFA9L), 0.0).expand(Double.longBitsToDouble((long)1925890579 ^ 0xBA1FB0F6CC9AA20AL), 0.0, Double.longBitsToDouble((long)1708043052 ^ 0xB9E95A5E9B68186BL))).isEmpty()) {
                    Method7117().player.jump();
                }
            }
        }
    }
    
    private final void Method7110() {
        final EntityPlayerSP player = Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
        if (!player.isInLava()) {
            final EntityPlayerSP player2 = Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
            if (!player2.isInWater()) {
                return;
            }
        }
        if (Class1917.Method7159()) {
            final Class44 field16863 = this.Field16863;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16863, "fastSwim");
            if (field16863.Method365()) {
                final EntityPlayerSP player3 = Method7117().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                player3.setSprinting(true);
                final KeyBinding keyBindJump = Method7117().gameSettings.keyBindJump;
                Intrinsics.checkExpressionValueIsNotNull((Object)keyBindJump, "mc.gameSettings.keyBindJump");
                if (keyBindJump.isKeyDown()) {
                    Method7117().player.motionY = Double.longBitsToDouble((long)830325270 ^ 0x3FB916871A7FCE5CL);
                }
            }
        }
    }
    
    private final void Method7111() {
        final Class44 field16861 = this.Field16861;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16861, "iceSpeed");
        if (field16861.Method365()) {
            final Block ICE = Blocks.ICE;
            final Class44 field16862 = this.Field16862;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16862, "iceSpeedVal");
            ICE.slipperiness = field16862.Method368();
            final Block PACKED_ICE = Blocks.PACKED_ICE;
            final Class44 field16863 = this.Field16862;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16863, "iceSpeedVal");
            PACKED_ICE.slipperiness = field16863.Method368();
            final Block FROSTED_ICE = Blocks.FROSTED_ICE;
            final Class44 field16864 = this.Field16862;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16864, "iceSpeedVal");
            FROSTED_ICE.slipperiness = field16864.Method368();
        }
    }
    
    private final void Method7112() {
        Blocks.ICE.slipperiness = Float.intBitsToFloat(1065017672);
        Blocks.PACKED_ICE.slipperiness = Float.intBitsToFloat(1065017672);
        Blocks.FROSTED_ICE.slipperiness = Float.intBitsToFloat(1065017672);
    }
    
    private final void Method7113() {
        final Class44 field16892 = this.Field16892;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16892, "noJumpDelay");
        if (field16892.Method365()) {
            Method7117().player.jumpTicks = 0;
            Method7117().player.nextStepDistance = 0;
        }
        final Class44 field16893 = this.Field16893;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16893, "noStepDelay");
        if (field16893.Method365()) {
            Method7117().playerController.stepSoundTickCounter = 0.0f;
        }
    }
    
    private final void Method7114() {
        if (this.Field16854.Method341() != Class774.Field11275) {
            final Class44 field16855 = this.Field16855;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16855, "sprintOnlyWhileMoving");
            if (field16855.Method365() && !Class1917.Method7159()) {
                return;
            }
            if (this.Field16854.Method341() == Class774.Field11277 && !Method7117().gameSettings.keyBindForward.pressed) {
                return;
            }
            final EntityPlayerSP player = Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            player.setSprinting(true);
        }
    }
    
    private final void Method7115() {
        final Class44 field16858 = this.Field16858;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16858, "autoJump");
        if (field16858.Method365()) {
            Method7117().gameSettings.keyBindJump.pressed = true;
        }
        final Class44 field16859 = this.Field16857;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16859, "autoWalk");
        if (field16859.Method341() != Class1972.Field17077) {
            final Class44 field16860 = this.Field16857;
            Intrinsics.checkExpressionValueIsNotNull((Object)field16860, "autoWalk");
            if (field16860.Method341() == Class1972.Field17078) {
                Method7117().gameSettings.keyBindForward.pressed = true;
                if (Class1495.Method5990()) {
                    Class1495.Method5989();
                }
            }
            else if (!Class1495.Method5990()) {
                Class1495.Method5988(0, 0);
            }
        }
        else if (Class1495.Method5990()) {
            Class1495.Method5989();
        }
        final Class44 field16861 = this.Field16859;
        Intrinsics.checkExpressionValueIsNotNull((Object)field16861, "autoSneak");
        if (field16861.Method365()) {
            Method7117().gameSettings.keyBindSneak.pressed = true;
        }
    }
    
    private final void Method7116() {
        if (this.Field16845.Method365() && Method7117().player.onGround) {
            final EntityPlayerSP player = Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)player, "mc.player");
            if (!player.isInWater()) {
                final EntityPlayerSP player2 = Method7117().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)player2, "mc.player");
                if (!player2.isOnLadder()) {
                    final Class650 field16894 = this.Field16894;
                    final Class44 field16895 = this.Field16849;
                    Intrinsics.checkExpressionValueIsNotNull((Object)field16895, "reverseStepLagTime");
                    long method369;
                    if (field16895.Method365()) {
                        final Class44 field16896 = this.Field16850;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field16896, "reverseStepLagTimeVal");
                        method369 = field16896.Method369();
                    }
                    else {
                        method369 = 500L;
                    }
                    if (field16894.Method2797(method369)) {
                        this.Field16894.Method2801();
                        final Class44 field16897 = this.Field16849;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field16897, "reverseStepLagTime");
                        if (field16897.Method365()) {
                            return;
                        }
                    }
                    double d1 = 0.0;
                    while (true) {
                        final double n = d1;
                        final Class44 field16898 = this.Field16846;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field16898, "reverseStepVal");
                        if (n >= field16898.Method335() + Double.longBitsToDouble(4602678819172646912L)) {
                            break;
                        }
                        final Class44 field16899 = this.Field16847;
                        Intrinsics.checkExpressionValueIsNotNull((Object)field16899, "reverseAntiGlitch");
                        if (field16899.Method365()) {
                            Double.compare(d1, Double.longBitsToDouble((long)737157486 ^ 0x3FE000002BF0216EL));
                        }
                        final WorldClient world = Method7117().world;
                        final Entity entity = (Entity)Method7117().player;
                        final EntityPlayerSP player3 = Method7117().player;
                        Intrinsics.checkExpressionValueIsNotNull((Object)player3, "mc.player");
                        final List getCollisionBoxes = world.getCollisionBoxes(entity, player3.getEntityBoundingBox().offset(0.0, -d1, 0.0));
                        Intrinsics.checkExpressionValueIsNotNull((Object)getCollisionBoxes, "mc.world.getCollisionBox\u2026Box.offset(0.0, -y, 0.0))");
                        if (!getCollisionBoxes.isEmpty()) {}
                        d1 += Double.longBitsToDouble((long)957217447 ^ 0x3F847AE17EA3EEDCL);
                    }
                }
            }
        }
    }
    
    public Class1913() {
        super("MoveModifier", "Extra movement features.", Class97.Field8340);
        this.Field16833 = this.Method24(new Class1996(new Class44("Entities", this)));
        this.Field16834 = this.Method24(this.Field16833.Method7406(new Class1996(new Class44("Step", this))));
        final Class1996 field16834 = this.Field16834;
        final Class44 method355 = new Class44("Entity Step", this, false).Method355("Step");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Entity Step\", t\u2026, false).setTitle(\"Step\")");
        this.Field16835 = this.Method23(field16834.Method7405(method355));
        final Class1996 field16835 = this.Field16834;
        final Class44 method356 = new Class44("Entity Step Value", this, 1.0, 1.0, Double.longBitsToDouble(4616189618054758400L), true).Method312(this.Field16835).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Entity Step Val\u2026yStep).setTitle(\"Height\")");
        this.Field16836 = this.Method23(field16835.Method7405(method356));
        this.Field16837 = this.Method24(this.Field16833.Method7406(new Class1996(new Class44("Speed", this))));
        final Class1996 field16836 = this.Field16837;
        final Class44 method357 = new Class44("Entity Speed", this, false).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"Entity Speed\", \u2026 false).setTitle(\"Speed\")");
        this.Field16838 = this.Method23(field16836.Method7405(method357));
        final Class1996 field16837 = this.Field16837;
        final Class44 method358 = new Class44("Entity Speed Value", this, 1.0, 1.0, Double.longBitsToDouble((long)304873996 ^ 0x40240000122C020CL), true).Method312(this.Field16838).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"Entity Speed Va\u2026ySpeed).setTitle(\"Speed\")");
        this.Field16839 = this.Method23(field16837.Method7405(method358));
        this.Field16840 = this.Method24(new Class1996(new Class44("Blocks", this)));
        this.Field16841 = this.Method24(this.Field16840.Method7406(new Class1996(new Class44("Step", this))));
        this.Field16842 = this.Method23(this.Field16841.Method7405(new Class44("Step", this, false)));
        final Class1996 field16838 = this.Field16841;
        final Class44 method359 = new Class44("Step Value", this, Double.longBitsToDouble(4611686018427387904L), 1.0, Double.longBitsToDouble((long)815078469 ^ 0x4010000030951C45L), true).Method312(this.Field16842).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)method359, "Setting(\"Step Value\", th\u2026(step).setTitle(\"Height\")");
        this.Field16843 = this.Method23(field16838.Method7405(method359));
        this.Field16844 = this.Method24(this.Field16840.Method7406(new Class1996(new Class44("Reverse Step", this))));
        final Class1996 field16839 = this.Field16844;
        final Class44 method360 = new Class44("Reverse Step", this, false).Method355("RStep");
        Intrinsics.checkExpressionValueIsNotNull((Object)method360, "Setting(\"Reverse Step\", \u2026 false).setTitle(\"RStep\")");
        final Class44 method361 = this.Method23(field16839.Method7405(method360));
        Intrinsics.checkExpressionValueIsNotNull((Object)method361, "register(reverseStepGrou\u2026alse).setTitle(\"RStep\")))");
        this.Field16845 = method361;
        final Class1996 field16840 = this.Field16844;
        final Class44 method362 = new Class44("Reverse Step Value", this, Double.longBitsToDouble(4611686018427387904L), 1.0, Double.longBitsToDouble((long)1742559253 ^ 0x4010000067DD5815L), true).Method312(this.Field16845).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)method362, "Setting(\"Reverse Step Va\u2026eStep).setTitle(\"Height\")");
        this.Field16846 = this.Method23(field16840.Method7405(method362));
        final Class1996 field16841 = this.Field16844;
        final Class44 method363 = new Class44("Reverse Anti Glitch", this, true).Method312(this.Field16845).Method355("AntiGlitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)method363, "Setting(\"Reverse Anti Gl\u2026p).setTitle(\"AntiGlitch\")");
        this.Field16847 = this.Method23(field16841.Method7405(method363));
        this.Field16848 = this.Method24(this.Field16844.Method7406(new Class1996(new Class44("Lag Time", this))));
        final Class1996 field16842 = this.Field16848;
        final Class44 method364 = new Class44("Reverse Step Lag Time", this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method364, "Setting(\"Reverse Step La\u2026 false).setTitle(\"State\")");
        this.Field16849 = this.Method23(field16842.Method7405(method364));
        final Class1996 field16843 = this.Field16848;
        final Class44 method365 = new Class44("Reverse Step Lag Time Value", this, Double.longBitsToDouble((long)284297253 ^ 0x407F400010F20825L), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943).Method355("Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method365, "Setting(\"Reverse Step La\u2026e.TIME).setTitle(\"Value\")");
        this.Field16850 = this.Method23(field16843.Method7405(method365));
        this.Field16851 = this.Method23(this.Field16840.Method7405(new Class44("Parkour", this, false)));
        this.Field16852 = this.Method24(new Class1996(new Class44("Move", this)));
        this.Field16853 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Sprint", this))));
        final Class44 method366 = this.Method23(this.Field16853.Method7405(new Class44("Sprint", this, Class774.Field11275)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method366, "register(sprintGroup.add\u2026this, SprintModes.None)))");
        this.Field16854 = method366;
        final Class1996 field16844 = this.Field16853;
        final Class44 method367 = new Class44("Sprint Only While Moving", this, false).Method313((Supplier)new Class108(this)).Method355("While Move");
        Intrinsics.checkExpressionValueIsNotNull((Object)method367, "Setting(\"Sprint Only Whi\u2026 }.setTitle(\"While Move\")");
        this.Field16855 = this.Method23(field16844.Method7405(method367));
        final Class44 method368 = this.Method23(this.Field16852.Method7405(new Class44("Keep Sprint", this, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method368, "register(move.add(Settin\u2026p Sprint\", this, false)))");
        this.Field16856 = method368;
        this.Field16857 = this.Method23(this.Field16852.Method7405(new Class44("Auto Walk", this, Class1972.Field17077)));
        this.Field16858 = this.Method23(this.Field16852.Method7405(new Class44("Auto Jump", this, false)));
        this.Field16859 = this.Method23(this.Field16852.Method7405(new Class44("Auto Sneak", this, false)));
        this.Field16860 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Ice Speed", this))));
        this.Field16861 = this.Method23(this.Field16860.Method7405(new Class44("Ice Speed", this, false)));
        final Class1996 field16845 = this.Field16860;
        final Class44 method369 = new Class44("Ice Speed Val", this, Double.longBitsToDouble((long)617278204 ^ 0x3FD99999BD537366L), Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4609434218613702656L), false).Method312(this.Field16861).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)method369, "Setting(\"Ice Speed Val\",\u2026eSpeed).setTitle(\"Speed\")");
        this.Field16862 = this.Method23(field16845.Method7405(method369));
        this.Field16863 = this.Method23(this.Field16852.Method7405(new Class44("Fast Swim", this, false)));
        this.Field16864 = this.Method23(this.Field16852.Method7405(new Class44("Fast Ladder", this, false)));
        this.Field16865 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Controls", this))));
        final Class1996 field16846 = this.Field16865;
        final Class44 method370 = new Class44("Entity Control", this, false).Method355("Entity");
        Intrinsics.checkExpressionValueIsNotNull((Object)method370, "Setting(\"Entity Control\"\u2026false).setTitle(\"Entity\")");
        this.Field16866 = this.Method23(field16846.Method7405(method370));
        this.Field16867 = this.Method24(this.Field16865.Method7406(new Class1996(new Class44("Levitation", this))));
        final Class1996 field16847 = this.Field16867;
        final Class44 method371 = new Class44("Levitation Control", this, false).Method355("Levitation");
        Intrinsics.checkExpressionValueIsNotNull((Object)method371, "Setting(\"Levitation Cont\u2026e).setTitle(\"Levitation\")");
        this.Field16868 = this.Method23(field16847.Method7405(method371));
        final Class1996 field16848 = this.Field16867;
        final Class44 method372 = new Class44("Levitation Control Up Speed", this, 1.0, 0.0, Double.longBitsToDouble(4611686018427387904L), false).Method312(this.Field16868).Method355("Up");
        Intrinsics.checkExpressionValueIsNotNull((Object)method372, "Setting(\"Levitation Cont\u2026onControl).setTitle(\"Up\")");
        this.Field16869 = this.Method23(field16848.Method7405(method372));
        final Class1996 field16849 = this.Field16867;
        final Class44 method373 = new Class44("Levitation Control Down Speed", this, 1.0, 0.0, Double.longBitsToDouble(4611686018427387904L), false).Method312(this.Field16868).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)method373, "Setting(\"Levitation Cont\u2026Control).setTitle(\"Down\")");
        this.Field16870 = this.Method23(field16849.Method7405(method373));
        this.Field16871 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Instant", this))));
        final Class1996 field16850 = this.Field16871;
        final Class44 method374 = new Class44("Instant State", this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method374, "Setting(\"Instant State\",\u2026 false).setTitle(\"State\")");
        this.Field16872 = this.Method23(field16850.Method7405(method374));
        final Class1996 field16851 = this.Field16871;
        final Class44 method375 = new Class44("Instant Liquids", this, false).Method355("Liquids");
        Intrinsics.checkExpressionValueIsNotNull((Object)method375, "Setting(\"Instant Liquids\u2026alse).setTitle(\"Liquids\")");
        this.Field16873 = this.Method23(field16851.Method7405(method375));
        final Class1996 field16852 = this.Field16871;
        final Class44 method376 = new Class44("Instant Slow", this, false).Method355("Slow");
        Intrinsics.checkExpressionValueIsNotNull((Object)method376, "Setting(\"Instant Slow\", \u2026, false).setTitle(\"Slow\")");
        this.Field16874 = this.Method23(field16852.Method7405(method376));
        this.Field16875 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Motion Limiter", this))));
        this.Field16876 = this.Method24(this.Field16875.Method7406(new Class1996(new Class44("X", this))));
        final Class1996 field16853 = this.Field16876;
        final Class44 method377 = new Class44("Motion Limiter Positive X State", this, false).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method377, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16877 = this.Method23(field16853.Method7405(method377));
        final Class1996 field16854 = this.Field16876;
        final Class44 method378 = new Class44("Motion Limiter Positive X Value", this, 1.0, 0.0, Double.longBitsToDouble((long)1150488398 ^ 0x4014000044930F4EL), false).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method378, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16878 = this.Method23(field16854.Method7405(method378));
        final Class1996 field16855 = this.Field16876;
        final Class44 method379 = new Class44("Motion Limiter Negative X State", this, false).Method355("\"-\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method379, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" State\")");
        this.Field16879 = this.Method23(field16855.Method7405(method379));
        final Class1996 field16856 = this.Field16876;
        final Class44 method380 = new Class44("Motion Limiter Negative X Value", this, 1.0, 0.0, Double.longBitsToDouble((long)470883613 ^ 0x401400001C111D1DL), false).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method380, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16880 = this.Method23(field16856.Method7405(method380));
        this.Field16881 = this.Method24(this.Field16875.Method7406(new Class1996(new Class44("Y", this))));
        final Class1996 field16857 = this.Field16881;
        final Class44 method381 = new Class44("Motion Limiter Positive Y State", this, false).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method381, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16882 = this.Method23(field16857.Method7405(method381));
        final Class1996 field16858 = this.Field16881;
        final Class44 method382 = new Class44("Motion Limiter Positive Y Value", this, 1.0, 0.0, Double.longBitsToDouble((long)634852934 ^ 0x4014000025D71646L), false).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method382, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16883 = this.Method23(field16858.Method7405(method382));
        final Class1996 field16859 = this.Field16881;
        final Class44 method383 = new Class44("Motion Limiter Negative Y Mode", this, (Enum)Class1552.Field15239).Method355("\"-\" Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)method383, "Setting(\"Motion Limiter \u2026e).setTitle(\"\\\"-\\\" Mode\")");
        this.Field16884 = this.Method23(field16859.Method7405(method383));
        final Class1996 field16860 = this.Field16881;
        final Class44 method384 = new Class44("Motion Limiter Negative Y Value", this, 1.0, 0.0, Double.longBitsToDouble((long)1302808390 ^ 0x401400004DA74746L), false).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method384, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16885 = this.Method23(field16860.Method7405(method384));
        this.Field16886 = this.Method24(this.Field16875.Method7406(new Class1996(new Class44("Z", this))));
        final Class1996 field16861 = this.Field16886;
        final Class44 method385 = new Class44("Motion Limiter Positive Z State", this, false).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method385, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16887 = this.Method23(field16861.Method7405(method385));
        final Class1996 field16862 = this.Field16886;
        final Class44 method386 = new Class44("Motion Limiter Positive Z Value", this, 1.0, 0.0, Double.longBitsToDouble(4617315517961601024L), false).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method386, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16888 = this.Method23(field16862.Method7405(method386));
        final Class1996 field16863 = this.Field16886;
        final Class44 method387 = new Class44("Motion Limiter Negative Z State", this, false).Method355("\"-\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method387, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" State\")");
        this.Field16889 = this.Method23(field16863.Method7405(method387));
        final Class1996 field16864 = this.Field16886;
        final Class44 method388 = new Class44("Motion Limiter Negative Z Value", this, 1.0, 0.0, Double.longBitsToDouble(4617315517961601024L), false).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)method388, "Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16890 = this.Method23(field16864.Method7405(method388));
        this.Field16891 = this.Method24(new Class1996(new Class44("Delays", this)));
        this.Field16892 = this.Method23(this.Field16891.Method7405(new Class44("No Jump Delay", this, false)));
        this.Field16893 = this.Method23(this.Field16891.Method7405(new Class44("No Step Delay", this, false)));
        this.Field16894 = new Class650();
        this.Field16842.Method303((Supplier)new Class1634(this));
        this.Field16845.Method303((Supplier)new Class1639(this));
        this.Field16835.Method303((Supplier)new Class1640(this));
        this.Field16838.Method303((Supplier)new Class1641(this));
        this.Field16854.Method303((Supplier)new Class1642(this));
        this.Field16861.Method303((Supplier)new Class1637(this));
        Class1913.Field16897 = this;
        this.Field16895 = new Class618((Class254)new Class1171(this), new Predicate[0]);
        this.Field16896 = new Class618((Class254)new Class1457(this), new Predicate[0]);
    }
    
    static {
        Field16898 = new Class75(null);
    }
    
    public static final Minecraft Method7117() {
        return Class42.Field8052;
    }
    
    public static final void Method7118(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final Class44 Method7119(final Class1913 class1913) {
        return class1913.Field16846;
    }
    
    public static final Class44 Method7120(final Class1913 class1913) {
        return class1913.Field16836;
    }
    
    public static final Class44 Method7121(final Class1913 class1913) {
        return class1913.Field16839;
    }
    
    public static final Class44 Method7122(final Class1913 class1913) {
        return class1913.Field16862;
    }
    
    public static final Class44 Method7123(final Class1913 class1913) {
        return class1913.Field16864;
    }
    
    public static final Class44 Method7124(final Class1913 class1913) {
        return class1913.Field16866;
    }
    
    public static final Class1913 Method7125() {
        return Class1913.Field16897;
    }
    
    public static final void Method7126(final Class1913 field16897) {
        Class1913.Field16897 = field16897;
    }
    
    @Nullable
    @Nullable
    public static final Class1913 Method7127() {
        Class1913.Field16898;
        return Class1913.Field16897;
    }
    
    public static final void Method7128(@Nullable @Nullable final Class1913 field16897) {
        Class1913.Field16898;
        Class1913.Field16897 = field16897;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x40F ^ 0x1E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
