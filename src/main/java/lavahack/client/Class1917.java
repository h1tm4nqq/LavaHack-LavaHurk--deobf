//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.MobEffects
 *  net.minecraft.potion.Potion
 *  net.minecraft.util.MovementInput
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import java.util.Objects;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.AxisAlignedBB;

public class Class1917 {
    public static final double Field16907;
    public static final double Field16908;
    public static Minecraft Field16909;
    private String Field16910 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static double Method7146(boolean bl) {
        double d = bl ? Double.longBitsToDouble(4601237667291888353L) : Double.longBitsToDouble(4600868372122443973L);
        if (!Class1917.Field16909.player.isPotionActive(MobEffects.JUMP_BOOST)) return d;
        d += (double)(Class1917.Field16909.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + 1) * Double.longBitsToDouble(4591870180066957722L);
        return d;
    }

    public static void Method7147(double d) {
        double d2 = Class1917.Field16909.player.movementInput.moveForward;
        double d3 = Class1917.Field16909.player.movementInput.moveStrafe;
        float f = Class1917.Field16909.player.rotationYaw;
        if (d2 == 0.0 && d3 == 0.0) {
            Class1917.Field16909.player.motionX = 0.0;
            Class1917.Field16909.player.motionZ = 0.0;
            return;
        }
        if (d2 != 0.0) {
            if (d3 > 0.0) {
                f += (float)(d2 > 0.0 ? -45 : 45);
            } else if (d3 < 0.0) {
                f += (float)(d2 > 0.0 ? 45 : -45);
            }
            d3 = 0.0;
            if (d2 > 0.0) {
                d2 = 1.0;
            } else if (d2 < 0.0) {
                d2 = Double.longBitsToDouble((long)439943521 ^ 0xBFF000001A390161L);
            }
        }
        Class1917.Field16909.player.motionX = d2 * d * Math.cos(Math.toRadians(f + Float.intBitsToFloat(1119092736))) + d3 * d * Math.sin(Math.toRadians(f + Float.intBitsToFloat(1119092736)));
        Class1917.Field16909.player.motionZ = d2 * d * Math.sin(Math.toRadians(f + Float.intBitsToFloat(1119092736))) - d3 * d * Math.cos(Math.toRadians(f + Float.intBitsToFloat(1119092736)));
    }

