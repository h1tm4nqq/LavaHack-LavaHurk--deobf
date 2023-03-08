//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.init.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;

public class Class1917
{
    public static final double Field16907;
    public static final double Field16908;
    public static Minecraft Field16909;
    private String Field16910 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static double Method7146(final boolean b) {
        double n = b ? Double.longBitsToDouble(4601237667291888353L) : Double.longBitsToDouble(4600868372122443973L);
        if (Class1917.Field16909.player.isPotionActive(MobEffects.JUMP_BOOST)) {
            n += (Class1917.Field16909.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + 1) * Double.longBitsToDouble(4591870180066957722L);
        }
        return n;
    }
    
    public static void Method7147(final double n) {
        double longBitsToDouble = Class1917.Field16909.player.movementInput.moveForward;
        double n2 = Class1917.Field16909.player.movementInput.moveStrafe;
        float rotationYaw = Class1917.Field16909.player.rotationYaw;
        if (longBitsToDouble == 0.0 && n2 == 0.0) {
            Class1917.Field16909.player.motionX = 0.0;
            Class1917.Field16909.player.motionZ = 0.0;
        }
        else {
            if (longBitsToDouble != 0.0) {
                if (n2 > 0.0) {
                    rotationYaw += ((longBitsToDouble > 0.0) ? -45 : 45);
                }
                else if (n2 < 0.0) {
                    rotationYaw += ((longBitsToDouble > 0.0) ? 45 : -45);
                }
                n2 = 0.0;
                if (longBitsToDouble > 0.0) {
                    longBitsToDouble = 1.0;
                }
                else if (longBitsToDouble < 0.0) {
                    longBitsToDouble = Double.longBitsToDouble((long)439943521 ^ 0xBFF000001A390161L);
                }
            }
            Class1917.Field16909.player.motionX = longBitsToDouble * n * Math.cos(Math.toRadians(rotationYaw + Float.intBitsToFloat(1119092736))) + n2 * n * Math.sin(Math.toRadians(rotationYaw + Float.intBitsToFloat(1119092736)));
            Class1917.Field16909.player.motionZ = longBitsToDouble * n * Math.sin(Math.toRadians(rotationYaw + Float.intBitsToFloat(1119092736))) - n2 * n * Math.cos(Math.toRadians(rotationYaw + Float.intBitsToFloat(1119092736)));
        }
    }
    
