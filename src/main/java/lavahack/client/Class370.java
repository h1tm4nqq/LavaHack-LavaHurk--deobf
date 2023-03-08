//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class370 extends Class1446
{
    private String Field9557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class370() {
        super(Class927.Field11927);
    }
    
    public void Method1620() throws Class23 {
        super.Method1620();
        if (!Class176.Method1101(this.Method1618())) {
            throw new Class23(1007, "Received text is no valid utf8 string!");
        }
    }
    
    private static String Method1628(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7824 ^ 0xA6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
