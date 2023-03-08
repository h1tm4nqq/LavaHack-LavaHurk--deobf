//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1771
{
    Field16116("MovementStop", 0), 
    Field16117("Motion", 1), 
    Field16118("Teleport", 2);
    
    private static final Class1771[] Field16119;
    private String Field16120 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1771(final String name, final int ordinal) {
    }
    
    static {
        Field16119 = new Class1771[] { Class1771.Field16116, Class1771.Field16117, Class1771.Field16118 };
    }
    
    private static String Method6716(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2661 ^ 0xC9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
