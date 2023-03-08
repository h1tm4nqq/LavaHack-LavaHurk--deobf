//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.enchantment.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;

final class Class1065
{
    private final BlockPos Field12694;
    private int Field12695;
    private float Field12696;
    private String Field12697 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1065(final BlockPos field12694) {
        this.Field12694 = field12694;
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
        final IBlockState getBlockState = Class1210.Method4877().world.getBlockState(this.Field12694);
        double n = 0.0;
        int n2 = 0;
        while (true) {
            final ItemStack getStackInSlot = Class1210.Method4878().player.inventory.getStackInSlot(n2);
            if (!getStackInSlot.isEmpty()) {
                if (getStackInSlot.getItem() != Items.AIR) {
                    final float getDestroySpeed = getStackInSlot.getDestroySpeed(getBlockState);
                    if (getDestroySpeed > 1.0f) {
                        final int getEnchantmentLevel;
                        final float n3 = (float)(getDestroySpeed + (((getEnchantmentLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.EFFICIENCY, getStackInSlot)) > 0) ? (Math.pow(getEnchantmentLevel, Double.longBitsToDouble((long)636861528 ^ 0x4000000025F5BC58L)) + 1.0) : 0.0));
                        if (n3 > n) {
                            n = n3;
                        }
                    }
                }
            }
            ++n2;
        }
    }
}
