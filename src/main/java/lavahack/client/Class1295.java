//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1295
{
    Field13918("UNLOAD", 0), 
    Field13919("RELOAD", 1);
    
    private static final Class1295[] Field13920;
    private String Field13921 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1295(final String name, final int ordinal) {
    }
    
    static {
        Field13920 = new Class1295[] { Class1295.Field13918, Class1295.Field13919 };
    }
    
    private static String Method5264(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xD54 ^ 0xBC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
