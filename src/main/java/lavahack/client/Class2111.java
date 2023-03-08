//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.status.client.*;
import net.minecraft.network.*;
import net.minecraft.network.status.server.*;

public class Class2111 extends Class42
{
    private long Field17603;
    @Class1801
    private final Class618 Field17604;
    private String Field17605 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2111() {
        super("PacketDelay", "Measures the delay a packet needs to be send and received back", Class97.Field8343, 0, true);
        this.Field17603 = 0L;
        this.Field17604 = new Class618(this::Method7651, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        if (Class2111.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2111.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1393.Method5505().Method1886("Sending packet...");
        Class2111.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPing());
        this.Field17603 = System.currentTimeMillis();
        Class1796.Field16242.Method705((Class1320)this);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710((Class1320)this);
    }
    
    private void Method7651(final Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPong)) {
            return;
        }
        Class1393.Method5505().Method1886("The delay was: " + (System.currentTimeMillis() - this.Field17603) + "ms");
        this.Field17603 = 0L;
        this.Method22();
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6CE3 ^ 0xF9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
