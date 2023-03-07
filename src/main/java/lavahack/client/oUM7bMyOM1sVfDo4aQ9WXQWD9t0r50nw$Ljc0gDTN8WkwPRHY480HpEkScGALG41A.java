/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;

class oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field16472 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$Ljc0gDTN8WkwPRHY480HpEkScGALG41A(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("stop", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6302();
        this.Method437("Stopped the music");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)6969735L ^ 0x6A5987;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-196486735 ^ (long)-196486834);
            int n2 = (int)((long)1759669597 ^ (long)1759669560) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)229361721 ^ (long)229363922) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

