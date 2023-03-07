//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.MPDCCvkF3qJIgU5Mi7zfayTfjefx878y;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;

public class qaayUdHXqSvip5Ilv7RNQw6nEooL50vx
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13583 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Distance", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)647687634 ^ 0x40100000269AEDD2L), 1.0, Double.longBitsToDouble((long)1225636607 ^ 0x40240000490DBAFFL), (boolean)((long)1226891254 ^ (long)1226891254)));
    private int Field13584;

    public qaayUdHXqSvip5Ilv7RNQw6nEooL50vx() {
        super("Triangulation", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        if (qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("yaw: " + qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + " pitch: " + qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch);
        Vec3d vec3d = h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4206();
        Vec3d vec3d2 = MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7509(qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch, qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, this.Field13583.Method367());
        RayTraceResult rayTraceResult = qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, vec3d.add(vec3d2));
        if (rayTraceResult == null) {
            return;
        }
        BlockPos blockPos = rayTraceResult.getBlockPos();
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5506().Method1886("x: " + blockPos.getX() + " y: " + blockPos.getY() + " z: " + blockPos.getZ());
        this.Method22();
    }

    private RayTraceResult Method4947(double d, double d2, double d3) {
        double d4 = d2 / Double.longBitsToDouble(0x6070637EBDA65093L ^ 0x2016E37EBDA65093L) * Double.longBitsToDouble(0xA109DCD3663796D3L ^ 0xE100FD283273BBCBL);
        double d5 = d / Double.longBitsToDouble(0x2E65DD162E5D76F2L ^ 0x6E035D162E5D76F2L) * Double.longBitsToDouble(0x4573251A4DDE65DFL ^ 0x57A04E1199A48C7L);
        double d6 = Math.cos(d4) * Math.sin(d5) * d3;
        double d7 = Math.cos(d5) * d3;
        double d8 = Math.sin(d4) * Math.sin(d5) * d3;
        Vec3d vec3d = new Vec3d(qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.eyeHeight, qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        Vec3d vec3d2 = vec3d.add(d6, d7, d8);
        return qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, vec3d2);
    }

    public void Method4948(RenderWorldLastEvent renderWorldLastEvent) {
        Vec3d vec3d;
        if (qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Vec3d vec3d2 = qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionEyes(renderWorldLastEvent.getPartialTicks());
        RayTraceResult rayTraceResult = qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d2, vec3d2.add(vec3d = MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7509(qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch, qaayUdHXqSvip5Ilv7RNQw6nEooL50vx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, this.Field13583.Method367())));
        if (rayTraceResult == null) {
            return;
        }
        BlockPos blockPos = rayTraceResult.getBlockPos();
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3446(exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3447(new AxisAlignedBB(blockPos)), 2.0f, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1412095257 ^ (long)-1412095464), (int)((long)-1855665112 ^ (long)-1855664937), (int)530288775L ^ 0x1F9B9078, ((int)-358889711L ^ 0xEA9BC71E) << 3), exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486, exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17214);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)771095295 ^ (long)771095295);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1479166776L ^ 0x582A4BC7);
            int n2 = (int)((long)-349662876 ^ (long)-349662889) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1324630298L ^ 0xB10BD189 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

