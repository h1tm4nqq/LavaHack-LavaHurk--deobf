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
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import net.minecraft.client.Minecraft;

public class b272XgR996ViXSPYVF4VjDSYHackdFq8
extends FrvoqED59Mj96pmO7hxn2tEew1fZAOzj {
    private String Field11472 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public b272XgR996ViXSPYVF4VjDSYHackdFq8() {
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
        int n = (int)((long)-1107265934 ^ (long)-1107265934);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)890538099L ^ 0x3514888C);
            int n2 = (int)((long)800815254 ^ (long)800815301) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1808622533L ^ 0x943283C0) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

