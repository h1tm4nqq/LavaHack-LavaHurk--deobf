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
import lavahack.client.BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
import lavahack.client.CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$1;
import lavahack.client.CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
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

public class CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA {
    public static final CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA Field16065 = new CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA();
    private static final EnumFacing[][] Field16066 = new EnumFacing[EnumFacing.VALUES.length][];
    private static final EnumFacing.Axis[][] Field16067 = new EnumFacing.Axis[EnumFacing.Axis.values().length][];
    private static final BlockLog.EnumAxis[][] Field16068 = new BlockLog.EnumAxis[EnumFacing.Axis.values().length][];
    private static final BlockQuartz.EnumType[][] Field16069 = new BlockQuartz.EnumType[EnumFacing.Axis.values().length][];
    private String Field16070 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method6701(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, EnumFacing enumFacing, boolean bl) {
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) {
            return ((int)1310600652L ^ 0x4E1E2DCC) != 0;
        }
        meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getSchematic();
        BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ = this.Method6703(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, enumFacing, bl);
        this.Method6702(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, enumFacing);
        oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.setSchematic(bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ);
        Iterator iterator = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getTileEntities().iterator();
        while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.initializeTileEntity(tileEntity);
        }
        return (int)((long)-1294588399 ^ (long)-1294588400) != 0;
    }

    private void Method6702(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, EnumFacing enumFacing) {
        switch (CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$1.Field16547[enumFacing.ordinal()]) {
            case 1: 
            case 2: {
                int n = (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth() - oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength()) / (((int)-1267430445L ^ 0xB4748BD2) << 1);
                oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7895 += n;
                oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7897 -= n;
                return;
            }
            case 3: 
            case 4: {
                int n = (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth() - oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getHeight()) / (((int)46836048L ^ 0x2CAA951) << 1);
                oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7895 += n;
                oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7896 -= n;
                return;
            }
            case 5: 
            case 6: {
                int n = (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getHeight() - oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength()) / ((int)((long)1462058697 ^ (long)1462058696) << 1);
                oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7896 += n;
                oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.Field7897 -= n;
                return;
            }
        }
    }

    public BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ Method6703(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, EnumFacing enumFacing, boolean bl) throws CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
        IBlockState iBlockState;
        IBlockState iBlockState2;
        Object object2;
        Vec3i vec3i = this.Method6704(enumFacing, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892());
        BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ = new BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2889(), vec3i.getX(), vec3i.getY(), vec3i.getZ(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2894());
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        for (Object object2 : l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3239((int)((long)835279365 ^ (long)835279365), (int)174400837L ^ 0xA652545, (int)2006610653L ^ 0x779A72DD, meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891() - (int)((long)-995114408 ^ (long)-995114407), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893() - (int)((long)2091519469 ^ (long)2091519468), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892() - ((int)-949317394L ^ 0xC76A90EF))) {
            iBlockState2 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2880((BlockPos)object2);
            iBlockState = this.Method6706(iBlockState2, enumFacing, bl);
            bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ.Method2881(this.Method6705((BlockPos)object2, enumFacing, vec3i, eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN), iBlockState);
        }
        List list = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2883();
        object2 = list.iterator();
        while (object2.hasNext()) {
            iBlockState2 = (TileEntity)object2.next();
            iBlockState = iBlockState2.getPos();
            iBlockState2.setPos(new BlockPos((Vec3i)this.Method6705((BlockPos)iBlockState, enumFacing, vec3i, eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)));
            bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ.Method2884(iBlockState2.getPos(), (TileEntity)iBlockState2);
        }
        return bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
    }

    private Vec3i Method6704(EnumFacing enumFacing, int n, int n2, int n3) throws CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
        switch (CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$1.Field16547[enumFacing.ordinal()]) {
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
        Object[] objectArray = new Object[(int)-3689845L ^ 0xFFC7B28A];
        objectArray[(int)((long)-254381809 ^ (long)-254381809)] = enumFacing.getName();
        throw new CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("'%s' is not a valid axis!", objectArray);
    }

    private BlockPos Method6705(BlockPos blockPos, EnumFacing enumFacing, Vec3i vec3i, EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN) throws CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
        switch (CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$1.Field16547[enumFacing.ordinal()]) {
            case 1: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(blockPos.getZ(), blockPos.getY(), vec3i.getZ() - ((int)-1298449346L ^ 0xB29B3C3F) - blockPos.getX());
            }
            case 2: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(vec3i.getX() - ((int)322429995L ^ 0x1337E42A) - blockPos.getZ(), blockPos.getY(), blockPos.getX());
            }
            case 3: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(vec3i.getX() - ((int)1231933916L ^ 0x496DD1DD) - blockPos.getY(), blockPos.getX(), blockPos.getZ());
            }
            case 4: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(blockPos.getY(), vec3i.getY() - ((int)935683161L ^ 0x37C56458) - blockPos.getX(), blockPos.getZ());
            }
            case 5: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(blockPos.getX(), vec3i.getY() - (int)((long)27695549 ^ (long)27695548) - blockPos.getZ(), blockPos.getY());
            }
            case 6: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(blockPos.getX(), blockPos.getZ(), vec3i.getZ() - (int)((long)-1476804283 ^ (long)-1476804284) - blockPos.getY());
            }
        }
        Object[] objectArray = new Object[(int)-1704893582L ^ 0x9A616373];
        objectArray[(int)((long)-1180535593 ^ (long)-1180535593)] = enumFacing.getName();
        throw new CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("'%s' is not a valid axis!", objectArray);
    }

    private IBlockState Method6706(IBlockState iBlockState, EnumFacing enumFacing, boolean bl) throws CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
        EnumFacing enumFacing2;
        Comparable comparable;
        IProperty iProperty = cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn.Method5239(iBlockState, "facing");
        if (iProperty instanceof PropertyDirection) {
            comparable = iBlockState.getValue(iProperty);
            if (comparable instanceof EnumFacing) {
                enumFacing2 = CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Method6707(enumFacing, (EnumFacing)comparable);
                if (iProperty.getAllowedValues().contains(enumFacing2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumFacing2);
                }
            }
        } else if (iProperty instanceof PropertyEnum) {
            if (BlockLever.EnumOrientation.class.isAssignableFrom(iProperty.getValueClass())) {
                comparable = (BlockLever.EnumOrientation)iBlockState.getValue(iProperty);
                enumFacing2 = CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Method6711(enumFacing, (BlockLever.EnumOrientation)comparable);
                if (iProperty.getAllowedValues().contains(enumFacing2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumFacing2);
                }
            }
        } else if (iProperty != null) {
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("'{}': found 'facing' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), (Object)iProperty.getClass().getSimpleName());
        }
        if ((comparable = cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn.Method5239(iBlockState, "axis")) instanceof PropertyEnum) {
            if (EnumFacing.Axis.class.isAssignableFrom(comparable.getValueClass())) {
                enumFacing2 = (EnumFacing.Axis)iBlockState.getValue((IProperty)comparable);
                EnumFacing.Axis axis = CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Method6708(enumFacing, (EnumFacing.Axis)enumFacing2);
                return iBlockState.withProperty((IProperty)comparable, (Comparable)axis);
            }
            if (BlockLog.EnumAxis.class.isAssignableFrom(comparable.getValueClass())) {
                enumFacing2 = (BlockLog.EnumAxis)iBlockState.getValue((IProperty)comparable);
                BlockLog.EnumAxis enumAxis = CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Method6709(enumFacing, (BlockLog.EnumAxis)enumFacing2);
                return iBlockState.withProperty((IProperty)comparable, (Comparable)enumAxis);
            }
        } else if (comparable != null) {
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("'{}': found 'axis' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), (Object)comparable.getClass().getSimpleName());
        }
        if ((enumFacing2 = cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn.Method5239(iBlockState, "variant")) instanceof PropertyEnum && BlockQuartz.EnumType.class.isAssignableFrom(enumFacing2.getValueClass())) {
            BlockQuartz.EnumType enumType = (BlockQuartz.EnumType)iBlockState.getValue((IProperty)enumFacing2);
            BlockQuartz.EnumType enumType2 = CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Method6710(enumFacing, enumType);
            return iBlockState.withProperty((IProperty)enumFacing2, (Comparable)enumType2);
        }
        if (bl) return iBlockState;
        if (iProperty == null) {
            if (comparable == null) return iBlockState;
        }
        Object[] objectArray = new Object[(int)((long)1186969762 ^ (long)1186969763) << 1];
        objectArray[(int)((long)1770922219 ^ (long)1770922219)] = Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock());
        objectArray[(int)((long)-655424772 ^ (long)-655424771)] = enumFacing;
        throw new CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("'%s' cannot be rotated around '%s'", objectArray);
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
        EnumFacing enumFacing3 = CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Method6707(enumFacing, enumOrientation.getFacing());
        return BlockLever.EnumOrientation.forFacings((EnumFacing)enumFacing3, (EnumFacing)enumFacing2);
    }

    static {
        EnumFacing[] enumFacingArray = new EnumFacing[(int)((long)1498044964 ^ (long)1498044967) << 1];
        enumFacingArray[(int)((long)1886222791 ^ (long)1886222791)] = EnumFacing.DOWN;
        enumFacingArray[(int)-181027768L ^ 0xF535BC49] = EnumFacing.UP;
        enumFacingArray[((int)-376855520L ^ 0xE989A421) << 1] = EnumFacing.WEST;
        enumFacingArray[(int)-92051691L ^ 0xFA836716] = EnumFacing.EAST;
        enumFacingArray[(int)((long)-1915980576 ^ (long)-1915980575) << 2] = EnumFacing.SOUTH;
        enumFacingArray[(int)((long)-296080012 ^ (long)-296080015)] = EnumFacing.NORTH;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16066[EnumFacing.DOWN.ordinal()] = enumFacingArray;
        EnumFacing[] enumFacingArray2 = new EnumFacing[((int)628076129L ^ 0x256FAE62) << 1];
        enumFacingArray2[(int)((long)1182347086 ^ (long)1182347086)] = EnumFacing.DOWN;
        enumFacingArray2[(int)((long)-999143291 ^ (long)-999143292)] = EnumFacing.UP;
        enumFacingArray2[(int)((long)-1670664568 ^ (long)-1670664567) << 1] = EnumFacing.EAST;
        enumFacingArray2[(int)100297946L ^ 0x5FA6CD9] = EnumFacing.WEST;
        enumFacingArray2[(int)((long)-1247676873 ^ (long)-1247676874) << 2] = EnumFacing.NORTH;
        enumFacingArray2[(int)((long)-1811093710 ^ (long)-1811093705)] = EnumFacing.SOUTH;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16066[EnumFacing.UP.ordinal()] = enumFacingArray2;
        EnumFacing[] enumFacingArray3 = new EnumFacing[((int)-599395290L ^ 0xDC45F425) << 1];
        enumFacingArray3[(int)((long)-736666219 ^ (long)-736666219)] = EnumFacing.EAST;
        enumFacingArray3[(int)305938967L ^ 0x123C4216] = EnumFacing.WEST;
        enumFacingArray3[((int)-858299071L ^ 0xCCD76540) << 1] = EnumFacing.NORTH;
        enumFacingArray3[(int)-801155582L ^ 0xD03F5601] = EnumFacing.SOUTH;
        enumFacingArray3[((int)1575144385L ^ 0x5DE2CBC0) << 2] = EnumFacing.DOWN;
        enumFacingArray3[(int)((long)1219901716 ^ (long)1219901713)] = EnumFacing.UP;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16066[EnumFacing.NORTH.ordinal()] = enumFacingArray3;
        EnumFacing[] enumFacingArray4 = new EnumFacing[(int)((long)-618386200 ^ (long)-618386197) << 1];
        enumFacingArray4[(int)-2114005770L ^ 0x81FED4F6] = EnumFacing.WEST;
        enumFacingArray4[(int)((long)-118774511 ^ (long)-118774512)] = EnumFacing.EAST;
        enumFacingArray4[(int)((long)-183562328 ^ (long)-183562327) << 1] = EnumFacing.NORTH;
        enumFacingArray4[(int)974149290L ^ 0x3A1056A9] = EnumFacing.SOUTH;
        enumFacingArray4[(int)((long)29893043 ^ (long)29893042) << 2] = EnumFacing.UP;
        enumFacingArray4[(int)783013519L ^ 0x2EABD68A] = EnumFacing.DOWN;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16066[EnumFacing.SOUTH.ordinal()] = enumFacingArray4;
        EnumFacing[] enumFacingArray5 = new EnumFacing[((int)572952990L ^ 0x2226919D) << 1];
        enumFacingArray5[(int)1135661039L ^ 0x43B0CFEF] = EnumFacing.NORTH;
        enumFacingArray5[(int)599961999L ^ 0x23C2B18E] = EnumFacing.SOUTH;
        enumFacingArray5[((int)-166046135L ^ 0xF61A5648) << 1] = EnumFacing.UP;
        enumFacingArray5[(int)1009037667L ^ 0x3C24B160] = EnumFacing.DOWN;
        enumFacingArray5[(int)((long)-162676278 ^ (long)-162676277) << 2] = EnumFacing.WEST;
        enumFacingArray5[(int)((long)1438280459 ^ (long)1438280462)] = EnumFacing.EAST;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16066[EnumFacing.WEST.ordinal()] = enumFacingArray5;
        EnumFacing[] enumFacingArray6 = new EnumFacing[((int)-294443907L ^ 0xEE73247E) << 1];
        enumFacingArray6[(int)((long)-39549844 ^ (long)-39549844)] = EnumFacing.SOUTH;
        enumFacingArray6[(int)2043339415L ^ 0x79CAE296] = EnumFacing.NORTH;
        enumFacingArray6[((int)-676053976L ^ 0xD7B43C29) << 1] = EnumFacing.DOWN;
        enumFacingArray6[(int)-467075912L ^ 0xE428FCBB] = EnumFacing.UP;
        enumFacingArray6[((int)595302305L ^ 0x237B97A0) << 2] = EnumFacing.WEST;
        enumFacingArray6[(int)1709670702L ^ 0x65E7812B] = EnumFacing.EAST;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16066[EnumFacing.EAST.ordinal()] = enumFacingArray6;
        EnumFacing.Axis[] axisArray = new EnumFacing.Axis[(int)((long)601262676 ^ (long)601262679)];
        axisArray[(int)1281421352L ^ 0x4C60F028] = EnumFacing.Axis.X;
        axisArray[(int)1788293676L ^ 0x6A97322D] = EnumFacing.Axis.Z;
        axisArray[((int)1365818475L ^ 0x5168BC6A) << 1] = EnumFacing.Axis.Y;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16067[EnumFacing.Axis.X.ordinal()] = axisArray;
        EnumFacing.Axis[] axisArray2 = new EnumFacing.Axis[(int)1848201493L ^ 0x6E295116];
        axisArray2[(int)((long)1089968565 ^ (long)1089968565)] = EnumFacing.Axis.Z;
        axisArray2[(int)((long)-904870518 ^ (long)-904870517)] = EnumFacing.Axis.Y;
        axisArray2[(int)((long)1592225961 ^ (long)1592225960) << 1] = EnumFacing.Axis.X;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16067[EnumFacing.Axis.Y.ordinal()] = axisArray2;
        EnumFacing.Axis[] axisArray3 = new EnumFacing.Axis[(int)((long)1828221318 ^ (long)1828221317)];
        axisArray3[(int)-1541738436L ^ 0xA41AF03C] = EnumFacing.Axis.Y;
        axisArray3[(int)-1923645787L ^ 0x8D577EA4] = EnumFacing.Axis.X;
        axisArray3[((int)-787092887L ^ 0xD115EA68) << 1] = EnumFacing.Axis.Z;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16067[EnumFacing.Axis.Z.ordinal()] = axisArray3;
        BlockLog.EnumAxis[] enumAxisArray = new BlockLog.EnumAxis[(int)((long)682549984 ^ (long)682549985) << 2];
        enumAxisArray[(int)((long)1120616262 ^ (long)1120616262)] = BlockLog.EnumAxis.X;
        enumAxisArray[(int)-1261766635L ^ 0xB4CAF814] = BlockLog.EnumAxis.Z;
        enumAxisArray[((int)146164753L ^ 0x8B64C10) << 1] = BlockLog.EnumAxis.Y;
        enumAxisArray[(int)-3326945L ^ 0xFFCD3C1C] = BlockLog.EnumAxis.NONE;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16068[EnumFacing.Axis.X.ordinal()] = enumAxisArray;
        BlockLog.EnumAxis[] enumAxisArray2 = new BlockLog.EnumAxis[((int)-1221493330L ^ 0xB7317DAF) << 2];
        enumAxisArray2[(int)((long)1542220715 ^ (long)1542220715)] = BlockLog.EnumAxis.Z;
        enumAxisArray2[(int)((long)-1029758426 ^ (long)-1029758425)] = BlockLog.EnumAxis.Y;
        enumAxisArray2[((int)1869681950L ^ 0x6F71151F) << 1] = BlockLog.EnumAxis.X;
        enumAxisArray2[(int)((long)655364433 ^ (long)655364434)] = BlockLog.EnumAxis.NONE;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16068[EnumFacing.Axis.Y.ordinal()] = enumAxisArray2;
        BlockLog.EnumAxis[] enumAxisArray3 = new BlockLog.EnumAxis[(int)((long)-1505427057 ^ (long)-1505427058) << 2];
        enumAxisArray3[(int)((long)-1686869424 ^ (long)-1686869424)] = BlockLog.EnumAxis.Y;
        enumAxisArray3[(int)1753989590L ^ 0x688BC1D7] = BlockLog.EnumAxis.X;
        enumAxisArray3[((int)1482459949L ^ 0x585C8B2C) << 1] = BlockLog.EnumAxis.Z;
        enumAxisArray3[(int)-93960164L ^ 0xFA66481F] = BlockLog.EnumAxis.NONE;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16068[EnumFacing.Axis.Z.ordinal()] = enumAxisArray3;
        BlockQuartz.EnumType[] enumTypeArray = new BlockQuartz.EnumType[(int)-1241740608L ^ 0xB5FC8AC5];
        enumTypeArray[(int)((long)1358607778 ^ (long)1358607778)] = BlockQuartz.EnumType.DEFAULT;
        enumTypeArray[(int)-329050844L ^ 0xEC631525] = BlockQuartz.EnumType.CHISELED;
        enumTypeArray[(int)((long)-508153507 ^ (long)-508153508) << 1] = BlockQuartz.EnumType.LINES_Z;
        enumTypeArray[(int)((long)-432729990 ^ (long)-432729991)] = BlockQuartz.EnumType.LINES_X;
        enumTypeArray[((int)-494165139L ^ 0xE28BA36C) << 2] = BlockQuartz.EnumType.LINES_Y;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16069[EnumFacing.Axis.X.ordinal()] = enumTypeArray;
        BlockQuartz.EnumType[] enumTypeArray2 = new BlockQuartz.EnumType[(int)-19423175L ^ 0xFED7A03C];
        enumTypeArray2[(int)((long)-540370666 ^ (long)-540370666)] = BlockQuartz.EnumType.DEFAULT;
        enumTypeArray2[(int)690679032L ^ 0x292AECF9] = BlockQuartz.EnumType.CHISELED;
        enumTypeArray2[(int)((long)-732138496 ^ (long)-732138495) << 1] = BlockQuartz.EnumType.LINES_Y;
        enumTypeArray2[(int)((long)481009549 ^ (long)481009550)] = BlockQuartz.EnumType.LINES_Z;
        enumTypeArray2[(int)((long)-1459315975 ^ (long)-1459315976) << 2] = BlockQuartz.EnumType.LINES_X;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16069[EnumFacing.Axis.Y.ordinal()] = enumTypeArray2;
        BlockQuartz.EnumType[] enumTypeArray3 = new BlockQuartz.EnumType[(int)-155877385L ^ 0xF6B57FF2];
        enumTypeArray3[(int)-942698998L ^ 0xC7CF8E0A] = BlockQuartz.EnumType.DEFAULT;
        enumTypeArray3[(int)((long)-286680719 ^ (long)-286680720)] = BlockQuartz.EnumType.CHISELED;
        enumTypeArray3[(int)((long)1756303702 ^ (long)1756303703) << 1] = BlockQuartz.EnumType.LINES_X;
        enumTypeArray3[(int)-581455842L ^ 0xDD57B01D] = BlockQuartz.EnumType.LINES_Y;
        enumTypeArray3[(int)((long)-688900419 ^ (long)-688900420) << 2] = BlockQuartz.EnumType.LINES_Z;
        CDWHmkIq5Vhw2D8gJFTTN37eVgbQx2bA.Field16069[EnumFacing.Axis.Z.ordinal()] = enumTypeArray3;
    }

    private static String Method6712(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1157758505 ^ (long)-1157758505);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-567597775 ^ (long)-567597618);
            int n2 = (int)1052893046L ^ 0x3EC1DFE5;
            cArray2[n] = (char)(cArray[n] ^ (((int)2145217493L ^ 0x7FDD7B04) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

