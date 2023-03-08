//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

class Class509 extends Class1368
{
    private String Field10145 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class509(final Class158 class158) {
        super("volume", class158);
    }
    
    public void Method443(final String s, final String[] array) {
        if (array.length < 2) {
            return;
        }
        final int int1 = Integer.parseInt(array[1]);
        Class1617.Method6303((float)int1);
        this.Method437("Set music volume to: " + int1);
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x787D ^ 0xA0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
