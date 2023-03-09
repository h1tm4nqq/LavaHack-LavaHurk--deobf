/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/movement/AutoPacketFly$TakeoffLogic;", "", "(Ljava/lang/String;I)V", "PacketFlyState", "FactorValue", "kisman.cc"})
final class Class2091
extends Enum {
    public static final /* enum */ Class2091 Field17542;
    public static final /* enum */ Class2091 Field17543;
    private static final Class2091[] Field17544;
    private int Field17545;

    static {
        Class2091[] class2091Array = new Class2091[2];
        Class2091[] class2091Array2 = class2091Array;
        class2091Array[0] = Field17542 = new Class2091("PacketFlyState", 0);
        class2091Array[1] = Field17543 = new Class2091("FactorValue", 1);
        Field17544 = class2091Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class2091() {
        void var2_-1;
        void var1_-1;
    }

    public static Class2091[] values() {
        return (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field17544.clone();
    }

    public static Class2091 valueOf(String string) {
        return Enum.valueOf(Class2091.class, string);
    }

    private static String Method7631(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 52;
            cArray2[n] = (char)(cArray[n] ^ (0x64E6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

