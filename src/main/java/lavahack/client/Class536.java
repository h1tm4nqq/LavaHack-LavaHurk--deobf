//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class536
{
    Field10262("Packet", 0), 
    Field10263("Desync", 1), 
    Field10264("Auto", 2);
    
    private static final Class536[] Field10265;
    private int Field10266;
    
    private Class536(final String name, final int ordinal) {
    }
    
    static {
        Field10265 = new Class536[] { Class536.Field10262, Class536.Field10263, Class536.Field10264 };
    }
    
    private static String Method2428(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2771 ^ 0xCB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
