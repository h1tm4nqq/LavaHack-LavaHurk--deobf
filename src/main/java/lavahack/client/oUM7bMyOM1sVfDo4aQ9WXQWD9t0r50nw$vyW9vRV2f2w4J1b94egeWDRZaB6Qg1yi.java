/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;

class oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field10145 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("volume", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray.length < (int)((long)-1360579673 ^ (long)-1360579674) << 1) {
            return;
        }
        int n = Integer.parseInt(stringArray[(int)((long)1977799786 ^ (long)1977799787)]);
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6303(n);
        this.Method437("Set music volume to: " + n);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1153544923L ^ 0xBB3E4D25;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)867651855L ^ 0x33B751F0);
            int n2 = (int)((long)741936684 ^ (long)741936681) << 5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1566316496 ^ (long)1566338989) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

