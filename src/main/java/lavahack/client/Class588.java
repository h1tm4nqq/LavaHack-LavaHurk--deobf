//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class588
{
    Field10494("OBSIDIAN", 0), 
    Field10495("BEDROCK", 1), 
    Field10496("CUSTOM", 2);
    
    private static final Class588[] Field10497;
    private String Field10498 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class588(final String name, final int ordinal) {
    }
    
    static {
        Field10497 = new Class588[] { Class588.Field10494, Class588.Field10495, Class588.Field10496 };
    }
    
    private static String Method2550(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x753A ^ 0x18));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
