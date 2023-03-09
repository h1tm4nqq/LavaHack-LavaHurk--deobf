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

import com.kisman.cc.util.Class650;
import java.util.List;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class97;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class Class1401
extends Class42 {
    private final Class44 Field14343 = this.Method23(new Class44("Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)625582293 ^ 0x405900002549A0D5L), Class467.Field9943));
    private final Class44 Field14344 = this.Method23(new Class44("No Thorns", (Class42)this, true));
    public static Class1401 Field14345;
    private final Class650 Field14346 = new Class650();
    private String Field14347 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1401() {
        super("AutoArmor", "ebate srate lox!", Class97.Field8338);
        Field14345 = this;
    }

    @Override
    public void Method38() {
        this.Field14346.Method2801();
    }

    @Override
    public void Method45() {
        if (Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        super.Method43("[" + this.Field14343.Method335() + "]");
        if (!this.Field14346.Method2797(this.Field14343.Method369())) {
            return;
        }
        this.Field14346.Method2801();
        if (Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % 2 == 0) {
            return;
        }
        if (Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof GuiContainer && !(Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen instanceof InventoryEffectRenderer)) {
            return;
        }
        NonNullList nonNullList = Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorInventory;
        NonNullList nonNullList2 = Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.mainInventory;
        int[] nArray = new int[]{-1, -1, -1, -1};
        int[] nArray2 = new int[]{-1, -1, -1, -1};
        int n = 0;
        while (true) {
            ItemStack itemStack;
            if ((itemStack = (ItemStack)nonNullList.get(n)).getItem() instanceof ItemArmor) {
                nArray2[n] = ((ItemArmor)itemStack.getItem()).damageReduceAmount;
            }
            ++n;
        }
    }

    private static void Method5532(List list, int[] nArray, int[] nArray2, Integer n, ItemStack itemStack) {
        ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
        int n2 = itemArmor.armorType.ordinal() - 2;
        if (list.get(n2) != ItemStack.EMPTY) return;
        if (nArray[n2] != -1) {
            return;
        }
        if (n2 == 2 && Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorItemInSlot(n2).getItem().equals(Items.ELYTRA)) {
            return;
        }
        int n3 = itemArmor.damageReduceAmount;
        if (n3 <= nArray2[n2]) return;
        nArray[n2] = n;
        nArray2[n2] = n3;
    }

    private static void Method5533(int[] nArray, int[] nArray2, Integer n, ItemStack itemStack) {
        ItemArmor itemArmor = (ItemArmor)itemStack.getItem();
        int n2 = itemArmor.armorType.ordinal() - 2;
        if (n2 == 2 && Class1401.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.armorItemInSlot(n2).getItem().equals(Items.ELYTRA)) {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 20;
            cArray2[n] = (char)(cArray[n] ^ (0x3233 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

