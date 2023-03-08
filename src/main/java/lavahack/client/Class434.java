//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class434
{
    Field9816("Normal", 0), 
    Field9817("Silent", 1);
    
    private static final Class434[] Field9818;
    private String Field9819 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class434(final String name, final int ordinal) {
    }
    
    static {
        Field9818 = new Class434[] { Class434.Field9816, Class434.Field9817 };
    }
    
    private static String Method2075(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1744 ^ 0x94));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
