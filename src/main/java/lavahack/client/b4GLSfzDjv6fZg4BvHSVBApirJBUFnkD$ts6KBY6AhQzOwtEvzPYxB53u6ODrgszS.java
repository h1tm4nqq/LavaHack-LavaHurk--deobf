/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field15744 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("Break", (int)((long)594452703 ^ (long)594452703));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field15745 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("Place", (int)((long)-85416010 ^ (long)-85416009));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS Field15746 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS("Sound", ((int)-752225731L ^ 0xD329F23C) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] Field15747;
    private String Field15748 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[])Field15747.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS[(int)-1592343047L ^ 0xA116C5FA];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)((long)-899313529 ^ (long)-899313529)] = Field15744;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)875024271L ^ 0x3427CF8E] = Field15745;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray[(int)((long)-1180986248 ^ (long)-1180986247) << 1] = Field15746;
        Field15747 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszSArray;
    }

    private static String Method6434(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1868323746 ^ (long)1868323746);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-301054927L ^ 0xEE0E44CE);
            int n2 = (int)((long)-441814087 ^ (long)-441814160);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1149540771 ^ (long)1149546782) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

