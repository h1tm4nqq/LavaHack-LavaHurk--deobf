//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import net.minecraft.client.*;
import java.io.*;

public class Class811 extends Class158
{
    private String Field11472 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class811() {
        super("opendir");
    }
    
    public void Method443(final String s, final String[] array) {
        Desktop.getDesktop().open(new File(Minecraft.getMinecraft().gameDir + "kisman.cc/"));
    }
    
    public String Method447() {
        return "opening minecraft's directory";
    }
    
    public String Method448() {
        return "opendir";
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7FEC ^ 0xA6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
