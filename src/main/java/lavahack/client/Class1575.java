//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1575 extends Class1164
{
    private String Field15346 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1575(final String s) {
        super("cmd", s);
    }
    
    protected void Method4693() {
        final String[] split = this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.split(";");
        for (int length = split.length, i = 0; i < length; ++i) {
            Class1796.Field16241.Field16272.Method7567(split[i]);
        }
    }
    
    private static String Method6213(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5F77 ^ 0xA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
