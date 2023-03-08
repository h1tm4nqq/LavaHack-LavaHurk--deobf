//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class2126
{
    Field17673("None", 0), 
    Field17674("Default", 1), 
    Field17675("Advanced", 2);
    
    private static final Class2126[] Field17676;
    private int Field17677;
    
    private Class2126(final String name, final int ordinal) {
    }
    
    static {
        Field17676 = new Class2126[] { Class2126.Field17673, Class2126.Field17674, Class2126.Field17675 };
    }
    
    private static String Method7664(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2FED ^ 0xF4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
