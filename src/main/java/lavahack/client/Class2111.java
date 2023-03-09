//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.status.client.CPacketPing
 *  net.minecraft.network.status.server.SPacketPong
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1393;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class42;
import lavahack.client.Class544;
import lavahack.client.Class618;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.status.client.CPacketPing;
import net.minecraft.network.status.server.SPacketPong;

public class Class2111
extends Class42 {
    private long Field17603 = 0L;
    @Class1801
    private final Class618 Field17604 = new Class618(this::Method7651, new Predicate[0]);
    private String Field17605 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2111() {
        super("PacketDelay", "Measures the delay a packet needs to be send and received back", Class97.Field8343, 0, true);
    }

    @Override
    public void Method38() {
        if (Class2111.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class2111.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1393.Method5505().Method1886("Sending packet...");
        Class2111.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPing());
        this.Field17603 = System.currentTimeMillis();
        Class1796.Field16242.Method705(this);
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method710(this);
    }

    private void Method7651(Class544 class544) {
        if (!(class544.Method982() instanceof SPacketPong)) {
            return;
        }
        long l = System.currentTimeMillis();
        Class1393.Method5505().Method1886("The delay was: " + (l - this.Field17603) + "ms");
        this.Field17603 = 0L;
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 249;
            cArray2[n] = (char)(cArray[n] ^ (0x6CE3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

