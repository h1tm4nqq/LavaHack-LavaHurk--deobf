/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/features/module/movement/AutoPacketFly$Stage;", "", "(Ljava/lang/String;I)V", "PrepareFly", "Jumping", "Fly", "PrepareTakeoff", "Takeoff", "kisman.cc"})
final class Class644
extends Enum {
    public static final /* enum */ Class644 Field10776;
    public static final /* enum */ Class644 Field10777;
    public static final /* enum */ Class644 Field10778;
    public static final /* enum */ Class644 Field10779;
    public static final /* enum */ Class644 Field10780;
    private static final Class644[] Field10781;
    private String Field10782 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class644[] class644Array = new Class644[5];
        Class644[] class644Array2 = class644Array;
        class644Array[0] = Field10776 = new Class644("PrepareFly", 0);
        class644Array[1] = Field10777 = new Class644("Jumping", 1);
        class644Array[2] = Field10778 = new Class644("Fly", 2);
        class644Array[3] = Field10779 = new Class644("PrepareTakeoff", 3);
        class644Array[4] = Field10780 = new Class644("Takeoff", 4);
        Field10781 = class644Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class644() {
        void var2_-1;
        void var1_-1;
    }

    public static Class644[] values() {
        return (xW8VpbIypqsz6D2Gg7OyFlP0GT4A2kX3.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10781.clone();
    }

    public static Class644 valueOf(String string) {
        return Enum.valueOf(Class644.class, string);
    }

    private static String Method2776(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x7883 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

