//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class2140
{
    Field17791("None", 0), 
    Field17792("Normal", 1), 
    Field17793("Silent", 2);
    
    private static final Class2140[] Field17794;
    private int Field17795;
    
    private Class2140(final String name, final int ordinal) {
    }
    
    static {
        Field17794 = new Class2140[] { Class2140.Field17791, Class2140.Field17792, Class2140.Field17793 };
    }
    
    private static String Method7711(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7189 ^ 0x76));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
