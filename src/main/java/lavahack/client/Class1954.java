//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.block.properties.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;

public class Class1954
{
    public static final Class1954 Field17014;
    private final Map Field17015;
    private final Map Field17016;
    private final Map Field17017;
    private String Field17018 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1954() {
        this.Field17015 = new LinkedHashMap();
        this.Field17016 = new HashMap();
        this.Field17017 = new HashMap();
    }
    
    private void Method7242() {
        this.Field17015.clear();
        this.Field17016.clear();
        this.Field17017.clear();
        final Class820 class820 = Class1954::Method7264;
        final Class820 class821 = Class1954::Method7263;
        final Class820 class822 = Class1954::Method7262;
        final Class820 class823 = Class1954::Method7261;
        final Class820 class824 = Class1954::Method7260;
        final Class820 class825 = Class1954::Method7259;
        final Class820 class826 = Class1954::Method7258;
        final Class820 class827 = Class1954::leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        final Class1403 class828 = Class1954::Method7257;
        final Class1403 class829 = Class1954::Method7256;
        final Class1403 class830 = Class1954::Method7255;
        final Class1521 class831 = Class1954::Method7254;
        final Class1521 class832 = Class1954::Method7253;
        final Class1521 class833 = Class1954::Method7252;
        final Class1521 class834 = Class1954::Method7251;
        final Class1521 class835 = Class1954::Method7250;
        final Class1521 class836 = Class1954::Method7249;
        final Class1521 class837 = Class1954::Method7248;
        final Class1924 class838 = Class1954::Method7247;
        this.Method7243(BlockLog.class, new Class353(class831));
        this.Method7243(BlockButton.class, new Class353(class833));
        this.Method7243(BlockChest.class, new Class353(class821));
        this.Method7243(BlockDispenser.class, new Class353(class822));
        this.Method7243(BlockDoor.class, new Class353(class820));
        this.Method7243(BlockEnderChest.class, new Class353(class821));
        this.Method7243(BlockEndRod.class, new Class353(class833));
        this.Method7243(BlockFenceGate.class, new Class353(class820));
        this.Method7243(BlockFurnace.class, new Class353(class821));
        this.Method7243(BlockHopper.class, new Class353(class835));
        this.Method7243(BlockObserver.class, new Class353(class823));
        this.Method7243(BlockPistonBase.class, new Class353(class822));
        this.Method7243(BlockPumpkin.class, new Class353(class821));
        this.Method7243(BlockRotatedPillar.class, new Class353(class832));
        this.Method7243(BlockSlab.class, new Class353().Method1780(class828).Method1782(class838));
        this.Method7243(BlockStairs.class, new Class353(class820).Method1780(class829));
        this.Method7243(BlockTorch.class, new Class353(class833));
        this.Method7243(BlockTrapDoor.class, new Class353(class833).Method1780(class830));
        this.Method7244(Blocks.ANVIL, new Class353(class824));
        this.Method7244(Blocks.CHAIN_COMMAND_BLOCK, new Class353(class821));
        this.Method7244(Blocks.COCOA, new Class353(class834));
        this.Method7244(Blocks.END_PORTAL_FRAME, new Class353(class821));
        this.Method7244(Blocks.LADDER, new Class353(class833));
        this.Method7244(Blocks.LEVER, new Class353(class825, class836));
        this.Method7244(Blocks.QUARTZ_BLOCK, new Class353(class837));
        this.Method7244(Blocks.REPEATING_COMMAND_BLOCK, new Class353(class821));
        this.Method7244(Blocks.STANDING_SIGN, new Class353(class826));
        this.Method7244((Block)Blocks.TRIPWIRE_HOOK, new Class353(class833));
        this.Method7244(Blocks.WALL_SIGN, new Class353(class833));
        this.Method7245(Items.COMPARATOR, new Class353(class821));
        this.Method7245(Items.REPEATER, new Class353(class821));
        this.Method7244(Blocks.BED, new Class353(class827));
        this.Method7244(Blocks.END_PORTAL, new Class353(class827));
        this.Method7244((Block)Blocks.PISTON_EXTENSION, new Class353(class827));
        this.Method7244((Block)Blocks.PISTON_HEAD, new Class353(class827));
        this.Method7244((Block)Blocks.PORTAL, new Class353(class827));
        this.Method7244((Block)Blocks.SKULL, new Class353(class827));
        this.Method7244(Blocks.STANDING_BANNER, new Class353(class827));
        this.Method7244(Blocks.WALL_BANNER, new Class353(class827));
    }
    
