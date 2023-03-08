//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1839
{
    Field16489("Item", 0), 
    Field16490("Armor", 1);
    
    private static final Class1839[] Field16491;
    private int Field16492;
    
    private Class1839(final String name, final int ordinal) {
    }
    
    static {
        Field16491 = new Class1839[] { Class1839.Field16489, Class1839.Field16490 };
    }
    
    private static String Method6934(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x31C1 ^ 0xB8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
