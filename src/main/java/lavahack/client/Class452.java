//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class452
{
    Field9882("NONE", 0, 0.0f, 0.0f), 
    Field9883("ARROW", 1, Float.intBitsToFloat(1069547520), Float.intBitsToFloat(1028443341)), 
    Field9884("POTION", 2, Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1028443341)), 
    Field9885("EXPERIENCE", 3, Float.intBitsToFloat(1060320051), Float.intBitsToFloat(1032805417)), 
    Field9886("FISHING_ROD", 4, Float.intBitsToFloat(1069547520), Float.intBitsToFloat(1025758986)), 
    Field9887("NORMAL", 5, Float.intBitsToFloat(1069547520), Float.intBitsToFloat(1022739087));
    
    private final float Field9888;
    private final float Field9889;
    private static final Class452[] Field9890;
    private String Field9891 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class452(final String name, final int ordinal, final float field9888, final float field9889) {
        this.Field9888 = field9888;
        this.Field9889 = field9889;
    }
    
    public float Method2152() {
        return this.Field9888;
    }
    
    public float Method2153() {
        return this.Field9889;
    }
    
    static {
        Field9890 = new Class452[] { Class452.Field9882, Class452.Field9883, Class452.Field9884, Class452.Field9885, Class452.Field9886, Class452.Field9887 };
    }
    
    private static String Method2154(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7D32 ^ 0xCA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
