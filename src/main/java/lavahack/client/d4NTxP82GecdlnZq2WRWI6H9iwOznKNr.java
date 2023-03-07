//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;

public class d4NTxP82GecdlnZq2WRWI6H9iwOznKNr
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10648 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12512));
    private int Field10649;

    public d4NTxP82GecdlnZq2WRWI6H9iwOznKNr() {
        super("Spider", "Allows to walk on walls", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
        super.Method44(this::Method2656);
    }

    @Override
    public void Method45() {
        if (d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (this.Field10648.Method309(d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12512.name()) && !d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isOnLadder() && d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally && d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY < Double.longBitsToDouble((long)1692048699 ^ 0x3FC99999FD4304A1L)) {
            d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble((long)1382139757 ^ 0x3FC99999CBF85EF7L);
            return;
        }
        if (!this.Field10648.Method309(d4NTxP82GecdlnZq2WRWI6H9iwOznKNr$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12513.name())) return;
        if (!d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.collidedHorizontally) return;
        if (d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % ((int)((long)-1367359113 ^ (long)-1367359114) << 3) != 0) return;
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player, CPacketEntityAction.Action.START_FALL_FLYING));
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionY = Double.longBitsToDouble(0x4192B963E577CEC6L ^ 0x7E4858244B63B427L);
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.fallDistance = 0.0f;
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer((boolean)((long)1247028983 ^ (long)1247028982)));
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        d4NTxP82GecdlnZq2WRWI6H9iwOznKNr.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
    }

    private String Method2656() {
        return "[" + this.Field10648.Method359() + "]";
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1270297842L ^ 0xB448CB0E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-43938494 ^ (long)-43938371);
            int n2 = (int)((long)1798000715 ^ (long)1798000760);
            cArray2[n] = (char)(cArray[n] ^ ((int)301356549L ^ 0x11F6078E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

