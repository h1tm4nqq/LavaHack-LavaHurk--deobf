//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1704
{
    Field15887("Single", 0), 
    Field15888("All", 1);
    
    private static final Class1704[] Field15889;
    private String Field15890 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1704(final String name, final int ordinal) {
    }
    
    static {
        Field15889 = new Class1704[] { Class1704.Field15887, Class1704.Field15888 };
    }
    
    private static String Method6531(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6571 ^ 0x51));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
