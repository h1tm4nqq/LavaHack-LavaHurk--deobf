/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/util/enums/SearchGuiItemsNameModes;", "", "(Ljava/lang/String;I)V", "None", "FullName", "ToolTip", "Both", "kisman.cc"})
public final class Class1854
extends Enum {
    public static final /* enum */ Class1854 Field16538;
    public static final /* enum */ Class1854 Field16539;
    public static final /* enum */ Class1854 Field16540;
    public static final /* enum */ Class1854 Field16541;
    private static final Class1854[] Field16542;
    private int Field16543;

    static {
        Class1854[] class1854Array = new Class1854[4];
        Class1854[] class1854Array2 = class1854Array;
        class1854Array[0] = Field16538 = new Class1854("None", 0);
        class1854Array[1] = Field16539 = new Class1854("FullName", 1);
        class1854Array[2] = Field16540 = new Class1854("ToolTip", 2);
        class1854Array[3] = Field16541 = new Class1854("Both", 3);
        Field16542 = class1854Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1854() {
        void var2_-1;
        void var1_-1;
    }

    public static Class1854[] values() {
        return (La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh[])Field16542.clone();
    }

    public static Class1854 valueOf(String string) {
        return Enum.valueOf(Class1854.class, string);
    }

    private static String Method6948(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 117;
            cArray2[n] = (char)(cArray[n] ^ (0x3202 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

