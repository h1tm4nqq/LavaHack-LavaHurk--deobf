//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class56
{
    Field8174("None", 0), 
    Field8175("Cev", 1), 
    Field8176("Civ", 2), 
    Field8177("Both", 3);
    
    private static final Class56[] Field8178;
    private String Field8179 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class56(final String name, final int ordinal) {
    }
    
    static {
        Field8178 = new Class56[] { Class56.Field8174, Class56.Field8175, Class56.Field8176, Class56.Field8177 };
    }
    
    private static String Method487(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x334E ^ 0x31));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
