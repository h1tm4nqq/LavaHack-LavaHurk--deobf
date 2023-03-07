/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import lavahack.client.oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw;

class oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field17608 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("play", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw2 = (oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw)this.Method2057();
        if (stringArray.length < ((int)-813919191L ^ 0xCF7C9428) << 1) {
            return;
        }
        if (stringArray[(int)((long)1314792361 ^ (long)1314792360)].equals("file")) {
            if (stringArray.length < (int)((long)972623653 ^ (long)972623654)) {
                return;
            }
            String string2 = oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3422(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw2) ? oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3423(stringArray, ((int)-1873351979L ^ 0x9056EAD4) << 1) : stringArray[(int)((long)-376948324 ^ (long)-376948323) << 1];
            File file = new File(string2);
            if (!file.exists()) return;
            if (file.isDirectory()) {
                return;
            }
            URL uRL = file.toURI().toURL();
            XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6297(uRL.toExternalForm());
            this.Method437("Now playing: " + uRL.toExternalForm());
            return;
        }
        if (stringArray[(int)-2038249267L ^ 0x8682C8CC].equals("url")) {
            if (stringArray.length < (int)((long)1732742710 ^ (long)1732742709)) {
                return;
            }
            String string3 = oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3422(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw2) ? oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3423(stringArray, ((int)1628081713L ^ 0x610A8E30) << 1) : stringArray[(int)((long)1263085033 ^ (long)1263085032) << 1];
            URL uRL = new URL(string3);
            XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6297(uRL.toExternalForm());
            this.Method437("Now playing: " + uRL.toExternalForm());
            return;
        }
        String string4 = oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3422(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw2) ? oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3423(stringArray, (int)1308575882L ^ 0x4DFF488B) : stringArray[(int)((long)1292791402 ^ (long)1292791403)];
        XRXmfsqFBnPzOVKiBT0ogKoUyer7vVBR.Method6297(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3426(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3424()) + string4);
        this.Method437("Now playing: " + oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3426(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3424()) + string4);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2048881445 ^ (long)2048881445);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1470015862 ^ (long)-1470015883);
            int n2 = (int)-1299932790L ^ 0xB2849951;
            cArray2[n] = (char)(cArray[n] ^ ((int)649536461L ^ 0x26B76454 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

