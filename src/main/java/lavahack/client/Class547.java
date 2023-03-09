/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1491;
import lavahack.client.Class235;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class873;
import lavahack.client.Class97;

public class Class547
extends Class42 {
    @Class873
    public static Class547 Field10322;
    public Class44 Field10323 = this.Method23(new Class44("Impr RPC", (Class42)this, true));
    public Class44 Field10324 = this.Method23(new Class44("Image Mode", (Class42)this, Class235.Field9025));
    private String Field10325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class547() {
        super("DiscordRPC", "", Class97.Field8339);
        super.Method21(true);
    }

    @Override
    public void Method38() {
        Class1491.Method5967();
    }

    @Override
    public void Method39() {
        Class1491.Method5968();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 79;
            cArray2[n] = (char)(cArray[n] ^ (0x4691 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

