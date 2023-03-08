//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1430
{
    Field14681("Normal", 0), 
    Field14682("Silent", 1);
    
    private static final Class1430[] Field14683;
    private int Field14684;
    
    private Class1430(final String name, final int ordinal) {
    }
    
    static {
        Field14683 = new Class1430[] { Class1430.Field14681, Class1430.Field14682 };
    }
    
    private static String Method5717(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x294B ^ 0x14));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
