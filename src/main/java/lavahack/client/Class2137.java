//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.init.*;
import java.util.stream.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.item.*;
import java.util.*;

public class Class2137 extends Class42
{
    private final Class44 Field17778;
    private final Class44 Field17779;
    private final Class1303 Field17780;
    private final Class44 Field17781;
    private final Class44 Field17782;
    private final Class44 Field17783;
    private int Field17784;
    
    public Class2137() {
        super("Prison", Class97.Field8338);
        this.Field17778 = this.Method23(new Class44("TargetRange", this, Double.longBitsToDouble((long)1076481174 ^ 0x402000004029CC96L), 1.0, Double.longBitsToDouble((long)686123915 ^ 0x402E000028E56B8BL), false));
        this.Field17779 = this.Method23(new Class44("PlaceRange", this, Double.longBitsToDouble((long)1772492622 ^ 0x4016000069A6174EL), 1.0, Double.longBitsToDouble((long)1442454976 ^ 0x4018000055FA1DC0L), false));
        this.Field17780 = new Class1303("Switch", (Class42)this, (Enum)Class711.Field11028).Method5303();
        this.Field17781 = this.Method23(new Class44("Support", this, true));
        this.Field17782 = this.Method23(new Class44("Rotate", this, false));
        this.Field17783 = this.Method23(new Class44("Packet", this, false));
    }
    
    @Override
    public void Method45() {
        if (Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final EntityPlayer method1924 = Class394.Method1924(this.Field17778.Method368());
        if (method1924 == null) {
            return;
        }
        final int method1925 = Class9.Method127(Blocks.OBSIDIAN);
        if (method1925 == -1) {
            return;
        }
        final int currentItem = Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        final BlockPos blockPos = new BlockPos(method1924.posX, method1924.posY, method1924.posZ);
        final BlockPos blockPos2 = new BlockPos(method1924.posX + method1924.motionX, method1924.posY, method1924.posZ + method1924.motionZ);
        if (blockPos2.equals((Object)blockPos)) {
            return;
        }
        final EnumFacing enumFacing = Stream.of(EnumFacing.HORIZONTALS).filter(Class2137::Method7709).findFirst().orElse(null);
        if (enumFacing == null) {
            return;
        }
        final List method1926 = this.Method7707(method1924, enumFacing);
        if (Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)method1926.get(0)).getBlock().isReplaceable((IBlockAccess)Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)method1926.get(0)) && Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState((BlockPos)method1926.get(1)).getBlock().isReplaceable((IBlockAccess)Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, (BlockPos)method1926.get(1))) {
            return;
        }
        final BlockPos down = blockPos.offset(enumFacing).down();
        if (this.Field17781.Method365() && Class1036.Method4213(down).isEmpty()) {
            method1926.add(0, down);
        }
        for (final BlockPos blockPos3 : method1926) {
            if (!Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getBlock().isReplaceable((IBlockAccess)Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos3)) {
                continue;
            }
            if (this.Method7706(blockPos3)) {
                continue;
            }
            if (Math.sqrt(Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(blockPos3)) > this.Field17779.Method367()) {
                continue;
            }
            ((Class711)this.Field17780.Method341()).Method2972().Method1726(new Object[] { method1925, false });
            Class1036.Method4208(blockPos3, EnumHand.MAIN_HAND, this.Field17782.Method365(), this.Field17783.Method365());
            ((Class711)this.Field17780.Method341()).Method2972().Method1726(new Object[] { currentItem, true });
        }
    }
    
    private boolean Method7706(final BlockPos blockPos) {
        for (final Entity entity : Class2137.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB((Class)Entity.class, new AxisAlignedBB(blockPos))) {
            if (!(entity instanceof EntityItem)) {
                if (entity instanceof EntityXPOrb) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    private List Method7707(final EntityPlayer entityPlayer, final EnumFacing enumFacing) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final BlockPos offset = new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ).offset(enumFacing);
        list.add(offset);
        list.add(offset.up());
        list.add(offset.up(2));
        return list;
    }
    
    private Class1865 Method7708(final EntityPlayer entityPlayer) {
        final double floor = Math.floor(entityPlayer.posX);
        final double floor2 = Math.floor(entityPlayer.posZ);
        final double a = entityPlayer.posX - floor;
        final double a2 = entityPlayer.posZ - floor2;
        final double b = 1.0 - a;
        final double b2 = 1.0 - a2;
        final double min = Math.min(Math.min(a, b), Math.min(a2, b2));
        if (min == a) {
            return new Class1865(EnumFacing.WEST, a);
        }
        if (min == a2) {
            return new Class1865(EnumFacing.NORTH, a2);
        }
        if (min == b) {
            return new Class1865(EnumFacing.EAST, b);
        }
        if (min == b2) {
            return new Class1865(EnumFacing.SOUTH, b2);
        }
        return null;
    }
    
    private static boolean Method7709(final BlockPos blockPos, final BlockPos blockPos2, final EnumFacing enumFacing) {
        return blockPos.offset(enumFacing).equals((Object)blockPos2);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x54D8 ^ 0xDF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
