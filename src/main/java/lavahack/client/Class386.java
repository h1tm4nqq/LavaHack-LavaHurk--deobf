//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class386
{
    Field9616("None", 0), 
    Field9617("Strict", 1), 
    Field9618("Ticks", 2);
    
    private static final Class386[] Field9619;
    private String Field9620 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class386(final String name, final int ordinal) {
    }
    
    static {
        Field9619 = new Class386[] { Class386.Field9616, Class386.Field9617, Class386.Field9618 };
    }
    
    private static String Method1863(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF94 ^ 0xA2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
