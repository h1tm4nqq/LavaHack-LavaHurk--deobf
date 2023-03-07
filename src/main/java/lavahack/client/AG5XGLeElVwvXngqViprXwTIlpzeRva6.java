//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.init.Enchantments
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class AG5XGLeElVwvXngqViprXwTIlpzeRva6 {
    private static final Minecraft Field11282 = Minecraft.getMinecraft();
    private final BlockPos Field11283;
    private long Field11284 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
    private ItemStack Field11285;
    private int Field11286;
    private int Field11287;

    public AG5XGLeElVwvXngqViprXwTIlpzeRva6(BlockPos blockPos) {
        this.Field11283 = blockPos;
    }

    public BlockPos Method3229() {
        return this.Field11283;
    }

    public long Method3230() {
        return this.Field11284;
    }

    public void Method3231() {
        if (this.Field11284 >= 0L) return;
        this.Field11284 = System.currentTimeMillis();
    }

    public void Method3232() {
        this.Field11284 = System.currentTimeMillis();
    }

    public ItemStack Method3233() {
        return this.Field11285;
    }

    public int Method3234() {
        return this.Field11286;
    }

    public double Method3235() {
        return dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2118(1.0 - (double)(System.currentTimeMillis() - this.Field11284) / (double)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method107(this.Field11283, this.Field11285), 0.0, 1.0);
    }

    public IBlockState Method3236() {
        return AG5XGLeElVwvXngqViprXwTIlpzeRva6.Field11282.world.getBlockState(this.Field11283);
    }

    public void Method3237() {
        IBlockState iBlockState = AG5XGLeElVwvXngqViprXwTIlpzeRva6.Field11282.world.getBlockState(this.Field11283);
        ItemStack itemStack = AG5XGLeElVwvXngqViprXwTIlpzeRva6.Field11282.player.inventory.getStackInSlot(AG5XGLeElVwvXngqViprXwTIlpzeRva6.Field11282.player.inventory.currentItem);
        double d = 0.0;
        int n = (int)((long)1941822876 ^ (long)-1941822877);
        int n2 = (int)-782853814L ^ 0xD156994A;
        while (true) {
            int n3;
            float f;
            int cfr_ignored_0 = (int)((long)-1175359104 ^ (long)-1175359095);
            ItemStack itemStack2 = AG5XGLeElVwvXngqViprXwTIlpzeRva6.Field11282.player.inventory.getStackInSlot(n2);
            if (!itemStack2.isEmpty() && itemStack2.getItem() != Items.AIR && (f = itemStack2.getDestroySpeed(iBlockState)) > 1.0f && (double)(f = (float)((double)f + ((n3 = EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.EFFICIENCY, (ItemStack)itemStack2)) > 0 ? Math.pow(n3, Double.longBitsToDouble(0x352A7A32E3362B6BL ^ 0x752A7A32E3362B6BL)) + 1.0 : 0.0))) > d) {
                d = f;
                itemStack = itemStack2;
                n = n2;
            }
            ++n2;
        }
    }
}

