/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;

class oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field9791 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("pause", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6299();
        this.Method437("Paused the music");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)295203909 ^ (long)295203909);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1242970056L ^ 0x4A163737);
            int n2 = ((int)-1188274075L ^ 0xB92C604E) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)315150322 ^ (long)315152915) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

