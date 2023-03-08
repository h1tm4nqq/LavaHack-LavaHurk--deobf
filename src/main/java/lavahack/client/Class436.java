//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class436 extends Class42
{
    public final Class44 Field9825;
    public static Class436 Field9826;
    private String Field9827 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class436() {
        super("FrostWalk", Class97.Field8345);
        this.Field9825 = this.Method23(new Class44("Level", this, Double.longBitsToDouble((long)483546967 ^ 0x400000001CD25757L), 1.0, Double.longBitsToDouble((long)1494161279 ^ 0x40590000590F177FL), true));
        Class436.Field9826 = this;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6D1D ^ 0x68));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
