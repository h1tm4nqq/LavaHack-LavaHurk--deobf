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
import lavahack.client.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$1;
import lavahack.client.aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketClickWindow;
import net.minecraft.network.play.client.CPacketHeldItemChange;

public class aYbbYntkurUPImKqpn4NToDjVrwxuFgJ
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field9710 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field12709).Method5303();
    private int Field9711 = (int)1609676802L ^ 0xA00E47FD;
    private int Field9712 = (int)((long)1304043605 ^ (long)-1304043606);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9713 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2008, new Predicate[(int)-61650397L ^ 0xFC534A23]);
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field9714 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(this::Method2007, new Predicate[(int)584595678L ^ 0x22D838DE]);
    private String Field9715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public aYbbYntkurUPImKqpn4NToDjVrwxuFgJ() {
        super("HandMine", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field9711 = (int)-2104555834L ^ 0x7D70F939;
            this.Field9712 = (int)((long)-1593637963 ^ (long)1593637962);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field9713);
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field9714);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field9713);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field9714);
    }

    private void Method2007(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        if (this.Field9711 == (int)((long)194484256 ^ (long)-194484257)) return;
        if (this.Field9712 == ((int)68703794L ^ 0xFBE7A9CD)) {
            return;
        }
        switch (aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$1.Field11832[((aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9710.Method341()).ordinal()]) {
            case 1: {
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.Field9712));
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                return;
            }
            case 2: {
                short s = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.slotClick(this.Field9711 + (((int)-135119244L ^ 0xF7F23E7D) << 2), aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + (((int)-694215048L ^ 0xD69F1E71) << 2), aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                return;
            }
            case 3: {
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                return;
            }
            case 4: {
                short s = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field9712);
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + (((int)-640080760L ^ 0xD9D92481) << 2), aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9712;
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9712;
                return;
            }
        }
    }

    private void Method2008(ARQmBQvY5BCKjQHAEtWILloZwAOUZwhy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        this.Field9712 = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        this.Field9711 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method109(aRQmBQvY5BCKjQHAEtWILloZwAOUZwhy$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method2155());
        if (this.Field9711 == (int)((long)1136458895 ^ (long)-1136458896)) {
            return;
        }
        switch (aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$1.Field11832[((aYbbYntkurUPImKqpn4NToDjVrwxuFgJ$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9710.Method341()).ordinal()]) {
            case 1: {
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(this.Field9711));
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                return;
            }
            case 2: {
                short s = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.slotClick(this.Field9711 + ((int)((long)-989660229 ^ (long)-989660238) << 2), aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, (EntityPlayer)aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + ((int)((long)-217532225 ^ (long)-217532234) << 2), aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                return;
            }
            case 3: {
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                return;
            }
            case 4: {
                short s = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.openContainer.getNextTransactionID(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory);
                ItemStack itemStack = aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(this.Field9711);
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketClickWindow(aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9711 + ((int)((long)1363034025 ^ (long)1363034016) << 2), aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem, ClickType.SWAP, itemStack, s));
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = this.Field9711;
                aYbbYntkurUPImKqpn4NToDjVrwxuFgJ.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.currentPlayerItem = this.Field9711;
                return;
            }
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1585375765L ^ 0x5E7EEA15;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-90650516 ^ (long)-90650477);
            int n2 = (int)1471380359L ^ 0x57B37BF8;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1981526727 ^ (long)1981521584) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

