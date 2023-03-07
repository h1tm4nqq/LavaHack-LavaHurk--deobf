/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Event;

public class wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV
extends Event {
    public float Field14126;
    private int Field14127;

    public wdVAVdi2F3QG9A2uLasB8qn6W19QJIbV(float f) {
        super(new Object[(int)((long)226794074 ^ (long)226794074)]);
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
        int n = (int)-1998226571L ^ 0x88E57B75;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1111139452 ^ (long)-1111139461);
            int n2 = (int)((long)-597543606 ^ (long)-597543653);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2099785623 ^ (long)-2099794860) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

