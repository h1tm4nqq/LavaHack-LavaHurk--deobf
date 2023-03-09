/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class104 {
    Field8365,
    Field8366,
    Field8367;

    private int Field8369;

    private static String Method818(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 247;
            cArray2[n] = (char)(cArray[n] ^ (0x754F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

