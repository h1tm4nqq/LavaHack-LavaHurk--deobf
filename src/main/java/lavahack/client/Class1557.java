//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;

public class Class1557
extends Class42 {
    private boolean Field15267;
    private int Field15268;

    public Class1557() {
        super("AntiAutoJump", Class97.Field8343);
    }

    @Override
    public void Method38() {
        this.Field15267 = Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump;
    }

    @Override
    public void Method45() {
        if (!Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump) return;
        Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump = false;
    }

    @Override
    public void Method39() {
        Class1557.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump = this.Field15267;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 106;
            cArray2[n] = (char)(cArray[n] ^ (0x5A8A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

