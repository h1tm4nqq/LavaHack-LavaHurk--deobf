/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17364 = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Off", (int)((long)-1803176496 ^ (long)-1803176496));
    public static final /* enum */ WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17365 = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("In", (int)-445246312L ^ 0xE5761499);
    public static final /* enum */ WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17366 = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Out", ((int)-505483516L ^ 0xE1DEEF05) << 1);
    private static final WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field17367;
    private String Field17368 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field17367.clone();
    }

    public static WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new WPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)2003801278L ^ 0x776F94BD];
        wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1984354204L ^ 0x7646D79C] = Field17364;
        wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1924629349 ^ (long)1924629348)] = Field17365;
        wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)1671310433L ^ 0x639E2C60) << 1] = Field17366;
        Field17367 = wPAgsEf5L7CnCPVs7GR3y4q4AkWIIVXf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method7532(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1089366808L ^ 0x40EE6B18;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1581043430 ^ (long)1581043225);
            int n2 = (int)((long)95387863 ^ (long)95387870) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)500980408 ^ (long)500984645) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

