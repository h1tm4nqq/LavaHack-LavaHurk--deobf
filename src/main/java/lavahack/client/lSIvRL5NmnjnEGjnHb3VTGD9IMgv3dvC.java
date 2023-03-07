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
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$1;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.mHbkRHZKusDv305PoVrIANUx3CcrHj9E;
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

public class lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC {
    private static final Minecraft Field7862 = Minecraft.getMinecraft();
    private int Field7863;

    public static void Method100(int n, ItemStack itemStack) {
        if (n == ((int)-883211094L ^ 0x34A4BB54)) {
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.setItemStack(itemStack);
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventoryContainer.putStackInSlot(n, itemStack);
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method101(n);
        if (n2 == (int)((long)-1970891269 ^ (long)1970891268)) return;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.setInventorySlotContents(n2, itemStack);
    }

    public static int Method101(int n) {
        if (n < (int)((long)426747792 ^ (long)426747797)) return (int)((long)-1849774042 ^ (long)1849774041);
        if (n > ((int)-825024089L ^ 0xCED3218A)) {
            return (int)((long)-1849774042 ^ (long)1849774041);
        }
        if (n <= ((int)72698516L ^ 0x4554A9D)) {
            return (((int)-510936002L ^ 0xE18BBC35) << 2) - n;
        }
        if (n < ((int)474551105L ^ 0x1C491348) << 2) {
            return n;
        }
        if (n >= (int)((long)-351149607 ^ (long)-351149580)) return ((int)239246317L ^ 0xE429BE8) << 3;
        return n - ((int)((long)2045279377 ^ (long)2045279384) << 2);
    }

    public static int Method102() {
        int n = (int)264626906L ^ 0xFC5E2DA;
        while (true) {
            int cfr_ignored_0 = (int)((long)-363132588 ^ (long)-363132579);
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n);
            Item item = itemStack.getItem();
            if (item instanceof ItemBlock) {
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
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n3);
            Item item = itemStack.getItem();
            if (item instanceof ItemBlock) {
                Block block = Block.getBlockFromItem((Item)item);
                mHbkRHZKusDv305PoVrIANUx3CcrHj9E[] mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray = mHbkRHZKusDv305PoVrIANUx3CcrHj9E.values();
                int n4 = mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray.length;
                for (int i = (int)((long)-485072137 ^ (long)-485072137); i < n4; ++i) {
                    mHbkRHZKusDv305PoVrIANUx3CcrHj9E mHbkRHZKusDv305PoVrIANUx3CcrHj9E2 = mHbkRHZKusDv305PoVrIANUx3CcrHj9EArray[i];
                    if (!mHbkRHZKusDv305PoVrIANUx3CcrHj9E2.Method2463().isEmpty()) {
                        for (Item item2 : mHbkRHZKusDv305PoVrIANUx3CcrHj9E2.Method2463()) {
                            if (!item.equals(item2)) continue;
                            return n3;
                        }
                    }
                    if (mHbkRHZKusDv305PoVrIANUx3CcrHj9E2.Method2464().isEmpty()) continue;
                    for (Item item2 : mHbkRHZKusDv305PoVrIANUx3CcrHj9E2.Method2464()) {
                        if (!block.equals(item2)) continue;
                        return n3;
                    }
                }
            }
            ++n3;
        }
        return (int)1542114739L ^ 0xA415324C;
    }

