//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class1732 extends Class42
{
    private final Class44 Field15943;
    private final Class44 Field15944;
    private final Class44 Field15945;
    private final Class44 Field15946;
    private String Field15947 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1732() {
        super("ClickDelayTimer", Class97.Field8343);
        this.Field15943 = this.Method23(new Class44("LeftClick", this, false));
        this.Field15944 = this.Method23(new Class44("LeftClickDelay", this, Double.longBitsToDouble(4616189618054758400L), 0.0, Double.longBitsToDouble((long)777301934 ^ 0x404400002E54AFAEL), true));
        this.Field15945 = this.Method23(new Class44("RightClick", this, true));
        this.Field15946 = this.Method23(new Class44("RightClickDelay", this, Double.longBitsToDouble((long)513726562 ^ 0x401000001E9ED862L), 0.0, Double.longBitsToDouble(4630826316843712512L), true));
    }
    
    @Override
    public void Method45() {
        if (Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method20();
        this.Method6600();
    }
    
    private void Method20() {
        if (!this.Field15943.Method365()) {
            return;
        }
        if (Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field15944.Method335() != 0) {
            return;
        }
    }
    
    private void Method6600() {
        if (!this.Field15945.Method365()) {
            return;
        }
        if (Class1732.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field15946.Method335() != 0) {
            return;
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7381 ^ 0x96));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
