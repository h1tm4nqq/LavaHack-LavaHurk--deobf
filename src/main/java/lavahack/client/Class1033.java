//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1033
{
    Field12531("Place", 0), 
    Field12532("Crystal", 1);
    
    private static final Class1033[] Field12533;
    private String Field12534 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1033(final String name, final int ordinal) {
    }
    
    static {
        Field12533 = new Class1033[] { Class1033.Field12531, Class1033.Field12532 };
    }
    
    private static String Method4185(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3320 ^ 0xDD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
