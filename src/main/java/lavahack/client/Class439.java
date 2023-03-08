//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class439
{
    Field9834("Friend", 0, "Only Friends"), 
    Field9835("OtherPLayers", 1, "Only Other Players"), 
    Field9836("Both", 2, "Both");
    
    public String Field9837;
    private static final Class439[] Field9838;
    private int Field9839;
    
    private Class439(final String name, final int ordinal, final String field9837) {
        this.Field9837 = field9837;
    }
    
    public String Method2084() {
        return this.Field9837;
    }
    
    static {
        Field9838 = new Class439[] { Class439.Field9834, Class439.Field9835, Class439.Field9836 };
    }
    
    private static String Method2085(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6D28 ^ 0xFD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
