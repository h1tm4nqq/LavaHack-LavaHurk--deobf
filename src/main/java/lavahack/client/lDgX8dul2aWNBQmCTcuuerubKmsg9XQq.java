/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.event.Event;

public class lDgX8dul2aWNBQmCTcuuerubKmsg9XQq
extends Event {
    public String Field17522;
    private String Field17523 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public lDgX8dul2aWNBQmCTcuuerubKmsg9XQq(String string) {
        super(new Object[(int)((long)486921885 ^ (long)486921885)]);
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
        int n = (int)((long)1332161415 ^ (long)1332161415);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1088809902 ^ (long)-1088809811);
            int n2 = (int)-1392404490L ^ 0xAD0197C1;
            cArray2[n] = (char)(cArray[n] ^ ((int)2101153809L ^ 0x7D3D7CB2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

