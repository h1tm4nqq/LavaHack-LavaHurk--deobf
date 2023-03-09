//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class1077;
import lavahack.client.Class1393;
import lavahack.client.Class251;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class93;
import lavahack.client.Class97;

public class Class1506
extends Class42 {
    private final Class44 Field15055 = this.Method23(new Class44("Count", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 1.0, Double.longBitsToDouble(0x4049000000000000L), true));
    private final Class44 Field15056 = this.Method23(new Class44("Delay", (Class42)this, Double.longBitsToDouble(4647503709213818880L), 0.0, Double.longBitsToDouble(4656510908468559872L), Class467.Field9943));
    private Class93 Field15057;
    private String Field15058 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1506() {
        super("LavaHackOwns", Class97.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1506.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1506.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field15057 = new Class93(Class251.Field9121, Class1077.Field12793, this.Field15056.Method335(), this.Field15055.Method335(), Class1506::Method20);
        this.Field15057.Method793().start();
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field15057.Method793().stop();
    }

    private static void Method20() {
        Class1393.Method5505().Method1875("LavaHack owns!");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 148;
            cArray2[n] = (char)(cArray[n] ^ (0x4F53 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

