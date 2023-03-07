//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.renderer.InventoryEffectRenderer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.NonNullList
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import java.util.List;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class qwY3nskjE0b7bIfvvezGCqlmdbVKekbR
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14343 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)625582293 ^ 0x405900002549A0D5L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field14344 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Thorns", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1005698246 ^ (long)-1005698245)));
    public static qwY3nskjE0b7bIfvvezGCqlmdbVKekbR Field14345;
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field14346 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private String Field14347 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public qwY3nskjE0b7bIfvvezGCqlmdbVKekbR() {
        super("AutoArmor", "ebate srate lox!", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
        Field14345 = this;
    }

    @Override
    public void Method38() {
        this.Field14346.Method2801();
    }

    @Override
    public void Method45() {
        if (qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        super.Method43("[" + this.Field14343.Method335() + "]");
        if (!this.Field14346.Method2797(this.Field14343.Method369())) {
            return;
        }
        this.Field14346.Method2801();
        if (qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % ((int)((long)1908403372 ^ (long)1908403373) << 1) == 0) {
            return;
        }
        if (qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiContainer && !(qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof InventoryEffectRenderer)) {
            return;
        }
        NonNullList nonNullList = qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorInventory;
        NonNullList nonNullList2 = qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.mainInventory;
        int[] nArray = new int[(int)((long)1036064382 ^ (long)1036064383) << 2];
        nArray[(int)949932664L ^ 0x389ED278] = (int)-159638194L ^ 0x983E2B1;
        nArray[(int)((long)349482738 ^ (long)349482739)] = (int)-1031508429L ^ 0x3D7B91CC;
        nArray[((int)-1342092498L ^ 0xB0014B2F) << 1] = (int)((long)1275314208 ^ (long)-1275314209);
        nArray[(int)((long)263633443 ^ (long)263633440)] = (int)1962200317L ^ 0x8B0B3302;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[((int)-1948288129L ^ 0x8BDF7B7E) << 2];
        nArray3[(int)-684099206L ^ 0xD739797A] = (int)282590752L ^ 0xEF2801DF;
        nArray3[(int)-556259442L ^ 0xDED8278F] = (int)((long)-1743434576 ^ (long)1743434575);
        nArray3[((int)-747395625L ^ 0xD373A5D6) << 1] = (int)((long)1397151277 ^ (long)-1397151278);
        nArray3[(int)-1761744288L ^ 0x96FDEA63] = (int)439614682L ^ 0xE5CC0325;
        int[] nArray4 = nArray3;
        int n = (int)-2065986738L ^ 0x84DB8B4E;
        while (true) {
            int cfr_ignored_0 = (int)((long)-1063586187 ^ (long)-1063586188) << 2;
            ItemStack itemStack = (ItemStack)nonNullList.get(n);
            if (itemStack.getItem() instanceof ItemArmor) {
                nArray4[n] = ((ItemArmor)itemStack.getItem()).damageReduceAmount;
            }
            ++n;
        }
    }

    private static void Method5532(List list, int[] nArray, int[] nArray2, Integer n, ItemStack itemStack) {
        ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
        int n2 = itemArmor.armorType.ordinal() - (((int)-1542219158L ^ 0xA4139A6B) << 1);
        if (list.get(n2) != ItemStack.EMPTY) return;
        if (nArray[n2] != ((int)937629292L ^ 0xC81CE993)) {
            return;
        }
        if (n2 == ((int)-257397855L ^ 0xF0A86BA0) << 1 && qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorItemInSlot(n2).getItem().equals(Items.ELYTRA)) {
            return;
        }
        int n3 = itemArmor.damageReduceAmount;
        if (n3 <= nArray2[n2]) return;
        nArray[n2] = n;
        nArray2[n2] = n3;
    }

    private static void Method5533(int[] nArray, int[] nArray2, Integer n, ItemStack itemStack) {
        ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
        int n2 = itemArmor.armorType.ordinal() - (((int)880947564L ^ 0x3482316D) << 1);
        if (n2 == ((int)-1386029610L ^ 0xAD62DDD7) << 1 && qwY3nskjE0b7bIfvvezGCqlmdbVKekbR.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorItemInSlot(n2).getItem().equals(Items.ELYTRA)) {
            return;
        }
        int n3 = itemArmor.damageReduceAmount;
        if (n3 <= nArray[n2]) return;
        nArray2[n2] = n;
        nArray[n2] = n3;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1337453631L ^ 0xB04813C1;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)915203417 ^ (long)915203494);
            int n2 = (int)((long)-1892431068 ^ (long)-1892431071) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-547134766L ^ 0xDF6350E1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

