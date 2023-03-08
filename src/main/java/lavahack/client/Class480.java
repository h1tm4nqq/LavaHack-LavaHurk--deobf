//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class480
{
    Field10003("RELOAD", 0, "Reload"), 
    Field10004("UNLOAD", 1, "Unload");
    
    final String Field10005;
    private static final Class480[] Field10006;
    private String Field10007 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class480(final String name, final int ordinal, final String field10005) {
        this.Field10005 = field10005;
    }
    
    static {
        Field10006 = new Class480[] { Class480.Field10003, Class480.Field10004 };
    }
    
    private static String Method2232(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x42AC ^ 0xC5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
