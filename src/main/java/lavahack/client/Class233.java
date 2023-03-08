//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class233
{
    public static final String Field9016;
    public static final String Field9017;
    public static final String Field9018;
    public static final String Field9019;
    public static final String Field9020;
    public static final String Field9021;
    private String Field9022 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field9021 = "schematica.gui.done";
        Field9020 = "schematica.gui.off";
        Field9019 = "schematica.gui.on";
        Field9018 = "schematica.gui.z";
        Field9017 = "schematica.gui.y";
        Field9016 = "schematica.gui.x";
    }
    
    private static String Method1302(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x73E0 ^ 0xB7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
