//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;

public class Class988
extends Class42 {
    private int Field12238 = 0;
    private String Field12239 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class988() {
        super("HelloWorld", "Test module, print \"Hello, World\" into the chat every 5 seconds", Class97.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
    }

    @Override
    public void Method39() {
        super.Method39();
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
    }

    @Override
    public void Method45() {
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        ++this.Field12238;
        if (this.Field12238 <= 100) return;
        this.Field12238 = 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0x2409 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

