//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import java.net.*;

class Class578 extends Class1368
{
    private String Field10467 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class578(final Class158 class158) {
        super("dir", class158);
    }
    
    public void Method443(final String s, final String[] array) {
        final Class813 class813 = (Class813)this.Method2057();
        if (array.length < 2) {
            return;
        }
        if (array[1].equals("file")) {
            if (array.length < 3) {
                return;
            }
            final File file = new File(Class813.Method3422(class813) ? Class813.Method3423(array, 2) : array[2]);
            if (!file.exists() || file.isDirectory()) {
                return;
            }
            Class813.Method3425(Class813.Method3424(), file.toURI().toURL().toExternalForm());
        }
        else {
            if (!array[1].equals("url")) {
                if (array[1].equals("clear")) {
                    Class813.Method3425(Class813.Method3424(), "");
                    this.Method437("Cleared the music user directory");
                }
                return;
            }
            if (array.length < 3) {
                return;
            }
            final URL url = new URL(Class813.Method3422(class813) ? Class813.Method3423(array, 2) : array[2]);
            Class813.Method3425(Class813.Method3424(), url.toExternalForm());
            this.Method437("Set music user directory url to: " + url.toExternalForm());
        }
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2883 ^ 0x97));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
