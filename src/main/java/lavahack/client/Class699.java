//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class699
{
    Field10963("TELEPORT", 0), 
    Field10964("MOTION", 1), 
    Field10965("NONE", 2);
    
    private static final Class699[] Field10966;
    private String Field10967 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class699(final String name, final int ordinal) {
    }
    
    static {
        Field10966 = new Class699[] { Class699.Field10963, Class699.Field10964, Class699.Field10965 };
    }
    
    private static String Method2922(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1B4B ^ 0x37));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
