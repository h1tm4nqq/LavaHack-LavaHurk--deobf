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

public class Class350
{
    public static final Class350 Field9447;
    private String Field9448 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public boolean Method1757(final Class1479 class1479, final EnumFacing enumFacing, final boolean b) {
        if (class1479 == null) {
            return false;
        }
        class1479.setSchematic((Class686)this.Method1758(class1479.getSchematic(), enumFacing, b));
        final Iterator<TileEntity> iterator = class1479.getTileEntities().iterator();
        while (iterator.hasNext()) {
            class1479.initializeTileEntity((TileEntity)iterator.next());
        }
        return true;
    }
    
    public Class1885 Method1758(final Class686 class686, final EnumFacing enumFacing, final boolean b) throws Class889 {
        final Vec3i vec3i = new Vec3i(class686.Method2891(), class686.Method2893(), class686.Method2892());
        final Class1885 class687 = new Class1885(class686.Method2889(), vec3i.getX(), vec3i.getY(), vec3i.getZ(), class686.Method2894());
        final Class16 class688 = new Class16();
        for (final Class16 class689 : Class777.Method3239(0, 0, 0, class686.Method2891() - 1, class686.Method2893() - 1, class686.Method2892() - 1)) {
            class687.Method2881(this.Method1759((BlockPos)class689, enumFacing, vec3i, class688), this.Method1760(class686.Method2880((BlockPos)class689), enumFacing, b));
        }
        for (final TileEntity tileEntity : class686.Method2883()) {
            tileEntity.setPos(new BlockPos((Vec3i)this.Method1759(tileEntity.getPos(), enumFacing, vec3i, class688)));
            class687.Method2884(tileEntity.getPos(), tileEntity);
        }
        return class687;
    }
    
    private BlockPos Method1759(final BlockPos blockPos, final EnumFacing enumFacing, final Vec3i vec3i, final Class16 class16) throws Class889 {
        switch (Class498.Field10074[enumFacing.ordinal()]) {
            case 1:
            case 2: {
                return (BlockPos)class16.set(blockPos.getX(), vec3i.getY() - 1 - blockPos.getY(), blockPos.getZ());
            }
            case 3:
            case 4: {
                return (BlockPos)class16.set(blockPos.getX(), blockPos.getY(), vec3i.getZ() - 1 - blockPos.getZ());
            }
            case 5:
            case 6: {
                return (BlockPos)class16.set(vec3i.getX() - 1 - blockPos.getX(), blockPos.getY(), blockPos.getZ());
            }
            default: {
                throw new Class889("'%s' is not a valid axis!", new Object[] { enumFacing.getName() });
            }
        }
    }
    
    private IBlockState Method1760(final IBlockState blockState, final EnumFacing enumFacing, final boolean b) throws Class889 {
        final IProperty method5239 = Class1290.Method5239(blockState, "facing");
        if (method5239 instanceof PropertyDirection) {
            final Comparable getValue = blockState.getValue(method5239);
            if (getValue instanceof EnumFacing) {
                final EnumFacing method5240 = Method1761(enumFacing, (EnumFacing)getValue);
                if (method5239.getAllowedValues().contains(method5240)) {
                    return blockState.withProperty(method5239, (Comparable)method5240);
                }
            }
        }
        else if (method5239 instanceof PropertyEnum) {
            if (BlockLever$EnumOrientation.class.isAssignableFrom(method5239.getValueClass())) {
                final BlockLever$EnumOrientation method5241 = Method1762(enumFacing, (BlockLever$EnumOrientation)blockState.getValue(method5239));
                if (method5239.getAllowedValues().contains(method5241)) {
                    return blockState.withProperty(method5239, (Comparable)method5241);
                }
            }
        }
        else if (method5239 != null) {
            Class542.Field10314.error("'{}': found 'facing' property with unknown type {}", Block.REGISTRY.getNameForObject((Object)blockState.getBlock()), (Object)method5239.getClass().getSimpleName());
        }
        if (!b && method5239 != null) {
            throw new Class889("'%s' cannot be flipped across '%s'", new Object[] { Block.REGISTRY.getNameForObject((Object)blockState.getBlock()), enumFacing });
        }
        return blockState;
    }
    
    private static EnumFacing Method1761(final EnumFacing enumFacing, final EnumFacing enumFacing2) {
        if (enumFacing.getAxis() == enumFacing2.getAxis()) {
            return enumFacing2.getOpposite();
        }
        return enumFacing2;
    }
    
    private static BlockLever$EnumOrientation Method1762(final EnumFacing enumFacing, final BlockLever$EnumOrientation blockLever$EnumOrientation) {
        if (enumFacing.getAxis() != blockLever$EnumOrientation.getFacing().getAxis()) {
            return blockLever$EnumOrientation;
        }
        EnumFacing enumFacing2;
        if (blockLever$EnumOrientation == BlockLever$EnumOrientation.UP_Z || blockLever$EnumOrientation == BlockLever$EnumOrientation.DOWN_Z) {
            enumFacing2 = EnumFacing.NORTH;
        }
        else if (blockLever$EnumOrientation == BlockLever$EnumOrientation.UP_X || blockLever$EnumOrientation == BlockLever$EnumOrientation.DOWN_X) {
            enumFacing2 = EnumFacing.WEST;
        }
        else {
            enumFacing2 = blockLever$EnumOrientation.getFacing();
        }
        return BlockLever$EnumOrientation.forFacings(Method1761(enumFacing, blockLever$EnumOrientation.getFacing()), enumFacing2);
    }
    
    static {
        Field9447 = new Class350();
    }
    
    private static String Method1763(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x55D8 ^ 0x12));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
