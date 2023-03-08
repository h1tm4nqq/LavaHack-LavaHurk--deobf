//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1852
{
    Field16532("PlaceBreak", 0), 
    Field16533("BreakPlace", 1);
    
    private static final Class1852[] Field16534;
    private int Field16535;
    
    private Class1852(final String name, final int ordinal) {
    }
    
    static {
        Field16534 = new Class1852[] { Class1852.Field16532, Class1852.Field16533 };
    }
    
    private static String Method6946(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1B94 ^ 0x61));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
