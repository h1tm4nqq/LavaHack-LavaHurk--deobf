//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package com.kisman.cc.util;

import com.kisman.cc.util.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    private static Minecraft Field12669 = Minecraft.getMinecraft();
    private String Field12670 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static float[] Method4299(Entity entity) {
        return YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method5679((Entity)YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field12669.player, Field12669.getRenderPartialTicks()), vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method5679(entity, Field12669.getRenderPartialTicks()));
    }

    public static float[] Method4300(BlockPos blockPos) {
        return YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method5679((Entity)YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field12669.player, Field12669.getRenderPartialTicks()), new Vec3d((Vec3i)blockPos));
    }

    public static float[] Method4301(Entity entity) {
        return YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method5679((Entity)YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field12669.player, Field12669.getRenderPartialTicks()), vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method5679(entity, Field12669.getRenderPartialTicks()).add(new Vec3d((double)(entity.width / 2.0f), (double)(entity.getEyeHeight() / 2.0f), (double)(entity.width / 2.0f))));
    }

    public static float[] Method4302(BlockPos blockPos) {
        return YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method5679((Entity)YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field12669.player, Field12669.getRenderPartialTicks()), new Vec3d((Vec3i)blockPos).add(new Vec3d(Double.longBitsToDouble((long)174759887 ^ 0x3FE000000A6A9FCFL), 0.0, Double.longBitsToDouble((long)1127266851 ^ 0x3FE000004330BA23L))));
    }

    public static float[] Method4303(Vec3d vec3d, Vec3d vec3d2) {
        float[] fArray = new float[(int)((long)1719257555 ^ (long)1719257554) << 1];
        fArray[(int)((long)884181857 ^ (long)884181857)] = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(vec3d2.z - vec3d.z, vec3d2.x - vec3d.x)) - Double.longBitsToDouble(0xA1F713E135C03A4CL ^ 0xE1A193E135C03A4CL)));
        fArray[(int)((long)1442049032 ^ (long)1442049033)] = (float)MathHelper.wrapDegrees((double)Math.toDegrees(Math.atan2((vec3d2.y - vec3d.y) * Double.longBitsToDouble((long)139553589 ^ 0xBFF0000008516B35L), MathHelper.sqrt((double)(Math.pow(vec3d2.x - vec3d.x, Double.longBitsToDouble(0x5F31A626A4CE075L ^ 0x45F31A626A4CE075L)) + Math.pow(vec3d2.z - vec3d.z, Double.longBitsToDouble((long)1658210451 ^ 0x4000000062D64893L)))))));
        return fArray;
    }

    public static float Method4304(float f, float f2) {
        float f3;
        float f4 = Math.abs(f2 - f) % Float.intBitsToFloat(0x168EF9A ^ 0x42DCEF9A);
        if (f4 > Float.intBitsToFloat((int)((long)1772698875 ^ (long)714947835))) {
            f3 = Float.intBitsToFloat(0x1238C39E ^ 0x518CC39E) - f4;
            return f3;
        }
        f3 = f4;
        return f3;
    }
}

