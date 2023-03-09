//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1185;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;

@Class1887
public class Class1976
extends Class42 {
    @Class1801
    private final Class618 Field17096 = new Class618(Class1185::Method158, new Predicate[0]);
    private int Field17097;

    public Class1976() {
        super("NoCrosshair", Class97.Field8342);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1976.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1976.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            Class1796.Field16242.Method705(this);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 105;
            cArray2[n] = (char)(cArray[n] ^ (0x51C9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

