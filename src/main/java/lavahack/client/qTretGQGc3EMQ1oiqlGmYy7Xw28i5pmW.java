/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/enums/FontStyles;", "", "style", "", "(Ljava/lang/String;II)V", "getStyle", "()I", "Plain", "Bold", "Italic", "Both", "kisman.cc"})
public final class qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW
extends Enum {
    public static final /* enum */ qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW Field15543;
    public static final /* enum */ qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW Field15544;
    public static final /* enum */ qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW Field15545;
    public static final /* enum */ qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW Field15546;
    private static final qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW[] Field15547;
    private final int Field15548;
    private String Field15549 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW[] qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray = new qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW[((int)1536407025L ^ 0x5B93B5F0) << 2];
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW[] qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray2 = qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray;
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray[(int)1868434019L ^ 0x6F5E0A63] = Field15543 = new qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW("Plain", (int)-300534906L ^ 0xEE163386, (int)-330634490L ^ 0xEC4AEB06);
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray[(int)((long)-1079854584 ^ (long)-1079854583)] = Field15544 = new qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW("Bold", (int)((long)-1279945974 ^ (long)-1279945973), (int)((long)206313290 ^ (long)206313291));
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray[(int)((long)1853561862 ^ (long)1853561863) << 1] = Field15545 = new qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW("Italic", ((int)-792458358L ^ 0xD0C40B8B) << 1, ((int)1302464939L ^ 0x4DA209AA) << 1);
        qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray[(int)1215485533L ^ 0x4872D65E] = Field15546 = new qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW("Both", (int)-2092507837L ^ 0x8346DD40, (int)((long)-2047466192 ^ (long)-2047466189));
        Field15547 = qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmWArray;
    }

    public final int Method6280() {
        return this.Field15548;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field15548 = var3_1;
    }

    public static qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW[] values() {
        return (qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW[])Field15547.clone();
    }

    public static qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW valueOf(String string) {
        return Enum.valueOf(qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW.class, string);
    }

    private static String Method6281(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)300225192L ^ 0x11E512A8;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1612672389 ^ (long)-1612672380);
            int n2 = ((int)-2102695004L ^ 0x82AB6BAB) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)0x1177E771L ^ 0x1177F954 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

