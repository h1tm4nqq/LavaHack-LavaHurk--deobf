//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import com.kisman.cc.util.Class650;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lavahack.client.Class2012;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Class2012
public class Class747
extends Class42 {
    private final Class44 Field11169 = this.Method23(new Class44("Mode", (Class42)this, "Amount", Arrays.asList("Amount", "Percent")));
    private final Class44 Field11170 = this.Method23(new Class44("Amount", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble(4634063279075885056L), true).Method313(this::Method3093));
    private final Class44 Field11171 = this.Method23(new Class44("Percent", (Class42)this, Double.longBitsToDouble(0x4024000000000000L), 0.0, Double.longBitsToDouble((long)1526848694 ^ 0x4058C0005B01DCB6L), true).Method313(this::Method3092));
    private final Class44 Field11172 = this.Method23(new Class44("Delay", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4641240890982006784L), true));
    private final Class44 Field11173 = this.Method23(new Class44("StackThreshold", (Class42)this, "Amount", Arrays.asList("Amount", "Percent")));
    private final Class44 Field11174 = this.Method23(new Class44("Amount", (Class42)this, Double.longBitsToDouble(0x4014000000000000L), 0.0, Double.longBitsToDouble(4634063279075885056L), true).Method313(this::Method3091));
    private final Class44 Field11175 = this.Method23(new Class44("Percent", (Class42)this, Double.longBitsToDouble((long)1657356746 ^ 0x4024000062C941CAL), 0.0, Double.longBitsToDouble(4636666922610458624L), true).Method313(this::Method3090));
    private final Class44 Field11176 = this.Method23(new Class44("Strict", (Class42)this, true));
    private final Class650 Field11177 = new Class650();
    private int Field11178;

    public Class747() {
        super("Replenish", Class97.Field8341);
    }

    @Override
    public void Method38() {
        this.Field11177.Method2801();
    }

    @Override
    public void Method45() {
        if (Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) return;
        if (Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.currentScreen != null) {
            return;
        }
        int n = this.Field11172.Method335();
        if (n > 0 && !this.Field11177.Method2797(n)) {
            return;
        }
        this.Field11177.Method2801();
        int n2 = this.Field11169.Method359().equals("Amount") ? this.Field11170.Method335() : (int)((double)this.Field11171.Method335() * Double.longBitsToDouble(4603939827068310651L));
        int n3 = this.Field11173.Method359().equals("Amount") ? this.Field11174.Method335() : (int)((double)this.Field11175.Method335() * Double.longBitsToDouble((long)1986846199 ^ 0x3FE47AE131C2C98CL));
        Map map = this.Method3088(n2, n3);
        int n4 = 1;
        while (true) {
            if (map.get(n4) != null) {
                this.Method3089(n4, (Integer)map.get(n4));
            }
            ++n4;
        }
    }

    private Map Method3088(int n, int n2) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int n3 = 0;
        while (true) {
            ItemStack itemStack;
            if (!(itemStack = Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n3)).isEmpty() && itemStack.getItem() != Items.AIR) {
                int n4 = n;
                if (this.Field11176.Method365()) {
                    n4 = n >= itemStack.getMaxStackSize() ? itemStack.getMaxStackSize() - 1 : n;
                }
                int n5 = 9;
                while (true) {
                    Item item = ((ItemStack)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventoryContainer.getInventory().get(n5)).getItem();
                    ItemStack itemStack2 = Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.getStackInSlot(n5);
                    if (item == itemStack.getItem() && itemStack.getCount() <= n4 && itemStack2.getCount() >= n2) {
                        hashMap.put(n3, n5);
                        break;
                    }
                    ++n5;
                }
            }
            ++n3;
        }
    }

    private void Method3089(int n, int n2) {
        if (n2 == -1) {
            return;
        }
        Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n2, 0, ClickType.PICKUP, (EntityPlayer)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n < 9 ? n + 36 : n, 0, ClickType.PICKUP, (EntityPlayer)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
        Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.playerController.windowClick(0, n2, 0, ClickType.PICKUP, (EntityPlayer)Class747.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player);
    }

    private Boolean Method3090() {
        return this.Field11173.Method359().equals("Percent");
    }

    private Boolean Method3091() {
        return this.Field11173.Method359().equals("Amount");
    }

    private Boolean Method3092() {
        return this.Field11169.Method359().equals("Percent");
    }

    private Boolean Method3093() {
        return this.Field11169.Method359().equals("Amount");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x5884 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

