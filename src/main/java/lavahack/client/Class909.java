//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.internal.*;
import kotlin.*;
import java.util.function.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJP\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#JX\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#JP\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020&J`\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u0000H\u0016J\b\u0010)\u001a\u00020\u0000H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+H\u0016J\u0016\u0010,\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070-H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004?\u0006\u0002\n\u0000?\u0006." }, d2 = { "Lcom/kisman/cc/settings/util/FadeRenderingRewritePattern;", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "module", "Lcom/kisman/cc/features/module/Module;", "defaultFadeLogic", "Lcom/kisman/cc/util/enums/FadeLogic;", "customFadeLogic", "", "(Lcom/kisman/cc/features/module/Module;Lcom/kisman/cc/util/enums/FadeLogic;Z)V", "filledColorFadeDelay", "Lcom/kisman/cc/settings/Setting;", "filledColorFadeGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "filledColorFadeLogic", "Lcom/kisman/cc/settings/types/SettingEnum;", "outlineColorFadeDelay", "outlineColorFadeGroup", "outlineColorFadeLogic", "wireColorFadeDelay", "wireColorFadeGroup", "wireColorFadeLogic", "draw", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "filledColor1", "Lcom/kisman/cc/util/Colour;", "filledColor2", "outlineColor1", "outlineColor2", "wireColor1", "wireColor2", "mode", "Lcom/kisman/cc/util/render/Rendering$Mode;", "range", "", "distance", "timeStamp", "", "group", "init", "preInit", "prefix", "", "visible", "Ljava/util/function/Supplier;", "kisman.cc" })
public final class Class909 extends Class1612
{
    private final Class1996 Field11843;
    private final Class1303 Field11844;
    private final Class44 Field11845;
    private final Class1996 Field11846;
    private final Class1303 Field11847;
    private final Class44 Field11848;
    private final Class1996 Field11849;
    private final Class1303 Field11850;
    private final Class44 Field11851;
    private final Class1480 Field11852;
    private final boolean Field11853;
    private String Field11854 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public Class909 Method3812() {
        super.Method3789();
        if (this.Field11853) {
            this.Method780().Method25(this.Field11844);
            this.Method780().Method25(this.Field11847);
            this.Method780().Method25(this.Field11850);
        }
        this.Method780().Method24(this.Field11843);
        this.Method780().Method23(this.Field11845);
        this.Method780().Method24(this.Field11846);
        this.Method780().Method23(this.Field11848);
        this.Method780().Method24(this.Field11849);
        this.Method780().Method23(this.Field11851);
        return this;
    }
    
    public Object Method779() {
        return this.Method3812();
    }
    
    public Class1612 Method3789() {
        return this.Method3812();
    }
    
    @NotNull
    @NotNull
    public Class909 Method3813() {
        final Class909 class909 = this;
        super.Method3788();
        return this;
    }
    
    public Object Method778() {
        return this.Method3813();
    }
    
    public Class1612 Method3788() {
        return this.Method3813();
    }
    
