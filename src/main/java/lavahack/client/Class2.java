//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1185;
import lavahack.client.Class1796;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class97;

@Class1887
public class Class2
extends Class42 {
    private final Class618 Field7827 = new Class618(Class1185::Method158, new Predicate[0]);
    private int Field7828;

    public Class2() {
        super("LiquidInteract", Class97.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field7827);
        if (Class2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null) {
            if (Class2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field7827);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x2F18 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

