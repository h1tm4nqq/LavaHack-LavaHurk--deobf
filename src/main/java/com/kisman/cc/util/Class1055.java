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

import com.kisman.cc.util.Class1421;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class Class1055 {
    private static Minecraft Field12669 = Minecraft.getMinecraft();
    private String Field12670 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static float[] Method4299(Entity entity) {
        return Class1055.Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Field12669.getRenderPartialTicks()), Class1421.Method5679(entity, Field12669.getRenderPartialTicks()));
    }

    public static float[] Method4300(BlockPos blockPos) {
        return Class1055.Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Field12669.getRenderPartialTicks()), new Vec3d((Vec3i)blockPos));
    }

    public static float[] Method4301(Entity entity) {
        return Class1055.Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Field12669.getRenderPartialTicks()), Class1421.Method5679(entity, Field12669.getRenderPartialTicks()).add(new Vec3d((double)(entity.width / 2.0f), (double)(entity.getEyeHeight() / 2.0f), (double)(entity.width / 2.0f))));
    }

    public static float[] Method4302(BlockPos blockPos) {
        return Class1055.Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Field12669.getRenderPartialTicks()), new Vec3d((Vec3i)blockPos).add(new Vec3d(Double.longBitsToDouble((long)174759887 ^ 0x3FE000000A6A9FCFL), 0.0, Double.longBitsToDouble((long)1127266851 ^ 0x3FE000004330BA23L))));
    }

    public static float[] Method4303(Vec3d vec3d, Vec3d vec3d2) {
        return new float[]{(float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(vec3d2.z - vec3d.z, vec3d2.x - vec3d.x)) - Double.longBitsToDouble(4636033603912859648L))), (float)MathHelper.wrapDegrees((double)Math.toDegrees(Math.atan2((vec3d2.y - vec3d.y) * Double.longBitsToDouble((long)139553589 ^ 0xBFF0000008516B35L), MathHelper.sqrt((double)(Math.pow(vec3d2.x - vec3d.x, Double.longBitsToDouble(0x4000000000000000L)) + Math.pow(vec3d2.z - vec3d.z, Double.longBitsToDouble((long)1658210451 ^ 0x4000000062D64893L)))))))};
    }

    public static float Method4304(float f, float f2) {
        float f3;
        float f4 = Math.abs(f2 - f) % Float.intBitsToFloat(1135869952);
        if (f4 > Float.intBitsToFloat(0x43340000)) {
            f3 = Float.intBitsToFloat(1135869952) - f4;
            return f3;
        }
        f3 = f4;
        return f3;
    }
}

