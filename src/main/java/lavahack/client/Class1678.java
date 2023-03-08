//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1678
{
    Field15814("PlaceBreak", 0), 
    Field15815("BreakPlace", 1);
    
    private static final Class1678[] Field15816;
    private int Field15817;
    
    private Class1678(final String name, final int ordinal) {
    }
    
    static {
        Field15816 = new Class1678[] { Class1678.Field15814, Class1678.Field15815 };
    }
    
    private static String Method6470(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xDFA ^ 0x99));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
