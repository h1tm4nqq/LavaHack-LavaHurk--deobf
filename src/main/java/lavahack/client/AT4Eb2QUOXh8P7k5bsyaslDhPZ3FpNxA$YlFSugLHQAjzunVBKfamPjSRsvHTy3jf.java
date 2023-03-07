/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10159 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Client", (int)((long)-1178587811 ^ (long)-1178587811));
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10160 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Packet", (int)((long)654050152 ^ (long)654050153));
    public static final /* enum */ AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10161 = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Both", (int)((long)-1119737827 ^ (long)-1119737828) << 1);
    private static final AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field10162;
    private String Field10163 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field10162.clone();
    }

    public static AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new AT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)-2120562258L ^ 0x819AC9AD];
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-1603745000L ^ 0xA068CB18] = Field10159;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1895637345 ^ (long)-1895637346)] = Field10160;
        aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)1672903648L ^ 0x63B67BE1) << 1] = Field10161;
        Field10162 = aT4Eb2QUOXh8P7k5bsyaslDhPZ3FpNxA$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method2365(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1697547475 ^ (long)1697547475);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1516910164 ^ (long)1516910251);
            int n2 = (int)((long)70789042 ^ (long)70788959);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1701601730 ^ (long)1701589291) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

