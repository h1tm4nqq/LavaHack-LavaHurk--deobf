//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1069
{
    Field12709("Silent", 0), 
    Field12710("Click", 1), 
    Field12711("Client", 2), 
    Field12712("Fake", 3);
    
    private static final Class1069[] Field12713;
    private String Field12714 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1069(final String name, final int ordinal) {
    }
    
    static {
        Field12713 = new Class1069[] { Class1069.Field12709, Class1069.Field12710, Class1069.Field12711, Class1069.Field12712 };
    }
    
    private static String Method4336(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5CF5 ^ 0x34));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
