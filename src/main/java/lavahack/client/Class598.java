//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1393;
import lavahack.client.Class1594;
import lavahack.client.Class1786;
import lavahack.client.Class42;
import lavahack.client.Class97;

public class Class598
extends Class42 {
    private long Field10542 = 0L;
    private int Field10543;

    public Class598() {
        super("EventSystemTest", Class97.Field8345);
    }

    @Class1786
    @Class1786
    public void Method2582(Class1594 class1594) {
        if (Class598.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class598.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        Class1393.Method5505().Method1886("Ticks passed" + this.Field10542++);
    }

    @Override
    public void Method45() {
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 129;
            cArray2[n] = (char)(cArray[n] ^ (0x1908 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

