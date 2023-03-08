//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.item.*;
import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;

@Class2012
public class Class412 extends Class42
{
    private final Class44[] Field9707;
    private final Class94[] Field9708;
    private String Field9709 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class412() {
        super("Refill", Class97.Field8341);
        this.Field9707 = new Class44[] { new Class44("One", this, Class923.Field11900), new Class44("Two", this, Class923.Field11900), new Class44("Three", this, Class923.Field11900), new Class44("Four", this, Class923.Field11900), new Class44("Five", this, Class923.Field11900), new Class44("Six", this, Class923.Field11900), new Class44("Seven", this, Class923.Field11900), new Class44("Eight", this, Class923.Field11900), new Class44("Nine", this, Class923.Field11900) };
        this.Field9708 = new Class94[] { new Class94(36, null), new Class94(37, null), new Class94(38, null), new Class94(39, null), new Class94(40, null), new Class94(41, null), new Class94(42, null), new Class94(43, null), new Class94(44, null) };
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[0]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[1]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[2]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[3]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[4]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[5]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[6]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[7]);
        Class412.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[8]);
    }
    
    @Override
    public void Method45() {
        if (Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        for (int i = 0; i < this.Field9708.length; ++i) {
            if (this.Method2006(this.Field9707[i]) != null) {
                this.Field9708[i].Field8327 = this.Method2006(this.Field9707[i]);
                this.Field9708[i].Method801();
                if (this.Field9708[i].Field8327 != null && this.Field9708[i].Field8326 != -1 && Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && this.Field9708[i].Field8325 != -1 && ((ItemStack)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory().get(this.Field9708[i].Field8325)).getItem() != this.Field9708[i].Field8327) {
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[i].Field8326, 0, ClickType.PICKUP, (EntityPlayer)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[i].Field8325, 0, ClickType.PICKUP, (EntityPlayer)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[i].Field8326, 0, ClickType.PICKUP, (EntityPlayer)Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Class412.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
                }
            }
        }
    }
    
    private Item Method2006(final Class44 class44) {
        final String method359 = class44.Method359();
        switch (method359.hashCode()) {
            case -1582753002: {
                if (method359.equals("Crystal")) {
                    break;
                }
                break;
            }
            case 76987430: {
                if (method359.equals("Pearl")) {
                    break;
                }
                break;
            }
            case 80997281: {
                if (method359.equals("Totem")) {
                    break;
                }
                break;
            }
            case 80307677: {
                if (method359.equals("Sword")) {
                    break;
                }
                break;
            }
            case 1086624557: {
                if (method359.equals("Pickaxe")) {
                    break;
                }
                break;
            }
            case 66286: {
                if (method359.equals("Axe")) {
                    break;
                }
                break;
            }
            case 1855960161: {
                if (method359.equals("Strength")) {
                    break;
                }
                break;
            }
            case 2017619398: {
                if (method359.equals("Chorus")) {
                    break;
                }
                break;
            }
            case -1819473015: {
                if (method359.equals("Shield")) {
                    break;
                }
                break;
            }
            case 2125698931: {
                if (method359.equals("Gapple")) {
                    break;
                }
                break;
            }
            case -98403751: {
                if (method359.equals("RedstoneBlock")) {
                    break;
                }
                break;
            }
            case -1904124519: {
                if (method359.equals("Piston")) {
                    break;
                }
                break;
            }
            case 416515707: {
                if (method359.equals("Obsidian")) {
                    break;
                }
                break;
            }
            case -966294215: {
                if (method359.equals("EnderChest")) {
                    break;
                }
                break;
            }
            case 70141: {
                if (method359.equals("Exp")) {
                    break;
                }
                break;
            }
        }
        return null;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39BC ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
