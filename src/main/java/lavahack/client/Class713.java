//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class713
{
    Field11035("Adaptive", 0), 
    Field11036("Sequential", 1);
    
    private static final Class713[] Field11037;
    private String Field11038 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class713(final String name, final int ordinal) {
    }
    
    static {
        Field11037 = new Class713[] { Class713.Field11035, Class713.Field11036 };
    }
    
    private static String Method2979(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5D4A ^ 0x34));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
