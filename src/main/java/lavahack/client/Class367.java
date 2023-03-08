//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class367
{
    Field9541("Any", 0), 
    Field9542("Swiftness", 1), 
    Field9543("Strength", 2), 
    Field9544("Regeneration", 3), 
    Field9545("Healing", 4);
    
    private static final Class367[] Field9546;
    private String Field9547 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class367(final String name, final int ordinal) {
    }
    
    static {
        Field9546 = new Class367[] { Class367.Field9541, Class367.Field9542, Class367.Field9543, Class367.Field9544, Class367.Field9545 };
    }
    
    private static String Method1818(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x444 ^ 0x75));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
