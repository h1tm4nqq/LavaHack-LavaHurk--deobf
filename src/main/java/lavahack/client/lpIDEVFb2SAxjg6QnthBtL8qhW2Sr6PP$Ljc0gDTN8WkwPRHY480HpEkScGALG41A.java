/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
extends Enum {
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field11089 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("Attack", (int)((long)1185459542 ^ (long)1185459542));
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A Field11090 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A("Confirm", (int)((long)2094580736 ^ (long)2094580737));
    private static final lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] Field11091;
    private int Field11092;

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] values() {
        return (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[])Field11091.clone();
    }

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A valueOf(String string) {
        return Enum.valueOf(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[] lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41A[(int)((long)2061651475 ^ (long)2061651474) << 1];
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)((long)-1298771137 ^ (long)-1298771137)] = Field11089;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray[(int)1078712066L ^ 0x404BD703] = Field11090;
        Field11091 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$Ljc0gDTN8WkwPRHY480HpEkScGALG41AArray;
    }

    private static String Method3045(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-888827037L ^ 0xCB059363;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1611353785 ^ (long)1611353670);
            int n2 = (int)-520113165L ^ 0xE0FFB3D0;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-914003740 ^ (long)-914004141) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

