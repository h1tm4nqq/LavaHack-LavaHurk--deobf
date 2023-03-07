//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.WkowkMIYywGBZ1LvpVpVCHmyCihJiruH;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class XRnOrnvd3PUTtonEM6a95PlvJuNTEqkI
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field7827 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(WkowkMIYywGBZ1LvpVpVCHmyCihJiruH::Method158, new Predicate[(int)1226529078L ^ 0x491B5936]);
    private int Field7828;

    public XRnOrnvd3PUTtonEM6a95PlvJuNTEqkI() {
        super("LiquidInteract", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field7827);
        if (XRnOrnvd3PUTtonEM6a95PlvJuNTEqkI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            if (XRnOrnvd3PUTtonEM6a95PlvJuNTEqkI.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field7827);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-247514433 ^ (long)-247514433);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)817628389L ^ 0x30BC041A);
            int n2 = (int)((long)204651589 ^ (long)204651526) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1193095650L ^ 0xB8E2CBFD) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

