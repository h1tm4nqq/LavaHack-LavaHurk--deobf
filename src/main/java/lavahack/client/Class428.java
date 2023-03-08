//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

class Class428 extends Class1368
{
    private String Field9791 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class428(final Class158 class158) {
        super("pause", class158);
    }
    
    public void Method443(final String s, final String[] array) {
        Class1617.Method6299();
        this.Method437("Paused the music");
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x15E1 ^ 0x56));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
