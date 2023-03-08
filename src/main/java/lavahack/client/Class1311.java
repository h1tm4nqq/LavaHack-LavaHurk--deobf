//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1311
{
    Field14032("Regular", 0), 
    Field14033("Light", 1), 
    Field14034("Bold", 2);
    
    private static final Class1311[] Field14035;
    private String Field14036 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1311(final String name, final int ordinal) {
    }
    
    static {
        Field14035 = new Class1311[] { Class1311.Field14032, Class1311.Field14033, Class1311.Field14034 };
    }
    
    private static String Method5342(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x19C4 ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
