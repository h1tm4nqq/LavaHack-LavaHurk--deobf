//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class1732
extends Class42 {
    private final Class44 Field15943 = this.Method23(new Class44("LeftClick", (Class42)this, false));
    private final Class44 Field15944 = this.Method23(new Class44("LeftClickDelay", (Class42)this, Double.longBitsToDouble(0x4010000000000000L), 0.0, Double.longBitsToDouble((long)777301934 ^ 0x404400002E54AFAEL), true));
    private final Class44 Field15945 = this.Method23(new Class44("RightClick", (Class42)this, true));
    private final Class44 Field15946 = this.Method23(new Class44("RightClickDelay", (Class42)this, Double.longBitsToDouble((long)513726562 ^ 0x401000001E9ED862L), 0.0, Double.longBitsToDouble(0x4044000000000000L), true));
    private String Field15947 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1732() {
        super("ClickDelayTimer", Class97.Field8343);
    }

    @Override
    public void Method45() {
        if (Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method20();
        this.Method6600();
    }

    private void Method20() {
        if (!this.Field15943.Method365()) {
            return;
        }
        if (Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field15944.Method335() == 0) return;
    }

    private void Method6600() {
        if (!this.Field15945.Method365()) {
            return;
        }
        if (Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field15946.Method335() == 0) return;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 150;
            cArray2[n] = (char)(cArray[n] ^ (0x7381 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

