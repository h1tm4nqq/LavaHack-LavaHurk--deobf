//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1381
{
    Field14258("None", 0), 
    Field14259("RemoveEntity", 1), 
    Field14260("SetDead", 2), 
    Field14261("Both", 3);
    
    private static final Class1381[] Field14262;
    private int Field14263;
    
    private Class1381(final String name, final int ordinal) {
    }
    
    static {
        Field14262 = new Class1381[] { Class1381.Field14258, Class1381.Field14259, Class1381.Field14260, Class1381.Field14261 };
    }
    
    private static String Method5484(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6BDC ^ 0x70));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
