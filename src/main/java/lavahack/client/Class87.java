//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class87
{
    Field8293("EXTRA_BLOCK", 0, 12517567), 
    Field8294("WRONG_BLOCK", 1, 16711680), 
    Field8295("WRONG_META", 2, 12541696), 
    Field8296("MISSING_BLOCK", 3, 49151);
    
    public final int Field8297;
    private static final Class87[] Field8298;
    private String Field8299 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class87(final String name, final int ordinal, final int field8297) {
        this.Field8297 = field8297;
    }
    
    static {
        Field8298 = new Class87[] { Class87.Field8293, Class87.Field8294, Class87.Field8295, Class87.Field8296 };
    }
    
    private static String Method745(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7B5E ^ 0xE5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
