//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class807
{
    Field11442("None", 0), 
    Field11443("MinMax", 1), 
    Field11444("Balance", 2);
    
    private static final Class807[] Field11445;
    private int Field11446;
    
    private Class807(final String name, final int ordinal) {
    }
    
    static {
        Field11445 = new Class807[] { Class807.Field11442, Class807.Field11443, Class807.Field11444 };
    }
    
    private static String Method3404(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x72C4 ^ 0x8C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
