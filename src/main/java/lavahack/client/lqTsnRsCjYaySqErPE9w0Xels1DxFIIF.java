//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemAppleGold
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.util.EnumHand
 *  net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickItem
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class lqTsnRsCjYaySqErPE9w0Xels1DxFIIF
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15864 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10262));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15865 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Health", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x4C078B594FC3694L ^ 0x44FC78B594FC3694L), 0.0, Double.longBitsToDouble((long)961344123 ^ 0x40420000394CF27BL), ((int)1819489155L ^ 0x6C733383) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15866 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet Iteration", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0x39165043E8F0CC59L ^ 0x79225043E8F0CC59L), 0.0, Double.longBitsToDouble((long)1011838889 ^ 0x404400003C4F6FA9L), ((int)-1083543737L ^ 0xBF6A6F47) != 0));
    private int Field15867;

    public lqTsnRsCjYaySqErPE9w0Xels1DxFIIF() {
        super("PacketEat", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public boolean Method52() {
        return ((int)-1452220536L ^ 0xA970DF89) != 0;
    }

    @Override
    public void Method45() {
        if (lqTsnRsCjYaySqErPE9w0Xels1DxFIIF.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (lqTsnRsCjYaySqErPE9w0Xels1DxFIIF.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && lqTsnRsCjYaySqErPE9w0Xels1DxFIIF.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemAppleGold && (this.Field15864.Method341() == lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10262 || this.Field15864.Method341() == lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10264)) {
            for (int i = (int)-1142191575L ^ 0xBBEB8A29; i < this.Field15866.Method335(); ++i) {
                lqTsnRsCjYaySqErPE9w0Xels1DxFIIF.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer());
            }
            lqTsnRsCjYaySqErPE9w0Xels1DxFIIF.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.stopActiveHand();
        }
        if (this.Field15864.Method341() == lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10264 && PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6647() <= (float)this.Field15865.Method335()) {
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method123(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method126(Items.GOLDEN_APPLE));
            lqTsnRsCjYaySqErPE9w0Xels1DxFIIF.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        }
        super.Method45();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6509(PlayerInteractEvent.RightClickItem rightClickItem) {
        if (!rightClickItem.getItemStack().getItem().equals(Items.GOLDEN_APPLE)) return;
        if (this.Field15864.Method341() != lqTsnRsCjYaySqErPE9w0Xels1DxFIIF$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field10263) return;
        rightClickItem.getItemStack().getItem().onItemUseFinish(rightClickItem.getItemStack(), rightClickItem.getWorld(), (EntityLivingBase)rightClickItem.getEntityPlayer());
        rightClickItem.setCanceled((boolean)((long)-229671229 ^ (long)-229671230));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2133211559L ^ 0x7F2639A7;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-235910724L ^ 0xF1F04943);
            int n2 = ((int)-441890322L ^ 0xE5A949F5) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-706112681 ^ (long)-706112510) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

