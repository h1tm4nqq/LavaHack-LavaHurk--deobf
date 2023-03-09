/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import java.awt.Font;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.Class1412;
import lavahack.client.Class1613;
import lavahack.client.Class1958;
import lavahack.client.Class2034;
import lavahack.client.Class29;
import lavahack.client.Class433;
import lavahack.client.Class632;
import lavahack.client.Class88;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016J(\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016J3\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0002\u0010#J(\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016J(\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\fH\u0016J0\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0012H\u0016J(\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\b\u0010/\u001a\u00020\fH\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0012H\u0016J\u0010\u00105\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0012H\u0016J\u0010\u00108\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2={"Lcom/kisman/cc/util/render/customfont/ExtendedFontRenderer;", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "font", "Ljava/awt/Font;", "(Ljava/awt/Font;)V", "bold", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "both", "getFont", "()Ljava/awt/Font;", "italic", "offset", "", "plain", "style", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/FontStyles;", "test", "", "test2", "drawCenteredString", "", "text", "", "x", "", "y", "color", "drawCenteredStringWithShadow", "drawChar", "data", "", "Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "c", "", "([Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;CFF)V", "drawLine", "x1", "y1", "drawString", "", "shadow", "drawStringWithShadow", "getAntiAlias", "getCurrentFont", "getFractionMetrics", "getHeight", "getMultiLineOffset", "getStringHeight", "getStringWidth", "getY", "setAntiAlias", "antiAlias", "setFont", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "kisman.cc"})
public class Class670
extends Class88 {
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
        switch (Class632.Field10701[((Class1613)((Object)this.Field10850.get())).ordinal()]) {
            case 1: {
                Class433 class433 = this.Field10846;
                return class433;
            }
            case 2: {
                Class433 class433 = this.Field10847;
                return class433;
            }
            case 3: {
                Class433 class433 = this.Field10848;
                return class433;
            }
            case 4: {
                Class433 class433 = this.Field10849;
                return class433;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int Method2853(int n) {
        int n2;
        Object t = this.Field10852.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"test2.get()");
        if (!((Boolean)t).booleanValue()) {
            n2 = n;
            return n2;
        }
        Object t2 = this.Field10851.get();
        Intrinsics.checkExpressionValueIsNotNull(t2, (String)"test.get()");
        if (((Boolean)t2).booleanValue()) {
            n2 = n + 2;
            return n2;
        }
        n2 = n - 1;
        return n2;
    }

    @Override
    public void Method746(@NotNull @NotNull Class2034[] class2034Array, char c, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)class2034Array, (String)"data");
        this.Method2852().Method746(class2034Array, c, f, f2);
    }

    @Override
    public int Method747() {
        int n;
        int n2 = this.Method2852().ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
        Object t = this.Field10851.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"test.get()");
        if (((Boolean)t).booleanValue()) {
            n = 0;
            return (n2 - n) / 2;
        }
        n = 8;
        return (n2 - n) / 2;
    }

    @Override
    public void Method748(@NotNull @NotNull String string, int n, int n2, int n3) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        this.Method2852().Method2069(string, n, this.Method2853(n2), n3);
    }

    @Override
    public void Method749(int n, int n2, int n3, int n4) {
        this.Method2852().Method2072(n, n2, n3, n4);
    }

    @Override
    public void Method750(boolean bl) {
        this.Method2852().Method750(bl);
    }

    @Override
    public void Method751(boolean bl) {
        this.Method2852().Method751(bl);
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
    public void Method754(@NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        this.Method2852().YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = font;
    }

    @Override
    public int Method757(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        return this.Method2852().Method757(string);
    }

    @Override
    public int Method758(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        return (this.Method747() + this.Field10853) * StringsKt.split$default((CharSequence)string, (String[])new String[]{"\n"}, (boolean)false, (int)0, (int)6, null).size();
    }

    @Override
    public float Method759(@NotNull @NotNull String string, double d, double d2, int n, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        return this.Method2852().Method759(string, d, this.Method2853((int)d2), n, bl);
    }

    @Override
    public float Method760(@NotNull @NotNull String string, double d, double d2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        return this.Method759(string, d, this.Method2853((int)d2), n, false);
    }

    @Override
    public void Method761(@NotNull @NotNull String string, float f, float f2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        this.Method2852().Method761(string, f, this.Method2853((int)f2), n);
    }

    @Override
    public void Method762(@NotNull @NotNull String string, float f, float f2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        this.Method2852().Method762(string, f, this.Method2853((int)f2), n);
    }

    @Override
    public int Method755() {
        return this.Field10853;
    }

    @Override
    public void Method756(int n) {
        this.Field10853 = n;
        this.Method2852().vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 = this.Method747() + n;
    }

    @NotNull
    @NotNull
    public final Font Method2854() {
        return this.Field10854;
    }

    public Class670(@NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        this.Field10854 = font;
        this.Field10846 = new Class433(this.Field10854.deriveFont(Class1613.Field15543.Method6280()), true, true);
        this.Field10847 = new Class433(this.Field10854.deriveFont(Class1613.Field15544.Method6280()), true, true);
        this.Field10848 = new Class433(this.Field10854.deriveFont(Class1613.Field15545.Method6280()), true, true);
        this.Field10849 = new Class433(this.Field10854.deriveFont(Class1613.Field15546.Method6280()), true, true);
        this.Field10850 = Class1958.Field17027;
        this.Field10851 = Class29.Field7938;
        this.Field10852 = Class1412.Field14416;
        this.Field10853 = 2;
    }

    private static String Method2855(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 80;
            cArray2[n] = (char)(cArray[n] ^ (0x1AAD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

