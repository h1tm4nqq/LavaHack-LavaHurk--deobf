//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;

public class Class1055
{
    private static Minecraft Field12669;
    private String Field12670 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static float[] Method4299(final Entity entity) {
        return Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Class1055.Field12669.getRenderPartialTicks()), Class1421.Method5679(entity, Class1055.Field12669.getRenderPartialTicks()));
    }
    
    public static float[] Method4300(final BlockPos blockPos) {
        return Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Class1055.Field12669.getRenderPartialTicks()), new Vec3d((Vec3i)blockPos));
    }
    
    public static float[] Method4301(final Entity entity) {
        return Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Class1055.Field12669.getRenderPartialTicks()), Class1421.Method5679(entity, Class1055.Field12669.getRenderPartialTicks()).add(new Vec3d((double)(entity.width / 2.0f), (double)(entity.getEyeHeight() / 2.0f), (double)(entity.width / 2.0f))));
    }
    
    public static float[] Method4302(final BlockPos blockPos) {
        return Method4303(Class1421.Method5679((Entity)Class1055.Field12669.player, Class1055.Field12669.getRenderPartialTicks()), new Vec3d((Vec3i)blockPos).add(new Vec3d(Double.longBitsToDouble((long)174759887 ^ 0x3FE000000A6A9FCFL), 0.0, Double.longBitsToDouble((long)1127266851 ^ 0x3FE000004330BA23L))));
    }
    
    public static float[] Method4303(final Vec3d vec3d, final Vec3d vec3d2) {
        return new float[] { (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(vec3d2.z - vec3d.z, vec3d2.x - vec3d.x)) - Double.longBitsToDouble(4636033603912859648L)), (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2((vec3d2.y - vec3d.y) * Double.longBitsToDouble((long)139553589 ^ 0xBFF0000008516B35L), MathHelper.sqrt(Math.pow(vec3d2.x - vec3d.x, Double.longBitsToDouble(4611686018427387904L)) + Math.pow(vec3d2.z - vec3d.z, Double.longBitsToDouble((long)1658210451 ^ 0x4000000062D64893L)))))) };
    }
    
    public static float Method4304(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % Float.intBitsToFloat(1135869952);
        return (n3 > Float.intBitsToFloat(1127481344)) ? (Float.intBitsToFloat(1135869952) - n3) : n3;
    }
    
    static {
        Class1055.Field12669 = Minecraft.getMinecraft();
    }
}
