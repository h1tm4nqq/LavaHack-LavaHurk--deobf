//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.Class158;

public class Class215
extends Class158 {
    private String Field8922 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class215() {
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
        if (stringArray[0].equals("client")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.shutdownMinecraftApplet();
            return;
        }
        if (stringArray[0].equals("hard")) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.shutdown();
            return;
        }
        if (!stringArray[0].equals("crash")) return;
        System.exit(1);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 236;
            cArray2[n] = (char)(cArray[n] ^ (0x14BF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

