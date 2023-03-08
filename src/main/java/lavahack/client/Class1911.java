//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public final class Class1911
{
    public static final String Field16818;
    public static final String Field16819;
    public static final String Field16820;
    public static final String Field16821;
    public static final String Field16822;
    public static final String Field16823;
    private String Field16824 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field16823 = "server";
        Field16822 = "general";
        Field16821 = "printer.swapslots";
        Field16820 = "printer";
        Field16819 = "render";
        Field16818 = "debug";
    }
    
    private static String Method7098(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x90A ^ 0x62));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
