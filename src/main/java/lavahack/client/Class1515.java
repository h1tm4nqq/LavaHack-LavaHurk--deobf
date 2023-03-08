//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.util.function.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\b\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004?\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004?\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001e" }, d2 = { "Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "alphaFadeEasing", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$EasingReverse;", "alphaFadeLength", "Lcom/kisman/cc/settings/Setting;", "easingGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "fadeInEasing", "Lcom/kisman/cc/settings/types/SettingArray;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$Easing;", "kotlin.jvm.PlatformType", "fadeLength", "fadeOutEasing", "lengthsGroup", "movingLength", "movingOutEasing", "slideGroup", "group", "init", "preInit", "prefix", "", "visible", "Ljava/util/function/Supplier;", "", "kisman.cc" })
public final class Class1515 extends Class1612
{
    private final Class1996 Field15091;
    private final Class1996 Field15092;
    @JvmField
    @NotNull
    public final Class44 Field15093;
    @JvmField
    @NotNull
    public final Class44 Field15094;
    @JvmField
    @NotNull
    public final Class44 Field15095;
    private final Class1996 Field15096;
    @JvmField
    @NotNull
    public final Class941 Field15097;
    @JvmField
    @NotNull
    public final Class941 Field15098;
    @JvmField
    @NotNull
    public final Class941 Field15099;
    @JvmField
    @NotNull
    public final Class1303 Field15100;
    private String Field15101 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public Class1515 Method6042() {
        super.Method3788();
        if (this.Method769() != null) {
            final Class1996 method769 = this.Method769();
            if (method769 != null) {
                method769.Method7406(this.Field15091);
            }
        }
        return this;
    }
    
    @Override
    public Object Method778() {
        return this.Method6042();
    }
    
    @Override
    public Class1612 Method3788() {
        return this.Method6042();
    }
    
    @NotNull
    @NotNull
    public Class1515 Method6043() {
        super.Method3789();
        this.Method780().Method24(this.Field15091);
        this.Method780().Method24(this.Field15092);
        this.Method780().Method23(this.Field15093);
        this.Method780().Method23(this.Field15094);
        this.Method780().Method23(this.Field15095);
        this.Method780().Method24(this.Field15096);
        this.Method780().Method26(this.Field15097);
        this.Method780().Method26(this.Field15098);
        this.Method780().Method26(this.Field15099);
        this.Method780().Method25(this.Field15100);
        return this;
    }
    
    @Override
    public Object Method779() {
        return this.Method6043();
    }
    
    @Override
    public Class1612 Method3789() {
        return this.Method6043();
    }
    
    @NotNull
    @NotNull
    public Class1515 Method6044(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "prefix");
        final Object method773 = super.Method773(s);
        if (method773 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
        }
        return (Class1515)method773;
    }
    
    @Override
    public Object Method773(final String s) {
        return this.Method6044(s);
    }
    
    @NotNull
    @NotNull
    public Class1515 Method6045(@NotNull @NotNull final Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, "visible");
        final Object method771 = super.Method771(supplier);
        if (method771 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
        }
        return (Class1515)method771;
    }
    
    @Override
    public Object Method771(final Supplier supplier) {
        return this.Method6045(supplier);
    }
    
    @NotNull
    @NotNull
    public Class1515 Method6046(@NotNull @NotNull final Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, "group");
        final Object method772 = super.Method772(class1996);
        if (method772 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
        }
        return (Class1515)method772;
    }
    
    @Override
    public Object Method772(final Class1996 class1996) {
        return this.Method6046(class1996);
    }
    
    public Class1515(@NotNull @NotNull final Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        super(class42);
        this.Field15091 = this.Method776(new Class1996(new Class44("Slide", class42)));
        this.Field15092 = this.Method776(this.Field15091.Method7406(new Class1996(new Class44("Lengths", class42))));
        final Class1996 field15092 = this.Field15092;
        final Class44 method355 = new Class44("Moving Length", class42, Double.longBitsToDouble(4645744490609377280L), 0.0, Double.longBitsToDouble((long)160122197 ^ 0x408F4000098B4555L), Class467.Field9943).Method355("Moving");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Moving Length\",\u2026.TIME).setTitle(\"Moving\")");
        this.Field15093 = this.Method775(field15092.Method7405(method355));
        final Class1996 field15093 = this.Field15092;
        final Class44 method356 = new Class44("Fade Length", class42, Double.longBitsToDouble((long)1466631477 ^ 0x40690000576B0535L), 0.0, Double.longBitsToDouble((long)55764941 ^ 0x408F40000352E7CDL), Class467.Field9943).Method355("Fade");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Fade Length\", m\u2026pe.TIME).setTitle(\"Fade\")");
        this.Field15094 = this.Method775(field15093.Method7405(method356));
        final Class1996 field15094 = this.Field15092;
        final Class44 method357 = new Class44("Alpha Fade Length", class42, 0.0, 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943).Method355("Alpha Fade");
        Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"Alpha Fade Leng\u2026E).setTitle(\"Alpha Fade\")");
        this.Field15095 = this.Method775(field15094.Method7405(method357));
        this.Field15096 = this.Method776(this.Field15091.Method7406(new Class1996(new Class44("Easing", class42))));
        final Class1996 field15095 = this.Field15096;
        final String s = "Moving Out Easing";
        final Class187 field15096 = Class187.Field8814;
        final ArrayList field15097 = Class580.Field10473;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15097, "EasingEnum.outEasings");
        this.Field15097 = this.Method777(field15095.Method7408(new Class941(s, class42, field15096, field15097).Method3888("Moving Out")));
        final Class1996 field15098 = this.Field15096;
        final String s2 = "Fade In Easing";
        final Class187 field15099 = Class187.Field8814;
        final ArrayList field15100 = Class580.Field10472;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15100, "EasingEnum.inEasings");
        this.Field15098 = this.Method777(field15098.Method7408(new Class941(s2, class42, field15099, field15100).Method3888("Fade In")));
        final Class1996 field15101 = this.Field15096;
        final String s3 = "Fade Out Easing";
        final Class187 field15102 = Class187.Field8814;
        final ArrayList field15103 = Class580.Field10473;
        Intrinsics.checkExpressionValueIsNotNull((Object)field15103, "EasingEnum.outEasings");
        this.Field15099 = this.Method777(field15101.Method7408(new Class941(s3, class42, field15102, field15103).Method3888("Fade Out")));
        final Class1303 method358;
        final Class1303 field15104 = method358 = new Class1303("Alpha Fade Easing", class42, (Enum)Class1024.Field12478).Method5300("Alpha Fade");
        this.Field15096.Method7407(method358);
        this.Method774(method358);
        this.Field15100 = field15104;
    }
    
    private static String Method781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2D9A ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
