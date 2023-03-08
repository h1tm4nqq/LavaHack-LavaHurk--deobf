//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1810 extends Class42
{
    public final Class44 Field16333;
    public static Class1810 Field16334;
    private String Field16335 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1810() {
        super("SwingProgress", Class97.Field8342);
        this.Field16333 = this.Method23(new Class44("Progress", this, 0.0, 0.0, Double.longBitsToDouble((long)760617357 ^ 0x401800002D56198DL), true));
        Class1810.Field16334 = this;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x53E3 ^ 0x79));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
