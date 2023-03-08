//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1356
{
    Field14178("Fast", 0), 
    Field14179("Slow", 1), 
    Field14180("Setback", 2), 
    Field14181("Factor", 3), 
    Field14182("Desync", 4);
    
    private static final Class1356[] Field14183;
    private int Field14184;
    
    private Class1356(final String name, final int ordinal) {
    }
    
    static {
        Field14183 = new Class1356[] { Class1356.Field14178, Class1356.Field14179, Class1356.Field14180, Class1356.Field14181, Class1356.Field14182 };
    }
    
    private static String Method5425(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39F8 ^ 0x8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
