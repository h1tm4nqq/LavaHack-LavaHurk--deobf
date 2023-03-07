/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/player/AutoEat$Swap;", "", "(Ljava/lang/String;I)V", "Normal", "Click", "kisman.cc"})
final class nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14850;
    public static final /* enum */ nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field14851;
    private static final nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field14852;
    private String Field14853 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-830728325 ^ (long)-830728326) << 1];
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2 = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1540041201 ^ (long)-1540041201)] = Field14850 = new nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Normal", (int)((long)539932047 ^ (long)539932047));
        nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-446920717 ^ (long)-446920718)] = Field14851 = new nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Click", (int)-1909443117L ^ 0x8E3035D2);
        Field14852 = nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    public static nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field14852.clone();
    }

    public static nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(nh0J1Vw7vLIiudfeowiwbXKiUanmzqv7$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    private static String Method5899(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-932816992 ^ (long)-932816992);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)830906772 ^ (long)830906731);
            int n2 = (int)((long)1231819082 ^ (long)1231819115);
            cArray2[n] = (char)(cArray[n] ^ (((int)327333570L ^ 0x1382B921) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

