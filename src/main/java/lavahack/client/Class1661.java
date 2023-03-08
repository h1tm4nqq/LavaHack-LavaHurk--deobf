//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1661
{
    Field15734("Place", 0), 
    Field15735("RunSurround", 1);
    
    private static final Class1661[] Field15736;
    private String Field15737 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1661(final String name, final int ordinal) {
    }
    
    static {
        Field15736 = new Class1661[] { Class1661.Field15734, Class1661.Field15735 };
    }
    
    private static String Method6433(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x259E ^ 0x1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
