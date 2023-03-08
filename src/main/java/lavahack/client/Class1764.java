//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import net.minecraft.tileentity.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import net.minecraft.block.properties.*;

public class Class1764
{
    public static final Class1764 Field16065;
    private static final EnumFacing[][] Field16066;
    private static final EnumFacing$Axis[][] Field16067;
    private static final BlockLog$EnumAxis[][] Field16068;
    private static final BlockQuartz$EnumType[][] Field16069;
    private String Field16070 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method6701(final Class1479 class1479, final EnumFacing enumFacing, final boolean b) {
        if (class1479 == null) {
            return false;
        }
        final Class1885 method6703 = this.Method6703(class1479.getSchematic(), enumFacing, b);
        this.Method6702(class1479, enumFacing);
        class1479.setSchematic((Class686)method6703);
        final Iterator<TileEntity> iterator = (Iterator<TileEntity>)class1479.getTileEntities().iterator();
        while (iterator.hasNext()) {
            class1479.initializeTileEntity((TileEntity)iterator.next());
        }
        return true;
    }
    
    private void Method6702(final Class1479 class1479, final EnumFacing enumFacing) {
        switch (Class1857.Field16547[enumFacing.ordinal()]) {
            case 1:
            case 2: {
                final int n = (class1479.getWidth() - class1479.getLength()) / 2;
                final Class16 field14896 = class1479.Field14896;
                field14896.Field7895 += n;
                final Class16 field14897 = class1479.Field14896;
                field14897.Field7897 -= n;
                break;
            }
            case 3:
            case 4: {
                final int n2 = (class1479.getWidth() - class1479.getHeight()) / 2;
                final Class16 field14898 = class1479.Field14896;
                field14898.Field7895 += n2;
                final Class16 field14899 = class1479.Field14896;
                field14899.Field7896 -= n2;
                break;
            }
            case 5:
            case 6: {
                final int n3 = (class1479.getHeight() - class1479.getLength()) / 2;
                final Class16 field14900 = class1479.Field14896;
                field14900.Field7896 += n3;
                final Class16 field14901 = class1479.Field14896;
                field14901.Field7897 -= n3;
                break;
            }
        }
    }
    
    public Class1885 Method6703(final Class686 class686, final EnumFacing enumFacing, final boolean b) throws Class1615 {
        final Vec3i method6704 = this.Method6704(enumFacing, class686.Method2891(), class686.Method2893(), class686.Method2892());
        final Class1885 class687 = new Class1885(class686.Method2889(), method6704.getX(), method6704.getY(), method6704.getZ(), class686.Method2894());
        final Class16 class688 = new Class16();
        for (final Class16 class689 : Class777.Method3239(0, 0, 0, class686.Method2891() - 1, class686.Method2893() - 1, class686.Method2892() - 1)) {
            class687.Method2881(this.Method6705((BlockPos)class689, enumFacing, method6704, class688), this.Method6706(class686.Method2880((BlockPos)class689), enumFacing, b));
        }
        for (final TileEntity tileEntity : class686.Method2883()) {
            tileEntity.setPos(new BlockPos((Vec3i)this.Method6705(tileEntity.getPos(), enumFacing, method6704, class688)));
            class687.Method2884(tileEntity.getPos(), tileEntity);
        }
        return class687;
    }
    
    private Vec3i Method6704(final EnumFacing enumFacing, final int n, final int n2, final int n3) throws Class1615 {
        switch (Class1857.Field16547[enumFacing.ordinal()]) {
            case 1:
            case 2: {
                return new Vec3i(n3, n2, n);
            }
            case 3:
            case 4: {
                return new Vec3i(n2, n, n3);
            }
            case 5:
            case 6: {
                return new Vec3i(n, n3, n2);
            }
            default: {
                throw new Class1615("'%s' is not a valid axis!", new Object[] { enumFacing.getName() });
            }
        }
    }
    
    private BlockPos Method6705(final BlockPos blockPos, final EnumFacing enumFacing, final Vec3i vec3i, final Class16 class16) throws Class1615 {
        switch (Class1857.Field16547[enumFacing.ordinal()]) {
            case 1: {
                return (BlockPos)class16.set(blockPos.getZ(), blockPos.getY(), vec3i.getZ() - 1 - blockPos.getX());
            }
            case 2: {
                return (BlockPos)class16.set(vec3i.getX() - 1 - blockPos.getZ(), blockPos.getY(), blockPos.getX());
            }
            case 3: {
                return (BlockPos)class16.set(vec3i.getX() - 1 - blockPos.getY(), blockPos.getX(), blockPos.getZ());
            }
            case 4: {
                return (BlockPos)class16.set(blockPos.getY(), vec3i.getY() - 1 - blockPos.getX(), blockPos.getZ());
            }
            case 5: {
                return (BlockPos)class16.set(blockPos.getX(), vec3i.getY() - 1 - blockPos.getZ(), blockPos.getY());
            }
            case 6: {
                return (BlockPos)class16.set(blockPos.getX(), blockPos.getZ(), vec3i.getZ() - 1 - blockPos.getY());
            }
            default: {
                throw new Class1615("'%s' is not a valid axis!", new Object[] { enumFacing.getName() });
            }
        }
    }
    
