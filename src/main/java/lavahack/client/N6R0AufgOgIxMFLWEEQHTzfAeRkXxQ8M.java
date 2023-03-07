/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import org.objectweb.asm.ClassWriter;

public class N6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M
extends ClassWriter {
    private int Field8896;

    public N6R0AufgOgIxMFLWEEQHTzfAeRkXxQ8M(int n) {
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
        int n = (int)((long)556279172 ^ (long)556279172);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)634744315 ^ (long)634744068);
            int n2 = ((int)-1403899897L ^ 0xAC523016) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)1285632660L ^ 0x4CA11D7D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

