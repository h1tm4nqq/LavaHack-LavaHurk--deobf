//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1369
{
    Field14228("None", 0), 
    Field14229("Sunrise", 1);
    
    private static final Class1369[] Field14230;
    private int Field14231;
    
    private Class1369(final String name, final int ordinal) {
    }
    
    static {
        Field14230 = new Class1369[] { Class1369.Field14228, Class1369.Field14229 };
    }
    
    private static String Method5463(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x14DD ^ 0x99));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
