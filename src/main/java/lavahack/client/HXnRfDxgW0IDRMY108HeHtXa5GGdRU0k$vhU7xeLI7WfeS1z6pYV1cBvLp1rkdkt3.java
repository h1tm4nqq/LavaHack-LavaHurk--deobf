/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 {
    public static final String Field14418 = "minecraft";
    private int Field14419;

    private static String Method5582(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-568855947 ^ (long)-568855947);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1371678260 ^ (long)1371678411);
            int n2 = (int)((long)1214535280 ^ (long)1214535267);
            cArray2[n] = (char)(cArray[n] ^ (((int)-438147693L ^ 0xE5E263AA) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

