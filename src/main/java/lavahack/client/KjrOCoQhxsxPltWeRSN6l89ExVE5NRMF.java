/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SwingHands;", "", "(Ljava/lang/String;I)V", "MainHand", "OffHand", "PacketSwing", "kisman.cc"})
public final class KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF
extends Enum {
    public static final /* enum */ KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF Field17156;
    public static final /* enum */ KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF Field17157;
    public static final /* enum */ KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF Field17158;
    private static final KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF[] Field17159;
    private int Field17160;

    static {
        KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF[] kjrOCoQhxsxPltWeRSN6l89ExVE5NRMFArray = new KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF[(int)-1958192073L ^ 0x8B485C34];
        KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF[] kjrOCoQhxsxPltWeRSN6l89ExVE5NRMFArray2 = kjrOCoQhxsxPltWeRSN6l89ExVE5NRMFArray;
        kjrOCoQhxsxPltWeRSN6l89ExVE5NRMFArray[(int)((long)-2035643683 ^ (long)-2035643683)] = Field17156 = new KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF("MainHand", (int)1011626759L ^ 0x3C4C3307);
        kjrOCoQhxsxPltWeRSN6l89ExVE5NRMFArray[(int)((long)876197307 ^ (long)876197306)] = Field17157 = new KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF("OffHand", (int)((long)-1517326878 ^ (long)-1517326877));
        kjrOCoQhxsxPltWeRSN6l89ExVE5NRMFArray[(int)((long)-1326558917 ^ (long)-1326558918) << 1] = Field17158 = new KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF("PacketSwing", (int)((long)-451560253 ^ (long)-451560254) << 1);
        Field17159 = kjrOCoQhxsxPltWeRSN6l89ExVE5NRMFArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF() {
        void var2_-1;
        void var1_-1;
    }

    public static KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF[] values() {
        return (KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF[])Field17159.clone();
    }

    public static KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF valueOf(String string) {
        return Enum.valueOf(KjrOCoQhxsxPltWeRSN6l89ExVE5NRMF.class, string);
    }

    private static String Method7394(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)154296562 ^ (long)154296562);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1919826339 ^ (long)1919826268);
            int n2 = (int)((long)-812856852 ^ (long)-812857057);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)445388948 ^ (long)445393137) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

