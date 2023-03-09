/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/util/enums/ShaderCharmsOverlaying;", "", "(Ljava/lang/String;I)V", "Pre", "Post", "kisman.cc"})
public final class Class1636
extends Enum {
    public static final /* enum */ Class1636 Field15625;
    public static final /* enum */ Class1636 Field15626;
    private static final Class1636[] Field15627;
    private String Field15628 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1636[] class1636Array = new Class1636[2];
        Class1636[] class1636Array2 = class1636Array;
        class1636Array[0] = Field15625 = new Class1636("Pre", 0);
        class1636Array[1] = Field15626 = new Class1636("Post", 1);
        Field15627 = class1636Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1636() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1636[] values() {
        return (KjOeNxlofz6iToL25XxYIWeKKzQ5rxIf[])Field15627.clone();
    }

    public static Class1636 valueOf(String string) {
        return Enum.valueOf(Class1636.class, string);
    }

    private static String Method6369(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 70;
            cArray2[n] = (char)(cArray[n] ^ (0x31EF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

