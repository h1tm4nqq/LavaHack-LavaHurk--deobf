/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  lavahack.client.mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/kisman/cc/util/enums/SurroundSupportModes;", "", "(Ljava/lang/String;I)V", "None", "Dynamic", "Static", "kisman.cc"})
public final class Class856
extends Enum {
    public static final /* enum */ Class856 Field11610;
    public static final /* enum */ Class856 Field11611;
    public static final /* enum */ Class856 Field11612;
    private static final Class856[] Field11613;
    private String Field11614 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    static {
        Class856[] class856Array = new Class856[3];
        Class856[] class856Array2 = class856Array;
        class856Array[0] = Field11610 = new Class856("None", 0);
        class856Array[1] = Field11611 = new Class856("Dynamic", 1);
        class856Array[2] = Field11612 = new Class856("Static", 2);
        Field11613 = class856Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class856() {
        void var2_-1;
        void var1_-1;
    }

    public static Class856[] values() {
        return (mmsxuY3EZVqKin1NWG1fEhjMcbE5sICM[])Field11613.clone();
    }

    public static Class856 valueOf(String string) {
        return Enum.valueOf(Class856.class, string);
    }

    private static String Method3604(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 187;
            cArray2[n] = (char)(cArray[n] ^ (0x4D5C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

