//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 */
package lavahack.client;

import lavahack.client.Class1309;
import lavahack.client.Class1763;
import net.minecraft.init.Blocks;

public enum Class613 {
    Field10609(Class1309.Method5340().Method7663(class424 -> Blocks.OBSIDIAN)),
    Field10610(Class1309.Method5340().Method7663(class424 -> Blocks.ENDER_CHEST));

    private final Class1763 Field10611;
    private String Field10613 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class613() {
        void var3_1;
        this.Field10611 = var3_1;
    }

    public Class1763 Method2630() {
        return this.Field10611;
    }

    private static String Method2633(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 237;
            cArray2[n] = (char)(cArray[n] ^ (0x7E94 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

