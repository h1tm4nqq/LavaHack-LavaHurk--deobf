//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.math.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.util.*;

public class Class220 extends Class42
{
    private Vec3d Field8957;
    private int Field8958;
    
    public Class220() {
        super("ScaffoldTest", Class97.Field8345);
    }
    
    @Override
    public void Method38() {
        if (Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        this.Field8957 = new Vec3d(Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }
    
    @Override
    public void Method39() {
        this.Field8957 = null;
    }
    
    @Override
    public void Method45() {
        if (Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final BlockPos down = new BlockPos(Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down();
        final BlockPos down2 = new BlockPos(Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ).down();
        final LinkedList<BlockPos> list = new LinkedList<BlockPos>();
        if (this.Method1268(down, down2)) {
            Class1393.Method5505().Method1886("Unconnected");
            this.Method1269(down, down2, list);
        }
        list.add(down2);
        for (final BlockPos blockPos : list) {
            if (!Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) {
                continue;
            }
            Class1036.Method4208(blockPos, EnumHand.MAIN_HAND, false, false);
        }
    }
    
    public boolean Method1268(final BlockPos blockPos, final BlockPos blockPos2) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        list.add(blockPos.north());
        list.add(blockPos.east());
        list.add(blockPos.south());
        list.add(blockPos.west());
        return !list.contains(blockPos2);
    }
    
    public void Method1269(final BlockPos blockPos, final BlockPos blockPos2, final Queue queue) {
        final Class574 method1270 = this.Method1270(blockPos, blockPos2);
        Class1393.Method5505().Method1886(((EnumFacing)method1270.Method2522()).toString() + " / " + ((EnumFacing)method1270.Method2523()).toString());
        final BlockPos offset = blockPos.offset((EnumFacing)method1270.Method2522());
        final BlockPos offset2 = blockPos.offset((EnumFacing)method1270.Method2523());
        if (Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(offset.getX() + Double.longBitsToDouble(4602678819172646912L), (double)offset.getY(), offset.getZ() + Double.longBitsToDouble(4602678819172646912L)) < Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq(offset2.getX() + Double.longBitsToDouble(4602678819172646912L), (double)offset2.getY(), offset2.getZ() + Double.longBitsToDouble(4602678819172646912L))) {
            queue.add(offset);
        }
        else {
            queue.add(offset2);
        }
        if (blockPos.getY() < blockPos2.getY()) {
            queue.add(blockPos2.down());
        }
    }
    
    private Class574 Method1270(final BlockPos blockPos, final BlockPos blockPos2) {
        final ArrayList<EnumFacing> list = new ArrayList<EnumFacing>();
        if (blockPos.getX() < blockPos2.getX()) {
            list.add(EnumFacing.EAST);
        }
        else {
            list.add(EnumFacing.WEST);
        }
        if (blockPos.getZ() < blockPos2.getZ()) {
            list.add(EnumFacing.SOUTH);
        }
        else {
            list.add(EnumFacing.NORTH);
        }
        return new Class574(list.get(0), list.get(1));
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5239 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
