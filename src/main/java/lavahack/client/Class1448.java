//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.network.*;
import java.util.function.*;
import net.minecraft.network.play.server.*;

public class Class1448 extends Class42
{
    private Packet Field14773;
    private final Class618 Field14774;
    private String Field14775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1448() {
        super("HealthCancel", Class97.Field8345);
        this.Field14773 = null;
        this.Field14774 = new Class618(this::Method5771, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1448.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1448.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1796.Field16242.Method706(this.Field14774);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field14774);
        if (Class1448.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.networkManager != null && Class1448.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.networkManager.isChannelOpen()) {
            this.Field14773.processPacket(Class1448.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.networkManager.getNetHandler());
        }
        this.Field14773 = null;
    }
    
    private void Method5771(final Class805 class805) {
        if (class805.Method982() instanceof SPacketUpdateHealth) {
            this.Field14773 = class805.Method982();
            class805.Method158();
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5966 ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
