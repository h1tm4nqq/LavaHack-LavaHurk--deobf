/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class2061
extends Class42 {
    public final Class44 Field17417 = this.Method23(new Class44("MainHandX", (Class42)this, 0.0, Double.longBitsToDouble((long)540246078 ^ 0xBFF000002033803EL), 1.0, false));
    public final Class44 Field17418 = this.Method23(new Class44("MainHandY", (Class42)this, 0.0, Double.longBitsToDouble((long)2147402397 ^ 0xBFF000007FFEC29DL), 1.0, false));
    public final Class44 Field17419 = this.Method23(new Class44("OffHandX", (Class42)this, 0.0, Double.longBitsToDouble((long)741351957 ^ 0xBFF000002C302215L), 1.0, false));
    public final Class44 Field17420 = this.Method23(new Class44("OffHandY", (Class42)this, 0.0, Double.longBitsToDouble(-4616189618054758400L), 1.0, false));
    public static Class2061 Field17421;
    private int Field17422;

    public Class2061() {
        super("SmallShield", Class97.Field8342);
        Field17421 = this;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 117;
            cArray2[n] = (char)(cArray[n] ^ (0x32B4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

