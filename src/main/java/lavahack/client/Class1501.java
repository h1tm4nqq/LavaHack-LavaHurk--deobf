//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1501
{
    Field15039("None", 0), 
    Field15040("Semi", 1), 
    Field15041("Full", 2);
    
    private static final Class1501[] Field15042;
    private String Field15043 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1501(final String name, final int ordinal) {
    }
    
    static {
        Field15042 = new Class1501[] { Class1501.Field15039, Class1501.Field15040, Class1501.Field15041 };
    }
    
    private static String Method6020(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1E0C ^ 0x3A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
