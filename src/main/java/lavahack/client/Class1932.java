//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1932
{
    Field16958("Off", 0), 
    Field16959("SetDead", 1), 
    Field16960("RemoveEntity", 2), 
    Field16961("Both", 3);
    
    private static final Class1932[] Field16962;
    private String Field16963 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1932(final String name, final int ordinal) {
    }
    
    static {
        Field16962 = new Class1932[] { Class1932.Field16958, Class1932.Field16959, Class1932.Field16960, Class1932.Field16961 };
    }
    
    private static String Method7188(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x26A9 ^ 0xB4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
