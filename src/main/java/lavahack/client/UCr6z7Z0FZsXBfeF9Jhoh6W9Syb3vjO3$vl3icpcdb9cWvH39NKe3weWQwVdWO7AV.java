/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field13648 = new UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Full", (int)859744636L ^ 0x333EA97C);
    public static final /* enum */ UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field13649 = new UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Head", (int)-462698436L ^ 0xE46BC83D);
    private static final UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field13650;
    private int Field13651;

    public static UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field13650.clone();
    }

    public static UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[((int)335818508L ^ 0x14042F0D) << 1];
        uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)-1374670858 ^ (long)-1374670858)] = Field13648;
        uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)-1246298374 ^ (long)-1246298373)] = Field13649;
        Field13650 = uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method5012(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1024914985L ^ 0xC2E909D7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1734399634 ^ (long)1734399597);
            int n2 = (int)((long)-1796842090 ^ (long)-1796842185);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1292996326 ^ (long)-1292995233) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

