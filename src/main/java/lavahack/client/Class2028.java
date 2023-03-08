//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class2028
{
    Field17332("Center", 0), 
    Field17333("Left", 1);
    
    private static final Class2028[] Field17334;
    private int Field17335;
    
    private Class2028(final String name, final int ordinal) {
    }
    
    static {
        Field17334 = new Class2028[] { Class2028.Field17332, Class2028.Field17333 };
    }
    
    private static String Method7508(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x45FB ^ 0xFF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
