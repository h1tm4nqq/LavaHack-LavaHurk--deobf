/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu Field17836 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu("None", (int)1869689663L ^ 0x6F71333F);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu Field17837 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu("Merge", (int)1293980860L ^ 0x4D2094BD);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu Field17838 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu("Strict", ((int)1449023757L ^ 0x565E590C) << 1);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu Field17839 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu("StrictFull", (int)((long)-1359174633 ^ (long)-1359174636));
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu[] Field17840;
    private String Field17841 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu[])Field17840.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8IamuArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8Iamu[((int)-999945334L ^ 0xC4660B8B) << 2];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8IamuArray[(int)((long)-660448268 ^ (long)-660448268)] = Field17836;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8IamuArray[(int)((long)515582507 ^ (long)515582506)] = Field17837;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8IamuArray[(int)((long)1861910219 ^ (long)1861910218) << 1] = Field17838;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8IamuArray[(int)-1517280919L ^ 0xA590216A] = Field17839;
        Field17840 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$AOGOereh29Orfn8LhjxmWQxXsft8IamuArray;
    }

    private static String Method7737(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1116356852L ^ 0x428A40F4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)149159925 ^ (long)149159690);
            int n2 = (int)((long)1390744862 ^ (long)1390744841);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-711862555 ^ (long)-711864544) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

