/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class1296 {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 21;
            cArray2[n] = (char)(cArray[n] ^ (0x815 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

