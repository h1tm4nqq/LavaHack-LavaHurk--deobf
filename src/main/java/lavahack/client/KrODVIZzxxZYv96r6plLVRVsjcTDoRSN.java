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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.KrODVIZzxxZYv96r6plLVRVsjcTDoRSN$1;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP;
import lavahack.client.vo8JGtFXaeonZQiouVGTbpILJYQDvWk4;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class KrODVIZzxxZYv96r6plLVRVsjcTDoRSN
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private static KrODVIZzxxZYv96r6plLVRVsjcTDoRSN Field11081;
    private int Field11082;

    KrODVIZzxxZYv96r6plLVRVsjcTDoRSN() {
    }

    public static KrODVIZzxxZYv96r6plLVRVsjcTDoRSN Method3023() {
        if (Field11081 != null) return Field11081;
        Field11081 = new KrODVIZzxxZYv96r6plLVRVsjcTDoRSN();
        return Field11081;
    }

    public boolean Method3024(BlockPos blockPos) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4189(blockPos);
    }

    public boolean Method3025(BlockPos blockPos, boolean bl) {
        return this.Method3026(blockPos, (boolean)((long)805860374 ^ (long)805860375), bl);
    }

    public boolean Method3026(BlockPos blockPos, boolean bl, boolean bl2) {
        return vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5948(blockPos, bl, bl2);
    }

    public boolean Method3027(BlockPos blockPos) {
        if (!this.Method3024(blockPos)) {
            return ((int)1272330281L ^ 0x4BD63829) != 0;
        }
        KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.swingArm(EnumHand.MAIN_HAND);
        KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.START_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerDigging(CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK, blockPos, EnumFacing.UP));
        return ((int)-833132802L ^ 0xCE5766FF) != 0;
    }

    public boolean Method3028(BlockPos blockPos) {
        if (!this.Method3024(blockPos)) {
            return (int)((long)-636307499 ^ (long)-636307499) != 0;
        }
        KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.swingArm(EnumHand.MAIN_HAND);
        KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.playerController.onPlayerDamageBlock(blockPos, EnumFacing.UP);
        return ((int)-481519634L ^ 0xE34C97EF) != 0;
    }

    public void Method3029(BlockPos blockPos, EnumHand enumHand) {
        RayTraceResult rayTraceResult = KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.rayTraceBlocks(new Vec3d(KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posX, KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posY + (double)KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.getEyeHeight(), KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.posZ), new Vec3d((double)blockPos.getX() + Double.longBitsToDouble(0x58BB8D141CAEAAE5L ^ 0x675B8D141CAEAAE5L), (double)blockPos.getY() - Double.longBitsToDouble((long)1797613537 ^ 0x3FE000006B2567E1L), (double)blockPos.getZ() + Double.longBitsToDouble((long)1196142220 ^ 0x3FE00000474BAE8CL)));
        EnumFacing enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
    }

    public void Method3030(BlockPos blockPos) {
        this.Method3029(blockPos, EnumHand.MAIN_HAND);
    }

    public void Method3031(EnumHand enumHand) {
        KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItem(enumHand));
    }

    public boolean Method3032(BlockPos blockPos, boolean bl) {
        return this.Method3033(blockPos, bl, EnumHand.MAIN_HAND);
    }

    public boolean Method3033(BlockPos blockPos, boolean bl, EnumHand enumHand) {
        return vo8JGtFXaeonZQiouVGTbpILJYQDvWk4.Method5949(blockPos, enumHand, bl);
    }

    public rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP Method3034(BlockPos blockPos) {
        rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP[] rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray = rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.values();
        int n = rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray.length;
        int n2 = (int)-419198712L ^ 0xE7038908;
        while (n2 < n) {
            rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2 = rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyPArray[n2];
            if (!KrODVIZzxxZYv96r6plLVRVsjcTDoRSN.ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.world.getBlockState(blockPos.add(rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2.Field16669)).getMaterial().isReplaceable()) {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2;
            }
            ++n2;
        }
        return null;
    }

    public rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP Method3035(rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2) {
        switch (KrODVIZzxxZYv96r6plLVRVsjcTDoRSN$1.Field13606[rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2.ordinal()]) {
            case 1: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16667;
            }
            case 2: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16666;
            }
            case 3: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16665;
            }
            case 4: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16668;
            }
        }
        throw new IllegalStateException("Unexpected value: " + (Object)((Object)rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2));
    }

    public rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP Method3036(rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2) {
        switch (KrODVIZzxxZYv96r6plLVRVsjcTDoRSN$1.Field13606[rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2.ordinal()]) {
            case 1: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16665;
            }
            case 4: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16666;
            }
            case 3: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16667;
            }
            case 2: {
                return rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP.Field16668;
            }
        }
        throw new IllegalStateException("Unexpected value: " + (Object)((Object)rRqNgqrYV4iwgQYhtJT9cUFicTzHDmyP2));
    }

    private static String Method3037(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2123879873 ^ (long)2123879873);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)838337884L ^ 0x31F805A3);
            int n2 = ((int)641063830L ^ 0x2635DB9D) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-235950246 ^ (long)-235947363) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

