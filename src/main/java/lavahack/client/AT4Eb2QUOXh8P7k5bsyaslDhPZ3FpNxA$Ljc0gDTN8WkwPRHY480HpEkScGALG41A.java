/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
extends Enum {
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field15734 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("Place", (int)-231638274L ^ 0xF2317AFE);
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field15735 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("RunSurround", (int)932491329L ^ 0x3794B040);
    private static final AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] Field15736;
    private String Field15737 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] values() {
        return (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[])Field15736.clone();
    }

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A valueOf(String string) {
        return Enum.valueOf(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A() {
        void var2_-1;
        void var1_-1;
    }

    static {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[((int)1538671281L ^ 0x5BB642B0) << 1];
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)((long)1884004762 ^ (long)1884004762)] = Field15734;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)((long)-2135930974 ^ (long)-2135930973)] = Field15735;
        Field15736 = aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray;
    }

    private static String Method6433(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1086639060 ^ (long)-1086639060);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2058052649 ^ (long)2058052822);
            int n2 = (int)-1765038629L ^ 0x96CBA5DA;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-371494185 ^ (long)-371498984) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

