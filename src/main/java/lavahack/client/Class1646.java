/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1646 {
    Field15655,
    Field15656;

    private int Field15658;

    private static String Method6389(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 10;
            cArray2[n] = (char)(cArray[n] ^ (0x3EB1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

