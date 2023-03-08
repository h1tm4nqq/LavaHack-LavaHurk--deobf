//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1478
{
    Field14890("Left", 0), 
    Field14891("Right", 1);
    
    private static final Class1478[] Field14892;
    private String Field14893 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1478(final String name, final int ordinal) {
    }
    
    static {
        Field14892 = new Class1478[] { Class1478.Field14890, Class1478.Field14891 };
    }
    
    private static String Method5921(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x721A ^ 0x63));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
