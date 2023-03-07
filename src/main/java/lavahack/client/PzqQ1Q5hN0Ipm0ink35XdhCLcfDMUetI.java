//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua;

public class PzqQ1Q5hN0Ipm0ink35XdhCLcfDMUetI
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @tnyCbB0n7BDf44S4AphzfC2fX3xU78Ua
    public static PzqQ1Q5hN0Ipm0ink35XdhCLcfDMUetI Field17944;
    private int Field17945;

    public PzqQ1Q5hN0Ipm0ink35XdhCLcfDMUetI() {
        super("ModuleInstancingJava", "Tests @ModuleInstance annotation in java", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method45() {
        if (PzqQ1Q5hN0Ipm0ink35XdhCLcfDMUetI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (PzqQ1Q5hN0Ipm0ink35XdhCLcfDMUetI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("Instance of module " + this.Method40() + " is " + (null == null ? "NULL" : "NOT NULL"));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)570063888L ^ 0x21FA7C10;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1837308108L ^ 0x6D831833);
            int n2 = ((int)-539982893L ^ 0xDFD08380) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2060517761L ^ 0x852EA9DC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

