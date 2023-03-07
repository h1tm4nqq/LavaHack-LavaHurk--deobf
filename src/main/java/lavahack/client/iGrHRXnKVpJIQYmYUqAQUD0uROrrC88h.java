//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.potion.Potion
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.potion.PotionUtils
 *  net.minecraft.util.EnumHand
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.Iterator;
import java.util.Objects;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$1;
import lavahack.client.iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.EnumHand;

public class iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10259 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private ItemStack Field10260 = null;
    private String Field10261 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h() {
        super("AutoPot", "auto potion", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method45() {
        if (iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10260 == null && this.Field10259.Method2800(Float.intBitsToFloat((int)((long)1167898987 ^ (long)122993003)))) {
            this.Field10260 = iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand();
        }
        if (!this.Method2426()) return;
        if (!iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        float f = iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = Float.intBitsToFloat(0x39FF21F8 ^ 0x7B4B21F8);
        if (!iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)((int)1090209116L ^ 0x40FB455D))))) {
            this.Method2424(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17292);
        }
        if (!iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)((int)((long)-1759787639 ^ (long)-1759787636)))))) {
            this.Method2424(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17291);
        }
        if (!iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)(((int)2083236594L ^ 0x7C2BAAF1) << 2))))) {
            this.Method2424(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17293);
        }
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = f;
        this.Field10259.Method2801();
    }

    @Override
    public boolean Method52() {
        return ((int)-1268102271L ^ 0xB46A4B80) != 0;
    }

    private void Method2424(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        int n = this.Method2425(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem));
    }

    private int Method2425(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        int n = (int)((long)1508320974 ^ (long)1508320974);
        while (true) {
            int cfr_ignored_0 = (int)((long)-1529158809 ^ (long)-1529158802);
            if (this.Method2427(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)) {
                return n;
            }
            ++n;
        }
    }

    private boolean Method2426() {
        int n = (int)-1091217346L ^ 0xBEF5583E;
        while (true) {
            int cfr_ignored_0 = (int)-2020406379L ^ 0x87930B9C;
            if (this.Method2427(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17291)) return (int)((long)-1802041159 ^ (long)-1802041160) != 0;
            if (this.Method2427(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17292)) return (int)((long)-1802041159 ^ (long)-1802041160) != 0;
            if (this.Method2427(iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17293)) {
                return (int)((long)-1802041159 ^ (long)-1802041160) != 0;
            }
            ++n;
        }
    }

    private boolean Method2427(ItemStack itemStack, iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        PotionEffect potionEffect;
        if (itemStack == null) {
            return ((int)744425642L ^ 0x2C5F08AA) != 0;
        }
        Item item = itemStack.getItem();
        if (item != Items.SPLASH_POTION) return ((int)-1202925959L ^ 0xB84CCE79) != 0;
        int n = (int)((long)-1299793482 ^ (long)-1299793485);
        switch (iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$1.Field13493[iGrHRXnKVpJIQYmYUqAQUD0uROrrC88h$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.ordinal()]) {
            case 1: {
                n = (int)((long)1324386914 ^ (long)1324386919);
                break;
            }
            case 2: {
                n = (int)-296344867L ^ 0xEE5622DC;
                break;
            }
            case 3: {
                n = (int)((long)488529569 ^ (long)488529570) << 2;
                break;
            }
        }
        Iterator iterator = PotionUtils.getEffectsFromStack((ItemStack)itemStack).iterator();
        do {
            if (!iterator.hasNext()) return ((int)-1202925959L ^ 0xB84CCE79) != 0;
        } while ((potionEffect = (PotionEffect)iterator.next()).getPotion() != Potion.getPotionById((int)n));
        return (int)((long)-1257669579 ^ (long)-1257669580) != 0;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1865286798L ^ 0x90D1FB72;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1058945796 ^ (long)-1058946045);
            int n2 = ((int)-522234428L ^ 0xE0DF558F) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1593035378L ^ 0xA10C2A95) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

