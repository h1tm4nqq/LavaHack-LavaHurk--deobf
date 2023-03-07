//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class vrXAEezver5yZHPecErcvPHwXVYRqhGR
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8902 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ChinkRange", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 1.0, Double.longBitsToDouble(0x4D3E6BE535959AE3L ^ 0xD366BE535959AE3L), (boolean)((long)-1420031253 ^ (long)-1420031254)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8903 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Credit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1271385701 ^ (long)-1271385702)));
    private String Field8904 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public vrXAEezver5yZHPecErcvPHwXVYRqhGR() {
        super("SeedOverlay", "This module was provided by TudbuT", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (vrXAEezver5yZHPecErcvPHwXVYRqhGR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || vrXAEezver5yZHPecErcvPHwXVYRqhGR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (!this.Field8903.Method365()) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("You don't have credit on! :( It is recommended to turn it on");
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("This module was provided by TudbuT (TudbuT#2624)");
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Check out his code here: https://github.com/TudbuT/ttc");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)689982601 ^ (long)689982601);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2045489443L ^ 0x86144E22);
            int n2 = ((int)592558351L ^ 0x2351B908) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)110263296 ^ (long)110252405) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

