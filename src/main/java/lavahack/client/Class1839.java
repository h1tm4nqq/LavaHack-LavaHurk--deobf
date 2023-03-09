/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1839 {
    Field16489,
    Field16490;

    private int Field16492;

    private static String Method6934(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 184;
            cArray2[n] = (char)(cArray[n] ^ (0x31C1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

