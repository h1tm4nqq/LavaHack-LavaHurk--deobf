//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class656
{
    Field10803("None", 0), 
    Field10804("Range", 1);
    
    private static final Class656[] Field10805;
    private String Field10806 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class656(final String name, final int ordinal) {
    }
    
    static {
        Field10805 = new Class656[] { Class656.Field10803, Class656.Field10804 };
    }
    
    private static String Method2830(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3D01 ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
