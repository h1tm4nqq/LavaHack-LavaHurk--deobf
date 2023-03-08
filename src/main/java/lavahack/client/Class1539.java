//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1539
{
    Field15184("Sequential", 0), 
    Field15185("Adaptive", 1);
    
    private static final Class1539[] Field15186;
    private String Field15187 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1539(final String name, final int ordinal) {
    }
    
    static {
        Field15186 = new Class1539[] { Class1539.Field15184, Class1539.Field15185 };
    }
    
    private static String Method6086(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x40D9 ^ 0xB3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