    private IBlockState Method6706(final IBlockState blockState, final EnumFacing enumFacing, final boolean b) throws Class1615 {
        final IProperty method5239 = Class1290.Method5239(blockState, "facing");
        if (method5239 instanceof PropertyDirection) {
            final Comparable getValue = blockState.getValue(method5239);
            if (getValue instanceof EnumFacing) {
                final EnumFacing method5240 = Method6707(enumFacing, (EnumFacing)getValue);
                if (method5239.getAllowedValues().contains(method5240)) {
                    return blockState.withProperty(method5239, (Comparable)method5240);
                }
            }
        }
        else if (method5239 instanceof PropertyEnum) {
            if (BlockLever$EnumOrientation.class.isAssignableFrom(method5239.getValueClass())) {
                final BlockLever$EnumOrientation method5241 = Method6711(enumFacing, (BlockLever$EnumOrientation)blockState.getValue(method5239));
                if (method5239.getAllowedValues().contains(method5241)) {
                    return blockState.withProperty(method5239, (Comparable)method5241);
                }
            }
        }
        else if (method5239 != null) {
            Class542.Field10314.error("'{}': found 'facing' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)blockState.getBlock()), (Object)method5239.getClass().getSimpleName());
        }
        final IProperty method5242 = Class1290.Method5239(blockState, "axis");
        if (method5242 instanceof PropertyEnum) {
            if (EnumFacing$Axis.class.isAssignableFrom(method5242.getValueClass())) {
                return blockState.withProperty(method5242, (Comparable)Method6708(enumFacing, (EnumFacing$Axis)blockState.getValue(method5242)));
            }
            if (BlockLog$EnumAxis.class.isAssignableFrom(method5242.getValueClass())) {
                return blockState.withProperty(method5242, (Comparable)Method6709(enumFacing, (BlockLog$EnumAxis)blockState.getValue(method5242)));
            }
        }
        else if (method5242 != null) {
            Class542.Field10314.error("'{}': found 'axis' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)blockState.getBlock()), (Object)method5242.getClass().getSimpleName());
        }
        final IProperty method5243 = Class1290.Method5239(blockState, "variant");
        if (method5243 instanceof PropertyEnum && BlockQuartz$EnumType.class.isAssignableFrom(method5243.getValueClass())) {
            return blockState.withProperty(method5243, (Comparable)Method6710(enumFacing, (BlockQuartz$EnumType)blockState.getValue(method5243)));
        }
        if (!b && (method5239 != null || method5242 != null)) {
            throw new Class1615("'%s' cannot be rotated around '%s'", new Object[] { Block.REGISTRY.getNameForObject((Object)blockState.getBlock()), enumFacing });
        }
        return blockState;
    }
    
    private static EnumFacing Method6707(final EnumFacing enumFacing, final EnumFacing enumFacing2) {
        return Class1764.Field16066[enumFacing.ordinal()][enumFacing2.ordinal()];
    }
    
    private static EnumFacing$Axis Method6708(final EnumFacing enumFacing, final EnumFacing$Axis enumFacing$Axis) {
        return Class1764.Field16067[enumFacing.getAxis().ordinal()][enumFacing$Axis.ordinal()];
    }
    
    private static BlockLog$EnumAxis Method6709(final EnumFacing enumFacing, final BlockLog$EnumAxis blockLog$EnumAxis) {
        return Class1764.Field16068[enumFacing.getAxis().ordinal()][blockLog$EnumAxis.ordinal()];
    }
    
    private static BlockQuartz$EnumType Method6710(final EnumFacing enumFacing, final BlockQuartz$EnumType blockQuartz$EnumType) {
        return Class1764.Field16069[enumFacing.getAxis().ordinal()][blockQuartz$EnumType.ordinal()];
    }
    
    private static BlockLever$EnumOrientation Method6711(final EnumFacing enumFacing, final BlockLever$EnumOrientation blockLever$EnumOrientation) {
        EnumFacing getFacing;
        if (enumFacing.getAxis().isVertical() && blockLever$EnumOrientation.getFacing().getAxis().isVertical()) {
            getFacing = ((blockLever$EnumOrientation == BlockLever$EnumOrientation.UP_X || blockLever$EnumOrientation == BlockLever$EnumOrientation.DOWN_X) ? EnumFacing.NORTH : EnumFacing.WEST);
        }
        else {
            getFacing = blockLever$EnumOrientation.getFacing();
        }
        return BlockLever$EnumOrientation.forFacings(Method6707(enumFacing, blockLever$EnumOrientation.getFacing()), getFacing);
    }
    
    static {
        Field16065 = new Class1764();
        Field16066 = new EnumFacing[EnumFacing.VALUES.length][];
        Field16067 = new EnumFacing$Axis[EnumFacing$Axis.values().length][];
        Field16068 = new BlockLog$EnumAxis[EnumFacing$Axis.values().length][];
        Field16069 = new BlockQuartz$EnumType[EnumFacing$Axis.values().length][];
        Class1764.Field16066[EnumFacing.DOWN.ordinal()] = new EnumFacing[] { EnumFacing.DOWN, EnumFacing.UP, EnumFacing.WEST, EnumFacing.EAST, EnumFacing.SOUTH, EnumFacing.NORTH };
        Class1764.Field16066[EnumFacing.UP.ordinal()] = new EnumFacing[] { EnumFacing.DOWN, EnumFacing.UP, EnumFacing.EAST, EnumFacing.WEST, EnumFacing.NORTH, EnumFacing.SOUTH };
        Class1764.Field16066[EnumFacing.NORTH.ordinal()] = new EnumFacing[] { EnumFacing.EAST, EnumFacing.WEST, EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.DOWN, EnumFacing.UP };
        Class1764.Field16066[EnumFacing.SOUTH.ordinal()] = new EnumFacing[] { EnumFacing.WEST, EnumFacing.EAST, EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.UP, EnumFacing.DOWN };
        Class1764.Field16066[EnumFacing.WEST.ordinal()] = new EnumFacing[] { EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.UP, EnumFacing.DOWN, EnumFacing.WEST, EnumFacing.EAST };
        Class1764.Field16066[EnumFacing.EAST.ordinal()] = new EnumFacing[] { EnumFacing.SOUTH, EnumFacing.NORTH, EnumFacing.DOWN, EnumFacing.UP, EnumFacing.WEST, EnumFacing.EAST };
        Class1764.Field16067[EnumFacing$Axis.X.ordinal()] = new EnumFacing$Axis[] { EnumFacing$Axis.X, EnumFacing$Axis.Z, EnumFacing$Axis.Y };
        Class1764.Field16067[EnumFacing$Axis.Y.ordinal()] = new EnumFacing$Axis[] { EnumFacing$Axis.Z, EnumFacing$Axis.Y, EnumFacing$Axis.X };
        Class1764.Field16067[EnumFacing$Axis.Z.ordinal()] = new EnumFacing$Axis[] { EnumFacing$Axis.Y, EnumFacing$Axis.X, EnumFacing$Axis.Z };
        Class1764.Field16068[EnumFacing$Axis.X.ordinal()] = new BlockLog$EnumAxis[] { BlockLog$EnumAxis.X, BlockLog$EnumAxis.Z, BlockLog$EnumAxis.Y, BlockLog$EnumAxis.NONE };
        Class1764.Field16068[EnumFacing$Axis.Y.ordinal()] = new BlockLog$EnumAxis[] { BlockLog$EnumAxis.Z, BlockLog$EnumAxis.Y, BlockLog$EnumAxis.X, BlockLog$EnumAxis.NONE };
        Class1764.Field16068[EnumFacing$Axis.Z.ordinal()] = new BlockLog$EnumAxis[] { BlockLog$EnumAxis.Y, BlockLog$EnumAxis.X, BlockLog$EnumAxis.Z, BlockLog$EnumAxis.NONE };
        Class1764.Field16069[EnumFacing$Axis.X.ordinal()] = new BlockQuartz$EnumType[] { BlockQuartz$EnumType.DEFAULT, BlockQuartz$EnumType.CHISELED, BlockQuartz$EnumType.LINES_Z, BlockQuartz$EnumType.LINES_X, BlockQuartz$EnumType.LINES_Y };
        Class1764.Field16069[EnumFacing$Axis.Y.ordinal()] = new BlockQuartz$EnumType[] { BlockQuartz$EnumType.DEFAULT, BlockQuartz$EnumType.CHISELED, BlockQuartz$EnumType.LINES_Y, BlockQuartz$EnumType.LINES_Z, BlockQuartz$EnumType.LINES_X };
        Class1764.Field16069[EnumFacing$Axis.Z.ordinal()] = new BlockQuartz$EnumType[] { BlockQuartz$EnumType.DEFAULT, BlockQuartz$EnumType.CHISELED, BlockQuartz$EnumType.LINES_X, BlockQuartz$EnumType.LINES_Y, BlockQuartz$EnumType.LINES_Z };
    }
    
    private static String Method6712(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4344 ^ 0x93));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
