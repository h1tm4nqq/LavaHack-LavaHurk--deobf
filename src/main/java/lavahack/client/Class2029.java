//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import net.minecraft.client.*;
import net.minecraft.util.math.*;

public class Class2029
{
    public static final double Field17336;
    private int Field17337;
    
    public static Vec3d Method7509(final double n, final double n2, final double n3) {
        final double n4 = n / Double.longBitsToDouble((long)322714343 ^ 0x40668000133C3AE7L) * Double.longBitsToDouble((long)1039298361 ^ 0x400921FB69B64221L);
        final double a = n2 / Double.longBitsToDouble((long)830183115 ^ 0x40668000317B96CBL) * Double.longBitsToDouble((long)1557086642 ^ 0x400921FB088B6CAAL);
        return new Vec3d(n3 * Math.cos(n4) * Math.sin(a), n3 * Math.cos(a), n3 * Math.sin(n4) * Math.sin(a));
    }
    
    public static Vec3d Method7510(final Entity entity, final double n) {
        return Method7509(entity.rotationYaw + Float.intBitsToFloat(1119092736), entity.rotationPitch + Float.intBitsToFloat(1119092736), n);
    }
    
    public static Vec3d Method7511(final Entity entity, final double n, final float n2) {
        return Method7509(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * n2, entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * n2, n);
    }
    
    public static BlockPos Method7512(final Entity entity, final double n, final boolean b) {
        final Vec3d vec3d = new Vec3d(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ);
        final Vec3d method7509 = Method7509(MathHelper.normalizeAngle((int)entity.rotationYaw, 360) + 90, entity.rotationPitch + Float.intBitsToFloat(1119092736), n);
        if (!b) {
            return new BlockPos(vec3d.add(method7509));
        }
        final RayTraceResult rayTraceBlocks = Minecraft.getMinecraft().world.rayTraceBlocks(vec3d, vec3d.add(method7509));
        if (rayTraceBlocks == null) {
            return null;
        }
        return rayTraceBlocks.getBlockPos();
    }
    
    public static Entity Method7513(final Entity entity, final double n) {
        final Vec3d vec3d = new Vec3d(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ);
        final RayTraceResult rayTraceBlocks = Minecraft.getMinecraft().world.rayTraceBlocks(vec3d, vec3d.add(Method7510(entity, n)));
        if (rayTraceBlocks == null) {
            return null;
        }
        return rayTraceBlocks.entityHit;
    }
    
    public static boolean Method7514(final Entity entity, final Entity entity2, final double n) {
        if (entity2 == null) {
            return false;
        }
        final Entity method7513 = Method7513(entity, n);
        return method7513 != null && method7513.equals((Object)entity2);
    }
    
    public static double Method7515(final double n) {
        return n / Double.longBitsToDouble((long)1227380242 ^ 0x4066800049285612L) * Double.longBitsToDouble((long)287821952 ^ 0x400921FB4563FD98L);
    }
    
    public static double Method7516(final double n) {
        return n * Double.longBitsToDouble((long)1072408932 ^ 0x406680003FEBA964L) / Double.longBitsToDouble((long)1886703270 ^ 0x400921FB2430E3BEL);
    }
    
    public static double Method7517(final double a) {
        return Math.sin(a);
    }
    
    public static double Method7518(final double n) {
        return Method7516(Method7517(n));
    }
    
    public static double Method7519(final double n) {
        return Method7516(Method7517(Method7515(n)));
    }
    
    public static double Method7520(final double n) {
        return Method7517(Method7515(n));
    }
    
    static {
        Field17336 = Double.longBitsToDouble((long)326473129 ^ 0x400921FB4731B8B1L);
    }
}
