//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLever$EnumOrientation
 *  net.minecraft.block.properties.IProperty
 *  net.minecraft.block.properties.PropertyDirection
 *  net.minecraft.block.properties.PropertyEnum
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import lavahack.client.BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$1;
import lavahack.client.QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4;
import lavahack.client.meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLever;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

public class QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0 {
    public static final QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0 Field9447 = new QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0();
    private String Field9448 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method1757(OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, EnumFacing enumFacing, boolean bl) {
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) {
            return (int)((long)760994653 ^ (long)760994653) != 0;
        }
        meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2 = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getSchematic();
        BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ = this.Method1758(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, enumFacing, bl);
        oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.setSchematic(bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ);
        Iterator iterator = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getTileEntities().iterator();
        while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.initializeTileEntity(tileEntity);
        }
        return (int)((long)-1680139710 ^ (long)-1680139709) != 0;
    }

    public BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ Method1758(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2, EnumFacing enumFacing, boolean bl) throws QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
        IBlockState iBlockState;
        IBlockState iBlockState2;
        Object object2;
        Vec3i vec3i = new Vec3i(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892());
        BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ = new BKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ(meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2889(), vec3i.getX(), vec3i.getY(), vec3i.getZ(), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2894());
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        for (Object object2 : l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3239((int)-1552296443L ^ 0xA379D605, (int)((long)-801658806 ^ (long)-801658806), (int)((long)-711994576 ^ (long)-711994576), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2891() - (int)((long)2108408939 ^ (long)2108408938), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2893() - (int)((long)-1355966578 ^ (long)-1355966577), meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2892() - ((int)-368457308L ^ 0xEA09C9A5))) {
            iBlockState2 = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2880((BlockPos)object2);
            iBlockState = this.Method1760(iBlockState2, enumFacing, bl);
            bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ.Method2881(this.Method1759((BlockPos)object2, enumFacing, vec3i, eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN), iBlockState);
        }
        List list = meYrWVonLJdF1AJ3NQoOtP0KCSTOigFU2.Method2883();
        object2 = list.iterator();
        while (object2.hasNext()) {
            iBlockState2 = (TileEntity)object2.next();
            iBlockState = iBlockState2.getPos();
            iBlockState2.setPos(new BlockPos((Vec3i)this.Method1759((BlockPos)iBlockState, enumFacing, vec3i, eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN)));
            bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ.Method2884(iBlockState2.getPos(), (TileEntity)iBlockState2);
        }
        return bKzYUfGeoLtvoku6TYBBOwJrRSbT2JJQ;
    }

    private BlockPos Method1759(BlockPos blockPos, EnumFacing enumFacing, Vec3i vec3i, EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN) throws QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
        switch (QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$1.Field10074[enumFacing.ordinal()]) {
            case 1: 
            case 2: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(blockPos.getX(), vec3i.getY() - ((int)-1193244528L ^ 0xB8E08891) - blockPos.getY(), blockPos.getZ());
            }
            case 3: 
            case 4: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(blockPos.getX(), blockPos.getY(), vec3i.getZ() - ((int)451493976L ^ 0x1AE94059) - blockPos.getZ());
            }
            case 5: 
            case 6: {
                return eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set(vec3i.getX() - ((int)-1467560454L ^ 0xA886CDFB) - blockPos.getX(), blockPos.getY(), blockPos.getZ());
            }
        }
        Object[] objectArray = new Object[(int)1530485459L ^ 0x5B395AD2];
        objectArray[(int)-1793941527L ^ 0x95129FE9] = enumFacing.getName();
        throw new QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("'%s' is not a valid axis!", objectArray);
    }

    private IBlockState Method1760(IBlockState iBlockState, EnumFacing enumFacing, boolean bl) throws QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
        IProperty iProperty = cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn.Method5239(iBlockState, "facing");
        if (iProperty instanceof PropertyDirection) {
            Comparable comparable = iBlockState.getValue(iProperty);
            if (comparable instanceof EnumFacing) {
                EnumFacing enumFacing2 = QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0.Method1761(enumFacing, (EnumFacing)comparable);
                if (iProperty.getAllowedValues().contains(enumFacing2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumFacing2);
                }
            }
        } else if (iProperty instanceof PropertyEnum) {
            if (BlockLever.EnumOrientation.class.isAssignableFrom(iProperty.getValueClass())) {
                BlockLever.EnumOrientation enumOrientation = (BlockLever.EnumOrientation)iBlockState.getValue(iProperty);
                BlockLever.EnumOrientation enumOrientation2 = QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0.Method1762(enumFacing, enumOrientation);
                if (iProperty.getAllowedValues().contains(enumOrientation2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumOrientation2);
                }
            }
        } else if (iProperty != null) {
            pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("'{}': found 'facing' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), (Object)iProperty.getClass().getSimpleName());
        }
        if (bl) return iBlockState;
        if (iProperty == null) return iBlockState;
        Object[] objectArray = new Object[((int)-1650444059L ^ 0x9DA038E4) << 1];
        objectArray[(int)((long)786325291 ^ (long)786325291)] = Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock());
        objectArray[(int)1433228071L ^ 0x556D5326] = enumFacing;
        throw new QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("'%s' cannot be flipped across '%s'", objectArray);
    }

    private static EnumFacing Method1761(EnumFacing enumFacing, EnumFacing enumFacing2) {
        if (enumFacing.getAxis() != enumFacing2.getAxis()) return enumFacing2;
        return enumFacing2.getOpposite();
    }

    private static BlockLever.EnumOrientation Method1762(EnumFacing enumFacing, BlockLever.EnumOrientation enumOrientation) {
        if (enumFacing.getAxis() != enumOrientation.getFacing().getAxis()) {
            return enumOrientation;
        }
        EnumFacing enumFacing2 = enumOrientation == BlockLever.EnumOrientation.UP_Z || enumOrientation == BlockLever.EnumOrientation.DOWN_Z ? EnumFacing.NORTH : (enumOrientation == BlockLever.EnumOrientation.UP_X || enumOrientation == BlockLever.EnumOrientation.DOWN_X ? EnumFacing.WEST : enumOrientation.getFacing());
        EnumFacing enumFacing3 = QCwR6Uh9k9HCYI7H9ruCMQfjpEziiOA0.Method1761(enumFacing, enumOrientation.getFacing());
        return BlockLever.EnumOrientation.forFacings((EnumFacing)enumFacing3, (EnumFacing)enumFacing2);
    }

    private static String Method1763(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1870135232 ^ (long)-1870135232);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1628646703L ^ 0x61132DD0);
            int n2 = (int)((long)-1806672803 ^ (long)-1806672812) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-638900370L ^ 0xD9EB2DD5) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

