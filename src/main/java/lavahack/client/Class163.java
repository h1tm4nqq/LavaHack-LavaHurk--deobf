//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class163
{
    Field8676("Old", 0), 
    Field8677("Impr", 1);
    
    private static final Class163[] Field8678;
    private String Field8679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class163(final String name, final int ordinal) {
    }
    
    static {
        Field8678 = new Class163[] { Class163.Field8676, Class163.Field8677 };
    }
    
    private static String Method1057(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xCEA ^ 0x91));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
