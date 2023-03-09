/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public enum Class2028 {
    Field17332,
    Field17333;

    private int Field17335;

    private static String Method7508(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 255;
            cArray2[n] = (char)(cArray[n] ^ (0x45FB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

