//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class2142;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class121;
import lavahack.client.Class1303;
import lavahack.client.Class1480;
import lavahack.client.Class1612;
import lavahack.client.Class1934;
import lavahack.client.Class1996;
import lavahack.client.Class2008;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class786;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJP\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#JX\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#JP\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020&J`\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u0000H\u0016J\b\u0010)\u001a\u00020\u0000H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+H\u0016J\u0016\u0010,\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070-H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2={"Lcom/kisman/cc/settings/util/FadeRenderingRewritePattern;", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "module", "Lcom/kisman/cc/features/module/Module;", "defaultFadeLogic", "Lcom/kisman/cc/util/enums/FadeLogic;", "customFadeLogic", "", "(Lcom/kisman/cc/features/module/Module;Lcom/kisman/cc/util/enums/FadeLogic;Z)V", "filledColorFadeDelay", "Lcom/kisman/cc/settings/Setting;", "filledColorFadeGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "filledColorFadeLogic", "Lcom/kisman/cc/settings/types/SettingEnum;", "outlineColorFadeDelay", "outlineColorFadeGroup", "outlineColorFadeLogic", "wireColorFadeDelay", "wireColorFadeGroup", "wireColorFadeLogic", "draw", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "filledColor1", "Lcom/kisman/cc/util/Colour;", "filledColor2", "outlineColor1", "outlineColor2", "wireColor1", "wireColor2", "mode", "Lcom/kisman/cc/util/render/Rendering$Mode;", "range", "", "distance", "timeStamp", "", "group", "init", "preInit", "prefix", "", "visible", "Ljava/util/function/Supplier;", "kisman.cc"})
public final class Class909
extends Class1612 {
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

    @Override
    public Object Method779() {
        return this.Method3812();
    }

    @Override
    public Class1612 Method3789() {
        return this.Method3812();
    }

    @NotNull
    @NotNull
    public Class909 Method3813() {
        Class909 class909 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class909 class9092 = class909;
        boolean bl3 = false;
        super.Method3788();
        return class909;
    }

    @Override
    public Object Method778() {
        return this.Method3813();
    }

    @Override
    public Class1612 Method3788() {
        return this.Method3813();
    }

    @NotNull
    @NotNull
    public Class909 Method3814(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        Object object = super.Method773(string);
        if (object != null) return (Class909)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
    }

    @Override
    public Object Method773(String string) {
        return this.Method3814(string);
    }

    @NotNull
    @NotNull
    public Class909 Method3815(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"visible");
        Object object = super.Method771(supplier);
        if (object != null) return (Class909)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
    }

    @Override
    public Object Method771(Supplier supplier) {
        return this.Method3815(supplier);
    }

    @NotNull
    @NotNull
    public Class909 Method3816(@NotNull @NotNull Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, (String)"group");
        Object object = super.Method772(class1996);
        if (object != null) return (Class909)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
    }

    @Override
    public Object Method772(Class1996 class1996) {
        return this.Method3816(class1996);
    }

    public final void Method3817(@NotNull @NotNull AxisAlignedBB axisAlignedBB, long l, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Enum enum_ = this.Method3765().Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3821(axisAlignedBB, this.Method3806(), this.Method3807(), this.Method3808(), this.Method3809(), this.Method3810(), this.Method3811(), ((Class786)enum_).Method3273(), l, f, f2);
    }

    public final void Method3818(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276, @Nullable @Nullable Class2008 class2008, long l) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"wireColor2");
        if (this.Field11853) return;
        if (this.Field11852 != Class1480.Field14901) return;
        this.Method3821(axisAlignedBB, class2027, class20272, class20273, class20274, class20275, class20276, class2008, l, 1.0f, 1.0f);
    }

    public final void Method3819(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276, @Nullable @Nullable Class2008 class2008, float f) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"wireColor2");
        Vec3d vec3d = Class1934.Field16968.Method6696(axisAlignedBB).Method7191();
        this.Method3820(axisAlignedBB, class2027, class20272, class20273, class20274, class20275, class20276, class2008, f, (float)Class2142.Field17803.player.getDistance(vec3d.x, vec3d.y, vec3d.z));
    }

    public final void Method3820(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276, @Nullable @Nullable Class2008 class2008, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"wireColor2");
        if (this.Field11853) return;
        if (this.Field11852 != Class1480.Field14902) return;
        this.Method3821(axisAlignedBB, class2027, class20272, class20273, class20274, class20275, class20276, class2008, 1L, f, f2);
    }

    public final void Method3821(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class2027 class2027, @NotNull @NotNull Class2027 class20272, @NotNull @NotNull Class2027 class20273, @NotNull @NotNull Class2027 class20274, @NotNull @NotNull Class2027 class20275, @NotNull @NotNull Class2027 class20276, @Nullable @Nullable Class2008 class2008, long l, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20272, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20273, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20274, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)class20275, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)class20276, (String)"wireColor2");
        Class121 class121 = new Class121(l, f2, f);
        this.Method3794(axisAlignedBB, class121.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class2027, this.Field11845.Method369(), (Class1480)this.Field11844.Method341()), class121.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class20272, this.Field11845.Method369(), (Class1480)this.Field11844.Method341()), class121.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class20273, this.Field11848.Method369(), (Class1480)this.Field11847.Method341()), class121.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class20274, this.Field11848.Method369(), (Class1480)this.Field11847.Method341()), class121.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class20275, this.Field11851.Method369(), (Class1480)this.Field11850.Method341()), class121.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class20276, this.Field11851.Method369(), (Class1480)this.Field11850.Method341()), class2008);
    }

    public Class909(@NotNull @NotNull Class42 class42, @NotNull @NotNull Class1480 class1480, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1480), (String)"defaultFadeLogic");
        super(class42);
        this.Field11852 = class1480;
        this.Field11853 = bl;
        this.Field11843 = this.Method776(this.Method3779().Method7406(new Class1996(new Class44("Fade", class42))));
        this.Field11844 = this.Method774(this.Field11843.Method7407(new Class1303("Filled Color Fade Logic", class42, this.Field11852).Method5300("Logic")));
        Class44 class44 = new Class44("Filled Color Fade Delay", class42, 0.0, 0.0, Double.longBitsToDouble((long)27662910 ^ 0x40C3880001A61A3EL), Class467.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Filled Color Fa\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11845 = this.Method775(this.Field11843.Method7405(class44));
        this.Field11846 = this.Method776(this.Method3782().Method7406(new Class1996(new Class44("Fade", class42))));
        this.Field11847 = this.Method774(this.Field11846.Method7407(new Class1303("Outline Color Fade Logic", class42, this.Field11852).Method5300("Logic")));
        Class44 class442 = new Class44("Outline Color Fade Delay", class42, 0.0, 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Outline Color F\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11848 = this.Method775(this.Field11846.Method7405(class442));
        this.Field11849 = this.Method776(this.Method3785().Method7406(new Class1996(new Class44("Fade", class42))));
        this.Field11850 = this.Method774(this.Field11849.Method7407(new Class1303("Wire Color Fade Logic", class42, this.Field11852).Method5300("Logic")));
        Class44 class443 = new Class44("Wire Color Fade Delay", class42, 0.0, 0.0, Double.longBitsToDouble(4666723172467343360L), Class467.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Wire Color Fade\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11851 = this.Method775(this.Field11849.Method7405(class443));
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 118;
            cArray2[n] = (char)(cArray[n] ^ (0x71EF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

