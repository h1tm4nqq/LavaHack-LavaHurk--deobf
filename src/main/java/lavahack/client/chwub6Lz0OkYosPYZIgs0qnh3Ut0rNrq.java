//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class chwub6Lz0OkYosPYZIgs0qnh3Ut0rNrq
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10798 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private String Field10799 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public chwub6Lz0OkYosPYZIgs0qnh3Ut0rNrq() {
        super("ChatPrint", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505();
    }

    @Override
    public void Method45() {
        if (chwub6Lz0OkYosPYZIgs0qnh3Ut0rNrq.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (chwub6Lz0OkYosPYZIgs0qnh3Ut0rNrq.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Field10798.Method2797(0x11D43788L & 0x4022D3C9L)) return;
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("5000 ms passed");
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5503().Method1890("5000 ms complete");
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1888("5000 ms");
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1892("5000 ms");
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5507().Method1875("warn 5000 ms");
        this.Field10798.Method2801();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-104418098 ^ (long)-104418098);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)823537266L ^ 0x31162E8D);
            int n2 = (int)-262043392L ^ 0xF06189ED;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1878083897 ^ (long)-1878085242) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

