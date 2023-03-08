//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class210 extends Class42
{
    private final Class44 Field8902;
    private final Class44 Field8903;
    private String Field8904 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class210() {
        super("SeedOverlay", "This module was provided by TudbuT", Class97.Field8344);
        this.Field8902 = this.Method23(new Class44("ChinkRange", this, 1.0, 1.0, Double.longBitsToDouble(4613937818241073152L), true));
        this.Field8903 = this.Method23(new Class44("Credit", this, true));
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class210.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class210.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (!this.Field8903.Method365()) {
            Class1393.Method5505().Method1886("You don't have credit on! :( It is recommended to turn it on");
            return;
        }
        Class1393.Method5505().Method1886("This module was provided by TudbuT (TudbuT#2624)");
        Class1393.Method5505().Method1886("Check out his code here: https://github.com/TudbuT/ttc");
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2D75 ^ 0x70));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
