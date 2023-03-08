//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1646
{
    Field15655("Torch", 0), 
    Field15656("Block", 1);
    
    private static final Class1646[] Field15657;
    private int Field15658;
    
    private Class1646(final String name, final int ordinal) {
    }
    
    static {
        Field15657 = new Class1646[] { Class1646.Field15655, Class1646.Field15656 };
    }
    
    private static String Method6389(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3EB1 ^ 0xA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
