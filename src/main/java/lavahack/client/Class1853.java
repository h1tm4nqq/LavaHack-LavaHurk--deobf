/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class Class1853 {
    public static final String Field16536 = "schematicaList";
    private int Field16537;

    private static String Method6947(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0xCC7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

