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

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1036;
import lavahack.client.Class1393;
import lavahack.client.Class2008;
import lavahack.client.Class2029;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import lavahack.client.Class97;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;

public class Class1229
extends Class42 {
    private final Class44 Field13583 = this.Method23(new Class44("Distance", (Class42)this, Double.longBitsToDouble((long)647687634 ^ 0x40100000269AEDD2L), 1.0, Double.longBitsToDouble((long)1225636607 ^ 0x40240000490DBAFFL), false));
    private int Field13584;

    public Class1229() {
        super("Triangulation", Class97.Field8345);
    }

    @Override
    public void Method38() {
        if (Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        Class1393.Method5506().Method1886("yaw: " + Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw + " pitch: " + Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch);
        Vec3d vec3d = Class1036.Method4206();
        Vec3d vec3d2 = Class2029.Method7509(Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, this.Field13583.Method367());
        RayTraceResult rayTraceResult = Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, vec3d.add(vec3d2));
        if (rayTraceResult == null) {
            return;
        }
        BlockPos blockPos = rayTraceResult.getBlockPos();
        Class1393.Method5506().Method1886("x: " + blockPos.getX() + " y: " + blockPos.getY() + " z: " + blockPos.getZ());
        this.Method22();
    }

    private RayTraceResult Method4947(double d, double d2, double d3) {
        double d4 = d2 / Double.longBitsToDouble(4640537203540230144L) * Double.longBitsToDouble(4614256656552045848L);
        double d5 = d / Double.longBitsToDouble(4640537203540230144L) * Double.longBitsToDouble(4614256656552045848L);
        double d6 = Math.cos(d4) * Math.sin(d5) * d3;
        double d7 = Math.cos(d5) * d3;
        double d8 = Math.sin(d4) * Math.sin(d5) * d3;
        Vec3d vec3d = new Vec3d(Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY + (double)Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.eyeHeight, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        Vec3d vec3d2 = vec3d.add(d6, d7, d8);
        return Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d, vec3d2);
    }

    public void Method4948(RenderWorldLastEvent renderWorldLastEvent) {
        Vec3d vec3d;
        if (Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        if (!this.Method35()) {
            return;
        }
        Vec3d vec3d2 = Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getPositionEyes(renderWorldLastEvent.getPartialTicks());
        RayTraceResult rayTraceResult = Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.rayTraceBlocks(vec3d2, vec3d2.add(vec3d = Class2029.Method7509(Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationPitch, Class1229.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.rotationYaw, this.Field13583.Method367())));
        if (rayTraceResult == null) {
            return;
        }
        BlockPos blockPos = rayTraceResult.getBlockPos();
        Class815.Method3446(Class815.Method3447(new AxisAlignedBB(blockPos)), 2.0f, new Class2027(255, 255, 255, 120), Class815.Field11486, Class2008.Field17214);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 102;
            cArray2[n] = (char)(cArray[n] ^ (0x6F6F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

