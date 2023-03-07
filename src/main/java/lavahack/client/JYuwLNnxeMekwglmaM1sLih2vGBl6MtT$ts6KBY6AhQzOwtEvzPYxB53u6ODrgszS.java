/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends Enum {
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field13608 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("None", (int)805738855L ^ 0x30069967);
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field13609 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("Vanilla", (int)886704040L ^ 0x34DA07A9);
    public static final /* enum */ JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field13610 = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("NCP", (int)((long)1621838902 ^ (long)1621838903) << 1);
    private static final JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] Field13611;
    private String Field13612 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] values() {
        return (JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[])Field13611.clone();
    }

    public static JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS valueOf(String string) {
        return Enum.valueOf(JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
        void var2_-1;
        void var1_-1;
    }

    static {
        JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray = new JYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[(int)((long)506432600 ^ (long)506432603)];
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)((long)-1097525089 ^ (long)-1097525089)] = Field13608;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)((long)1929233113 ^ (long)1929233112)] = Field13609;
        jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)((long)-190430507 ^ (long)-190430508) << 1] = Field13610;
        Field13611 = jYuwLNnxeMekwglmaM1sLih2vGBl6MtT$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray;
    }

    private static String Method4964(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1798648097L ^ 0x94CACEDF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-226919791 ^ (long)-226919826);
            int n2 = (int)-1461260949L ^ 0xA8E6ED3E;
            cArray2[n] = (char)(cArray[n] ^ ((int)1736221957L ^ 0x677CE18C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

