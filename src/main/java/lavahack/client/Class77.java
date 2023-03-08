//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class77
{
    Field8249("BeforeSwap", 0), 
    Field8250("AfterSwap", 1), 
    Field8251("Both", 2);
    
    private static final Class77[] Field8252;
    private String Field8253 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class77(final String name, final int ordinal) {
    }
    
    static {
        Field8252 = new Class77[] { Class77.Field8249, Class77.Field8250, Class77.Field8251 };
    }
    
    private static String Method667(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5096 ^ 0x7F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
