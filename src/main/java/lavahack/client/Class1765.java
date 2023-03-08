//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1765
{
    Field16071("Normal", 0), 
    Field16072("Silent", 1);
    
    private static final Class1765[] Field16073;
    private String Field16074 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1765(final String name, final int ordinal) {
    }
    
    static {
        Field16073 = new Class1765[] { Class1765.Field16071, Class1765.Field16072 };
    }
    
    private static String Method6713(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4832 ^ 0x9E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
