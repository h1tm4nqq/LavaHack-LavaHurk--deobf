//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1844
{
    Field16501("Never", 0), 
    Field16502("OffGround", 1), 
    Field16503("YChange", 2), 
    Field16504("PositiveYChange", 3), 
    Field16505("Combo", 4), 
    Field16506("OnComplete", 5);
    
    private static final Class1844[] Field16507;
    private String Field16508 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1844(final String name, final int ordinal) {
    }
    
    static {
        Field16507 = new Class1844[] { Class1844.Field16501, Class1844.Field16502, Class1844.Field16503, Class1844.Field16504, Class1844.Field16505, Class1844.Field16506 };
    }
    
    private static String Method6939(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5CA3 ^ 0x5A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
