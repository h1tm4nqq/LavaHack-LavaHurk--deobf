/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.aQZJinimgTDb40wQmUf6cCjsQGvOpAiY
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.aQZJinimgTDb40wQmUf6cCjsQGvOpAiY;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/AutoRerDamageSyncStages;", "", "(Ljava/lang/String;I)V", "Place", "Break", "kisman.cc"})
public final class Class1593
extends Enum {
    public static final /* enum */ Class1593 Field15457;
    public static final /* enum */ Class1593 Field15458;
    private static final Class1593[] Field15459;
    private String Field15460 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1593[] class1593Array = new Class1593[2];
        Class1593[] class1593Array2 = class1593Array;
        class1593Array[0] = Field15457 = new Class1593("Place", 0);
        class1593Array[1] = Field15458 = new Class1593("Break", 1);
        Field15459 = class1593Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1593() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1593[] values() {
        return (aQZJinimgTDb40wQmUf6cCjsQGvOpAiY[])Field15459.clone();
    }

    public static Class1593 valueOf(String string) {
        return Enum.valueOf(Class1593.class, string);
    }

    private static String Method6253(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 126;
            cArray2[n] = (char)(cArray[n] ^ (0x3425 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

