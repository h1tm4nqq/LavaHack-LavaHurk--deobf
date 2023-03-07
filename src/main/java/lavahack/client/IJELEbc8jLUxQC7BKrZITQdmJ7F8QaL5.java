/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/BurrowStages;", "", "(Ljava/lang/String;I)V", "Centering", "PreparePlacing", "Placing", "Clipping", "Burrowing", "kisman.cc"})
public final class IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5
extends Enum {
    public static final /* enum */ IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5 Field14299;
    public static final /* enum */ IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5 Field14300;
    public static final /* enum */ IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5 Field14301;
    public static final /* enum */ IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5 Field14302;
    public static final /* enum */ IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5 Field14303;
    private static final IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5[] Field14304;
    private String Field14305 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5[] iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array = new IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5[(int)((long)-505147557 ^ (long)-505147554)];
        IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5[] iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array2 = iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array;
        iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array[(int)((long)-1313598492 ^ (long)-1313598492)] = Field14299 = new IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5("Centering", (int)((long)-729200756 ^ (long)-729200756));
        iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array[(int)-1945300044L ^ 0x8C0D13B5] = Field14300 = new IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5("PreparePlacing", (int)((long)1480169405 ^ (long)1480169404));
        iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array[((int)801412380L ^ 0x2FC4951D) << 1] = Field14301 = new IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5("Placing", ((int)601830115L ^ 0x23DF32E2) << 1);
        iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array[(int)((long)-53591598 ^ (long)-53591599)] = Field14302 = new IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5("Clipping", (int)((long)-87003819 ^ (long)-87003818));
        iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array[(int)((long)1792946006 ^ (long)1792946007) << 2] = Field14303 = new IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5("Burrowing", (int)((long)191133201 ^ (long)191133200) << 2);
        Field14304 = iJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5() {
        void var2_-1;
        void var1_-1;
    }

    public static IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5[] values() {
        return (IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5[])Field14304.clone();
    }

    public static IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5 valueOf(String string) {
        return Enum.valueOf(IJELEbc8jLUxQC7BKrZITQdmJ7F8QaL5.class, string);
    }

    private static String Method5498(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2042045415L ^ 0x8648DC19;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)269610611 ^ (long)269610636);
            int n2 = (int)((long)327815152 ^ (long)327815149);
            cArray2[n] = (char)(cArray[n] ^ ((int)1046142840L ^ 0x3E5A8593 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

