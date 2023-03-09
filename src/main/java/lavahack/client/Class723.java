//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayerDigging
 *  net.minecraft.network.play.client.CPacketPlayerDigging$Action
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItem
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import lavahack.client.Class1036;
import lavahack.client.Class1235;
import lavahack.client.Class1486;
import lavahack.client.Class1879;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class Class723
implements Class2142 {
    private static Class723 Field11081;
    private int Field11082;

    Class723() {
    }

    public static Class723 Method3023() {
        if (Field11081 != null) return Field11081;
        Field11081 = new Class723();
        return Field11081;
    }

    public boolean Method3024(BlockPos blockPos) {
        return Class1036.Method4189(blockPos);
    }

    public boolean Method3025(BlockPos blockPos, boolean bl) {
        return this.Method3026(blockPos, true, bl);
    }

    public boolean Method3026(BlockPos blockPos, boolean bl, boolean bl2) {
        return Class1486.Method5948(blockPos, bl, bl2);
    }

    public boolean Method3027(BlockPos blockPos) {
        if (!this.Method3024(blockPos)) {
            return false;
        }
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.swingArm(EnumHand.MAIN_HAND);
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        return true;
    }

    public boolean Method3028(BlockPos blockPos) {
        if (!this.Method3024(blockPos)) {
            return false;
        }
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.swingArm(EnumHand.MAIN_HAND);
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.playerController.onPlayerDamageBlock(blockPos, EnumFacing.UP);
        return true;
    }

    public void Method3029(BlockPos blockPos, EnumHand enumHand) {
        RayTraceResult rayTraceResult = Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.rayTraceBlocks(new Vec3d(Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posX, Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posY + (double)Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.getEyeHeight(), Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(4602678819172646912L), (double)blockPos.getY() - Double.longBitsToDouble((long)1797613537 ^ 0x3FE000006B2567E1L), (double)blockPos.getZ() + Double.longBitsToDouble((long)1196142220 ^ 0x3FE00000474BAE8CL)));
        EnumFacing enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
    }

    public void Method3030(BlockPos blockPos) {
        this.Method3029(blockPos, EnumHand.MAIN_HAND);
    }

    public void Method3031(EnumHand enumHand) {
        Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(enumHand));
    }

    public boolean Method3032(BlockPos blockPos, boolean bl) {
        return this.Method3033(blockPos, bl, EnumHand.MAIN_HAND);
    }

    public boolean Method3033(BlockPos blockPos, boolean bl, EnumHand enumHand) {
        return Class1486.Method5949(blockPos, enumHand, bl);
    }

    public Class1879 Method3034(BlockPos blockPos) {
        Class1879[] class1879Array = Class1879.values();
        int n = class1879Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class1879 class1879 = class1879Array[n2];
            if (!Class723.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(blockPos.add(class1879.Field16669)).getMaterial().isReplaceable()) {
                return class1879;
            }
            ++n2;
        }
        return null;
    }

    public Class1879 Method3035(Class1879 class1879) {
        switch (Class1235.Field13606[class1879.ordinal()]) {
            case 1: {
                return Class1879.Field16667;
            }
            case 2: {
                return Class1879.Field16666;
            }
            case 3: {
                return Class1879.Field16665;
            }
            case 4: {
                return Class1879.Field16668;
            }
        }
        throw new IllegalStateException("Unexpected value: " + (Object)((Object)class1879));
    }

    public Class1879 Method3036(Class1879 class1879) {
        switch (Class1235.Field13606[class1879.ordinal()]) {
            case 1: {
                return Class1879.Field16665;
            }
            case 4: {
                return Class1879.Field16666;
            }
            case 3: {
                return Class1879.Field16667;
            }
            case 2: {
                return Class1879.Field16668;
            }
        }
        throw new IllegalStateException("Unexpected value: " + (Object)((Object)class1879));
    }

    private static String Method3037(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 176;
            cArray2[n] = (char)(cArray[n] ^ (0x15C7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

