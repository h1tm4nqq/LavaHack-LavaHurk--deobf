/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi {
    public static final String Field13922;
    public static final String Field13923;
    public static final String Field13924;
    public static final String Field13925;
    private int Field13926;

    static {
        Field13925 = "schematica.message.invalidPropertyForBlock";
        Field13924 = "schematica.message.invalidProperty";
        Field13923 = "schematica.message.invalidBlock";
        Field13922 = "schematica.message.togglePrinter";
    }

    private static String Method5265(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)898660440 ^ (long)898660440);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)744285840 ^ (long)744285807);
            int n2 = (int)898591140L ^ 0x358F69B1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1741199028 ^ (long)-1741201063) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

