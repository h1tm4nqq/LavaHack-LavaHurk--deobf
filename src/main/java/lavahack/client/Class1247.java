//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1247
{
    Field13648("Full", 0), 
    Field13649("Head", 1);
    
    private static final Class1247[] Field13650;
    private int Field13651;
    
    private Class1247(final String name, final int ordinal) {
    }
    
    static {
        Field13650 = new Class1247[] { Class1247.Field13648, Class1247.Field13649 };
    }
    
    private static String Method5012(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x445 ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
