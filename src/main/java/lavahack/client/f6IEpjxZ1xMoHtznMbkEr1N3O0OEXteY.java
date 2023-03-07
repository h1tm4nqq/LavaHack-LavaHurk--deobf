//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class f6IEpjxZ1xMoHtznMbkEr1N3O0OEXteY
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private boolean Field15267;
    private int Field15268;

    public f6IEpjxZ1xMoHtznMbkEr1N3O0OEXteY() {
        super("AntiAutoJump", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method38() {
        this.Field15267 = f6IEpjxZ1xMoHtznMbkEr1N3O0OEXteY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump;
    }

    @Override
    public void Method45() {
        if (!f6IEpjxZ1xMoHtznMbkEr1N3O0OEXteY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump) return;
        f6IEpjxZ1xMoHtznMbkEr1N3O0OEXteY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump = (int)((long)-1917048082 ^ (long)-1917048082);
    }

    @Override
    public void Method39() {
        f6IEpjxZ1xMoHtznMbkEr1N3O0OEXteY.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.gameSettings.autoJump = this.Field15267;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-347626649 ^ (long)-347626649);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)191003718L ^ 0xB627CB9);
            int n2 = ((int)-477781682L ^ 0xE385A17B) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1582368617L ^ 0xA1AED5D2) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

