/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/combat/CityBoss$MineMode;", "", "(Ljava/lang/String;I)V", "Client", "PacketMine", "kisman.cc"})
public final class xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14981;
    public static final /* enum */ xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14982;
    private static final xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field14983;
    private int Field14984;

    static {
        xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-668680680 ^ (long)-668680679) << 1];
        xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray2 = xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
        xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-930955550L ^ 0xC882BEE2] = Field14981 = new xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Client", (int)((long)470866311 ^ (long)470866311));
        xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)-483036886L ^ 0xE335712B] = Field14982 = new xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("PacketMine", (int)-1062674232L ^ 0xC0A8E0C9);
        Field14983 = xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var2_-1;
        void var1_-1;
    }

    public static xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field14983.clone();
    }

    public static xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(xVk847rc3gahDuDDNKNmNoHUF7beNjai$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    private static String Method5973(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)380427322 ^ (long)380427322);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1016937216 ^ (long)-1016936961);
            int n2 = (int)((long)1877847348 ^ (long)1877847357) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)2118211213L ^ 0x7E417AD6) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

