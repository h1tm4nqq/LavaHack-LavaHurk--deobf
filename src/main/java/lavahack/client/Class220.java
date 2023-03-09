//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import lavahack.client.Class1036;
import lavahack.client.Class1393;
import lavahack.client.Class42;
import lavahack.client.Class574;
import lavahack.client.Class97;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

public class Class220
extends Class42 {
    private Vec3d Field8957;
    private int Field8958;

    public Class220() {
        super("ScaffoldTest", Class97.Field8345);
    }

    @Override
    public void Method38() {
        if (Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field8957 = new Vec3d(Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
            return;
        }
        this.Method22();
    }

    @Override
    public void Method39() {
        this.Field8957 = null;
    }

    @Override
    public void Method45() {
        if (Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        BlockPos blockPos = new BlockPos(Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down();
        BlockPos blockPos2 = new BlockPos(Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ).down();
        LinkedList<BlockPos> linkedList = new LinkedList<BlockPos>();
        if (this.Method1268(blockPos, blockPos2)) {
            Class1393.Method5505().Method1886("Unconnected");
            this.Method1269(blockPos, blockPos2, linkedList);
        }
        linkedList.add(blockPos2);
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos3 = (BlockPos)iterator.next();
            if (!Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getBlock().isReplaceable((IBlockAccess)Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos3)) continue;
            Class1036.Method4208(blockPos3, EnumHand.MAIN_HAND, false, false);
        }
    }

    public boolean Method1268(BlockPos blockPos, BlockPos blockPos2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(blockPos.north());
        arrayList.add(blockPos.east());
        arrayList.add(blockPos.south());
        arrayList.add(blockPos.west());
        if (arrayList.contains(blockPos2)) return false;
        return true;
    }

    public void Method1269(BlockPos blockPos, BlockPos blockPos2, Queue queue) {
        Class574 class574 = this.Method1270(blockPos, blockPos2);
        Class1393.Method5505().Method1886(((EnumFacing)class574.Method2522()).toString() + " / " + ((EnumFacing)class574.Method2523()).toString());
        BlockPos blockPos3 = blockPos.offset((EnumFacing)class574.Method2522());
        BlockPos blockPos4 = blockPos.offset((EnumFacing)class574.Method2523());
        if (Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)blockPos3.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos3.getY(), (double)blockPos3.getZ() + Double.longBitsToDouble(4602678819172646912L)) < Class220.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)blockPos4.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble(4602678819172646912L))) {
            queue.add(blockPos3);
        } else {
            queue.add(blockPos4);
        }
        if (blockPos.getY() >= blockPos2.getY()) return;
        queue.add(blockPos2.down());
    }

    private Class574 Method1270(BlockPos blockPos, BlockPos blockPos2) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        if (blockPos.getX() < blockPos2.getX()) {
            arrayList.add(EnumFacing.EAST);
        } else {
            arrayList.add(EnumFacing.WEST);
        }
        if (blockPos.getZ() < blockPos2.getZ()) {
            arrayList.add(EnumFacing.SOUTH);
            return new Class574(arrayList.get(0), arrayList.get(1));
        }
        arrayList.add(EnumFacing.NORTH);
        return new Class574(arrayList.get(0), arrayList.get(1));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 134;
            cArray2[n] = (char)(cArray[n] ^ (0x5239 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

