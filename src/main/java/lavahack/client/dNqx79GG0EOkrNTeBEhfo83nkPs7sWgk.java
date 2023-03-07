//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemBow
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.item.ItemBow;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.math.BlockPos;

public class dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8807 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DrawLength", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x56CAC1592102195CL ^ 0x16C2C1592102195CL), Double.longBitsToDouble(0x2028484334F720C8L ^ 0x6020484334F720C8L), Double.longBitsToDouble(0xA909C991C070771FL ^ 0xE93CC991C070771FL), (boolean)((long)-1380337299 ^ (long)-1380337300)));
    private int Field8808;

    public dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk() {
        super("BowSpam", "", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method45() {
        if (dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (!(dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow)) return;
        if (!dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (!((double)dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= this.Field8807.Method367())) return;
        dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing()));
        dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand()));
        dNqx79GG0EOkrNTeBEhfo83nkPs7sWgk.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.stopActiveHand();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)367329707 ^ (long)367329707);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2118018911L ^ 0x81C1985E);
            int n2 = (int)((long)1261113220 ^ (long)1261113243);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)238802445 ^ (long)238811234) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

