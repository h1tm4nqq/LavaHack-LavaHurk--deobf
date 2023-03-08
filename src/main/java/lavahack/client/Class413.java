//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;
import net.minecraft.network.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.network.play.client.*;

public class Class413 extends Class42
{
    private final Class1303 Field9710;
    private int Field9711;
    private int Field9712;
    private final Class618 Field9713;
    private final Class618 Field9714;
    private String Field9715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class413() {
        super("HandMine", Class97.Field8344);
        this.Field9710 = new Class1303("Mode", (Class42)this, (Enum)Class1069.Field12709).Method5303();
        this.Field9711 = -1;
        this.Field9712 = -1;
        this.Field9713 = new Class618(this::Method2008, new Predicate[0]);
        this.Field9714 = new Class618(this::Method2007, new Predicate[0]);
    }
    
    @Override
    public void Method38() {
        super.Method38();
        if (Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Field9711 = -1;
        this.Field9712 = -1;
        Class1796.Field16242.Method706(this.Field9713);
        Class1796.Field16242.Method706(this.Field9714);
    }
    
    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field9713);
        Class1796.Field16242.Method711(this.Field9714);
    }
    
    private void Method2007(final Class1232 class1232) {
        if (this.Field9711 == -1 || this.Field9712 == -1) {
            return;
        }
        switch (Class905.Field11832[((Class1069)this.Field9710.Method341()).ordinal()]) {
            case 1: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.Field9712));
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                break;
            }
            case 2: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.slotClick(this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player), Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory)));
                break;
            }
            case 3: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                break;
            }
            case 4: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field9712), Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory)));
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                break;
            }
        }
    }
    
    private void Method2008(final Class2109 class2109) {
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
                break;
            }
            case 2: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.slotClick(this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player), Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory)));
                break;
            }
            case 3: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                break;
            }
            case 4: {
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + 36, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field9711), Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory)));
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                Class413.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                break;
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2C77 ^ 0x7F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
