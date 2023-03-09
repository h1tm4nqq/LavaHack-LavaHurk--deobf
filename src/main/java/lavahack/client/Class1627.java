/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Class158;
import lavahack.client.Class848;

public class Class1627
extends Class158 {
    private int Field15606;

    public Class1627() {
        super("antispam");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray[0].equalsIgnoreCase("add")) {
            Class848.Field11583.Field11584.add(stringArray[1]);
            this.Method437(stringArray[1] + " added to AntiSpammer list");
            return;
        }
        if (stringArray[0].equalsIgnoreCase("remove")) {
            Class848.Field11583.Field11584.remove(stringArray[1]);
            this.Method437(stringArray[1] + " removed from AntiSpammer list");
            return;
        }
        if (stringArray[0].equalsIgnoreCase("clear")) {
            Class848.Field11583.Field11584.clear();
            this.Method437("AntiSpammer list has been cleared");
            return;
        }
        if (!stringArray[0].equalsIgnoreCase("list")) return;
        this.Method439("AntiSpammer list:");
        Iterator iterator = Class848.Field11583.Field11584.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            this.Method439(string2);
        }
    }

    @Override
    public String Method447() {
        return "null";
    }

    @Override
    public String Method448() {
        return "antispam <add/remove/list>";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 164;
            cArray2[n] = (char)(cArray[n] ^ (0x388E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

