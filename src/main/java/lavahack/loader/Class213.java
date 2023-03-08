//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

public class Class213 extends Class609
{
    private String Field8912 = "TheKisDevs & LavaHack Development owns you";
    
    public Class213() {
        super(Class1753.Field16034);
    }
    
    @Override
    public void Method84() throws Class902 {
        super.Method84();
        if (!Class1105.Method4532(this.Method82())) {
            throw new Class902(1007, "Received text is no valid utf8 string!");
        }
    }
    
    private static String Method92(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x63BF ^ 0xD1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
