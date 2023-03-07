/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 */
package lavahack.client;

import lavahack.client.hUf4kJprjr4CAEqLV4K1NU4TcYJKVDOk;
import org.apache.logging.log4j.LogManager;

public class VmqvYjs6QHhzqOhVlrUhbaGNYMaIKJq4 {
    public static VmqvYjs6QHhzqOhVlrUhbaGNYMaIKJq4 Field13723 = new VmqvYjs6QHhzqOhVlrUhbaGNYMaIKJq4();
    private String Field13724 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method5100() {
        hUf4kJprjr4CAEqLV4K1NU4TcYJKVDOk.Field7890 = LogManager.getLogger((String)"LavaHack Lunatrius Core");
    }

    private static String Method5101(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1547534862 ^ (long)-1547534862);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1327898704 ^ (long)-1327898801);
            int n2 = ((int)-1802904755L ^ 0x9489DB56) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1212332205L ^ 0xB7BD5ABA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

