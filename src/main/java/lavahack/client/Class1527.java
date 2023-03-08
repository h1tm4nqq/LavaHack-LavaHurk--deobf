//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1527
{
    Field15137("None", 0), 
    Field15138("TwoGradient", 1), 
    Field15139("ThreeGradient", 2), 
    Field15140("Syns", 3);
    
    private static final Class1527[] Field15141;
    private String Field15142 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1527(final String name, final int ordinal) {
    }
    
    static {
        Field15141 = new Class1527[] { Class1527.Field15137, Class1527.Field15138, Class1527.Field15139, Class1527.Field15140 };
    }
    
    private static String Method6066(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x466A ^ 0xCD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
