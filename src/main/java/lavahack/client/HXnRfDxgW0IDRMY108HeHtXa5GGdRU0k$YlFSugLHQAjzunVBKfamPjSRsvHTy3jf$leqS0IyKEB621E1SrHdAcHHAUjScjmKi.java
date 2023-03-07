/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class HXnRfDxgW0IDRMY108HeHtXa5GGdRU0k$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    public static final String Field16818;
    public static final String Field16819;
    public static final String Field16820;
    public static final String Field16821;
    public static final String Field16822;
    public static final String Field16823;
    private String Field16824 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Field16823 = "server";
        Field16822 = "general";
        Field16821 = "printer.swapslots";
        Field16820 = "printer";
        Field16819 = "render";
        Field16818 = "debug";
    }

    private static String Method7098(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)565257871 ^ (long)565257871);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)396868707L ^ 0x17A7BC9C);
            int n2 = ((int)1392251800L ^ 0x52FC13A9) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1917450780L ^ 0x7249FE99) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

