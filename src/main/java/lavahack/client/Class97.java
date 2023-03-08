//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class97
{
    Field8338("COMBAT", 0, "Combat"), 
    Field8339("CLIENT", 1, "Client"), 
    Field8340("MOVEMENT", 2, "Movement"), 
    Field8341("PLAYER", 3, "Player"), 
    Field8342("RENDER", 4, "Render"), 
    Field8343("MISC", 5, "Misc"), 
    Field8344("EXPLOIT", 6, "Exploit"), 
    Field8345("DEBUG", 7, "Debug"), 
    Field8346("WIP", 8, "WIP"), 
    Field8347("LUA", 9, "Plugin&Lua");
    
    private final String Field8348;
    private static final Class97[] Field8349;
    private String Field8350 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class97(final String name, final int ordinal, final String field8348) {
        this.Field8348 = field8348;
    }
    
    public final String Method807() {
        return this.Field8348;
    }
    
    static {
        Field8349 = new Class97[] { Class97.Field8338, Class97.Field8339, Class97.Field8340, Class97.Field8341, Class97.Field8342, Class97.Field8343, Class97.Field8344, Class97.Field8345, Class97.Field8346, Class97.Field8347 };
    }
    
    private static String Method808(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1C58 ^ 0xDC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
