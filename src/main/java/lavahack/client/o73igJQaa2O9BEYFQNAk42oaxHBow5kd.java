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

public class o73igJQaa2O9BEYFQNAk42oaxHBow5kd {
    public static final double Field16907;
    public static final double Field16908;
    public static Minecraft Field16909;
    private String Field16910 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static double Method7146(boolean bl) {
        double d = bl ? Double.longBitsToDouble(0x4051E0DBF04AA358L ^ 0x7F8B019C5E5ED9B9L) : Double.longBitsToDouble(0x4460419ADC29EDACL ^ 0x7BB9D0F2AE99CD69L);
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.isPotionActive(MobEffects.JUMP_BOOST)) return d;
        d += (double)(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + ((int)-1197644566L ^ 0xB89D64EB)) * Double.longBitsToDouble(0xE78F3076E9D20EA3L ^ 0xD836A9EF704B9739L);
        return d;
    }

    public static void Method7147(double d) {
        double d2 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.movementInput.moveForward;
        double d3 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.movementInput.moveStrafe;
        float f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.rotationYaw;
        if (d2 == 0.0 && d3 == 0.0) {
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionX = 0.0;
            o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionZ = 0.0;
            return;
        }
        if (d2 != 0.0) {
            if (d3 > 0.0) {
                f += (float)(d2 > 0.0 ? (int)((long)-82553962 ^ (long)82553925) : (int)548740084L ^ 0x20B51BD9);
            } else if (d3 < 0.0) {
                f += (float)(d2 > 0.0 ? (int)-1228218768L ^ 0xB6CADE5D : (int)-1608540813L ^ 0x5FE062A0);
            }
            d3 = 0.0;
            if (d2 > 0.0) {
                d2 = 1.0;
            } else if (d2 < 0.0) {
                d2 = Double.longBitsToDouble((long)439943521 ^ 0xBFF000001A390161L);
            }
        }
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionX = d2 * d * Math.cos(Math.toRadians(f + Float.intBitsToFloat((int)561613364L ^ 0x63CD8A34))) + d3 * d * Math.sin(Math.toRadians(f + Float.intBitsToFloat((int)1408044466L ^ 0x11590DB2)));
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionZ = d2 * d * Math.sin(Math.toRadians(f + Float.intBitsToFloat((int)((long)456347108 ^ (long)1502039524)))) - d3 * d * Math.cos(Math.toRadians(f + Float.intBitsToFloat((int)716444193L ^ 0x68001221)));
    }

    public static float Method7148() {
        float f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.rotationYaw;
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveForward < 0.0f) {
            f += Float.intBitsToFloat((int)((long)408594146 ^ (long)1533978338));
        }
        float f2 = 1.0f;
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveForward < 0.0f) {
            f2 = Float.intBitsToFloat(0x408AB27E ^ 0xFF8AB27E);
        } else if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveForward > 0.0f) {
            f2 = Float.intBitsToFloat(0x351EF4A6 ^ 0xA1EF4A6);
        }
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveStrafing > 0.0f) {
            f -= Float.intBitsToFloat((int)((long)1561143078 ^ (long)532227878)) * f2;
        }
        if (!(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveStrafing < 0.0f)) return f *= Float.intBitsToFloat((int)((long)1036079104 ^ (long)21998133));
        f += Float.intBitsToFloat((int)929649969L ^ 0x75DD5531) * f2;
        return f *= Float.intBitsToFloat((int)((long)1036079104 ^ (long)21998133));
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
                f3 += (float)(f > 0.0f ? (int)1225095289L ^ 0xB6FA87AA : (int)-1002225665L ^ 0xC4433FD2);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? (int)((long)1104850677 ^ (long)1104850648) : (int)-506473250L ^ 0x1E302B0D);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat((int)1395453989L ^ 0xECACF025);
            }
        }
        double d2 = Math.sin(Math.toRadians(f3 + Float.intBitsToFloat((int)((long)905803187 ^ (long)2001302963))));
        double d3 = Math.cos(Math.toRadians(f3 + Float.intBitsToFloat((int)((long)266219737 ^ (long)1298804953))));
        double d4 = (double)f * d * d3 + (double)f2 * d * d2;
        double d5 = (double)f * d * d2 - (double)f2 * d * d3;
        double[] dArray = new double[(int)((long)-1980007665 ^ (long)-1980007666) << 1];
        dArray[(int)-263474750L ^ 0xF04BB1C2] = d4;
        dArray[(int)((long)605835013 ^ (long)605835012)] = d5;
        return dArray;
    }

    public static boolean Method7151() {
        boolean bl;
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posX - Double.longBitsToDouble(0x33F1F42CF77E54ABL ^ 0xC22C71FC44D6798L), o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posY + (double)o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.getEyeHeight(), o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posZ + Double.longBitsToDouble((long)521291036 ^ 0x3FD333332C21762FL), o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posX + Double.longBitsToDouble(0x6498222EB9B89DF1L ^ 0x5B4B111D8A8BAEC2L), o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posY + Double.longBitsToDouble(0x86DC3A646F09AAFL ^ 0x4869C3A646F09AAFL), o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posZ - Double.longBitsToDouble((long)1311846225 ^ 0x3FD333337D021C62L));
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.world.getCollisionBoxes((Entity)o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player, axisAlignedBB).isEmpty()) {
            bl = (int)-810555155L ^ 0xCFAFE8EC;
            return bl;
        }
        bl = (int)895882825L ^ 0x35661649;
        return bl;
    }

    public static double Method7152() {
        double d = Double.longBitsToDouble((long)1261382240 ^ 0x3FD2631FC12628BEL);
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player == null) return d;
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.isPotionActive(Objects.requireNonNull(Potion.getPotionById((int)((int)2042756098L ^ 0x79C1FC03))))) return d;
        int n = Objects.requireNonNull(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.getActivePotionEffect(Objects.requireNonNull(Potion.getPotionById((int)((int)((long)505556190 ^ (long)505556191)))))).getAmplifier();
        d *= 1.0 + Double.longBitsToDouble(0xF9E3FF378BBFBD3EL ^ 0xC62A66AE122624A4L) * (double)(n + (int)((long)-1399139632 ^ (long)-1399139631));
        return d;
    }

    public static double Method7153() {
        return o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7154(((int)1015395098L ^ 0x3C85B31A) != 0, Double.longBitsToDouble((long)1322115604 ^ 0x3FD2631FC4C4E0CAL));
    }

    public static double Method7154(boolean bl, double d) {
        int n;
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.isPotionActive(MobEffects.SPEED)) {
            n = Objects.requireNonNull(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.getActivePotionEffect(MobEffects.SPEED)).getAmplifier();
            d *= 1.0 + Double.longBitsToDouble(0x939D6DF3CCD43478L ^ 0xAC54F46A554DADE2L) * (double)(n + ((int)-2086991611L ^ 0x839B0904));
        }
        if (!bl) return d;
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.isPotionActive(MobEffects.SLOWNESS)) return d;
        n = Objects.requireNonNull(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.getActivePotionEffect(MobEffects.SLOWNESS)).getAmplifier();
        d /= 1.0 + Double.longBitsToDouble(0x54FB550FB9005361L ^ 0x6B32CC962099CAFBL) * (double)(n + ((int)-888791508L ^ 0xCB061E2D));
        return d;
    }

    public static double Method7155() {
        double d = 0.0;
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.isPotionActive(MobEffects.JUMP_BOOST)) return d;
        int n = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier();
        d += (double)(n + (int)((long)-247960116 ^ (long)-247960115)) * Double.longBitsToDouble(0x8C9235D05390CA4BL ^ 0xB32BAC49CA0953D1L);
        return d;
    }

    public static void Method7156(float f, double d) {
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            return;
        }
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionX = -Math.sin(f) * d;
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionZ = Math.cos(f) * d;
    }

    public static double Method7157() {
        double d = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posX - o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.prevPosX;
        double d2 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posZ - o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.prevPosZ;
        return Math.sqrt(d * d + d2 * d2);
    }

    public static void Method7158(float f) {
        if (!o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7159()) {
            return;
        }
        double d = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7160();
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionX = -Math.sin(d) * (double)f;
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.motionZ = Math.cos(d) * (double)f;
    }

    public static boolean Method7159() {
        int n;
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player == null) {
            return ((int)-853180747L ^ 0xCD257EB5) != 0;
        }
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.movementInput.moveForward != 0.0f) {
            return (int)((long)-46475133 ^ (long)-46475134) != 0;
        }
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.movementInput.moveStrafe != 0.0f) {
            n = (int)66810861L ^ 0x3FB73EC;
            return n != 0;
        }
        n = (int)((long)-1302247906 ^ (long)-1302247906);
        return n != 0;
    }

    public static float Method7160() {
        float f = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.rotationYaw;
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveForward < 0.0f) {
            f += Float.intBitsToFloat((int)((long)40383830 ^ (long)1096562006));
        }
        float f2 = 1.0f;
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveForward < 0.0f) {
            f2 = Float.intBitsToFloat((int)((long)700986788 ^ (long)-1765263964));
        } else if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveForward > 0.0f) {
            f2 = Float.intBitsToFloat((int)((long)833418982 ^ (long)246216422));
        }
        if (o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveStrafing > 0.0f) {
            f -= Float.intBitsToFloat(0x3008D764 ^ 0x72BCD764) * f2;
        }
        if (!(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.moveStrafing < 0.0f)) return f *= Float.intBitsToFloat((int)((long)141649451 ^ (long)889166878));
        f += Float.intBitsToFloat((int)2052220389L ^ 0x38E665E5) * f2;
        return f *= Float.intBitsToFloat((int)((long)141649451 ^ (long)889166878));
    }

    public static void Method7161(double d) {
        double d2 = Math.toRadians(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.rotationYaw);
        o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.setPosition(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posX + -Math.sin(d2) * d, o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posY, o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.posZ + Math.cos(d2) * d);
    }

    public static float Method7162() {
        return o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7164(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.movementInput.moveForward);
    }

    public static float Method7163() {
        return o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7164(o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.movementInput.moveStrafe);
    }

    private static final float Method7164(float f) {
        if (f > 0.0f) {
            return 1.0f;
        }
        if (!(f < 0.0f)) return 0.0f;
        float f2 = Float.intBitsToFloat(0x45C7B669 ^ 0xFA47B669);
        return f2;
    }

    public static float Method7165(float f) {
        float f2 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7162();
        float f3 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7163();
        float f4 = f;
        float f5 = Float.intBitsToFloat((int)((long)1856018502 ^ (long)739547206)) * f3;
        float f6 = f4 - (f5 *= f2 != 0.0f ? f2 * Float.intBitsToFloat(0x94E5448 ^ 0x364E5448) : 1.0f);
        f6 -= (float)(f2 < 0.0f ? ((int)-1472963440L ^ 0xA8345CBD) << 2 : (int)((long)1961738597 ^ (long)1961738597));
        f6 = (float)Math.toRadians(f6);
        float f7 = o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.gameSettings.mouseSensitivity / Float.intBitsToFloat((int)((long)421630065 ^ (long)578963323));
        float f8 = Float.intBitsToFloat((int)((long)1505961939 ^ (long)1650520281)) * f7;
        float f9 = f8 * f8 * f8 * Float.intBitsToFloat((int)((long)95697915 ^ (long)976069217));
        f6 -= f6 % f9;
        return f6;
    }

    public static double[] Method7166(double d) {
        return o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7167((Entity)o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player, d);
    }

    public static double[] Method7167(Entity entity, double d) {
        return o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Method7168(entity, o73igJQaa2O9BEYFQNAk42oaxHBow5kd.Field16909.player.movementInput, d);
    }

    public static double[] Method7168(Entity entity, MovementInput movementInput, double d) {
        float f = movementInput.moveForward;
        float f2 = movementInput.moveStrafe;
        float f3 = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * Field16909.getRenderPartialTicks();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += (float)(f > 0.0f ? (int)202129482L ^ 0xF3F3BF99 : (int)-1099949575L ^ 0xBE7019D4);
            } else if (f2 < 0.0f) {
                f3 += (float)(f > 0.0f ? (int)((long)-1692831783 ^ (long)-1692831756) : (int)((long)-1020922199 ^ (long)1020922234));
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = Float.intBitsToFloat(0x6BF89FD9 ^ 0xD4789FD9);
            }
        }
        double d2 = (double)f * d * -Math.sin(Math.toRadians(f3)) + (double)f2 * d * Math.cos(Math.toRadians(f3));
        double d3 = (double)f * d * Math.cos(Math.toRadians(f3)) - (double)f2 * d * -Math.sin(Math.toRadians(f3));
        double[] dArray = new double[((int)-1312912922L ^ 0xB1BE89E7) << 1];
        dArray[(int)580757025L ^ 0x229DA621] = d2;
        dArray[(int)115318696L ^ 0x6DF9FA9] = d3;
        return dArray;
    }

    static {
        Field16908 = 0.0;
        Field16907 = 0.0;
        Field16909 = Minecraft.getMinecraft();
    }
}

