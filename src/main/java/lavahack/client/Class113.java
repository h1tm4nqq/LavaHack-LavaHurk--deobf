//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class113
{
    Field8392("None", 0), 
    Field8393("Normal", 1), 
    Field8394("Silent", 2), 
    Field8395("Smart", 3);
    
    private static final Class113[] Field8396;
    private String Field8397 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class113(final String name, final int ordinal) {
    }
    
    static {
        Field8396 = new Class113[] { Class113.Field8392, Class113.Field8393, Class113.Field8394, Class113.Field8395 };
    }
    
    private static String Method828(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x100 ^ 0x5E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
