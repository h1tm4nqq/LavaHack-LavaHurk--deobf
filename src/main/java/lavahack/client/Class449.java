//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class449
{
    Field9868("LeftClick", 0), 
    Field9869("RightClick", 1), 
    Field9870("MiddleClick", 2);
    
    private static final Class449[] Field9871;
    private String Field9872 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class449(final String name, final int ordinal) {
    }
    
    static {
        Field9871 = new Class449[] { Class449.Field9868, Class449.Field9869, Class449.Field9870 };
    }
    
    private static String Method2147(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1064 ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
