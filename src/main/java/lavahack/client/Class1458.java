//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1458
{
    Field14820("OFFICIAL", 0), 
    Field14821("INTERMEDIARY", 1), 
    Field14822("NAMED", 2);
    
    private static final Class1458[] Field14823;
    private String Field14824 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1458(final String name, final int ordinal) {
    }
    
    static {
        Field14823 = new Class1458[] { Class1458.Field14820, Class1458.Field14821, Class1458.Field14822 };
    }
    
    private static String Method5817(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x105 ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
