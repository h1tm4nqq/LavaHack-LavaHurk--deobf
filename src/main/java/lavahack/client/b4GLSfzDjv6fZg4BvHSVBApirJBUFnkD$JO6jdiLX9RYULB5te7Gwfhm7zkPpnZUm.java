/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field9479 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("None", (int)((long)-1366797720 ^ (long)-1366797720));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field9480 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("Stupid", (int)-526665739L ^ 0xE09BB7F4);
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm Field9481 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm("Smart", (int)((long)-1701709609 ^ (long)-1701709610) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[] Field9482;
    private String Field9483 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[])Field9482.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm[(int)((long)422957637 ^ (long)422957638)];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)-1271642521L ^ 0xB4344667] = Field9479;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[(int)((long)-354376096 ^ (long)-354376095)] = Field9480;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray[((int)-1761416780L ^ 0x9702E9B5) << 1] = Field9481;
        Field9482 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUmArray;
    }

    private static String Method1789(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1940219076 ^ (long)1940219076);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2068251102 ^ (long)-2068250915);
            int n2 = (int)((long)1744539831 ^ (long)1744539780);
            cArray2[n] = (char)(cArray[n] ^ ((int)-177414466L ^ 0xF56C8BFD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

