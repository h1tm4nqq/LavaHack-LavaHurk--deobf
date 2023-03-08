//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class47
{
    Field8132("Damage", 0), 
    Field8133("CevBreaker", 1);
    
    private static final Class47[] Field8134;
    private String Field8135 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class47(final String name, final int ordinal) {
    }
    
    static {
        Field8134 = new Class47[] { Class47.Field8132, Class47.Field8133 };
    }
    
    private static String Method429(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F84 ^ 0x21));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
