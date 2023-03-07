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

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$1;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$2;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$3;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$4;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$5;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$6;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.client.I2y63R48wFIDKwFXzDoXGywViLiXdmnS;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.o73igJQaa2O9BEYFQNAk42oaxHBow5kd;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
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
public final class GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16833 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entities", this)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16834 = this.Method24(this.Field16833.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Step", this))));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16835;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16836;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16837;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16838;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16839;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16840;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16841;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16842;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16843;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16844;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16845;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16846;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16847;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16848;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16849;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16850;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16851;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16852;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16853;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16854;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16855;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16856;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16857;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16858;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16859;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16860;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16861;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16862;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16863;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16864;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16865;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16866;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16867;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16868;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16869;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16870;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16871;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16872;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16873;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16874;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16875;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16876;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16877;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16878;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16879;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16880;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16881;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16882;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16883;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16884;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16885;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16886;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16887;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16888;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16889;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16890;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field16891;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16892;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16893;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field16894;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16895;
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16896;
    @Nullable
    private static GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Field16897;
    public static final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16898;
    private int Field16899;

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7101() {
        return this.Field16843;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7102() {
        return this.Field16845;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7103() {
        return this.Field16854;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7104() {
        return this.Field16856;
    }

    @Override
    public void Method38() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16895);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16896);
        this.Field16894.Method2801();
    }

    @Override
    public void Method39() {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16896);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16895);
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player == null) return;
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().world == null) {
            return;
        }
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.stepHeight = Float.intBitsToFloat((int)((long)365797067 ^ (long)718118603));
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        entityPlayerSP.setSprinting((boolean)((long)-1399649619 ^ (long)-1399649619));
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.ridingEntity != null) {
            GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.ridingEntity.stepHeight = Float.intBitsToFloat((int)((long)395417817 ^ (long)680630489));
        }
        this.Method7112();
        if (!apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5990()) return;
        apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5989();
    }

    @Override
    public void Method45() {
        float f;
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player == null) return;
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().world == null) return;
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().playerController == null) {
            return;
        }
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16842;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"step");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16843;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"stepVal");
            f = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368();
        } else {
            f = entityPlayerSP.stepHeight = Float.intBitsToFloat((int)1236490475L ^ 0x76B358EB);
        }
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.ridingEntity != null) {
            float f2;
            Entity entity = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.ridingEntity;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16835;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"entityStep");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16836;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"entityStepVal");
                f2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method368();
            } else {
                f2 = Float.intBitsToFloat((int)513764424L ^ 0x219F6C48);
            }
            entity.stepHeight = f2;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field16838;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"entitySpeed");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field16839;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"entitySpeedVal");
                double[] dArray = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7150(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method367());
                GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.ridingEntity.motionX = dArray[(int)((long)1061058621 ^ (long)1061058621)];
                GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.ridingEntity.motionZ = dArray[(int)((long)-555718495 ^ (long)-555718496)];
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
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field8575;
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        double d = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionX;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16878;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"motionLimiterPositiveXValue");
        double d2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method367();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16880;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"motionLimiterNegativeXValue");
        double d3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16877;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"motionLimiterPositiveXState");
        boolean bl = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16879;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"motionLimiterNegativeXState");
        entityPlayerSP.motionX = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(d, d2, d3, bl, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365());
        EntityPlayerSP entityPlayerSP2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        double d4 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionY;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field16883;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"motionLimiterPositiveYValue");
        double d5 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method367();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = this.Field16885;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"motionLimiterNegativeYValue");
        double d6 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7.Method367();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Field16882;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"motionLimiterPositiveYState");
        boolean bl2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8.Method365();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = this.Field16884;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"motionLimiterNegativeYMode");
        entityPlayerSP2.motionY = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(d4, d5, d6, bl2, (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9.Method341() != GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15239 ? (int)-2038497310L ^ 0x867EFFE3 : (int)-537345295L ^ 0xDFF8C2F1) != 0);
        EntityPlayerSP entityPlayerSP3 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        double d7 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionZ;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = this.Field16888;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"motionLimiterPositiveZValue");
        double d8 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10.Method367();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = this.Field16890;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"motionLimiterNegativeZValue");
        double d9 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11.Method367();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = this.Field16887;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"motionLimiterPositiveZState");
        boolean bl3 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12.Method365();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = this.Field16889;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"motionLimiterNegativeZState");
        entityPlayerSP3.motionZ = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(d7, d8, d9, bl3, qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13.Method365());
        if (!GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.onGround) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = this.Field16884;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"motionLimiterNegativeYMode");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14.Method341() != GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15241) return;
        if (!this.Field16845.Method365()) return;
        double d10 = 0.0;
        double d11 = 0.0;
        while (true) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15 = this.Field16846;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15, (String)"reverseStepVal");
            if (!(d11 < (double)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15.Method335() + Double.longBitsToDouble(0x4245FDC210B86825L ^ 0x7DA5FDC210B86825L))) {
                if (!(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionY < d10)) return;
                GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionY = d10;
                return;
            }
            WorldClient worldClient = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().world;
            Entity entity = (Entity)GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
            EntityPlayerSP entityPlayerSP4 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP4, (String)"mc.player");
            List list = worldClient.getCollisionBoxes(entity, entityPlayerSP4.getEntityBoundingBox().offset(0.0, -d11, 0.0));
            Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.getCollisionBox\u2026Box.offset(0.0, -y, 0.0))");
            Collection collection = list;
            int n = (int)((long)-1808918751 ^ (long)-1808918751);
            int n2 = !collection.isEmpty() ? (int)-1681319699L ^ 0x9BC918EC : (int)((long)-1822083232 ^ (long)-1822083232);
            d11 += Double.longBitsToDouble(0xBFE39FEEEBF63C18L ^ 0x8067E50FAC582863L);
        }
    }

    private final void Method7106() {
        block3: {
            block2: {
                qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16872;
                Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"instant");
                if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
                EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
                if (entityPlayerSP.isInWater()) break block2;
                EntityPlayerSP entityPlayerSP2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
                Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
                if (!entityPlayerSP2.isInLava()) break block3;
            }
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16873;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"instantLiquids");
            if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) return;
        }
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isElytraFlying()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16874;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"instantSlow");
        double[] dArray = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7166(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365(), Double.longBitsToDouble(0x7B93247548E55AE3L ^ 0x4441476AC2EC583DL)));
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionX = dArray[(int)((long)1854908457 ^ (long)1854908457)];
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionZ = dArray[(int)-1510620161L ^ 0xA5F5C3FE];
    }

    private final void Method7107() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16868;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"levitationControl");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.getActivePotionEffect(MobEffects.LEVITATION) == null) return;
        int n = (int)-225852249L ^ 0xF289C4A6;
        KeyBinding keyBinding = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindJump;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindJump");
        if (keyBinding.isPressed()) {
            EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16869;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"levitationControlUpSpeed");
            entityPlayerSP.motionY = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method367();
            n = (int)-1506490655L ^ 0xA634C6E1;
        }
        KeyBinding keyBinding2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindSneak;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding2, (String)"mc.gameSettings.keyBindSneak");
        if (keyBinding2.isPressed()) {
            EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16870;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"levitationControlDownSpeed");
            entityPlayerSP.motionY = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method367();
            n = (int)((long)-1390529935 ^ (long)-1390529935);
        }
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionY = 0.0;
    }

    private final void Method7108() {
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!entityPlayerSP.isOnLadder()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16864;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fastLadder");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.jump();
    }

    private final void Method7109() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16851;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"parkour");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        if (!GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.onGround) return;
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isSneaking()) return;
        if (GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindJump.pressed) return;
        WorldClient worldClient = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().world;
        Entity entity = (Entity)GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        EntityPlayerSP entityPlayerSP2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (!worldClient.getCollisionBoxes(entity, entityPlayerSP2.getEntityBoundingBox().offset(0.0, Double.longBitsToDouble((long)278650793 ^ 0xBFE00000109BDFA9L), 0.0).expand(Double.longBitsToDouble((long)1925890579 ^ 0xBA1FB0F6CC9AA20AL), 0.0, Double.longBitsToDouble((long)1708043052 ^ 0xB9E95A5E9B68186BL))).isEmpty()) return;
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.jump();
    }

    private final void Method7110() {
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (!entityPlayerSP.isInLava()) {
            EntityPlayerSP entityPlayerSP2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
            if (!entityPlayerSP2.isInWater()) return;
        }
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16863;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"fastSwim");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        EntityPlayerSP entityPlayerSP3 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
        entityPlayerSP3.setSprinting((boolean)((long)-1891991911 ^ (long)-1891991912));
        KeyBinding keyBinding = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindJump;
        Intrinsics.checkExpressionValueIsNotNull((Object)keyBinding, (String)"mc.gameSettings.keyBindJump");
        if (!keyBinding.isKeyDown()) return;
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.motionY = Double.longBitsToDouble((long)830325270 ^ 0x3FB916871A7FCE5CL);
    }

    private final void Method7111() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16861;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"iceSpeed");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16862;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"iceSpeedVal");
        Blocks.ICE.slipperiness = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method368();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16862;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"iceSpeedVal");
        Blocks.PACKED_ICE.slipperiness = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method368();
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16862;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"iceSpeedVal");
        Blocks.FROSTED_ICE.slipperiness = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method368();
    }

    private final void Method7112() {
        Blocks.ICE.slipperiness = Float.intBitsToFloat((int)((long)1099697275 ^ (long)2130111795));
        Blocks.PACKED_ICE.slipperiness = Float.intBitsToFloat((int)55462717L ^ 0x3C34AA75);
        Blocks.FROSTED_ICE.slipperiness = Float.intBitsToFloat((int)283577528L ^ 0x2F9DEDF0);
    }

    private final void Method7113() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16892;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"noJumpDelay");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.jumpTicks = (int)-820480938L ^ 0xCF187456;
            GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.nextStepDistance = (int)((long)911652479 ^ (long)911652479);
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16893;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"noStepDelay");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) return;
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().playerController.stepSoundTickCounter = 0.0f;
    }

    private final void Method7114() {
        if (this.Field16854.Method341() == I2y63R48wFIDKwFXzDoXGywViLiXdmnS.Field11275) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16855;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"sprintOnlyWhileMoving");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365() && !o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            return;
        }
        if (this.Field16854.Method341() == I2y63R48wFIDKwFXzDoXGywViLiXdmnS.Field11277 && !GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindForward.pressed) {
            return;
        }
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        entityPlayerSP.setSprinting(((int)993388005L ^ 0x3B35E5E4) != 0);
    }

    private final void Method7115() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16858;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"autoJump");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindJump.pressed = (int)-1859498322L ^ 0x912A4EAF;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16857;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"autoWalk");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341() != GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17077) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16857;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"autoWalk");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method341() == GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17078) {
                GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindForward.pressed = (int)((long)1538467229 ^ (long)1538467228);
                if (apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5990()) {
                    apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5989();
                }
            } else if (!apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5990()) {
                apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5988((int)-1582801260L ^ 0xA1A85E94, (int)240110160L ^ 0xE4FCA50);
            }
        } else if (apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5990()) {
            apMkTOYFgLbmdcA1wMUKdveSwIHOH1BJ.Method5989();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16859;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"autoSneak");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) return;
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().gameSettings.keyBindSneak.pressed = (int)((long)-2102816338 ^ (long)-2102816337);
    }

    private final void Method7116() {
        long l;
        if (!this.Field16845.Method365()) return;
        if (!GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player.onGround) return;
        EntityPlayerSP entityPlayerSP = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP, (String)"mc.player");
        if (entityPlayerSP.isInWater()) return;
        EntityPlayerSP entityPlayerSP2 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
        Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP2, (String)"mc.player");
        if (entityPlayerSP2.isOnLadder()) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field16849;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"reverseStepLagTime");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field16850;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"reverseStepLagTimeVal");
            l = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method369();
        } else {
            l = 0xC0041F4L & 0x520407F6L;
        }
        if (this.Field16894.Method2797(l)) {
            this.Field16894.Method2801();
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field16849;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"reverseStepLagTime");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method365()) {
                return;
            }
        }
        double d = 0.0;
        while (true) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field16846;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"reverseStepVal");
            if (!(d < (double)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method335() + Double.longBitsToDouble(0xB7D297D1234E8712L ^ 0x883297D1234E8712L))) return;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field16847;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"reverseAntiGlitch");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method365()) {
                Double.compare(d, Double.longBitsToDouble((long)737157486 ^ 0x3FE000002BF0216EL));
            }
            WorldClient worldClient = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().world;
            Entity entity = (Entity)GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
            EntityPlayerSP entityPlayerSP3 = GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Method7117().player;
            Intrinsics.checkExpressionValueIsNotNull((Object)entityPlayerSP3, (String)"mc.player");
            List list = worldClient.getCollisionBoxes(entity, entityPlayerSP3.getEntityBoundingBox().offset(0.0, -d, 0.0));
            Intrinsics.checkExpressionValueIsNotNull((Object)list, (String)"mc.world.getCollisionBox\u2026Box.offset(0.0, -y, 0.0))");
            Collection collection = list;
            int n = (int)((long)1902809043 ^ (long)1902809043);
            int n2 = !collection.isEmpty() ? (int)1322711857L ^ 0x4ED6FB30 : (int)1720185631L ^ 0x6687F31F;
            d += Double.longBitsToDouble((long)957217447 ^ 0x3F847AE17EA3EEDCL);
        }
    }

    public GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x() {
        super("MoveModifier", "Extra movement features.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entity Step", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)630894954 ^ (long)630894954)).Method355("Step");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Entity Step\", t\u2026, false).setTitle(\"Step\")");
        this.Field16835 = this.Method23(this.Field16834.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entity Step Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0xFF1A2B246F35EBD3L ^ 0xBF0A2B246F35EBD3L), ((int)-2117397113L ^ 0x81CB1586) != 0).Method312(this.Field16835).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Entity Step Val\u2026yStep).setTitle(\"Height\")");
        this.Field16836 = this.Method23(this.Field16834.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        this.Field16837 = this.Method24(this.Field16833.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Speed", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entity Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1638647465 ^ (long)-1638647465)).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Entity Speed\", \u2026 false).setTitle(\"Speed\")");
        this.Field16838 = this.Method23(this.Field16837.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entity Speed Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble((long)304873996 ^ 0x40240000122C020CL), (boolean)((long)1544825088 ^ (long)1544825089)).Method312(this.Field16838).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Entity Speed Va\u2026ySpeed).setTitle(\"Speed\")");
        this.Field16839 = this.Method23(this.Field16837.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5));
        this.Field16840 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Blocks", this)));
        this.Field16841 = this.Method24(this.Field16840.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Step", this))));
        this.Field16842 = this.Method23(this.Field16841.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Step", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1690743606 ^ (long)-1690743606))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Step Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x576E0D14CAC72B84L ^ 0x176E0D14CAC72B84L), 1.0, Double.longBitsToDouble((long)815078469 ^ 0x4010000030951C45L), (boolean)((long)1282839652 ^ (long)1282839653)).Method312(this.Field16842).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Step Value\", th\u2026(step).setTitle(\"Height\")");
        this.Field16843 = this.Method23(this.Field16841.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6));
        this.Field16844 = this.Method24(this.Field16840.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reverse Step", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reverse Step", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-616367285 ^ (long)-616367285)).Method355("RStep");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"Setting(\"Reverse Step\", \u2026 false).setTitle(\"RStep\")");
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = this.Method23(this.Field16844.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"register(reverseStepGrou\u2026alse).setTitle(\"RStep\")))");
        this.Field16845 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reverse Step Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x3F70C338635A767EL ^ 0x7F70C338635A767EL), 1.0, Double.longBitsToDouble((long)1742559253 ^ 0x4010000067DD5815L), ((int)-459802291L ^ 0xE497F94C) != 0).Method312(this.Field16845).Method355("Height");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9, (String)"Setting(\"Reverse Step Va\u2026eStep).setTitle(\"Height\")");
        this.Field16846 = this.Method23(this.Field16844.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD9));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reverse Anti Glitch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1149189265L ^ 0x447F3C90) != 0).Method312(this.Field16845).Method355("AntiGlitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10, (String)"Setting(\"Reverse Anti Gl\u2026p).setTitle(\"AntiGlitch\")");
        this.Field16847 = this.Method23(this.Field16844.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD10));
        this.Field16848 = this.Method24(this.Field16844.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lag Time", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reverse Step Lag Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-744610916 ^ (long)-744610916)).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11, (String)"Setting(\"Reverse Step La\u2026 false).setTitle(\"State\")");
        this.Field16849 = this.Method23(this.Field16848.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD11));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Reverse Step Lag Time Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)284297253 ^ 0x407F400010F20825L), 0.0, Double.longBitsToDouble(0xBF1DA5088ED7BCF2L ^ 0xFF82E5088ED7BCF2L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12, (String)"Setting(\"Reverse Step La\u2026e.TIME).setTitle(\"Value\")");
        this.Field16850 = this.Method23(this.Field16848.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD12));
        this.Field16851 = this.Method23(this.Field16840.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Parkour", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1495189177L ^ 0x591EC6B9) != 0)));
        this.Field16852 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Move", this)));
        this.Field16853 = this.Method24(this.Field16852.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sprint", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13 = this.Method23(this.Field16853.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sprint", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, I2y63R48wFIDKwFXzDoXGywViLiXdmnS.Field11275)));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13, (String)"register(sprintGroup.add\u2026this, SprintModes.None)))");
        this.Field16854 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD13;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sprint Only While Moving", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1749321806L ^ 0x97BB77B2) != 0).Method313(new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi(this)).Method355("While Move");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14, (String)"Setting(\"Sprint Only Whi\u2026 }.setTitle(\"While Move\")");
        this.Field16855 = this.Method23(this.Field16853.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD14));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15 = this.Method23(this.Field16852.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Keep Sprint", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1174416684 ^ (long)-1174416684))));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15, (String)"register(move.add(Settin\u2026p Sprint\", this, false)))");
        this.Field16856 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD15;
        this.Field16857 = this.Method23(this.Field16852.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Walk", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17077)));
        this.Field16858 = this.Method23(this.Field16852.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Jump", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)752821664 ^ (long)752821664))));
        this.Field16859 = this.Method23(this.Field16852.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Auto Sneak", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2005985376L ^ 0x886F17A0) != 0)));
        this.Field16860 = this.Method24(this.Field16852.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ice Speed", this))));
        this.Field16861 = this.Method23(this.Field16860.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ice Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1216439569L ^ 0xB77E9AEF) != 0)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Ice Speed Val", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)617278204 ^ 0x3FD99999BD537366L), Double.longBitsToDouble(0xB85900F056BE8A32L ^ 0x87909969CF2713A8L), Double.longBitsToDouble(0xD553169677FDCF3L ^ 0x32AD3169677FDCF3L), ((int)1388095239L ^ 0x52BCA707) != 0).Method312(this.Field16861).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16, (String)"Setting(\"Ice Speed Val\",\u2026eSpeed).setTitle(\"Speed\")");
        this.Field16862 = this.Method23(this.Field16860.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD16));
        this.Field16863 = this.Method23(this.Field16852.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Swim", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1668932670 ^ (long)-1668932670))));
        this.Field16864 = this.Method23(this.Field16852.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fast Ladder", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1992093040 ^ (long)1992093040))));
        this.Field16865 = this.Method24(this.Field16852.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Controls", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Entity Control", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1525382940L ^ 0x5AEB7F1C) != 0).Method355("Entity");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17, (String)"Setting(\"Entity Control\"\u2026false).setTitle(\"Entity\")");
        this.Field16866 = this.Method23(this.Field16865.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD17));
        this.Field16867 = this.Method24(this.Field16865.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Levitation", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD18 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Levitation Control", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-174070116 ^ (long)-174070116)).Method355("Levitation");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD18, (String)"Setting(\"Levitation Cont\u2026e).setTitle(\"Levitation\")");
        this.Field16868 = this.Method23(this.Field16867.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD18));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD19 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Levitation Control Up Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0xA2B261A2459132ACL ^ 0xE2B261A2459132ACL), (boolean)((long)-98906489 ^ (long)-98906489)).Method312(this.Field16868).Method355("Up");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD19, (String)"Setting(\"Levitation Cont\u2026onControl).setTitle(\"Up\")");
        this.Field16869 = this.Method23(this.Field16867.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD19));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD20 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Levitation Control Down Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x2A1D0263E6284DE3L ^ 0x6A1D0263E6284DE3L), (boolean)((long)-433483643 ^ (long)-433483643)).Method312(this.Field16868).Method355("Down");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD20, (String)"Setting(\"Levitation Cont\u2026Control).setTitle(\"Down\")");
        this.Field16870 = this.Method23(this.Field16867.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD20));
        this.Field16871 = this.Method24(this.Field16852.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD21 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)711980210 ^ (long)711980210)).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD21, (String)"Setting(\"Instant State\",\u2026 false).setTitle(\"State\")");
        this.Field16872 = this.Method23(this.Field16871.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD21));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD22 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant Liquids", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1734526458L ^ 0x989D3A06) != 0).Method355("Liquids");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD22, (String)"Setting(\"Instant Liquids\u2026alse).setTitle(\"Liquids\")");
        this.Field16873 = this.Method23(this.Field16871.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD22));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD23 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Instant Slow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)235371312 ^ (long)235371312)).Method355("Slow");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD23, (String)"Setting(\"Instant Slow\", \u2026, false).setTitle(\"Slow\")");
        this.Field16874 = this.Method23(this.Field16871.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD23));
        this.Field16875 = this.Method24(this.Field16852.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter", this))));
        this.Field16876 = this.Method24(this.Field16875.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("X", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD24 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Positive X State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1096762920L ^ 0xBEA0B9D8) != 0).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD24, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16877 = this.Method23(this.Field16876.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD24));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD25 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Positive X Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)1150488398 ^ 0x4014000044930F4EL), ((int)-1485990929L ^ 0xA76D93EF) != 0).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD25, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16878 = this.Method23(this.Field16876.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD25));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD26 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Negative X State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-165448655 ^ (long)-165448655)).Method355("\"-\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD26, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" State\")");
        this.Field16879 = this.Method23(this.Field16876.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD26));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD27 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Negative X Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)0x1C111D1D ^ 0x401400001C111D1DL), (boolean)((long)732404995 ^ (long)732404995)).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD27, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16880 = this.Method23(this.Field16876.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD27));
        this.Field16881 = this.Method24(this.Field16875.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Y", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD28 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Positive Y State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-2075924959L ^ 0x8443E621) != 0).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD28, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16882 = this.Method23(this.Field16881.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD28));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD29 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Positive Y Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)634852934 ^ 0x4014000025D71646L), (boolean)((long)790118126 ^ (long)790118126)).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD29, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16883 = this.Method23(this.Field16881.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD29));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD30 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Negative Y Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field15239).Method355("\"-\" Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD30, (String)"Setting(\"Motion Limiter \u2026e).setTitle(\"\\\"-\\\" Mode\")");
        this.Field16884 = this.Method23(this.Field16881.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD30));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD31 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Negative Y Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble((long)1302808390 ^ 0x401400004DA74746L), (boolean)((long)-1040099263 ^ (long)-1040099263)).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD31, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16885 = this.Method23(this.Field16881.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD31));
        this.Field16886 = this.Method24(this.Field16875.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Z", this))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD32 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Positive Z State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2112661988L ^ 0x7DECA9E4) != 0).Method355("\"+\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD32, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" State\")");
        this.Field16887 = this.Method23(this.Field16886.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD32));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD33 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Positive Z Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x5A078D722F7F506AL ^ 0x1A138D722F7F506AL), (boolean)((long)860295265 ^ (long)860295265)).Method355("\"+\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD33, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"+\\\" Value\")");
        this.Field16888 = this.Method23(this.Field16886.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD33));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD34 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Negative Z State", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1650016854 ^ (long)-1650016854)).Method355("\"-\" State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD34, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" State\")");
        this.Field16889 = this.Method23(this.Field16886.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD34));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD35 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Limiter Negative Z Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x515FD12B689CA81BL ^ 0x114BD12B689CA81BL), (boolean)((long)-1368796606 ^ (long)-1368796606)).Method355("\"-\" Value");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD35, (String)"Setting(\"Motion Limiter \u2026).setTitle(\"\\\"-\\\" Value\")");
        this.Field16890 = this.Method23(this.Field16886.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD35));
        this.Field16891 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delays", this)));
        this.Field16892 = this.Method23(this.Field16891.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Jump Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)663572583L ^ 0x278D5067) != 0)));
        this.Field16893 = this.Method23(this.Field16891.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Step Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1087918940L ^ 0xBF27ACA4) != 0)));
        this.Field16894 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
        this.Field16842.Method303(new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$1(this));
        this.Field16845.Method303(new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$2(this));
        this.Field16835.Method303(new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$3(this));
        this.Field16838.Method303(new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$4(this));
        this.Field16854.Method303(new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$5(this));
        this.Field16861.Method303(new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$6(this));
        Field16897 = this;
        this.Field16895 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$Ljc0gDTN8WkwPRHY480HpEkScGALG41A(this), new Predicate[(int)1184592299L ^ 0x469B71AB]);
        this.Field16896 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(this), new Predicate[(int)2062921356L ^ 0x7AF5AE8C]);
    }

    static {
        Field16898 = new GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(null);
    }

    public static final Minecraft Method7117() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method7118(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7119(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        return gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16846;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7120(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        return gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16836;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7121(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        return gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16839;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7122(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        return gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16862;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7123(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        return gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16864;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7124(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        return gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x.Field16866;
    }

    public static final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Method7125() {
        return Field16897;
    }

    public static final void Method7126(GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        Field16897 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    @Nullable
    @Nullable
    public static final GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x Method7127() {
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = Field16898;
        return Field16897;
    }

    public static final void Method7128(@Nullable @Nullable GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x) {
        GGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = Field16898;
        Field16897 = gGT5VQugllrnZpYp94FoWI9hf7z0Ea3x;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-655891335 ^ (long)-655891335);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1883016039 ^ (long)1883016088);
            int n2 = ((int)-1096860221L ^ 0xBE9F3DCC) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1025440571L ^ 0xC2E100CA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

