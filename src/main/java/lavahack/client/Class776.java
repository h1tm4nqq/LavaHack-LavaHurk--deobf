//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import net.minecraft.block.state.*;
import net.minecraft.init.*;
import net.minecraft.enchantment.*;

public class Class776
{
    private static final Minecraft Field11282;
    private final BlockPos Field11283;
    private long Field11284;
    private ItemStack Field11285;
    private int Field11286;
    private int Field11287;
    
    public Class776(final BlockPos field11283) {
        this.Field11284 = -1L;
        this.Field11283 = field11283;
    }
    
    public BlockPos Method3229() {
        return this.Field11283;
    }
    
    public long Method3230() {
        return this.Field11284;
    }
    
    public void Method3231() {
        if (this.Field11284 < 0L) {
            this.Field11284 = System.currentTimeMillis();
        }
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
        return Class447.Method2118(1.0 - (System.currentTimeMillis() - this.Field11284) / (double)Class9.Method107(this.Field11283, this.Field11285), 0.0, 1.0);
    }
    
    public IBlockState Method3236() {
        return Class776.Field11282.world.getBlockState(this.Field11283);
    }
    
    public void Method3237() {
        final IBlockState getBlockState = Class776.Field11282.world.getBlockState(this.Field11283);
        Class776.Field11282.player.inventory.getStackInSlot(Class776.Field11282.player.inventory.currentItem);
        double n = 0.0;
        int n2 = 0;
        while (true) {
            final ItemStack getStackInSlot = Class776.Field11282.player.inventory.getStackInSlot(n2);
            if (!getStackInSlot.isEmpty()) {
                if (getStackInSlot.getItem() != Items.AIR) {
                    final float getDestroySpeed = getStackInSlot.getDestroySpeed(getBlockState);
                    if (getDestroySpeed > 1.0f) {
                        final int getEnchantmentLevel;
                        final float n3 = (float)(getDestroySpeed + (((getEnchantmentLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.EFFICIENCY, getStackInSlot)) > 0) ? (Math.pow(getEnchantmentLevel, Double.longBitsToDouble(4611686018427387904L)) + 1.0) : 0.0));
                        if (n3 > n) {
                            n = n3;
                        }
                    }
                }
            }
            ++n2;
        }
    }
    
    static {
        Field11282 = Minecraft.getMinecraft();
    }
}
