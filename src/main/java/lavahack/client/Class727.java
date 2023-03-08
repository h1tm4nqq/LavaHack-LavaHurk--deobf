//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class727
{
    Field11089("Attack", 0), 
    Field11090("Confirm", 1);
    
    private static final Class727[] Field11091;
    private int Field11092;
    
    private Class727(final String name, final int ordinal) {
    }
    
    static {
        Field11091 = new Class727[] { Class727.Field11089, Class727.Field11090 };
    }
    
    private static String Method3045(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3EDC ^ 0x23));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
