/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 */
package lavahack.client;

import lavahack.client.n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9$1;
import lavahack.client.n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9$2;
import net.minecraft.block.Block;

public class n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9
extends Enum {
    public static final /* enum */ n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9 Field12727 = new n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9$1();
    public static final /* enum */ n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9 Field12728 = new n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9$2();
    private static final n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9[] Field12729;
    private String Field12730 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9[] values() {
        return (n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9[])Field12729.clone();
    }

    public static n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9 valueOf(String string) {
        return Enum.valueOf(n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9() {
        void var2_-1;
        void var1_-1;
    }

    public n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9 Method2519() {
        return null;
    }

    public Block Method2520() {
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9[] n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9Array = new n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9[((int)1232756956L ^ 0x497A60DD) << 1];
        n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9Array[(int)189808234L ^ 0xB503E6A] = Field12727;
        n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9Array[(int)-1085315857L ^ 0xBF4F64EE] = Field12728;
        Field12729 = n99vo51pDQ2rDvMRD3zMHbq8IgyrL5D9Array;
    }

    private static String Method2521(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)398898494L ^ 0x17C6B53E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)579031600L ^ 0x228352CF);
            int n2 = (int)((long)143690690 ^ (long)143690581);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1809013854 ^ (long)1809007347) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

