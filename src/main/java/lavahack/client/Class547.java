//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class547 extends Class42
{
    @Class873
    public static Class547 Field10322;
    public Class44 Field10323;
    public Class44 Field10324;
    private String Field10325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class547() {
        super("DiscordRPC", "", Class97.Field8339);
        this.Field10323 = this.Method23(new Class44("Impr RPC", (Class42)this, true));
        this.Field10324 = this.Method23(new Class44("Image Mode", (Class42)this, (Enum)Class235.Field9025));
        super.Method21(true);
    }
    
    public void Method38() {
        Class1491.Method5967();
    }
    
    public void Method39() {
        Class1491.Method5968();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4691 ^ 0x4F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
