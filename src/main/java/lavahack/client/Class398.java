//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class398
{
    Field9664("Closest", 0), 
    Field9665("All", 1);
    
    private static final Class398[] Field9666;
    private String Field9667 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class398(final String name, final int ordinal) {
    }
    
    static {
        Field9666 = new Class398[] { Class398.Field9664, Class398.Field9665 };
    }
    
    private static String Method1967(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x718C ^ 0x1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
