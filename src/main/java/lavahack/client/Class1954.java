//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockButton
 *  net.minecraft.block.BlockChest
 *  net.minecraft.block.BlockDispenser
 *  net.minecraft.block.BlockDoor
 *  net.minecraft.block.BlockEndRod
 *  net.minecraft.block.BlockEnderChest
 *  net.minecraft.block.BlockFenceGate
 *  net.minecraft.block.BlockFurnace
 *  net.minecraft.block.BlockHopper
 *  net.minecraft.block.BlockLever
 *  net.minecraft.block.BlockLever$EnumOrientation
 *  net.minecraft.block.BlockLog
 *  net.minecraft.block.BlockLog$EnumAxis
 *  net.minecraft.block.BlockObserver
 *  net.minecraft.block.BlockPistonBase
 *  net.minecraft.block.BlockPumpkin
 *  net.minecraft.block.BlockQuartz
 *  net.minecraft.block.BlockQuartz$EnumType
 *  net.minecraft.block.BlockRotatedPillar
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.BlockSlab$EnumBlockHalf
 *  net.minecraft.block.BlockStairs
 *  net.minecraft.block.BlockStairs$EnumHalf
 *  net.minecraft.block.BlockStandingSign
 *  net.minecraft.block.BlockTorch
 *  net.minecraft.block.BlockTrapDoor
 *  net.minecraft.block.BlockTrapDoor$DoorHalf
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumFacing$Axis
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lavahack.client.Class1290;
import lavahack.client.Class1403;
import lavahack.client.Class1521;
import lavahack.client.Class1924;
import lavahack.client.Class353;
import lavahack.client.Class820;
import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockEndRod;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockObserver;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStandingSign;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class1954 {
    public static final Class1954 Field17014 = new Class1954();
    private final Map Field17015 = new LinkedHashMap();
    private final Map Field17016 = new HashMap();
    private final Map Field17017 = new HashMap();
    private String Field17018 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private void Method7242() {
        this.Field17015.clear();
        this.Field17016.clear();
        this.Field17017.clear();
        Class820 class820 = Class1954::Method7264;
        Class820 class8202 = Class1954::Method7263;
        Class820 class8203 = Class1954::Method7262;
        Class820 class8204 = Class1954::Method7261;
        Class820 class8205 = Class1954::Method7260;
        Class820 class8206 = Class1954::Method7259;
        Class820 class8207 = Class1954::Method7258;
        Class820 class8208 = (Class820)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z, leqS0IyKEB621E1SrHdAcHHAUjScjmKi(net.minecraft.block.state.IBlockState net.minecraft.entity.player.EntityPlayer net.minecraft.util.math.BlockPos net.minecraft.world.World ), (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;)Z)();
        Class1403 class1403 = Class1954::Method7257;
        Class1403 class14032 = Class1954::Method7256;
        Class1403 class14033 = Class1954::Method7255;
        Class1521 class1521 = Class1954::Method7254;
        Class1521 class15212 = Class1954::Method7253;
        Class1521 class15213 = Class1954::Method7252;
        Class1521 class15214 = Class1954::Method7251;
        Class1521 class15215 = Class1954::Method7250;
        Class1521 class15216 = Class1954::Method7249;
        Class1521 class15217 = Class1954::Method7248;
        Class1924 class1924 = Class1954::Method7247;
        this.Method7243(BlockLog.class, new Class353(class1521));
        this.Method7243(BlockButton.class, new Class353(class15213));
        this.Method7243(BlockChest.class, new Class353(class8202));
        this.Method7243(BlockDispenser.class, new Class353(class8203));
        this.Method7243(BlockDoor.class, new Class353(class820));
        this.Method7243(BlockEnderChest.class, new Class353(class8202));
        this.Method7243(BlockEndRod.class, new Class353(class15213));
        this.Method7243(BlockFenceGate.class, new Class353(class820));
        this.Method7243(BlockFurnace.class, new Class353(class8202));
        this.Method7243(BlockHopper.class, new Class353(class15215));
        this.Method7243(BlockObserver.class, new Class353(class8204));
        this.Method7243(BlockPistonBase.class, new Class353(class8203));
        this.Method7243(BlockPumpkin.class, new Class353(class8202));
        this.Method7243(BlockRotatedPillar.class, new Class353(class15212));
        this.Method7243(BlockSlab.class, new Class353().Method1780(class1403).Method1782(class1924));
        this.Method7243(BlockStairs.class, new Class353(class820).Method1780(class14032));
        this.Method7243(BlockTorch.class, new Class353(class15213));
        this.Method7243(BlockTrapDoor.class, new Class353(class15213).Method1780(class14033));
        this.Method7244(Blocks.ANVIL, new Class353(class8205));
        this.Method7244(Blocks.CHAIN_COMMAND_BLOCK, new Class353(class8202));
        this.Method7244(Blocks.COCOA, new Class353(class15214));
        this.Method7244(Blocks.END_PORTAL_FRAME, new Class353(class8202));
        this.Method7244(Blocks.LADDER, new Class353(class15213));
        this.Method7244(Blocks.LEVER, new Class353(class8206, class15216));
        this.Method7244(Blocks.QUARTZ_BLOCK, new Class353(class15217));
        this.Method7244(Blocks.REPEATING_COMMAND_BLOCK, new Class353(class8202));
        this.Method7244(Blocks.STANDING_SIGN, new Class353(class8207));
        this.Method7244((Block)Blocks.TRIPWIRE_HOOK, new Class353(class15213));
        this.Method7244(Blocks.WALL_SIGN, new Class353(class15213));
        this.Method7245(Items.COMPARATOR, new Class353(class8202));
        this.Method7245(Items.REPEATER, new Class353(class8202));
        this.Method7244(Blocks.BED, new Class353(class8208));
        this.Method7244(Blocks.END_PORTAL, new Class353(class8208));
        this.Method7244((Block)Blocks.PISTON_EXTENSION, new Class353(class8208));
        this.Method7244((Block)Blocks.PISTON_HEAD, new Class353(class8208));
        this.Method7244((Block)Blocks.PORTAL, new Class353(class8208));
        this.Method7244((Block)Blocks.SKULL, new Class353(class8208));
        this.Method7244(Blocks.STANDING_BANNER, new Class353(class8208));
        this.Method7244(Blocks.WALL_BANNER, new Class353(class8208));
    }

    private Class353 Method7243(Class clazz, Class353 class353) {
        if (clazz == null) return null;
        if (class353 != null) return this.Field17015.put(clazz, class353);
        return null;
    }

    private Class353 Method7244(Block block, Class353 class353) {
        if (block == null) return null;
        if (class353 != null) return this.Field17016.put(block, class353);
        return null;
    }

    private Class353 Method7245(Item item, Class353 class353) {
        if (item == null) return null;
        if (class353 != null) return this.Field17017.put(item, class353);
        return null;
    }

    public Class353 Method7246(IBlockState iBlockState, ItemStack itemStack) {
        Class clazz;
        Item item = itemStack.getItem();
        Class353 class353 = (Class353)this.Field17017.get(item);
        if (class353 != null) {
            return class353;
        }
        Block block = iBlockState.getBlock();
        Class353 class3532 = (Class353)this.Field17016.get(block);
        if (class3532 != null) {
            return class3532;
        }
        Iterator iterator = this.Field17015.keySet().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!(clazz = (Class)iterator.next()).isInstance(block));
        return (Class353)this.Field17015.get(clazz);
    }

    private static int Method7247(IBlockState iBlockState) {
        if (!((BlockSlab)iBlockState.getBlock()).isDouble()) return 0;
        return 1;
    }

    private static List Method7248(List list, IBlockState iBlockState) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        BlockQuartz.EnumType enumType = (BlockQuartz.EnumType)iBlockState.getValue((IProperty)BlockQuartz.VARIANT);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing = (EnumFacing)iterator.next();
            if (enumType == BlockQuartz.EnumType.LINES_X && enumFacing.getAxis() != EnumFacing.Axis.X || enumType == BlockQuartz.EnumType.LINES_Y && enumFacing.getAxis() != EnumFacing.Axis.Y || enumType == BlockQuartz.EnumType.LINES_Z && enumFacing.getAxis() != EnumFacing.Axis.Z) continue;
            arrayList.add(enumFacing);
        }
        return arrayList;
    }

    private static List Method7249(List list, IBlockState iBlockState) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        BlockLever.EnumOrientation enumOrientation = (BlockLever.EnumOrientation)iBlockState.getValue((IProperty)BlockLever.FACING);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing = (EnumFacing)iterator.next();
            if (enumOrientation.getFacing().getOpposite() != enumFacing) continue;
            arrayList.add(enumFacing);
        }
        return arrayList;
    }

    private static List Method7250(List list, IBlockState iBlockState) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        EnumFacing enumFacing = (EnumFacing)iBlockState.getValue((IProperty)BlockHopper.FACING);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing2 = (EnumFacing)iterator.next();
            if (enumFacing != enumFacing2) continue;
            arrayList.add(enumFacing2);
        }
        return arrayList;
    }

    private static List Method7251(List list, IBlockState iBlockState) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        IProperty iProperty = Class1290.Method5239(iBlockState, "facing");
        if (iProperty == null) return arrayList;
        if (!iProperty.getValueClass().equals(EnumFacing.class)) return arrayList;
        EnumFacing enumFacing = (EnumFacing)iBlockState.getValue(iProperty);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing2 = (EnumFacing)iterator.next();
            if (enumFacing != enumFacing2) continue;
            arrayList.add(enumFacing2);
        }
        return arrayList;
    }

    private static List Method7252(List list, IBlockState iBlockState) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        IProperty iProperty = Class1290.Method5239(iBlockState, "facing");
        if (iProperty == null) return arrayList;
        if (!iProperty.getValueClass().equals(EnumFacing.class)) return arrayList;
        EnumFacing enumFacing = (EnumFacing)iBlockState.getValue(iProperty);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing2 = (EnumFacing)iterator.next();
            if (enumFacing.getOpposite() != enumFacing2) continue;
            arrayList.add(enumFacing2);
        }
        return arrayList;
    }

    private static List Method7253(List list, IBlockState iBlockState) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        EnumFacing.Axis axis = (EnumFacing.Axis)iBlockState.getValue((IProperty)BlockRotatedPillar.AXIS);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing = (EnumFacing)iterator.next();
            if (axis != enumFacing.getAxis()) continue;
            arrayList.add(enumFacing);
        }
        return arrayList;
    }

    private static List Method7254(List list, IBlockState iBlockState) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        BlockLog.EnumAxis enumAxis = (BlockLog.EnumAxis)iBlockState.getValue((IProperty)BlockLog.LOG_AXIS);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            EnumFacing enumFacing = (EnumFacing)iterator.next();
            if (enumAxis != BlockLog.EnumAxis.fromFacingAxis((EnumFacing.Axis)enumFacing.getAxis())) continue;
            arrayList.add(enumFacing);
        }
        return arrayList;
    }

    private static float Method7255(IBlockState iBlockState) {
        BlockTrapDoor.DoorHalf doorHalf = (BlockTrapDoor.DoorHalf)iBlockState.getValue((IProperty)BlockTrapDoor.HALF);
        if (doorHalf != BlockTrapDoor.DoorHalf.TOP) return 0.0f;
        return 1.0f;
    }

    private static float Method7256(IBlockState iBlockState) {
        BlockStairs.EnumHalf enumHalf = (BlockStairs.EnumHalf)iBlockState.getValue((IProperty)BlockStairs.HALF);
        if (enumHalf != BlockStairs.EnumHalf.TOP) return 0.0f;
        return 1.0f;
    }

    private static float Method7257(IBlockState iBlockState) {
        if (((BlockSlab)iBlockState.getBlock()).isDouble()) return 0.0f;
        BlockSlab.EnumBlockHalf enumBlockHalf = (BlockSlab.EnumBlockHalf)iBlockState.getValue((IProperty)BlockSlab.HALF);
        if (enumBlockHalf != BlockSlab.EnumBlockHalf.TOP) return 0.0f;
        return 1.0f;
    }

    private static boolean Method7258(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        int n;
        int n2 = (Integer)iBlockState.getValue((IProperty)BlockStandingSign.ROTATION);
        if (n2 != (n = MathHelper.floor((double)(((double)entityPlayer.rotationYaw + Double.longBitsToDouble((long)2050181010 ^ 0x406680007A334792L)) * Double.longBitsToDouble(0x4030000000000000L) / Double.longBitsToDouble((long)424164318 ^ 0x4076800019483BDEL) + Double.longBitsToDouble(4602678819172646912L))) & 0xF)) return false;
        return true;
    }

    private static boolean Method7259(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        BlockLever.EnumOrientation enumOrientation = (BlockLever.EnumOrientation)iBlockState.getValue((IProperty)BlockLever.FACING);
        if (!enumOrientation.getFacing().getAxis().isVertical()) return true;
        if (BlockLever.EnumOrientation.forFacings((EnumFacing)enumOrientation.getFacing(), (EnumFacing)entityPlayer.getHorizontalFacing()) == enumOrientation) return true;
        return false;
    }

    private static boolean Method7260(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        EnumFacing enumFacing = (EnumFacing)Class1290.Method5240(iBlockState, "facing");
        if (enumFacing != entityPlayer.getHorizontalFacing().rotateY()) return false;
        return true;
    }

    private static boolean Method7261(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        EnumFacing enumFacing = (EnumFacing)Class1290.Method5240(iBlockState, "facing");
        if (enumFacing != EnumFacing.getDirectionFromEntityLiving((BlockPos)blockPos, (EntityLivingBase)entityPlayer).getOpposite()) return false;
        return true;
    }

    private static boolean Method7262(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        EnumFacing enumFacing = (EnumFacing)Class1290.Method5240(iBlockState, "facing");
        if (enumFacing != EnumFacing.getDirectionFromEntityLiving((BlockPos)blockPos, (EntityLivingBase)entityPlayer)) return false;
        return true;
    }

    private static boolean Method7263(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        EnumFacing enumFacing = (EnumFacing)Class1290.Method5240(iBlockState, "facing");
        if (enumFacing != entityPlayer.getHorizontalFacing().getOpposite()) return false;
        return true;
    }

    private static boolean Method7264(IBlockState iBlockState, EntityPlayer entityPlayer, BlockPos blockPos, World world) {
        EnumFacing enumFacing = (EnumFacing)Class1290.Method5240(iBlockState, "facing");
        if (enumFacing != entityPlayer.getHorizontalFacing()) return false;
        return true;
    }

    static {
        Field17014.Method7242();
    }

    private static String Method7265(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x6C49 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

