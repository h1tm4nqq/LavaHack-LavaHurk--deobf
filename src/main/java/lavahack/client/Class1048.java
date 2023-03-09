/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/RotationLogic;", "", "(Ljava/lang/String;I)V", "Default", "WellMore", "kisman.cc"})
public final class Class1048
extends Enum {
    public static final /* enum */ Class1048 Field12640;
    public static final /* enum */ Class1048 Field12641;
    private static final Class1048[] Field12642;
    private String Field12643 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1048[] class1048Array = new Class1048[2];
        Class1048[] class1048Array2 = class1048Array;
        class1048Array[0] = Field12640 = new Class1048("Default", 0);
        class1048Array[1] = Field12641 = new Class1048("WellMore", 1);
        Field12642 = class1048Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1048() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1048[] values() {
        return (Fzym2ppH3Dp5NmKdHeQc0MJ44rHAejrG[])Field12642.clone();
    }

    public static Class1048 valueOf(String string) {
        return Enum.valueOf(Class1048.class, string);
    }

    private static String Method4286(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 124;
            cArray2[n] = (char)(cArray[n] ^ (0x23A2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

