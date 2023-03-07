/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15059 = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Tick", (int)-597886253L ^ 0xDC5CFAD3);
    public static final /* enum */ jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15060 = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Update", (int)-365131434L ^ 0xEA3C8957);
    private static final jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field15061;
    private String Field15062 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15061.clone();
    }

    public static jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1313475522 ^ (long)1313475523) << 1];
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-915101518 ^ (long)-915101518)] = Field15059;
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)833638780 ^ (long)833638781)] = Field15060;
        Field15061 = jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method6027(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-855590203 ^ (long)-855590203);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-248095658 ^ (long)-248095575);
            int n2 = (int)((long)1871852539 ^ (long)1871852516) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1201412612 ^ (long)1201414725) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

