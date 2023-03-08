//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003?\u0006\u0002\u0010\u0005J(\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J(\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J3\u0010'\u001a\u00020\u001e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010(\u001a\u00020)2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016?\u0006\u0002\u0010*J(\u0010+\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020%2\u0006\u0010#\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0016J(\u0010.\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020/2\u0006\u0010#\u001a\u00020/2\u0006\u0010$\u001a\u00020%H\u0016J0\u0010.\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020/2\u0006\u0010#\u001a\u00020/2\u0006\u0010$\u001a\u00020%2\u0006\u00100\u001a\u00020\u001bH\u0016J(\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020%2\u0006\u0010#\u001a\u00020%2\u0006\u0010$\u001a\u00020%H\u0016J\b\u00102\u001a\u00020\u001bH\u0016J\b\u00103\u001a\u00020\u0007H\u0002J\b\u00104\u001a\u00020\u0007H\u0002J\b\u00105\u001a\u00020\u001bH\u0016J\b\u00106\u001a\u00020%H\u0016J\b\u00107\u001a\u00020%H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010:\u001a\u00020%2\u0006\u0010#\u001a\u00020%H\u0002J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u001bH\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u001bH\u0016J\u0010\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020%H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004?\u0006\u0004\n\u0002\u0010\u000eR\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004?\u0006\u0004\n\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018X\u0082\u0004?\u0006\u0002\n\u0000?\u0006B" }, d2 = { "Lcom/kisman/cc/util/render/customfont/FallbackableFont;", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "font", "Ljava/awt/Font;", "fallbackFont", "(Ljava/awt/Font;Ljava/awt/Font;)V", "bold", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "boldF", "both", "bothF", "data", "", "Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "[Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "fallbackData", "getFallbackFont", "()Ljava/awt/Font;", "getFont", "italic", "italicF", "plain", "plainF", "style", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/FontStyles;", "test", "", "test2", "drawCenteredString", "", "text", "", "x", "", "y", "color", "", "drawCenteredStringWithShadow", "drawChar", "c", "", "([Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;CFF)V", "drawLine", "x1", "y1", "drawString", "", "shadow", "drawStringWithShadow", "getAntiAlias", "getCurrentFallbackFont", "getCurrentFont", "getFractionMetrics", "getHeight", "getMultiLineOffset", "getStringHeight", "getStringWidth", "getY", "setAntiAlias", "antiAlias", "setFont", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "offset", "kisman.cc" })
public final class Class1354 extends Class88
{
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
        Class433 class433 = null;
        switch (Class1897.Field16727[this.Field14168.get().ordinal()]) {
            case 1: {
                class433 = this.Field14160;
                break;
            }
            case 2: {
                class433 = this.Field14161;
                break;
            }
            case 3: {
                class433 = this.Field14162;
                break;
            }
            case 4: {
                class433 = this.Field14163;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return class433;
    }
    
    private final int Method5419(final int n) {
        final Boolean value = this.Field14170.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "test2.get()");
        int n2;
        if (value) {
            final Boolean value2 = this.Field14169.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value2, "test.get()");
            n2 = (value2 ? (n + 2) : (n - 1));
        }
        else {
            n2 = n;
        }
        return n2;
    }
    
    private final Class433 Method5420() {
        Class433 class433 = null;
        switch (Class1897.Field16728[this.Field14168.get().ordinal()]) {
            case 1: {
                class433 = this.Field14164;
                break;
            }
            case 2: {
                class433 = this.Field14165;
                break;
            }
            case 3: {
                class433 = this.Field14166;
                break;
            }
            case 4: {
                class433 = this.Field14167;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return class433;
    }
    
    @Override
    public void Method746(@NotNull @NotNull final Class2034[] array, final char c, final float n, final float n2) {
        Intrinsics.checkParameterIsNotNull((Object)array, "data");
    }
    
    @Override
    public int Method747() {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method748(@NotNull @NotNull final String s, final int n, final int n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method749(final int n, final int n2, final int n3, final int n4) {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method750(final boolean b) {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method751(final boolean b) {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public boolean Method752() {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public boolean Method753() {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method754(@NotNull @NotNull final Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, "font");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public int Method755() {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method756(final int n) {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public int Method757(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public int Method758(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public float Method759(@NotNull @NotNull final String s, final double n, final double n2, final int n3, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        double n4 = n;
        final char[] charArray = s.toCharArray();
        Intrinsics.checkExpressionValueIsNotNull((Object)charArray, "(this as java.lang.String).toCharArray()");
        for (final char c : charArray) {
            if (this.Field14173.canDisplay(c)) {
                n4 += this.Method5418().Method759(String.valueOf(c), n4, n2, n3, b);
            }
            else {
                n4 += this.Method5420().Method759(String.valueOf(c), n4, n2, n3, b);
            }
        }
        return (float)n4;
    }
    
    @Override
    public float Method760(@NotNull @NotNull final String s, final double n, final double n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method761(@NotNull @NotNull final String s, final float n, final float n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void Method762(@NotNull @NotNull final String s, final float n, final float n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
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
    
    public Class1354(@NotNull @NotNull final Font field14173, @NotNull @NotNull final Font field14174) {
        Intrinsics.checkParameterIsNotNull((Object)field14173, "font");
        Intrinsics.checkParameterIsNotNull((Object)field14174, "fallbackFont");
        this.Field14173 = field14173;
        this.Field14174 = field14174;
        this.Field14160 = new Class433(this.Field14173.deriveFont(Class1613.Field15543.Method6280()), true, true);
        this.Field14161 = new Class433(this.Field14173.deriveFont(Class1613.Field15544.Method6280()), true, true);
        this.Field14162 = new Class433(this.Field14173.deriveFont(Class1613.Field15545.Method6280()), true, true);
        this.Field14163 = new Class433(this.Field14173.deriveFont(Class1613.Field15546.Method6280()), true, true);
        this.Field14164 = new Class433(this.Field14174.deriveFont(Class1613.Field15543.Method6280()), true, true);
        this.Field14165 = new Class433(this.Field14174.deriveFont(Class1613.Field15544.Method6280()), true, true);
        this.Field14166 = new Class433(this.Field14174.deriveFont(Class1613.Field15545.Method6280()), true, true);
        this.Field14167 = new Class433(this.Field14174.deriveFont(Class1613.Field15546.Method6280()), true, true);
        this.Field14168 = (Supplier)Class1301.Field13937;
        this.Field14169 = Class479.Field10001;
        this.Field14170 = (Supplier)Class1085.Field12838;
        this.Field14171 = new Class2034[256];
        this.Field14172 = new Class2034[1104];
    }
    
    private static String Method5423(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AC6 ^ 0xD7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
