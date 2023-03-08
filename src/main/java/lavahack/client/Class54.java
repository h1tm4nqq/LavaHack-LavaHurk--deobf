//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class54
{
    Field8165("None", 0), 
    Field8166("Semi", 1), 
    Field8167("Full", 2);
    
    private static final Class54[] Field8168;
    private int Field8169;
    
    private Class54(final String name, final int ordinal) {
    }
    
    static {
        Field8168 = new Class54[] { Class54.Field8165, Class54.Field8166, Class54.Field8167 };
    }
    
    private static String Method485(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4B52 ^ 0x4F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
