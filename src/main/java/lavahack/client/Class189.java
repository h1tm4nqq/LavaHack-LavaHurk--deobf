//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.regex.*;

public class Class189 implements Class1234
{
    private static final Pattern Field8840;
    private static final Pattern Field8841;
    private final String Field8842;
    private String Field8843 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class189(final String field8842) {
        if (field8842 == null) {
            throw new IllegalArgumentException();
        }
        this.Field8842 = field8842;
    }
    
    public boolean Method1144(final String input) {
        if ("".equals(this.Field8842)) {
            return true;
        }
        final String[] split = Class189.Field8841.split(Class189.Field8840.matcher(input).replaceAll(""));
        for (int length = split.length, i = 0; i < length; ++i) {
            if (this.Field8842.equals(split[i])) {
                return true;
            }
        }
        return false;
    }
    
    public String Method1145() {
        return this.Field8842;
    }
    
    public Class1234 Method1146() {
        return (Class1234)new Class189(this.Method1145());
    }
    
    @Override
    public String toString() {
        return this.Method1145();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.Field8842.equals(((Class189)o).Field8842));
    }
    
    @Override
    public int hashCode() {
        return this.Field8842.hashCode();
    }
    
    static {
        Field8840 = Pattern.compile(" ");
        Field8841 = Pattern.compile(",");
    }
    
    private static String Method1147(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3204 ^ 0x50));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
