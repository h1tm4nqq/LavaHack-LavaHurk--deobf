/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS {
    public static final String Field17766 = "schematicaSave";
    private String Field17767 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private static String Method7704(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1842869696L ^ 0x6DD7F5C0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)164147976L ^ 0x9C8B3F7);
            int n2 = (int)((long)-1283476937 ^ (long)-1283476882);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1785568700 ^ (long)-1785566339) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

