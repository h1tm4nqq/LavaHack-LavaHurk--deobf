//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import java.awt.Desktop;
import java.io.File;
import lavahack.client.Class158;
import net.minecraft.client.Minecraft;

public class Class811
extends Class158 {
    private String Field11472 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class811() {
        super("opendir");
    }

    @Override
    public void Method443(String string, String[] stringArray) {
        File file = new File(Minecraft.getMinecraft().gameDir + "kisman.cc/");
        Desktop.getDesktop().open(file);
    }

    @Override
    public String Method447() {
        return "opening minecraft's directory";
    }

    @Override
    public String Method448() {
        return "opendir";
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 166;
            cArray2[n] = (char)(cArray[n] ^ (0x7FEC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

