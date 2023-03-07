//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.ClosedRange
 *  kotlin.ranges.IntRange
 *  kotlin.ranges.RangesKt
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import com.kisman.cc.util.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import lavahack.client.GnakMUPs8Y6dOYDRxYeXWX0dk0PiYXm7;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.c329TsrwyQaghkrpEAKnYsAuVtEEsCMs;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH;
import lavahack.client.k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u00107\u001a\u000208H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J \u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0016JJ\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0016JH\u0010:\u001a\u00020;2\u0006\u0010B\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J(\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0017\u001a\u00020EH\u0016J*\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020GH\u0016J \u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0016JH\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010C\u001a\u00020DH\u0016JJ\u0010H\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0002J*\u0010H\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0002J\u0006\u0010\u0010\u001a\u00020?J\u0006\u0010\u0012\u001a\u00020?J\u0006\u0010\u001a\u001a\u00020?J\u0006\u0010\u001c\u001a\u00020?J\u0006\u00102\u001a\u00020?J\u0006\u00104\u001a\u00020?J\b\u0010I\u001a\u00020\u0000H\u0016J\b\u0010J\u001a\u000208H\u0016J\u0010\u0010K\u001a\u00020=2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010L\u001a\u00020\u0000H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u001d\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0011\u0010!\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0011\u0010)\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\fR\u0011\u0010+\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0011\u0010-\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0011\u0010/\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0011\u00101\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0011\u00103\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u0011\u00105\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\f\u00a8\u0006M"}, d2={"Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "abyss", "Lcom/kisman/cc/settings/Setting;", "getAbyss", "()Lcom/kisman/cc/settings/Setting;", "colorGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "getColorGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "depth", "getDepth", "filledColor1", "getFilledColor1", "filledColor2", "getFilledColor2", "filledColorGroup", "getFilledColorGroup", "lineWidth", "getLineWidth", "mode", "getMode", "outlineColor1", "getOutlineColor1", "outlineColor2", "getOutlineColor2", "outlineColorGroup", "getOutlineColorGroup", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGroup", "getRainbowGroup", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "scaleGroup", "getScaleGroup", "scaleOffset", "getScaleOffset", "scaleState", "getScaleState", "shader", "getShader", "wireColor1", "getWireColor1", "wireColor2", "getWireColor2", "wireColorGroup", "getWireColorGroup", "canRender", "", "callingFromDraw", "draw", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "color1", "Lcom/kisman/cc/util/Colour;", "color2", "Lcom/kisman/cc/util/render/Rendering$Mode;", "bb", "alphaCoeff", "", "Lcom/kisman/cc/util/enums/RenderingRewriteModes;", "pos", "Lnet/minecraft/util/math/BlockPos;", "draw0", "init", "isActive", "modifyBB", "preInit", "kisman.cc"})
public class MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK
extends GnakMUPs8Y6dOYDRxYeXWX0dk0PiYXm7 {
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15519;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15520;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15521;
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15522;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15523;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15524;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15525;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15526;
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15527;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15528;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15529;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15530;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15531;
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15532;
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15533;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15534;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15535;
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15536;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15537;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15538;
    @NotNull
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15539;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15540;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15541;
    private String Field15542 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3765() {
        return this.Field15519;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3766() {
        return this.Field15520;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3767() {
        return this.Field15521;
    }

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method3768() {
        return this.Field15522;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3769() {
        return this.Field15523;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3770() {
        return this.Field15524;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3771() {
        return this.Field15525;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3772() {
        return this.Field15526;
    }

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method3773() {
        return this.Field15527;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3774() {
        return this.Field15528;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3775() {
        return this.Field15529;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3776() {
        return this.Field15530;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3777() {
        return this.Field15531;
    }

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method3778() {
        return this.Field15532;
    }

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method3779() {
        return this.Field15533;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3780() {
        return this.Field15534;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3781() {
        return this.Field15535;
    }

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method3782() {
        return this.Field15536;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3783() {
        return this.Field15537;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3784() {
        return this.Field15538;
    }

    @NotNull
    @NotNull
    public final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Method3785() {
        return this.Field15539;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3786() {
        return this.Field15540;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3787() {
        return this.Field15541;
    }

    @NotNull
    @NotNull
    public MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method3788() {
        if (this.Method769() == null) return this;
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 == null) {
            Intrinsics.throwNpe();
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7405(this.Field15519);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3 == null) {
            Intrinsics.throwNpe();
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl3.Method7405(this.Field15520);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4 == null) {
            Intrinsics.throwNpe();
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl4.Method7405(this.Field15521);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5 == null) {
            Intrinsics.throwNpe();
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl5.Method7406(this.Field15522);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6 == null) {
            Intrinsics.throwNpe();
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl6.Method7405(this.Field15525);
        if (this.Method780() instanceof c329TsrwyQaghkrpEAKnYsAuVtEEsCMs) {
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7 = this.Method769();
            if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7 == null) {
                Intrinsics.throwNpe();
            }
            xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl7.Method7405(this.Field15526);
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8 == null) {
            Intrinsics.throwNpe();
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl8.Method7406(this.Field15527);
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl9 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl9 == null) {
            Intrinsics.throwNpe();
        }
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl9.Method7406(this.Field15532);
        return this;
    }

    @Override
    public Object Method778() {
        return this.Method3788();
    }

    @NotNull
    @NotNull
    public MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method3789() {
        this.Method780().Method23(this.Field15519);
        this.Method780().Method23(this.Field15520);
        this.Method780().Method23(this.Field15521);
        this.Method780().Method24(this.Field15522);
        this.Method780().Method23(this.Field15523);
        this.Method780().Method23(this.Field15524);
        this.Method780().Method23(this.Field15525);
        if (this.Method780() instanceof c329TsrwyQaghkrpEAKnYsAuVtEEsCMs) {
            this.Method780().Method23(this.Field15526);
        }
        this.Method780().Method24(this.Field15527);
        this.Method780().Method23(this.Field15528);
        this.Method780().Method23(this.Field15529);
        this.Method780().Method23(this.Field15530);
        this.Method780().Method23(this.Field15531);
        this.Method780().Method24(this.Field15532);
        this.Method780().Method24(this.Field15533);
        this.Method780().Method23(this.Field15534);
        this.Method780().Method23(this.Field15535);
        this.Method780().Method24(this.Field15536);
        this.Method780().Method23(this.Field15537);
        this.Method780().Method23(this.Field15538);
        this.Method780().Method24(this.Field15539);
        this.Method780().Method23(this.Field15540);
        this.Method780().Method23(this.Field15541);
        if (!(this.Method780() instanceof c329TsrwyQaghkrpEAKnYsAuVtEEsCMs)) return this;
        this.Method780().Field8070.add(this);
        HashMap hashMap = j2ejTRqCYqWkD6r8LQZuO6mOB2OwagRH.Field17763;
        Intrinsics.checkExpressionValueIsNotNull((Object)hashMap, (String)"ShaderCharms.modules");
        Map map = hashMap;
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J = this.Method780();
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this);
        int n = (int)((long)68609460 ^ (long)68609460);
        map.put(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        return this;
    }

    @Override
    public Object Method779() {
        return this.Method3789();
    }

    public boolean Method3790() {
        int n;
        if (this.Field15519.Method341() != k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8.Field11308) {
            n = (int)((long)1990355337 ^ (long)1990355336);
            return n != 0;
        }
        n = (int)((long)-1184750361 ^ (long)-1184750361);
        return n != 0;
    }

    public boolean Method3791() {
        int n;
        if (!this.Field15526.Method365()) {
            n = (int)((long)-660519796 ^ (long)-660519795);
            return n != 0;
        }
        n = (int)1697218268L ^ 0x65297EDC;
        return n != 0;
    }

    public boolean Method3792(boolean bl) {
        boolean bl2;
        if (bl && !this.Method3791() || !bl && this.Method3791()) {
            bl2 = (int)-973104345L ^ 0xC5FF9B26;
            return bl2;
        }
        bl2 = (int)-589760431L ^ 0xDCD8F851;
        return bl2;
    }

    public void Method3793(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @Nullable @Nullable exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"color2");
        this.Method3794(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }

    public void Method3794(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, @Nullable @Nullable exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"wireColor2");
        if (!this.Method3790()) return;
        if (exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi == null) {
            return;
        }
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        if (this.Field15520.Method365()) {
            axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB2.minX, axisAlignedBB2.minY + 1.0, axisAlignedBB2.minZ, axisAlignedBB2.maxX, axisAlignedBB2.maxY + Double.longBitsToDouble(0x7DC5FFCCC1E25B7BL ^ 0x4276CCFFF2D16848L), axisAlignedBB2.maxZ);
        }
        AxisAlignedBB axisAlignedBB3 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(axisAlignedBB2);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB3, (String)"Rendering.correct(a)");
        this.Method3796(axisAlignedBB3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }

    private final AxisAlignedBB Method3795(AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB axisAlignedBB2;
        if (this.Field15523.Method365()) {
            AxisAlignedBB axisAlignedBB3 = axisAlignedBB.grow(this.Field15524.Method367());
            axisAlignedBB2 = axisAlignedBB3;
            Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB3, (String)"aabb.grow(scaleOffset.valDouble)");
            return axisAlignedBB2;
        }
        axisAlignedBB2 = axisAlignedBB;
        return axisAlignedBB2;
    }

    private final void Method3796(AxisAlignedBB axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3436(this.Field15525.Method365());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3445(this.Method3795(axisAlignedBB), this.Field15521.Method368(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.Field15525.Method365());
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3439(this.Field15525.Method365());
    }

    private final void Method3797(AxisAlignedBB axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3443(this.Method3795(axisAlignedBB), this.Field15521.Method368(), vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, this.Field15525.Method365());
    }

    public void Method3798(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8 k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz82) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"color2");
        Intrinsics.checkParameterIsNotNull((Object)((Object)k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz82), (String)"mode");
        this.Method3793(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz82.Method3273());
    }

    public void Method3799(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"color2");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3793(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, ((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273());
    }

    public void Method3800(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, double d) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"wireColor2");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3633((int)(d * Double.longBitsToDouble((long)1795010681 ^ 0x406FE0006AFDB079L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8, (String)"filledColor1.withAlpha((\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3633((int)(d * Double.longBitsToDouble((long)1535237992 ^ 0x406FE0005B81DF68L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9, (String)"filledColor2.withAlpha((\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3633((int)(d * Double.longBitsToDouble(0x1105E1F48B908419L ^ 0x516A01F48B908419L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10, (String)"outlineColor1.withAlpha(\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3633((int)(d * Double.longBitsToDouble(0x364755D2FCFFE3CDL ^ 0x7628B5D2FCFFE3CDL)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11, (String)"outlineColor2.withAlpha(\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6.Method3633((int)(d * Double.longBitsToDouble((long)356579489 ^ 0x406FE0001540F8A1L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12, (String)"wireColor1.withAlpha((alphaCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7.Method3633((int)(d * Double.longBitsToDouble(0xF37546B3ABA05DB4L ^ 0xB31AA6B3ABA05DB4L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13, (String)"wireColor2.withAlpha((alphaCoeff * 255.0).toInt())");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13, ((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273());
    }

    public void Method3801(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, double d) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"bb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"wireColor2");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3633((int)(d * Double.longBitsToDouble(0x40DDA3240FADFA76L ^ 0xB243240FADFA76L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8, (String)"filledColor1.withAlpha((\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3633((int)(d * Double.longBitsToDouble(0x87AF14F4239B11D0L ^ 0xC7C0F4F4239B11D0L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9, (String)"filledColor2.withAlpha((\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3633((int)(d * Double.longBitsToDouble((long)587514958 ^ 0x406FE0002304C44EL)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10, (String)"outlineColor1.withAlpha(\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3633((int)(d * Double.longBitsToDouble(0xF50D3065C052251DL ^ 0xB562D065C052251DL)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11, (String)"outlineColor2.withAlpha(\u2026haCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6.Method3633((int)(d * Double.longBitsToDouble(0xB465B0DA102DCF5FL ^ 0xF40A50DA102DCF5FL)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12, (String)"wireColor1.withAlpha((alphaCoeff * 255.0).toInt())");
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7.Method3633((int)(d * Double.longBitsToDouble(0x3BDAF35277CC0817L ^ 0x7BB5135277CC0817L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13, (String)"wireColor2.withAlpha((alphaCoeff * 255.0).toInt())");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV10, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV11, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV12, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV13, ((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273());
    }

    public void Method3802(@NotNull @NotNull BlockPos blockPos, double d) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        int n = (int)((long)-495215294 ^ (long)-495215294);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Method3806().Method3633(RangesKt.coerceIn((int)((int)(d * (double)((int)-101264247L ^ 0xF9F6D476))), (ClosedRange)((ClosedRange)new IntRange(n, (int)((long)907502286 ^ (long)907502129)))));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"getFilledColor1().withAl\u2026toInt().coerceIn(0..255))");
        n = (int)((long)-1476800377 ^ (long)-1476800377);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Method3807().Method3633(RangesKt.coerceIn((int)((int)(d * (double)((int)1455088928L ^ 0x56BAE5DF))), (ClosedRange)((ClosedRange)new IntRange(n, (int)1047408084L ^ 0x3E6E2D2B))));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"getFilledColor2().withAl\u2026toInt().coerceIn(0..255))");
        n = (int)-2122123722L ^ 0x8182F636;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Method3808().Method3633(RangesKt.coerceIn((int)((int)(d * (double)((int)-1028481259L ^ 0xC2B29FEA))), (ClosedRange)((ClosedRange)new IntRange(n, (int)((long)-1126345460 ^ (long)-1126345229)))));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"getOutlineColor1().withA\u2026toInt().coerceIn(0..255))");
        n = (int)((long)-787616682 ^ (long)-787616682);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = this.Method3809().Method3633(RangesKt.coerceIn((int)((int)(d * (double)((int)((long)127455152 ^ (long)127455055)))), (ClosedRange)((ClosedRange)new IntRange(n, (int)((long)-1248877818 ^ (long)-1248877575)))));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"getOutlineColor2().withA\u2026toInt().coerceIn(0..255))");
        n = (int)((long)-1288929409 ^ (long)-1288929409);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = this.Method3810().Method3633(RangesKt.coerceIn((int)((int)(d * (double)((int)-386300066L ^ 0xE8F987A1))), (ClosedRange)((ClosedRange)new IntRange(n, (int)((long)-817978066 ^ (long)-817977903)))));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"getWireColor1().withAlph\u2026toInt().coerceIn(0..255))");
        n = (int)((long)1206405808 ^ (long)1206405808);
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7 = this.Method3811().Method3633(RangesKt.coerceIn((int)((int)(d * (double)((int)1513329689L ^ 0x5A3394E6))), (ClosedRange)((ClosedRange)new IntRange(n, (int)-757218948L ^ 0xD2DDC183))));
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"getWireColor2().withAlph\u2026toInt().coerceIn(0..255))");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, ((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273());
    }

    public void Method3803(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"color2");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        this.Method3799(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3);
    }

    public void Method3804(@NotNull @NotNull AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, this.Method3806(), this.Method3807(), this.Method3808(), this.Method3809(), this.Method3810(), this.Method3811(), ((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273());
    }

    public void Method3805(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        this.Method3804(axisAlignedBB);
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3806() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        if (this.Field15528.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)-829960980L ^ 0xCE87CCEC, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15534.Method339().Field17324, this.Field15529.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field15534.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"filledColor1.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3807() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        if (this.Field15528.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579(((int)1001269558L ^ 0x3BAE292F) << 1, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15535.Method339().Field17324, this.Field15529.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field15535.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"filledColor2.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3808() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        if (this.Field15528.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)((long)-1914694291 ^ (long)-1914694291), this.Field15530.Method335(), this.Field15531.Method335(), this.Field15537.Method339().Field17324, this.Field15529.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field15537.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3809() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        if (this.Field15528.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579(((int)-60560192L ^ 0xFC63ECD9) << 1, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15538.Method339().Field17324, this.Field15529.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field15538.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor2.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3810() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        if (this.Field15528.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579((int)773283399L ^ 0x2E175E47, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15540.Method339().Field17324, this.Field15529.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field15540.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"wireColor1.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3811() {
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        if (this.Field15528.Method365()) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.Method3579(((int)-934656060L ^ 0xC84A47DD) << 1, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15541.Method339().Field17324, this.Field15529.Method367());
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
        }
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field15541.Method339();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"wireColor2.colour");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    public MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        super(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Mode", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8.Field11308).Method355("Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Render Mode\", m\u2026es.None).setTitle(\"Mode\")");
        this.Field15519 = this.Method775(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2);
        this.Field15520 = this.Method775(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Abyss", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, ((int)-1795302645L ^ 0x94FDDB0B) != 0));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Line Width", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble((long)1584668128 ^ 0x3FB99999C7ED847AL), Double.longBitsToDouble(0xB6EF9DFC506554FBL ^ 0xF6FB9DFC506554FBL), (boolean)((long)-1100451231 ^ (long)-1100451231)).Method313(new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this)).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Render Line Wid\u2026dient }.setTitle(\"Width\")");
        this.Field15521 = this.Method775(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3);
        this.Field15522 = this.Method776(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale State", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (boolean)((long)991274485 ^ (long)991274485)).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Scale State\", m\u2026 false).setTitle(\"State\")");
        this.Field15523 = this.Method775(this.Field15522.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        this.Field15524 = this.Method775(this.Field15522.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale Offset", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble((long)1541666300 ^ 0x3F60624D89125C00L), Double.longBitsToDouble(0x7BDC07A8079A9B49L ^ 0x44BC65E5D56B32B5L), Double.longBitsToDouble(0x1EDD11D1EAAA72C3L ^ 0x211488487333EB59L), ((int)1498884526L ^ 0x595729AE) != 0)));
        this.Field15525 = this.Method775(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Depth", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, ((int)-1965215875L ^ 0x8ADD2F7D) != 0));
        this.Field15526 = this.Method775(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Shader", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (boolean)((long)1654943022 ^ (long)1654943022)));
        this.Field15527 = this.Method776(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)));
        this.Field15528 = this.Method775(this.Field15527.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, ((int)-1315059431L ^ 0xB19DC919) != 0)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rainbow Speed", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 1.0, Double.longBitsToDouble(0xA5A4E71EC1377E77L ^ 0x9A74E71EC1377E77L), Double.longBitsToDouble((long)2131931133 ^ 0x401400007F12AFFDL), (boolean)((long)420950627 ^ (long)420950627)).Method312(this.Field15528).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Rainbow Speed\",\u2026ainbow).setTitle(\"Speed\")");
        this.Field15529 = this.Method775(this.Field15527.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Saturation", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble(0xEA8E84ED888633F3L ^ 0xAAD784ED888633F3L), 0.0, Double.longBitsToDouble((long)1919072516 ^ 0x405900007262B904L), (boolean)((long)-1763572545 ^ (long)-1763572546)).Method312(this.Field15528).Method355("Sat");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Saturation\", mo\u2026(rainbow).setTitle(\"Sat\")");
        this.Field15530 = this.Method775(this.Field15527.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Brightness", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble(0x55276385FD702454L ^ 0x157E6385FD702454L), 0.0, Double.longBitsToDouble((long)2081485198 ^ 0x405900007C10F18EL), ((int)-1983834367L ^ 0x89C11700) != 0).Method312(this.Field15528).Method355("Bright");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"Setting(\"Brightness\", mo\u2026inbow).setTitle(\"Bright\")");
        this.Field15531 = this.Method775(this.Field15527.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7));
        this.Field15532 = this.Method776(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Colors", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)));
        this.Field15533 = this.Method776(this.Field15532.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Filled", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        this.Field15534 = this.Method775(this.Field15533.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "First", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)467133487L ^ 0x1BD7E4D0, (int)((long)1632050363 ^ (long)1632050363), (int)800723500L ^ 0x2FBA122C, (int)952711367L ^ 0x38C93838))));
        this.Field15535 = this.Method775(this.Field15533.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Second Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Second", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)2077918858L ^ 0x7BDA868A, (int)((long)-2131149045 ^ (long)-2131149052) << 3, (int)((long)1099310571 ^ (long)1099310356), (int)-1058383382L ^ 0xC0EA5915))));
        this.Field15536 = this.Method776(this.Field15532.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        this.Field15537 = this.Method775(this.Field15536.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Outline Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "First", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)728261186 ^ (long)728261309), (int)1838333006L ^ 0x6D92BC4E, (int)155685267L ^ 0x9479193, (int)((long)-1237123520 ^ (long)-1237123393)))));
        this.Field15538 = this.Method775(this.Field15536.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Outline Second Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Second", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)988069950L ^ 0x3AE4C03E, (int)((long)1786366839 ^ (long)1786366840) << 3, (int)((long)139351644 ^ (long)139351715), (int)((long)992834629 ^ (long)992834746)))));
        this.Field15539 = this.Method776(this.Field15532.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Wire", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        this.Field15540 = this.Method775(this.Field15539.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Wire Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "First", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)-1530892747L ^ 0xA4C06ECA, (int)-151196544L ^ 0xF6FCEC80, (int)((long)15819138 ^ (long)15819138), (int)-722513572L ^ 0xD4EF51A3))));
        this.Field15541 = this.Method775(this.Field15539.Method7405(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Render Wire Second Color", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, "Second", new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)1533303119L ^ 0x5B64594F, (int)((long)-818935148 ^ (long)-818935141) << 3, (int)209257901L ^ 0xC790552, (int)442689201L ^ 0x1A62E64E))));
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1353495307 ^ (long)-1353495307);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)589423610L ^ 0x2321E305);
            int n2 = (int)-612170277L ^ 0xDB8305B4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1781501998 ^ (long)-1781517435) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

