/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/EasingMode;", "", "(Ljava/lang/String;I)V", "Normal", "Reverse", "kisman.cc"})
public final class ItlMspXe4sYKo9sO7veaMUQwviMUhYJh
extends Enum {
    public static final /* enum */ ItlMspXe4sYKo9sO7veaMUQwviMUhYJh Field9762;
    public static final /* enum */ ItlMspXe4sYKo9sO7veaMUQwviMUhYJh Field9763;
    private static final ItlMspXe4sYKo9sO7veaMUQwviMUhYJh[] Field9764;
    private int Field9765;

    static {
        ItlMspXe4sYKo9sO7veaMUQwviMUhYJh[] itlMspXe4sYKo9sO7veaMUQwviMUhYJhArray = new ItlMspXe4sYKo9sO7veaMUQwviMUhYJh[((int)1788592040L ^ 0x6A9BBFA9) << 1];
        ItlMspXe4sYKo9sO7veaMUQwviMUhYJh[] itlMspXe4sYKo9sO7veaMUQwviMUhYJhArray2 = itlMspXe4sYKo9sO7veaMUQwviMUhYJhArray;
        itlMspXe4sYKo9sO7veaMUQwviMUhYJhArray[(int)-410420010L ^ 0xE7897CD6] = Field9762 = new ItlMspXe4sYKo9sO7veaMUQwviMUhYJh("Normal", (int)-594412918L ^ 0xDC91FA8A);
        itlMspXe4sYKo9sO7veaMUQwviMUhYJhArray[(int)1820749616L ^ 0x6C866F31] = Field9763 = new ItlMspXe4sYKo9sO7veaMUQwviMUhYJh("Reverse", (int)466748934L ^ 0x1BD20607);
        Field9764 = itlMspXe4sYKo9sO7veaMUQwviMUhYJhArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ItlMspXe4sYKo9sO7veaMUQwviMUhYJh() {
        void var2_-1;
        void var1_-1;
    }

    public static ItlMspXe4sYKo9sO7veaMUQwviMUhYJh[] values() {
        return (ItlMspXe4sYKo9sO7veaMUQwviMUhYJh[])Field9764.clone();
    }

    public static ItlMspXe4sYKo9sO7veaMUQwviMUhYJh valueOf(String string) {
        return Enum.valueOf(ItlMspXe4sYKo9sO7veaMUQwviMUhYJh.class, string);
    }

    private static String Method2052(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)906513278 ^ (long)906513278);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1541511240L ^ 0xA41E6747);
            int n2 = ((int)-1656634544L ^ 0x9D41C36F) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-975585534L ^ 0xC5D991A7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

