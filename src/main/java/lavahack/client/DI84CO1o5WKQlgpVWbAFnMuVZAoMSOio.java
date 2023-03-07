//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field12238 = (int)((long)1267302038 ^ (long)1267302038);
    private String Field12239 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio() {
        super("HelloWorld", "Test module, print \"Hello, World\" into the chat every 5 seconds", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
    }

    @Override
    public void Method39() {
        super.Method39();
        if (DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
    }

    @Override
    public void Method45() {
        if (DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (DI84CO1o5WKQlgpVWbAFnMuVZAoMSOio.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field12238 += (int)607006391L ^ 0x242E2EB6;
        if (this.Field12238 <= (int)((long)1254546961 ^ (long)1254546952) << 2) return;
        this.Field12238 = (int)1270844563L ^ 0x4BBF8C93;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1093700180L ^ 0x41308A54;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1512593776L ^ 0xA5D7A66F);
            int n2 = (int)1435736571L ^ 0x5593995A;
            cArray2[n] = (char)(cArray[n] ^ ((int)-142596889L ^ 0xF78000EE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

