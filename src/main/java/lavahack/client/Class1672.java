/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1047;
import lavahack.client.Class169;
import lavahack.client.Class171;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J;\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0017JS\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0018J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ)\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0019J1\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u001aJA\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006 "}, d2={"Lcom/kisman/cc/util/render/ChromaColorHelper;", "", "()V", "astolfo", "Lcom/kisman/cc/util/Colour;", "hOffset", "", "sat", "", "bright", "speed", "", "fade", "color", "minBright", "getColor", "staticColor", "pulsiveColors", "", "type", "Lcom/kisman/cc/util/enums/ChromaColorTypes;", "hOffsetRaw", "hOffsetModifier", "(Lcom/kisman/cc/util/Colour;[Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/enums/ChromaColorTypes;II)Lcom/kisman/cc/util/Colour;", "(Lcom/kisman/cc/util/Colour;[Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/enums/ChromaColorTypes;IIFFD)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;II)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;IID)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;IIFFD)Lcom/kisman/cc/util/Colour;", "pulsive", "color1", "color2", "rainbow", "kisman.cc"})
public final class Class1672 {
    public static final Class1672 Field15802;
    private String Field15803 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class2027 Method6449(@NotNull @NotNull Class2027[] class2027Array, int n, int n2, float f, float f2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)class2027Array, (String)"pulsiveColors");
        return this.Method6456(null, class2027Array, Class169.Field8720, n, n2, f, f2, d);
    }

    @NotNull
    @NotNull
    public final Class2027 Method6450(@NotNull @NotNull Class2027[] class2027Array, int n, int n2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)class2027Array, (String)"pulsiveColors");
        return this.Method6456(null, class2027Array, Class169.Field8720, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), d);
    }

    @NotNull
    @NotNull
    public final Class2027 Method6451(@NotNull @NotNull Class2027[] class2027Array, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)class2027Array, (String)"pulsiveColors");
        return this.Method6456(null, class2027Array, Class169.Field8720, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), Double.longBitsToDouble(0x4000000000000000L));
    }

    @NotNull
    @NotNull
    public final Class2027 Method6452(@NotNull @NotNull Class169 class169, int n, int n2, float f, float f2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class169), (String)"type");
        Class2027 class2027 = null;
        Class1672 class1672 = this;
        boolean bl = false;
        Class2027[] class2027Array = new Class2027[]{};
        return class1672.Method6456(class2027, class2027Array, class169, n, n2, f, f2, d);
    }

    @NotNull
    @NotNull
    public final Class2027 Method6453(@NotNull @NotNull Class169 class169, int n, int n2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class169), (String)"type");
        return this.Method6452(class169, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), d);
    }

    @NotNull
    @NotNull
    public final Class2027 Method6454(@NotNull @NotNull Class169 class169, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)class169), (String)"type");
        return this.Method6452(class169, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), Double.longBitsToDouble((long)340541736 ^ 0x40000000144C4128L));
    }

    @NotNull
    @NotNull
    public final Class2027 Method6455(@Nullable @Nullable Class2027 class2027, @NotNull @NotNull Class2027[] class2027Array, @NotNull @NotNull Class169 class169, int n, int n2) {
        Intrinsics.checkParameterIsNotNull((Object)class2027Array, (String)"pulsiveColors");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class169), (String)"type");
        return this.Method6456(class2027, class2027Array, class169, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), Double.longBitsToDouble(0x4000000000000000L));
    }

    @NotNull
    @NotNull
    public final Class2027 Method6456(@Nullable @Nullable Class2027 class2027, @NotNull @NotNull Class2027[] class2027Array, @NotNull @NotNull Class169 class169, int n, int n2, float f, float f2, double d) {
        Intrinsics.checkParameterIsNotNull((Object)class2027Array, (String)"pulsiveColors");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class169), (String)"type");
        int n3 = n * n2;
        switch (Class171.Field8776[class169.ordinal()]) {
            case 1: {
                Class2027 class20272 = this.Method6460(n3, f, f2, d);
                return class20272;
            }
            case 2: {
                Class2027 class20272 = this.Method6459(n3, f, f2, d);
                return class20272;
            }
            case 3: {
                Class2027 class20272;
                if (class2027Array.length == 2) {
                    class20272 = this.Method6458(class2027Array[0], class2027Array[1], n3, f, f2, d);
                    return class20272;
                }
                class20272 = new Class2027(255, 255, 255, 255);
                return class20272;
            }
            case 4: {
                Class2027 class20272 = class2027;
                if (class20272 != null) {
                    return class20272;
                }
                class20272 = new Class2027(255, 255, 255, 255);
                return class20272;
            }
            case 5: {
                Class2027 class20272;
                if (class2027 != null) {
                    class20272 = this.Method6457(class2027, n3, f, f2, d);
                    return class20272;
                }
                class20272 = new Class2027(255, 255, 255, 255);
                return class20272;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Class2027 Method6457(Class2027 class2027, int n, float f, float f2, double d) {
        double d2 = (double)11529L / d;
        double d3 = d2 / (double)360;
        double d4 = (double)System.currentTimeMillis() % d2 / d3 + (double)n;
        float f3 = class2027.Method3620();
        boolean bl = false;
        double d5 = Math.abs(d4);
        Class2027 class20272 = Class2027.Method3618(f3, (float)Class1047.Method4278(d5, f2, 1.0), f);
        Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"Colour.fromHSB(\n        \u2026            sat\n        )");
        return class20272;
    }

    private final Class2027 Method6458(Class2027 class2027, Class2027 class20272, int n, float f, float f2, double d) {
        Class2027 class20273;
        double d2 = (double)11529L / d;
        double d3 = d2 / (double)360;
        int n2 = (int)((double)System.currentTimeMillis() % d2 / d3) + n;
        if (n2 > 1) {
            int n3 = n2 % 1;
            n2 = n2 % 2 == 0 ? n3 : 1 - n3;
        }
        Class2027 class20274 = class20273;
        Class2027 class20275 = class20273;
        int n4 = n2;
        int n5 = class20272.Field17321;
        int n6 = class2027.Field17321;
        return n6 + (n5 - n6) * n4;
    }

    private final Class2027 Method6459(int n, float f, float f2, double d) {
        double d2;
        for (d2 = (double)((float)((double)System.currentTimeMillis() % d)) + (double)(1000 - n) * Double.longBitsToDouble((long)736539841 ^ 0x402200002BE6B4C1L); d2 > d; d2 -= d) {
        }
        if ((d2 /= d) > Double.longBitsToDouble((long)2080359718 ^ 0x3FE000007BFFC526L)) {
            d2 = (double)Float.intBitsToFloat(0x3F000000) - (d2 - (double)Float.intBitsToFloat(0x3F000000));
        }
        Class2027 class2027 = Class2027.Method3618((float)(d2 += (double)Float.intBitsToFloat(0x3F000000)), f, f2);
        Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"Colour.fromHSB(hue.toFloat(), sat, bright)");
        return class2027;
    }

    private final Class2027 Method6460(int n, float f, float f2, double d) {
        double d2 = (double)11529L / d;
        double d3 = d2 / (double)360;
        int n2 = (int)((double)System.currentTimeMillis() % d2 / d3) + n;
        if (n2 > 360) {
            n2 -= 360;
        }
        Class2027 class2027 = Class2027.Method3618((float)n2 / Float.intBitsToFloat(1135869952), f / (float)100, f2 / (float)100);
        Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"Colour.fromHSB(hue / 360\u2026 sat / 100, bright / 100)");
        return class2027;
    }

    private Class1672() {
    }

    static {
        Class1672 class1672;
        Field15802 = class1672 = new Class1672();
    }

    private static String Method6461(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 93;
            cArray2[n] = (char)(cArray[n] ^ (0x48F1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

