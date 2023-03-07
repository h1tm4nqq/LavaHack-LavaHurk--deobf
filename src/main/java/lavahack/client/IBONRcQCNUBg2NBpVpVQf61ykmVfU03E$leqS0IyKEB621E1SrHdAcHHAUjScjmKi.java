/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16489 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Item", (int)-766093544L ^ 0xD2565718);
    public static final /* enum */ IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16490 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Armor", (int)1264016061L ^ 0x4B575ABC);
    private static final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field16491;
    private int Field16492;

    public static IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16491.clone();
    }

    public static IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] iBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1197656145 ^ (long)1197656144) << 1];
        iBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)767154205 ^ (long)767154205)] = Field16489;
        iBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)121662325 ^ (long)121662324)] = Field16490;
        Field16491 = iBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6934(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)614679498 ^ (long)614679498);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)904322678 ^ (long)904322697);
            int n2 = (int)((long)1117833395 ^ (long)1117833380) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)1476200298L ^ 0x57FD36AB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

