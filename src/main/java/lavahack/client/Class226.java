//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class226
{
    Field8984("LOAD", 0, "Load"), 
    Field8985("UNLOAD", 1, "Unload"), 
    Field8986("RELOAD", 2, "Reload");
    
    final String Field8987;
    private static final Class226[] Field8988;
    private String Field8989 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class226(final String name, final int ordinal, final String field8987) {
        this.Field8987 = field8987;
    }
    
    static {
        Field8988 = new Class226[] { Class226.Field8984, Class226.Field8985, Class226.Field8986 };
    }
    
    private static String Method1281(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4A22 ^ 0x92));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
