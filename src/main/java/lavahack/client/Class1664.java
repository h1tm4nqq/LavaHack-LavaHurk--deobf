//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1664
{
    Field15749("Damage", 0), 
    Field15750("MinMax", 1), 
    Field15751("Safety", 2);
    
    private static final Class1664[] Field15752;
    private String Field15753 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1664(final String name, final int ordinal) {
    }
    
    static {
        Field15752 = new Class1664[] { Class1664.Field15749, Class1664.Field15750, Class1664.Field15751 };
    }
    
    private static String Method6435(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3FD3 ^ 0xCB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
