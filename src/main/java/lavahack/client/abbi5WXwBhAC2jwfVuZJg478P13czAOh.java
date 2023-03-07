/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.abbi5WXwBhAC2jwfVuZJg478P13czAOh$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/GradientModes;", "", "(Ljava/lang/String;I)V", "None", "Rainbow", "Astolfo", "Pulsive", "Companion", "kisman.cc"})
public final class abbi5WXwBhAC2jwfVuZJg478P13czAOh
extends Enum {
    public static final /* enum */ abbi5WXwBhAC2jwfVuZJg478P13czAOh Field17489;
    public static final /* enum */ abbi5WXwBhAC2jwfVuZJg478P13czAOh Field17490;
    public static final /* enum */ abbi5WXwBhAC2jwfVuZJg478P13czAOh Field17491;
    public static final /* enum */ abbi5WXwBhAC2jwfVuZJg478P13czAOh Field17492;
    private static final abbi5WXwBhAC2jwfVuZJg478P13czAOh[] Field17493;
    public static final abbi5WXwBhAC2jwfVuZJg478P13czAOh$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field17494;
    private String Field17495 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        abbi5WXwBhAC2jwfVuZJg478P13czAOh[] abbi5WXwBhAC2jwfVuZJg478P13czAOhArray = new abbi5WXwBhAC2jwfVuZJg478P13czAOh[((int)-1308159586L ^ 0xB207119F) << 2];
        abbi5WXwBhAC2jwfVuZJg478P13czAOh[] abbi5WXwBhAC2jwfVuZJg478P13czAOhArray2 = abbi5WXwBhAC2jwfVuZJg478P13czAOhArray;
        abbi5WXwBhAC2jwfVuZJg478P13czAOhArray[(int)1191765207L ^ 0x4708E4D7] = Field17489 = new abbi5WXwBhAC2jwfVuZJg478P13czAOh("None", (int)415974119L ^ 0x18CB42E7);
        abbi5WXwBhAC2jwfVuZJg478P13czAOhArray[(int)643622194L ^ 0x265CE533] = Field17490 = new abbi5WXwBhAC2jwfVuZJg478P13czAOh("Rainbow", (int)((long)-1263458505 ^ (long)-1263458506));
        abbi5WXwBhAC2jwfVuZJg478P13czAOhArray[((int)-1269293979L ^ 0xB4581C64) << 1] = Field17491 = new abbi5WXwBhAC2jwfVuZJg478P13czAOh("Astolfo", (int)((long)1706256845 ^ (long)1706256844) << 1);
        abbi5WXwBhAC2jwfVuZJg478P13czAOhArray[(int)-380575802L ^ 0xE950DFC5] = Field17492 = new abbi5WXwBhAC2jwfVuZJg478P13czAOh("Pulsive", (int)-1054029279L ^ 0xC12CCA22);
        Field17493 = abbi5WXwBhAC2jwfVuZJg478P13czAOhArray;
        Field17494 = new abbi5WXwBhAC2jwfVuZJg478P13czAOh$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private abbi5WXwBhAC2jwfVuZJg478P13czAOh() {
        void var2_-1;
        void var1_-1;
    }

    public static abbi5WXwBhAC2jwfVuZJg478P13czAOh[] values() {
        return (abbi5WXwBhAC2jwfVuZJg478P13czAOh[])Field17493.clone();
    }

    public static abbi5WXwBhAC2jwfVuZJg478P13czAOh valueOf(String string) {
        return Enum.valueOf(abbi5WXwBhAC2jwfVuZJg478P13czAOh.class, string);
    }

    private static String Method7617(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1573951133 ^ (long)-1573951133);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1744330515 ^ (long)-1744330734);
            int n2 = (int)((long)-1796550039 ^ (long)-1796549934);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1124158078 ^ (long)1124166533) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

