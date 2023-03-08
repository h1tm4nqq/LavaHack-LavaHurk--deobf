//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import net.minecraft.util.math.*;
import net.minecraft.client.*;
import net.minecraft.world.*;
import kotlin.ranges.*;
import com.kisman.cc.util.*;
import java.util.function.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u00107\u001a\u000208H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J \u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0016JJ\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0016JH\u0010:\u001a\u00020;2\u0006\u0010B\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J(\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0017\u001a\u00020EH\u0016J*\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020GH\u0016J \u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0016JH\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010:\u001a\u00020;2\u0006\u0010F\u001a\u00020G2\u0006\u0010C\u001a\u00020DH\u0016JJ\u0010H\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020?2\u0006\u0010\u0011\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020?2\u0006\u00101\u001a\u00020?2\u0006\u00103\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0002J*\u0010H\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?2\b\u0010\u0017\u001a\u0004\u0018\u00010AH\u0002J\u0006\u0010\u0010\u001a\u00020?J\u0006\u0010\u0012\u001a\u00020?J\u0006\u0010\u001a\u001a\u00020?J\u0006\u0010\u001c\u001a\u00020?J\u0006\u00102\u001a\u00020?J\u0006\u00104\u001a\u00020?J\b\u0010I\u001a\u00020\u0000H\u0016J\b\u0010J\u001a\u000208H\u0016J\u0010\u0010K\u001a\u00020=2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010L\u001a\u00020\u0000H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u001d\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0011\u0010!\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0011\u0010#\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0011\u0010'\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0011\u0010)\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b*\u0010\fR\u0011\u0010+\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0011\u0010-\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u0011\u0010/\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0011\u00101\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0011\u00103\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u0011\u00105\u001a\u00020\n?\u0006\b\n\u0000\u001a\u0004\b6\u0010\f?\u0006M" }, d2 = { "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "abyss", "Lcom/kisman/cc/settings/Setting;", "getAbyss", "()Lcom/kisman/cc/settings/Setting;", "colorGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "getColorGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "depth", "getDepth", "filledColor1", "getFilledColor1", "filledColor2", "getFilledColor2", "filledColorGroup", "getFilledColorGroup", "lineWidth", "getLineWidth", "mode", "getMode", "outlineColor1", "getOutlineColor1", "outlineColor2", "getOutlineColor2", "outlineColorGroup", "getOutlineColorGroup", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGroup", "getRainbowGroup", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "scaleGroup", "getScaleGroup", "scaleOffset", "getScaleOffset", "scaleState", "getScaleState", "shader", "getShader", "wireColor1", "getWireColor1", "wireColor2", "getWireColor2", "wireColorGroup", "getWireColorGroup", "canRender", "", "callingFromDraw", "draw", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "color1", "Lcom/kisman/cc/util/Colour;", "color2", "Lcom/kisman/cc/util/render/Rendering$Mode;", "bb", "alphaCoeff", "", "Lcom/kisman/cc/util/enums/RenderingRewriteModes;", "pos", "Lnet/minecraft/util/math/BlockPos;", "draw0", "init", "isActive", "modifyBB", "preInit", "kisman.cc" })
public class Class1612 extends Class91
{
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
        if (this.Method769() != null) {
            final Class1996 method769 = this.Method769();
            if (method769 == null) {
                Intrinsics.throwNpe();
            }
            method769.Method7405(this.Field15519);
            final Class1996 method770 = this.Method769();
            if (method770 == null) {
                Intrinsics.throwNpe();
            }
            method770.Method7405(this.Field15520);
            final Class1996 method771 = this.Method769();
            if (method771 == null) {
                Intrinsics.throwNpe();
            }
            method771.Method7405(this.Field15521);
            final Class1996 method772 = this.Method769();
            if (method772 == null) {
                Intrinsics.throwNpe();
            }
            method772.Method7406(this.Field15522);
            final Class1996 method773 = this.Method769();
            if (method773 == null) {
                Intrinsics.throwNpe();
            }
            method773.Method7405(this.Field15525);
            if (this.Method780() instanceof Class1697) {
                final Class1996 method774 = this.Method769();
                if (method774 == null) {
                    Intrinsics.throwNpe();
                }
                method774.Method7405(this.Field15526);
            }
            final Class1996 method775 = this.Method769();
            if (method775 == null) {
                Intrinsics.throwNpe();
            }
            method775.Method7406(this.Field15527);
            final Class1996 method776 = this.Method769();
            if (method776 == null) {
                Intrinsics.throwNpe();
            }
            method776.Method7406(this.Field15532);
        }
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
        if (this.Method780() instanceof Class1697) {
            this.Method780().Field8070.add(this);
            final HashMap field17763 = Class2134.Field17763;
            Intrinsics.checkExpressionValueIsNotNull((Object)field17763, "ShaderCharms.modules");
            ((HashMap<Class42, Class1307>)field17763).put(this.Method780(), new Class1307(this));
        }
        return this;
    }
    
    @Override
    public Object Method779() {
        return this.Method3789();
    }
    
    public boolean Method3790() {
        return this.Field15519.Method341() != Class786.Field11308;
    }
    
    public boolean Method3791() {
        return !this.Field15526.Method365();
    }
    
    public boolean Method3792(final boolean b) {
        return (b && !this.Method3791()) || (!b && this.Method3791());
    }
    
    public void Method3793(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @Nullable @Nullable final Class2008 class2029) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "color2");
        this.Method3794(axisAlignedBB, class2027, class2028, class2027, class2028, class2027, class2028, class2029);
    }
    
    public void Method3794(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class2027 class2029, @NotNull @NotNull final Class2027 class2030, @NotNull @NotNull final Class2027 class2031, @NotNull @NotNull final Class2027 class2032, @Nullable @Nullable final Class2008 class2033) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2030, "outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2031, "wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2032, "wireColor2");
        if (!this.Method3790() || class2033 == null) {
            return;
        }
        AxisAlignedBB axisAlignedBB2 = axisAlignedBB;
        if (this.Field15520.Method365()) {
            axisAlignedBB2 = new AxisAlignedBB(axisAlignedBB2.minX, axisAlignedBB2.minY + 1.0, axisAlignedBB2.minZ, axisAlignedBB2.maxX, axisAlignedBB2.maxY + Double.longBitsToDouble(4590068740216009523L), axisAlignedBB2.maxZ);
        }
        final AxisAlignedBB method3447 = Class815.Method3447(axisAlignedBB2);
        Intrinsics.checkExpressionValueIsNotNull((Object)method3447, "Rendering.correct(a)");
        this.Method3796(method3447, class2027, class2028, class2029, class2030, class2031, class2032, class2033);
    }
    
    private final AxisAlignedBB Method3795(final AxisAlignedBB axisAlignedBB) {
        AxisAlignedBB grow;
        if (this.Field15523.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(grow = axisAlignedBB.grow(this.Field15524.Method367())), "aabb.grow(scaleOffset.valDouble)");
        }
        else {
            grow = axisAlignedBB;
        }
        return grow;
    }
    
    private final void Method3796(final AxisAlignedBB axisAlignedBB, final Class2027 class2027, final Class2027 class2028, final Class2027 class2029, final Class2027 class2030, final Class2027 class2031, final Class2027 class2032, final Class2008 class2033) {
        Class815.Method3436(this.Field15525.Method365());
        Class815.Method3445(this.Method3795(axisAlignedBB), this.Field15521.Method368(), class2027, class2028, class2029, class2030, class2031, class2032, class2033, this.Field15525.Method365());
        Class815.Method3439(this.Field15525.Method365());
    }
    
    private final void Method3797(final AxisAlignedBB axisAlignedBB, final Class2027 class2027, final Class2027 class2028, final Class2008 class2029) {
        Class815.Method3443(this.Method3795(axisAlignedBB), this.Field15521.Method368(), class2027, class2028, class2029, this.Field15525.Method365());
    }
    
    public void Method3798(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class786 class2029) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "color2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "mode");
        this.Method3793(axisAlignedBB, class2027, class2028, class2029.Method3273());
    }
    
    public void Method3799(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "color2");
        final Enum method341 = this.Field15519.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3793(axisAlignedBB, class2027, class2028, ((Class786)method341).Method3273());
    }
    
    public void Method3800(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class2027 class2029, @NotNull @NotNull final Class2027 class2030, @NotNull @NotNull final Class2027 class2031, @NotNull @NotNull final Class2027 class2032, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2030, "outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2031, "wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2032, "wireColor2");
        final AxisAlignedBB getSelectedBoundingBox = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getSelectedBoundingBox, "Minecraft.getMinecraft()\u2026        pos\n            )");
        final Class2027 method3633 = class2027.Method3633((int)(n * Double.longBitsToDouble((long)1795010681 ^ 0x406FE0006AFDB079L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3633, "filledColor1.withAlpha((\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3634 = class2028.Method3633((int)(n * Double.longBitsToDouble((long)1535237992 ^ 0x406FE0005B81DF68L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3634, "filledColor2.withAlpha((\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3635 = class2029.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3635, "outlineColor1.withAlpha(\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3636 = class2030.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3636, "outlineColor2.withAlpha(\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3637 = class2031.Method3633((int)(n * Double.longBitsToDouble((long)356579489 ^ 0x406FE0001540F8A1L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3637, "wireColor1.withAlpha((alphaCoeff * 255.0).toInt())");
        final Class2027 method3638 = class2032.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3638, "wireColor2.withAlpha((alphaCoeff * 255.0).toInt())");
        final Enum method3639 = this.Field15519.Method341();
        if (method3639 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(getSelectedBoundingBox, method3633, method3634, method3635, method3636, method3637, method3638, ((Class786)method3639).Method3273());
    }
    
    public void Method3801(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class2027 class2029, @NotNull @NotNull final Class2027 class2030, @NotNull @NotNull final Class2027 class2031, @NotNull @NotNull final Class2027 class2032, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "bb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2030, "outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2031, "wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2032, "wireColor2");
        final Class2027 method3633 = class2027.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3633, "filledColor1.withAlpha((\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3634 = class2028.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3634, "filledColor2.withAlpha((\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3635 = class2029.Method3633((int)(n * Double.longBitsToDouble((long)587514958 ^ 0x406FE0002304C44EL)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3635, "outlineColor1.withAlpha(\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3636 = class2030.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3636, "outlineColor2.withAlpha(\u2026haCoeff * 255.0).toInt())");
        final Class2027 method3637 = class2031.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3637, "wireColor1.withAlpha((alphaCoeff * 255.0).toInt())");
        final Class2027 method3638 = class2032.Method3633((int)(n * Double.longBitsToDouble(4643176031446892544L)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3638, "wireColor2.withAlpha((alphaCoeff * 255.0).toInt())");
        final Enum method3639 = this.Field15519.Method341();
        if (method3639 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, method3633, method3634, method3635, method3636, method3637, method3638, ((Class786)method3639).Method3273());
    }
    
    public void Method3802(@NotNull @NotNull final BlockPos blockPos, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final AxisAlignedBB getSelectedBoundingBox = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getSelectedBoundingBox, "Minecraft.getMinecraft()\u2026        pos\n            )");
        final Class2027 method3633 = this.Method3806().Method3633(RangesKt.coerceIn((int)(n * 255), (ClosedRange)new IntRange(0, 255)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3633, "getFilledColor1().withAl\u2026toInt().coerceIn(0..255))");
        final Class2027 method3634 = this.Method3807().Method3633(RangesKt.coerceIn((int)(n * 255), (ClosedRange)new IntRange(0, 255)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3634, "getFilledColor2().withAl\u2026toInt().coerceIn(0..255))");
        final Class2027 method3635 = this.Method3808().Method3633(RangesKt.coerceIn((int)(n * 255), (ClosedRange)new IntRange(0, 255)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3635, "getOutlineColor1().withA\u2026toInt().coerceIn(0..255))");
        final Class2027 method3636 = this.Method3809().Method3633(RangesKt.coerceIn((int)(n * 255), (ClosedRange)new IntRange(0, 255)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3636, "getOutlineColor2().withA\u2026toInt().coerceIn(0..255))");
        final Class2027 method3637 = this.Method3810().Method3633(RangesKt.coerceIn((int)(n * 255), (ClosedRange)new IntRange(0, 255)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3637, "getWireColor1().withAlph\u2026toInt().coerceIn(0..255))");
        final Class2027 method3638 = this.Method3811().Method3633(RangesKt.coerceIn((int)(n * 255), (ClosedRange)new IntRange(0, 255)));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3638, "getWireColor2().withAlph\u2026toInt().coerceIn(0..255))");
        final Enum method3639 = this.Field15519.Method341();
        if (method3639 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(getSelectedBoundingBox, method3633, method3634, method3635, method3636, method3637, method3638, ((Class786)method3639).Method3273());
    }
    
    public void Method3803(@NotNull @NotNull final BlockPos blockPos, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "color2");
        final AxisAlignedBB getSelectedBoundingBox = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getSelectedBoundingBox, "Minecraft.getMinecraft()\u2026        pos\n            )");
        this.Method3799(getSelectedBoundingBox, class2027, class2028);
    }
    
    public void Method3804(@NotNull @NotNull final AxisAlignedBB axisAlignedBB) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        final Class2027 method3806 = this.Method3806();
        final Class2027 method3807 = this.Method3807();
        final Class2027 method3808 = this.Method3808();
        final Class2027 method3809 = this.Method3809();
        final Class2027 method3810 = this.Method3810();
        final Class2027 method3811 = this.Method3811();
        final Enum method3812 = this.Field15519.Method341();
        if (method3812 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3794(axisAlignedBB, method3806, method3807, method3808, method3809, method3810, method3811, ((Class786)method3812).Method3273());
    }
    
    public void Method3805(@NotNull @NotNull final BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final AxisAlignedBB getSelectedBoundingBox = Minecraft.getMinecraft().world.getBlockState(blockPos).getSelectedBoundingBox((World)Minecraft.getMinecraft().world, blockPos);
        Intrinsics.checkExpressionValueIsNotNull((Object)getSelectedBoundingBox, "Minecraft.getMinecraft()\u2026        pos\n            )");
        this.Method3804(getSelectedBoundingBox);
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method3806() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(0, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15534.Method339().Field17324, this.Field15529.Method367())), "RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field15534.Method339()), "filledColor1.colour");
        }
        return class2027;
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method3807() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(50, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15535.Method339().Field17324, this.Field15529.Method367())), "RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field15535.Method339()), "filledColor2.colour");
        }
        return class2027;
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method3808() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(0, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15537.Method339().Field17324, this.Field15529.Method367())), "RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field15537.Method339()), "outlineColor1.colour");
        }
        return class2027;
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method3809() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(50, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15538.Method339().Field17324, this.Field15529.Method367())), "RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field15538.Method339()), "outlineColor2.colour");
        }
        return class2027;
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method3810() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(0, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15540.Method339().Field17324, this.Field15529.Method367())), "RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field15540.Method339()), "wireColor1.colour");
        }
        return class2027;
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method3811() {
        Class2027 class2027;
        if (this.Field15528.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(50, this.Field15530.Method335(), this.Field15531.Method335(), this.Field15541.Method339().Field17324, this.Field15529.Method367())), "RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field15541.Method339()), "wireColor2.colour");
        }
        return class2027;
    }
    
    public Class1612(@NotNull @NotNull final Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        super(class42);
        final Class44 method355 = new Class44("Render Mode", class42, Class786.Field11308).Method355("Mode");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Render Mode\", m\u2026es.None).setTitle(\"Mode\")");
        this.Field15519 = this.Method775(method355);
        this.Field15520 = this.Method775(new Class44("Abyss", class42, false));
        final Class44 method356 = new Class44("Render Line Width", class42, 1.0, Double.longBitsToDouble((long)1584668128 ^ 0x3FB99999C7ED847AL), Double.longBitsToDouble(4617315517961601024L), false).Method313(new Class462(this)).Method355("Width");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Render Line Wid\u2026dient }.setTitle(\"Width\")");
        this.Field15521 = this.Method775(method356);
        this.Field15522 = this.Method776(new Class1996(new Class44("Scale", class42)));
        final Class1996 field15522 = this.Field15522;
        final Class44 method357 = new Class44("Scale State", class42, false).Method355("State");
        Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"Scale State\", m\u2026 false).setTitle(\"State\")");
        this.Field15523 = this.Method775(field15522.Method7405(method357));
        this.Field15524 = this.Method775(this.Field15522.Method7405(new Class44("Scale Offset", class42, Double.longBitsToDouble((long)1541666300 ^ 0x3F60624D89125C00L), Double.longBitsToDouble(4566758108544739836L), Double.longBitsToDouble(4596373779694328218L), false)));
        this.Field15525 = this.Method775(new Class44("Depth", class42, false));
        this.Field15526 = this.Method775(new Class44("Shader", class42, false));
        this.Field15527 = this.Method776(new Class1996(new Class44("Rainbow", class42)));
        this.Field15528 = this.Method775(this.Field15527.Method7405(new Class44("Rainbow", class42, false)));
        final Class1996 field15523 = this.Field15527;
        final Class44 method358 = new Class44("Rainbow Speed", class42, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble((long)2131931133 ^ 0x401400007F12AFFDL), false).Method312(this.Field15528).Method355("Speed");
        Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"Rainbow Speed\",\u2026ainbow).setTitle(\"Speed\")");
        this.Field15529 = this.Method775(field15523.Method7405(method358));
        final Class1996 field15524 = this.Field15527;
        final Class44 method359 = new Class44("Saturation", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)1919072516 ^ 0x405900007262B904L), true).Method312(this.Field15528).Method355("Sat");
        Intrinsics.checkExpressionValueIsNotNull((Object)method359, "Setting(\"Saturation\", mo\u2026(rainbow).setTitle(\"Sat\")");
        this.Field15530 = this.Method775(field15524.Method7405(method359));
        final Class1996 field15525 = this.Field15527;
        final Class44 method360 = new Class44("Brightness", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)2081485198 ^ 0x405900007C10F18EL), true).Method312(this.Field15528).Method355("Bright");
        Intrinsics.checkExpressionValueIsNotNull((Object)method360, "Setting(\"Brightness\", mo\u2026inbow).setTitle(\"Bright\")");
        this.Field15531 = this.Method775(field15525.Method7405(method360));
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
    
    private static String Method781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C57 ^ 0x6F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
