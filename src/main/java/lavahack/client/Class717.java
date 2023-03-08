//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class717
{
    Field11066("None", 0), 
    Field11067("Normal", 1), 
    Field11068("Limited", 2), 
    Field11069("Strict", 3);
    
    private static final Class717[] Field11070;
    private int Field11071;
    
    private Class717(final String name, final int ordinal) {
    }
    
    static {
        Field11070 = new Class717[] { Class717.Field11066, Class717.Field11067, Class717.Field11068, Class717.Field11069 };
    }
    
    private static String Method3007(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5498 ^ 0xBC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
