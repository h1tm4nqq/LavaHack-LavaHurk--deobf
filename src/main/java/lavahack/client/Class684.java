//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class684
{
    Field10896("Pressed", 0), 
    Field10897("Released", 1);
    
    private static final Class684[] Field10898;
    private String Field10899 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class684(final String name, final int ordinal) {
    }
    
    public static Class684 Method2878(final boolean b) {
        return b ? Class684.Field10896 : Class684.Field10897;
    }
    
    static {
        Field10898 = new Class684[] { Class684.Field10896, Class684.Field10897 };
    }
    
    private static String Method2879(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x752C ^ 0xD0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
