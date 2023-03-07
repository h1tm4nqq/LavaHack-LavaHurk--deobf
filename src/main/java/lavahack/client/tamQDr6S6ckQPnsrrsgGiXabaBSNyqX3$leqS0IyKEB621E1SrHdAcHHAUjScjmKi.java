/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9868 = new tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("LeftClick", (int)1189470164L ^ 0x46E5DFD4);
    public static final /* enum */ tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9869 = new tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("RightClick", (int)1043073509L ^ 0x3E2C09E4);
    public static final /* enum */ tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9870 = new tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("MiddleClick", (int)((long)-1621590377 ^ (long)-1621590378) << 1);
    private static final tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9871;
    private String Field9872 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field9871.clone();
    }

    public static tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-941367177L ^ 0xC7E3E074];
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-396517871L ^ 0xE85D9E11] = Field9868;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)642777641L ^ 0x26500228] = Field9869;
        tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)555861414L ^ 0x2121C5A7) << 1] = Field9870;
        Field9871 = tamQDr6S6ckQPnsrrsgGiXabaBSNyqX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2147(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-278362151 ^ (long)-278362151);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-271460892L ^ 0xEFD1D51B);
            int n2 = (int)((long)769173059 ^ (long)769173064) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-217916759L ^ 0xF302DEB0) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

