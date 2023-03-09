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

import com.kisman.cc.util.Class650;
import java.util.Iterator;
import java.util.Objects;
import lavahack.client.Class1211;
import lavahack.client.Class2019;
import lavahack.client.Class42;
import lavahack.client.Class97;
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

public class Class535
extends Class42 {
    private Class650 Field10259 = new Class650();
    private ItemStack Field10260 = null;
    private String Field10261 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class535() {
        super("AutoPot", "auto potion", Class97.Field8338);
    }

    @Override
    public void Method45() {
        if (Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (this.Field10260 == null && this.Field10259.Method2800(Float.intBitsToFloat(1120403456))) {
            this.Field10260 = Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHeldItemMainhand();
        }
        if (!this.Method2426()) return;
        if (!Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround) return;
        float f = Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch;
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = Float.intBitsToFloat(1119092736);
        if (!Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)1)))) {
            this.Method2424(Class2019.Field17292);
        }
        if (!Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)5)))) {
            this.Method2424(Class2019.Field17291);
        }
        if (!Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)12)))) {
            this.Method2424(Class2019.Field17293);
        }
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch = f;
        this.Field10259.Method2801();
    }

    @Override
    public boolean Method52() {
        return true;
    }

    private void Method2424(Class2019 class2019) {
        int n = this.Method2425(class2019);
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(EnumHand.MAIN_HAND));
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
        Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem));
    }

    private int Method2425(Class2019 class2019) {
        int n = 0;
        while (!this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), class2019)) {
            ++n;
        }
        return n;
    }

    private boolean Method2426() {
        int n = 0;
        while (!this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), Class2019.Field17291)) {
            if (this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), Class2019.Field17292)) return true;
            if (this.Method2427(Class535.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n), Class2019.Field17293)) {
                return true;
            }
            ++n;
        }
        return true;
    }

    private boolean Method2427(ItemStack itemStack, Class2019 class2019) {
        PotionEffect potionEffect;
        if (itemStack == null) {
            return false;
        }
        Item item = itemStack.getItem();
        if (item != Items.SPLASH_POTION) return false;
        int n = 5;
        switch (Class1211.Field13493[class2019.ordinal()]) {
            case 1: {
                n = 5;
                break;
            }
            case 2: {
                n = 1;
                break;
            }
            case 3: {
                n = 12;
                break;
            }
        }
        Iterator iterator = PotionUtils.getEffectsFromStack((ItemStack)itemStack).iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((potionEffect = (PotionEffect)iterator.next()).getPotion() != Potion.getPotionById((int)n));
        return true;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 150;
            cArray2[n] = (char)(cArray[n] ^ (0x7C6C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

