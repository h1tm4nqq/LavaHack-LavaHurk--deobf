/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class158;
import lavahack.client.Class1796;
import lavahack.client.Class726;

public class Class916
extends Class158 {
    private String Field11886 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class916() {
        super("friend");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray[0].equalsIgnoreCase("add")) {
            Class1796.Field16241.Field16256.Method3040(stringArray[1]);
            this.Method437(stringArray[1] + " added in friends!");
            return;
        }
        if (stringArray[0].equalsIgnoreCase("remove")) {
            Class1796.Field16241.Field16256.Method3041(stringArray[1]);
            this.Method437(stringArray[1] + " removed from friends :(");
            return;
        }
        if (!stringArray[0].equalsIgnoreCase("list")) throw new Exception();
        String string2 = "Friends: ";
        int n = 0;
        while (true) {
            if (n >= Class726.Field11086.Method3039().size()) {
                this.Method437(string2);
                return;
            }
            string2 = string2 + (String)Class726.Field11086.Method3039().get(n);
            if (n != Class726.Field11086.Method3039().size() - 1) {
                string2 = string2 + ", ";
            }
            ++n;
        }
    }

    @Override
    public String Method447() {
        return "friend's command";
    }

    @Override
    public String Method448() {
        return "friend add/remove <player's name> | friend list";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 35;
            cArray2[n] = (char)(cArray[n] ^ (0x7141 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

