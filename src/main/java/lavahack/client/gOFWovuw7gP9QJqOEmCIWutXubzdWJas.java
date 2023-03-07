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
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;

public class gOFWovuw7gP9QJqOEmCIWutXubzdWJas
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private Vec3d Field8957;
    private int Field8958;

    public gOFWovuw7gP9QJqOEmCIWutXubzdWJas() {
        super("ScaffoldTest", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        if (gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field8957 = new Vec3d(gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
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
        if (gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        BlockPos blockPos = new BlockPos(gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ).down();
        BlockPos blockPos2 = new BlockPos(gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX + gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX, gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ + gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ).down();
        LinkedList<BlockPos> linkedList = new LinkedList<BlockPos>();
        if (this.Method1268(blockPos, blockPos2)) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Unconnected");
            this.Method1269(blockPos, blockPos2, linkedList);
        }
        linkedList.add(blockPos2);
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos3 = (BlockPos)iterator.next();
            if (!gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos3).getBlock().isReplaceable((IBlockAccess)gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos3)) continue;
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos3, EnumHand.MAIN_HAND, ((int)1065393275L ^ 0x3F809C7B) != 0, ((int)455366007L ^ 0x1B245577) != 0);
        }
    }

    public boolean Method1268(BlockPos blockPos, BlockPos blockPos2) {
        boolean bl;
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(blockPos.north());
        arrayList.add(blockPos.east());
        arrayList.add(blockPos.south());
        arrayList.add(blockPos.west());
        if (!arrayList.contains(blockPos2)) {
            bl = (int)1851083279L ^ 0x6E554A0E;
            return bl;
        }
        bl = (int)2094931589L ^ 0x7CDE1E85;
        return bl;
    }

    public void Method1269(BlockPos blockPos, BlockPos blockPos2, Queue queue) {
        Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq = this.Method1270(blockPos, blockPos2);
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886(((EnumFacing)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522()).toString() + " / " + ((EnumFacing)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2523()).toString());
        BlockPos blockPos3 = blockPos.offset((EnumFacing)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2522());
        BlockPos blockPos4 = blockPos.offset((EnumFacing)ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq.Method2523());
        if (gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)blockPos3.getX() + Double.longBitsToDouble(0xF7BDFB37917933BFL ^ 0xC85DFB37917933BFL), (double)blockPos3.getY(), (double)blockPos3.getZ() + Double.longBitsToDouble(0x8DB1426BD7E72077L ^ 0xB251426BD7E72077L)) < gOFWovuw7gP9QJqOEmCIWutXubzdWJas.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistanceSq((double)blockPos4.getX() + Double.longBitsToDouble(0xBFBEBF97A9E2F28EL ^ 0x805EBF97A9E2F28EL), (double)blockPos4.getY(), (double)blockPos4.getZ() + Double.longBitsToDouble(0x58FDED7011ED0276L ^ 0x671DED7011ED0276L))) {
            queue.add(blockPos3);
        } else {
            queue.add(blockPos4);
        }
        if (blockPos.getY() >= blockPos2.getY()) return;
        queue.add(blockPos2.down());
    }

    private Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq Method1270(BlockPos blockPos, BlockPos blockPos2) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        if (blockPos.getX() < blockPos2.getX()) {
            arrayList.add(EnumFacing.EAST);
        } else {
            arrayList.add(EnumFacing.WEST);
        }
        if (blockPos.getZ() < blockPos2.getZ()) {
            arrayList.add(EnumFacing.SOUTH);
            return new Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq(arrayList.get((int)-202637608L ^ 0xF3EBFED8), arrayList.get((int)((long)-1561273111 ^ (long)-1561273112)));
        }
        arrayList.add(EnumFacing.NORTH);
        return new Ow1VRXfaI2S6IUO087Eotcj6rdiRz7tq(arrayList.get((int)-202637608L ^ 0xF3EBFED8), arrayList.get((int)((long)-1561273111 ^ (long)-1561273112)));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-844999210 ^ (long)-844999210);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1585180795L ^ 0xA1840F7A);
            int n2 = (int)((long)885819640 ^ (long)885819579) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)777024036L ^ 0x2E50201D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