    private Class353 Method7243(final Class clazz, final Class353 class353) {
        if (clazz == null || class353 == null) {
            return null;
        }
        return this.Field17015.put(clazz, class353);
    }
    
    private Class353 Method7244(final Block block, final Class353 class353) {
        if (block == null || class353 == null) {
            return null;
        }
        return this.Field17016.put(block, class353);
    }
    
    private Class353 Method7245(final Item item, final Class353 class353) {
        if (item == null || class353 == null) {
            return null;
        }
        return this.Field17017.put(item, class353);
    }
    
    public Class353 Method7246(final IBlockState blockState, final ItemStack itemStack) {
        final Class353 class353 = this.Field17017.get(itemStack.getItem());
        if (class353 != null) {
            return class353;
        }
        final Block getBlock = blockState.getBlock();
        final Class353 class354 = this.Field17016.get(getBlock);
        if (class354 != null) {
            return class354;
        }
        for (final Class clazz : this.Field17015.keySet()) {
            if (clazz.isInstance(getBlock)) {
                return (Class353)this.Field17015.get(clazz);
            }
        }
        return null;
    }
    
    private static int Method7247(final IBlockState blockState) {
        return ((BlockSlab)blockState.getBlock()).isDouble() ? 1 : 0;
    }
    
    private static List Method7248(final List list, final IBlockState blockState) {
        final ArrayList<EnumFacing> list2 = new ArrayList<EnumFacing>();
        final BlockQuartz$EnumType blockQuartz$EnumType = (BlockQuartz$EnumType)blockState.getValue((IProperty)BlockQuartz.VARIANT);
        for (final EnumFacing enumFacing : list) {
            if (blockQuartz$EnumType == BlockQuartz$EnumType.LINES_X && enumFacing.getAxis() != EnumFacing$Axis.X) {
                continue;
            }
            if (blockQuartz$EnumType == BlockQuartz$EnumType.LINES_Y && enumFacing.getAxis() != EnumFacing$Axis.Y) {
                continue;
            }
            if (blockQuartz$EnumType == BlockQuartz$EnumType.LINES_Z && enumFacing.getAxis() != EnumFacing$Axis.Z) {
                continue;
            }
            list2.add(enumFacing);
        }
        return list2;
    }
    
    private static List Method7249(final List list, final IBlockState blockState) {
        final ArrayList<EnumFacing> list2 = new ArrayList<EnumFacing>();
        final BlockLever$EnumOrientation blockLever$EnumOrientation = (BlockLever$EnumOrientation)blockState.getValue((IProperty)BlockLever.FACING);
        for (final EnumFacing enumFacing : list) {
            if (blockLever$EnumOrientation.getFacing().getOpposite() != enumFacing) {
                continue;
            }
            list2.add(enumFacing);
        }
        return list2;
    }
    
    private static List Method7250(final List list, final IBlockState blockState) {
        final ArrayList<EnumFacing> list2 = new ArrayList<EnumFacing>();
        final EnumFacing enumFacing = (EnumFacing)blockState.getValue((IProperty)BlockHopper.FACING);
        for (final EnumFacing enumFacing2 : list) {
            if (enumFacing != enumFacing2) {
                continue;
            }
            list2.add(enumFacing2);
        }
        return list2;
    }
    
    private static List Method7251(final List list, final IBlockState blockState) {
        final ArrayList<EnumFacing> list2 = new ArrayList<EnumFacing>();
        final IProperty method5239 = Class1290.Method5239(blockState, "facing");
        if (method5239 != null && method5239.getValueClass().equals(EnumFacing.class)) {
            final EnumFacing enumFacing = (EnumFacing)blockState.getValue(method5239);
            for (final EnumFacing enumFacing2 : list) {
                if (enumFacing != enumFacing2) {
                    continue;
                }
                list2.add(enumFacing2);
            }
        }
        return list2;
    }
    
    private static List Method7252(final List list, final IBlockState blockState) {
        final ArrayList<EnumFacing> list2 = new ArrayList<EnumFacing>();
        final IProperty method5239 = Class1290.Method5239(blockState, "facing");
        if (method5239 != null && method5239.getValueClass().equals(EnumFacing.class)) {
            final EnumFacing enumFacing = (EnumFacing)blockState.getValue(method5239);
            for (final EnumFacing enumFacing2 : list) {
                if (enumFacing.getOpposite() != enumFacing2) {
                    continue;
                }
                list2.add(enumFacing2);
            }
        }
        return list2;
    }
    
