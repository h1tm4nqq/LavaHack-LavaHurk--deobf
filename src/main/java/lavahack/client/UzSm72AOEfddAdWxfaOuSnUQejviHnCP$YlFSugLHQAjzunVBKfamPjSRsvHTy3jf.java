/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public final class UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8354 = new UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Normal", (int)-636250034L ^ 0xDA13984E);
    public static final /* enum */ UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8355 = new UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("Silent", (int)1682739201L ^ 0x644C9000);
    private static final UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field8356;
    private String Field8357 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field8356.clone();
    }

    public static UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    static {
        UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] uzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new UzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)1322797357 ^ (long)1322797356) << 1];
        uzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1829416330 ^ (long)-1829416330)] = Field8354;
        uzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1071427275 ^ (long)1071427274)] = Field8355;
        Field8356 = uzSm72AOEfddAdWxfaOuSnUQejviHnCP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    private static String Method814(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1748022095 ^ (long)1748022095);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)354007672L ^ 0x1519BA87);
            int n2 = (int)255375450L ^ 0xF38B8DF;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1129037528 ^ (long)1129032239) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

