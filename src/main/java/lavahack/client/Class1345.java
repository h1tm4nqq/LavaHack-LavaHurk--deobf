/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;

public class Class1345
extends Class2157 {
    public float Field14126;
    private int Field14127;

    public Class1345(float f) {
        super(new Object[0]);
        this.Field14126 = f;
    }

    @Override
    public String Method163() {
        return "render_3d";
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 81;
            cArray2[n] = (char)(cArray[n] ^ (0x7C3D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

