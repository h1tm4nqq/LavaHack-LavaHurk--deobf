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
import lavahack.client.Class1290;
import lavahack.client.Class1479;
import lavahack.client.Class16;
import lavahack.client.Class1885;
import lavahack.client.Class498;
import lavahack.client.Class542;
import lavahack.client.Class686;
import lavahack.client.Class777;
import lavahack.client.Class889;
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

public class Class350 {
    public static final Class350 Field9447 = new Class350();
    private String Field9448 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public boolean Method1757(Class1479 class1479, EnumFacing enumFacing, boolean bl) {
        if (class1479 == null) {
            return false;
        }
        Class686 class686 = class1479.getSchematic();
        Class1885 class1885 = this.Method1758(class686, enumFacing, bl);
        class1479.setSchematic(class1885);
        Iterator iterator = class1479.getTileEntities().iterator();
        while (iterator.hasNext()) {
            TileEntity tileEntity = (TileEntity)iterator.next();
            class1479.initializeTileEntity(tileEntity);
        }
        return true;
    }

    public Class1885 Method1758(Class686 class686, EnumFacing enumFacing, boolean bl) throws Class889 {
        IBlockState iBlockState;
        IBlockState iBlockState2;
        Object object2;
        Vec3i vec3i = new Vec3i(class686.Method2891(), class686.Method2893(), class686.Method2892());
        Class1885 class1885 = new Class1885(class686.Method2889(), vec3i.getX(), vec3i.getY(), vec3i.getZ(), class686.Method2894());
        Class16 class16 = new Class16();
        for (Object object2 : Class777.Method3239(0, 0, 0, class686.Method2891() - 1, class686.Method2893() - 1, class686.Method2892() - 1)) {
            iBlockState2 = class686.Method2880((BlockPos)object2);
            iBlockState = this.Method1760(iBlockState2, enumFacing, bl);
            class1885.Method2881(this.Method1759((BlockPos)object2, enumFacing, vec3i, class16), iBlockState);
        }
        List list = class686.Method2883();
        object2 = list.iterator();
        while (object2.hasNext()) {
            iBlockState2 = (TileEntity)object2.next();
            iBlockState = iBlockState2.getPos();
            iBlockState2.setPos(new BlockPos((Vec3i)this.Method1759((BlockPos)iBlockState, enumFacing, vec3i, class16)));
            class1885.Method2884(iBlockState2.getPos(), (TileEntity)iBlockState2);
        }
        return class1885;
    }

    private BlockPos Method1759(BlockPos blockPos, EnumFacing enumFacing, Vec3i vec3i, Class16 class16) throws Class889 {
        switch (Class498.Field10074[enumFacing.ordinal()]) {
            case 1: 
            case 2: {
                return class16.set(blockPos.getX(), vec3i.getY() - 1 - blockPos.getY(), blockPos.getZ());
            }
            case 3: 
            case 4: {
                return class16.set(blockPos.getX(), blockPos.getY(), vec3i.getZ() - 1 - blockPos.getZ());
            }
            case 5: 
            case 6: {
                return class16.set(vec3i.getX() - 1 - blockPos.getX(), blockPos.getY(), blockPos.getZ());
            }
        }
        throw new Class889("'%s' is not a valid axis!", enumFacing.getName());
    }

    private IBlockState Method1760(IBlockState iBlockState, EnumFacing enumFacing, boolean bl) throws Class889 {
        IProperty iProperty = Class1290.Method5239(iBlockState, "facing");
        if (iProperty instanceof PropertyDirection) {
            Comparable comparable = iBlockState.getValue(iProperty);
            if (comparable instanceof EnumFacing) {
                EnumFacing enumFacing2 = Class350.Method1761(enumFacing, (EnumFacing)comparable);
                if (iProperty.getAllowedValues().contains(enumFacing2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumFacing2);
                }
            }
        } else if (iProperty instanceof PropertyEnum) {
            if (BlockLever.EnumOrientation.class.isAssignableFrom(iProperty.getValueClass())) {
                BlockLever.EnumOrientation enumOrientation = (BlockLever.EnumOrientation)iBlockState.getValue(iProperty);
                BlockLever.EnumOrientation enumOrientation2 = Class350.Method1762(enumFacing, enumOrientation);
                if (iProperty.getAllowedValues().contains(enumOrientation2)) {
                    return iBlockState.withProperty(iProperty, (Comparable)enumOrientation2);
                }
            }
        } else if (iProperty != null) {
            Class542.Field10314.error("'{}': found 'facing' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), (Object)iProperty.getClass().getSimpleName());
        }
        if (bl) return iBlockState;
        if (iProperty == null) return iBlockState;
        throw new Class889("'%s' cannot be flipped across '%s'", Block.REGISTRY.getNameForObject((Object)iBlockState.getBlock()), enumFacing);
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
        EnumFacing enumFacing3 = Class350.Method1761(enumFacing, enumOrientation.getFacing());
        return BlockLever.EnumOrientation.forFacings((EnumFacing)enumFacing3, (EnumFacing)enumFacing2);
    }

    private static String Method1763(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 18;
            cArray2[n] = (char)(cArray[n] ^ (0x55D8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

