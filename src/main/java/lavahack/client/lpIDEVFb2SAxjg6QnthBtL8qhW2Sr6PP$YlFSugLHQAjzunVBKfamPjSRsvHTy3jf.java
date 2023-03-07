/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16532 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("PlaceBreak", (int)((long)1601785667 ^ (long)1601785667));
    public static final /* enum */ lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field16533 = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("BreakPlace", (int)((long)-1412006106 ^ (long)-1412006105));
    private static final lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field16534;
    private int Field16535;

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field16534.clone();
    }

    public static lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-1494676736 ^ (long)-1494676735) << 1];
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)547392177L ^ 0x20A08AB1] = Field16532;
        lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-299469321 ^ (long)-299469322)] = Field16533;
        Field16534 = lpIDEVFb2SAxjg6QnthBtL8qhW2Sr6PP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method6946(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1510340593L ^ 0x5A05F7F1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1883950837 ^ (long)1883950602);
            int n2 = (int)1263756199L ^ 0x4B5363C6;
            cArray2[n] = (char)(cArray[n] ^ (((int)-665980307L ^ 0xD84DF488) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

