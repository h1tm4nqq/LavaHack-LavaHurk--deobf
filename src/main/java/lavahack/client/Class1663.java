//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1663
{
    Field15744("Break", 0), 
    Field15745("Place", 1), 
    Field15746("Sound", 2);
    
    private static final Class1663[] Field15747;
    private String Field15748 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1663(final String name, final int ordinal) {
    }
    
    static {
        Field15747 = new Class1663[] { Class1663.Field15744, Class1663.Field15745, Class1663.Field15746 };
    }
    
    private static String Method6434(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x28BD ^ 0xC9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
