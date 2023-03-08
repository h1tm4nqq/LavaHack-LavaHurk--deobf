//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class1476
{
    public static final String Field14882;
    public static final String Field14883;
    public static final String Field14884;
    public static final String Field14885;
    private String Field14886 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field14885 = "schematica.format.invalid";
        Field14884 = "schematica.format.structure";
        Field14883 = "schematica.format.alpha";
        Field14882 = "schematica.format.classic";
    }
    
    private static String Method5917(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6971 ^ 0x80));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
