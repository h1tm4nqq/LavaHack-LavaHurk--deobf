//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1618
{
    Field15570("Place", 0), 
    Field15571("Tick", 1);
    
    private static final Class1618[] Field15572;
    private int Field15573;
    
    private Class1618(final String name, final int ordinal) {
    }
    
    static {
        Field15572 = new Class1618[] { Class1618.Field15570, Class1618.Field15571 };
    }
    
    private static String Method6305(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1091 ^ 0x88));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
