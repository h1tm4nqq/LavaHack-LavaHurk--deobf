//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class2089
{
    Field17534("Simple", 0), 
    Field17535("CSGO", 1), 
    Field17536("Image", 2), 
    Field17537("GishCode", 3);
    
    private static final Class2089[] Field17538;
    private String Field17539 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2089(final String name, final int ordinal) {
    }
    
    static {
        Field17538 = new Class2089[] { Class2089.Field17534, Class2089.Field17535, Class2089.Field17536, Class2089.Field17537 };
    }
    
    private static String Method7630(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x32CB ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
