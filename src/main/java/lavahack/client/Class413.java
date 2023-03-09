//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketClickWindow
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1069;
import lavahack.client.Class1232;
import lavahack.client.Class1303;
import lavahack.client.Class1796;
import lavahack.client.Class2109;
import lavahack.client.Class42;
import lavahack.client.Class618;
import lavahack.client.Class9;
import lavahack.client.Class905;
import lavahack.client.Class97;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.network.play.client.CPacketHeldItemChange;

public class Class413
extends Class42 {
    private final Class1303 Field9710 = new Class1303("Mode", (Class42)this, Class1069.Field12709).Method5303();
    private int Field9711 = -1;
    private int Field9712 = -1;
    private final Class618 Field9713 = new Class618(this::Method2008, new Predicate[0]);
    private final Class618 Field9714 = new Class618(this::Method2007, new Predicate[0]);
    private String Field9715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class413() {
        super("HandMine", Class97.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field9711 = -1;
            this.Field9712 = -1;
            Class1796.Field16242.Method706(this.Field9713);
            Class1796.Field16242.Method706(this.Field9714);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field9713);
        Class1796.Field16242.Method711(this.Field9714);
    }

    private void Method2007(Class1232 class1232) {
        if (this.Field9711 == -1) return;
        if (this.Field9712 == -1) {
            return;
        }
        switch (Class905.Field11832[((Class1069)this.Field9710.Method341()).ordinal()]) {
            case 1: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.Field9712));
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                return;
            }
            case 2: {
                short s = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.slotClick(this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                return;
            }
            case 3: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                return;
            }
            case 4: {
                short s = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field9712);
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                return;
            }
        }
    }

    private void Method2008(Class2109 class2109) {
        this.Field9712 = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field9711 = Class9.Method109(class2109.Method2155());
        if (this.Field9711 == -1) {
            return;
        }
        switch (Class905.Field11832[((Class1069)this.Field9710.Method341()).ordinal()]) {
            case 1: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.Field9711));
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                return;
            }
            case 2: {
                short s = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.slotClick(this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                return;
            }
            case 3: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                return;
            }
            case 4: {
                short s = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field9711);
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                return;
            }
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 127;
            cArray2[n] = (char)(cArray[n] ^ (0x2C77 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

