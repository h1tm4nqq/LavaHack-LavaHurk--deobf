//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class Class1633 extends Class42
{
    private int Field15621;
    
    public Class1633() {
        super("GhostBlock", Class97.Field8345);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        final ItemStack getStackInSlot = Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem);
        final ItemStack itemStack = new ItemStack(Blocks.OBSIDIAN, 1);
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setInventorySlotContents(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, itemStack);
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setItemStack(itemStack);
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setPickedItemStack(itemStack);
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos(), Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.sideHit, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.swingArm(EnumHand.MAIN_HAND);
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setInventorySlotContents(Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, getStackInSlot);
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setItemStack(getStackInSlot);
        Class1633.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.setPickedItemStack(getStackInSlot);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x283D ^ 0xAC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
