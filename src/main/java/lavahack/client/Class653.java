//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class97;

public class Class653
extends Class42 {
    private final Class650 Field10798 = new Class650();
    private String Field10799 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class653() {
        super("ChatPrint", Class97.Field8345);
    }

    @Override
    public void Method38() {
        Class1393.Method5505();
    }

    @Override
    public void Method45() {
        if (Class653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class653.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field10798.Method2797(5000L)) return;
        Class1393.Method5505().Method1886("5000 ms passed");
        Class1393.Method5503().Method1890("5000 ms complete");
        Class1393.Method5506().Method1888("5000 ms");
        Class1393.Method5504().Method1892("5000 ms");
        Class1393.Method5507().Method1875("warn 5000 ms");
        this.Field10798.Method2801();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x1D04 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

