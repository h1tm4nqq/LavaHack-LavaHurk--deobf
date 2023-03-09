//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumHand;

public class Class1633
extends Class42 {
    private int Field15621;

    public Class1633() {
        super("GhostBlock", Class97.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            ItemStack itemStack = Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem);
            ItemStack itemStack2 = new ItemStack(Blocks.OBSIDIAN, 1);
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setInventorySlotContents(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, itemStack2);
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setItemStack(itemStack2);
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setPickedItemStack(itemStack2);
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos(), Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setInventorySlotContents(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, itemStack);
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setItemStack(itemStack);
            Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setPickedItemStack(itemStack);
            return;
        }
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 172;
            cArray2[n] = (char)(cArray[n] ^ (0x283D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

