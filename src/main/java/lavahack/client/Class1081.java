//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;

public enum Class1081
{
    Field12820("NAME_ASC", 0, "name", "\u2191", (class1947, class1951) -> class1947.Method7229().compareTo(class1951.Method7229())), 
    Field12821("NAME_DESC", 1, "name", "\u2193", (class1948, class1952) -> class1952.Method7229().compareTo(class1948.Method7229())), 
    Field12822("SIZE_ASC", 2, "amount", "\u2191", (class1949, class1953) -> class1949.Field16999 - class1953.Field16999), 
    Field12823("SIZE_DESC", 3, "amount", "\u2193", (class1950, class1954) -> class1954.Field16999 - class1950.Field16999);
    
    private final Comparator Field12824;
    public final String Field12825;
    public final String Field12826;
    private static final Class1081[] Field12827;
    private int Field12828;
    
    private Class1081(final String name, final int ordinal, final String field12825, final String field12826, final Comparator field12827) {
        this.Field12825 = field12825;
        this.Field12826 = field12826;
        this.Field12824 = field12827;
    }
    
    public void Method4360(final List list) {
        Collections.sort((List<Object>)list, this.Field12824);
    }
    
    public Class1081 Method4361() {
        final Class1081[] values = values();
        return values[(this.ordinal() + 1) % values.length];
    }
    
    public static Class1081 Method4362(final String s) {
        return valueOf(s);
    }
    
    static {
        Field12827 = new Class1081[] { Class1081.Field12820, Class1081.Field12821, Class1081.Field12822, Class1081.Field12823 };
    }
    
    private static String Method4367(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3601 ^ 0xFF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
