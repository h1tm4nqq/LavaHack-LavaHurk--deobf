/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 */
package lavahack.client;

import lavahack.client.Class1479;
import lavahack.client.Class179;
import lavahack.client.Class188;
import lavahack.client.Class190;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;

public abstract class Class617
extends Enum {
    public static final /* enum */ Class617 Field10633 = new Class179("schematica.gui.all");
    public static final /* enum */ Class617 Field10634 = new Class190("schematica.gui.layers");
    public static final /* enum */ Class617 Field10635 = new Class188("schematica.gui.below");
    public final String Field10636;
    private static final Class617[] Field10637 = new Class617[]{Field10633, Field10634, Field10635};
    private int Field10638;

    public static Class617[] values() {
        return (OP4La13R7rceTBm7QSP7XXXyRxZD1Op3.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10637.clone();
    }

    public static Class617 valueOf(String string) {
        return Enum.valueOf(Class617.class, string);
    }

    public abstract boolean Method1104(Class1479 var1, int var2);

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class617() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10636 = var3_1;
    }

    public static Class617 Method1105(Class617 class617) {
        Class617[] class617Array = Class617.values();
        return class617Array[(class617.ordinal() + 1) % class617Array.length];
    }

    /*
     * WARNING - void declaration
     */
    Class617() {
        this((String)var1_-1, (int)class144, (String)var3_2);
        void var3_2;
        void var1_-1;
    }

    private static String Method1106(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 180;
            cArray2[n] = (char)(cArray[n] ^ (0x1F43 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

