/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/features/command/commands/RollBackCommand$Mode;", "", "(Ljava/lang/String;I)V", "SIMPLE", "DOUBLE", "TMP", "YEET", "kisman.cc"})
public final class Class1206
extends Enum {
    public static final /* enum */ Class1206 Field13475;
    public static final /* enum */ Class1206 Field13476;
    public static final /* enum */ Class1206 Field13477;
    public static final /* enum */ Class1206 Field13478;
    private static final Class1206[] Field13479;
    private int Field13480;

    static {
        Class1206[] class1206Array = new Class1206[4];
        Class1206[] class1206Array2 = class1206Array;
        class1206Array[0] = Field13475 = new Class1206("SIMPLE", 0);
        class1206Array[1] = Field13476 = new Class1206("DOUBLE", 1);
        class1206Array[2] = Field13477 = new Class1206("TMP", 2);
        class1206Array[3] = Field13478 = new Class1206("YEET", 3);
        Field13479 = class1206Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1206() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1206[] values() {
        return (O1wfrBba1z1C4gxnTtwfHkAxEr02HOc6.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field13479.clone();
    }

    public static Class1206 valueOf(String string) {
        return Enum.valueOf(Class1206.class, string);
    }

    private static String Method4869(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 111;
            cArray2[n] = (char)(cArray[n] ^ (0x16FA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

