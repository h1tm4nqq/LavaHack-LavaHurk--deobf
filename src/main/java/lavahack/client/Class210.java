//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class210
extends Class42 {
    private final Class44 Field8902 = this.Method23(new Class44("ChinkRange", (Class42)this, 1.0, 1.0, Double.longBitsToDouble(0x4008000000000000L), true));
    private final Class44 Field8903 = this.Method23(new Class44("Credit", (Class42)this, true));
    private String Field8904 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class210() {
        super("SeedOverlay", "This module was provided by TudbuT", Class97.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class210.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class210.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (!this.Field8903.Method365()) {
            Class1393.Method5505().Method1886("You don't have credit on! :( It is recommended to turn it on");
            return;
        }
        Class1393.Method5505().Method1886("This module was provided by TudbuT (TudbuT#2624)");
        Class1393.Method5505().Method1886("Check out his code here: https://github.com/TudbuT/ttc");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 112;
            cArray2[n] = (char)(cArray[n] ^ (0x2D75 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

