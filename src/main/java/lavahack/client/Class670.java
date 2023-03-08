//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016J(\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016J3\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016?\u0006\u0002\u0010#J(\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016J(\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\fH\u0016J0\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0012H\u0016J(\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\b\u0010/\u001a\u00020\fH\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0012H\u0016J\u0010\u00105\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0012H\u0016J\u0010\u00108\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004?\u0006\u0002\n\u0000?\u00069" }, d2 = { "Lcom/kisman/cc/util/render/customfont/ExtendedFontRenderer;", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "font", "Ljava/awt/Font;", "(Ljava/awt/Font;)V", "bold", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "both", "getFont", "()Ljava/awt/Font;", "italic", "offset", "", "plain", "style", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/FontStyles;", "test", "", "test2", "drawCenteredString", "", "text", "", "x", "", "y", "color", "drawCenteredStringWithShadow", "drawChar", "data", "", "Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "c", "", "([Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;CFF)V", "drawLine", "x1", "y1", "drawString", "", "shadow", "drawStringWithShadow", "getAntiAlias", "getCurrentFont", "getFractionMetrics", "getHeight", "getMultiLineOffset", "getStringHeight", "getStringWidth", "getY", "setAntiAlias", "antiAlias", "setFont", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "kisman.cc" })
public class Class670 extends Class88
{
    private final Class433 Field10846;
    private final Class433 Field10847;
    private final Class433 Field10848;
    private final Class433 Field10849;
    private final Supplier Field10850;
    private final Supplier Field10851;
    private final Supplier Field10852;
    private int Field10853;
    @NotNull
    private final Font Field10854;
    private String Field10855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public Class433 Method2852() {
        Class433 class433 = null;
        switch (Class632.Field10701[this.Field10850.get().ordinal()]) {
            case 1: {
                class433 = this.Field10846;
                break;
            }
            case 2: {
                class433 = this.Field10847;
                break;
            }
            case 3: {
                class433 = this.Field10848;
                break;
            }
            case 4: {
                class433 = this.Field10849;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return class433;
    }
    
    private final int Method2853(final int n) {
        final Boolean value = this.Field10852.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "test2.get()");
        int n2;
        if (value) {
            final Boolean value2 = this.Field10851.get();
            Intrinsics.checkExpressionValueIsNotNull((Object)value2, "test.get()");
            n2 = (value2 ? (n + 2) : (n - 1));
        }
        else {
            n2 = n;
        }
        return n2;
    }
    
    @Override
    public void Method746(@NotNull @NotNull final Class2034[] array, final char c, final float n, final float n2) {
        Intrinsics.checkParameterIsNotNull((Object)array, "data");
        this.Method2852().Method746(array, c, n, n2);
    }
    
    @Override
    public int Method747() {
        final int ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS = this.Method2852().ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
        final Boolean value = this.Field10851.get();
        Intrinsics.checkExpressionValueIsNotNull((Object)value, "test.get()");
        return (ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS - (value ? 0 : 8)) / 2;
    }
    
    @Override
    public void Method748(@NotNull @NotNull final String s, final int n, final int n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        this.Method2852().Method2069(s, (double)n, (double)this.Method2853(n2), n3);
    }
    
    @Override
    public void Method749(final int n, final int n2, final int n3, final int n4) {
        this.Method2852().Method2072((double)n, (double)n2, (double)n3, (double)n4);
    }
    
    @Override
    public void Method750(final boolean b) {
        this.Method2852().Method750(b);
    }
    
    @Override
    public void Method751(final boolean b) {
        this.Method2852().Method751(b);
    }
    
    @Override
    public boolean Method752() {
        return this.Method2852().vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
    }
    
    @Override
    public boolean Method753() {
        return this.Method2852().UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
    }
    
    @Override
    public void Method754(@NotNull @NotNull final Font ylFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        Intrinsics.checkParameterIsNotNull((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf, "font");
        this.Method2852().YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = ylFSugLHQAjzunVBKfamPjSRsvHTy3jf;
    }
    
    @Override
    public int Method757(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        return this.Method2852().Method757(s);
    }
    
    @Override
    public int Method758(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        return (this.Method747() + this.Field10853) * StringsKt.split$default((CharSequence)s, new String[] { "\n" }, false, 0, 6, (Object)null).size();
    }
    
    @Override
    public float Method759(@NotNull @NotNull final String s, final double n, final double n2, final int n3, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        return this.Method2852().Method759(s, n, (double)this.Method2853((int)n2), n3, b);
    }
    
    @Override
    public float Method760(@NotNull @NotNull final String s, final double n, final double n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        return this.Method759(s, n, this.Method2853((int)n2), n3, false);
    }
    
    @Override
    public void Method761(@NotNull @NotNull final String s, final float n, final float n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        this.Method2852().Method761(s, n, (float)this.Method2853((int)n2), n3);
    }
    
    @Override
    public void Method762(@NotNull @NotNull final String s, final float n, final float n2, final int n3) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        this.Method2852().Method762(s, n, (float)this.Method2853((int)n2), n3);
    }
    
    @Override
    public int Method755() {
        return this.Field10853;
    }
    
    @Override
    public void Method756(final int field10853) {
        this.Field10853 = field10853;
        this.Method2852().vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 = this.Method747() + field10853;
    }
    
    @NotNull
    @NotNull
    public final Font Method2854() {
        return this.Field10854;
    }
    
    public Class670(@NotNull @NotNull final Font field10854) {
        Intrinsics.checkParameterIsNotNull((Object)field10854, "font");
        this.Field10854 = field10854;
        this.Field10846 = new Class433(this.Field10854.deriveFont(Class1613.Field15543.Method6280()), true, true);
        this.Field10847 = new Class433(this.Field10854.deriveFont(Class1613.Field15544.Method6280()), true, true);
        this.Field10848 = new Class433(this.Field10854.deriveFont(Class1613.Field15545.Method6280()), true, true);
        this.Field10849 = new Class433(this.Field10854.deriveFont(Class1613.Field15546.Method6280()), true, true);
        this.Field10850 = (Supplier)Class1958.Field17027;
        this.Field10851 = (Supplier)Class29.Field7938;
        this.Field10852 = (Supplier)Class1412.Field14416;
        this.Field10853 = 2;
    }
    
    private static String Method2855(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1AAD ^ 0x50));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
