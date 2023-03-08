//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class2019
{
    Field17291("STRENGTH", 0), 
    Field17292("SPEED", 1), 
    Field17293("FIRERES", 2);
    
    private static final Class2019[] Field17294;
    private String Field17295 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2019(final String name, final int ordinal) {
    }
    
    static {
        Field17294 = new Class2019[] { Class2019.Field17291, Class2019.Field17292, Class2019.Field17293 };
    }
    
    private static String Method7479(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2DCE ^ 0x14));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
