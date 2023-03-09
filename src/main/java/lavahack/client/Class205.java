/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import org.objectweb.asm.ClassWriter;

public class Class205
extends ClassWriter {
    private int Field8896;

    public Class205(int n) {
        super(n);
    }

    protected String Method1216(String string, String string2) {
        if (!string.equals("blr")) return "java/lang/Object";
        return "blk";
    }

    private static String Method1217(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 68;
            cArray2[n] = (char)(cArray[n] ^ (0x2FE9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

