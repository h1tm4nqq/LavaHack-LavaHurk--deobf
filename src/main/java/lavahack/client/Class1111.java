//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1111
{
    Field13001("Bedrock", 0, Class1120.Field13036), 
    Field13002("Obsidian", 1, Class1120.Field13037);
    
    private final Class1120 Field13003;
    private static final Class1111[] Field13004;
    private String Field13005 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1111(final String name, final int ordinal, final Class1120 field13003) {
        this.Field13003 = field13003;
    }
    
    public Class1120 Method4542() {
        return this.Field13003;
    }
    
    static {
        Field13004 = new Class1111[] { Class1111.Field13001, Class1111.Field13002 };
    }
    
    private static String Method4543(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6EEE ^ 0xEE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
