//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

enum Class283
{
    Field9224("Single", 0, class422 -> class422 == Class422.Field9768), 
    Field9225("Double", 1, class423 -> class423 == Class422.Field9769), 
    Field9226("Both", 2, class424 -> class424 == Class422.Field9768 || class424 == Class422.Field9769);
    
    private final Predicate Field9227;
    private static final Class283[] Field9228;
    private String Field9229 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class283(final String name, final int ordinal, final Predicate field9227) {
        this.Field9227 = field9227;
    }
    
    public boolean Method1495(final Class422 class422) {
        return this.Field9227.test(class422);
    }
    
    static {
        Field9228 = new Class283[] { Class283.Field9224, Class283.Field9225, Class283.Field9226 };
    }
    
    private static String Method1499(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x624C ^ 0x11));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
