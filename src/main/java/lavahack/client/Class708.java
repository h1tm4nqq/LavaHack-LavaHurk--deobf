//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class708
{
    Field11018("Packet", 0), 
    Field11019("Vanilla", 1);
    
    private static final Class708[] Field11020;
    private int Field11021;
    
    private Class708(final String name, final int ordinal) {
    }
    
    static {
        Field11020 = new Class708[] { Class708.Field11018, Class708.Field11019 };
    }
    
    private static String Method2949(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x551E ^ 0x58));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