    public static float Method7148() {
        float f = Class1917.Field16909.player.rotationYaw;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            f += Float.intBitsToFloat(0x43340000);
        }
        float f2 = 1.0f;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            f2 = Float.intBitsToFloat(-1090519040);
        } else if (Class1917.Field16909.player.moveForward > 0.0f) {
            f2 = Float.intBitsToFloat(0x3F000000);
        }
        if (Class1917.Field16909.player.moveStrafing > 0.0f) {
            f -= Float.intBitsToFloat(1119092736) * f2;
        }
        if (!(Class1917.Field16909.player.moveStrafing < 0.0f)) return f *= Float.intBitsToFloat(1016003125);
        f += Float.intBitsToFloat(1119092736) * f2;
        return f *= Float.intBitsToFloat(1016003125);
    }

    public static double Method7149(EntityPlayer entityPlayer) {
        return Math.abs(entityPlayer.motionX) + Math.abs(entityPlayer.motionZ);
    }

    public static double[] Method7150(double d) {
        float f = Minecraft.getMinecraft().player.movementInput.moveForward;
        float f2 = Minecraft.getMinecraft().player.movementInput.moveStrafe;
        float f3 = Minecraft.getMinecraft().player.prevRotationYaw + (Minecraft.getMinecraft().player.rotationYaw - Minecraft.getMinecraft().player.prevRotationYaw) * Minecraft.getMinecraft().getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? -45 : 45);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? 45 : -45);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat(-1082130432);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat(1119092736)));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        return new double[]{d4, d5};
    }

    public static boolean Method7151() {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(Class1917.Field16909.player.posX - Double.longBitsToDouble(0x3FD3333333333333L), Class1917.Field16909.player.posY + (double)Class1917.Field16909.player.getEyeHeight(), Class1917.Field16909.player.posZ + Double.longBitsToDouble((long)521291036 ^ 0x3FD333332C21762FL), Class1917.Field16909.player.posX + Double.longBitsToDouble(0x3FD3333333333333L), Class1917.Field16909.player.posY + Double.longBitsToDouble(0x4004000000000000L), Class1917.Field16909.player.posZ - Double.longBitsToDouble((long)1311846225 ^ 0x3FD333337D021C62L));
        if (Class1917.Field16909.world.getCollisionBoxes((Entity)Class1917.Field16909.player, axisAlignedBB).isEmpty()) return false;
        return true;
    }

    public static double Method7152() {
        double d = Double.longBitsToDouble((long)1261382240 ^ 0x3FD2631FC12628BEL);
        if (Class1917.Field16909.player == null) return d;
        if (!Class1917.Field16909.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)1)))) return d;
        int n = Objects.requireNonNull(Class1917.Field16909.player.getActivePotionEffect(Objects.requireNonNull(Potion.getPotionById((int)1)))).getAmplifier();
        d *= 1.0 + Double.longBitsToDouble(4596373779694328218L) * (double)(n + 1);
        return d;
    }

    public static double Method7153() {
        return Class1917.Method7154(false, Double.longBitsToDouble((long)1322115604 ^ 0x3FD2631FC4C4E0CAL));
    }

    public static double Method7154(boolean bl, double d) {
        int n;
        if (Class1917.Field16909.player.isPotionActive(MobEffects.SPEED)) {
            n = Objects.requireNonNull(Class1917.Field16909.player.getActivePotionEffect(MobEffects.SPEED)).getAmplifier();
            d *= 1.0 + Double.longBitsToDouble(4596373779694328218L) * (double)(n + 1);
        }
        if (!bl) return d;
        if (!Class1917.Field16909.player.isPotionActive(MobEffects.SLOWNESS)) return d;
        n = Objects.requireNonNull(Class1917.Field16909.player.getActivePotionEffect(MobEffects.SLOWNESS)).getAmplifier();
        d /= 1.0 + Double.longBitsToDouble(4596373779694328218L) * (double)(n + 1);
        return d;
    }

    public static double Method7155() {
        double d = 0.0;
        if (!Class1917.Field16909.player.isPotionActive(MobEffects.JUMP_BOOST)) return d;
        int n = Class1917.Field16909.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier();
        d += (double)(n + 1) * Double.longBitsToDouble(4591870180066957722L);
        return d;
    }

    public static void Method7156(float f, double d) {
        if (!Class1917.Method7159()) {
            return;
        }
        Class1917.Field16909.player.motionX = -Math.sin(f) * d;
        Class1917.Field16909.player.motionZ = Math.cos(f) * d;
    }

    public static double Method7157() {
        double d = Class1917.Field16909.player.posX - Class1917.Field16909.player.prevPosX;
        double d2 = Class1917.Field16909.player.posZ - Class1917.Field16909.player.prevPosZ;
        return Math.sqrt(d * d + d2 * d2);
    }

    public static void Method7158(float f) {
        if (!Class1917.Method7159()) {
            return;
        }
        double d = Class1917.Method7160();
        Class1917.Field16909.player.motionX = -Math.sin(d) * (double)f;
        Class1917.Field16909.player.motionZ = Math.cos(d) * (double)f;
    }

    public static boolean Method7159() {
        if (Class1917.Field16909.player == null) {
            return false;
        }
        if (Class1917.Field16909.player.movementInput.moveForward != 0.0f) {
            return true;
        }
        if (Class1917.Field16909.player.movementInput.moveStrafe == 0.0f) return false;
        return true;
    }

    public static float Method7160() {
        float f = Class1917.Field16909.player.rotationYaw;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            f += Float.intBitsToFloat(0x43340000);
        }
        float f2 = 1.0f;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            f2 = Float.intBitsToFloat(-1090519040);
        } else if (Class1917.Field16909.player.moveForward > 0.0f) {
            f2 = Float.intBitsToFloat(0x3F000000);
        }
        if (Class1917.Field16909.player.moveStrafing > 0.0f) {
            f -= Float.intBitsToFloat(1119092736) * f2;
        }
        if (!(Class1917.Field16909.player.moveStrafing < 0.0f)) return f *= Float.intBitsToFloat(1016003125);
        f += Float.intBitsToFloat(1119092736) * f2;
        return f *= Float.intBitsToFloat(1016003125);
    }

    public static void Method7161(double d) {
        double d2 = Math.toRadians(Class1917.Field16909.player.rotationYaw);
        Class1917.Field16909.player.setPosition(Class1917.Field16909.player.posX + -Math.sin(d2) * d, Class1917.Field16909.player.posY, Class1917.Field16909.player.posZ + Math.cos(d2) * d);
    }

    public static float Method7162() {
        return Class1917.Method7164(Class1917.Field16909.player.movementInput.moveForward);
    }

    public static float Method7163() {
        return Class1917.Method7164(Class1917.Field16909.player.movementInput.moveStrafe);
    }

    private static final float Method7164(float f) {
        if (f > 0.0f) {
            return 1.0f;
        }
        if (!(f < 0.0f)) return 0.0f;
        float f2 = Float.intBitsToFloat(-1082130432);
        return f2;
    }

    public static float Method7165(float f) {
        float f2 = Class1917.Method7162();
        float f3 = Class1917.Method7163();
        float f4 = f;
        float f5 = Float.intBitsToFloat(1119092736) * f3;
        float f6 = f4 - (f5 *= f2 != 0.0f ? f2 * Float.intBitsToFloat(0x3F000000) : 1.0f);
        f6 -= (float)(f2 < 0.0f ? 180 : 0);
        f6 = (float)Math.toRadians(f6);
        float f7 = Class1917.Field16909.gameSettings.mouseSensitivity / Float.intBitsToFloat(1000593162);
        float f8 = Float.intBitsToFloat(1000593162) * f7;
        float f9 = f8 * f8 * f8 * Float.intBitsToFloat(1067030938);
        f6 -= f6 % f9;
        return f6;
    }

    public static double[] Method7166(double d) {
        return Class1917.Method7167((Entity)Class1917.Field16909.player, d);
    }

    public static double[] Method7167(Entity entity, double d) {
        return Class1917.Method7168(entity, Class1917.Field16909.player.movementInput, d);
    }

    public static double[] Method7168(Entity entity, MovementInput movementInput, double d) {
        float f = movementInput.moveForward;
        float f2 = movementInput.moveStrafe;
        float f3 = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * Field16909.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? -45 : 45);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? 45 : -45);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat(-1082130432);
            }
        }
        double d2 = (double)f * d * -Math.sin(Math.toRadians(f3)) + (double)f2 * d * Math.cos(Math.toRadians(f3));
        double d3 = (double)f * d * Math.cos(Math.toRadians(f3)) - (double)f2 * d * -Math.sin(Math.toRadians(f3));
        return new double[]{d2, d3};
    }

    static {
        Field16908 = 0.0;
        Field16907 = 0.0;
        Field16909 = Minecraft.getMinecraft();
    }
}

