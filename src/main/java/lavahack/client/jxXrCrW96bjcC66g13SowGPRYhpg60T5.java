//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;

public class jxXrCrW96bjcC66g13SowGPRYhpg60T5
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field8922 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public jxXrCrW96bjcC66g13SowGPRYhpg60T5() {
        super("shutdown");
    }

    @Override
    public String Method447() {
        return "shuts down Minecraft";
    }

    @Override
    public String Method448() {
        return "shutdown client/hard/crash";
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        if (stringArray[(int)452979310L ^ 0x1AFFEA6E].equals("client")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.shutdownMinecraftApplet();
            return;
        }
        if (stringArray[(int)((long)1628059928 ^ (long)1628059928)].equals("hard")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.shutdown();
            return;
        }
        if (!stringArray[(int)103217603L ^ 0x626F9C3].equals("crash")) return;
        System.exit((int)((long)-891610842 ^ (long)-891610841));
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1751037630 ^ (long)1751037630);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)865969704L ^ 0x339DA6D7);
            int n2 = ((int)1948942525L ^ 0x742A8086) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-619826895L ^ 0xDB0E258E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

