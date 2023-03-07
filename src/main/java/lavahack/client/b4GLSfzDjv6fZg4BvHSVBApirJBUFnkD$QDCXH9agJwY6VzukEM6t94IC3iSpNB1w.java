/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w
extends Enum {
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w Field7864 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w("None", (int)((long)1605122198 ^ (long)1605122198));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w Field7865 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w("AntiTotemFail", (int)((long)-999552119 ^ (long)-999552120));
    public static final /* enum */ b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w Field7866 = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w("AntiTotemPop", (int)((long)-535873062 ^ (long)-535873061) << 1);
    private static final b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w[] Field7867;
    private String Field7868 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w[] values() {
        return (b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w[])Field7867.clone();
    }

    public static b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w valueOf(String string) {
        return Enum.valueOf(b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w() {
        void var2_-1;
        void var1_-1;
    }

    static {
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w[] b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1wArray = new b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w[(int)261208230L ^ 0xF91B8A5];
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1wArray[(int)1585673694L ^ 0x5E8375DE] = Field7864;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1wArray[(int)((long)1106134550 ^ (long)1106134551)] = Field7865;
        b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1wArray[(int)((long)170114541 ^ (long)170114540) << 1] = Field7866;
        Field7867 = b4GLSfzDjv6fZg4BvHSVBApirJBUFnkD$QDCXH9agJwY6VzukEM6t94IC3iSpNB1wArray;
    }

    private static String Method139(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-496349501 ^ (long)-496349501);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-75972864 ^ (long)-75972609);
            int n2 = (int)((long)-73979886 ^ (long)-73979883) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1050546911 ^ (long)-1050558430) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

