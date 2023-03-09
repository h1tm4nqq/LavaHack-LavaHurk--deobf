/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1829 {
    Field16446,
    Field16447;

    private int Field16449;

    private static String Method6887(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 90;
            cArray2[n] = (char)(cArray[n] ^ (0x7C4B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

