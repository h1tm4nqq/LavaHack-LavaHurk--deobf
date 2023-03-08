//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class265
{
    Field9182("None", 0), 
    Field9183("Client", 1), 
    Field9184("Server", 2);
    
    private static final Class265[] Field9185;
    private String Field9186 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class265(final String name, final int ordinal) {
    }
    
    static {
        Field9185 = new Class265[] { Class265.Field9182, Class265.Field9183, Class265.Field9184 };
    }
    
    private static String Method1439(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E2F ^ 0x6B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
