//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.init.Enchantments
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import lavahack.client.daTcLnajen6n9tJjQwsPj5HYWqk4FobG;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

final class daTcLnajen6n9tJjQwsPj5HYWqk4FobG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private final BlockPos Field12694;
    private int Field12695;
    private float Field12696;
    private String Field12697 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public daTcLnajen6n9tJjQwsPj5HYWqk4FobG$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(BlockPos blockPos) {
        this.Field12694 = blockPos;
        this.Field12696 = 0.0f;
    }

    public BlockPos Method4321() {
        return this.Field12694;
    }

    public float Method4322() {
        return this.Field12696;
    }

    public void Method4323() {
    }

    private void Method4324() {
        IBlockState iBlockState = daTcLnajen6n9tJjQwsPj5HYWqk4FobG.Method4877().world.getBlockState(this.Field12694);
        double d = 0.0;
        int n = (int)((long)1311460543 ^ (long)-1311460544);
        int n2 = (int)((long)1744113972 ^ (long)1744113972);
        while (true) {
            int n3;
            float f;
            int cfr_ignored_0 = (int)-338194499L ^ 0xEBD78FB4;
            ItemStack itemStack = daTcLnajen6n9tJjQwsPj5HYWqk4FobG.Method4878().player.inventory.getStackInSlot(n2);
            if (!itemStack.isEmpty() && itemStack.getItem() != Items.AIR && (f = itemStack.getDestroySpeed(iBlockState)) > 1.0f && (double)(f = (float)((double)f + ((n3 = EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.EFFICIENCY, (ItemStack)itemStack)) > 0 ? Math.pow(n3, Double.longBitsToDouble((long)636861528 ^ 0x4000000025F5BC58L)) + 1.0 : 0.0))) > d) {
                d = f;
                n = n2;
            }
            ++n2;
        }
    }
}