    public static float Method7148() {
        float rotationYaw = Class1917.Field16909.player.rotationYaw;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            rotationYaw += Float.intBitsToFloat(1127481344);
        }
        float n = 1.0f;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            n = Float.intBitsToFloat(-1090519040);
        }
        else if (Class1917.Field16909.player.moveForward > 0.0f) {
            n = Float.intBitsToFloat(1056964608);
        }
        if (Class1917.Field16909.player.moveStrafing > 0.0f) {
            rotationYaw -= Float.intBitsToFloat(1119092736) * n;
        }
        if (Class1917.Field16909.player.moveStrafing < 0.0f) {
            rotationYaw += Float.intBitsToFloat(1119092736) * n;
        }
        return rotationYaw * Float.intBitsToFloat(1016003125);
    }
    
    public static double Method7149(final EntityPlayer entityPlayer) {
        return Math.abs(entityPlayer.motionX) + Math.abs(entityPlayer.motionZ);
    }
    
    public static double[] Method7150(final double n) {
        float n2 = Minecraft.getMinecraft().player.movementInput.moveForward;
        float moveStrafe = Minecraft.getMinecraft().player.movementInput.moveStrafe;
        float n3 = Minecraft.getMinecraft().player.prevRotationYaw + (Minecraft.getMinecraft().player.rotationYaw - Minecraft.getMinecraft().player.prevRotationYaw) * Minecraft.getMinecraft().getRenderPartialTicks();
        if (n2 != 0.0f) {
            if (moveStrafe > 0.0f) {
                n3 += ((n2 > 0.0f) ? -45 : 45);
            }
            else if (moveStrafe < 0.0f) {
                n3 += ((n2 > 0.0f) ? 45 : -45);
            }
            moveStrafe = 0.0f;
            if (n2 > 0.0f) {
                n2 = 1.0f;
            }
            else if (n2 < 0.0f) {
                n2 = Float.intBitsToFloat(-1082130432);
            }
        }
        final double sin = Math.sin(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        final double cos = Math.cos(Math.toRadians(n3 + Float.intBitsToFloat(1119092736)));
        return new double[] { n2 * n * cos + moveStrafe * n * sin, n2 * n * sin - moveStrafe * n * cos };
    }
    
    public static boolean Method7151() {
        return !Class1917.Field16909.world.getCollisionBoxes((Entity)Class1917.Field16909.player, new AxisAlignedBB(Class1917.Field16909.player.posX - Double.longBitsToDouble(4599075939470750515L), Class1917.Field16909.player.posY + Class1917.Field16909.player.getEyeHeight(), Class1917.Field16909.player.posZ + Double.longBitsToDouble((long)521291036 ^ 0x3FD333332C21762FL), Class1917.Field16909.player.posX + Double.longBitsToDouble(4599075939470750515L), Class1917.Field16909.player.posY + Double.longBitsToDouble(4612811918334230528L), Class1917.Field16909.player.posZ - Double.longBitsToDouble((long)1311846225 ^ 0x3FD333337D021C62L))).isEmpty();
    }
    
    public static double Method7152() {
        double longBitsToDouble = Double.longBitsToDouble((long)1261382240 ^ 0x3FD2631FC12628BEL);
        if (Class1917.Field16909.player != null && Class1917.Field16909.player.isPotionActive((Potion)Objects.requireNonNull(Potion.getPotionById(1)))) {
            longBitsToDouble *= 1.0 + Double.longBitsToDouble(4596373779694328218L) * (Objects.requireNonNull(Class1917.Field16909.player.getActivePotionEffect((Potion)Objects.requireNonNull(Potion.getPotionById(1)))).getAmplifier() + 1);
        }
        return longBitsToDouble;
    }
    
    public static double Method7153() {
        return Method7154(false, Double.longBitsToDouble((long)1322115604 ^ 0x3FD2631FC4C4E0CAL));
    }
    
    public static double Method7154(final boolean b, double n) {
        if (Class1917.Field16909.player.isPotionActive(MobEffects.SPEED)) {
            n *= 1.0 + Double.longBitsToDouble(4596373779694328218L) * (Objects.requireNonNull(Class1917.Field16909.player.getActivePotionEffect(MobEffects.SPEED)).getAmplifier() + 1);
        }
        if (b && Class1917.Field16909.player.isPotionActive(MobEffects.SLOWNESS)) {
            n /= 1.0 + Double.longBitsToDouble(4596373779694328218L) * (Objects.requireNonNull(Class1917.Field16909.player.getActivePotionEffect(MobEffects.SLOWNESS)).getAmplifier() + 1);
        }
        return n;
    }
    
    public static double Method7155() {
        double n = 0.0;
        if (Class1917.Field16909.player.isPotionActive(MobEffects.JUMP_BOOST)) {
            n += (Class1917.Field16909.player.getActivePotionEffect(MobEffects.JUMP_BOOST).getAmplifier() + 1) * Double.longBitsToDouble(4591870180066957722L);
        }
        return n;
    }
    
    public static void Method7156(final float n, final double n2) {
        if (!Method7159()) {
            return;
        }
        Class1917.Field16909.player.motionX = -Math.sin(n) * n2;
        Class1917.Field16909.player.motionZ = Math.cos(n) * n2;
    }
    
    public static double Method7157() {
        final double n = Class1917.Field16909.player.posX - Class1917.Field16909.player.prevPosX;
        final double n2 = Class1917.Field16909.player.posZ - Class1917.Field16909.player.prevPosZ;
        return Math.sqrt(n * n + n2 * n2);
    }
    
    public static void Method7158(final float n) {
        if (!Method7159()) {
            return;
        }
        final double n2 = Method7160();
        Class1917.Field16909.player.motionX = -Math.sin(n2) * n;
        Class1917.Field16909.player.motionZ = Math.cos(n2) * n;
    }
    
    public static boolean Method7159() {
        return Class1917.Field16909.player != null && (Class1917.Field16909.player.movementInput.moveForward != 0.0f || Class1917.Field16909.player.movementInput.moveStrafe != 0.0f);
    }
    
    public static float Method7160() {
        float rotationYaw = Class1917.Field16909.player.rotationYaw;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            rotationYaw += Float.intBitsToFloat(1127481344);
        }
        float n = 1.0f;
        if (Class1917.Field16909.player.moveForward < 0.0f) {
            n = Float.intBitsToFloat(-1090519040);
        }
        else if (Class1917.Field16909.player.moveForward > 0.0f) {
            n = Float.intBitsToFloat(1056964608);
        }
        if (Class1917.Field16909.player.moveStrafing > 0.0f) {
            rotationYaw -= Float.intBitsToFloat(1119092736) * n;
        }
        if (Class1917.Field16909.player.moveStrafing < 0.0f) {
            rotationYaw += Float.intBitsToFloat(1119092736) * n;
        }
        return rotationYaw * Float.intBitsToFloat(1016003125);
    }
    
    public static void Method7161(final double n) {
        final double radians = Math.toRadians(Class1917.Field16909.player.rotationYaw);
        Class1917.Field16909.player.setPosition(Class1917.Field16909.player.posX + -Math.sin(radians) * n, Class1917.Field16909.player.posY, Class1917.Field16909.player.posZ + Math.cos(radians) * n);
    }
    
    public static float Method7162() {
        return Method7164(Class1917.Field16909.player.movementInput.moveForward);
    }
    
    public static float Method7163() {
        return Method7164(Class1917.Field16909.player.movementInput.moveStrafe);
    }
    
    private static final float Method7164(final float n) {
        return (n > 0.0f) ? 1.0f : ((n < 0.0f) ? Float.intBitsToFloat(-1082130432) : 0.0f);
    }
    
    public static float Method7165(final float n) {
        final float method7162 = Method7162();
        final float n2 = (float)Math.toRadians(n - Float.intBitsToFloat(1119092736) * Method7163() * ((method7162 != 0.0f) ? (method7162 * Float.intBitsToFloat(1056964608)) : 1.0f) - ((method7162 < 0.0f) ? 180 : 0));
        final float n3 = Float.intBitsToFloat(1000593162) * (Class1917.Field16909.gameSettings.mouseSensitivity / Float.intBitsToFloat(1000593162));
        return n2 - n2 % (n3 * n3 * n3 * Float.intBitsToFloat(1067030938));
    }
    
    public static double[] Method7166(final double n) {
        return Method7167((Entity)Class1917.Field16909.player, n);
    }
    
    public static double[] Method7167(final Entity entity, final double n) {
        return Method7168(entity, Class1917.Field16909.player.movementInput, n);
    }
    
    public static double[] Method7168(final Entity entity, final MovementInput movementInput, final double n) {
        float n2 = movementInput.moveForward;
        float moveStrafe = movementInput.moveStrafe;
        float n3 = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * Class1917.Field16909.getRenderPartialTicks();
        if (n2 != 0.0f) {
            if (moveStrafe > 0.0f) {
                n3 += ((n2 > 0.0f) ? -45 : 45);
            }
            else if (moveStrafe < 0.0f) {
                n3 += ((n2 > 0.0f) ? 45 : -45);
            }
            moveStrafe = 0.0f;
            if (n2 > 0.0f) {
                n2 = 1.0f;
            }
            else if (n2 < 0.0f) {
                n2 = Float.intBitsToFloat(-1082130432);
            }
        }
        return new double[] { n2 * n * -Math.sin(Math.toRadians(n3)) + moveStrafe * n * Math.cos(Math.toRadians(n3)), n2 * n * Math.cos(Math.toRadians(n3)) - moveStrafe * n * -Math.sin(Math.toRadians(n3)) };
    }
    
    static {
        Field16908 = 0.0;
        Field16907 = 0.0;
        Class1917.Field16909 = Minecraft.getMinecraft();
    }
}
