//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class892
{
    Field11735("Vanilla", 0), 
    Field11736("Motion", 1);
    
    private static final Class892[] Field11737;
    private String Field11738 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class892(final String name, final int ordinal) {
    }
    
    static {
        Field11737 = new Class892[] { Class892.Field11735, Class892.Field11736 };
    }
    
    private static String Method3720(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x673F ^ 0xB9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
