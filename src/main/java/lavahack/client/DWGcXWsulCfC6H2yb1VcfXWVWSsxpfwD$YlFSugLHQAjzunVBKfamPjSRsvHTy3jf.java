/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/command/commands/UseCommand$Mode;", "", "(Ljava/lang/String;I)V", "BLOCK", "ENTITY", "kisman.cc"})
public final class DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10477;
    public static final /* enum */ DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field10478;
    private static final DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field10479;
    private String Field10480 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[((int)1424149077L ^ 0x54E2CA54) << 1];
        DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2 = dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1532942299 ^ (long)1532942299)] = Field10477 = new DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("BLOCK", (int)((long)1670339146 ^ (long)1670339146));
        dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)-1049904188L ^ 0xC16BBBC5] = Field10478 = new DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("ENTITY", (int)((long)-828626994 ^ (long)-828626993));
        Field10479 = dWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    public static DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field10479.clone();
    }

    public static DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(DWGcXWsulCfC6H2yb1VcfXWVWSsxpfwD$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    private static String Method2531(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1668680983L ^ 0x9C89F2E9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-453728045L ^ 0xE4F4A82C);
            int n2 = (int)((long)785484553 ^ (long)785484720);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)90929735 ^ (long)90922054) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

