//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class893
{
    Field11739("NORMAL", 0), 
    Field11740("PACKET", 1), 
    Field11741("NONE", 2);
    
    private static final Class893[] Field11742;
    private int Field11743;
    
    private Class893(final String name, final int ordinal) {
    }
    
    static {
        Field11742 = new Class893[] { Class893.Field11739, Class893.Field11740, Class893.Field11741 };
    }
    
    private static String Method3721(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1073 ^ 0x5B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
