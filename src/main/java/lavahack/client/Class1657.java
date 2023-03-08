//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.function.*;

public class Class1657 extends Class42
{
    private final Class44 Field15712;
    private final Class44 Field15713;
    private final Class44 Field15714;
    private String Field15715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1657() {
        super("Weather", Class97.Field8343);
        this.Field15712 = this.Method23(new Class44("Type", this, "Mode", Arrays.asList("Mode", "Custom")));
        this.Field15713 = this.Method23(new Class44("Mode", this, "Sunny", Arrays.asList("Default", "Sunny", "Rain", "Thunder")).Method313(this::Method6412));
        this.Field15714 = this.Method23(new Class44("Custom", this, 0.0, 0.0, Double.longBitsToDouble(4611686018427387904L), false).Method313(this::Method6411));
    }
    
    @Override
    public void Method45() {
        if (Class1657.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null || Class1657.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        final float n = (this.Field15713.Method352() == 0) ? ((float)(this.Field15713.Method352() - 1)) : this.Field15714.Method368();
        if (this.Field15712.Method359().equals("Custom") || this.Field15713.Method352() > 0) {
            Class1657.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.setRainStrength(n);
        }
    }
    
    private Boolean Method6411() {
        return this.Field15712.Method359().equals("Custom");
    }
    
    private Boolean Method6412() {
        return this.Field15712.Method359().equals("Mode");
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4096 ^ 0xB3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
