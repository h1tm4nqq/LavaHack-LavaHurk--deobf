//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class1998
extends Class42 {
    private final Class44 Field17178 = this.Method23(new Class44("Jumps", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), Double.longBitsToDouble((long)1713642386 ^ 0x4008000066241B92L), Double.longBitsToDouble(0x4049000000000000L), true));
    private final Class44 Field17179 = this.Method23(new Class44("JumpTimer", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), 1.0, Double.longBitsToDouble(4652007308841189376L), true));
    private int Field17180;
    private String Field17181 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1998() {
        super("SelfDamage", "SelfDamage", Class97.Field8343);
    }

    @Override
    public void Method38() {
        this.Field17180 = 0;
    }

    @Override
    public void Method39() {
        Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = 1.0f;
    }

    @Override
    public void Method45() {
        if (Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if ((double)this.Field17180 < this.Field17178.Method367()) {
            Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = this.Field17179.Method368();
            Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
        }
        if (!Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        if ((double)this.Field17180 < this.Field17178.Method367()) {
            Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
            ++this.Field17180;
            return;
        }
        Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = 1.0f;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 48;
            cArray2[n] = (char)(cArray[n] ^ (0x2E7A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

