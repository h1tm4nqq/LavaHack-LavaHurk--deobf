//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1197
{
    Field13433("None", 0), 
    Field13434("Millis", 1), 
    Field13435("Ticks", 2);
    
    private static final Class1197[] Field13436;
    private String Field13437 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1197(final String name, final int ordinal) {
    }
    
    static {
        Field13436 = new Class1197[] { Class1197.Field13433, Class1197.Field13434, Class1197.Field13435 };
    }
    
    private static String Method4829(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5AD3 ^ 0x39));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
