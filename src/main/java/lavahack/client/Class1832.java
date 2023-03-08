//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1832
{
    Field16467("None", 0), 
    Field16468("Full", 1), 
    Field16469("Smart", 2);
    
    private static final Class1832[] Field16470;
    private String Field16471 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1832(final String name, final int ordinal) {
    }
    
    static {
        Field16470 = new Class1832[] { Class1832.Field16467, Class1832.Field16468, Class1832.Field16469 };
    }
    
    private static String Method6900(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4BF4 ^ 0x47));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
