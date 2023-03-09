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
import lavahack.client.Class1085;
import lavahack.client.Class1301;
import lavahack.client.Class1613;
import lavahack.client.Class1897;
import lavahack.client.Class2034;
import lavahack.client.Class433;
import lavahack.client.Class479;
import lavahack.client.Class88;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J(\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J3\u0010'\u001a\u00020\u001e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0002\u0010*J(\u0010+\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020%2\u0006\u0010#\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0016J(\u0010.\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020/2\u0006\u0010#\u001a\u00020/2\u0006\u0010$\u001a\u00020%H\u0016J0\u0010.\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020/2\u0006\u0010#\u001a\u00020/2\u0006\u0010$\u001a\u00020%2\u0006\u00100\u001a\u00020\u001bH\u0016J(\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020%2\u0006\u0010#\u001a\u00020%2\u0006\u0010$\u001a\u00020%H\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\b\u00103\u001a\u00020\u0007H\u0002J\b\u00104\u001a\u00020\u0007H\u0002J\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020%H\u0016J\b\u00107\u001a\u00020%H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010:\u001a\u00020%2\u0006\u0010#\u001a\u00020%H\u0002J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u001bH\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u001bH\u0016J\u0010\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020%H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2={"Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "font", "Ljava/awt/Font;", "fallbackFont", "(Ljava/awt/Font;Ljava/awt/Font;)V", "bold", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "boldF", "both", "bothF", "data", "", "Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "[Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "fallbackData", "getFallbackFont", "()Ljava/awt/Font;", "getFont", "italic", "italicF", "plain", "plainF", "style", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/FontStyles;", "test", "", "test2", "drawCenteredString", "", "text", "", "x", "", "y", "color", "", "drawCenteredStringWithShadow", "drawChar", "c", "", "([Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;CFF)V", "drawLine", "x1", "y1", "drawString", "", "shadow", "drawStringWithShadow", "getAntiAlias", "getCurrentFallbackFont", "getCurrentFont", "getFractionMetrics", "getHeight", "getMultiLineOffset", "getStringHeight", "getStringWidth", "getY", "setAntiAlias", "antiAlias", "setFont", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "offset", "kisman.cc"})
public final class Class1354
extends Class88 {
    private final Class433 Field14160;
    private final Class433 Field14161;
    private final Class433 Field14162;
    private final Class433 Field14163;
    private final Class433 Field14164;
    private final Class433 Field14165;
    private final Class433 Field14166;
    private final Class433 Field14167;
    private final Supplier Field14168;
    private final Supplier Field14169;
    private final Supplier Field14170;
    private final Class2034[] Field14171;
    private final Class2034[] Field14172;
    @NotNull
    private final Font Field14173;
    @NotNull
    private final Font Field14174;
    private String Field14175 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private final Class433 Method5418() {
        switch (Class1897.Field16727[((Class1613)((Object)this.Field14168.get())).ordinal()]) {
            case 1: {
                Class433 class433 = this.Field14160;
                return class433;
            }
            case 2: {
                Class433 class433 = this.Field14161;
                return class433;
            }
            case 3: {
                Class433 class433 = this.Field14162;
                return class433;
            }
            case 4: {
                Class433 class433 = this.Field14163;
                return class433;
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
            n2 = n + 2;
            return n2;
        }
        n2 = n - 1;
        return n2;
    }

    private final Class433 Method5420() {
        switch (Class1897.Field16728[((Class1613)((Object)this.Field14168.get())).ordinal()]) {
            case 1: {
                Class433 class433 = this.Field14164;
                return class433;
            }
            case 2: {
                Class433 class433 = this.Field14165;
                return class433;
            }
            case 3: {
                Class433 class433 = this.Field14166;
                return class433;
            }
            case 4: {
                Class433 class433 = this.Field14167;
                return class433;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override
    public void Method746(@NotNull @NotNull Class2034[] class2034Array, char c, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)class2034Array, (String)"data");
    }

    @Override
    public int Method747() {
        String string = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method748(@NotNull @NotNull String string, int n, int n2, int n3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public void Method749(int n, int n2, int n3, int n4) {
        String string = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method750(boolean bl) {
        String string = "Not yet implemented";
        boolean bl2 = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method751(boolean bl) {
        String string = "Not yet implemented";
        boolean bl2 = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public boolean Method752() {
        String string = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public boolean Method753() {
        String string = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method754(@NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        String string = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public int Method755() {
        String string = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public void Method756(int n) {
        String string = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string);
    }

    @Override
    public int Method757(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public int Method758(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public float Method759(@NotNull @NotNull String string, double d, double d2, int n, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        double d3 = d;
        String string2 = string;
        boolean bl2 = false;
        char[] cArray = string2.toCharArray();
        Intrinsics.checkExpressionValueIsNotNull((Object)cArray, (String)"(this as java.lang.String).toCharArray()");
        char[] cArray2 = cArray;
        int n2 = cArray2.length;
        int n3 = 0;
        while (n3 < n2) {
            char c = cArray2[n3];
            d3 = this.Field14173.canDisplay(c) ? (d3 += (double)this.Method5418().Method759(String.valueOf(c), d3, d2, n, bl)) : (d3 += (double)this.Method5420().Method759(String.valueOf(c), d3, d2, n, bl));
            ++n3;
        }
        return (float)d3;
    }

    @Override
    public float Method760(@NotNull @NotNull String string, double d, double d2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public void Method761(@NotNull @NotNull String string, float f, float f2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        boolean bl = false;
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + string2);
    }

    @Override
    public void Method762(@NotNull @NotNull String string, float f, float f2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        String string2 = "Not yet implemented";
        boolean bl = false;
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

    public Class1354(@NotNull @NotNull Font font, @NotNull @NotNull Font font2) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        Intrinsics.checkParameterIsNotNull((Object)font2, (String)"fallbackFont");
        this.Field14173 = font;
        this.Field14174 = font2;
        this.Field14160 = new Class433(this.Field14173.deriveFont(Class1613.Field15543.Method6280()), true, true);
        this.Field14161 = new Class433(this.Field14173.deriveFont(Class1613.Field15544.Method6280()), true, true);
        this.Field14162 = new Class433(this.Field14173.deriveFont(Class1613.Field15545.Method6280()), true, true);
        this.Field14163 = new Class433(this.Field14173.deriveFont(Class1613.Field15546.Method6280()), true, true);
        this.Field14164 = new Class433(this.Field14174.deriveFont(Class1613.Field15543.Method6280()), true, true);
        this.Field14165 = new Class433(this.Field14174.deriveFont(Class1613.Field15544.Method6280()), true, true);
        this.Field14166 = new Class433(this.Field14174.deriveFont(Class1613.Field15545.Method6280()), true, true);
        this.Field14167 = new Class433(this.Field14174.deriveFont(Class1613.Field15546.Method6280()), true, true);
        this.Field14168 = Class1301.Field13937;
        this.Field14169 = Class479.Field10001;
        this.Field14170 = Class1085.Field12838;
        this.Field14171 = new Class2034[256];
        this.Field14172 = new Class2034[1104];
    }

    private static String Method5423(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 215;
            cArray2[n] = (char)(cArray[n] ^ (0x1AC6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

