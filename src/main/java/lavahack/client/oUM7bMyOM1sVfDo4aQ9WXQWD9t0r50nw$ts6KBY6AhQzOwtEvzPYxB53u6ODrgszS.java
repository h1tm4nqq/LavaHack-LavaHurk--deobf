/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;

class oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private int Field15296;

    public oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("resume", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6296();
        this.Method437("Resumed the music");
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-139058436L ^ 0xF7B622FC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-298718775L ^ 0xEE31E936);
            int n2 = (int)((long)434834247 ^ (long)434834202);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1491342071 ^ (long)-1491360688) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

