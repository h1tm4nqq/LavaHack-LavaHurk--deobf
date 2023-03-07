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
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;

public class kpL7LpRwiv1HqV5hKsuAg0E2cHYSV1uz
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field16304 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(WkowkMIYywGBZ1LvpVpVCHmyCihJiruH::Method158, new Predicate[(int)-750098544L ^ 0xD34A6790]);
    private int Field16305;

    public kpL7LpRwiv1HqV5hKsuAg0E2cHYSV1uz() {
        super("NoBobbing", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (kpL7LpRwiv1HqV5hKsuAg0E2cHYSV1uz.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (kpL7LpRwiv1HqV5hKsuAg0E2cHYSV1uz.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field16304);
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field16304);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1780665086L ^ 0x95DD3502;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)799258568 ^ (long)799258423);
            int n2 = (int)2079149806L ^ 0x7BED4EE1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1088904006L ^ 0x40E770D7) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

