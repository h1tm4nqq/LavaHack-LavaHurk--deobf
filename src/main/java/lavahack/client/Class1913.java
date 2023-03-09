//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.settings.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class108;
import lavahack.client.Class1171;
import lavahack.client.Class1457;
import lavahack.client.Class148;
import lavahack.client.Class1495;
import lavahack.client.Class1552;
import lavahack.client.Class1634;
import lavahack.client.Class1637;
import lavahack.client.Class1639;
import lavahack.client.Class1640;
import lavahack.client.Class1641;
import lavahack.client.Class1642;
import lavahack.client.Class1796;
import lavahack.client.Class1917;
import lavahack.client.Class1972;
import lavahack.client.Class1996;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class618;
import lavahack.client.Class75;
import lavahack.client.Class774;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 `2\u00020\u0001:\u0003_`aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020PH\u0002J\b\u0010R\u001a\u00020PH\u0002J\b\u0010S\u001a\u00020PH\u0002J\b\u0010T\u001a\u00020PH\u0002J\b\u0010U\u001a\u00020PH\u0002J\b\u0010V\u001a\u00020PH\u0002J\b\u0010W\u001a\u00020PH\u0002J\b\u0010X\u001a\u00020PH\u0002J\b\u0010Y\u001a\u00020PH\u0002J\b\u0010Z\u001a\u00020PH\u0002J\b\u0010[\u001a\u00020PH\u0016J\b\u0010\\\u001a\u00020PH\u0002J\b\u0010]\u001a\u00020PH\u0016J\b\u0010^\u001a\u00020PH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00100\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00101\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00102\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00103\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00104\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00105\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00106\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00107\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00108\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00109\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010:\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010;\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010=\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010>\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\"R\u0016\u0010@\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010A\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010B\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010C\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010G\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\"R\u0016\u0010I\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010J\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010K\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010L\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010M\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\"\u00a8\u0006b"}, d2={"Lcom/kisman/cc/features/module/movement/MoveModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "autoJump", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "autoSneak", "autoWalk", "blocks", "Lcom/kisman/cc/settings/types/SettingGroup;", "controls", "delays", "entities", "entityControl", "entityControlListener", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventEntityControl;", "entitySpeed", "entitySpeedGroup", "entitySpeedVal", "entityStep", "entityStepGroup", "entityStepVal", "fastLadder", "fastSwim", "iceSpeed", "iceSpeedGroup", "iceSpeedVal", "instant", "instantGroup", "instantLiquids", "instantSlow", "keepSprint", "getKeepSprint", "()Lcom/kisman/cc/settings/Setting;", "lagTimer", "Lcom/kisman/cc/util/TimerUtils;", "levitationControl", "levitationControlDownSpeed", "levitationControlGroup", "levitationControlUpSpeed", "motionLimiter", "motionLimiterNegativeXState", "motionLimiterNegativeXValue", "motionLimiterNegativeYMode", "motionLimiterNegativeYValue", "motionLimiterNegativeZState", "motionLimiterNegativeZValue", "motionLimiterPositiveXState", "motionLimiterPositiveXValue", "motionLimiterPositiveYState", "motionLimiterPositiveYValue", "motionLimiterPositiveZState", "motionLimiterPositiveZValue", "motionLimiterX", "motionLimiterY", "motionLimiterZ", "move", "noJumpDelay", "noStepDelay", "parkour", "reverseAntiGlitch", "reverseStep", "getReverseStep", "reverseStepGroup", "reverseStepLagTime", "reverseStepLagTimeGroup", "reverseStepLagTimeVal", "reverseStepVal", "send", "Lcom/kisman/cc/event/events/PacketEvent$Send;", "sprint", "getSprint", "sprintGroup", "sprintOnlyWhileMoving", "step", "stepGroup", "stepVal", "getStepVal", "doAutoMoving", "", "doDelays", "doFastLadder", "doFastSwim", "doIceSpeed", "doInstant", "doLevitationControl", "doMotionLimiter", "doParkour", "doReverseStep", "doSprint", "onDisable", "onDisableIceSpeed", "onEnable", "update", "AutoWalkMode", "Companion", "MotionLimiterNegativeYMode", "kisman.cc"})
public final class Class1913
extends Class42 {
    private final Class1996 Field16833 = this.Method24(new Class1996(new Class44("Entities", this)));
    private final Class1996 Field16834 = this.Method24(this.Field16833.Method7406(new Class1996(new Class44("Step", this))));
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
        if (Class1913.Method7117().player == null) return;
        if (Class1913.Method7117().world == null) {
            return;
        }
        Class1913.Method7117().player.stepHeight = Float.intBitsToFloat(0x3F000000);
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        entityPlayerSP.setSprinting(false);
        if (Class1913.Method7117().player.ridingEntity != null) {
            Class1913.Method7117().player.ridingEntity.stepHeight = Float.intBitsToFloat(0x3F000000);
        }
        this.Method7112();
        if (!Class1495.Method5990()) return;
        Class1495.Method5989();
    }

    @Override
    public void Method45() {
        float f;
        if (Class1913.Method7117().player == null) return;
        if (Class1913.Method7117().world == null) return;
        if (Class1913.Method7117().playerController == null) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Class44 class44 = this.Field16842;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"step");
        if (class44.Method365()) {
            Class44 class442 = this.Field16843;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"stepVal");
            f = class442.Method368();
        } else {
            f = entityPlayerSP.stepHeight = Float.intBitsToFloat(0x3F000000);
        }
        if (Class1913.Method7117().player.ridingEntity != null) {
            float f2;
            Entity entity = Class1913.Method7117().player.ridingEntity;
            Class44 class443 = this.Field16835;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"entityStep");
            if (class443.Method365()) {
                Class44 class444 = this.Field16836;
                Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"entityStepVal");
                f2 = class444.Method368();
            } else {
                f2 = Float.intBitsToFloat(0x3F000000);
            }
            entity.stepHeight = f2;
            Class44 class445 = this.Field16838;
            Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"entitySpeed");
            if (class445.Method365()) {
                Class44 class446 = this.Field16839;
                Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"entitySpeedVal");
                double[] dArray = Class1917.Method7150(class446.Method367());
                Class1913.Method7117().player.ridingEntity.motionX = dArray[0];
                Class1913.Method7117().player.ridingEntity.motionZ = dArray[1];
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
        Class148 class148 = Class148.Field8575;
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        double d = Class1913.Method7117().player.motionX;
        Class44 class44 = this.Field16878;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"motionLimiterPositiveXValue");
        double d2 = class44.Method367();
        Class44 class442 = this.Field16880;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"motionLimiterNegativeXValue");
        double d3 = class442.Method367();
        Class44 class443 = this.Field16877;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"motionLimiterPositiveXState");
        boolean bl = class443.Method365();
        Class44 class444 = this.Field16879;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"motionLimiterNegativeXState");
        entityPlayerSP.motionX = class148.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(d, d2, d3, bl, class444.Method365());
        EntityPlayerSP entityPlayerSP2 = Class1913.Method7117().player;
        double d4 = Class1913.Method7117().player.motionY;
        Class44 class445 = this.Field16883;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"motionLimiterPositiveYValue");
        double d5 = class445.Method367();
        Class44 class446 = this.Field16885;
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"motionLimiterNegativeYValue");
        double d6 = class446.Method367();
        Class44 class447 = this.Field16882;
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"motionLimiterPositiveYState");
        boolean bl2 = class447.Method365();
        Class44 class448 = this.Field16884;
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"motionLimiterNegativeYMode");
        entityPlayerSP2.motionY = class148.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(d4, d5, d6, bl2, class448.Method341() != Class1552.Field15239);
        EntityPlayerSP entityPlayerSP3 = Class1913.Method7117().player;
        double d7 = Class1913.Method7117().player.motionZ;
        Class44 class449 = this.Field16888;
        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"motionLimiterPositiveZValue");
        double d8 = class449.Method367();
        Class44 class4410 = this.Field16890;
        Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"motionLimiterNegativeZValue");
        double d9 = class4410.Method367();
        Class44 class4411 = this.Field16887;
        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"motionLimiterPositiveZState");
        boolean bl3 = class4411.Method365();
        Class44 class4412 = this.Field16889;
        Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"motionLimiterNegativeZState");
        entityPlayerSP3.motionZ = class148.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(d7, d8, d9, bl3, class4412.Method365());
        if (!Class1913.Method7117().player.onGround) return;
        Class44 class4413 = this.Field16884;
        Intrinsics.checkExpressionValueIsNotNull((Object)class4413, (String)"motionLimiterNegativeYMode");
        if (class4413.Method341() != Class1552.Field15241) return;
        if (!this.Field16845.Method365()) return;
        double d10 = 0.0;
        double d11 = 0.0;
        while (true) {
            Class44 class4414 = this.Field16846;
            Intrinsics.checkExpressionValueIsNotNull((Object)class4414, (String)"reverseStepVal");
            if (!(d11 < (double)class4414.Method335() + Double.longBitsToDouble(4602678819172646912L))) {
                if (!(Class1913.Method7117().player.motionY < d10)) return;
                Class1913.Method7117().player.motionY = d10;
                return;
            }
            WorldClient worldClient = Class1913.Method7117().world;
            Entity entity = (Entity)Class1913.Method7117().player;
            EntityPlayerSP entityPlayerSP4 = Class1913.Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
            List list = worldClient.getCollisionBoxes(entity, entityPlayerSP4.getEntityBoundingBox().offset(0.0, -d11, 0.0));
            Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.getCollisionBox\u2026Box.offset(0.0, -y, 0.0))");
            Collection collection = list;
            boolean bl4 = false;
            boolean bl5 = !collection.isEmpty();
            d11 += Double.longBitsToDouble(4576918229304087675L);
        }
    }

    private final void Method7106() {
        block3: {
            block2: {
                Class44 class44 = this.Field16872;
                Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"instant");
                if (!class44.Method365()) return;
                EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (entityPlayerSP.isInWater()) break block2;
                EntityPlayerSP entityPlayerSP2 = Class1913.Method7117().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
                if (!entityPlayerSP2.isInLava()) break block3;
            }
            Class44 class44 = this.Field16873;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"instantLiquids");
            if (!class44.Method365()) return;
        }
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isElytraFlying()) return;
        Class44 class44 = this.Field16874;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"instantSlow");
        double[] dArray = Class1917.Method7166(Class1917.Method7154(class44.Method365(), Double.longBitsToDouble(4598847156609680094L)));
        Class1913.Method7117().player.motionX = dArray[0];
        Class1913.Method7117().player.motionZ = dArray[1];
    }

    private final void Method7107() {
        Class44 class44 = this.Field16868;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"levitationControl");
        if (!class44.Method365()) return;
        if (Class1913.Method7117().player.getActivePotionEffect(MobEffects.LEVITATION) == null) return;
        boolean bl = true;
        KeyBinding keyBinding = Class1913.Method7117().gameSettings.keyBindJump;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindJump");
        if (keyBinding.isPressed()) {
            EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
            Class44 class442 = this.Field16869;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"levitationControlUpSpeed");
            entityPlayerSP.motionY = class442.Method367();
            bl = false;
        }
        KeyBinding keyBinding2 = Class1913.Method7117().gameSettings.keyBindSneak;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding2, (String)"mc.gameSettings.keyBindSneak");
        if (keyBinding2.isPressed()) {
            EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
            Class44 class443 = this.Field16870;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"levitationControlDownSpeed");
            entityPlayerSP.motionY = class443.Method367();
            bl = false;
        }
        Class1913.Method7117().player.motionY = 0.0;
    }

    private final void Method7108() {
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!entityPlayerSP.isOnLadder()) return;
        Class44 class44 = this.Field16864;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fastLadder");
        if (!class44.Method365()) return;
        Class1913.Method7117().player.jump();
    }

    private final void Method7109() {
        Class44 class44 = this.Field16851;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"parkour");
        if (!class44.Method365()) return;
        if (!Class1913.Method7117().player.onGround) return;
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isSneaking()) return;
        if (Class1913.Method7117().gameSettings.keyBindJump.pressed) return;
        WorldClient worldClient = Class1913.Method7117().world;
        Entity entity = (Entity)Class1913.Method7117().player;
        EntityPlayerSP entityPlayerSP2 = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (!worldClient.getCollisionBoxes(entity, entityPlayerSP2.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble((long)278650793 ^ 0xBFE00000109BDFA9L), 0.0).expand(Double.longBitsToDouble((long)1925890579 ^ 0xBA1FB0F6CC9AA20AL), 0.0, Double.longBitsToDouble((long)1708043052 ^ 0xB9E95A5E9B68186BL))).isEmpty()) return;
        Class1913.Method7117().player.jump();
    }

    private final void Method7110() {
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!entityPlayerSP.isInLava()) {
            EntityPlayerSP entityPlayerSP2 = Class1913.Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            if (!entityPlayerSP2.isInWater()) return;
        }
        if (!Class1917.Method7159()) return;
        Class44 class44 = this.Field16863;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"fastSwim");
        if (!class44.Method365()) return;
        EntityPlayerSP entityPlayerSP3 = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
        entityPlayerSP3.setSprinting(true);
        KeyBinding keyBinding = Class1913.Method7117().gameSettings.keyBindJump;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindJump");
        if (!keyBinding.isKeyDown()) return;
        Class1913.Method7117().player.motionY = Double.longBitsToDouble((long)830325270 ^ 0x3FB916871A7FCE5CL);
    }

    private final void Method7111() {
        Class44 class44 = this.Field16861;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"iceSpeed");
        if (!class44.Method365()) return;
        Class44 class442 = this.Field16862;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"iceSpeedVal");
        Blocks.ICE.slipperiness = class442.Method368();
        Class44 class443 = this.Field16862;
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"iceSpeedVal");
        Blocks.PACKED_ICE.slipperiness = class443.Method368();
        Class44 class444 = this.Field16862;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"iceSpeedVal");
        Blocks.FROSTED_ICE.slipperiness = class444.Method368();
    }

    private final void Method7112() {
        Blocks.ICE.slipperiness = Float.intBitsToFloat(1065017672);
        Blocks.PACKED_ICE.slipperiness = Float.intBitsToFloat(1065017672);
        Blocks.FROSTED_ICE.slipperiness = Float.intBitsToFloat(1065017672);
    }

    private final void Method7113() {
        Class44 class44 = this.Field16892;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"noJumpDelay");
        if (class44.Method365()) {
            Class1913.Method7117().player.jumpTicks = 0;
            Class1913.Method7117().player.nextStepDistance = 0;
        }
        Class44 class442 = this.Field16893;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"noStepDelay");
        if (!class442.Method365()) return;
        Class1913.Method7117().playerController.stepSoundTickCounter = 0.0f;
    }

    private final void Method7114() {
        if (this.Field16854.Method341() == Class774.Field11275) return;
        Class44 class44 = this.Field16855;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"sprintOnlyWhileMoving");
        if (class44.Method365() && !Class1917.Method7159()) {
            return;
        }
        if (this.Field16854.Method341() == Class774.Field11277 && !Class1913.Method7117().gameSettings.keyBindForward.pressed) {
            return;
        }
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        entityPlayerSP.setSprinting(true);
    }

    private final void Method7115() {
        Class44 class44 = this.Field16858;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"autoJump");
        if (class44.Method365()) {
            Class1913.Method7117().gameSettings.keyBindJump.pressed = true;
        }
        Class44 class442 = this.Field16857;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"autoWalk");
        if (class442.Method341() != Class1972.Field17077) {
            Class44 class443 = this.Field16857;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"autoWalk");
            if (class443.Method341() == Class1972.Field17078) {
                Class1913.Method7117().gameSettings.keyBindForward.pressed = true;
                if (Class1495.Method5990()) {
                    Class1495.Method5989();
                }
            } else if (!Class1495.Method5990()) {
                Class1495.Method5988(0, 0);
            }
        } else if (Class1495.Method5990()) {
            Class1495.Method5989();
        }
        Class44 class444 = this.Field16859;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"autoSneak");
        if (!class444.Method365()) return;
        Class1913.Method7117().gameSettings.keyBindSneak.pressed = true;
    }

    private final void Method7116() {
        long l;
        if (!this.Field16845.Method365()) return;
        if (!Class1913.Method7117().player.onGround) return;
        EntityPlayerSP entityPlayerSP = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isInWater()) return;
        EntityPlayerSP entityPlayerSP2 = Class1913.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (entityPlayerSP2.isOnLadder()) return;
        Class44 class44 = this.Field16849;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"reverseStepLagTime");
        if (class44.Method365()) {
            Class44 class442 = this.Field16850;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"reverseStepLagTimeVal");
            l = class442.Method369();
        } else {
            l = 500L;
        }
        if (this.Field16894.Method2797(l)) {
            this.Field16894.Method2801();
            Class44 class443 = this.Field16849;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"reverseStepLagTime");
            if (class443.Method365()) {
                return;
            }
        }
        double d = 0.0;
        while (true) {
            Class44 class444 = this.Field16846;
            Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"reverseStepVal");
            if (!(d < (double)class444.Method335() + Double.longBitsToDouble(4602678819172646912L))) return;
            Class44 class445 = this.Field16847;
            Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"reverseAntiGlitch");
            if (class445.Method365()) {
                Double.compare(d, Double.longBitsToDouble((long)737157486 ^ 0x3FE000002BF0216EL));
            }
            WorldClient worldClient = Class1913.Method7117().world;
            Entity entity = (Entity)Class1913.Method7117().player;
            EntityPlayerSP entityPlayerSP3 = Class1913.Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            List list = worldClient.getCollisionBoxes(entity, entityPlayerSP3.getEntityBoundingBox().offset(0.0, -d, 0.0));
            Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.getCollisionBox\u2026Box.offset(0.0, -y, 0.0))");
            Collection collection = list;
            boolean bl = false;
            boolean bl2 = !collection.isEmpty();
            d += Double.longBitsToDouble((long)957217447 ^ 0x3F847AE17EA3EEDCL);
        }
    }

    public Class1913() {
        super("MoveModifier", "Extra movement features.", Class97.Field8340);
        Class44 class44 = new Class44("Entity Step", (Class42)this, false).Method355("Step");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Entity Step\", t\u2026, false).setTitle(\"Step\")");
        this.Field16835 = this.Method23(this.Field16834.Method7405(class44));
        Class44 class442 = new Class44("Entity Step Value", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4010000000000000L), true).Method312(this.Field16835).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Entity Step Val\u2026yStep).setTitle(\"Height\")");
        this.Field16836 = this.Method23(this.Field16834.Method7405(class442));
        this.Field16837 = this.Method24(this.Field16833.Method7406(new Class1996(new Class44("Speed", this))));
        Class44 class443 = new Class44("Entity Speed", (Class42)this, false).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Entity Speed\", \u2026 false).setTitle(\"Speed\")");
        this.Field16838 = this.Method23(this.Field16837.Method7405(class443));
        Class44 class444 = new Class44("Entity Speed Value", (Class42)this, 1.0, 1.0, Double.longBitsToDouble((long)304873996 ^ 0x40240000122C020CL), true).Method312(this.Field16838).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Entity Speed Va\u2026ySpeed).setTitle(\"Speed\")");
        this.Field16839 = this.Method23(this.Field16837.Method7405(class444));
        this.Field16840 = this.Method24(new Class1996(new Class44("Blocks", this)));
        this.Field16841 = this.Method24(this.Field16840.Method7406(new Class1996(new Class44("Step", this))));
        this.Field16842 = this.Method23(this.Field16841.Method7405(new Class44("Step", (Class42)this, false)));
        Class44 class445 = new Class44("Step Value", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 1.0, Double.longBitsToDouble((long)815078469 ^ 0x4010000030951C45L), true).Method312(this.Field16842).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Step Value\", th\u2026(step).setTitle(\"Height\")");
        this.Field16843 = this.Method23(this.Field16841.Method7405(class445));
        this.Field16844 = this.Method24(this.Field16840.Method7406(new Class1996(new Class44("Reverse Step", this))));
        Class44 class446 = new Class44("Reverse Step", (Class42)this, false).Method355("RStep");
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"Setting(\"Reverse Step\", \u2026 false).setTitle(\"RStep\")");
        Class44 class447 = this.Method23(this.Field16844.Method7405(class446));
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"register(reverseStepGrou\u2026alse).setTitle(\"RStep\")))");
        this.Field16845 = class447;
        Class44 class448 = new Class44("Reverse Step Value", (Class42)this, Double.longBitsToDouble(0x4000000000000000L), 1.0, Double.longBitsToDouble((long)1742559253 ^ 0x4010000067DD5815L), true).Method312(this.Field16845).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)class448, (String)"Setting(\"Reverse Step Va\u2026eStep).setTitle(\"Height\")");
        this.Field16846 = this.Method23(this.Field16844.Method7405(class448));
        Class44 class449 = new Class44("Reverse Anti Glitch", (Class42)this, true).Method312(this.Field16845).Method355("AntiGlitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)class449, (String)"Setting(\"Reverse Anti Gl\u2026p).setTitle(\"AntiGlitch\")");
        this.Field16847 = this.Method23(this.Field16844.Method7405(class449));
        this.Field16848 = this.Method24(this.Field16844.Method7406(new Class1996(new Class44("Lag Time", this))));
        Class44 class4410 = new Class44("Reverse Step Lag Time", (Class42)this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4410, (String)"Setting(\"Reverse Step La\u2026 false).setTitle(\"State\")");
        this.Field16849 = this.Method23(this.Field16848.Method7405(class4410));
        Class44 class4411 = new Class44("Reverse Step Lag Time Value", (Class42)this, Double.longBitsToDouble((long)284297253 ^ 0x407F400010F20825L), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943).Method355("Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4411, (String)"Setting(\"Reverse Step La\u2026e.TIME).setTitle(\"Value\")");
        this.Field16850 = this.Method23(this.Field16848.Method7405(class4411));
        this.Field16851 = this.Method23(this.Field16840.Method7405(new Class44("Parkour", (Class42)this, false)));
        this.Field16852 = this.Method24(new Class1996(new Class44("Move", this)));
        this.Field16853 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Sprint", this))));
        Class44 class4412 = this.Method23(this.Field16853.Method7405(new Class44("Sprint", (Class42)this, Class774.Field11275)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class4412, (String)"register(sprintGroup.add\u2026this, SprintModes.None)))");
        this.Field16854 = class4412;
        Class44 class4413 = new Class44("Sprint Only While Moving", (Class42)this, false).Method313(new Class108(this)).Method355("While Move");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4413, (String)"Setting(\"Sprint Only Whi\u2026 }.setTitle(\"While Move\")");
        this.Field16855 = this.Method23(this.Field16853.Method7405(class4413));
        Class44 class4414 = this.Method23(this.Field16852.Method7405(new Class44("Keep Sprint", (Class42)this, false)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class4414, (String)"register(move.add(Settin\u2026p Sprint\", this, false)))");
        this.Field16856 = class4414;
        this.Field16857 = this.Method23(this.Field16852.Method7405(new Class44("Auto Walk", (Class42)this, Class1972.Field17077)));
        this.Field16858 = this.Method23(this.Field16852.Method7405(new Class44("Auto Jump", (Class42)this, false)));
        this.Field16859 = this.Method23(this.Field16852.Method7405(new Class44("Auto Sneak", (Class42)this, false)));
        this.Field16860 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Ice Speed", this))));
        this.Field16861 = this.Method23(this.Field16860.Method7405(new Class44("Ice Speed", (Class42)this, false)));
        Class44 class4415 = new Class44("Ice Speed Val", (Class42)this, Double.longBitsToDouble((long)617278204 ^ 0x3FD99999BD537366L), Double.longBitsToDouble(4596373779694328218L), Double.longBitsToDouble(4609434218613702656L), false).Method312(this.Field16861).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4415, (String)"Setting(\"Ice Speed Val\",\u2026eSpeed).setTitle(\"Speed\")");
        this.Field16862 = this.Method23(this.Field16860.Method7405(class4415));
        this.Field16863 = this.Method23(this.Field16852.Method7405(new Class44("Fast Swim", (Class42)this, false)));
        this.Field16864 = this.Method23(this.Field16852.Method7405(new Class44("Fast Ladder", (Class42)this, false)));
        this.Field16865 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Controls", this))));
        Class44 class4416 = new Class44("Entity Control", (Class42)this, false).Method355("Entity");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4416, (String)"Setting(\"Entity Control\"\u2026false).setTitle(\"Entity\")");
        this.Field16866 = this.Method23(this.Field16865.Method7405(class4416));
        this.Field16867 = this.Method24(this.Field16865.Method7406(new Class1996(new Class44("Levitation", this))));
        Class44 class4417 = new Class44("Levitation Control", (Class42)this, false).Method355("Levitation");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4417, (String)"Setting(\"Levitation Cont\u2026e).setTitle(\"Levitation\")");
        this.Field16868 = this.Method23(this.Field16867.Method7405(class4417));
        Class44 class4418 = new Class44("Levitation Control Up Speed", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4000000000000000L), false).Method312(this.Field16868).Method355("Up");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4418, (String)"Setting(\"Levitation Cont\u2026onControl).setTitle(\"Up\")");
        this.Field16869 = this.Method23(this.Field16867.Method7405(class4418));
        Class44 class4419 = new Class44("Levitation Control Down Speed", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4000000000000000L), false).Method312(this.Field16868).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4419, (String)"Setting(\"Levitation Cont\u2026Control).setTitle(\"Down\")");
        this.Field16870 = this.Method23(this.Field16867.Method7405(class4419));
        this.Field16871 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Instant", this))));
        Class44 class4420 = new Class44("Instant State", (Class42)this, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4420, (String)"Setting(\"Instant State\",\u2026 false).setTitle(\"State\")");
        this.Field16872 = this.Method23(this.Field16871.Method7405(class4420));
        Class44 class4421 = new Class44("Instant Liquids", (Class42)this, false).Method355("Liquids");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4421, (String)"Setting(\"Instant Liquids\u2026alse).setTitle(\"Liquids\")");
        this.Field16873 = this.Method23(this.Field16871.Method7405(class4421));
        Class44 class4422 = new Class44("Instant Slow", (Class42)this, false).Method355("Slow");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4422, (String)"Setting(\"Instant Slow\", \u2026, false).setTitle(\"Slow\")");
        this.Field16874 = this.Method23(this.Field16871.Method7405(class4422));
        this.Field16875 = this.Method24(this.Field16852.Method7406(new Class1996(new Class44("Motion Limiter", this))));
        this.Field16876 = this.Method24(this.Field16875.Method7406(new Class1996(new Class44("X", this))));
        Class44 class4423 = new Class44("Motion Limiter Positive X State", (Class42)this, false).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4423, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16877 = this.Method23(this.Field16876.Method7405(class4423));
        Class44 class4424 = new Class44("Motion Limiter Positive X Value", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)1150488398 ^ 0x4014000044930F4EL), false).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4424, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16878 = this.Method23(this.Field16876.Method7405(class4424));
        Class44 class4425 = new Class44("Motion Limiter Negative X State", (Class42)this, false).Method355("\"-\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4425, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" State\")");
        this.Field16879 = this.Method23(this.Field16876.Method7405(class4425));
        Class44 class4426 = new Class44("Motion Limiter Negative X Value", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)0x1C111D1D ^ 0x401400001C111D1DL), false).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4426, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16880 = this.Method23(this.Field16876.Method7405(class4426));
        this.Field16881 = this.Method24(this.Field16875.Method7406(new Class1996(new Class44("Y", this))));
        Class44 class4427 = new Class44("Motion Limiter Positive Y State", (Class42)this, false).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4427, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16882 = this.Method23(this.Field16881.Method7405(class4427));
        Class44 class4428 = new Class44("Motion Limiter Positive Y Value", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)634852934 ^ 0x4014000025D71646L), false).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4428, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16883 = this.Method23(this.Field16881.Method7405(class4428));
        Class44 class4429 = new Class44("Motion Limiter Negative Y Mode", (Class42)this, Class1552.Field15239).Method355("\"-\" Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4429, (String)"Setting(\"Motion Limiter \u2026e).setTitle(\"\\\"-\\\" Mode\")");
        this.Field16884 = this.Method23(this.Field16881.Method7405(class4429));
        Class44 class4430 = new Class44("Motion Limiter Negative Y Value", (Class42)this, 1.0, 0.0, Double.longBitsToDouble((long)1302808390 ^ 0x401400004DA74746L), false).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4430, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16885 = this.Method23(this.Field16881.Method7405(class4430));
        this.Field16886 = this.Method24(this.Field16875.Method7406(new Class1996(new Class44("Z", this))));
        Class44 class4431 = new Class44("Motion Limiter Positive Z State", (Class42)this, false).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4431, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16887 = this.Method23(this.Field16886.Method7405(class4431));
        Class44 class4432 = new Class44("Motion Limiter Positive Z Value", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4014000000000000L), false).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4432, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16888 = this.Method23(this.Field16886.Method7405(class4432));
        Class44 class4433 = new Class44("Motion Limiter Negative Z State", (Class42)this, false).Method355("\"-\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4433, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" State\")");
        this.Field16889 = this.Method23(this.Field16886.Method7405(class4433));
        Class44 class4434 = new Class44("Motion Limiter Negative Z Value", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4014000000000000L), false).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)class4434, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16890 = this.Method23(this.Field16886.Method7405(class4434));
        this.Field16891 = this.Method24(new Class1996(new Class44("Delays", this)));
        this.Field16892 = this.Method23(this.Field16891.Method7405(new Class44("No Jump Delay", (Class42)this, false)));
        this.Field16893 = this.Method23(this.Field16891.Method7405(new Class44("No Step Delay", (Class42)this, false)));
        this.Field16894 = new Class650();
        this.Field16842.Method303(new Class1634(this));
        this.Field16845.Method303(new Class1639(this));
        this.Field16835.Method303(new Class1640(this));
        this.Field16838.Method303(new Class1641(this));
        this.Field16854.Method303(new Class1642(this));
        this.Field16861.Method303(new Class1637(this));
        Field16897 = this;
        this.Field16895 = new Class618((Class254)new Class1171(this), new Predicate[0]);
        this.Field16896 = new Class618((Class254)new Class1457(this), new Predicate[0]);
    }

    static {
        Field16898 = new Class75(null);
    }

    public static final Minecraft Method7117() {
        return Class42.Field8052;
    }

    public static final void Method7118(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final Class44 Method7119(Class1913 class1913) {
        return class1913.Field16846;
    }

    public static final Class44 Method7120(Class1913 class1913) {
        return class1913.Field16836;
    }

    public static final Class44 Method7121(Class1913 class1913) {
        return class1913.Field16839;
    }

    public static final Class44 Method7122(Class1913 class1913) {
        return class1913.Field16862;
    }

    public static final Class44 Method7123(Class1913 class1913) {
        return class1913.Field16864;
    }

    public static final Class44 Method7124(Class1913 class1913) {
        return class1913.Field16866;
    }

    public static final Class1913 Method7125() {
        return Field16897;
    }

    public static final void Method7126(Class1913 class1913) {
        Field16897 = class1913;
    }

    @Nullable
    @Nullable
    public static final Class1913 Method7127() {
        Class75 class75 = Field16898;
        return Field16897;
    }

    public static final void Method7128(@Nullable @Nullable Class1913 class1913) {
        Class75 class75 = Field16898;
        Field16897 = class1913;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 30;
            cArray2[n] = (char)(cArray[n] ^ (0x40F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

