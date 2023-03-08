//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

enum Class557
{
    Field10369("Obsidian", 0, class410 -> class410 != Class410.Field9697), 
    Field10370("Bedrock", 1, class411 -> class411 == Class410.Field9697), 
    Field10371("Both", 2, (Predicate)Class557::lambda$static$2);
    
    private final Predicate Field10372;
    private static final Class557[] Field10373;
    private String Field10374 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class557(final String name, final int ordinal, final Predicate field10372) {
        this.Field10372 = field10372;
    }
    
    public boolean Method2468(final Class410 class410) {
        return this.Field10372.test(class410);
    }
    
    static {
        Field10373 = new Class557[] { Class557.Field10369, Class557.Field10370, Class557.Field10371 };
    }
    
    private static String Method2471(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2473 ^ 0xCB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
