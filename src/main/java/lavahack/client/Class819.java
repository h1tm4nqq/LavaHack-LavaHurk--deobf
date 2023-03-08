//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class819
{
    Field11496("Exp", 0), 
    Field11497("Pearl", 1), 
    Field11498("Obby", 2);
    
    private static final Class819[] Field11499;
    private String Field11500 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class819(final String name, final int ordinal) {
    }
    
    static {
        Field11499 = new Class819[] { Class819.Field11496, Class819.Field11497, Class819.Field11498 };
    }
    
    private static String Method3487(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4660 ^ 0x2D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
