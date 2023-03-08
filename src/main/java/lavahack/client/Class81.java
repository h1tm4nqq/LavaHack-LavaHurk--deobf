//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

enum Class81
{
    Field8270("Up", 0), 
    Field8271("Down", 1), 
    Field8272("LimitJitter", 2), 
    Field8273("Preserve", 3), 
    Field8274("Bypass", 4), 
    Field8275("Obscure", 5);
    
    private static final Class81[] Field8276;
    private String Field8277 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class81(final String name, final int ordinal) {
    }
    
    static {
        Field8276 = new Class81[] { Class81.Field8270, Class81.Field8271, Class81.Field8272, Class81.Field8273, Class81.Field8274, Class81.Field8275 };
    }
    
    private static String Method728(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5110 ^ 0x1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
