/*
 * Decompiled with CFR 0.152.
 */
package com.kisman.cc.event;

public final class Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13746 = new Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("PRE", (int)156800335L ^ 0x958954F);
    public static final /* enum */ Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13747 = new Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("POST", (int)((long)497856723 ^ (long)497856722));
    public static final /* enum */ Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field13748 = new Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("PERI", ((int)502166173L ^ 0x1DEE729C) << 1);
    private static final Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field13749;
    private String Field13750 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field13749.clone();
    }

    public static Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] event$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new Event$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-96337556L ^ 0xFA42016F];
        event$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-1398680432L ^ 0xACA1D490] = Field13746;
        event$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-211789894 ^ (long)-211789893)] = Field13747;
        event$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1764726270L ^ 0x692F95FF) << 1] = Field13748;
        Field13749 = event$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method5107(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-2017139399 ^ (long)-2017139399);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1861564028L ^ 0x6EF53683);
            int n2 = (int)-1800737537L ^ 0x94AAEC1E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)556000372 ^ (long)555999267) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

