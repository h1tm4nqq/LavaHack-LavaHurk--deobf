//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1702
{
    Field15881("Packet", 0), 
    Field15882("AAC", 1), 
    Field15883("Anti", 2), 
    Field15884("Bucket", 3);
    
    private static final Class1702[] Field15885;
    private int Field15886;
    
    private Class1702(final String name, final int ordinal) {
    }
    
    static {
        Field15885 = new Class1702[] { Class1702.Field15881, Class1702.Field15882, Class1702.Field15883, Class1702.Field15884 };
    }
    
    private static String Method6528(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5293 ^ 0x62));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
