/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/PvpResourcesStyles;", "", "(Ljava/lang/String;I)V", "Vertical", "Square", "kisman.cc"})
public final class Class652
extends Enum {
    public static final /* enum */ Class652 Field10794;
    public static final /* enum */ Class652 Field10795;
    private static final Class652[] Field10796;
    private String Field10797 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class652[] class652Array = new Class652[2];
        Class652[] class652Array2 = class652Array;
        class652Array[0] = Field10794 = new Class652("Vertical", 0);
        class652Array[1] = Field10795 = new Class652("Square", 1);
        Field10796 = class652Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class652() {
        void var2_-1;
        void var1_-1;
    }

    public static Class652[] values() {
        return (X6ITEHzGmAbD8c3Qufy2HdzlV1IKkKSv[])Field10796.clone();
    }

    public static Class652 valueOf(String string) {
        return Enum.valueOf(Class652.class, string);
    }

    private static String Method2821(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 121;
            cArray2[n] = (char)(cArray[n] ^ (0x50B0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

