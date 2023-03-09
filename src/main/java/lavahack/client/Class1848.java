/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/exploit/BowExploit$Mode;", "", "(Ljava/lang/String;I)V", "Default", "Rewrite", "kisman.cc"})
public final class Class1848
extends Enum {
    public static final /* enum */ Class1848 Field16521;
    public static final /* enum */ Class1848 Field16522;
    private static final Class1848[] Field16523;
    private String Field16524 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1848[] class1848Array = new Class1848[2];
        Class1848[] class1848Array2 = class1848Array;
        class1848Array[0] = Field16521 = new Class1848("Default", 0);
        class1848Array[1] = Field16522 = new Class1848("Rewrite", 1);
        Field16523 = class1848Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1848() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1848[] values() {
        return (Ce8ehKEIYQU2NDxfXULPC692xF6WK1qg.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field16523.clone();
    }

    public static Class1848 valueOf(String string) {
        return Enum.valueOf(Class1848.class, string);
    }

    private static String Method6942(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 32;
            cArray2[n] = (char)(cArray[n] ^ (0x1920 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

