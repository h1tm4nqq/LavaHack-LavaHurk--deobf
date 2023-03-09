/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

enum Class1377 {
    Field14244,
    Field14245,
    Field14246,
    Field14247,
    Field14248,
    Field14249;

    private int Field14251;

    private static String Method5480(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 28;
            cArray2[n] = (char)(cArray[n] ^ (0x238B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

