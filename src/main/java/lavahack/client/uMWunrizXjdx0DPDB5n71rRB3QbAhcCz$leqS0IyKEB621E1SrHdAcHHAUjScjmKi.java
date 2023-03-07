/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13918 = new uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("UNLOAD", (int)-1436406285L ^ 0xAA622DF3);
    public static final /* enum */ uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13919 = new uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("RELOAD", (int)((long)-1062918000 ^ (long)-1062917999));
    private static final uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field13920;
    private String Field13921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field13920.clone();
    }

    public static uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)951480317L ^ 0x38B66FFC) << 1];
        uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1020476527L ^ 0xC32CC391] = Field13918;
        uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-2057057143L ^ 0x8563CC88] = Field13919;
        Field13920 = uMWunrizXjdx0DPDB5n71rRB3QbAhcCz$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5264(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-692744762 ^ (long)-692744762);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-243207115 ^ (long)-243206966);
            int n2 = ((int)476399729L ^ 0x1C65485E) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)-45220514L ^ 0xFD4DFE0B) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

