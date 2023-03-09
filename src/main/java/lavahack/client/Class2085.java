/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;

public class Class2085
extends Class2157 {
    public String Field17522;
    private String Field17523 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2085(String string) {
        super(new Object[0]);
        this.Field17522 = string;
    }

    public String Method7622() {
        return this.Field17522;
    }

    @Override
    public String Method163() {
        return "client_chat";
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 55;
            cArray2[n] = (char)(cArray[n] ^ (0x6CA3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

