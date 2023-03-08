//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class499
{
    Field10076("None", 0), 
    Field10077("Stupid", 1), 
    Field10078("Smart", 2);
    
    private static final Class499[] Field10079;
    private String Field10080 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class499(final String name, final int ordinal) {
    }
    
    static {
        Field10079 = new Class499[] { Class499.Field10076, Class499.Field10077, Class499.Field10078 };
    }
    
    private static String Method2298(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x353D ^ 0xE2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
