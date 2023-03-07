/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/AutoRerDamageSyncStages;", "", "(Ljava/lang/String;I)V", "Place", "Break", "kisman.cc"})
public final class aQZJinimgTDb40wQmUf6cCjsQGvOpAiY
extends Enum {
    public static final /* enum */ aQZJinimgTDb40wQmUf6cCjsQGvOpAiY Field15457;
    public static final /* enum */ aQZJinimgTDb40wQmUf6cCjsQGvOpAiY Field15458;
    private static final aQZJinimgTDb40wQmUf6cCjsQGvOpAiY[] Field15459;
    private String Field15460 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        aQZJinimgTDb40wQmUf6cCjsQGvOpAiY[] aQZJinimgTDb40wQmUf6cCjsQGvOpAiYArray = new aQZJinimgTDb40wQmUf6cCjsQGvOpAiY[(int)((long)-1382322441 ^ (long)-1382322442) << 1];
        aQZJinimgTDb40wQmUf6cCjsQGvOpAiY[] aQZJinimgTDb40wQmUf6cCjsQGvOpAiYArray2 = aQZJinimgTDb40wQmUf6cCjsQGvOpAiYArray;
        aQZJinimgTDb40wQmUf6cCjsQGvOpAiYArray[(int)((long)-542273622 ^ (long)-542273622)] = Field15457 = new aQZJinimgTDb40wQmUf6cCjsQGvOpAiY("Place", (int)-2091200833L ^ 0x835ACEBF);
        aQZJinimgTDb40wQmUf6cCjsQGvOpAiYArray[(int)((long)-1482108528 ^ (long)-1482108527)] = Field15458 = new aQZJinimgTDb40wQmUf6cCjsQGvOpAiY("Break", (int)1906063271L ^ 0x719C37A6);
        Field15459 = aQZJinimgTDb40wQmUf6cCjsQGvOpAiYArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aQZJinimgTDb40wQmUf6cCjsQGvOpAiY() {
        void var2_-1;
        void var1_-1;
    }

    public static aQZJinimgTDb40wQmUf6cCjsQGvOpAiY[] values() {
        return (aQZJinimgTDb40wQmUf6cCjsQGvOpAiY[])Field15459.clone();
    }

    public static aQZJinimgTDb40wQmUf6cCjsQGvOpAiY valueOf(String string) {
        return Enum.valueOf(aQZJinimgTDb40wQmUf6cCjsQGvOpAiY.class, string);
    }

    private static String Method6253(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)101657114L ^ 0x60F2A1A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)442160754L ^ 0x1A5AD68D);
            int n2 = ((int)2068537508L ^ 0x7B4B609B) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)726650885L ^ 0x2B4FE420 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

