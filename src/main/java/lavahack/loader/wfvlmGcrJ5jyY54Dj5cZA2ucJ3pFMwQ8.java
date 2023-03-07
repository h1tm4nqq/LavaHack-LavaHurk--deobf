/*
 * Decompiled with CFR 0.152.
 */
package lavahack.loader;

import lavahack.loader.D2A33i4puy3VG87sLGopuKBa7759W0RD;
import lavahack.loader.cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9;
import lavahack.loader.rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC;
import lavahack.loader.twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl;

public abstract class wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8
extends twv3j4xPzYOl0kPslOvi4Xjv1a6brkFl {
    private String Field15818 = "TheKisDevs & LavaHack Development owns you";

    public wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8(D2A33i4puy3VG87sLGopuKBa7759W0RD d2A33i4puy3VG87sLGopuKBa7759W0RD) {
        super(d2A33i4puy3VG87sLGopuKBa7759W0RD);
    }

    @Override
    public void Method84() throws rGO5Dg5rRCFv7PqYvXS6DX1QEKpKH1oC {
        if (!this.Method76()) {
            throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("Control frame can't have fin==false set");
        }
        if (this.Method77()) {
            throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("Control frame can't have rsv1==true set");
        }
        if (this.Method78()) {
            throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("Control frame can't have rsv2==true set");
        }
        if (!this.Method79()) return;
        throw new cOY3JnnL4iiLr0AUdZQ0yQaDvd9YMfX9("Control frame can't have rsv3==true set");
    }

    private static String Method92(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2122066465 ^ (long)2122066465);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-634898365 ^ (long)-634898244);
            int n2 = (int)((long)-38281799 ^ (long)-38281838) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1950617954 ^ (long)1950618889) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

