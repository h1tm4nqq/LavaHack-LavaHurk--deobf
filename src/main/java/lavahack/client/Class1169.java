//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;
import org.apache.commons.io.*;
import java.util.*;

public class Class1169 implements FileFilter
{
    private final boolean Field13270;
    private String Field13271 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1169(final boolean field13270) {
        this.Field13270 = field13270;
    }
    
    @Override
    public boolean accept(final File file) {
        if (this.Field13270) {
            return file.isDirectory();
        }
        final String string = "." + FilenameUtils.getExtension(file.getName().toLowerCase(Locale.ROOT));
        final Iterator<Class153> iterator = Class153.Field8593.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().Method993().equals(string)) {
                return true;
            }
        }
        return false;
    }
    
    private static String Method4695(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4DBC ^ 0xE4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
