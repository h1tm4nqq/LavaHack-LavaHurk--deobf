//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.enchantment.*;
import net.minecraft.block.material.*;
import net.minecraft.entity.*;
import net.minecraft.block.state.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import java.util.*;

public class Class9
{
    private static final Minecraft Field7862;
    private int Field7863;
    
    public static void Method100(final int n, final ItemStack itemStack) {
        if (n == -2) {
            Class9.Field7862.player.inventory.setItemStack(itemStack);
        }
        Class9.Field7862.player.inventoryContainer.putStackInSlot(n, itemStack);
        final int method101 = Method101(n);
        if (method101 != -1) {
            Class9.Field7862.player.inventory.setInventorySlotContents(method101, itemStack);
        }
    }
    
    public static int Method101(final int n) {
        if (n < 5 || n > 45) {
            return -1;
        }
        if (n <= 9) {
            return 44 - n;
        }
        if (n < 36) {
            return n;
        }
        if (n < 45) {
            return n - 36;
        }
        return 40;
    }
    
    public static int Method102() {
        int n = 0;
        while (true) {
            final ItemStack getStackInSlot = Class9.Field7862.player.inventory.getStackInSlot(n);
            if (getStackInSlot.getItem() instanceof ItemBlock) {
                final Block getBlockFromItem = Block.getBlockFromItem(getStackInSlot.getItem());
                if (Block.getBlockFromItem(getStackInSlot.getItem()).getDefaultState().isFullBlock()) {
                    if (!(getBlockFromItem instanceof BlockFalling)) {
                        break;
                    }
                }
            }
            ++n;
        }
        return n;
    }
    
