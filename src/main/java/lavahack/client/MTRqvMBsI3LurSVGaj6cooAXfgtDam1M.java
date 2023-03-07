/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD;

public class MTRqvMBsI3LurSVGaj6cooAXfgtDam1M
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private int Field15606;

    public MTRqvMBsI3LurSVGaj6cooAXfgtDam1M() {
        super("antispam");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray[(int)((long)-1159542590 ^ (long)-1159542590)].equalsIgnoreCase("add")) {
            izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD.Field11583.Field11584.add(stringArray[(int)((long)1420142452 ^ (long)1420142453)]);
            this.Method437(stringArray[(int)((long)1155797418 ^ (long)1155797419)] + " added to AntiSpammer list");
            return;
        }
        if (stringArray[(int)-284376057L ^ 0xEF0CC407].equalsIgnoreCase("remove")) {
            izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD.Field11583.Field11584.remove(stringArray[(int)((long)-3811776 ^ (long)-3811775)]);
            this.Method437(stringArray[(int)-2841296L ^ 0xFFD4A531] + " removed from AntiSpammer list");
            return;
        }
        if (stringArray[(int)((long)549088716 ^ (long)549088716)].equalsIgnoreCase("clear")) {
            izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD.Field11583.Field11584.clear();
            this.Method437("AntiSpammer list has been cleared");
            return;
        }
        if (!stringArray[(int)((long)992920613 ^ (long)992920613)].equalsIgnoreCase("list")) return;
        this.Method439("AntiSpammer list:");
        Iterator iterator = izbWdj2ogdqtHQe8DQ4vANuXMqhYPWxD.Field11583.Field11584.iterator();
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
        int n = (int)((long)-1804361294 ^ (long)-1804361294);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1877567989 ^ (long)-1877567756);
            int n2 = ((int)1876445443L ^ 0x6FD8492A) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-577152121 ^ (long)-577157184) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

