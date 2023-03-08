//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1772
{
    Field16121("None", 0), 
    Field16122("Stupid", 1), 
    Field16123("Smart", 2);
    
    private static final Class1772[] Field16124;
    private String Field16125 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1772(final String name, final int ordinal) {
    }
    
    static {
        Field16124 = new Class1772[] { Class1772.Field16121, Class1772.Field16122, Class1772.Field16123 };
    }
    
    private static String Method6717(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7C05 ^ 0x3A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
