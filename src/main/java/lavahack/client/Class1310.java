//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1310
{
    Field14027("Update", 0), 
    Field14028("Tick", 1), 
    Field14029("Render3D", 2);
    
    private static final Class1310[] Field14030;
    private int Field14031;
    
    private Class1310(final String name, final int ordinal) {
    }
    
    static {
        Field14030 = new Class1310[] { Class1310.Field14027, Class1310.Field14028, Class1310.Field14029 };
    }
    
    private static String Method5341(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6406 ^ 0xF6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
