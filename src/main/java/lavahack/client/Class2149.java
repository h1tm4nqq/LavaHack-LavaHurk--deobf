//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class2149
{
    Field17836("None", 0), 
    Field17837("Merge", 1), 
    Field17838("Strict", 2), 
    Field17839("StrictFull", 3);
    
    private static final Class2149[] Field17840;
    private String Field17841 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2149(final String name, final int ordinal) {
    }
    
    static {
        Field17840 = new Class2149[] { Class2149.Field17836, Class2149.Field17837, Class2149.Field17838, Class2149.Field17839 };
    }
    
    private static String Method7737(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6714 ^ 0x17));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
