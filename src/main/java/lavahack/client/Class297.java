//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class297
{
    Field9292("Update", 0), 
    Field9293("Tick", 1);
    
    private static final Class297[] Field9294;
    private String Field9295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class297(final String name, final int ordinal) {
    }
    
    static {
        Field9294 = new Class297[] { Class297.Field9292, Class297.Field9293 };
    }
    
    private static String Method1557(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1B07 ^ 0x90));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
