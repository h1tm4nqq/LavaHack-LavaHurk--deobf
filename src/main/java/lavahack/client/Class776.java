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

import lavahack.client.Class447;
import lavahack.client.Class9;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class Class776 {
    private static final Minecraft Field11282 = Minecraft.getMinecraft();
    private final BlockPos Field11283;
    private long Field11284 = -1L;
    private ItemStack Field11285;
    private int Field11286;
    private int Field11287;

    public Class776(BlockPos blockPos) {
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
        return Class447.Method2118(1.0 - (double)(System.currentTimeMillis() - this.Field11284) / (double)Class9.Method107(this.Field11283, this.Field11285), 0.0, 1.0);
    }

    public IBlockState Method3236() {
        return Class776.Field11282.world.getBlockState(this.Field11283);
    }

    public void Method3237() {
        IBlockState iBlockState = Class776.Field11282.world.getBlockState(this.Field11283);
        ItemStack itemStack = Class776.Field11282.player.inventory.getStackInSlot(Class776.Field11282.player.inventory.currentItem);
        double d = 0.0;
        int n = -1;
        int n2 = 0;
        while (true) {
            int n3;
            float f;
            ItemStack itemStack2;
            if (!(itemStack2 = Class776.Field11282.player.inventory.getStackInSlot(n2)).isEmpty() && itemStack2.getItem() != Items.AIR && (f = itemStack2.getDestroySpeed(iBlockState)) > 1.0f && (double)(f = (float)((double)f + ((n3 = EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.EFFICIENCY, (ItemStack)itemStack2)) > 0 ? Math.pow(n3, Double.longBitsToDouble(0x4000000000000000L)) + 1.0 : 0.0))) > d) {
                d = f;
                itemStack = itemStack2;
                n = n2;
            }
            ++n2;
        }
    }
}

