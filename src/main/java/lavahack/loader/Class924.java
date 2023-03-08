//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.util.regex.*;

public class Class924 implements Class919
{
    private static final Pattern Field11918;
    private static final Pattern Field11919;
    private final String Field11920;
    private String Field11921 = "TheKisDevs & LavaHack Development owns you";
    
    public Class924(final String field11920) {
        if (field11920 == null) {
            throw new IllegalArgumentException();
        }
        this.Field11920 = field11920;
    }
    
    public boolean Method3832(final String input) {
        if ("".equals(this.Field11920)) {
            return true;
        }
        final String[] split = Class924.Field11919.split(Class924.Field11918.matcher(input).replaceAll(""));
        for (int length = split.length, i = 0; i < length; ++i) {
            if (this.Field11920.equals(split[i])) {
                return true;
            }
        }
        return false;
    }
    
    public String Method3833() {
        return this.Field11920;
    }
    
    public Class919 Method3834() {
        return (Class919)new Class924(this.Method3833());
    }
    
    @Override
    public String toString() {
        return this.Method3833();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.Field11920.equals(((Class924)o).Field11920));
    }
    
    @Override
    public int hashCode() {
        return this.Field11920.hashCode();
    }
    
    static {
        Field11918 = Pattern.compile(" ");
        Field11919 = Pattern.compile(",");
    }
    
    private static String Method3845(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1190 ^ 0xAB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
