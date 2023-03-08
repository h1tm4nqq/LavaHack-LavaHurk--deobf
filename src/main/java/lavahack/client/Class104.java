//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class104
{
    Field8365("Off", 0), 
    Field8366("Vanilla", 1), 
    Field8367("SwitchBack", 2);
    
    private static final Class104[] Field8368;
    private int Field8369;
    
    private Class104(final String name, final int ordinal) {
    }
    
    static {
        Field8368 = new Class104[] { Class104.Field8365, Class104.Field8366, Class104.Field8367 };
    }
    
    private static String Method818(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x754F ^ 0xF7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
