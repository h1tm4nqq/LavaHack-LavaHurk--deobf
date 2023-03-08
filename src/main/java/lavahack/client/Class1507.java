//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1507
{
    Field15059("Tick", 0), 
    Field15060("Update", 1);
    
    private static final Class1507[] Field15061;
    private String Field15062 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1507(final String name, final int ordinal) {
    }
    
    static {
        Field15061 = new Class1507[] { Class1507.Field15059, Class1507.Field15060 };
    }
    
    private static String Method6027(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7082 ^ 0xF8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
