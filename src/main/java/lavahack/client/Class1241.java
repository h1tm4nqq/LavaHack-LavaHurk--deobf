/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class1241 {
    Field13625,
    Field13626,
    Field13627,
    Field13628,
    Field13629;

    private int Field13631;

    private static String Method4990(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 64;
            cArray2[n] = (char)(cArray[n] ^ (0x4ECC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

