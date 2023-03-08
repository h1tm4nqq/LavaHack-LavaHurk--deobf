//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1536 extends Class42
{
    private final Class44 Field15171;
    private final Class44 Field15172;
    private String Field15173 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1536() {
        super("CustomDelay", Class97.Field8345);
        this.Field15171 = this.Method23(new Class44("DelayMS", this, Double.longBitsToDouble(4632233691727265792L), 0.0, Double.longBitsToDouble(4652007308841189376L), true));
        this.Field15172 = this.Method23(new Class44("CorePoolSize", this, 1.0, 1.0, Double.longBitsToDouble(4625196817309499392L), true));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x697F ^ 0x8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
