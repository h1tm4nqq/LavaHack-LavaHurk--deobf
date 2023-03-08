//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class95
{
    Field8329("INTERMEDIARY", 0), 
    Field8330("NAMED", 1), 
    Field8331("OFFICIAL", 2);
    
    private static final Class95[] Field8332;
    private String Field8333 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class95(final String name, final int ordinal) {
    }
    
    static {
        Field8332 = new Class95[] { Class95.Field8329, Class95.Field8330, Class95.Field8331 };
    }
    
    private static String Method802(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x797E ^ 0xE6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
