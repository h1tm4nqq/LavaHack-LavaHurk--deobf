//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.server.SPacketUpdateHealth
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class805;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketUpdateHealth;

public class Class1448
extends Class42 {
    private Packet Field14773 = null;
    private final Class618 Field14774 = new Class618(this::Method5771, new Predicate[0]);
    private String Field14775 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1448() {
        super("HealthCancel", Class97.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1448.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1448.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
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

    private void Method5771(Class805 class805) {
        if (!(class805.Method982() instanceof SPacketUpdateHealth)) return;
        this.Field14773 = class805.Method982();
        class805.Method158();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 207;
            cArray2[n] = (char)(cArray[n] ^ (0x5966 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

