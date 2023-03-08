//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class512
{
    Field10159("Client", 0), 
    Field10160("Packet", 1), 
    Field10161("Both", 2);
    
    private static final Class512[] Field10162;
    private String Field10163 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class512(final String name, final int ordinal) {
    }
    
    static {
        Field10162 = new Class512[] { Class512.Field10159, Class512.Field10160, Class512.Field10161 };
    }
    
    private static String Method2365(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x50E9 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
