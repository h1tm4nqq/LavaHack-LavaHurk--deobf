/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.io.File;
import java.net.URL;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import lavahack.client.oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw;

class oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field10467 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        super("dir", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw2 = (oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw)this.Method2057();
        if (stringArray.length < ((int)-1968974792L ^ 0x8AA3D439) << 1) {
            return;
        }
        if (stringArray[(int)((long)-391843371 ^ (long)-391843372)].equals("file")) {
            if (stringArray.length < ((int)-202844859L ^ 0xF3E8D546)) {
                return;
            }
            String string2 = oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3422(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw2) ? oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3423(stringArray, (int)((long)-721530610 ^ (long)-721530609) << 1) : stringArray[(int)((long)301179680 ^ (long)301179681) << 1];
            File file = new File(string2);
            if (!file.exists()) return;
            if (file.isDirectory()) {
                return;
            }
            URL uRL = file.toURI().toURL();
            oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3425(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3424(), uRL.toExternalForm());
            return;
        }
        if (!stringArray[(int)427784923L ^ 0x197F7ADA].equals("url")) {
            if (!stringArray[(int)((long)-1448071824 ^ (long)-1448071823)].equals("clear")) return;
            oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3425(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3424(), "");
            this.Method437("Cleared the music user directory");
            return;
        }
        if (stringArray.length < (int)((long)1516924062 ^ (long)1516924061)) {
            return;
        }
        String string3 = oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3422(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw2) ? oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3423(stringArray, ((int)1600617687L ^ 0x5F677CD6) << 1) : stringArray[((int)1828530955L ^ 0x6CFD2B0A) << 1];
        URL uRL = new URL(string3);
        oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3425(oUM7bMyOM1sVfDo4aQ9WXQWD9t0r50nw.Method3424(), uRL.toExternalForm());
        this.Method437("Set music user directory url to: " + uRL.toExternalForm());
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)52334587L ^ 0x31E8FFB;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1148809947 ^ (long)-1148809766);
            int n2 = (int)-1569454262L ^ 0xA27407DD;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2085327366 ^ (long)2085337733) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

