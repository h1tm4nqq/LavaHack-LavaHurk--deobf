/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.loader.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR
 */
package lavahack.loader;

import kotlin.Metadata;
import lavahack.loader.QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/Role;", "", "(Ljava/lang/String;I)V", "CLIENT", "SERVER", "kisman.cc"})
public final class Class700
extends Enum {
    public static final /* enum */ Class700 Field10968;
    public static final /* enum */ Class700 Field10969;
    private static final Class700[] Field10970;
    private String Field10971 = "TheKisDevs & LavaHack Development owns you";

    static {
        Class700[] class700Array = new Class700[2];
        Class700[] class700Array2 = class700Array;
        class700Array[0] = Field10968 = new Class700("CLIENT", 0);
        class700Array[1] = Field10969 = new Class700("SERVER", 1);
        Field10970 = class700Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class700() {
        void var2_-1;
        void var1_-1;
    }

    public static Class700[] values() {
        return (QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR[])Field10970.clone();
    }

    public static Class700 valueOf(String string) {
        return Enum.valueOf(Class700.class, string);
    }

    private static String Method2923(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 150;
            cArray2[n] = (char)(cArray[n] ^ (0x7EBD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

