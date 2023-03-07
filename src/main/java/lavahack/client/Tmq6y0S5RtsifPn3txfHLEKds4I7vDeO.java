//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.WkowkMIYywGBZ1LvpVpVCHmyCihJiruH;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
public class Tmq6y0S5RtsifPn3txfHLEKds4I7vDeO
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field17096 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(WkowkMIYywGBZ1LvpVpVCHmyCihJiruH::Method158, new Predicate[(int)((long)-175790865 ^ (long)-175790865)]);
    private int Field17097;

    public Tmq6y0S5RtsifPn3txfHLEKds4I7vDeO() {
        super("NoCrosshair", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Tmq6y0S5RtsifPn3txfHLEKds4I7vDeO.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Tmq6y0S5RtsifPn3txfHLEKds4I7vDeO.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method705(this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method710(this);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1235097353L ^ 0x499E1709;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-958215012 ^ (long)-958215069);
            int n2 = (int)1928397689L ^ 0x72F10310;
            cArray2[n] = (char)(cArray[n] ^ ((int)1241807266L ^ 0x4A04286B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

