//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class788
{
    Field11330("Blockhit1", 0), 
    Field11331("Blockhit2", 1), 
    Field11332("Knife", 2), 
    Field11333("Custom", 3);
    
    private static final Class788[] Field11334;
    private String Field11335 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class788(final String name, final int ordinal) {
    }
    
    static {
        Field11334 = new Class788[] { Class788.Field11330, Class788.Field11331, Class788.Field11332, Class788.Field11333 };
    }
    
    private static String Method3279(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3C2E ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
