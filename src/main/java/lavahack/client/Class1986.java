/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class158;
import lavahack.client.Class1796;

public class Class1986
extends Class158 {
    private String Field17127 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1986() {
        super("toggle");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        String string2 = "";
        string2 = stringArray[0];
        Class1796.Field16241.Field16254.Method1162(string2);
        if (stringArray.length > 1) {
            this.Method438("Usage: " + this.Method448());
            return;
        }
        Class1796.Field16241.Field16254.Method1162(string2).Method21(!Class1796.Field16241.Field16254.Method1162(string2).Method35());
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 114;
            cArray2[n] = (char)(cArray[n] ^ (0x2A92 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

