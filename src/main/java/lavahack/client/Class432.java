//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class432
{
    Field9803("None", 0), 
    Field9804("Normal", 1), 
    Field9805("Silent", 2);
    
    private static final Class432[] Field9806;
    private String Field9807 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class432(final String name, final int ordinal) {
    }
    
    static {
        Field9806 = new Class432[] { Class432.Field9803, Class432.Field9804, Class432.Field9805 };
    }
    
    private static String Method2063(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x24AA ^ 0x3D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
