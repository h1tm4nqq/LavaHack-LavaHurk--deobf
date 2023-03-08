//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class2037
{
    Field17364("Off", 0), 
    Field17365("In", 1), 
    Field17366("Out", 2);
    
    private static final Class2037[] Field17367;
    private String Field17368 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2037(final String name, final int ordinal) {
    }
    
    static {
        Field17367 = new Class2037[] { Class2037.Field17364, Class2037.Field17365, Class2037.Field17366 };
    }
    
    private static String Method7532(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x31FD ^ 0x24));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
