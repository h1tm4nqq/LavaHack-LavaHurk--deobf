//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class MPDCCvkF3qJIgU5Mi7zfayTfjefx878y {
    public static final double Field17336 = Double.longBitsToDouble((long)326473129 ^ 0x400921FB4731B8B1L);
    private int Field17337;

    public static Vec3d Method7509(double d, double d2, double d3) {
        double d4 = d / Double.longBitsToDouble((long)322714343 ^ 0x40668000133C3AE7L) * Double.longBitsToDouble((long)1039298361 ^ 0x400921FB69B64221L);
        double d5 = d2 / Double.longBitsToDouble((long)830183115 ^ 0x40668000317B96CBL) * Double.longBitsToDouble((long)1557086642 ^ 0x400921FB088B6CAAL);
        double d6 = d3 * Math.cos(d4) * Math.sin(d5);
        double d7 = d3 * Math.cos(d5);
        double d8 = d3 * Math.sin(d4) * Math.sin(d5);
        return new Vec3d(d6, d7, d8);
    }

    public static Vec3d Method7510(Entity entity, double d) {
        return MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7509(entity.rotationYaw + Float.intBitsToFloat((int)((long)454846791 ^ (long)1504209223)), entity.rotationPitch + Float.intBitsToFloat((int)((long)1990661059 ^ (long)873665475)), d);
    }

    public static Vec3d Method7511(Entity entity, double d, float f) {
        return MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7509(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * f, entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * f, d);
    }

    public static BlockPos Method7512(Entity entity, double d, boolean bl) {
        Vec3d vec3d = new Vec3d(entity.posX, entity.posY + (double)entity.getEyeHeight(), entity.posZ);
        Vec3d vec3d2 = MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7509(MathHelper.normalizeAngle((int)((int)entity.rotationYaw), (int)(((int)215144280L ^ 0xCD2D775) << 3)) + ((int)((long)-1736569571 ^ (long)-1736569552) << 1), entity.rotationPitch + Float.intBitsToFloat((int)1222443297L ^ 0xA690121), d);
        if (!bl) return new BlockPos(vec3d.add(vec3d2));
        RayTraceResult rayTraceResult = Minecraft.getMinecraft().world.rayTraceBlocks(vec3d, vec3d.add(vec3d2));
        if (rayTraceResult != null) return rayTraceResult.getBlockPos();
        return null;
    }

    public static Entity Method7513(Entity entity, double d) {
        Vec3d vec3d;
        Vec3d vec3d2 = new Vec3d(entity.posX, entity.posY + (double)entity.getEyeHeight(), entity.posZ);
        RayTraceResult rayTraceResult = Minecraft.getMinecraft().world.rayTraceBlocks(vec3d2, vec3d2.add(vec3d = MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7510(entity, d)));
        if (rayTraceResult != null) return rayTraceResult.entityHit;
        return null;
    }

    public static boolean Method7514(Entity entity, Entity entity2, double d) {
        if (entity2 == null) {
            return ((int)1754850676L ^ 0x6898E574) != 0;
        }
        Entity entity3 = MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7513(entity, d);
        if (entity3 != null) return entity3.equals((Object)entity2);
        return ((int)838081418L ^ 0x31F41B8A) != 0;
    }

    public static double Method7515(double d) {
        return d / Double.longBitsToDouble((long)1227380242 ^ 0x4066800049285612L) * Double.longBitsToDouble((long)287821952 ^ 0x400921FB4563FD98L);
    }

    public static double Method7516(double d) {
        return d * Double.longBitsToDouble((long)1072408932 ^ 0x406680003FEBA964L) / Double.longBitsToDouble((long)1886703270 ^ 0x400921FB2430E3BEL);
    }

    public static double Method7517(double d) {
        return Math.sin(d);
    }

    public static double Method7518(double d) {
        return MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7516(MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7517(d));
    }

    public static double Method7519(double d) {
        return MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7516(MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7517(MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7515(d)));
    }

    public static double Method7520(double d) {
        return MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7517(MPDCCvkF3qJIgU5Mi7zfayTfjefx878y.Method7515(d));
    }
}

