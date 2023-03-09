//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1185;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;

public class Class1802
extends Class42 {
    @Class1801
    private final Class618 Field16304 = new Class618(Class1185::Method158, new Predicate[0]);
    private int Field16305;

    public Class1802() {
        super("NoBobbing", Class97.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1802.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1802.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1796.Field16242.Method706(this.Field16304);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field16304);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x5722 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

