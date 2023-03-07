/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/movement/AutoPacketFly$TakeoffLogic;", "", "(Ljava/lang/String;I)V", "PacketFlyState", "FactorValue", "kisman.cc"})
final class xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends Enum {
    public static final /* enum */ xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17542;
    public static final /* enum */ xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field17543;
    private static final xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field17544;
    private int Field17545;

    static {
        xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[((int)1913818397L ^ 0x72128D1C) << 1];
        xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray2 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1403034185 ^ (long)1403034185)] = Field17542 = new xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("PacketFlyState", (int)1196118737L ^ 0x474B52D1);
        xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)2095613150L ^ 0x7CE884DF] = Field17543 = new xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf("FactorValue", (int)((long)1145794550 ^ (long)1145794551));
        Field17544 = xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        void var2_-1;
        void var1_-1;
    }

    public static xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] values() {
        return (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field17544.clone();
    }

    public static xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf valueOf(String string) {
        return Enum.valueOf(xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.class, string);
    }

    private static String Method7631(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-594359344L ^ 0xDC92CBD0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)517289721L ^ 0x1ED53606);
            int n2 = (int)((long)-1383184418 ^ (long)-1383184429) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1159761308 ^ (long)1159774191) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

