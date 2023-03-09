/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class2008;
import lavahack.client.k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/util/enums/RenderingRewriteModes;", "", "mode", "Lcom/kisman/cc/util/render/Rendering$Mode;", "(Ljava/lang/String;ILcom/kisman/cc/util/render/Rendering$Mode;)V", "getMode", "()Lcom/kisman/cc/util/render/Rendering$Mode;", "None", "Filled", "Outline", "Wire", "FilledOutline", "FilledWire", "FilledWireOutline", "WireOutline", "FilledGradient", "WireGradient", "OutlineGradient", "FilledOutlineGradient", "FilledWireGradient", "FilledWireOutlineGradient", "WireOutlineGradient", "kisman.cc"})
public final class Class786
extends Enum {
    public static final /* enum */ Class786 Field11308;
    public static final /* enum */ Class786 Field11309;
    public static final /* enum */ Class786 Field11310;
    public static final /* enum */ Class786 Field11311;
    public static final /* enum */ Class786 Field11312;
    public static final /* enum */ Class786 Field11313;
    public static final /* enum */ Class786 Field11314;
    public static final /* enum */ Class786 Field11315;
    public static final /* enum */ Class786 Field11316;
    public static final /* enum */ Class786 Field11317;
    public static final /* enum */ Class786 Field11318;
    public static final /* enum */ Class786 Field11319;
    public static final /* enum */ Class786 Field11320;
    public static final /* enum */ Class786 Field11321;
    public static final /* enum */ Class786 Field11322;
    private static final Class786[] Field11323;
    @Nullable
    private final Class2008 Field11324;
    private String Field11325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class786[] class786Array = new Class786[15];
        Class786[] class786Array2 = class786Array;
        class786Array[0] = Field11308 = new Class786("None", 0, null);
        class786Array[1] = Field11309 = new Class786("Filled", 1, Class2008.Field17212);
        class786Array[2] = Field11310 = new Class786("Outline", 2, Class2008.Field17211);
        class786Array[3] = Field11311 = new Class786("Wire", 3, Class2008.Field17213);
        class786Array[4] = Field11312 = new Class786("FilledOutline", 4, Class2008.Field17214);
        class786Array[5] = Field11313 = new Class786("FilledWire", 5, Class2008.Field17215);
        class786Array[6] = Field11314 = new Class786("FilledWireOutline", 6, Class2008.Field17217);
        class786Array[7] = Field11315 = new Class786("WireOutline", 7, Class2008.Field17216);
        class786Array[8] = Field11316 = new Class786("FilledGradient", 8, Class2008.Field17219);
        class786Array[9] = Field11317 = new Class786("WireGradient", 9, Class2008.Field17218);
        class786Array[10] = Field11318 = new Class786("OutlineGradient", 10, Class2008.Field17220);
        class786Array[11] = Field11319 = new Class786("FilledOutlineGradient", 11, Class2008.Field17221);
        class786Array[12] = Field11320 = new Class786("FilledWireGradient", 12, Class2008.Field17222);
        class786Array[13] = Field11321 = new Class786("FilledWireOutlineGradient", 13, Class2008.Field17224);
        class786Array[14] = Field11322 = new Class786("WireOutlineGradient", 14, Class2008.Field17223);
        Field11323 = class786Array;
    }

    @Nullable
    @Nullable
    public final Class2008 Method3273() {
        return this.Field11324;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class786() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field11324 = var3_1;
    }

    public static Class786[] values() {
        return (k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8[])Field11323.clone();
    }

    public static Class786 valueOf(String string) {
        return Enum.valueOf(Class786.class, string);
    }

    private static String Method3274(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x716 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

