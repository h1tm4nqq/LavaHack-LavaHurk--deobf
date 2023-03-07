/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10963 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("TELEPORT", (int)((long)-401997353 ^ (long)-401997353));
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10964 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("MOTION", (int)((long)107290643 ^ (long)107290642));
    public static final /* enum */ NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10965 = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("NONE", (int)((long)-1134017562 ^ (long)-1134017561) << 1);
    private static final NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10966;
    private String Field10967 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10966.clone();
    }

    public static NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    static {
        NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] nngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new NngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-1508073193L ^ 0xA61CA114];
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)2116251203L ^ 0x7E236E43] = Field10963;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)626286577 ^ (long)626286576)] = Field10964;
        nngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)840985215L ^ 0x32206A7E) << 1] = Field10965;
        Field10966 = nngmEdjNl53Us2u9hWse9UOOf9hW7o97$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2922(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1799400145 ^ (long)1799400145);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1282993778L ^ 0x4C78EE8D);
            int n2 = (int)-890420010L ^ 0xCAED44E1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)328921873 ^ (long)328919130) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