    private static List Method7253(final List list, final IBlockState blockState) {
        final ArrayList<EnumFacing> list2 = new ArrayList<EnumFacing>();
        final EnumFacing$Axis enumFacing$Axis = (EnumFacing$Axis)blockState.getValue((IProperty)BlockRotatedPillar.AXIS);
        for (final EnumFacing enumFacing : list) {
            if (enumFacing$Axis != enumFacing.getAxis()) {
                continue;
            }
            list2.add(enumFacing);
        }
        return list2;
    }
    
    private static List Method7254(final List list, final IBlockState blockState) {
        final ArrayList<EnumFacing> list2 = new ArrayList<EnumFacing>();
        final BlockLog$EnumAxis blockLog$EnumAxis = (BlockLog$EnumAxis)blockState.getValue((IProperty)BlockLog.LOG_AXIS);
        for (final EnumFacing enumFacing : list) {
            if (blockLog$EnumAxis != BlockLog$EnumAxis.fromFacingAxis(enumFacing.getAxis())) {
                continue;
            }
            list2.add(enumFacing);
        }
        return list2;
    }
    
    private static float Method7255(final IBlockState blockState) {
        return ((BlockTrapDoor$DoorHalf)blockState.getValue((IProperty)BlockTrapDoor.HALF) == BlockTrapDoor$DoorHalf.TOP) ? 1.0f : 0.0f;
    }
    
    private static float Method7256(final IBlockState blockState) {
        return ((BlockStairs$EnumHalf)blockState.getValue((IProperty)BlockStairs.HALF) == BlockStairs$EnumHalf.TOP) ? 1.0f : 0.0f;
    }
    
    private static float Method7257(final IBlockState blockState) {
        if (!((BlockSlab)blockState.getBlock()).isDouble()) {
            return ((BlockSlab$EnumBlockHalf)blockState.getValue((IProperty)BlockSlab.HALF) == BlockSlab$EnumBlockHalf.TOP) ? 1.0f : 0.0f;
        }
        return 0.0f;
    }
    
    private static boolean Method7258(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        return (int)blockState.getValue((IProperty)BlockStandingSign.ROTATION) == (MathHelper.floor((entityPlayer.rotationYaw + Double.longBitsToDouble((long)2050181010 ^ 0x406680007A334792L)) * Double.longBitsToDouble(4625196817309499392L) / Double.longBitsToDouble((long)424164318 ^ 0x4076800019483BDEL) + Double.longBitsToDouble(4602678819172646912L)) & 0xF);
    }
    
    private static boolean Method7259(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        final BlockLever$EnumOrientation blockLever$EnumOrientation = (BlockLever$EnumOrientation)blockState.getValue((IProperty)BlockLever.FACING);
        return !blockLever$EnumOrientation.getFacing().getAxis().isVertical() || BlockLever$EnumOrientation.forFacings(blockLever$EnumOrientation.getFacing(), entityPlayer.getHorizontalFacing()) == blockLever$EnumOrientation;
    }
    
    private static boolean Method7260(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        return (EnumFacing)Class1290.Method5240(blockState, "facing") == entityPlayer.getHorizontalFacing().rotateY();
    }
    
    private static boolean Method7261(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        return (EnumFacing)Class1290.Method5240(blockState, "facing") == EnumFacing.getDirectionFromEntityLiving(blockPos, (EntityLivingBase)entityPlayer).getOpposite();
    }
    
    private static boolean Method7262(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        return (EnumFacing)Class1290.Method5240(blockState, "facing") == EnumFacing.getDirectionFromEntityLiving(blockPos, (EntityLivingBase)entityPlayer);
    }
    
    private static boolean Method7263(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        return (EnumFacing)Class1290.Method5240(blockState, "facing") == entityPlayer.getHorizontalFacing().getOpposite();
    }
    
    private static boolean Method7264(final IBlockState blockState, final EntityPlayer entityPlayer, final BlockPos blockPos, final World world) {
        return (EnumFacing)Class1290.Method5240(blockState, "facing") == entityPlayer.getHorizontalFacing();
    }
    
    static {
        (Field17014 = new Class1954()).Method7242();
    }
    
    private static String Method7265(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6C49 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
