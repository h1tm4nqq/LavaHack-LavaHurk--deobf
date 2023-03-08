//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import java.util.*;

public enum Class467
{
    Field9942("PERCENT", 0, n -> String.format(Locale.ENGLISH, "%.1f%%", n.floatValue())), 
    Field9943("TIME", 1, n2 -> Class182.Field8796.Method1102(n2.longValue())), 
    Field9944("DECIMAL", 2, n3 -> String.format(Locale.ENGLISH, "%.4f", n3.floatValue())), 
    Field9945("INTEGER", 3, n4 -> Long.toString(n4.longValue()));
    
    private Function Field9946;
    private static final Class467[] Field9947;
    private int Field9948;
    
    private Class467(final String name, final int ordinal, final Function field9946) {
        this.Field9946 = field9946;
    }
    
    public Function Method2190() {
        return this.Field9946;
    }
    
    static {
        Field9947 = new Class467[] { Class467.Field9942, Class467.Field9943, Class467.Field9944, Class467.Field9945 };
    }
    
    private static String Method2195(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x25DB ^ 0xE5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
