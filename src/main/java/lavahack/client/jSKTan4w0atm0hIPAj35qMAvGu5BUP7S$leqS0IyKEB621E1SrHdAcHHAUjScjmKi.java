/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15655 = new jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Torch", (int)1540769737L ^ 0x5BD647C9);
    public static final /* enum */ jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15656 = new jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Block", (int)-1019792476L ^ 0xC33733A5);
    private static final jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field15657;
    private int Field15658;

    public static jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15657.clone();
    }

    public static jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)826340315 ^ (long)826340314) << 1];
        jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1021594970L ^ 0x3CE44D5A] = Field15655;
        jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1642870147L ^ 0x9E13CA7C] = Field15656;
        Field15657 = jSKTan4w0atm0hIPAj35qMAvGu5BUP7S$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6389(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-572108764 ^ (long)-572108764);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-547121593 ^ (long)-547121480);
            int n2 = (int)((long)1669749535 ^ (long)1669749530) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-644293208 ^ (long)-644291815) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

