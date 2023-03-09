/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;

public class Class112
extends Class2157 {
    public float Field8390;
    private String Field8391 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class112(float f) {
        super(new Object[0]);
        this.Field8390 = f;
    }

    @Override
    public String Method163() {
        return "render_2d";
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 112;
            cArray2[n] = (char)(cArray[n] ^ (0x74B9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

