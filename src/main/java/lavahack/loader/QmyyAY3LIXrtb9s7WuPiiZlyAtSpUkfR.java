/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.loader;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/websockets/api/enums/Role;", "", "(Ljava/lang/String;I)V", "CLIENT", "SERVER", "kisman.cc"})
public final class QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR
extends Enum {
    public static final /* enum */ QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR Field10968;
    public static final /* enum */ QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR Field10969;
    private static final QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR[] Field10970;
    private String Field10971 = "TheKisDevs & LavaHack Development owns you";

    static {
        QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR[] qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfRArray = new QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR[(int)((long)1934062245 ^ (long)1934062244) << 1];
        QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR[] qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfRArray2 = qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfRArray;
        qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfRArray[(int)404901696L ^ 0x18224F40] = Field10968 = new QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR("CLIENT", (int)1468197472L ^ 0x5782EA60);
        qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfRArray[(int)-441608126L ^ 0xE5AD9843] = Field10969 = new QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR("SERVER", (int)((long)1723454366 ^ (long)1723454367));
        Field10970 = qmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfRArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR() {
        void var2_-1;
        void var1_-1;
    }

    public static QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR[] values() {
        return (QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR[])Field10970.clone();
    }

    public static QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR valueOf(String string) {
        return Enum.valueOf(QmyyAY3LIXrtb9s7WuPiiZlyAtSpUkfR.class, string);
    }

    private static String Method2923(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)752903607L ^ 0x2CE065B7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-241465130 ^ (long)-241465303);
            int n2 = ((int)2091182582L ^ 0x7CA4E9BD) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)440185288 ^ (long)440192885) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

