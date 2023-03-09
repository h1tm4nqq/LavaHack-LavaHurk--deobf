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

import lavahack.client.Class1744;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class536;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class1699
extends Class42 {
    private final Class44 Field15864 = this.Method23(new Class44("Mode", (Class42)this, Class536.Field10262));
    private final Class44 Field15865 = this.Method23(new Class44("Health", (Class42)this, Double.longBitsToDouble(4628574517030027264L), 0.0, Double.longBitsToDouble((long)961344123 ^ 0x40420000394CF27BL), false));
    private final Class44 Field15866 = this.Method23(new Class44("Packet Iteration", (Class42)this, Double.longBitsToDouble(0x4034000000000000L), 0.0, Double.longBitsToDouble((long)1011838889 ^ 0x404400003C4F6FA9L), false));
    private int Field15867;

    public Class1699() {
        super("PacketEat", Class97.Field8344);
    }

    @Override
    public boolean Method52() {
        return true;
    }

    @Override
    public void Method45() {
        if (Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) {
            return;
        }
        if (Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive() && Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand().getItem() instanceof ItemAppleGold && (this.Field15864.Method341() == Class536.Field10262 || this.Field15864.Method341() == Class536.Field10264)) {
            for (int i = 0; i < this.Field15866.Method335(); ++i) {
                Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer());
            }
            Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.stopActiveHand();
        }
        if (this.Field15864.Method341() == Class536.Field10264 && Class1744.Method6647() <= (float)this.Field15865.Method335()) {
            Class9.Method123(Class9.Method126(Items.GOLDEN_APPLE));
            Class1699.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        }
        super.Method45();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method6509(PlayerInteractEvent.RightClickItem rightClickItem) {
        if (!rightClickItem.getItemStack().getItem().equals(Items.GOLDEN_APPLE)) return;
        if (this.Field15864.Method341() != Class536.Field10263) return;
        rightClickItem.getItemStack().getItem().onItemUseFinish(rightClickItem.getItemStack(), rightClickItem.getWorld(), (EntityLivingBase)rightClickItem.getEntityPlayer());
        rightClickItem.setCanceled(true);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 216;
            cArray2[n] = (char)(cArray[n] ^ (0x1D54 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

