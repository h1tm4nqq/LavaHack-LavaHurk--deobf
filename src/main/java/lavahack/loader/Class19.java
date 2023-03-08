//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

public class Class19 extends Class587 implements Class45
{
    private String Field7903;
    private String Field7904 = "TheKisDevs & LavaHack Development owns you";
    
    public Class19() {
        this.Field7903 = "*";
    }
    
    @Override
    public void Method187(final String field7903) {
        if (field7903 == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.Field7903 = field7903;
    }
    
    public String Method186() {
        return this.Field7903;
    }
    
    private static String Method185(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6AD0 ^ 0x95));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
