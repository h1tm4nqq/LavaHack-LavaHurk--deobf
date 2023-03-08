//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1517
{
    Field15103("MAINHAND", 0), 
    Field15104("OFFHAND", 1), 
    Field15105("PACKET", 2), 
    Field15106("NONE", 3);
    
    private static final Class1517[] Field15107;
    private String Field15108 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1517(final String name, final int ordinal) {
    }
    
    static {
        Field15107 = new Class1517[] { Class1517.Field15103, Class1517.Field15104, Class1517.Field15105, Class1517.Field15106 };
    }
    
    private static String Method6047(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x49D0 ^ 0x68));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
