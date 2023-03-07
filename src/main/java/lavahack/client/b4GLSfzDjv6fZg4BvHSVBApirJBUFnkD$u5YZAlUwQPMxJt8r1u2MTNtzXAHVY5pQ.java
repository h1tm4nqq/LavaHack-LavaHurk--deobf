/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ Field12586 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ("None", (int)((long)1259001435 ^ (long)1259001435));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ Field12587 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ("Pool", (int)-1893756026L ^ 0x8F1F9387);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ Field12588 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ("Sound", ((int)2054402868L ^ 0x7A73B335) << 1);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ Field12589 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ("While", (int)336623604L ^ 0x141077F7);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ[] Field12590;
    private int Field12591;

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ[])Field12590.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQ[((int)-263390937L ^ 0xF04CF926) << 2];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQArray[(int)((long)738035326 ^ (long)738035326)] = Field12586;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQArray[(int)((long)-583227657 ^ (long)-583227658)] = Field12587;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQArray[(int)((long)408601317 ^ (long)408601316) << 1] = Field12588;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQArray[(int)((long)-1314761811 ^ (long)-1314761810)] = Field12589;
        Field12590 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$u5YZAlUwQPMxJt8r1u2MTNtzXAHVY5pQArray;
    }

    private static String Method4251(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-534517793 ^ (long)-534517793);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1322946716L ^ 0xB1256F9B);
            int n2 = (int)((long)177073604 ^ (long)177073419);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1344715911 ^ (long)-1344706196) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

