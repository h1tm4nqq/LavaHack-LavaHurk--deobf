/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/features/module/Debug/FastFallTest$Progression;", "", "(Ljava/lang/String;I)V", "Arithmetic", "Geometric", "kisman.cc"})
final class Class1323
extends Enum {
    public static final /* enum */ Class1323 Field14062;
    public static final /* enum */ Class1323 Field14063;
    private static final Class1323[] Field14064;
    private String Field14065 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1323[] class1323Array = new Class1323[2];
        Class1323[] class1323Array2 = class1323Array;
        class1323Array[0] = Field14062 = new Class1323("Arithmetic", 0);
        class1323Array[1] = Field14063 = new Class1323("Geometric", 1);
        Field14064 = class1323Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1323() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1323[] values() {
        return (xFGCQZuRT1DSAaLDQkXGae0W8t6wGn0X.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[])Field14064.clone();
    }

    public static Class1323 valueOf(String string) {
        return Enum.valueOf(Class1323.class, string);
    }

    private static String Method5361(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 76;
            cArray2[n] = (char)(cArray[n] ^ (0x3800 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

