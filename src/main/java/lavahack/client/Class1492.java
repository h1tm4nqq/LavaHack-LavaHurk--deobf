//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1492
{
    Field14977("Normal", 0), 
    Field14978("Camera", 1);
    
    private static final Class1492[] Field14979;
    private String Field14980 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1492(final String name, final int ordinal) {
    }
    
    static {
        Field14979 = new Class1492[] { Class1492.Field14977, Class1492.Field14978 };
    }
    
    private static String Method5972(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x561 ^ 0x46));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
