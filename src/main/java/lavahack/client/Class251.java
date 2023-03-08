//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class251
{
    Field9120("Blocking", 0), 
    Field9121("Concurrent", 1);
    
    private static final Class251[] Field9122;
    private int Field9123;
    
    private Class251(final String name, final int ordinal) {
    }
    
    static {
        Field9122 = new Class251[] { Class251.Field9120, Class251.Field9121 };
    }
    
    private static String Method1365(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x47C0 ^ 0x2C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
