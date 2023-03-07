/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends Enum {
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15570 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Place", (int)-242002341L ^ 0xF193565B);
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field15571 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV("Tick", (int)((long)-30445243 ^ (long)-30445244));
    private static final ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] Field15572;
    private int Field15573;

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] values() {
        return (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[])Field15572.clone();
    }

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV valueOf(String string) {
        return Enum.valueOf(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        void var2_-1;
        void var1_-1;
    }

    static {
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[] ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV[(int)((long)167532498 ^ (long)167532499) << 1];
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)151183655 ^ (long)151183655)] = Field15570;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray[(int)((long)-1631263030 ^ (long)-1631263029)] = Field15571;
        Field15572 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AVArray;
    }

    private static String Method6305(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)342210656 ^ (long)342210656);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-471545611L ^ 0xE3E4C80A);
            int n2 = (int)((long)519068826 ^ (long)519068811) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1531303192L ^ 0xA4BA3A79 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

