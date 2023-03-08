//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class2084
{
    Field17518("Pre", 0), 
    Field17519("Post", 1);
    
    private static final Class2084[] Field17520;
    private String Field17521 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class2084(final String name, final int ordinal) {
    }
    
    static {
        Field17520 = new Class2084[] { Class2084.Field17518, Class2084.Field17519 };
    }
    
    private static String Method7621(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5912 ^ 0x65));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
