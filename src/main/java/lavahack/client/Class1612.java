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

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class845;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import lavahack.client.Class1307;
import lavahack.client.Class1697;
import lavahack.client.Class1996;
import lavahack.client.Class2008;
import lavahack.client.Class2134;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class462;
import lavahack.client.Class786;
import lavahack.client.Class815;
import lavahack.client.Class91;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u00107\u001a\u000208H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J \u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0016JJ\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0016JH\u0010:\u001a\u00020;2\u0006\u0010B\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J(\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0017\u001a\u00020EH\u0016J*\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020GH\u0016J \u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0016JH\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010C\u001a\u00020DH\u0016JJ\u0010H\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0002J*\u0010H\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0002J\u0006\u0010\u0010\u001a\u00020?J\u0006\u0010\u0012\u001a\u00020?J\u0006\u0010\u001a\u001a\u00020?J\u0006\u0010\u001c\u001a\u00020?J\u0006\u00102\u001a\u00020?J\u0006\u00104\u001a\u00020?J\b\u0010I\u001a\u00020\u0000H\u0016J\b\u0010J\u001a\u000208H\u0016J\u0010\u0010K\u001a\u00020=2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010L\u001a\u00020\u0000H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u001d\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0011\u0010!\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0011\u0010)\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\fR\u0011\u0010+\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0011\u0010-\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0011\u0010/\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0011\u00101\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0011\u00103\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u0011\u00105\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\f\u00a8\u0006M"}, d2={"Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "abyss", "Lcom/kisman/cc/settings/Setting;", "getAbyss", "()Lcom/kisman/cc/settings/Setting;", "colorGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "getColorGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "depth", "getDepth", "filledColor1", "getFilledColor1", "filledColor2", "getFilledColor2", "filledColorGroup", "getFilledColorGroup", "lineWidth", "getLineWidth", "mode", "getMode", "outlineColor1", "getOutlineColor1", "outlineColor2", "getOutlineColor2", "outlineColorGroup", "getOutlineColorGroup", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGroup", "getRainbowGroup", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "scaleGroup", "getScaleGroup", "scaleOffset", "getScaleOffset", "scaleState", "getScaleState", "shader", "getShader", "wireColor1", "getWireColor1", "wireColor2", "getWireColor2", "wireColorGroup", "getWireColorGroup", "canRender", "", "callingFromDraw", "draw", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "color1", "Lcom/kisman/cc/util/Colour;", "color2", "Lcom/kisman/cc/util/render/Rendering$Mode;", "bb", "alphaCoeff", "", "Lcom/kisman/cc/util/enums/RenderingRewriteModes;", "pos", "Lnet/minecraft/util/math/BlockPos;", "draw0", "init", "isActive", "modifyBB", "preInit", "kisman.cc"})
public class Class1612
extends Class91 {
    @NotNull
    private final Class44 Field15519;
    @NotNull
    private final Class44 Field15520;
    @NotNull
    private final Class44 Field15521;
    @NotNull
    private final Class1996 Field15522;
    @NotNull
    private final Class44 Field15523;
    @NotNull
    private final Class44 Field15524;
    @NotNull
    private final Class44 Field15525;
    @NotNull
    private final Class44 Field15526;
    @NotNull
    private final Class1996 Field15527;
    @NotNull
    private final Class44 Field15528;
    @NotNull
    private final Class44 Field15529;
    @NotNull
    private final Class44 Field15530;
    @NotNull
    private final Class44 Field15531;
    @NotNull
    private final Class1996 Field15532;
    @NotNull
    private final Class1996 Field15533;
    @NotNull
    private final Class44 Field15534;
    @NotNull
    private final Class44 Field15535;
    @NotNull
    private final Class1996 Field15536;
    @NotNull
    private final Class44 Field15537;
    @NotNull
    private final Class44 Field15538;
    @NotNull
    private final Class1996 Field15539;
    @NotNull
    private final Class44 Field15540;
    @NotNull
    private final Class44 Field15541;
    private String Field15542 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class44 Method3765() {
        return this.Field15519;
    }

    @NotNull
    @NotNull
    public final Class44 Method3766() {
        return this.Field15520;
    }

    @NotNull
    @NotNull
    public final Class44 Method3767() {
        return this.Field15521;
    }

    @NotNull
    @NotNull
    public final Class1996 Method3768() {
        return this.Field15522;
    }

    @NotNull
    @NotNull
    public final Class44 Method3769() {
        return this.Field15523;
    }

    @NotNull
    @NotNull
    public final Class44 Method3770() {
        return this.Field15524;
    }

    @NotNull
    @NotNull
    public final Class44 Method3771() {
        return this.Field15525;
    }

    @NotNull
    @NotNull
    public final Class44 Method3772() {
        return this.Field15526;
    }

    @NotNull
    @NotNull
    public final Class1996 Method3773() {
        return this.Field15527;
    }

    @NotNull
    @NotNull
    public final Class44 Method3774() {
        return this.Field15528;
    }

    @NotNull
    @NotNull
    public final Class44 Method3775() {
        return this.Field15529;
    }

    @NotNull
    @NotNull
    public final Class44 Method3776() {
        return this.Field15530;
    }

    @NotNull
    @NotNull
    public final Class44 Method3777() {
        return this.Field15531;
    }

    @NotNull
    @NotNull
    public final Class1996 Method3778() {
        return this.Field15532;
    }

    @NotNull
    @NotNull
    public final Class1996 Method3779() {
        return this.Field15533;
    }

    @NotNull
    @NotNull
    public final Class44 Method3780() {
        return this.Field15534;
    }

    @NotNull
    @NotNull
    public final Class44 Method3781() {
        return this.Field15535;
    }

    @NotNull
    @NotNull
    public final Class1996 Method3782() {
        return this.Field15536;
    }

    @NotNull
    @NotNull
    public final Class44 Method3783() {
        return this.Field15537;
    }

    @NotNull
    @NotNull
    public final Class44 Method3784() {
        return this.Field15538;
    }

    @NotNull
    @NotNull
    public final Class1996 Method3785() {
        return this.Field15539;
    }

    @NotNull
    @NotNull
    public final Class44 Method3786() {
        return this.Field15540;
    }

    @NotNull
    @NotNull
    public final Class44 Method3787() {
        return this.Field15541;
    }

    @NotNull
    @NotNull
    public Class1612 Method3788() {
        if (this.Method769() == null) return this;
        Class1996 class1996 = this.Method769();
        if (class1996 == null) {
            Intrinsics.throwNpe();
        }
        class1996.Method7405(this.Field15519);
        Class1996 class19962 = this.Method769();
        if (class19962 == null) {
            Intrinsics.throwNpe();
        }
        class19962.Method7405(this.Field15520);
        Class1996 class19963 = this.Method769();
        if (class19963 == null) {
            Intrinsics.throwNpe();
        }
        class19963.Method7405(this.Field15521);
        Class1996 class19964 = this.Method769();
        if (class19964 == null) {
            Intrinsics.throwNpe();
        }
        class19964.Method7406(this.Field15522);
        Class1996 class19965 = this.Method769();
        if (class19965 == null) {
            Intrinsics.throwNpe();
        }
        class19965.Method7405(this.Field15525);
        if (this.Method780() instanceof Class1697) {
            Class1996 class19966 = this.Method769();
            if (class19966 == null) {
                Intrinsics.throwNpe();
            }
            class19966.Method7405(this.Field15526);
        }
        Class1996 class19967 = this.Method769();
        if (class19967 == null) {
            Intrinsics.throwNpe();
        }
        class19967.Method7406(this.Field15527);
        Class1996 class19968 = this.Method769();
        if (class19968 == null) {
            Intrinsics.throwNpe();
        }
        class19968.Method7406(this.Field15532);
        return this;
    }

    @Override
    public Object Method778() {
        return this.Method3788();
    }

    @NotNull
    @NotNull
    public Class1612 Method3789() {
        this.Method780().Method23(this.Field15519);
        this.Method780().Method23(this.Field15520);
        this.Method780().Method23(this.Field15521);
        this.Method780().Method24(this.Field15522);
        this.Method780().Method23(this.Field15523);
        this.Method780().Method23(this.Field15524);
        this.Method780().Method23(this.Field15525);
        if (this.Method780() instanceof Class1697) {
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
        if (!(this.Method780() instanceof Class1697)) return this;
        this.Method780().Field8070.add(this);
        HashMap hashMap = Class2134.Field17763;
        Intrinsics.checkExpressionValueIsNotNull((Object)hashMap, (String)"ShaderCharms.modules");
        Map map = hashMap;
        Class42 class42 = this.Method780();
        Class1307 class1307 = new Class1307(this);
        boolean bl = false;
        map.put(class42, class1307);
        return this;
    }

    @Override
    public Object Method779() {
        return this.Method3789();
    }

    public boolean Method3790() {
        if (this.Field15519.Method341() == Class786.Field11308) return false;
        return true;
    }

    public boolean Method3791() {
        if (this.Field15526.Method365()) return false;
        return true;
    }

    public boolean Method3792(boolean bl) {
        if (bl) {
            if (!this.Method3791()) return true;
        }
        if (bl) return false;
        if (!this.Method3791()) return false;
        return true;
    }

    public void Method3793(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @Nullable @Nullable Class2008 class2008) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"color2");
        this.Method3794(axisAlignedBB, class2027, class20272, class2027, class20272, class2027, class20272, class2008);
    }

    public void Method3794(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276, @Nullable @Nullable Class2008 class2008) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"wireColor2");
        if (!this.Method3790()) return;
        if (class2008 == null) {
            return;
        }
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        if (this.Field15520.Method365()) {
            axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB2.minX, axisAlignedBB2.minY + 1.0, axisAlignedBB2.minZ, axisAlignedBB2.maxX, axisAlignedBB2.maxY + Double.longBitsToDouble(0x3FB3333333333333L), axisAlignedBB2.maxZ);
        }
        AxisAlignedBB axisAlignedBB3 = Class815.Method3447(axisAlignedBB2);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB3, (String)"Rendering.correct(a)");
        this.Method3796(axisAlignedBB3, class2027, class20272, class20273, class20274, class20275, class20276, class2008);
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

    private final void Method3796(AxisAlignedBB axisAlignedBB, Class2027 class2027, Class2027 class20272, Class2027 class20273, Class2027 class20274, Class2027 class20275, Class2027 class20276, Class2008 class2008) {
        Class815.Method3436(this.Field15525.Method365());
        Class815.Method3445(this.Method3795(axisAlignedBB), this.Field15521.Method368(), class2027, class20272, class20273, class20274, class20275, class20276, class2008, this.Field15525.Method365());
        Class815.Method3439(this.Field15525.Method365());
    }

    private final void Method3797(AxisAlignedBB axisAlignedBB, Class2027 class2027, Class2027 class20272, Class2008 class2008) {
        Class815.Method3443(this.Method3795(axisAlignedBB), this.Field15521.Method368(), class2027, class20272, class2008, this.Field15525.Method365());
    }

    public void Method3798(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class786 class786) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"color2");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class786), (String)"mode");
        this.Method3793(axisAlignedBB, class2027, class20272, class786.Method3273());
    }

    public void Method3799(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"color2");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3793(axisAlignedBB, class2027, class20272, ((Class786)enum_).Method3273());
    }

    public void Method3800(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276, double d) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"wireColor2");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        Class2027 class20277 = class2027.Method3633((int)(d * Double.longBitsToDouble((long)1795010681 ^ 0x406FE0006AFDB079L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20277, (String)"filledColor1.withAlpha((\u2026haCoeff * 255.0).toInt())");
        Class2027 class20278 = class20272.Method3633((int)(d * Double.longBitsToDouble((long)1535237992 ^ 0x406FE0005B81DF68L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20278, (String)"filledColor2.withAlpha((\u2026haCoeff * 255.0).toInt())");
        Class2027 class20279 = class20273.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20279, (String)"outlineColor1.withAlpha(\u2026haCoeff * 255.0).toInt())");
        Class2027 class202710 = class20274.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class202710, (String)"outlineColor2.withAlpha(\u2026haCoeff * 255.0).toInt())");
        Class2027 class202711 = class20275.Method3633((int)(d * Double.longBitsToDouble((long)356579489 ^ 0x406FE0001540F8A1L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class202711, (String)"wireColor1.withAlpha((alphaCoeff * 255.0).toInt())");
        Class2027 class202712 = class20276.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class202712, (String)"wireColor2.withAlpha((alphaCoeff * 255.0).toInt())");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, class20277, class20278, class20279, class202710, class202711, class202712, ((Class786)enum_).Method3273());
    }

    public void Method3801(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276, double d) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"bb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"wireColor2");
        Class2027 class20277 = class2027.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20277, (String)"filledColor1.withAlpha((\u2026haCoeff * 255.0).toInt())");
        Class2027 class20278 = class20272.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20278, (String)"filledColor2.withAlpha((\u2026haCoeff * 255.0).toInt())");
        Class2027 class20279 = class20273.Method3633((int)(d * Double.longBitsToDouble((long)587514958 ^ 0x406FE0002304C44EL)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20279, (String)"outlineColor1.withAlpha(\u2026haCoeff * 255.0).toInt())");
        Class2027 class202710 = class20274.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class202710, (String)"outlineColor2.withAlpha(\u2026haCoeff * 255.0).toInt())");
        Class2027 class202711 = class20275.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class202711, (String)"wireColor1.withAlpha((alphaCoeff * 255.0).toInt())");
        Class2027 class202712 = class20276.Method3633((int)(d * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)class202712, (String)"wireColor2.withAlpha((alphaCoeff * 255.0).toInt())");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, class20277, class20278, class20279, class202710, class202711, class202712, ((Class786)enum_).Method3273());
    }

    public void Method3802(@NotNull @NotNull BlockPos blockPos, double d) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        int n = 0;
        Class2027 class2027 = this.Method3806().Method3633(RangesKt.coerceIn((int)((int)(d * (double)255)), (ClosedRange)((ClosedRange)new IntRange(n, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"getFilledColor1().withAl\u2026toInt().coerceIn(0..255))");
        n = 0;
        Class2027 class20272 = this.Method3807().Method3633(RangesKt.coerceIn((int)((int)(d * (double)255)), (ClosedRange)((ClosedRange)new IntRange(n, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"getFilledColor2().withAl\u2026toInt().coerceIn(0..255))");
        n = 0;
        Class2027 class20273 = this.Method3808().Method3633(RangesKt.coerceIn((int)((int)(d * (double)255)), (ClosedRange)((ClosedRange)new IntRange(n, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"getOutlineColor1().withA\u2026toInt().coerceIn(0..255))");
        n = 0;
        Class2027 class20274 = this.Method3809().Method3633(RangesKt.coerceIn((int)((int)(d * (double)255)), (ClosedRange)((ClosedRange)new IntRange(n, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20274, (String)"getOutlineColor2().withA\u2026toInt().coerceIn(0..255))");
        n = 0;
        Class2027 class20275 = this.Method3810().Method3633(RangesKt.coerceIn((int)((int)(d * (double)255)), (ClosedRange)((ClosedRange)new IntRange(n, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20275, (String)"getWireColor1().withAlph\u2026toInt().coerceIn(0..255))");
        n = 0;
        Class2027 class20276 = this.Method3811().Method3633(RangesKt.coerceIn((int)((int)(d * (double)255)), (ClosedRange)((ClosedRange)new IntRange(n, 255))));
        Intrinsics.checkExpressionValueIsNotNull((Object)class20276, (String)"getWireColor2().withAlph\u2026toInt().coerceIn(0..255))");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, class2027, class20272, class20273, class20274, class20275, class20276, ((Class786)enum_).Method3273());
    }

    public void Method3803(@NotNull @NotNull BlockPos blockPos, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"color2");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        this.Method3799(axisAlignedBB, class2027, class20272);
    }

    public void Method3804(@NotNull @NotNull AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Enum enum_ = this.Field15519.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, this.Method3806(), this.Method3807(), this.Method3808(), this.Method3809(), this.Method3810(), this.Method3811(), ((Class786)enum_).Method3273());
    }

    public void Method3805(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        AxisAlignedBB axisAlignedBB = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Minecraft.getMinecraft()\u2026        pos\n            )");
        this.Method3804(axisAlignedBB);
    }

    @NotNull
    @NotNull
    public final Class2027 Method3806() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Class2027 class20272 = Class845.Method3579(0, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15534.Method339().Field17324, this.Field15529.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field15534.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"filledColor1.colour");
        return class2027;
    }

    @NotNull
    @NotNull
    public final Class2027 Method3807() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Class2027 class20272 = Class845.Method3579(50, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15535.Method339().Field17324, this.Field15529.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field15535.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"filledColor2.colour");
        return class2027;
    }

    @NotNull
    @NotNull
    public final Class2027 Method3808() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Class2027 class20272 = Class845.Method3579(0, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15537.Method339().Field17324, this.Field15529.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field15537.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"outlineColor1.colour");
        return class2027;
    }

    @NotNull
    @NotNull
    public final Class2027 Method3809() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Class2027 class20272 = Class845.Method3579(50, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15538.Method339().Field17324, this.Field15529.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field15538.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"outlineColor2.colour");
        return class2027;
    }

    @NotNull
    @NotNull
    public final Class2027 Method3810() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Class2027 class20272 = Class845.Method3579(0, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15540.Method339().Field17324, this.Field15529.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field15540.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"wireColor1.colour");
        return class2027;
    }

    @NotNull
    @NotNull
    public final Class2027 Method3811() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Class2027 class20272 = Class845.Method3579(50, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15541.Method339().Field17324, this.Field15529.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field15541.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"wireColor2.colour");
        return class2027;
    }

    public Class1612(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        super(class42);
        Class44 class44 = new Class44("Render Mode", class42, Class786.Field11308).Method355("Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Render Mode\", m\u2026es.None).setTitle(\"Mode\")");
        this.Field15519 = this.Method775(class44);
        this.Field15520 = this.Method775(new Class44("Abyss", class42, false));
        Class44 class442 = new Class44("Render Line Width", class42, 1.0, Double.longBitsToDouble((long)1584668128 ^ 0x3FB99999C7ED847AL), Double.longBitsToDouble(0x4014000000000000L), false).Method313(new Class462(this)).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Render Line Wid\u2026dient }.setTitle(\"Width\")");
        this.Field15521 = this.Method775(class442);
        this.Field15522 = this.Method776(new Class1996(new Class44("Scale", class42)));
        Class44 class443 = new Class44("Scale State", class42, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Scale State\", m\u2026 false).setTitle(\"State\")");
        this.Field15523 = this.Method775(this.Field15522.Method7405(class443));
        this.Field15524 = this.Method775(this.Field15522.Method7405(new Class44("Scale Offset", class42, Double.longBitsToDouble((long)1541666300 ^ 0x3F60624D89125C00L), Double.longBitsToDouble(4566758108544739836L), Double.longBitsToDouble(4596373779694328218L), false)));
        this.Field15525 = this.Method775(new Class44("Depth", class42, false));
        this.Field15526 = this.Method775(new Class44("Shader", class42, false));
        this.Field15527 = this.Method776(new Class1996(new Class44("Rainbow", class42)));
        this.Field15528 = this.Method775(this.Field15527.Method7405(new Class44("Rainbow", class42, false)));
        Class44 class444 = new Class44("Rainbow Speed", class42, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble((long)2131931133 ^ 0x401400007F12AFFDL), false).Method312(this.Field15528).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Rainbow Speed\",\u2026ainbow).setTitle(\"Speed\")");
        this.Field15529 = this.Method775(this.Field15527.Method7405(class444));
        Class44 class445 = new Class44("Saturation", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)1919072516 ^ 0x405900007262B904L), true).Method312(this.Field15528).Method355("Sat");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Saturation\", mo\u2026(rainbow).setTitle(\"Sat\")");
        this.Field15530 = this.Method775(this.Field15527.Method7405(class445));
        Class44 class446 = new Class44("Brightness", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)2081485198 ^ 0x405900007C10F18EL), true).Method312(this.Field15528).Method355("Bright");
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"Setting(\"Brightness\", mo\u2026inbow).setTitle(\"Bright\")");
        this.Field15531 = this.Method775(this.Field15527.Method7405(class446));
        this.Field15532 = this.Method776(new Class1996(new Class44("Colors", class42)));
        this.Field15533 = this.Method776(this.Field15532.Method7406(new Class1996(new Class44("Filled", class42))));
        this.Field15534 = this.Method775(this.Field15533.Method7405(new Class44("Render Color", class42, "First", new Class2027(255, 0, 0, 255))));
        this.Field15535 = this.Method775(this.Field15533.Method7405(new Class44("Render Second Color", class42, "Second", new Class2027(0, 120, 255, 255))));
        this.Field15536 = this.Method776(this.Field15532.Method7406(new Class1996(new Class44("Outline", class42))));
        this.Field15537 = this.Method775(this.Field15536.Method7405(new Class44("Render Outline Color", class42, "First", new Class2027(255, 0, 0, 255))));
        this.Field15538 = this.Method775(this.Field15536.Method7405(new Class44("Render Outline Second Color", class42, "Second", new Class2027(0, 120, 255, 255))));
        this.Field15539 = this.Method776(this.Field15532.Method7406(new Class1996(new Class44("Wire", class42))));
        this.Field15540 = this.Method775(this.Field15539.Method7405(new Class44("Render Wire Color", class42, "First", new Class2027(255, 0, 0, 255))));
        this.Field15541 = this.Method775(this.Field15539.Method7405(new Class44("Render Wire Second Color", class42, "Second", new Class2027(0, 120, 255, 255))));
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 111;
            cArray2[n] = (char)(cArray[n] ^ (0x5C57 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

