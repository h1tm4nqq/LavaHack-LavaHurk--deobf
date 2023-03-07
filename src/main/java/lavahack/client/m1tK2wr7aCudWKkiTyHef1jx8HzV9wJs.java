/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/ChromaColorTypes;", "", "(Ljava/lang/String;I)V", "Rainbow", "Astolfo", "Pulsive", "Fade", "Static", "kisman.cc"})
public final class m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs
extends Enum {
    public static final /* enum */ m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs Field8718;
    public static final /* enum */ m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs Field8719;
    public static final /* enum */ m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs Field8720;
    public static final /* enum */ m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs Field8721;
    public static final /* enum */ m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs Field8722;
    private static final m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs[] Field8723;
    private String Field8724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs[] m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray = new m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs[(int)124722077L ^ 0x76F1B98];
        m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs[] m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray2 = m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray;
        m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray[(int)((long)-178252682 ^ (long)-178252682)] = Field8718 = new m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs("Rainbow", (int)-1196152476L ^ 0xB8B42964);
        m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray[(int)-1908820629L ^ 0x8E39B56A] = Field8719 = new m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs("Astolfo", (int)((long)697438797 ^ (long)697438796));
        m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray[((int)921732321L ^ 0x36F084E0) << 1] = Field8720 = new m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs("Pulsive", (int)((long)590171827 ^ (long)590171826) << 1);
        m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray[(int)((long)-534229576 ^ (long)-534229573)] = Field8721 = new m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs("Fade", (int)97813037L ^ 0x5D4822E);
        m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray[(int)((long)463873794 ^ (long)463873795) << 2] = Field8722 = new m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs("Static", (int)((long)-1571135922 ^ (long)-1571135921) << 2);
        Field8723 = m1tK2wr7aCudWKkiTyHef1jx8HzV9wJsArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs() {
        void var2_-1;
        void var1_-1;
    }

    public static m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs[] values() {
        return (m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs[])Field8723.clone();
    }

    public static m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs valueOf(String string) {
        return Enum.valueOf(m1tK2wr7aCudWKkiTyHef1jx8HzV9wJs.class, string);
    }

    private static String Method1069(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)711026254L ^ 0x2A61664E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1980993811L ^ 0x761391EC);
            int n2 = (int)((long)-650663265 ^ (long)-650663382);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-229328863 ^ (long)-229329534) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

