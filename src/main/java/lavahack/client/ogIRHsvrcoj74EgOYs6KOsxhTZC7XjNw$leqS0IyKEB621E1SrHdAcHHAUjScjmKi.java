/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10536 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("None", (int)((long)2112018444 ^ (long)2112018444));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10537 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Tick", (int)224583441L ^ 0xD62DF10);
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10538 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("DelayMS", (int)((long)1678036335 ^ (long)1678036334) << 1);
    private static final ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10539;
    private int Field10540;

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10539.clone();
    }

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1435790292 ^ (long)1435790295)];
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)882707858 ^ (long)882707858)] = Field10536;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)2039269401 ^ (long)2039269400)] = Field10537;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1904703387 ^ (long)1904703386) << 1] = Field10538;
        Field10539 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2580(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1671221748L ^ 0x9C632E0C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)580266754 ^ (long)580267005);
            int n2 = (int)((long)-662269601 ^ (long)-662269656) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1012154247L ^ 0xC3ABF420 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

