//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class873;
import lavahack.client.Class97;

public class Class2173
extends Class42 {
    @Class873
    public static Class2173 Field17944;
    private int Field17945;

    public Class2173() {
        super("ModuleInstancingJava", "Tests @ModuleInstance annotation in java", Class97.Field8345);
    }

    @Override
    public void Method45() {
        if (Class2173.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2173.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1393.Method5506().Method1886("Instance of module " + this.Method40() + " is " + "NULL");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 166;
            cArray2[n] = (char)(cArray[n] ^ (0x57A3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

