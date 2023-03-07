/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi
extends Enum {
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi Field11035 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi("Adaptive", (int)93569421L ^ 0x593C18D);
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi Field11036 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi("Sequential", (int)((long)175749586 ^ (long)175749587));
    private static final AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] Field11037;
    private String Field11038 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] values() {
        return (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[])Field11037.clone();
    }

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi valueOf(String string) {
        return Enum.valueOf(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[] aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi[(int)((long)-1046504741 ^ (long)-1046504742) << 1];
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray[(int)-99140132L ^ 0xFA173DDC] = Field11035;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray[(int)1323099080L ^ 0x4EDCE3C9] = Field11036;
        Field11037 = aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yiArray;
    }

    private static String Method2979(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)799806620 ^ (long)799806620);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1221192064L ^ 0xB736167F);
            int n2 = (int)((long)1788797174 ^ (long)1788797179) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)114862169L ^ 0x6D886FC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

