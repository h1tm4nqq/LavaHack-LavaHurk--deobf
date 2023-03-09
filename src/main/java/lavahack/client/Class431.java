/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/CharmsRewriteModes;", "", "(Ljava/lang/String;I)V", "None", "Model", "Wire", "WireModel", "kisman.cc"})
public final class Class431
extends Enum {
    public static final /* enum */ Class431 Field9797;
    public static final /* enum */ Class431 Field9798;
    public static final /* enum */ Class431 Field9799;
    public static final /* enum */ Class431 Field9800;
    private static final Class431[] Field9801;
    private int Field9802;

    static {
        Class431[] class431Array = new Class431[4];
        Class431[] class431Array2 = class431Array;
        class431Array[0] = Field9797 = new Class431("None", 0);
        class431Array[1] = Field9798 = new Class431("Model", 1);
        class431Array[2] = Field9799 = new Class431("Wire", 2);
        class431Array[3] = Field9800 = new Class431("WireModel", 3);
        Field9801 = class431Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class431() {
        void var2_-1;
        void var1_-1;
    }

    public static Class431[] values() {
        return (Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq[])Field9801.clone();
    }

    public static Class431 valueOf(String string) {
        return Enum.valueOf(Class431.class, string);
    }

    private static String Method2062(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x4211 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

