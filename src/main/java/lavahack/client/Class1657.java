//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;

public class Class1657
extends Class42 {
    private final Class44 Field15712 = this.Method23(new Class44("Type", (Class42)this, "Mode", Arrays.asList("Mode", "Custom")));
    private final Class44 Field15713 = this.Method23(new Class44("Mode", (Class42)this, "Sunny", Arrays.asList("Default", "Sunny", "Rain", "Thunder")).Method313(this::Method6412));
    private final Class44 Field15714 = this.Method23(new Class44("Custom", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4000000000000000L), false).Method313(this::Method6411));
    private String Field15715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1657() {
        super("Weather", Class97.Field8343);
    }

    @Override
    public void Method45() {
        float f;
        if (Class1657.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class1657.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        float f2 = f = this.Field15713.Method352() == 0 ? (float)(this.Field15713.Method352() - 1) : this.Field15714.Method368();
        if (!this.Field15712.Method359().equals("Custom")) {
            if (this.Field15713.Method352() <= 0) return;
        }
        Class1657.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setRainStrength(f);
    }

    private Boolean Method6411() {
        return this.Field15712.Method359().equals("Custom");
    }

    private Boolean Method6412() {
        return this.Field15712.Method359().equals("Mode");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 179;
            cArray2[n] = (char)(cArray[n] ^ (0x4096 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

