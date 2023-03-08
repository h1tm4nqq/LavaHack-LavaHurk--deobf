//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1595
{
    Field15462("None", 0), 
    Field15463("Dynamic", 1), 
    Field15464("Static", 2);
    
    private static final Class1595[] Field15465;
    private String Field15466 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1595(final String name, final int ordinal) {
    }
    
    static {
        Field15465 = new Class1595[] { Class1595.Field15462, Class1595.Field15463, Class1595.Field15464 };
    }
    
    private static String Method6254(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x547 ^ 0xCE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
