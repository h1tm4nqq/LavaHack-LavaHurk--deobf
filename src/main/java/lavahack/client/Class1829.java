//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1829
{
    Field16446("PositionBounds", 0), 
    Field16447("BoundsPosition", 1);
    
    private static final Class1829[] Field16448;
    private int Field16449;
    
    private Class1829(final String name, final int ordinal) {
    }
    
    static {
        Field16448 = new Class1829[] { Class1829.Field16446, Class1829.Field16447 };
    }
    
    private static String Method6887(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7C4B ^ 0x5A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
