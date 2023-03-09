/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9
 *  net.minecraft.block.Block
 */
package lavahack.client;

import lavahack.client.Class572;
import lavahack.client.Class573;
import lavahack.client.n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9;
import net.minecraft.block.Block;

public class Class1072
extends Enum {
    public static final /* enum */ Class1072 Field12727 = new Class573();
    public static final /* enum */ Class1072 Field12728 = new Class572();
    private static final Class1072[] Field12729 = new Class1072[]{Field12727, Field12728};
    private String Field12730 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static Class1072[] values() {
        return (n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9[])Field12729.clone();
    }

    public static Class1072 valueOf(String string) {
        return Enum.valueOf(Class1072.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1072() {
        void var2_-1;
        void var1_-1;
    }

    public Class1072 Method2519() {
        return null;
    }

    public Block Method2520() {
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    Class1072() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    private static String Method2521(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 151;
            cArray2[n] = (char)(cArray[n] ^ (0x1EAD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

