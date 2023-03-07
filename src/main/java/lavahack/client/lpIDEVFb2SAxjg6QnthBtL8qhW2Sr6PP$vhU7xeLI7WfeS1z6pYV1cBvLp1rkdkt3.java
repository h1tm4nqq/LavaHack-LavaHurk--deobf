/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3
extends Enum {
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 Field17498 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3("Adaptive", (int)((long)165426165 ^ (long)165426165));
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 Field17499 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3("Sequential", (int)((long)-1559298407 ^ (long)-1559298408));
    private static final lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[] Field17500;
    private String Field17501 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[] values() {
        return (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[])Field17500.clone();
    }

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3 valueOf(String string) {
        return Enum.valueOf(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[] lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3[(int)((long)483702379 ^ (long)483702378) << 1];
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array[(int)((long)-565464940 ^ (long)-565464940)] = Field17498;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array[(int)((long)-137765155 ^ (long)-137765156)] = Field17499;
        Field17500 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3Array;
    }

    private static String Method7618(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1909025032L ^ 0x8E3696F8;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-137293372L ^ 0xF7D1113B);
            int n2 = (int)((long)-259188523 ^ (long)-259188596);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1989052326 ^ (long)1989054957) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

