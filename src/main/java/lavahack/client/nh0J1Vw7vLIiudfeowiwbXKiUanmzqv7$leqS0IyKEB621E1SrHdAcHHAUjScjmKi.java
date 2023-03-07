/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/player/AutoEat$Mode;", "", "(Ljava/lang/String;I)V", "Hunger", "Saturation", "kisman.cc"})
final class nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15843;
    public static final /* enum */ nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15844;
    private static final nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field15845;
    private int Field15846;

    static {
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-1705988101L ^ 0x9A50AFFA) << 1];
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray2 = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-177029635 ^ (long)-177029635)] = Field15843 = new nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Hunger", (int)((long)1184580816 ^ (long)1184580816));
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1248518033L ^ 0x4A6ADF90] = Field15844 = new nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Saturation", (int)((long)-1497099864 ^ (long)-1497099863));
        Field15845 = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    public static nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field15845.clone();
    }

    public static nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    private static String Method6493(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1049106293L ^ 0xC177E88B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)222739421 ^ (long)222739234);
            int n2 = ((int)282018996L ^ 0x10CF44BD) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)1160147069L ^ 0x452675D2) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

