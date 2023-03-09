/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1164;
import lavahack.client.Class1796;

public class Class1575
extends Class1164 {
    private String Field15346 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1575(String string) {
        super("cmd", string);
    }

    @Override
    protected void Method4693() {
        String[] stringArray;
        String[] stringArray2 = stringArray = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.split(";");
        int n = stringArray2.length;
        int n2 = 0;
        while (n2 < n) {
            String string = stringArray2[n2];
            Class1796.Field16241.Field16272.Method7567(string);
            ++n2;
        }
    }

    private static String Method6213(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 10;
            cArray2[n] = (char)(cArray[n] ^ (0x5F77 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

