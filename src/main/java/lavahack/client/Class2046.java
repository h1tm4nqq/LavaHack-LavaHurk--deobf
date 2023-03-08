//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class2046
{
    Field17388("Normal", 0), 
    Field17389("Control", 1), 
    Field17390("NormalPacket", 2);
    
    private static final Class2046[] Field17391;
    private String Field17392 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2046(final String name, final int ordinal) {
    }
    
    static {
        Field17391 = new Class2046[] { Class2046.Field17388, Class2046.Field17389, Class2046.Field17390 };
    }
    
    private static String Method7568(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x25D0 ^ 0x4C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
