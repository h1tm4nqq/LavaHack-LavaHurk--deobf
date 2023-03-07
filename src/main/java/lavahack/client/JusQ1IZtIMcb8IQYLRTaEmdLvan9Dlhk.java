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
import lavahack.client.JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.N9XMAkTPMPEunZmGyAYEfoNrjor6Ux79;
import lavahack.client.PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
import lavahack.client.XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0;
import lavahack.client.otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016J(\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016J3\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0002\u0010#J(\u0010$\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016J(\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\fH\u0016J0\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0012H\u0016J(\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\fH\u0016J\b\u0010/\u001a\u00020\fH\u0016J\u0010\u00100\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u00101\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u0012H\u0016J\u0010\u00105\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0012H\u0016J\u0010\u00108\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2={"Lcom/kisman/cc/util/render/customfont/ExtendedFontRenderer;", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "font", "Ljava/awt/Font;", "(Ljava/awt/Font;)V", "bold", "Lcom/kisman/cc/util/render/customfont/CustomFontRenderer;", "both", "getFont", "()Ljava/awt/Font;", "italic", "offset", "", "plain", "style", "Ljava/util/function/Supplier;", "Lcom/kisman/cc/util/enums/FontStyles;", "test", "", "test2", "drawCenteredString", "", "text", "", "x", "", "y", "color", "drawCenteredStringWithShadow", "drawChar", "data", "", "Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "c", "", "([Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;CFF)V", "drawLine", "x1", "y1", "drawString", "", "shadow", "drawStringWithShadow", "getAntiAlias", "getCurrentFont", "getFractionMetrics", "getHeight", "getMultiLineOffset", "getStringHeight", "getStringWidth", "getY", "setAntiAlias", "antiAlias", "setFont", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "kisman.cc"})
public class JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk
extends XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 {
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field10846;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field10847;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field10848;
    private final PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Field10849;
    private final Supplier Field10850;
    private final Supplier Field10851;
    private final Supplier Field10852;
    private int Field10853;
    @NotNull
    private final Font Field10854;
    private String Field10855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 Method2852() {
        switch (N9XMAkTPMPEunZmGyAYEfoNrjor6Ux79.Field10701[((qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW)((Object)this.Field10850.get())).ordinal()]) {
            case 1: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field10846;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 2: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field10847;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 3: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field10848;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
            }
            case 4: {
                PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1 = this.Field10849;
                return pF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1;
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
            n2 = n + ((int)((long)1467560751 ^ (long)1467560750) << 1);
            return n2;
        }
        n2 = n - (int)((long)-769483537 ^ (long)-769483538);
        return n2;
    }

    @Override
    public void Method746(@NotNull @NotNull otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, char c, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, (String)"data");
        this.Method2852().Method746(otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, c, f, f2);
    }

    @Override
    public int Method747() {
        int n;
        int n2 = this.Method2852().ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS;
        Object t = this.Field10851.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"test.get()");
        if (((Boolean)t).booleanValue()) {
            n = (int)((long)347400234 ^ (long)347400234);
            return (n2 - n) / (((int)1144849849L ^ 0x443D05B8) << 1);
        }
        n = ((int)799702380L ^ 0x2FAA7D6D) << 3;
        return (n2 - n) / (((int)1144849849L ^ 0x443D05B8) << 1);
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
        String[] stringArray = new String[(int)((long)-1884444347 ^ (long)-1884444348)];
        stringArray[(int)((long)-1973397601 ^ (long)-1973397601)] = "\n";
        return (this.Method747() + this.Field10853) * StringsKt.split$default((CharSequence)string, (String[])stringArray, (boolean)((long)-2132550911 ^ (long)-2132550911), (int)((int)-1262344630L ^ 0xB4C2264A), (int)((int)((long)1800675977 ^ (long)1800675978) << 1), null).size();
    }

    @Override
    public float Method759(@NotNull @NotNull String string, double d, double d2, int n, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        return this.Method2852().Method759(string, d, this.Method2853((int)d2), n, bl);
    }

    @Override
    public float Method760(@NotNull @NotNull String string, double d, double d2, int n) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        return this.Method759(string, d, this.Method2853((int)d2), n, ((int)-1546571155L ^ 0xA3D1326D) != 0);
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

    public JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk(@NotNull @NotNull Font font) {
        Intrinsics.checkParameterIsNotNull((Object)font, (String)"font");
        this.Field10854 = font;
        this.Field10846 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field10854.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15543.Method6280()), ((int)-557627914L ^ 0xDEC345F7) != 0, ((int)1709869288L ^ 0x65EA88E9) != 0);
        this.Field10847 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field10854.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15544.Method6280()), ((int)-1001675700L ^ 0xC44BA44D) != 0, ((int)113379760L ^ 0x6C209B1) != 0);
        this.Field10848 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field10854.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15545.Method6280()), ((int)-783706006L ^ 0xD149986B) != 0, (boolean)((long)-630139519 ^ (long)-630139520));
        this.Field10849 = new PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(this.Field10854.deriveFont(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.Field15546.Method6280()), ((int)-1097635203L ^ 0xBE936A7C) != 0, (boolean)((long)832735602 ^ (long)832735603));
        this.Field10850 = JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17027;
        this.Field10851 = JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field7938;
        this.Field10852 = JusQ1IZtIMcb8IQYLRTaEmdLvan9Dlhk$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field14416;
        this.Field10853 = ((int)-495608821L ^ 0xE2759C0A) << 1;
    }

    private static String Method2855(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1665293066L ^ 0x9CBDA4F6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1645488665L ^ 0x62142AE6);
            int n2 = ((int)788376920L ^ 0x2EFDAD5D) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1236330795 ^ (long)-1236333448) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

