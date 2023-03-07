/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/CharmsRewriteModes;", "", "(Ljava/lang/String;I)V", "None", "Model", "Wire", "WireModel", "kisman.cc"})
public final class Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq
extends Enum {
    public static final /* enum */ Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq Field9797;
    public static final /* enum */ Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq Field9798;
    public static final /* enum */ Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq Field9799;
    public static final /* enum */ Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq Field9800;
    private static final Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq[] Field9801;
    private int Field9802;

    static {
        Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq[] xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray = new Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq[(int)((long)-1626449240 ^ (long)-1626449239) << 2];
        Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq[] xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray2 = xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray;
        xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray[(int)((long)366858866 ^ (long)366858866)] = Field9797 = new Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq("None", (int)97955168L ^ 0x5D6AD60);
        xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray[(int)-688718082L ^ 0xD6F2FEFF] = Field9798 = new Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq("Model", (int)((long)1794212599 ^ (long)1794212598));
        xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray[(int)((long)980012396 ^ (long)980012397) << 1] = Field9799 = new Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq("Wire", (int)((long)-870329386 ^ (long)-870329385) << 1);
        xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray[(int)((long)-1240243635 ^ (long)-1240243634)] = Field9800 = new Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq("WireModel", (int)-88335427L ^ 0xFABC1BBE);
        Field9801 = xkakp9DHjZDQKLsssecFwFVgYTiZAqpqArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq() {
        void var2_-1;
        void var1_-1;
    }

    public static Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq[] values() {
        return (Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq[])Field9801.clone();
    }

    public static Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq valueOf(String string) {
        return Enum.valueOf(Xkakp9DHjZDQKLsssecFwFVgYTiZAqpq.class, string);
    }

    private static String Method2062(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1300677512 ^ (long)-1300677512);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)677672323 ^ (long)677672316);
            int n2 = (int)-227815094L ^ 0xF26BD1DF;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1324047821L ^ 0xB114E022 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

