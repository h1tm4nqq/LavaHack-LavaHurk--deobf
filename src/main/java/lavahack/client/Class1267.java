/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 */
package lavahack.client;

import lavahack.client.Class14;
import org.apache.logging.log4j.LogManager;

public class Class1267 {
    public static Class1267 Field13723 = new Class1267();
    private String Field13724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method5100() {
        Class14.Field7890 = LogManager.getLogger((String)"LavaHack Lunatrius Core");
    }

    private static String Method5101(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x1DE9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

