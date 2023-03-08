//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class10
{
    Field7864("None", 0), 
    Field7865("AntiTotemFail", 1), 
    Field7866("AntiTotemPop", 2);
    
    private static final Class10[] Field7867;
    private String Field7868 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class10(final String name, final int ordinal) {
    }
    
    static {
        Field7867 = new Class10[] { Class10.Field7864, Class10.Field7865, Class10.Field7866 };
    }
    
    private static String Method139(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A06 ^ 0x1C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
