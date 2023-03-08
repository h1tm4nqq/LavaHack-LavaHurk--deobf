//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class596
{
    Field10536("None", 0), 
    Field10537("Tick", 1), 
    Field10538("DelayMS", 2);
    
    private static final Class596[] Field10539;
    private int Field10540;
    
    private Class596(final String name, final int ordinal) {
    }
    
    static {
        Field10539 = new Class596[] { Class596.Field10536, Class596.Field10537, Class596.Field10538 };
    }
    
    private static String Method2580(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3459 ^ 0xEE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
