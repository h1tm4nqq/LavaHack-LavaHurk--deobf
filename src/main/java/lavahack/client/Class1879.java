/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import net.minecraft.util.math.Vec3i;

public enum Class1879 {
    Field16665(new Vec3i(0, 0, -1)),
    Field16666(new Vec3i(-1, 0, 0)),
    Field16667(new Vec3i(0, 0, 1)),
    Field16668(new Vec3i(1, 0, 0));

    public Vec3i Field16669;
    private int Field16671;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class1879() {
        void var3_1;
        this.Field16669 = var3_1;
    }

    private static String Method6974(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 77;
            cArray2[n] = (char)(cArray[n] ^ (0x3540 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

