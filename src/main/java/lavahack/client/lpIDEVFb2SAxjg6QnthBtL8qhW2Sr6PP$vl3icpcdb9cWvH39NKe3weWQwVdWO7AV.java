/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11442 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("None", (int)((long)1860992147 ^ (long)1860992147));
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11443 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("MinMax", (int)1777870426L ^ 0x69F8265B);
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field11444 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Balance", (int)((long)-882805085 ^ (long)-882805086) << 1);
    private static final lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field11445;
    private int Field11446;

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field11445.clone();
    }

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)((long)-852775317 ^ (long)-852775320)];
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)2091441367L ^ 0x7CA8DCD7] = Field11442;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)-390646986L ^ 0xE8B73337] = Field11443;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)716315654 ^ (long)716315655) << 1] = Field11444;
        Field11445 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method3404(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)563477172 ^ (long)563477172);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1224792870L ^ 0x4900DBD9);
            int n2 = ((int)-197560046L ^ 0xF4397931) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)826477050L ^ 0x3143154B) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

