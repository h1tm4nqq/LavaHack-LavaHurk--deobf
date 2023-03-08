//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1241
{
    Field13625("MainHand", 0), 
    Field13626("OffHand", 1), 
    Field13627("CurrentHand", 2), 
    Field13628("PacketSwing", 3), 
    Field13629("None", 4);
    
    private static final Class1241[] Field13630;
    private int Field13631;
    
    private Class1241(final String name, final int ordinal) {
    }
    
    static {
        Field13630 = new Class1241[] { Class1241.Field13625, Class1241.Field13626, Class1241.Field13627, Class1241.Field13628, Class1241.Field13629 };
    }
    
    private static String Method4990(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4ECC ^ 0x40));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
