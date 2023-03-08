//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J0\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J;\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006?\u0006\u0002\u0010\u0017JS\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b?\u0006\u0002\u0010\u0018J\u001e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ6\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ)\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006?\u0006\u0002\u0010\u0019J1\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b?\u0006\u0002\u0010\u001aJA\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b?\u0006\u0002\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002?\u0006 " }, d2 = { "Lcom/kisman/cc/util/render/ChromaColorHelper;", "", "()V", "astolfo", "Lcom/kisman/cc/util/Colour;", "hOffset", "", "sat", "", "bright", "speed", "", "fade", "color", "minBright", "getColor", "staticColor", "pulsiveColors", "", "type", "Lcom/kisman/cc/util/enums/ChromaColorTypes;", "hOffsetRaw", "hOffsetModifier", "(Lcom/kisman/cc/util/Colour;[Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/enums/ChromaColorTypes;II)Lcom/kisman/cc/util/Colour;", "(Lcom/kisman/cc/util/Colour;[Lcom/kisman/cc/util/Colour;Lcom/kisman/cc/util/enums/ChromaColorTypes;IIFFD)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;II)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;IID)Lcom/kisman/cc/util/Colour;", "([Lcom/kisman/cc/util/Colour;IIFFD)Lcom/kisman/cc/util/Colour;", "pulsive", "color1", "color2", "rainbow", "kisman.cc" })
public final class Class1672
{
    public static final Class1672 Field15802;
    private String Field15803 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class2027 Method6449(@NotNull @NotNull final Class2027[] array, final int n, final int n2, final float n3, final float n4, final double n5) {
        Intrinsics.checkParameterIsNotNull((Object)array, "pulsiveColors");
        return this.Method6456(null, array, Class169.Field8720, n, n2, n3, n4, n5);
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6450(@NotNull @NotNull final Class2027[] array, final int n, final int n2, final double n3) {
        Intrinsics.checkParameterIsNotNull((Object)array, "pulsiveColors");
        return this.Method6456(null, array, Class169.Field8720, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), n3);
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6451(@NotNull @NotNull final Class2027[] array, final int n, final int n2) {
        Intrinsics.checkParameterIsNotNull((Object)array, "pulsiveColors");
        return this.Method6456(null, array, Class169.Field8720, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), Double.longBitsToDouble(4611686018427387904L));
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6452(@NotNull @NotNull final Class169 class169, final int n, final int n2, final float n3, final float n4, final double n5) {
        Intrinsics.checkParameterIsNotNull((Object)class169, "type");
        return this.Method6456(null, new Class2027[0], class169, n, n2, n3, n4, n5);
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6453(@NotNull @NotNull final Class169 class169, final int n, final int n2, final double n3) {
        Intrinsics.checkParameterIsNotNull((Object)class169, "type");
        return this.Method6452(class169, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), n3);
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6454(@NotNull @NotNull final Class169 class169, final int n, final int n2) {
        Intrinsics.checkParameterIsNotNull((Object)class169, "type");
        return this.Method6452(class169, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), Double.longBitsToDouble((long)340541736 ^ 0x40000000144C4128L));
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6455(@Nullable @Nullable final Class2027 class2027, @NotNull @NotNull final Class2027[] array, @NotNull @NotNull final Class169 class2028, final int n, final int n2) {
        Intrinsics.checkParameterIsNotNull((Object)array, "pulsiveColors");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "type");
        return this.Method6456(class2027, array, class2028, n, n2, Float.intBitsToFloat(1120403456), Float.intBitsToFloat(1112014848), Double.longBitsToDouble(4611686018427387904L));
    }
    
    @NotNull
    @NotNull
    public final Class2027 Method6456(@Nullable @Nullable final Class2027 class2027, @NotNull @NotNull final Class2027[] array, @NotNull @NotNull final Class169 class2028, final int n, final int n2, final float n3, final float n4, final double n5) {
        Intrinsics.checkParameterIsNotNull((Object)array, "pulsiveColors");
        Intrinsics.checkParameterIsNotNull((Object)class2028, "type");
        final int n6 = n * n2;
        Class2027 class2029 = null;
        switch (Class171.Field8776[class2028.ordinal()]) {
            case 1: {
                class2029 = this.Method6460(n6, n3, n4, n5);
                break;
            }
            case 2: {
                class2029 = this.Method6459(n6, n3, n4, n5);
                break;
            }
            case 3: {
                class2029 = ((array.length == 2) ? this.Method6458(array[0], array[1], n6, n3, n4, n5) : new Class2027(255, 255, 255, 255));
                break;
            }
            case 4: {
                class2029 = class2027;
                if (class2027 != null) {
                    break;
                }
                class2029 = new Class2027(255, 255, 255, 255);
                break;
            }
            case 5: {
                class2029 = ((class2027 != null) ? this.Method6457(class2027, n6, n3, n4, n5) : new Class2027(255, 255, 255, 255));
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return class2029;
    }
    
    private final Class2027 Method6457(final Class2027 class2027, final int n, final float n2, final float n3, final double n4) {
        final double n5 = 11529L / n4;
        final Class2027 method3618 = Class2027.Method3618(class2027.Method3620(), (float)Class1047.Method4278(Math.abs(System.currentTimeMillis() % n5 / (n5 / 360) + n), (double)n3, 1.0), n2);
        Intrinsics.checkExpressionValueIsNotNull((Object)method3618, "Colour.fromHSB(\n        \u2026            sat\n        )");
        return method3618;
    }
    
    private final Class2027 Method6458(final Class2027 class2027, final Class2027 class2028, final int n, final float n2, final float n3, final double n4) {
        final double n5 = 11529L / n4;
        int n6 = (int)(System.currentTimeMillis() % n5 / (n5 / 360)) + n;
        if (n6 > 1) {
            final int n7 = n6 % 1;
            n6 = ((n6 % 2 == 0) ? n7 : (1 - n7));
        }
        // new(com.kisman.cc.util.Class2027.class)
        final int field17321 = class2027.Field17321;
        final int field17322 = class2028.Field17321;
        final int n8 = n6;
        final int n9 = field17322;
        final int n10 = field17321;
        return (Class2027)(n10 + (n9 - n10) * n8);
    }
    
    private final Class2027 Method6459(final int n, final float n2, final float n3, final double n4) {
        double n5;
        for (n5 = (float)(System.currentTimeMillis() % n4) + (1000 - n) * Double.longBitsToDouble((long)736539841 ^ 0x402200002BE6B4C1L); n5 > n4; n5 -= n4) {}
        double n6 = n5 / n4;
        if (n6 > Double.longBitsToDouble((long)2080359718 ^ 0x3FE000007BFFC526L)) {
            n6 = Float.intBitsToFloat(1056964608) - (n6 - Float.intBitsToFloat(1056964608));
        }
        final Class2027 method3618 = Class2027.Method3618((float)(n6 + Float.intBitsToFloat(1056964608)), n2, n3);
        Intrinsics.checkExpressionValueIsNotNull((Object)method3618, "Colour.fromHSB(hue.toFloat(), sat, bright)");
        return method3618;
    }
    
    private final Class2027 Method6460(final int n, final float n2, final float n3, final double n4) {
        final double n5 = 11529L / n4;
        int n6 = (int)(System.currentTimeMillis() % n5 / (n5 / 360)) + n;
        if (n6 > 360) {
            n6 -= 360;
        }
        final Class2027 method3618 = Class2027.Method3618(n6 / Float.intBitsToFloat(1135869952), n2 / 100, n3 / 100);
        Intrinsics.checkExpressionValueIsNotNull((Object)method3618, "Colour.fromHSB(hue / 360\u2026 sat / 100, bright / 100)");
        return method3618;
    }
    
    private Class1672() {
    }
    
    static {
        Field15802 = new Class1672();
    }
    
    private static String Method6461(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x48F1 ^ 0x5D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
