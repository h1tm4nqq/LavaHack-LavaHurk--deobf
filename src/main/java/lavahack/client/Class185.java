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

import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.item.ItemBow;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.math.BlockPos;

public class Class185
extends Class42 {
    private final Class44 Field8807 = this.Method23(new Class44("DrawLength", (Class42)this, Double.longBitsToDouble(0x4008000000000000L), Double.longBitsToDouble(0x4008000000000000L), Double.longBitsToDouble(4626604192193052672L), true));
    private int Field8808;

    public Class185() {
        super("BowSpam", "", Class97.Field8338);
    }

    @Override
    public void Method45() {
        if (Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (!(Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemBow)) return;
        if (!Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) return;
        if (!((double)Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getItemInUseMaxCount() >= this.Field8807.Method367())) return;
        Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing()));
        Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getActiveHand()));
        Class185.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.stopActiveHand();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 31;
            cArray2[n] = (char)(cArray[n] ^ (0x2E6F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

