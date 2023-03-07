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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumHand;

public class AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private int Field15621;

    public AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi() {
        super("GhostBlock", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            ItemStack itemStack = AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem);
            ItemStack itemStack2 = new ItemStack(Blocks.OBSIDIAN, (int)((long)1334118188 ^ (long)1334118189));
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setInventorySlotContents(AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, itemStack2);
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setItemStack(itemStack2);
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setPickedItemStack(itemStack2);
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos(), AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setInventorySlotContents(AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, itemStack);
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setItemStack(itemStack);
            AXV0CxCWGbFnbFUxUqKWW577NFAUXcUi.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setPickedItemStack(itemStack);
            return;
        }
        this.Method22();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-785024491L ^ 0xD1357A15;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)240461065 ^ (long)240461302);
            int n2 = ((int)1479153949L ^ 0x582A1936) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1689943659 ^ (long)1689933398) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

