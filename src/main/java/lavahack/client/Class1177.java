//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class1177
{
    Field13303("Box1", 0), 
    Field13304("Box2", 1), 
    Field13305("Model", 2);
    
    private static final Class1177[] Field13306;
    private String Field13307 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1177(final String name, final int ordinal) {
    }
    
    static {
        Field13306 = new Class1177[] { Class1177.Field13303, Class1177.Field13304, Class1177.Field13305 };
    }
    
    private static String Method4738(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x45CC ^ 0x49));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
