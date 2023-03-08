//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class984
{
    Field12207("ManualTick", 0), 
    Field12208("ManualRender", 1), 
    Field12209("FastTick", 2), 
    Field12210("FastRender", 3);
    
    private static final Class984[] Field12211;
    private int Field12212;
    
    private Class984(final String name, final int ordinal) {
    }
    
    static {
        Field12211 = new Class984[] { Class984.Field12207, Class984.Field12208, Class984.Field12209, Class984.Field12210 };
    }
    
    private static String Method3996(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6E26 ^ 0x53));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
