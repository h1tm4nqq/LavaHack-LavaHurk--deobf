//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class1237
{
    Field13608("None", 0), 
    Field13609("Vanilla", 1), 
    Field13610("NCP", 2);
    
    private static final Class1237[] Field13611;
    private String Field13612 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1237(final String name, final int ordinal) {
    }
    
    static {
        Field13611 = new Class1237[] { Class1237.Field13608, Class1237.Field13609, Class1237.Field13610 };
    }
    
    private static String Method4964(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4489 ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
