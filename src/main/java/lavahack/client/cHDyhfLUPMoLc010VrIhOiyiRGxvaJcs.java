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
import lavahack.client.HQv69u03MmDc5JddqhzH80Lj7sen5Y1g;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\b\u0010\u0018\u001a\u00020\u0000H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2={"Lcom/kisman/cc/settings/util/SlideRenderingRewritePattern;", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "alphaFadeEasing", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$EasingReverse;", "alphaFadeLength", "Lcom/kisman/cc/settings/Setting;", "easingGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "fadeInEasing", "Lcom/kisman/cc/settings/types/SettingArray;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$Easing;", "kotlin.jvm.PlatformType", "fadeLength", "fadeOutEasing", "lengthsGroup", "movingLength", "movingOutEasing", "slideGroup", "group", "init", "preInit", "prefix", "", "visible", "Ljava/util/function/Supplier;", "", "kisman.cc"})
public final class cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs
extends MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15091;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15092;
    @JvmField
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15093;
    @JvmField
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15094;
    @JvmField
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15095;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field15096;
    @JvmField
    @NotNull
    public final HQv69u03MmDc5JddqhzH80Lj7sen5Y1g Field15097;
    @JvmField
    @NotNull
    public final HQv69u03MmDc5JddqhzH80Lj7sen5Y1g Field15098;
    @JvmField
    @NotNull
    public final HQv69u03MmDc5JddqhzH80Lj7sen5Y1g Field15099;
    @JvmField
    @NotNull
    public final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field15100;
    private String Field15101 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Method6042() {
        super.Method3788();
        if (this.Method769() == null) return this;
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Method769();
        if (xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 == null) return this;
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2.Method7406(this.Field15091);
        return this;
    }

    @Override
    public Object Method778() {
        return this.Method6042();
    }

    @Override
    public MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method3788() {
        return this.Method6042();
    }

    @NotNull
    @NotNull
    public cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Method6043() {
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
    public MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method3789() {
        return this.Method6043();
    }

    @NotNull
    @NotNull
    public cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Method6044(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        Object object = super.Method773(string);
        if (object != null) return (cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
    }

    @Override
    public Object Method773(String string) {
        return this.Method6044(string);
    }

    @NotNull
    @NotNull
    public cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Method6045(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"visible");
        Object object = super.Method771(supplier);
        if (object != null) return (cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
    }

    @Override
    public Object Method771(Supplier supplier) {
        return this.Method6045(supplier);
    }

    @NotNull
    @NotNull
    public cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs Method6046(@NotNull @NotNull xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        Intrinsics.checkParameterIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"group");
        Object object = super.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2);
        if (object != null) return (cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.SlideRenderingRewritePattern");
    }

    @Override
    public Object Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        return this.Method6046(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2);
    }

    public cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        super(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
        this.Field15091 = this.Method776(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slide", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J)));
        this.Field15092 = this.Method776(this.Field15091.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lengths", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Moving Length", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble(0x4AEA37D7F4C5D9BAL ^ 0xA9337D7F4C5D9BAL), 0.0, Double.longBitsToDouble((long)160122197 ^ 0x408F4000098B4555L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Moving");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Moving Length\",\u2026.TIME).setTitle(\"Moving\")");
        this.Field15093 = this.Method775(this.Field15092.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade Length", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, Double.longBitsToDouble((long)1466631477 ^ 0x40690000576B0535L), 0.0, Double.longBitsToDouble((long)55764941 ^ 0x408F40000352E7CDL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Fade");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Fade Length\", m\u2026pe.TIME).setTitle(\"Fade\")");
        this.Field15094 = this.Method775(this.Field15092.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Alpha Fade Length", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 0.0, 0.0, Double.longBitsToDouble(0x9ABAD48603B58DEAL ^ 0xDA35948603B58DEAL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Alpha Fade");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Alpha Fade Leng\u2026E).setTitle(\"Alpha Fade\")");
        this.Field15095 = this.Method775(this.Field15092.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        this.Field15096 = this.Method776(this.Field15091.Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Easing", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        ArrayList arrayList = yA6FfBWveAENft82JRISn3FwZ8fifzBI.Field10473;
        Intrinsics.checkExpressionValueIsNotNull((Object)arrayList, (String)"EasingEnum.outEasings");
        this.Field15097 = this.Method777(this.Field15096.Method7408(new HQv69u03MmDc5JddqhzH80Lj7sen5Y1g("Moving Out Easing", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8814, (List)arrayList).Method3888("Moving Out")));
        ArrayList arrayList2 = yA6FfBWveAENft82JRISn3FwZ8fifzBI.Field10472;
        Intrinsics.checkExpressionValueIsNotNull((Object)arrayList2, (String)"EasingEnum.inEasings");
        this.Field15098 = this.Method777(this.Field15096.Method7408(new HQv69u03MmDc5JddqhzH80Lj7sen5Y1g("Fade In Easing", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8814, (List)arrayList2).Method3888("Fade In")));
        ArrayList arrayList3 = yA6FfBWveAENft82JRISn3FwZ8fifzBI.Field10473;
        Intrinsics.checkExpressionValueIsNotNull((Object)arrayList3, (String)"EasingEnum.outEasings");
        this.Field15099 = this.Method777(this.Field15096.Method7408(new HQv69u03MmDc5JddqhzH80Lj7sen5Y1g("Fade Out Easing", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8814, (List)arrayList3).Method3888("Fade Out")));
        M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk2 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Alpha Fade Easing", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, yA6FfBWveAENft82JRISn3FwZ8fifzBI$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field12478).Method5300("Alpha Fade");
        cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2 = this;
        int n = (int)-1926894425L ^ 0x8D25ECA7;
        int n2 = (int)((long)-28604616 ^ (long)-28604616);
        M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk3 = m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk2;
        int n3 = (int)((long)1107384122 ^ (long)1107384122);
        this.Field15096.Method7407(m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk3);
        this.Method774(m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk3);
        cHDyhfLUPMoLc010VrIhOiyiRGxvaJcs2.Field15100 = m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk = m5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk2;
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2128081816L ^ 0x81280C68;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-362273034L ^ 0xEA682609);
            int n2 = (int)((long)523360145 ^ (long)523360244);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)101482247 ^ (long)101476810) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

