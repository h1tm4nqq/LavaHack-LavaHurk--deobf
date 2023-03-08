//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1324
{
    Field14066("Default", 0), 
    Field14067("FromTo", 1);
    
    private static final Class1324[] Field14068;
    private int Field14069;
    
    private Class1324(final String name, final int ordinal) {
    }
    
    static {
        Field14068 = new Class1324[] { Class1324.Field14066, Class1324.Field14067 };
    }
    
    private static String Method5362(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7ED1 ^ 0xB9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
