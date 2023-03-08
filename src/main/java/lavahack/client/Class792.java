//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class792
{
    Field11374("Single", 0), 
    Field11375("Double", 1), 
    Field11376("UnsafeDouble", 2), 
    Field11377("Quadruple", 3), 
    Field11378("UnsafeQuadruple", 4);
    
    private static final Class792[] Field11379;
    private String Field11380 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class792(final String name, final int ordinal) {
    }
    
    static {
        Field11379 = new Class792[] { Class792.Field11374, Class792.Field11375, Class792.Field11376, Class792.Field11377, Class792.Field11378 };
    }
    
    private static String Method3308(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x771 ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
