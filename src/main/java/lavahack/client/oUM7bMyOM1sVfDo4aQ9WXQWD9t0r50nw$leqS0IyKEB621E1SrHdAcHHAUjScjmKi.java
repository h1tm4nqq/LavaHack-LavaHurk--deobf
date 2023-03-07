/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import lavahack.client.oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw;
import org.jetbrains.annotations.NotNull;

class oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field17187 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("argbuilding", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        boolean bl = Boolean.parseBoolean(stringArray[(int)((long)819705650 ^ (long)819705651)]);
        oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3421((oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw)this.Method2057(), bl);
        this.Method437("Arg building is now set to: " + bl);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)484824047L ^ 0x1CE5D3EF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1826641440L ^ 0x6CE056DF);
            int n2 = (int)-1038429172L ^ 0xC21AD42B;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)776919166 ^ (long)776925671) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

