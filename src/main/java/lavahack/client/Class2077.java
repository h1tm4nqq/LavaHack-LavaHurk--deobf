//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class2077
{
    Field17498("Adaptive", 0), 
    Field17499("Sequential", 1);
    
    private static final Class2077[] Field17500;
    private String Field17501 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2077(final String name, final int ordinal) {
    }
    
    static {
        Field17500 = new Class2077[] { Class2077.Field17498, Class2077.Field17499 };
    }
    
    private static String Method7618(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x592C ^ 0x59));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
