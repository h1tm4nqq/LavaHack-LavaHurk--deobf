/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class VQFM6eBkQ3MoMuIVDDhwrFyhIwa3GqI0
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field13539 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public VQFM6eBkQ3MoMuIVDDhwrFyhIwa3GqI0() {
        super("BlockPlaceCheck", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)877311713L ^ 0x344AB6E1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1903576603 ^ (long)1903576804);
            int n2 = (int)((long)-496020919 ^ (long)-496020916) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1659387473L ^ 0x62E805AC) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

