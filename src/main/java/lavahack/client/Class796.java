//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class796
{
    Field11386("Tick", 0), 
    Field11387("Update", 1);
    
    private static final Class796[] Field11388;
    private String Field11389 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class796(final String name, final int ordinal) {
    }
    
    static {
        Field11388 = new Class796[] { Class796.Field11386, Class796.Field11387 };
    }
    
    private static String Method3312(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x40C5 ^ 0x4D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
