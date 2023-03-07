/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

public class WDdAATNF21EFdmq7ko4aGKREIiIEJJic
extends TDrOJYGYE6GxbjOEblLxwsKQtY1HZZvO {
    private String Field15346 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public WDdAATNF21EFdmq7ko4aGKREIiIEJJic(String string) {
        super("cmd", string);
    }

    @Override
    protected void Method4693() {
        String[] stringArray;
        String[] stringArray2 = stringArray = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.split(";");
        int n = stringArray2.length;
        int n2 = (int)((long)1421529782 ^ (long)1421529782);
        while (n2 < n) {
            String string = stringArray2[n2];
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16272.Method7567(string);
            ++n2;
        }
    }

    private static String Method6213(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1943682051 ^ (long)1943682051);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)490246767 ^ (long)490246800);
            int n2 = (int)((long)-1074154787 ^ (long)-1074154792) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1676213440 ^ (long)1676190647) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

