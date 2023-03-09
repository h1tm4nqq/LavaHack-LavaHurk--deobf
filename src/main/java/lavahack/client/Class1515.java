/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1024;
import lavahack.client.Class1303;
import lavahack.client.Class1612;
import lavahack.client.Class187;
import lavahack.client.Class1996;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class580;
import lavahack.client.Class941;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\b\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2={"Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "alphaFadeEasing", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$EasingReverse;", "alphaFadeLength", "Lcom/kisman/cc/settings/Setting;", "easingGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "fadeInEasing", "Lcom/kisman/cc/settings/types/SettingArray;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$Easing;", "kotlin.jvm.PlatformType", "fadeLength", "fadeOutEasing", "lengthsGroup", "movingLength", "movingOutEasing", "slideGroup", "group", "init", "preInit", "prefix", "", "visible", "Ljava/util/function/Supplier;", "", "kisman.cc"})
public final class Class1515
extends Class1612 {
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
        if (this.Method769() == null) return this;
        Class1996 class1996 = this.Method769();
        if (class1996 == null) return this;
        class1996.Method7406(this.Field15091);
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
    public Class1515 Method6044(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        Object object = super.Method773(string);
        if (object != null) return (Class1515)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
    }

    @Override
    public Object Method773(String string) {
        return this.Method6044(string);
    }

    @NotNull
    @NotNull
    public Class1515 Method6045(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"visible");
        Object object = super.Method771(supplier);
        if (object != null) return (Class1515)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
    }

    @Override
    public Object Method771(Supplier supplier) {
        return this.Method6045(supplier);
    }

    @NotNull
    @NotNull
    public Class1515 Method6046(@NotNull @NotNull Class1996 class1996) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, (String)"group");
        Object object = super.Method772(class1996);
        if (object != null) return (Class1515)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
    }

    @Override
    public Object Method772(Class1996 class1996) {
        return this.Method6046(class1996);
    }

    public Class1515(@NotNull @NotNull Class42 class42) {
        Class1303 class1303;
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        super(class42);
        this.Field15091 = this.Method776(new Class1996(new Class44("Slide", class42)));
        this.Field15092 = this.Method776(this.Field15091.Method7406(new Class1996(new Class44("Lengths", class42))));
        Class44 class44 = new Class44("Moving Length", class42, Double.longBitsToDouble(4645744490609377280L), 0.0, Double.longBitsToDouble((long)160122197 ^ 0x408F4000098B4555L), Class467.Field9943).Method355("Moving");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Moving Length\",\u2026.TIME).setTitle(\"Moving\")");
        this.Field15093 = this.Method775(this.Field15092.Method7405(class44));
        Class44 class442 = new Class44("Fade Length", class42, Double.longBitsToDouble((long)1466631477 ^ 0x40690000576B0535L), 0.0, Double.longBitsToDouble((long)55764941 ^ 0x408F40000352E7CDL), Class467.Field9943).Method355("Fade");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Fade Length\", m\u2026pe.TIME).setTitle(\"Fade\")");
        this.Field15094 = this.Method775(this.Field15092.Method7405(class442));
        Class44 class443 = new Class44("Alpha Fade Length", class42, 0.0, 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943).Method355("Alpha Fade");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Alpha Fade Leng\u2026E).setTitle(\"Alpha Fade\")");
        this.Field15095 = this.Method775(this.Field15092.Method7405(class443));
        this.Field15096 = this.Method776(this.Field15091.Method7406(new Class1996(new Class44("Easing", class42))));
        ArrayList arrayList = Class580.Field10473;
        Intrinsics.checkExpressionValueIsNotNull((Object)arrayList, (String)"EasingEnum.outEasings");
        this.Field15097 = this.Method777(this.Field15096.Method7408(new Class941("Moving Out Easing", class42, Class187.Field8814, (List)arrayList).Method3888("Moving Out")));
        ArrayList arrayList2 = Class580.Field10472;
        Intrinsics.checkExpressionValueIsNotNull((Object)arrayList2, (String)"EasingEnum.inEasings");
        this.Field15098 = this.Method777(this.Field15096.Method7408(new Class941("Fade In Easing", class42, Class187.Field8814, (List)arrayList2).Method3888("Fade In")));
        ArrayList arrayList3 = Class580.Field10473;
        Intrinsics.checkExpressionValueIsNotNull((Object)arrayList3, (String)"EasingEnum.outEasings");
        this.Field15099 = this.Method777(this.Field15096.Method7408(new Class941("Fade Out Easing", class42, Class187.Field8814, (List)arrayList3).Method3888("Fade Out")));
        Class1303 class13032 = new Class1303("Alpha Fade Easing", class42, Class1024.Field12478).Method5300("Alpha Fade");
        Class1515 class1515 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class1303 class13033 = class13032;
        boolean bl3 = false;
        this.Field15096.Method7407(class13033);
        this.Method774(class13033);
        class1515.Field15100 = class1303 = class13032;
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 101;
            cArray2[n] = (char)(cArray[n] ^ (0x2D9A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

