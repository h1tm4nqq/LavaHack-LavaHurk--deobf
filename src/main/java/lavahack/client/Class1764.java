//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLever$EnumOrientation
 *  net.minecraft.block.BlockLog$EnumAxis
 *  net.minecraft.block.BlockQuartz$EnumType
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyDirection
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumFacing$Axis
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1290;
import lavahack.client.Class1479;
import lavahack.client.Class16;
import lavahack.client.Class1615;
import lavahack.client.Class1857;
import lavahack.client.Class1885;
import lavahack.client.Class542;
import lavahack.client.Class686;
import lavahack.client.Class777;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

public class Class1764 {
    public static final Class1764 Field16065 = new Class1764();
    private static final EnumFacing[][] Field16066 = new EnumFacing[EnumFacing.VALUES.length][];
    private static final EnumFacing.Axis[][] Field16067 = new EnumFacing.Axis[EnumFacing.Axis.values().length][];
    private static final BlockLog.EnumAxis[][] Field16068 = new BlockLog.EnumAxis[EnumFacing.Axis.values().length][];
    private static final BlockQuartz.EnumType[][] Field16069 = new BlockQuartz.EnumType[EnumFacing.Axis.values().length][];
    private String Field16070 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method6701(Class1479 class1479, EnumFacing enumFacing, boolean bl) {
        if (class1479 == null) {
            return false;
        }
        Class686 class686 = class1479.getSchematic();
        Class1885 class1885 = this.Method6703(class686, enumFacing, bl);
        this.Method6702(class1479, enumFacing);
        class1479.setSchematic(class1885);
        Iterator iterator = class1479.getTileEntities().iterator();
        while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            class1479.initializeTileEntity(tileEntity);
        }
        return true;
    }

    private void Method6702(Class1479 class1479, EnumFacing enumFacing) {
        switch (Class1857.Field16547[enumFacing.ordinal()]) {
            case 1: 
            case 2: {
                int n = (class1479.getWidth() - class1479.getLength()) / 2;
                class1479.Field14896.Field7895 += n;
                class1479.Field14896.Field7897 -= n;
                return;
            }
            case 3: 
            case 4: {
                int n = (class1479.getWidth() - class1479.getHeight()) / 2;
                class1479.Field14896.Field7895 += n;
                class1479.Field14896.Field7896 -= n;
                return;
            }
            case 5: 
            case 6: {
                int n = (class1479.getHeight() - class1479.getLength()) / 2;
                class1479.Field14896.Field7896 += n;
                class1479.Field14896.Field7897 -= n;
                return;
            }
        }
    }

    public Class1885 Method6703(Class686 class686, EnumFacing enumFacing, boolean bl) throws Class1615 {
        IBlockState iBlockState;
        IBlockState iBlockState2;
        Object object2;
        Vec3i vec3i = this.Method6704(enumFacing, class686.Method2891(), class686.Method2893(), class686.Method2892());
        Class1885 class1885 = new Class1885(class686.Method2889(), vec3i.getX(), vec3i.getY(), vec3i.getZ(), class686.Method2894());
        Class16 class16 = new Class16();
        for (Object object2 : Class777.Method3239(0, 0, 0, class686.Method2891() - 1, class686.Method2893() - 1, class686.Method2892() - 1)) {
            iBlockState2 = class686.Method2880((BlockPos)object2);
            iBlockState = this.Method6706(iBlockState2, enumFacing, bl);
            class1885.Method2881(this.Method6705((BlockPos)object2, enumFacing, vec3i, class16), iBlockState);
        }
        List list = class686.Method2883();
        object2 = list.iterator();
        while (object2.hasNext()) {
            iBlockState2 = (TileEntity)object2.next();
            iBlockState = iBlockState2.getPos();
            iBlockState2.setPos(new BlockPos((Vec3i)this.Method6705((BlockPos)iBlockState, enumFacing, vec3i, class16)));
            class1885.Method2884(iBlockState2.getPos(), (TileEntity)iBlockState2);
        }
        return class1885;
    }

    private Vec3i Method6704(EnumFacing enumFacing, int n, int n2, int n3) throws Class1615 {
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
        }
        throw new Class1615("'%s' is not a valid axis!", enumFacing.getName());
    }

    private BlockPos Method6705(BlockPos blockPos, EnumFacing enumFacing, Vec3i vec3i, Class16 class16) throws Class1615 {
        switch (Class1857.Field16547[enumFacing.ordinal()]) {
            case 1: {
                return class16.set(blockPos.getZ(), blockPos.getY(), vec3i.getZ() - 1 - blockPos.getX());
            }
            case 2: {
                return class16.set(vec3i.getX() - 1 - blockPos.getZ(), blockPos.getY(), blockPos.getX());
            }
            case 3: {
                return class16.set(vec3i.getX() - 1 - blockPos.getY(), blockPos.getX(), blockPos.getZ());
            }
            case 4: {
                return class16.set(blockPos.getY(), vec3i.getY() - 1 - blockPos.getX(), blockPos.getZ());
            }
            case 5: {
                return class16.set(blockPos.getX(), vec3i.getY() - 1 - blockPos.getZ(), blockPos.getY());
            }
            case 6: {
                return class16.set(blockPos.getX(), blockPos.getZ(), vec3i.getZ() - 1 - blockPos.getY());
            }
        }
        throw new Class1615("'%s' is not a valid axis!", enumFacing.getName());
    }

    private IBlockState Method6706(IBlockState iBlockState, EnumFacing enumFacing, boolean bl) throws Class1615 {
        EnumFacing enumFacing2;
        Comparable comparable;
        IProperty iProperty = Class1290.Method5239(iBlockState, "facing");
        if (iProperty instanceof PropertyDirection) {
            comparable = iBlockState.getValue(iProperty);
            if (comparable instanceof EnumFacing) {
                enumFacing2 = Class1764.Method6707(enumFacing, (EnumFacing)comparable);
                if (iProperty.getAllowedValues().contains(enumFacing2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumFacing2);
                }
            }
        } else if (iProperty instanceof PropertyEnum) {
            if (BlockLever.EnumOrientation.class.isAssignableFrom(iProperty.getValueClass())) {
                comparable = (BlockLever.EnumOrientation)iBlockState.getValue(iProperty);
                enumFacing2 = Class1764.Method6711(enumFacing, (BlockLever.EnumOrientation)comparable);
                if (iProperty.getAllowedValues().contains(enumFacing2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumFacing2);
                }
            }
        } else if (iProperty != null) {
            Class542.Field10314.error("'{}': found 'facing' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), (Object)iProperty.getClass().getSimpleName());
        }
        if ((comparable = Class1290.Method5239(iBlockState, "axis")) instanceof PropertyEnum) {
            if (EnumFacing.Axis.class.isAssignableFrom(comparable.getValueClass())) {
                enumFacing2 = (EnumFacing.Axis)iBlockState.getValue((IProperty)comparable);
                EnumFacing.Axis axis = Class1764.Method6708(enumFacing, (EnumFacing.Axis)enumFacing2);
                return iBlockState.withProperty((IProperty)comparable, (Comparable)axis);
            }
            if (BlockLog.EnumAxis.class.isAssignableFrom(comparable.getValueClass())) {
                enumFacing2 = (BlockLog.EnumAxis)iBlockState.getValue((IProperty)comparable);
                BlockLog.EnumAxis enumAxis = Class1764.Method6709(enumFacing, (BlockLog.EnumAxis)enumFacing2);
                return iBlockState.withProperty((IProperty)comparable, (Comparable)enumAxis);
            }
        } else if (comparable != null) {
            Class542.Field10314.error("'{}': found 'axis' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), (Object)comparable.getClass().getSimpleName());
        }
        if ((enumFacing2 = Class1290.Method5239(iBlockState, "variant")) instanceof PropertyEnum && BlockQuartz.EnumType.class.isAssignableFrom(enumFacing2.getValueClass())) {
            BlockQuartz.EnumType enumType = (BlockQuartz.EnumType)iBlockState.getValue((IProperty)enumFacing2);
            BlockQuartz.EnumType enumType2 = Class1764.Method6710(enumFacing, enumType);
            return iBlockState.withProperty((IProperty)enumFacing2, (Comparable)enumType2);
        }
        if (bl) return iBlockState;
        if (iProperty != null) throw new Class1615("'%s' cannot be rotated around '%s'", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), enumFacing);
        if (comparable == null) return iBlockState;
        throw new Class1615("'%s' cannot be rotated around '%s'", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), enumFacing);
    }

    private static EnumFacing Method6707(EnumFacing enumFacing, EnumFacing enumFacing2) {
        return Field16066[enumFacing.ordinal()][enumFacing2.ordinal()];
    }

    private static EnumFacing.Axis Method6708(EnumFacing enumFacing, EnumFacing.Axis axis) {
        return Field16067[enumFacing.getAxis().ordinal()][axis.ordinal()];
    }

    private static BlockLog.EnumAxis Method6709(EnumFacing enumFacing, BlockLog.EnumAxis enumAxis) {
        return Field16068[enumFacing.getAxis().ordinal()][enumAxis.ordinal()];
    }

    private static BlockQuartz.EnumType Method6710(EnumFacing enumFacing, BlockQuartz.EnumType enumType) {
        return Field16069[enumFacing.getAxis().ordinal()][enumType.ordinal()];
    }

    private static BlockLever.EnumOrientation Method6711(EnumFacing enumFacing, BlockLever.EnumOrientation enumOrientation) {
        EnumFacing enumFacing2 = enumFacing.getAxis().isVertical() && enumOrientation.getFacing().getAxis().isVertical() ? (enumOrientation == BlockLever.EnumOrientation.UP_X || enumOrientation == BlockLever.EnumOrientation.DOWN_X ? EnumFacing.NORTH : EnumFacing.WEST) : enumOrientation.getFacing();
        EnumFacing enumFacing3 = Class1764.Method6707(enumFacing, enumOrientation.getFacing());
        return BlockLever.EnumOrientation.forFacings((EnumFacing)enumFacing3, (EnumFacing)enumFacing2);
    }

    static {
        Class1764.Field16066[EnumFacing.DOWN.ordinal()] = new EnumFacing[]{EnumFacing.DOWN, EnumFacing.UP, EnumFacing.WEST, EnumFacing.EAST, EnumFacing.SOUTH, EnumFacing.NORTH};
        Class1764.Field16066[EnumFacing.UP.ordinal()] = new EnumFacing[]{EnumFacing.DOWN, EnumFacing.UP, EnumFacing.EAST, EnumFacing.WEST, EnumFacing.NORTH, EnumFacing.SOUTH};
        Class1764.Field16066[EnumFacing.NORTH.ordinal()] = new EnumFacing[]{EnumFacing.EAST, EnumFacing.WEST, EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.DOWN, EnumFacing.UP};
        Class1764.Field16066[EnumFacing.SOUTH.ordinal()] = new EnumFacing[]{EnumFacing.WEST, EnumFacing.EAST, EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.UP, EnumFacing.DOWN};
        Class1764.Field16066[EnumFacing.WEST.ordinal()] = new EnumFacing[]{EnumFacing.NORTH, EnumFacing.SOUTH, EnumFacing.UP, EnumFacing.DOWN, EnumFacing.WEST, EnumFacing.EAST};
        Class1764.Field16066[EnumFacing.EAST.ordinal()] = new EnumFacing[]{EnumFacing.SOUTH, EnumFacing.NORTH, EnumFacing.DOWN, EnumFacing.UP, EnumFacing.WEST, EnumFacing.EAST};
        Class1764.Field16067[EnumFacing.Axis.X.ordinal()] = new EnumFacing.Axis[]{EnumFacing.Axis.X, EnumFacing.Axis.Z, EnumFacing.Axis.Y};
        Class1764.Field16067[EnumFacing.Axis.Y.ordinal()] = new EnumFacing.Axis[]{EnumFacing.Axis.Z, EnumFacing.Axis.Y, EnumFacing.Axis.X};
        Class1764.Field16067[EnumFacing.Axis.Z.ordinal()] = new EnumFacing.Axis[]{EnumFacing.Axis.Y, EnumFacing.Axis.X, EnumFacing.Axis.Z};
        Class1764.Field16068[EnumFacing.Axis.X.ordinal()] = new BlockLog.EnumAxis[]{BlockLog.EnumAxis.X, BlockLog.EnumAxis.Z, BlockLog.EnumAxis.Y, BlockLog.EnumAxis.NONE};
        Class1764.Field16068[EnumFacing.Axis.Y.ordinal()] = new BlockLog.EnumAxis[]{BlockLog.EnumAxis.Z, BlockLog.EnumAxis.Y, BlockLog.EnumAxis.X, BlockLog.EnumAxis.NONE};
        Class1764.Field16068[EnumFacing.Axis.Z.ordinal()] = new BlockLog.EnumAxis[]{BlockLog.EnumAxis.Y, BlockLog.EnumAxis.X, BlockLog.EnumAxis.Z, BlockLog.EnumAxis.NONE};
        Class1764.Field16069[EnumFacing.Axis.X.ordinal()] = new BlockQuartz.EnumType[]{BlockQuartz.EnumType.DEFAULT, BlockQuartz.EnumType.CHISELED, BlockQuartz.EnumType.LINES_Z, BlockQuartz.EnumType.LINES_X, BlockQuartz.EnumType.LINES_Y};
        Class1764.Field16069[EnumFacing.Axis.Y.ordinal()] = new BlockQuartz.EnumType[]{BlockQuartz.EnumType.DEFAULT, BlockQuartz.EnumType.CHISELED, BlockQuartz.EnumType.LINES_Y, BlockQuartz.EnumType.LINES_Z, BlockQuartz.EnumType.LINES_X};
        Class1764.Field16069[EnumFacing.Axis.Z.ordinal()] = new BlockQuartz.EnumType[]{BlockQuartz.EnumType.DEFAULT, BlockQuartz.EnumType.CHISELED, BlockQuartz.EnumType.LINES_X, BlockQuartz.EnumType.LINES_Y, BlockQuartz.EnumType.LINES_Z};
    }

    private static String Method6712(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 147;
            cArray2[n] = (char)(cArray[n] ^ (0x4344 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

