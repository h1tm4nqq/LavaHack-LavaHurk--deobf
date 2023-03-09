//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockFalling
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Enchantments
 *  net.minecraft.init.Items
 *  net.minecraft.init.MobEffects
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemAxe
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import lavahack.client.Class1964;
import lavahack.client.Class448;
import lavahack.client.Class555;
import lavahack.client.Class893;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Class9 {
    private static final Minecraft Field7862 = Minecraft.getMinecraft();
    private int Field7863;

    public static void Method100(int n, ItemStack itemStack) {
        if (n == -2) {
            Class9.Field7862.player.inventory.setItemStack(itemStack);
        }
        Class9.Field7862.player.inventoryContainer.putStackInSlot(n, itemStack);
        int n2 = Class9.Method101(n);
        if (n2 == -1) return;
        Class9.Field7862.player.inventory.setInventorySlotContents(n2, itemStack);
    }

    public static int Method101(int n) {
        if (n < 5) return -1;
        if (n > 45) {
            return -1;
        }
        if (n <= 9) {
            return 44 - n;
        }
        if (n < 36) {
            return n;
        }
        if (n >= 45) return 40;
        return n - 36;
    }

    public static int Method102() {
        int n = 0;
        while (true) {
            ItemStack itemStack;
            Item item;
            if ((item = (itemStack = Class9.Field7862.player.inventory.getStackInSlot(n)).getItem()) instanceof ItemBlock) {
                Block block = Block.getBlockFromItem((Item)itemStack.getItem());
                if (Block.getBlockFromItem((Item)itemStack.getItem()).getDefaultState().isFullBlock()) {
                    if (!(block instanceof BlockFalling)) return n;
                }
            }
            ++n;
        }
    }

    public static int Method103(int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = Class9.Field7862.player.inventory.getStackInSlot(n3);
            Item item = itemStack.getItem();
            if (item instanceof ItemBlock) {
                Block block = Block.getBlockFromItem((Item)item);
                for (Class555 class555 : Class555.values()) {
                    if (!class555.Method2463().isEmpty()) {
                        for (Item item2 : class555.Method2463()) {
                            if (!item.equals(item2)) continue;
                            return n3;
                        }
                    }
                    if (class555.Method2464().isEmpty()) continue;
                    for (Item item2 : class555.Method2464()) {
                        if (!block.equals(item2)) continue;
                        return n3;
                    }
                }
            }
            ++n3;
        }
        return -1;
    }

    public static int Method104(Item item) {
        if (Class9.Field7862.player == null) return -1;
        int n = Class9.Field7862.player.inventoryContainer.getInventory().size() - 1;
        while (n > 0) {
            ItemStack itemStack;
            if (n != 5 && n != 6 && n != 7 && n != 8 && !(itemStack = (ItemStack)Class9.Field7862.player.inventoryContainer.getInventory().get(n)).isEmpty() && itemStack.getItem() == item) {
                return n;
            }
            --n;
        }
        return -1;
    }

    public long Method105(BlockPos blockPos) {
        return this.Method106(blockPos, EnumHand.MAIN_HAND);
    }

    public long Method106(BlockPos blockPos, EnumHand enumHand) {
        return Class9.Method107(blockPos, Class9.Field7862.player.getHeldItem(enumHand));
    }

    public static long Method107(BlockPos blockPos, ItemStack itemStack) {
        float f;
        IBlockState iBlockState = Class9.Field7862.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        float f2 = itemStack.getDestroySpeed(iBlockState);
        f2 = (float)((double)f2 + (Math.pow(EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.EFFICIENCY, (ItemStack)itemStack), Double.longBitsToDouble((long)1003484839 ^ 0x400000003BCFF6A7L)) + 1.0));
        if (Class9.Field7862.player.isPotionActive(MobEffects.HASTE)) {
            f2 *= 1.0f + (float)(Class9.Field7862.player.getActivePotionEffect(MobEffects.HASTE).getAmplifier() + 1) * Float.intBitsToFloat(1045220557);
        }
        if (Class9.Field7862.player.isPotionActive(MobEffects.MINING_FATIGUE)) {
            switch (Class9.Field7862.player.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) {
                case 0: {
                    f = Float.intBitsToFloat(1050253722);
                    break;
                }
                case 1: {
                    f = Float.intBitsToFloat(1035489772);
                    break;
                }
                case 2: {
                    f = Float.intBitsToFloat(993063548);
                    break;
                }
                default: {
                    f = Float.intBitsToFloat(978605614);
                }
            }
            f2 *= f;
        }
        if (Class9.Field7862.player.isInsideOfMaterial(Material.WATER) && !EnchantmentHelper.getAquaAffinityModifier((EntityLivingBase)Class9.Field7862.player)) {
            f2 /= Float.intBitsToFloat(0x40A00000);
        }
        f = f2 / iBlockState.getBlockHardness((World)Class9.Field7862.world, blockPos);
        f = Class9.Method108(block, blockPos, itemStack) || block == Blocks.ENDER_CHEST ? (f /= Float.intBitsToFloat(1106247680)) : (f /= Float.intBitsToFloat(1120403456));
        float f3 = (float)(Math.floor(1.0f / f) + 1.0);
        return (long)(f3 / Float.intBitsToFloat(1101004800) * Float.intBitsToFloat(1148846080));
    }

    public static boolean Method108(Block block, BlockPos blockPos, ItemStack itemStack) {
        IBlockState iBlockState = Class9.Field7862.world.getBlockState(blockPos);
        if ((iBlockState = iBlockState.getBlock().getActualState(iBlockState, (IBlockAccess)Class9.Field7862.world, blockPos)).getMaterial().isToolNotRequired()) {
            return true;
        }
        String string = block.getHarvestTool(iBlockState);
        if (itemStack.isEmpty()) return Class9.Field7862.player.canHarvestBlock(iBlockState);
        if (string == null) {
            return Class9.Field7862.player.canHarvestBlock(iBlockState);
        }
        int n = itemStack.getItem().getHarvestLevel(itemStack, string, (EntityPlayer)Class9.Field7862.player, iBlockState);
        if (n < 0) {
            return Class9.Field7862.player.canHarvestBlock(iBlockState);
        }
        if (n < block.getHarvestLevel(iBlockState)) return false;
        return true;
    }

    public static int Method109(BlockPos blockPos) {
        IBlockState iBlockState = Class9.Field7862.world.getBlockState(blockPos);
        int n = 0;
        double d = 0.0;
        int n2 = 0;
        while (true) {
            int n3;
            float f;
            ItemStack itemStack;
            if (!(itemStack = Class9.Field7862.player.inventory.getStackInSlot(n2)).isEmpty() && itemStack.getItem() != Items.AIR && (f = itemStack.getDestroySpeed(iBlockState)) > 0.0f && (double)(f = (float)((double)f + ((n3 = EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.EFFICIENCY, (ItemStack)itemStack)) > 0 ? Math.pow(n3, Double.longBitsToDouble(0x4000000000000000L)) + 1.0 : 0.0))) > d) {
                d = f;
                n = n2;
            }
            ++n2;
        }
    }

    public static void Method110(int n, boolean bl) {
        if (n == -1) {
            return;
        }
        if (!bl) {
            Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            return;
        }
        Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        Class9.Field7862.player.inventory.currentItem = n;
    }

    public static void Method111(int n) {
        if (n == -1) {
            return;
        }
        Class9.Field7862.player.inventory.currentItem = n;
    }

    public static int Method112(int n, int n2, boolean bl) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = Class9.Field7862.player.inventory.getStackInSlot(n3);
            if (bl) {
                if (itemStack.getItem() instanceof ItemAxe) {
                    return n3;
                }
                if (itemStack.getItem() instanceof ItemSword) return n3;
                if (itemStack.getItem() instanceof ItemAxe) {
                    return n3;
                }
            }
            ++n3;
        }
        return -1;
    }

    public static boolean Method113(EntityPlayer entityPlayer, int n) {
        int n2 = 0;
        while (!(Class9.Method114((ItemStack)entityPlayer.inventory.armorInventory.get(n2)) < (float)n)) {
            ++n2;
        }
        return true;
    }

    public static float Method114(ItemStack itemStack) {
        float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
        float f2 = 1.0f - f;
        return 100 - (int)(f2 * Float.intBitsToFloat(1120403456));
    }

    public static float Method115(ItemStack itemStack) {
        return 1.0f - ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
    }

    public static int Method116(Item item, int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = Class9.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() == item) return n3;
            ++n3;
        }
        return -1;
    }

    public static int Method117(int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = Class9.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() == Items.CHAINMAIL_CHESTPLATE && itemStack.getItem() == Items.DIAMOND_CHESTPLATE && itemStack.getItem() == Items.IRON_CHESTPLATE && itemStack.getItem() == Items.GOLDEN_CHESTPLATE && itemStack.getItem() == Items.LEATHER_CHESTPLATE) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int Method118() {
        return Class9.Method119(0, 9);
    }

    public static int Method119(int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = Class9.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() instanceof ItemSword) return n3;
            if (itemStack.getItem() instanceof ItemPickaxe) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int Method120(Block block, int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = Class9.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() instanceof ItemBlock) {
                ItemBlock itemBlock = (ItemBlock)itemStack.getItem();
                if (itemBlock.getBlock() == block) return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static void Method121(int n, Class893 class893) {
        if (Class9.Field7862.player == null) {
            return;
        }
        if (n != -1 && Class9.Field7862.player.inventory.currentItem != n) {
            switch (Class1964.Field17041[class893.ordinal()]) {
                case 1: {
                    Class9.Field7862.player.inventory.currentItem = n;
                    Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                    break;
                }
                case 2: {
                    Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                    break;
                }
            }
        }
        Class9.Field7862.playerController.updateController();
    }

    public static void Method122(Item item, Class893 class893) {
        if (Class9.Method129(item, Class448.Field9864, true) == -1) return;
        if (Class9.Field7862.player.inventory.currentItem == Class9.Method129(item, Class448.Field9864, true)) return;
        Class9.Method121(Class9.Method129(item, Class448.Field9864, true), class893);
    }

    public static void Method123(int n) {
        if (n == -1) return;
        if (Class9.Field7862.player.inventory.currentItem == n) return;
        Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
    }

    public static void Method124(Block block) {
        if (Class9.Method127(block) == -1) return;
        if (Class9.Field7862.player.inventory.currentItem == Class9.Method127(block)) return;
        Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(Class9.Method127(block)));
    }

    public static void Method125(Item item) {
        if (Class9.Method126(item) == -1) return;
        if (Class9.Field7862.player.inventory.currentItem == Class9.Method126(item)) return;
        Class9.Method123(Class9.Method126(item));
    }

    public static int Method126(Item item) {
        int n = 0;
        while (Class9.Field7862.player.inventory.getStackInSlot(n).getItem() != item) {
            ++n;
        }
        return n;
    }

    public static int Method127(Block block) {
        int n = 0;
        Item item;
        while (!((item = Class9.Field7862.player.inventory.getStackInSlot(n).getItem()) instanceof ItemBlock) || !((ItemBlock)item).getBlock().equals(block)) {
            ++n;
        }
        return n;
    }

    public static int Method128(boolean bl) {
        int n = 0;
        while (!(Class9.Field7862.player.inventory.getStackInSlot(n).getItem() instanceof ItemBlock)) {
            ++n;
        }
        return n;
    }

    public static int Method129(Item item, Class448 class448, boolean bl) {
        switch (Class1964.Field17042[class448.ordinal()]) {
            case 1: {
                int n = 0;
                while (true) {
                    if (Class9.Field7862.player.inventory.getStackInSlot(n).getItem() == item) {
                        return n;
                    }
                    ++n;
                }
            }
            case 2: {
                int n = bl ? 9 : 0;
                while (Class9.Field7862.player.inventory.getStackInSlot(n).getItem() != item) {
                    ++n;
                }
                return n;
            }
        }
        return -1;
    }

    public static int Method130(Class clazz) {
        int n = -1;
        NonNullList nonNullList = Class9.Field7862.player.inventory.mainInventory;
        int n2 = 0;
        while (true) {
            ItemStack itemStack;
            if ((itemStack = (ItemStack)nonNullList.get(n2)) != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem()) && clazz.isInstance(itemStack.getItem())) {
                n = n2;
            }
            ++n2;
        }
    }

    public static int Method131() {
        return Class9.Method130(ItemPickaxe.class);
    }

    public static int Method132(Class clazz, int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = (ItemStack)Class9.Field7862.player.inventory.mainInventory.get(n3);
            if (itemStack != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem()) && clazz.isInstance(itemStack.getItem())) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public static int Method133(Class clazz, int n, int n2) {
        int n3 = -1;
        NonNullList nonNullList = Class9.Field7862.player.inventory.mainInventory;
        int n4 = n;
        while (n4 <= n2) {
            ItemStack itemStack = (ItemStack)nonNullList.get(n4);
            if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemBlock && clazz.isInstance(((ItemBlock)itemStack.getItem()).getBlock())) {
                return n4;
            }
            ++n4;
        }
        return n3;
    }

    public static List Method134(Class clazz) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        NonNullList nonNullList = Class9.Field7862.player.inventory.mainInventory;
        int n = 0;
        while (true) {
            ItemStack itemStack;
            if ((itemStack = (ItemStack)nonNullList.get(n)) != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem())) {
                arrayList.add(n);
            }
            ++n;
        }
    }

    public static List Method135(Item item) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        NonNullList nonNullList = Class9.Field7862.player.inventory.mainInventory;
        int n = 0;
        while (true) {
            if (item == ((ItemStack)nonNullList.get((int)n)).item) {
                arrayList.add(n);
            }
            ++n;
        }
    }

    public static List Method136(Class clazz) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        NonNullList nonNullList = Class9.Field7862.player.inventory.mainInventory;
        int n = 0;
        while (true) {
            ItemStack itemStack;
            if ((itemStack = (ItemStack)nonNullList.get(n)) != ItemStack.EMPTY && itemStack.getItem() instanceof ItemBlock && clazz.isInstance(((ItemBlock)itemStack.getItem()).getBlock())) {
                arrayList.add(n);
            }
            ++n;
        }
    }

    public static boolean Method137(EntityPlayer entityPlayer, float f) {
        int n = 3;
        ItemStack itemStack;
        while (!(Class9.Method114(itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(n)) < f)) {
            --n;
        }
        return true;
    }

    public static int Method138(ItemStack itemStack) {
        return (int)Class9.Method114(itemStack);
    }
}

