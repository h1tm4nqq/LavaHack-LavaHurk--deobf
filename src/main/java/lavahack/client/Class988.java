//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class988 extends Class42
{
    private int Field12238;
    private String Field12239 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class988() {
        super("HelloWorld", "Test module, print \"Hello, World\" into the chat every 5 seconds", Class97.Field8345);
        this.Field12238 = 0;
    }
    
    public void Method38() {
        super.Method38();
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
    }
    
    public void Method39() {
        super.Method39();
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
    }
    
    public void Method45() {
        if (Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class988.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        ++this.Field12238;
        if (this.Field12238 > 100) {
            this.Field12238 = 0;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2409 ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
