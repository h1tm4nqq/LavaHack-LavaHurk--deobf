//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class923;
import lavahack.client.Class94;
import lavahack.client.Class97;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Class2012
public class Class412
extends Class42 {
    private final Class44[] Field9707 = new Class44[]{new Class44("One", (Class42)this, Class923.Field11900), new Class44("Two", (Class42)this, Class923.Field11900), new Class44("Three", (Class42)this, Class923.Field11900), new Class44("Four", (Class42)this, Class923.Field11900), new Class44("Five", (Class42)this, Class923.Field11900), new Class44("Six", (Class42)this, Class923.Field11900), new Class44("Seven", (Class42)this, Class923.Field11900), new Class44("Eight", (Class42)this, Class923.Field11900), new Class44("Nine", (Class42)this, Class923.Field11900)};
    private final Class94[] Field9708 = new Class94[]{new Class94(36, null), new Class94(37, null), new Class94(38, null), new Class94(39, null), new Class94(40, null), new Class94(41, null), new Class94(42, null), new Class94(43, null), new Class94(44, null)};
    private String Field9709 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class412() {
        super("Refill", Class97.Field8341);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[0]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[1]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[2]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[3]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[4]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[5]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[6]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[7]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[8]);
    }

    @Override
    public void Method45() {
        if (Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = 0;
        while (n < this.Field9708.length) {
            if (this.Method2006(this.Field9707[n]) != null) {
                this.Field9708[n].Field8327 = this.Method2006(this.Field9707[n]);
                this.Field9708[n].Method801();
                if (this.Field9708[n].Field8327 != null && this.Field9708[n].Field8326 != -1 && Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && this.Field9708[n].Field8325 != -1 && ((ItemStack)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory().get(this.Field9708[n].Field8325)).getItem() != this.Field9708[n].Field8327) {
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[n].Field8326, 0, ClickType.PICKUP, (EntityPlayer)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[n].Field8325, 0, ClickType.PICKUP, (EntityPlayer)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[n].Field8326, 0, ClickType.PICKUP, (EntityPlayer)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
                }
            }
            ++n;
        }
    }

    private Item Method2006(Class44 class44) {
        String string = class44.Method359();
        int n = -1;
        switch (string.hashCode()) {
            case -1582753002: {
                if (!string.equals("Crystal")) return null;
                return null;
            }
            case 76987430: {
                if (!string.equals("Pearl")) return null;
                return null;
            }
            case 80997281: {
                if (!string.equals("Totem")) return null;
                return null;
            }
            case 80307677: {
                if (!string.equals("Sword")) return null;
                return null;
            }
            case 1086624557: {
                if (!string.equals("Pickaxe")) return null;
                return null;
            }
            case 66286: {
                if (!string.equals("Axe")) return null;
                return null;
            }
            case 1855960161: {
                if (!string.equals("Strength")) return null;
                return null;
            }
            case 2017619398: {
                if (!string.equals("Chorus")) return null;
                return null;
            }
            case -1819473015: {
                if (!string.equals("Shield")) return null;
                return null;
            }
            case 2125698931: {
                if (!string.equals("Gapple")) return null;
                return null;
            }
            case -98403751: {
                if (!string.equals("RedstoneBlock")) return null;
                return null;
            }
            case -1904124519: {
                if (!string.equals("Piston")) return null;
                return null;
            }
            case 416515707: {
                if (!string.equals("Obsidian")) return null;
                return null;
            }
            case -966294215: {
                if (!string.equals("EnderChest")) return null;
                return null;
            }
            case 70141: {
                if (!string.equals("Exp")) return null;
                return null;
            }
        }
        return null;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x39BC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