    @NotNull
    @NotNull
    public Class909 Method3814(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "prefix");
        final Object method773 = super.Method773(s);
        if (method773 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
        }
        return (Class909)method773;
    }
    
    public Object Method773(final String s) {
        return this.Method3814(s);
    }
    
    @NotNull
    @NotNull
    public Class909 Method3815(@NotNull @NotNull final Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "visible");
        final Object method771 = super.Method771(supplier);
        if (method771 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
        }
        return (Class909)method771;
    }
    
    public Object Method771(final Supplier supplier) {
        return this.Method3815(supplier);
    }
    
    @NotNull
    @NotNull
    public Class909 Method3816(@NotNull @NotNull final Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, "group");
        final Object method772 = super.Method772(class1996);
        if (method772 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
        }
        return (Class909)method772;
    }
    
    public Object Method772(final Class1996 class1996) {
        return this.Method3816(class1996);
    }
    
    public final void Method3817(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, final long n, final float n2, final float n3) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        final Class2027 method3806 = this.Method3806();
        final Class2027 method3807 = this.Method3807();
        final Class2027 method3808 = this.Method3808();
        final Class2027 method3809 = this.Method3809();
        final Class2027 method3810 = this.Method3810();
        final Class2027 method3811 = this.Method3811();
        final Enum method3812 = this.Method3765().Method341();
        if (method3812 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3821(axisAlignedBB, method3806, method3807, method3808, method3809, method3810, method3811, ((Class786)method3812).Method3273(), n, n2, n3);
    }
    
    public final void Method3818(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class2027 class2029, @NotNull @NotNull final Class2027 class2030, @NotNull @NotNull final Class2027 class2031, @NotNull @NotNull final Class2027 class2032, @Nullable @Nullable final Class2008 class2033, final long n) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2030, "outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2031, "wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2032, "wireColor2");
        if (!this.Field11853 && this.Field11852 == Class1480.Field14901) {
            this.Method3821(axisAlignedBB, class2027, class2028, class2029, class2030, class2031, class2032, class2033, n, 1.0f, 1.0f);
        }
    }
    
    public final void Method3819(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class2027 class2029, @NotNull @NotNull final Class2027 class2030, @NotNull @NotNull final Class2027 class2031, @NotNull @NotNull final Class2027 class2032, @Nullable @Nullable final Class2008 class2033, final float n) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2030, "outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2031, "wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2032, "wireColor2");
        final Vec3d method7191 = Class1934.Field16968.Method6696(axisAlignedBB).Method7191();
        this.Method3820(axisAlignedBB, class2027, class2028, class2029, class2030, class2031, class2032, class2033, n, (float)Class2142.Field17803.player.getDistance(method7191.x, method7191.y, method7191.z));
    }
    
    public final void Method3820(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class2027 class2029, @NotNull @NotNull final Class2027 class2030, @NotNull @NotNull final Class2027 class2031, @NotNull @NotNull final Class2027 class2032, @Nullable @Nullable final Class2008 class2033, final float n, final float n2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2030, "outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2031, "wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2032, "wireColor2");
        if (!this.Field11853 && this.Field11852 == Class1480.Field14902) {
            this.Method3821(axisAlignedBB, class2027, class2028, class2029, class2030, class2031, class2032, class2033, 1L, n, n2);
        }
    }
    
    public final void Method3821(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class2027 class2027, @NotNull @NotNull final Class2027 class2028, @NotNull @NotNull final Class2027 class2029, @NotNull @NotNull final Class2027 class2030, @NotNull @NotNull final Class2027 class2031, @NotNull @NotNull final Class2027 class2032, @Nullable @Nullable final Class2008 class2033, final long n, final float n2, final float n3) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, "filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2029, "outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2030, "outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class2031, "wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class2032, "wireColor2");
        final Class121 class2034 = new Class121(n, n3, n2);
        this.Method3794(axisAlignedBB, class2034.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class2027, this.Field11845.Method369(), (Class1480)this.Field11844.Method341()), class2034.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class2028, this.Field11845.Method369(), (Class1480)this.Field11844.Method341()), class2034.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class2029, this.Field11848.Method369(), (Class1480)this.Field11847.Method341()), class2034.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class2030, this.Field11848.Method369(), (Class1480)this.Field11847.Method341()), class2034.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class2031, this.Field11851.Method369(), (Class1480)this.Field11850.Method341()), class2034.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class2032, this.Field11851.Method369(), (Class1480)this.Field11850.Method341()), class2033);
    }
    
    public Class909(@NotNull @NotNull final Class42 class42, @NotNull @NotNull final Class1480 field11852, final boolean field11853) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        Intrinsics.checkParameterIsNotNull((Object)field11852, "defaultFadeLogic");
        super(class42);
        this.Field11852 = field11852;
        this.Field11853 = field11853;
        this.Field11843 = this.Method776(this.Method3779().Method7406(new Class1996(new Class44("Fade", class42))));
        this.Field11844 = this.Method774(this.Field11843.Method7407(new Class1303("Filled Color Fade Logic", class42, (Enum)this.Field11852).Method5300("Logic")));
        final Class1996 field11854 = this.Field11843;
        final Class44 method355 = new Class44("Filled Color Fade Delay", class42, 0.0, 0.0, Double.longBitsToDouble((long)27662910 ^ 0x40C3880001A61A3EL), Class467.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Filled Color Fa\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11845 = this.Method775(field11854.Method7405(method355));
        this.Field11846 = this.Method776(this.Method3782().Method7406(new Class1996(new Class44("Fade", class42))));
        this.Field11847 = this.Method774(this.Field11846.Method7407(new Class1303("Outline Color Fade Logic", class42, (Enum)this.Field11852).Method5300("Logic")));
        final Class1996 field11855 = this.Field11846;
        final Class44 method356 = new Class44("Outline Color Fade Delay", class42, 0.0, 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Outline Color F\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11848 = this.Method775(field11855.Method7405(method356));
        this.Field11849 = this.Method776(this.Method3785().Method7406(new Class1996(new Class44("Fade", class42))));
        this.Field11850 = this.Method774(this.Field11849.Method7407(new Class1303("Wire Color Fade Logic", class42, (Enum)this.Field11852).Method5300("Logic")));
        final Class1996 field11856 = this.Field11849;
        final Class44 method357 = new Class44("Wire Color Fade Delay", class42, 0.0, 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"Wire Color Fade\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11851 = this.Method775(field11856.Method7405(method357));
    }
    
    private static String Method781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x71EF ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
