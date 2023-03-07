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

import lavahack.client.Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@ZnmE0qUkLUVFxZBVTXvC0GWhFQ7tgLZy
public class Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD[] Field9707;
    private final Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] Field9708;
    private String Field9709 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP() {
        super("Refill", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD[] qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD[(int)((long)-12548296 ^ (long)-12548303)];
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)-48278992 ^ (long)-48278992)] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("One", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)1109476709 ^ (long)1109476708)] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Two", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)2027768443 ^ (long)2027768442) << 1] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Three", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)1190372701 ^ (long)1190372702)] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Four", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)1820498172 ^ (long)1820498173) << 2] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Five", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)419477910 ^ (long)419477907)] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Six", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[((int)1865601084L ^ 0x6F32D03F) << 1] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Seven", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)1242422830 ^ (long)1242422825)] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Eight", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray[(int)((long)290082003 ^ (long)290082002) << 3] = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Nine", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11900);
        this.Field9707 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscDArray;
        Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[] mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf[(int)((long)-333360948 ^ (long)-333360955)];
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)271527003 ^ (long)271527003)] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)((long)-616657185 ^ (long)-616657194) << 2, null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-778061384 ^ (long)-778061383)] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)((long)-118060168 ^ (long)-118060195), null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)1771231467L ^ 0x6992D8EA) << 1] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)((long)-727296730 ^ (long)-727296715) << 1, null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)583102021 ^ (long)583102022)] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)1964990266L ^ 0x751F5F1D, null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-634994020L ^ 0xDA26C29D) << 2] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)((long)-112311423 ^ (long)-112311420) << 3, null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-1714489463 ^ (long)-1714489460)] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)-1851191465L ^ 0x91A90F7E, null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)1413830204 ^ (long)1413830207) << 1] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)((long)-1716494223 ^ (long)-1716494236) << 1, null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[(int)((long)-867749662 ^ (long)-867749659)] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)-464981181L ^ 0xE448F368, null);
        mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray[((int)-787751906L ^ 0xD10BDC1F) << 3] = new Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf((int)((long)632004324 ^ (long)632004335) << 2, null);
        this.Field9708 = mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP$YlFSugLHQAjzunVBKfamPjSRsvHTy3jfArray;
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[(int)1503762689L ^ 0x59A19901]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[(int)-485207404L ^ 0xE3145295]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[((int)-1564233645L ^ 0xA2C3B052) << 1]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[(int)((long)693979104 ^ (long)693979107)]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[(int)((long)2032175167 ^ (long)2032175166) << 2]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[(int)((long)261731141 ^ (long)261731136)]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[(int)((long)-2003244042 ^ (long)-2003244043) << 1]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[(int)((long)-208383494 ^ (long)-208383491)]);
        vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3.Method7569(this.Field9707[((int)-966025182L ^ 0xC66BA023) << 3]);
    }

    @Override
    public void Method45() {
        if (Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null && Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = (int)((long)1265665225 ^ (long)1265665225);
        while (n < this.Field9708.length) {
            if (this.Method2006(this.Field9707[n]) != null) {
                this.Field9708[n].Field8327 = this.Method2006(this.Field9707[n]);
                this.Field9708[n].Method801();
                if (this.Field9708[n].Field8327 != null && this.Field9708[n].Field8326 != (int)((long)-1584469662 ^ (long)1584469661) && Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen == null && this.Field9708[n].Field8325 != (int)((long)1551500028 ^ (long)-1551500029) && ((ItemStack)Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory().get(this.Field9708[n].Field8325)).getItem() != this.Field9708[n].Field8327) {
                    Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[n].Field8326, (int)-750534089L ^ 0xD343C237, ClickType.PICKUP, (EntityPlayer)Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[n].Field8325, (int)((long)1037717985 ^ (long)1037717985), ClickType.PICKUP, (EntityPlayer)Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.windowId, this.Field9708[n].Field8326, (int)((long)2023915969 ^ (long)2023915969), ClickType.PICKUP, (EntityPlayer)Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
                    Mx6qyP9GFcBzk5rCLNQAFE63yDftH3hP.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.updateController();
                }
            }
            ++n;
        }
    }

    private Item Method2006(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2) {
        String string = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method359();
        int n = (int)((long)-186297140 ^ (long)186297139);
        switch (string.hashCode()) {
            case -1582753002: {
                if (!string.equals("Crystal")) return null;
                n = (int)((long)-929863541 ^ (long)-929863541);
                return null;
            }
            case 76987430: {
                if (!string.equals("Pearl")) return null;
                n = (int)-1479799509L ^ 0xA7CC0D2A;
                return null;
            }
            case 80997281: {
                if (!string.equals("Totem")) return null;
                n = ((int)-168578017L ^ 0xF5F3B41E) << 1;
                return null;
            }
            case 80307677: {
                if (!string.equals("Sword")) return null;
                n = (int)-2002392309L ^ 0x88A5EB08;
                return null;
            }
            case 1086624557: {
                if (!string.equals("Pickaxe")) return null;
                n = ((int)2140206908L ^ 0x7F90F73D) << 2;
                return null;
            }
            case 66286: {
                if (!string.equals("Axe")) return null;
                n = (int)((long)654538905 ^ (long)654538908);
                return null;
            }
            case 1855960161: {
                if (!string.equals("Strength")) return null;
                n = ((int)-334838343L ^ 0xEC0AC5BA) << 1;
                return null;
            }
            case 2017619398: {
                if (!string.equals("Chorus")) return null;
                n = (int)((long)1588574041 ^ (long)1588574046);
                return null;
            }
            case -1819473015: {
                if (!string.equals("Shield")) return null;
                n = ((int)-1566611518L ^ 0xA29F67C3) << 3;
                return null;
            }
            case 2125698931: {
                if (!string.equals("Gapple")) return null;
                n = (int)-1893245917L ^ 0x8F275C2A;
                return null;
            }
            case -98403751: {
                if (!string.equals("RedstoneBlock")) return null;
                n = ((int)-1536937376L ^ 0xA4643265) << 1;
                return null;
            }
            case -1904124519: {
                if (!string.equals("Piston")) return null;
                n = (int)-1612103436L ^ 0x9FE940FF;
                return null;
            }
            case 416515707: {
                if (!string.equals("Obsidian")) return null;
                n = ((int)-1899077375L ^ 0x8ECE6102) << 2;
                return null;
            }
            case -966294215: {
                if (!string.equals("EnderChest")) return null;
                n = (int)1736219119L ^ 0x677C99E2;
                return null;
            }
            case 70141: {
                if (!string.equals("Exp")) return null;
                n = ((int)-285926933L ^ 0xEEF519EC) << 1;
                return null;
            }
        }
        return null;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1295585316 ^ (long)1295585316);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1575635857L ^ 0xA215B490);
            int n2 = ((int)-452348682L ^ 0xE509B497) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-821083817L ^ 0xCF0F4F38) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

