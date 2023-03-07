/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/Rotations;", "", "(Ljava/lang/String;I)V", "Client", "Packet", "kisman.cc"})
public final class teHGsWNMfak8q0vZAzzUvn920xzQ8my5
extends Enum {
    public static final /* enum */ teHGsWNMfak8q0vZAzzUvn920xzQ8my5 Field12046;
    public static final /* enum */ teHGsWNMfak8q0vZAzzUvn920xzQ8my5 Field12047;
    private static final teHGsWNMfak8q0vZAzzUvn920xzQ8my5[] Field12048;
    private String Field12049 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        teHGsWNMfak8q0vZAzzUvn920xzQ8my5[] teHGsWNMfak8q0vZAzzUvn920xzQ8my5Array = new teHGsWNMfak8q0vZAzzUvn920xzQ8my5[((int)-492558396L ^ 0xE2A427C5) << 1];
        teHGsWNMfak8q0vZAzzUvn920xzQ8my5[] teHGsWNMfak8q0vZAzzUvn920xzQ8my5Array2 = teHGsWNMfak8q0vZAzzUvn920xzQ8my5Array;
        teHGsWNMfak8q0vZAzzUvn920xzQ8my5Array[(int)((long)-140378986 ^ (long)-140378986)] = Field12046 = new teHGsWNMfak8q0vZAzzUvn920xzQ8my5("Client", (int)((long)-984287779 ^ (long)-984287779));
        teHGsWNMfak8q0vZAzzUvn920xzQ8my5Array[(int)((long)1582135433 ^ (long)1582135432)] = Field12047 = new teHGsWNMfak8q0vZAzzUvn920xzQ8my5("Packet", (int)((long)-702711222 ^ (long)-702711221));
        Field12048 = teHGsWNMfak8q0vZAzzUvn920xzQ8my5Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private teHGsWNMfak8q0vZAzzUvn920xzQ8my5() {
        void var2_-1;
        void var1_-1;
    }

    public static teHGsWNMfak8q0vZAzzUvn920xzQ8my5[] values() {
        return (teHGsWNMfak8q0vZAzzUvn920xzQ8my5[])Field12048.clone();
    }

    public static teHGsWNMfak8q0vZAzzUvn920xzQ8my5 valueOf(String string) {
        return Enum.valueOf(teHGsWNMfak8q0vZAzzUvn920xzQ8my5.class, string);
    }

    private static String Method3913(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)59773886 ^ (long)59773886);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-525827663 ^ (long)-525827762);
            int n2 = (int)((long)1104845750 ^ (long)1104845759) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)-426246822L ^ 0xE697EFFB) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

