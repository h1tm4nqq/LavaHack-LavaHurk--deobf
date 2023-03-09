/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/util/enums/FontStyles;", "", "style", "", "(Ljava/lang/String;II)V", "getStyle", "()I", "Plain", "Bold", "Italic", "Both", "kisman.cc"})
public final class Class1613
extends Enum {
    public static final /* enum */ Class1613 Field15543;
    public static final /* enum */ Class1613 Field15544;
    public static final /* enum */ Class1613 Field15545;
    public static final /* enum */ Class1613 Field15546;
    private static final Class1613[] Field15547;
    private final int Field15548;
    private String Field15549 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class1613[] class1613Array = new Class1613[4];
        Class1613[] class1613Array2 = class1613Array;
        class1613Array[0] = Field15543 = new Class1613("Plain", 0, 0);
        class1613Array[1] = Field15544 = new Class1613("Bold", 1, 1);
        class1613Array[2] = Field15545 = new Class1613("Italic", 2, 2);
        class1613Array[3] = Field15546 = new Class1613("Both", 3, 3);
        Field15547 = class1613Array;
    }

    public final int Method6280() {
        return this.Field15548;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1613() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field15548 = var3_1;
    }

    public static Class1613[] values() {
        return (qTretGQGc3EMQ1oiqlGmYy7Xw28i5pmW[])Field15547.clone();
    }

    public static Class1613 valueOf(String string) {
        return Enum.valueOf(Class1613.class, string);
    }

    private static String Method6281(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 120;
            cArray2[n] = (char)(cArray[n] ^ (0x1E25 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

