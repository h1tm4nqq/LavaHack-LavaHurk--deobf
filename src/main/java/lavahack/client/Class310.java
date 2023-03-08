//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class310
{
    Field9318("Closest", 0), 
    Field9319("Health", 1), 
    Field9320("Damage", 2);
    
    private static final Class310[] Field9321;
    private int Field9322;
    
    private Class310(final String name, final int ordinal) {
    }
    
    static {
        Field9321 = new Class310[] { Class310.Field9318, Class310.Field9319, Class310.Field9320 };
    }
    
    private static String Method1588(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4923 ^ 0x1F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
