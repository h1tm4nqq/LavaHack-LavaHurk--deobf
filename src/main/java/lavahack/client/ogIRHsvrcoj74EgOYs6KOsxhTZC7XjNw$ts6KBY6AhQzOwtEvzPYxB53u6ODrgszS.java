/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends Enum {
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field8249 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("BeforeSwap", (int)((long)-1127276731 ^ (long)-1127276731));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field8250 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("AfterSwap", (int)-674724854L ^ 0xD7C8840B);
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field8251 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("Both", ((int)1727786226L ^ 0x66FBECF3) << 1);
    private static final ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] Field8252;
    private String Field8253 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] values() {
        return (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[])Field8252.clone();
    }

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS valueOf(String string) {
        return Enum.valueOf(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
        void var2_-1;
        void var1_-1;
    }

    static {
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[(int)((long)1208777208 ^ (long)1208777211)];
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)-2099468445L ^ 0x82DCA763] = Field8249;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)-1325415440L ^ 0xB0FFC3F1] = Field8250;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)((long)731878814 ^ (long)731878815) << 1] = Field8251;
        Field8252 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray;
    }

    private static String Method667(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-165344908L ^ 0xF6250974;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1080845686L ^ 0x406C6589);
            int n2 = (int)((long)-2123817932 ^ (long)-2123817909);
            cArray2[n] = (char)(cArray[n] ^ (((int)1663109740L ^ 0x63212227) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

