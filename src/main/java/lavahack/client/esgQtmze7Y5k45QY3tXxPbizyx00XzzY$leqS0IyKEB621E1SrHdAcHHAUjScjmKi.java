/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

final class esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11386 = new esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Tick", (int)((long)-1734008597 ^ (long)-1734008597));
    public static final /* enum */ esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field11387 = new esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Update", (int)((long)-87241483 ^ (long)-87241484));
    private static final esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field11388;
    private String Field11389 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field11388.clone();
    }

    public static esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-897677606L ^ 0xCA7E86DB) << 1];
        esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-890061239L ^ 0xCAF2BE49] = Field11386;
        esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1118479146L ^ 0x42AAA32B] = Field11387;
        Field11388 = esgQtmze7Y5k45QY3tXxPbizyx00XzzY$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method3312(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2077540378L ^ 0x842B3FE6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1131490158 ^ (long)1131490193);
            int n2 = (int)313335822L ^ 0x12AD2043;
            cArray2[n] = (char)(cArray[n] ^ ((int)1069892048L ^ 0x3FC50115 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

