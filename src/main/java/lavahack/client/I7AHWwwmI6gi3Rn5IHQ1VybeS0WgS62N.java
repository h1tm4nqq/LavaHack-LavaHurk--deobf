/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.NotImplementedError
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.awt.Font;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
import lavahack.client.XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0;
import lavahack.client.lJMRYAnHVAA7LVCxQ5v4evqpH9KQnROU;
import lavahack.client.otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J(\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J3\u0010'\u001a\u00020\u001e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0002\u0010*J(\u0010+\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020%2\u0006\u0010#\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0016J(\u0010.\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020/2\u0006\u0010#\u001a\u00020/2\u0006\u0010$\u001a\u00020%H\u0016J0\u0010.\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020/2\u0006\u0010#\u001a\u00020/2\u0006\u0010$\u001a\u00020%2\u0006\u00100\u001a\u00020\u001bH\u0016J(\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020%2\u0006\u0010#\u001a\u00020%2\u0006\u0010$\u001a\u00020%H\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\b\u00103\u001a\u00020\u0007H\u0002J\b\u00104\u001a\u00020\u0007H\u0002J\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020%H\u0016J\b\u00107\u001a\u00020%H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010:\u001a\u00020%2\u0006\u0010#\u001a\u00020%H\u0002J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u001bH\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u001bH\u0016J\u0010\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020%H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2={"Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "font", "Ljava/awt/Font;", "fallbackFont", "(Ljava/awt/Font;Ljava/awt/Font;)V", "bold", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "boldF", "both", "bothF", "data", "", "Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "[Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "fallbackData", "getFallbackFont", "()Ljava/awt/Font;", "getFont", "italic", "italicF", "plain", "plainF", "style", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/FontStyles;", "test", "", "test2", "drawCenteredString", "", "text", "", "x", "", "y", "color", "", "drawCenteredStringWithShadow", "drawChar", "c", "", "([Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;CFF)V", "drawLine", "x1", "y1", "drawString", "", "shadow", "drawStringWithShadow", "getAntiAlias", "getCurrentFallbackFont", "getCurrentFont", "getFractionMetrics", "getHeight", "getMultiLineOffset", "getStringHeight", "getStringWidth", "getY", "setAntiAlias", "antiAlias", "setFont", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "offset", "kisman.cc"})
public final class I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N
extends XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 {
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14160;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14161;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14162;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14163;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14164;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14165;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14166;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field14167;
    private final Supplier Field14168;
    private final Supplier Field14169;
    private final Supplier Field14170;
    private final otatQ0mdWEQRR0BON28RmSa6RYuIuPcL.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14171;
    private final otatQ0mdWEQRR0BON28RmSa6RYuIuPcL.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14172;
    @NotNull
    private final Font Field14173;
    @NotNull
    private final Font Field14174;
    private String Field14175 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Method5418() {
        switch (lJMRYAnHVAA7LVCxQ5v4evqpH9KQnROU.Field16727[((qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW)((Object)this.Field14168.get())).ordinal()]) {
            case 1: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14160;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 2: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14161;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 3: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14162;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 4: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14163;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int Method5419(int n) {
        int n2;
        Object t = this.Field14170.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"test2.get()");
        if (!((Boolean)t).booleanValue()) {
            n2 = n;
            return n2;
        }
        Object t2 = this.Field14169.get();
        Intrinsics.checkExpressionValueIsNotNull(t2, (String)"test.get()");
        if (((Boolean)t2).booleanValue()) {
            n2 = n + ((int)((long)712754948 ^ (long)712754949) << 1);
            return n2;
        }
        n2 = n - ((int)1640710791L ^ 0x61CB4286);
        return n2;
    }

    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Method5420() {
        switch (lJMRYAnHVAA7LVCxQ5v4evqpH9KQnROU.Field16728[((qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW)((Object)this.Field14168.get())).ordinal()]) {
            case 1: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14164;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 2: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14165;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 3: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14166;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 4: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field14167;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override
    public void Method746(@NotNull @NotNull otatQ0mdWEQRR0BON28RmSa6RYuIuPcL.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, char c, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, (String)"data");
    }

    @Override
    public int Method747() {
        String string = "Not yet implemented";
        int n = (int)((long)559981362 ^ (long)559981362);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method748(@NotNull @NotNull String string, int n, int n2, int n3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        int n4 = (int)((long)-1493822960 ^ (long)-1493822960);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public void Method749(int n, int n2, int n3, int n4) {
        String string = "Not yet implemented";
        int n5 = (int)((long)-2015736236 ^ (long)-2015736236);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method750(boolean bl) {
        String string = "Not yet implemented";
        int n = (int)((long)2100687225 ^ (long)2100687225);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method751(boolean bl) {
        String string = "Not yet implemented";
        int n = (int)565384384L ^ 0x21B314C0;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public boolean Method752() {
        String string = "Not yet implemented";
        int n = (int)((long)1022259827 ^ (long)1022259827);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public boolean Method753() {
        String string = "Not yet implemented";
        int n = (int)((long)2019402034 ^ (long)2019402034);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method754(@NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        String string = "Not yet implemented";
        int n = (int)((long)1702112059 ^ (long)1702112059);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public int Method755() {
        String string = "Not yet implemented";
        int n = (int)((long)-1422381766 ^ (long)-1422381766);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method756(int n) {
        String string = "Not yet implemented";
        int n2 = (int)((long)2051487274 ^ (long)2051487274);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public int Method757(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        int n = (int)1633770415L ^ 0x61615BAF;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public int Method758(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        int n = (int)1476355719L ^ 0x57FF6687;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public float Method759(@NotNull @NotNull String string, double d, double d2, int n, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        double d3 = d;
        String string2 = string;
        int n2 = (int)1569356869L ^ 0x5D8A7C45;
        char[] cArray = string2.toCharArray();
        Intrinsics.checkExpressionValueIsNotNull((Object)cArray, (String)"(this as java.lang.String).toCharArray()");
        char[] cArray2 = cArray;
        int n3 = cArray2.length;
        int n4 = (int)-1331663726L ^ 0xB0A06C92;
        while (n4 < n3) {
            char c = cArray2[n4];
            d3 = this.Field14173.canDisplay(c) ? (d3 += (double)this.Method5418().Method759(String.valueOf(c), d3, d2, n, bl)) : (d3 += (double)this.Method5420().Method759(String.valueOf(c), d3, d2, n, bl));
            ++n4;
        }
        return (float)d3;
    }

    @Override
    public float Method760(@NotNull @NotNull String string, double d, double d2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        int n2 = (int)-1644610642L ^ 0x9DF93BAE;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public void Method761(@NotNull @NotNull String string, float f, float f2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        int n2 = (int)-1713010912L ^ 0x99E58720;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public void Method762(@NotNull @NotNull String string, float f, float f2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        int n2 = (int)((long)-912176549 ^ (long)-912176549);
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @NotNull
    @NotNull
    public final Font Method5421() {
        return this.Field14173;
    }

    @NotNull
    @NotNull
    public final Font Method5422() {
        return this.Field14174;
    }

    public I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N(@NotNull @NotNull Font font, @NotNull @NotNull Font font2) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        Intrinsics.checkParameterIsNotNull((Object)font2, (String)"fallbackFont");
        this.Field14173 = font;
        this.Field14174 = font2;
        this.Field14160 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14173.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15543.Method6280()), (boolean)((long)716771857 ^ (long)716771856), (boolean)((long)1839063405 ^ (long)1839063404));
        this.Field14161 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14173.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15544.Method6280()), (boolean)((long)986617468 ^ (long)986617469), ((int)-770256468L ^ 0xD216D1AD) != 0);
        this.Field14162 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14173.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15545.Method6280()), ((int)732256274L ^ 0x2BA55813) != 0, (boolean)((long)1244620068 ^ (long)1244620069));
        this.Field14163 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14173.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15546.Method6280()), ((int)1519594819L ^ 0x5A932D42) != 0, ((int)1755976716L ^ 0x68AA140D) != 0);
        this.Field14164 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14174.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15543.Method6280()), ((int)1260461176L ^ 0x4B211C79) != 0, ((int)261240507L ^ 0xF9236BA) != 0);
        this.Field14165 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14174.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15544.Method6280()), (boolean)((long)1840492798 ^ (long)1840492799), (boolean)((long)1925153180 ^ (long)1925153181));
        this.Field14166 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14174.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15545.Method6280()), (boolean)((long)31097412 ^ (long)31097413), ((int)-321526400L ^ 0xECD5E581) != 0);
        this.Field14167 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field14174.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15546.Method6280()), ((int)-737840787L ^ 0xD405716C) != 0, (boolean)((long)1891702656 ^ (long)1891702657));
        this.Field14168 = I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field13937;
        this.Field14169 = I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field10001;
        this.Field14170 = I7AHWwwmI6gi3Rn5IHQ1VybeS0WgS62N$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field12838;
        this.Field14171 = new otatQ0mdWEQRR0BON28RmSa6RYuIuPcL.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-1864393093L ^ 0x90DF9E7A) << 8];
        this.Field14172 = new otatQ0mdWEQRR0BON28RmSa6RYuIuPcL.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)1005008555L ^ 0x3BE736EE) << 4];
    }

    private static String Method5423(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1700961400L ^ 0x65629C78;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1363053802L ^ 0x513E8C15);
            int n2 = (int)81864050L ^ 0x4E125A5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1702367868 ^ (long)-1702371097) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

