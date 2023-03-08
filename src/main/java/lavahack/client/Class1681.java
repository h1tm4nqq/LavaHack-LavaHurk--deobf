//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1681
{
    Field15821("Linear", 0), 
    Field15822("Curve", 1), 
    Field15823("Sin", 2);
    
    private static final Class1681[] Field15824;
    private int Field15825;
    
    private Class1681(final String name, final int ordinal) {
    }
    
    static {
        Field15824 = new Class1681[] { Class1681.Field15821, Class1681.Field15822, Class1681.Field15823 };
    }
    
    private static String Method6474(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF05 ^ 0x5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