    public static int Method103(final int n, final int n2) {
        for (int i = n; i <= n2; ++i) {
            final Item getItem = Class9.Field7862.player.inventory.getStackInSlot(i).getItem();
            if (getItem instanceof ItemBlock) {
                final Block getBlockFromItem = Block.getBlockFromItem(getItem);
                for (final Class555 class555 : Class555.values()) {
                    if (!class555.Method2463().isEmpty()) {
                        final Iterator iterator = class555.Method2463().iterator();
                        while (iterator.hasNext()) {
                            if (getItem.equals(iterator.next())) {
                                return i;
                            }
                        }
                    }
                    if (!class555.Method2464().isEmpty()) {
                        final Iterator iterator2 = class555.Method2464().iterator();
                        while (iterator2.hasNext()) {
                            if (getBlockFromItem.equals(iterator2.next())) {
                                return i;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public static int Method104(final Item item) {
        if (Class9.Field7862.player != null) {
            for (int i = Class9.Field7862.player.inventoryContainer.getInventory().size() - 1; i > 0; --i) {
                if (i != 5 && i != 6 && i != 7) {
                    if (i != 8) {
                        final ItemStack itemStack = (ItemStack)Class9.Field7862.player.inventoryContainer.getInventory().get(i);
                        if (!itemStack.isEmpty()) {
                            if (itemStack.getItem() == item) {
                                return i;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public long Method105(final BlockPos blockPos) {
        return this.Method106(blockPos, EnumHand.MAIN_HAND);
    }
    
    public long Method106(final BlockPos blockPos, final EnumHand enumHand) {
        return Method107(blockPos, Class9.Field7862.player.getHeldItem(enumHand));
    }
    
    public static long Method107(final BlockPos blockPos, final ItemStack itemStack) {
        final IBlockState getBlockState = Class9.Field7862.world.getBlockState(blockPos);
        final Block getBlock = getBlockState.getBlock();
        float n = (float)(itemStack.getDestroySpeed(getBlockState) + (Math.pow(EnchantmentHelper.getEnchantmentLevel(Enchantments.EFFICIENCY, itemStack), Double.longBitsToDouble((long)1003484839 ^ 0x400000003BCFF6A7L)) + 1.0));
        if (Class9.Field7862.player.isPotionActive(MobEffects.HASTE)) {
            n *= 1.0f + (Class9.Field7862.player.getActivePotionEffect(MobEffects.HASTE).getAmplifier() + 1) * Float.intBitsToFloat(1045220557);
        }
        if (Class9.Field7862.player.isPotionActive(MobEffects.MINING_FATIGUE)) {
            float n2 = 0.0f;
            switch (Class9.Field7862.player.getActivePotionEffect(MobEffects.MINING_FATIGUE).getAmplifier()) {
                case 0: {
                    n2 = Float.intBitsToFloat(1050253722);
                    break;
                }
                case 1: {
                    n2 = Float.intBitsToFloat(1035489772);
                    break;
                }
                case 2: {
                    n2 = Float.intBitsToFloat(993063548);
                    break;
                }
                default: {
                    n2 = Float.intBitsToFloat(978605614);
                    break;
                }
            }
            n *= n2;
        }
        if (Class9.Field7862.player.isInsideOfMaterial(Material.WATER) && !EnchantmentHelper.getAquaAffinityModifier((EntityLivingBase)Class9.Field7862.player)) {
            n /= Float.intBitsToFloat(1084227584);
        }
        final float n3 = n / getBlockState.getBlockHardness((World)Class9.Field7862.world, blockPos);
        float n4;
        if (Method108(getBlock, blockPos, itemStack) || getBlock == Blocks.ENDER_CHEST) {
            n4 = n3 / Float.intBitsToFloat(1106247680);
        }
        else {
            n4 = n3 / Float.intBitsToFloat(1120403456);
        }
        return (long)((float)(Math.floor(1.0f / n4) + 1.0) / Float.intBitsToFloat(1101004800) * Float.intBitsToFloat(1148846080));
    }
    
    public static boolean Method108(final Block block, final BlockPos blockPos, final ItemStack itemStack) {
        final IBlockState getBlockState = Class9.Field7862.world.getBlockState(blockPos);
        final IBlockState getActualState = getBlockState.getBlock().getActualState(getBlockState, (IBlockAccess)Class9.Field7862.world, blockPos);
        if (getActualState.getMaterial().isToolNotRequired()) {
            return true;
        }
        final String harvestTool = block.getHarvestTool(getActualState);
        if (itemStack.isEmpty() || harvestTool == null) {
            return Class9.Field7862.player.canHarvestBlock(getActualState);
        }
        final int harvestLevel = itemStack.getItem().getHarvestLevel(itemStack, harvestTool, (EntityPlayer)Class9.Field7862.player, getActualState);
        if (harvestLevel < 0) {
            return Class9.Field7862.player.canHarvestBlock(getActualState);
        }
        return harvestLevel >= block.getHarvestLevel(getActualState);
    }
    
    public static int Method109(final BlockPos blockPos) {
        final IBlockState getBlockState = Class9.Field7862.world.getBlockState(blockPos);
        double n = 0.0;
        int n2 = 0;
        while (true) {
            final ItemStack getStackInSlot = Class9.Field7862.player.inventory.getStackInSlot(n2);
            if (!getStackInSlot.isEmpty()) {
                if (getStackInSlot.getItem() != Items.AIR) {
                    final float getDestroySpeed = getStackInSlot.getDestroySpeed(getBlockState);
                    if (getDestroySpeed > 0.0f) {
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
    
    public static void Method110(final int currentItem, final boolean b) {
        if (currentItem == -1) {
            return;
        }
        if (!b) {
            Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
        }
        else {
            Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
            Class9.Field7862.player.inventory.currentItem = currentItem;
        }
    }
    
    public static void Method111(final int currentItem) {
        if (currentItem == -1) {
            return;
        }
        Class9.Field7862.player.inventory.currentItem = currentItem;
    }
    
    public static int Method112(final int n, final int n2, final boolean b) {
        for (int i = n; i <= n2; ++i) {
            final ItemStack getStackInSlot = Class9.Field7862.player.inventory.getStackInSlot(i);
            if (b) {
                if (getStackInSlot.getItem() instanceof ItemAxe) {
                    return i;
                }
                if (getStackInSlot.getItem() instanceof ItemSword || getStackInSlot.getItem() instanceof ItemAxe) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static boolean Method113(final EntityPlayer entityPlayer, final int n) {
        for (int n2 = 0; Method114((ItemStack)entityPlayer.inventory.armorInventory.get(n2)) >= n; ++n2) {}
        return true;
    }
    
    public static float Method114(final ItemStack itemStack) {
        return (float)(100 - (int)((1.0f - (itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / itemStack.getMaxDamage()) * Float.intBitsToFloat(1120403456)));
    }
    
    public static float Method115(final ItemStack itemStack) {
        return 1.0f - (itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / itemStack.getMaxDamage();
    }
    
    public static int Method116(final Item item, final int n, final int n2) {
        for (int i = n; i <= n2; ++i) {
            if (Class9.Field7862.player.inventory.getStackInSlot(i).getItem() == item) {
                return i;
            }
        }
        return -1;
    }
    
    public static int Method117(final int n, final int n2) {
        for (int i = n; i <= n2; ++i) {
            final ItemStack getStackInSlot = Class9.Field7862.player.inventory.getStackInSlot(i);
            if (getStackInSlot.getItem() == Items.CHAINMAIL_CHESTPLATE && getStackInSlot.getItem() == Items.DIAMOND_CHESTPLATE && getStackInSlot.getItem() == Items.IRON_CHESTPLATE && getStackInSlot.getItem() == Items.GOLDEN_CHESTPLATE && getStackInSlot.getItem() == Items.LEATHER_CHESTPLATE) {
                return i;
            }
        }
        return -1;
    }
    
    public static int Method118() {
        return Method119(0, 9);
    }
    
    public static int Method119(final int n, final int n2) {
        for (int i = n; i <= n2; ++i) {
            final ItemStack getStackInSlot = Class9.Field7862.player.inventory.getStackInSlot(i);
            if (getStackInSlot.getItem() instanceof ItemSword || getStackInSlot.getItem() instanceof ItemPickaxe) {
                return i;
            }
        }
        return -1;
    }
    
    public static int Method120(final Block block, final int n, final int n2) {
        for (int i = n; i <= n2; ++i) {
            final ItemStack getStackInSlot = Class9.Field7862.player.inventory.getStackInSlot(i);
            if (getStackInSlot.getItem() instanceof ItemBlock) {
                if (((ItemBlock)getStackInSlot.getItem()).getBlock() == block) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static void Method121(final int currentItem, final Class893 class893) {
        if (Class9.Field7862.player == null) {
            return;
        }
        if (currentItem != -1 && Class9.Field7862.player.inventory.currentItem != currentItem) {
            switch (Class1964.Field17041[class893.ordinal()]) {
                case 1: {
                    Class9.Field7862.player.inventory.currentItem = currentItem;
                    Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
                    break;
                }
                case 2: {
                    Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(currentItem));
                    break;
                }
            }
        }
        Class9.Field7862.playerController.updateController();
    }
    
    public static void Method122(final Item item, final Class893 class893) {
        if (Method129(item, Class448.Field9864, true) != -1 && Class9.Field7862.player.inventory.currentItem != Method129(item, Class448.Field9864, true)) {
            Method121(Method129(item, Class448.Field9864, true), class893);
        }
    }
    
    public static void Method123(final int n) {
        if (n != -1 && Class9.Field7862.player.inventory.currentItem != n) {
            Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
        }
    }
    
    public static void Method124(final Block block) {
        if (Method127(block) != -1 && Class9.Field7862.player.inventory.currentItem != Method127(block)) {
            Class9.Field7862.player.connection.sendPacket((Packet)new CPacketHeldItemChange(Method127(block)));
        }
    }
    
    public static void Method125(final Item item) {
        if (Method126(item) != -1 && Class9.Field7862.player.inventory.currentItem != Method126(item)) {
            Method123(Method126(item));
        }
    }
    
    public static int Method126(final Item item) {
        int n;
        for (n = 0; Class9.Field7862.player.inventory.getStackInSlot(n).getItem() != item; ++n) {}
        return n;
    }
    
    public static int Method127(final Block obj) {
        int n = 0;
        while (true) {
            final Item getItem = Class9.Field7862.player.inventory.getStackInSlot(n).getItem();
            if (getItem instanceof ItemBlock && ((ItemBlock)getItem).getBlock().equals(obj)) {
                break;
            }
            ++n;
        }
        return n;
    }
    
    public static int Method128(final boolean b) {
        int n;
        for (n = 0; !(Class9.Field7862.player.inventory.getStackInSlot(n).getItem() instanceof ItemBlock); ++n) {}
        return n;
    }
    
    public static int Method129(final Item item, final Class448 class448, final boolean b) {
        switch (Class1964.Field17042[class448.ordinal()]) {
            case 1: {
                int n;
                for (n = 0; Class9.Field7862.player.inventory.getStackInSlot(n).getItem() != item; ++n) {}
                return n;
            }
            case 2: {
                int n2;
                for (n2 = (b ? 9 : 0); Class9.Field7862.player.inventory.getStackInSlot(n2).getItem() != item; ++n2) {}
                return n2;
            }
            default: {
                return -1;
            }
        }
    }
    
    public static int Method130(final Class clazz) {
        final NonNullList mainInventory = Class9.Field7862.player.inventory.mainInventory;
        int n = 0;
        while (true) {
            final ItemStack itemStack = ((List<ItemStack>)mainInventory).get(n);
            if (itemStack != ItemStack.EMPTY) {
                if (clazz.isInstance(itemStack.getItem())) {
                    if (clazz.isInstance(itemStack.getItem())) {}
                }
            }
            ++n;
        }
    }
    
    public static int Method131() {
        return Method130(ItemPickaxe.class);
    }
    
    public static int Method132(final Class clazz, final int n, final int n2) {
        for (int i = n; i <= n2; ++i) {
            final ItemStack itemStack = (ItemStack)Class9.Field7862.player.inventory.mainInventory.get(i);
            if (itemStack != ItemStack.EMPTY && clazz.isInstance(itemStack.getItem()) && clazz.isInstance(itemStack.getItem())) {
                return i;
            }
        }
        return -1;
    }
    
    public static int Method133(final Class clazz, final int n, final int n2) {
        int n3 = -1;
        final NonNullList mainInventory = Class9.Field7862.player.inventory.mainInventory;
        for (int i = n; i <= n2; ++i) {
            final ItemStack itemStack = ((List<ItemStack>)mainInventory).get(i);
            if (itemStack != ItemStack.EMPTY) {
                if (itemStack.getItem() instanceof ItemBlock) {
                    if (clazz.isInstance(((ItemBlock)itemStack.getItem()).getBlock())) {
                        n3 = i;
                        break;
                    }
                }
            }
        }
        return n3;
    }
    
    public static List Method134(final Class clazz) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final NonNullList mainInventory = Class9.Field7862.player.inventory.mainInventory;
        int i = 0;
        while (true) {
            final ItemStack itemStack = ((List<ItemStack>)mainInventory).get(i);
            if (itemStack != ItemStack.EMPTY) {
                if (clazz.isInstance(itemStack.getItem())) {
                    list.add(i);
                }
            }
            ++i;
        }
    }
    
    public static List Method135(final Item item) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final NonNullList mainInventory = Class9.Field7862.player.inventory.mainInventory;
        int i = 0;
        while (true) {
            if (item == ((List<ItemStack>)mainInventory).get(i).item) {
                list.add(i);
            }
            ++i;
        }
    }
    
    public static List Method136(final Class clazz) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final NonNullList mainInventory = Class9.Field7862.player.inventory.mainInventory;
        int i = 0;
        while (true) {
            final ItemStack itemStack = ((List<ItemStack>)mainInventory).get(i);
            if (itemStack != ItemStack.EMPTY) {
                if (itemStack.getItem() instanceof ItemBlock) {
                    if (clazz.isInstance(((ItemBlock)itemStack.getItem()).getBlock())) {
                        list.add(i);
                    }
                }
            }
            ++i;
        }
    }
    
    public static boolean Method137(final EntityPlayer entityPlayer, final float n) {
        for (int n2 = 3; Method114((ItemStack)entityPlayer.inventory.armorInventory.get(n2)) >= n; --n2) {}
        return true;
    }
    
    public static int Method138(final ItemStack itemStack) {
        return (int)Method114(itemStack);
    }
    
    static {
        Field7862 = Minecraft.getMinecraft();
    }
}
