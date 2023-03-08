//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import java.net.*;

class Class2113 extends Class1368
{
    private String Field17608 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2113(final Class158 class158) {
        super("play", class158);
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
            final URL url = file.toURI().toURL();
            Class1617.Method6297(url.toExternalForm());
            this.Method437("Now playing: " + url.toExternalForm());
        }
        else {
            if (!array[1].equals("url")) {
                final String s2 = Class813.Method3422(class813) ? Class813.Method3423(array, 1) : array[1];
                Class1617.Method6297(Class813.Method3426(Class813.Method3424()) + s2);
                this.Method437("Now playing: " + Class813.Method3426(Class813.Method3424()) + s2);
                return;
            }
            if (array.length < 3) {
                return;
            }
            final URL url2 = new URL(Class813.Method3422(class813) ? Class813.Method3423(array, 2) : array[2]);
            Class1617.Method6297(url2.toExternalForm());
            this.Method437("Now playing: " + url2.toExternalForm());
        }
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4799 ^ 0xDB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
