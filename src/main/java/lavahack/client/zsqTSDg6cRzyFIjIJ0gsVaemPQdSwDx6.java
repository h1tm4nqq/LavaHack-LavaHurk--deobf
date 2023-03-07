/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Event;

public class zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6
extends Event {
    public float Field8390;
    private String Field8391 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public zsqTSDg6cRzyFIjIJ0gsVaemPQdSwDx6(float f) {
        super(new Object[(int)((long)216860010 ^ (long)216860010)]);
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
        int n = (int)((long)791315348 ^ (long)791315348);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1902429485L ^ 0x7164C5D2);
            int n2 = (int)((long)226413619 ^ (long)226413620) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)-985909770L ^ 0xC53C414F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

