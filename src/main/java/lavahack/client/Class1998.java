//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1998 extends Class42
{
    private final Class44 Field17178;
    private final Class44 Field17179;
    private int Field17180;
    private String Field17181 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1998() {
        super("SelfDamage", "SelfDamage", Class97.Field8343);
        this.Field17178 = this.Method23(new Class44("Jumps", this, Double.longBitsToDouble(4613937818241073152L), Double.longBitsToDouble((long)1713642386 ^ 0x4008000066241B92L), Double.longBitsToDouble(4632233691727265792L), true));
        this.Field17179 = this.Method23(new Class44("JumpTimer", this, Double.longBitsToDouble(4613937818241073152L), 1.0, Double.longBitsToDouble(4652007308841189376L), true));
    }
    
    @Override
    public void Method38() {
        this.Field17180 = 0;
    }
    
    @Override
    public void Method39() {
        Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = 1.0f;
    }
    
    @Override
    public void Method45() {
        if (Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field17180 < this.Field17178.Method367()) {
            Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = this.Field17179.Method368();
            Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround = false;
        }
        if (Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) {
            if (this.Field17180 < this.Field17178.Method367()) {
                Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.jump();
                ++this.Field17180;
            }
            else {
                Class1998.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.timer.tickLength = 1.0f;
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2E7A ^ 0x30));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
