/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/PingBypassProtocol;", "", "(Ljava/lang/String;I)V", "Legacy", "New", "kisman.cc"})
public final class PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77
extends Enum {
    public static final /* enum */ PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77 Field17037;
    public static final /* enum */ PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77 Field17038;
    private static final PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77[] Field17039;
    private String Field17040 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77[] pUEvqz0Yhx2nMzEMkA760LC8xbWmYt77Array = new PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77[(int)((long)-1763561981 ^ (long)-1763561982) << 1];
        PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77[] pUEvqz0Yhx2nMzEMkA760LC8xbWmYt77Array2 = pUEvqz0Yhx2nMzEMkA760LC8xbWmYt77Array;
        pUEvqz0Yhx2nMzEMkA760LC8xbWmYt77Array[(int)1273166470L ^ 0x4BE2FA86] = Field17037 = new PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77("Legacy", (int)((long)-471990683 ^ (long)-471990683));
        pUEvqz0Yhx2nMzEMkA760LC8xbWmYt77Array[(int)((long)426850508 ^ (long)426850509)] = Field17038 = new PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77("New", (int)((long)1753535148 ^ (long)1753535149));
        Field17039 = pUEvqz0Yhx2nMzEMkA760LC8xbWmYt77Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77() {
        void var2_-1;
        void var1_-1;
    }

    public static PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77[] values() {
        return (PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77[])Field17039.clone();
    }

    public static PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77 valueOf(String string) {
        return Enum.valueOf(PUEvqz0Yhx2nMzEMkA760LC8xbWmYt77.class, string);
    }

    private static String Method7283(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1233471134L ^ 0x4985469E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1164473706L ^ 0x45687595);
            int n2 = (int)((long)332526363 ^ (long)332526472);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1439513315L ^ 0xAA32D8B8) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

