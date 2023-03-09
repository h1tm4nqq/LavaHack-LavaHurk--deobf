//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import lavahack.client.Class1393;
import lavahack.client.Class1744;
import lavahack.client.Class341;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.BlockPos;

public class Class624
extends Class42 {
    private final Class44 Field10656 = this.Method23(new Class44("Test", (Class42)this, false));
    private final Class44 Field10657 = this.Method23(new Class44("Strict", (Class42)this, true));
    private final Class44 Field10658 = this.Method23(new Class44("DelayMultiplier", (Class42)this, 1.0, 0.0, Double.longBitsToDouble(0x4024000000000000L), false));
    private final Class44 Field10659 = this.Method23(new Class44("Sprint", (Class42)this, false));
    private final Class44 Field10660 = this.Method23(new Class44("SetPosition", (Class42)this, false));
    private final Class44 Field10661 = this.Method23(new Class44("SmartOnGround", (Class42)this, false));
    private final Class44 Field10662 = this.Method23(new Class44("NoClip", (Class42)this, false));
    private final Class44 Field10663 = this.Method23(new Class44("CancelInBlock", (Class42)this, false));
    private final Class44 Field10664 = this.Method23(new Class44("CancelOffGround", (Class42)this, false));
    private final Class650 Field10665 = new Class650();
    private CPacketPlayer.Position[] Field10666 = new CPacketPlayer.Position[0];
    private long Field10667;
    private String Field10668 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class624() {
        super("TickShiftTeleport", Class97.Field8344);
    }

    @Override
    public void Method38() {
        if (Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        BlockPos blockPos = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
        if (blockPos == null || Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit != null) {
            Class1393.Method5504().Method1886("Cannot Teleport onto an Entity!");
            return;
        }
        blockPos = blockPos.up();
        double d = blockPos.getX();
        double d2 = blockPos.getY();
        double d3 = blockPos.getZ();
        if (this.Field10656.Method365()) {
            d2 = Class1744.Method6657().getY();
        }
        double d4 = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d5 = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d6 = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        int n = Class341.Method1678(Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(d += Double.longBitsToDouble(4602678819172646912L), d2, d3 += Double.longBitsToDouble((long)819899470 ^ 0x3FE0000030DEAC4EL)), this.Field10659.Method365());
        this.Field10666 = Class341.Method1679(n, true, this.Field10663.Method365(), this.Field10664.Method365(), this.Field10661.Method365(), d4, d5, d6, d, d2, d3);
        this.Field10665.Method2801();
        this.Field10667 = (long)((double)((long)n * 50L) * this.Field10658.Method367());
    }

    @Override
    public void Method45() {
        if (Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (this.Field10657.Method365() && !this.Field10665.Method2797(this.Field10667)) {
            return;
        }
        Class1393.Method5505().Method1886("Charged!");
        Class1393.Method5505().Method1886("Teleporting...");
        boolean bl = Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip;
        if (this.Field10662.Method365()) {
            Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = true;
        }
        for (CPacketPlayer.Position position : this.Field10666) {
            if (position == null) continue;
            Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position);
            if (!this.Field10660.Method365()) continue;
            Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position.x, position.y, position.z);
        }
        if (this.Field10666.length > 0) {
            CPacketPlayer.Position position = this.Field10666[this.Field10666.length - 1];
            Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position.x, position.y, position.z);
        }
        Class624.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = bl;
        this.Method22();
    }

    @Override
    public void Method39() {
        this.Field10665.Method2801();
        this.Field10666 = new CPacketPlayer.Position[0];
        this.Field10667 = -1L;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 246;
            cArray2[n] = (char)(cArray[n] ^ (0x39E7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

