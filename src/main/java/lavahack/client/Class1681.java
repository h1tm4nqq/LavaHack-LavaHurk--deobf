/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1681 {
    Field15821,
    Field15822,
    Field15823;

    private int Field15825;

    private static String Method6474(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 5;
            cArray2[n] = (char)(cArray[n] ^ (0xF05 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

