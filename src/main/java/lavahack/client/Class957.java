//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.io.*;

public class Class957
{
    private String Field12076 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static String Method3925(final long lng) {
        if (lng < 1024L) {
            return lng + " B";
        }
        final int n = (int)(Math.log((double)lng) / Math.log(Double.longBitsToDouble((long)46708753 ^ 0x4090000002C8B811L)));
        return String.format("%3.0f %sB", lng / Math.pow(Double.longBitsToDouble((long)348374186 ^ 0x4090000014C3C4AAL), n), "KMGTPE".charAt(n - 1) + "i");
    }
    
    public static boolean Method3926(final File parent, final String child) {
        return Method3927(parent, new File(parent, child));
    }
    
    public static boolean Method3927(final File file, final File file2) {
        return file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator);
    }
    
    private static String Method3928(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE4E ^ 0xB7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
