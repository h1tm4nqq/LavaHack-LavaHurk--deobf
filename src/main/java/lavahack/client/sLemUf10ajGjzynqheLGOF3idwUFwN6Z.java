//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class sLemUf10ajGjzynqheLGOF3idwUFwN6Z
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15712;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15713;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15714;
    private String Field15715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public sLemUf10ajGjzynqheLGOF3idwUFwN6Z() {
        super("Weather", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        String[] stringArray = new String[((int)2073729870L ^ 0x7B9A9B4F) << 1];
        stringArray[(int)((long)-1310404192 ^ (long)-1310404192)] = "Mode";
        stringArray[(int)((long)-1638029927 ^ (long)-1638029928)] = "Custom";
        this.Field15712 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Type", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Mode", Arrays.asList(stringArray)));
        String[] stringArray2 = new String[(int)((long)1216354333 ^ (long)1216354332) << 2];
        stringArray2[(int)((long)-1511956599 ^ (long)-1511956599)] = "Default";
        stringArray2[(int)-36134643L ^ 0xFDD8A10C] = "Sunny";
        stringArray2[((int)1883429933L ^ 0x7042DC2C) << 1] = "Rain";
        stringArray2[(int)-393166331L ^ 0xE890C206] = "Thunder";
        this.Field15713 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, "Sunny", Arrays.asList(stringArray2)).Method313(this::Method6412));
        this.Field15714 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Custom", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x1B76A48E2C511579L ^ 0x5B76A48E2C511579L), (boolean)((long)-220821298 ^ (long)-220821298)).Method313(this::Method6411));
    }

    @Override
    public void Method45() {
        float f;
        if (sLemUf10ajGjzynqheLGOF3idwUFwN6Z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (sLemUf10ajGjzynqheLGOF3idwUFwN6Z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        float f2 = f = this.Field15713.Method352() == 0 ? (float)(this.Field15713.Method352() - ((int)1186738442L ^ 0x46BC310B)) : this.Field15714.Method368();
        if (!this.Field15712.Method359().equals("Custom")) {
            if (this.Field15713.Method352() <= 0) return;
        }
        sLemUf10ajGjzynqheLGOF3idwUFwN6Z.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setRainStrength(f);
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
        int n = (int)1256950023L ^ 0x4AEB8907;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)967237186 ^ (long)967237309);
            int n2 = (int)-390553365L ^ 0xE8B8A058;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)58900664 ^ (long)58908915) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

