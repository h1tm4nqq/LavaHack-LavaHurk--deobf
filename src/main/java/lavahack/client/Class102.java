//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public enum Class102
{
    Field8354("Normal", 0), 
    Field8355("Silent", 1);
    
    private static final Class102[] Field8356;
    private String Field8357 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class102(final String name, final int ordinal) {
    }
    
    static {
        Field8356 = new Class102[] { Class102.Field8354, Class102.Field8355 };
    }
    
    private static String Method814(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x53DC ^ 0x85));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
