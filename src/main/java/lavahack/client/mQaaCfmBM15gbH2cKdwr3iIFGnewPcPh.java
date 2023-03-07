/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

public class mQaaCfmBM15gbH2cKdwr3iIFGnewPcPh
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field17127 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public mQaaCfmBM15gbH2cKdwr3iIFGnewPcPh() {
        super("toggle");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        String string2 = "";
        string2 = stringArray[(int)((long)1147601236 ^ (long)1147601236)];
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(string2);
        if (stringArray.length > (int)((long)574427109 ^ (long)574427108)) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(string2).Method21((!leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16254.Method1162(string2).Method35() ? (int)((long)-744230471 ^ (long)-744230472) : (int)((long)636200001 ^ (long)636200001)) != 0);
        this.Method437("Module " + string2 + " has been toggled!");
    }

    @Override
    public String Method447() {
        return "toggled modules";
    }

    @Override
    public String Method448() {
        return "toggle <module>";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-931885584 ^ (long)-931885584);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)568062946L ^ 0x21DBF31D);
            int n2 = ((int)-1276685563L ^ 0xB3E7533C) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1886882430L ^ 0x8F8860CB) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

