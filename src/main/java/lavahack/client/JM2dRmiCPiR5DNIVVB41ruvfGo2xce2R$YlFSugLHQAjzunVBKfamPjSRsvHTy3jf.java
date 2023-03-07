/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9664 = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Closest", (int)482688770L ^ 0x1CC53F02);
    public static final /* enum */ JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field9665 = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("All", (int)-2001234587L ^ 0x88B79564);
    private static final JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field9666;
    private String Field9667 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field9666.clone();
    }

    public static JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new JM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-1957206639 ^ (long)-1957206640) << 1];
        jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-593532272 ^ (long)-593532272)] = Field9664;
        jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1554449108 ^ (long)-1554449107)] = Field9665;
        Field9666 = jM2dRmiCPiR5DNIVVB41ruvfGo2xce2R$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method1967(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)844596755L ^ 0x32578613;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1898163228L ^ 0x8EDC531B);
            int n2 = (int)1964334418L ^ 0x75155D53;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1650087539 ^ (long)-1650084370) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

