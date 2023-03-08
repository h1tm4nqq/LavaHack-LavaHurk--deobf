//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1523
{
    Field15115("AIR", 0), 
    Field15116("SURROUNDED", 1), 
    Field15117("PERSISTENT", 2), 
    Field15118("ToggleAfterComplete", 3);
    
    private static final Class1523[] Field15119;
    private String Field15120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1523(final String name, final int ordinal) {
    }
    
    static {
        Field15119 = new Class1523[] { Class1523.Field15115, Class1523.Field15116, Class1523.Field15117, Class1523.Field15118 };
    }
    
    private static String Method6055(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4385 ^ 0x83));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