    public static int Method104(Item item) {
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player == null) return (int)((long)2029673493 ^ (long)-2029673494);
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventoryContainer.getInventory().size() - ((int)415732713L ^ 0x18C793E8);
        while (n > 0) {
            ItemStack itemStack;
            if (n != (int)((long)1598458137 ^ (long)1598458140) && n != ((int)-1595746399L ^ 0xA0E2D7A2) << 1 && n != (int)((long)1756109936 ^ (long)1756109943) && n != (int)((long)1735810506 ^ (long)1735810507) << 3 && !(itemStack = (ItemStack)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventoryContainer.getInventory().get(n)).isEmpty() && itemStack.getItem() == item) {
                return n;
            }
            --n;
        }
        return (int)((long)2029673493 ^ (long)-2029673494);
    }

    public long Method105(BlockPos blockPos) {
        return this.Method106(blockPos, EnumHand.MAIN_HAND);
    }

    public long Method106(BlockPos blockPos, EnumHand enumHand) {
        return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method107(blockPos, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.getHeldItem(enumHand));
    }

    public static long Method107(BlockPos blockPos, ItemStack itemStack) {
        float f;
        IBlockState iBlockState = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        float f2 = itemStack.getDestroySpeed(iBlockState);
        f2 = (float)((double)f2 + (Math.pow(EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.EFFICIENCY, (ItemStack)itemStack), Double.longBitsToDouble((long)1003484839 ^ 0x400000003BCFF6A7L)) + 1.0));
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.isPotionActive(MobEffects.HASTE)) {
            f2 *= 1.0f + (float)(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.getActivePotionEffect(MobEffects.HASTE).getAmplifier() + ((int)1517471391L ^ 0x5A72C69E)) * Float.intBitsToFloat((int)1259063894L ^ 0x7547069B);
        }
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.isPotionActive(MobEffects.MINING_FATIGUE)) {
            switch (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) {
                case 0: {
                    f = Float.intBitsToFloat((int)((long)24652558 ^ (long)1071755924));
                    break;
                }
                case 1: {
                    f = Float.intBitsToFloat((int)((long)1558397208 ^ (long)1633358068));
                    break;
                }
                case 2: {
                    f = Float.intBitsToFloat((int)((long)1625574684 ^ (long)1540669280));
                    break;
                }
                default: {
                    f = Float.intBitsToFloat((int)((long)118061064 ^ (long)1029516838));
                }
            }
            f2 *= f;
        }
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.isInsideOfMaterial(Material.WATER) && !EnchantmentHelper.getAquaAffinityModifier((EntityLivingBase)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player)) {
            f2 /= Float.intBitsToFloat(0x38121BB ^ 0x432121BB);
        }
        f = f2 / iBlockState.getBlockHardness((World)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.world, blockPos);
        f = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method108(block, blockPos, itemStack) || block == Blocks.ENDER_CHEST ? (f /= Float.intBitsToFloat((int)((long)670214410 ^ (long)1711450378))) : (f /= Float.intBitsToFloat((int)1963451656L ^ 0x37CFE508));
        float f3 = (float)(Math.floor(1.0f / f) + 1.0);
        return (long)(f3 / Float.intBitsToFloat(0x64F1077B ^ 0x2551077B) * Float.intBitsToFloat((int)1104682768L ^ 0x5A21F10));
    }

    public static boolean Method108(Block block, BlockPos blockPos, ItemStack itemStack) {
        int n;
        IBlockState iBlockState = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.world.getBlockState(blockPos);
        if ((iBlockState = iBlockState.getBlock().getActualState(iBlockState, (IBlockAccess)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.world, blockPos)).getMaterial().isToolNotRequired()) {
            return ((int)-193401344L ^ 0xF478EE01) != 0;
        }
        String string = block.getHarvestTool(iBlockState);
        if (itemStack.isEmpty()) return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.canHarvestBlock(iBlockState);
        if (string == null) {
            return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.canHarvestBlock(iBlockState);
        }
        int n2 = itemStack.getItem().getHarvestLevel(itemStack, string, (EntityPlayer)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player, iBlockState);
        if (n2 < 0) {
            return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.canHarvestBlock(iBlockState);
        }
        if (n2 >= block.getHarvestLevel(iBlockState)) {
            n = (int)((long)-2095070638 ^ (long)-2095070637);
            return n != 0;
        }
        n = (int)((long)1801773350 ^ (long)1801773350);
        return n != 0;
    }

    public static int Method109(BlockPos blockPos) {
        IBlockState iBlockState = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.world.getBlockState(blockPos);
        int n = (int)1298808657L ^ 0x4D6A3F51;
        double d = 0.0;
        int n2 = (int)((long)1281306180 ^ (long)1281306180);
        while (true) {
            int n3;
            float f;
            int cfr_ignored_0 = (int)((long)496420829 ^ (long)496420820);
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n2);
            if (!itemStack.isEmpty() && itemStack.getItem() != Items.AIR && (f = itemStack.getDestroySpeed(iBlockState)) > 0.0f && (double)(f = (float)((double)f + ((n3 = EnchantmentHelper.getEnchantmentLevel((Enchantment)Enchantments.EFFICIENCY, (ItemStack)itemStack)) > 0 ? Math.pow(n3, Double.longBitsToDouble(0x206559FC2F7C0A03L ^ 0x606559FC2F7C0A03L)) + 1.0 : 0.0))) > d) {
                d = f;
                n = n2;
            }
            ++n2;
        }
    }

    public static void Method110(int n, boolean bl) {
        if (n == (int)((long)-517691116 ^ (long)517691115)) {
            return;
        }
        if (!bl) {
            lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            return;
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem = n;
    }

    public static void Method111(int n) {
        if (n == ((int)1977019210L ^ 0x8A2914B5)) {
            return;
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem = n;
    }

    public static int Method112(int n, int n2, boolean bl) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n3);
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
        return (int)-557509204L ^ 0x213AEA53;
    }

    public static boolean Method113(EntityPlayer entityPlayer, int n) {
        int n2 = (int)((long)1957123157 ^ (long)1957123157);
        while (true) {
            int cfr_ignored_0 = ((int)568015638L ^ 0x21DB3B17) << 2;
            if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method114((ItemStack)entityPlayer.inventory.armorInventory.get(n2)) < (float)n) {
                return ((int)-1873040179L ^ 0x905BACCC) != 0;
            }
            ++n2;
        }
    }

    public static float Method114(ItemStack itemStack) {
        float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
        float f2 = 1.0f - f;
        return ((int)((long)1425834221 ^ (long)1425834228) << 2) - (int)(f2 * Float.intBitsToFloat((int)((long)2035672712 ^ (long)1000203912)));
    }

    public static float Method115(ItemStack itemStack) {
        return 1.0f - ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
    }

    public static int Method116(Item item, int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() == item) return n3;
            ++n3;
        }
        return (int)((long)1334423307 ^ (long)-1334423308);
    }

    public static int Method117(int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() == Items.CHAINMAIL_CHESTPLATE && itemStack.getItem() == Items.DIAMOND_CHESTPLATE && itemStack.getItem() == Items.IRON_CHESTPLATE && itemStack.getItem() == Items.GOLDEN_CHESTPLATE && itemStack.getItem() == Items.LEATHER_CHESTPLATE) {
                return n3;
            }
            ++n3;
        }
        return (int)697086417L ^ 0xD6734E2E;
    }

    public static int Method118() {
        return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method119((int)884327997L ^ 0x34B5C63D, (int)-710260840L ^ 0xD5AA4791);
    }

    public static int Method119(int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() instanceof ItemSword) return n3;
            if (itemStack.getItem() instanceof ItemPickaxe) {
                return n3;
            }
            ++n3;
        }
        return (int)((long)-166153819 ^ (long)166153818);
    }

    public static int Method120(Block block, int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n3);
            if (itemStack.getItem() instanceof ItemBlock) {
                ItemBlock itemBlock = (ItemBlock)itemStack.getItem();
                if (itemBlock.getBlock() == block) return n3;
            }
            ++n3;
        }
        return (int)((long)1033527076 ^ (long)-1033527077);
    }

    public static void Method121(int n, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player == null) {
            return;
        }
        if (n != ((int)-725563382L ^ 0x2B3F37F5) && lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem != n) {
            switch (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$1.Field17041[lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.ordinal()]) {
                case 1: {
                    lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem = n;
                    lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                    break;
                }
                case 2: {
                    lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                    break;
                }
            }
        }
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.playerController.updateController();
    }

    public static void Method122(Item item, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method129(item, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9864, ((int)2060389278L ^ 0x7ACF0B9F) != 0) == ((int)-1559941556L ^ 0x5CFAD1B3)) return;
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem == lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method129(item, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9864, (boolean)((long)1445416295 ^ (long)1445416294))) return;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method121(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method129(item, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9864, ((int)-428126849L ^ 0xE67B4D7E) != 0), lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf);
    }

    public static void Method123(int n) {
        if (n == (int)((long)-481133601 ^ (long)481133600)) return;
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem == n) return;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
    }

    public static void Method124(Block block) {
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(block) == ((int)-340261793L ^ 0x1447FBA0)) return;
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem == lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(block)) return;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(block)));
    }

    public static void Method125(Item item) {
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method126(item) == (int)((long)1903700825 ^ (long)-1903700826)) return;
        if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.currentItem == lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method126(item)) return;
        lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method123(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method126(item));
    }

    public static int Method126(Item item) {
        int n = (int)-1302456319L ^ 0xB25E1801;
        while (true) {
            int cfr_ignored_0 = (int)-1160045370L ^ 0xBADB1CCF;
            if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n).getItem() == item) {
                return n;
            }
            ++n;
        }
    }

    public static int Method127(Block block) {
        int n = (int)-1064727343L ^ 0xC0898CD1;
        while (true) {
            int cfr_ignored_0 = (int)((long)-1310585153 ^ (long)-1310585162);
            Item item = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n).getItem();
            if (item instanceof ItemBlock && ((ItemBlock)item).getBlock().equals(block)) {
                return n;
            }
            ++n;
        }
    }

    public static int Method128(boolean bl) {
        int n = (int)((long)302211011 ^ (long)302211011);
        while (true) {
            int cfr_ignored_0 = (int)2139471856L ^ 0x7F85BFF9;
            if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n).getItem() instanceof ItemBlock) {
                return n;
            }
            ++n;
        }
    }

    public static int Method129(Item item, lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, boolean bl) {
        switch (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$1.Field17042[lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.ordinal()]) {
            case 1: {
                int n = (int)-298420833L ^ 0xEE36759F;
                while (true) {
                    int cfr_ignored_0 = (int)((long)2060668660 ^ (long)2060668669);
                    if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n).getItem() == item) {
                        return n;
                    }
                    ++n;
                }
            }
            case 2: {
                int n = bl ? (int)-198346593L ^ 0xF42D7896 : (int)((long)1740653147 ^ (long)1740653147);
                while (true) {
                    int cfr_ignored_1 = (int)2040287883L ^ 0x799C52A6;
                    if (lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.getStackInSlot(n).getItem() == item) {
                        return n;
                    }
                    ++n;
                }
            }
        }
        return (int)((long)-806353882 ^ (long)806353881);
    }

    public static int Method130(Class clazz) {
        int n = (int)1033836333L ^ 0xC260E8D2;
        NonNullList nonNullList = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.mainInventory;
        int n2 = (int)((long)-392593993 ^ (long)-392593993);
        while (true) {
            int cfr_ignored_0 = (int)((long)-295199182 ^ (long)-295199173);
            ItemStack itemStack = (ItemStack)nonNullList.get(n2);
            if (itemStack != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem()) && clazz.isInstance(itemStack.getItem())) {
                n = n2;
            }
            ++n2;
        }
    }

    public static int Method131() {
        return lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method130(ItemPickaxe.class);
    }

    public static int Method132(Class clazz, int n, int n2) {
        int n3 = n;
        while (n3 <= n2) {
            ItemStack itemStack = (ItemStack)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.mainInventory.get(n3);
            if (itemStack != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem()) && clazz.isInstance(itemStack.getItem())) {
                return n3;
            }
            ++n3;
        }
        return (int)1816251606L ^ 0x93BE3329;
    }

    public static int Method133(Class clazz, int n, int n2) {
        int n3 = (int)-56447372L ^ 0x35D518B;
        NonNullList nonNullList = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.mainInventory;
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
        NonNullList nonNullList = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.mainInventory;
        int n = (int)1095366014L ^ 0x4149F57E;
        while (true) {
            int cfr_ignored_0 = ((int)-555226638L ^ 0xDEE7E9FB) << 2;
            ItemStack itemStack = (ItemStack)nonNullList.get(n);
            if (itemStack != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem())) {
                arrayList.add(n);
            }
            ++n;
        }
    }

    public static List Method135(Item item) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        NonNullList nonNullList = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.mainInventory;
        int n = (int)1763356905L ^ 0x691AB0E9;
        while (true) {
            int cfr_ignored_0 = ((int)2122009008L ^ 0x7E7B49B9) << 2;
            if (item == ((ItemStack)nonNullList.get((int)n)).item) {
                arrayList.add(n);
            }
            ++n;
        }
    }

    public static List Method136(Class clazz) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        NonNullList nonNullList = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Field7862.player.inventory.mainInventory;
        int n = (int)1562449096L ^ 0x5D2114C8;
        while (true) {
            int cfr_ignored_0 = ((int)43648978L ^ 0x29A07DB) << 2;
            ItemStack itemStack = (ItemStack)nonNullList.get(n);
            if (itemStack != ItemStack.EMPTY && itemStack.getItem() instanceof ItemBlock && clazz.isInstance(((ItemBlock)itemStack.getItem()).getBlock())) {
                arrayList.add(n);
            }
            ++n;
        }
    }

    public static boolean Method137(EntityPlayer entityPlayer, float f) {
        int n = (int)1313262825L ^ 0x4E46CCEA;
        ItemStack itemStack;
        while (!(lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method114(itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(n)) < f)) {
            --n;
        }
        return ((int)575568900L ^ 0x224E7C05) != 0;
    }

    public static int Method138(ItemStack itemStack) {
        return (int)lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method114(itemStack);
    }
}

