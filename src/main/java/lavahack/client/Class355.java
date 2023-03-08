//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class355
{
    Field9479("None", 0), 
    Field9480("Stupid", 1), 
    Field9481("Smart", 2);
    
    private static final Class355[] Field9482;
    private String Field9483 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class355(final String name, final int ordinal) {
    }
    
    static {
        Field9482 = new Class355[] { Class355.Field9479, Class355.Field9480, Class355.Field9481 };
    }
    
    private static String Method1789(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5543 ^ 0x33));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
