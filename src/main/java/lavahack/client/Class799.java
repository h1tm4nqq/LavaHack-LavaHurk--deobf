//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public class Class799
{
    public static final String Field11391;
    private Map Field11392;
    private String Field11393;
    private String Field11394 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class799() {
        this.Field11392 = new LinkedHashMap();
    }
    
    public static Class799 Method3314(final String s) {
        final Class799 class799 = new Class799();
        final String[] split = s.split(";");
        class799.Field11393 = split[0].trim();
        for (int i = 1; i < split.length; ++i) {
            final String[] split2 = split[i].split("=");
            String s2 = "";
            if (split2.length > 1) {
                String s3 = split2[1].trim();
                if ((s3.startsWith("\"") && s3.endsWith("\"")) || (s3.startsWith("'") && s3.endsWith("'") && s3.length() > 2)) {
                    s3 = s3.substring(1, s3.length() - 1);
                }
                s2 = s3;
            }
            class799.Field11392.put(split2[0].trim(), s2);
        }
        return class799;
    }
    
    public String Method3315() {
        return this.Field11393;
    }
    
    public Map Method3316() {
        return this.Field11392;
    }
    
    static {
        Field11391 = "";
    }
    
    private static String Method3317(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7D18 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
