//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.entity.*;
import com.kisman.cc.util.*;
import net.minecraft.util.math.*;
import net.minecraft.client.*;
import net.minecraft.util.text.*;
import org.apache.commons.lang3.*;

@SideOnly(Side.CLIENT)
public class Class1568
{
    private int Field15321;
    
    public static float[] Method6163(final Entity entity) {
        final double x = entity.posX - Class2142.Field17803.player.posX;
        final double y = entity.posZ - Class2142.Field17803.player.posZ;
        double y2;
        if (entity instanceof EntityLivingBase) {
            y2 = entity.posY + entity.getEyeHeight() - (Class2142.Field17803.player.posY + Class2142.Field17803.player.getEyeHeight()) - Double.longBitsToDouble(4600877379321698714L);
        }
        else {
            y2 = (entity.getEntityBoundingBox().minY + entity.getEntityBoundingBox().maxY) / Double.longBitsToDouble(4611686018427387904L) - (Class2142.Field17803.player.posY + Class2142.Field17803.player.getEyeHeight());
        }
        return new float[] { Class2142.Field17803.player.rotationYaw + Method6190(MathHelper.wrapDegrees((float)(Math.atan2(y, x) * Double.longBitsToDouble((long)780326527 ^ 0x406680002E82D67FL) / Double.longBitsToDouble((long)1360911747 ^ 0x400921FB0559F09BL) - Double.longBitsToDouble((long)3779967 ^ 0x405680000039AD7FL)) + Class447.Method2113(-2, 2) - Class2142.Field17803.player.rotationYaw)), Class2142.Field17803.player.rotationPitch + Method6190(MathHelper.wrapDegrees((float)(-(Math.atan2(y2, MathHelper.sqrt(x * x + y * y)) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L))) + Class447.Method2113(-2, 2) - Class2142.Field17803.player.rotationPitch)) };
    }
    
    public static double Method6164(final BlockPos blockPos) {
        if (blockPos != null) {
            final Vec3d subtract = new Vec3d((Vec3i)blockPos).subtract(Class2142.Field17803.player.getPositionEyes(Class2142.Field17803.getRenderPartialTicks()));
            final double n = Math.abs(Class2142.Field17803.player.rotationYaw - (Math.toDegrees(Math.atan2(subtract.z, subtract.x)) - Double.longBitsToDouble(4636033603912859648L))) % Double.longBitsToDouble(4645040803167600640L);
            return (n > Double.longBitsToDouble(4640537203540230144L)) ? (Double.longBitsToDouble((long)899432088 ^ 0x40768000359C3E98L) - n) : n;
        }
        return 0.0;
    }
    
    public static double Method6165(final Entity entity) {
        if (entity != null) {
            final Vec3d subtract = entity.getPositionVector().add(new Vec3d(0.0, (double)(entity.getEyeHeight() / 2.0f), 0.0)).subtract(Class2142.Field17803.player.getPositionEyes(Class2142.Field17803.getRenderPartialTicks()));
            final double n = Math.abs(Class2142.Field17803.player.rotationYaw - (Math.toDegrees(Math.atan2(subtract.z, subtract.x)) - Double.longBitsToDouble(4636033603912859648L))) % Double.longBitsToDouble(4645040803167600640L);
            return (n > Double.longBitsToDouble((long)1606344774 ^ 0x406680005FBEE046L)) ? (Double.longBitsToDouble(4645040803167600640L) - n) : n;
        }
        return 0.0;
    }
    
    public static boolean Method6166(final BlockPos blockPos) {
        return blockPos != null && (Class2142.Field17803.player.getDistanceSq(blockPos) < Double.longBitsToDouble((long)1883664184 ^ 0x4010000070466F38L) || Method6164(blockPos) < Method6169() + 2.0f);
    }
    
    public static boolean Method6167(final Entity entity) {
        return entity != null && (Class2142.Field17803.player.getDistanceSq(entity) < Double.longBitsToDouble(4616189618054758400L) || Method6165(entity) < Method6169() + 2.0f);
    }
    
    public static float Method6168() {
        return Class2142.Field17803.gameSettings.fovSetting;
    }
    
    public static float Method6169() {
        return Method6168() / 2.0f;
    }
    
    public static float[] Method6170(final Vec3d vec3d, final Vec3d vec3d2) {
        final double x = vec3d2.x - vec3d.x;
        final double y = (vec3d2.y - vec3d.y) * Double.longBitsToDouble(-4616189618054758400L);
        final double y2 = vec3d2.z - vec3d.z;
        return new float[] { (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(y2, x)) - Double.longBitsToDouble((long)837959044 ^ 0x4056800031F23D84L)), (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)))) };
    }
    
    public static void Method6171(final Vec3d vec3d) {
        final float[] method4303 = Class1055.Method4303(Class2142.Field17803.player.getPositionEyes(Class2142.Field17803.getRenderPartialTicks()), new Vec3d(vec3d.x, vec3d.y, vec3d.z));
        Method6173(method4303[0], method4303[1]);
    }
    
    public static void Method6172(final Entity entity) {
        Method6171(new Vec3d((Vec3i)entity.getPosition()));
    }
    
    public static void Method6173(final float n, final float rotationPitch) {
        Class2142.Field17803.player.rotationYaw = n;
        Class2142.Field17803.player.rotationYawHead = n;
        Class2142.Field17803.player.rotationPitch = rotationPitch;
    }
    
    public static Vec2f Method6174(final Vec3d vec3d, final Vec3d vec3d2) {
        return Method6175(vec3d2.subtract(vec3d));
    }
    
    public static Vec2f Method6175(final Vec3d vec3d) {
        return new Vec2f((float)Method6177(Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - Double.longBitsToDouble((long)415907071 ^ 0x4056800018CA3CFFL)), (float)Method6177(Math.toDegrees(-Math.atan2(vec3d.y, Math.hypot(vec3d.x, vec3d.z)))));
    }
    
    public static float[] Method6176(final BlockPos blockPos) {
        return new float[] { (float)Method6177(Math.toDegrees(Math.atan2(blockPos.getZ(), blockPos.getX())) - Double.longBitsToDouble(4636033603912859648L)), (float)Method6177(Math.toDegrees(-Math.atan2(blockPos.getY(), Math.hypot(blockPos.getX(), blockPos.getZ())))) };
    }
    
    public static double Method6177(double n) {
        n %= Double.longBitsToDouble(4645040803167600640L);
        if (n >= Double.longBitsToDouble((long)1665185934 ^ 0x406680006340B88EL)) {
            n -= Double.longBitsToDouble(4645040803167600640L);
        }
        if (n < Double.longBitsToDouble((long)592669629 ^ 0xC066800023536BBDL)) {
            n += Double.longBitsToDouble(4645040803167600640L);
        }
        return n;
    }
    
    public static float Method6178() {
        float n = Class2142.Field17803.player.rotationYaw % Float.intBitsToFloat(1135869952);
        if (Class2142.Field17803.player.rotationYaw > 0.0f) {
            if (n > Float.intBitsToFloat(1127481344)) {
                n = Float.intBitsToFloat(-1020002304) + (n - Float.intBitsToFloat(1127481344));
            }
            else if (n < Float.intBitsToFloat(-1020002304)) {
                n = Float.intBitsToFloat(1127481344) + (n + Float.intBitsToFloat(1127481344));
            }
        }
        if (n < 0.0f) {
            return Float.intBitsToFloat(1127481344) + n;
        }
        return Float.intBitsToFloat(-1020002304) + n;
    }
    
    public static float[] Method6179(final Entity entity) {
        final Vec3d vec3d = new Vec3d(Class2142.Field17803.player.posX, Class2142.Field17803.player.posY + Class2142.Field17803.player.getEyeHeight(), Class2142.Field17803.player.posZ);
        final double x = entity.getPositionVector().x - vec3d.x + Math.random() / Double.longBitsToDouble((long)1579185134 ^ 0x401000005E2073EEL);
        final double y = entity.getPositionVector().y + entity.getEyeHeight() - vec3d.y + Math.random() / Double.longBitsToDouble(4616189618054758400L);
        final double y2 = entity.getPositionVector().z - vec3d.z + Math.random() / Double.longBitsToDouble((long)505171094 ^ 0x401000001E1C4C96L);
        final double sqrt = Math.sqrt(x * x + y2 * y2);
        final float wrapDegrees = MathHelper.wrapDegrees((float)Math.toDegrees(Math.atan2(y2, x)) - Float.intBitsToFloat(1119092736));
        final float wrapDegrees2 = MathHelper.wrapDegrees((float)(-Math.toDegrees(Math.atan2(y, sqrt))) + Float.intBitsToFloat(1084227584));
        final float n = Class2142.Field17803.gameSettings.mouseSensitivity * Float.intBitsToFloat(1058642330) + Float.intBitsToFloat(1045220557);
        final float n2 = n * n * n * Float.intBitsToFloat(1092616192);
        return new float[] { MathHelper.clamp(wrapDegrees - wrapDegrees % n2, Float.intBitsToFloat(-1011613696), Float.intBitsToFloat(1135869952)), MathHelper.clamp(wrapDegrees2 - wrapDegrees2 % n2, Float.intBitsToFloat(-1028390912), Float.intBitsToFloat(1119092736)) };
    }
    
    public static float[] Method6180(final double n, final double n2, final double n3) {
        final double x = n - Minecraft.getMinecraft().player.posX;
        final double y = n2 - Minecraft.getMinecraft().player.posZ;
        return new float[] { (float)(Math.atan2(y, x) * Double.longBitsToDouble((long)1806302687 ^ 0x406680006BA9FDDFL) / Double.longBitsToDouble((long)1189542221 ^ 0x400921FB12A2D455L)) - Float.intBitsToFloat(1119092736), (float)(-(Math.atan2(n3 - Minecraft.getMinecraft().player.posY - Double.longBitsToDouble(4603579539098121011L), MathHelper.sqrt(x * x + y * y)) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L))) };
    }
    
    public static int Method6181() {
        return MathHelper.floor(Class2142.Field17803.player.rotationYaw * Float.intBitsToFloat(1082130432) / Float.intBitsToFloat(1135869952) + Double.longBitsToDouble(4602678819172646912L)) & 0x3;
    }
    
    public static String Method6182(final boolean b) {
        final int method6181 = Method6181();
        if (method6181 == 0) {
            return "South (+Z)";
        }
        if (method6181 == 1) {
            return "West (-X)";
        }
        if (method6181 == 2) {
            return (b ? TextFormatting.RED : "") + "North (-Z)";
        }
        if (method6181 == 3) {
            return "East (+X)";
        }
        return "Loading...";
    }
    
    public static float[] Method6183(final Entity entity) {
        final double n = entity.posX - Minecraft.getMinecraft().player.posX;
        final double n2 = entity.posZ - Minecraft.getMinecraft().player.posZ;
        return new float[] { (float)(MathHelper.atan2(n2, n) * Double.longBitsToDouble((long)578708352 ^ 0x40668000227E6380L) / Double.longBitsToDouble((long)2070314717 ^ 0x400921FB2F2253C5L)) - Float.intBitsToFloat(1119092736), (float)(-(MathHelper.atan2(entity.posY + entity.getEyeHeight() - (Minecraft.getMinecraft().player.getEntityBoundingBox().minY + (Minecraft.getMinecraft().player.getEntityBoundingBox().maxY - Minecraft.getMinecraft().player.getEntityBoundingBox().minY)), (double)MathHelper.sqrt(n * n + n2 * n2)) * Double.longBitsToDouble((long)1375136504 ^ 0x4066800051F6EAF8L) / Double.longBitsToDouble(4614256656552045848L))) };
    }
    
    public static float Method6184(float n) {
        if ((n %= Float.intBitsToFloat(1135869952)) >= Float.intBitsToFloat(1127481344)) {
            n -= Float.intBitsToFloat(1135869952);
        }
        if (n < Float.intBitsToFloat(-1020002304)) {
            n += Float.intBitsToFloat(1135869952);
        }
        return n;
    }
    
    public static float[] Method6185(final Entity entity, final boolean b) {
        final double x = (b ? entity.prevPosX : entity.posX) - (b ? Class2142.Field17803.player.prevPosX : Class2142.Field17803.player.posX);
        final double y = (b ? entity.prevPosZ : entity.posZ) - (b ? Class2142.Field17803.player.prevPosZ : Class2142.Field17803.player.posZ);
        double y2;
        if (entity instanceof EntityLivingBase) {
            final EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
            y2 = RandomUtils.nextFloat((float)(entityLivingBase.posY + entityLivingBase.getEyeHeight() / Float.intBitsToFloat(1069547520)), (float)(entityLivingBase.posY + entityLivingBase.getEyeHeight() - entityLivingBase.getEyeHeight() / Float.intBitsToFloat(1077936128))) - (Class2142.Field17803.player.posY + Class2142.Field17803.player.getEyeHeight());
        }
        else {
            y2 = RandomUtils.nextFloat((float)entity.getEntityBoundingBox().minY, (float)entity.getEntityBoundingBox().maxY) - (Class2142.Field17803.player.posY + Class2142.Field17803.player.getEyeHeight());
        }
        return new float[] { Class2142.Field17803.player.rotationYaw + Method6190(MathHelper.wrapDegrees((float)(Math.atan2(y, x) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble((long)1241532037 ^ 0x400921FB1E446B9DL) - Double.longBitsToDouble((long)1730008303 ^ 0x40568000671DD4EFL)) + RandomUtils.nextFloat(Float.intBitsToFloat(-1073741824), 2.0f) - Class2142.Field17803.player.rotationYaw)), MathHelper.clamp(Class2142.Field17803.player.rotationPitch + Method6190(MathHelper.wrapDegrees((float)(-(Math.atan2(y2, MathHelper.sqrt(x * x + y * y)) * Double.longBitsToDouble((long)1872001608 ^ 0x406680006F947A48L) / Double.longBitsToDouble(4614256656552045848L))) + RandomUtils.nextFloat(Float.intBitsToFloat(-1073741824), 2.0f) - Class2142.Field17803.player.rotationPitch)), Float.intBitsToFloat(-1028390912), Float.intBitsToFloat(1119092736)) };
    }
    
    public static boolean Method6186(final Entity entity, final Entity entity2, double n) {
        final double n2 = Method6189(entity.rotationYaw, Method6188(entity, entity2.posX, entity2.posY, entity2.posZ)[0]);
        return (n2 > 0.0 && n2 < (n *= Double.longBitsToDouble(4602678819172646912L))) || (-n < n2 && n2 < 0.0);
    }
    
    public static boolean Method6187(final Entity entity, final double n) {
        return Method6186((Entity)Class2142.Field17803.player, entity, n);
    }
    
    public static float[] Method6188(final Entity entity, final double n, final double n2, final double n3) {
        final double x = n + Double.longBitsToDouble((long)615423711 ^ 0x3FE0000024AE9EDFL) - entity.posX;
        final double y = n2 - entity.posY;
        final double y2 = n3 + Double.longBitsToDouble(4602678819172646912L) - entity.posZ;
        return new float[] { (float)(Math.atan2(y2, x) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L)) - Float.intBitsToFloat(1119092736), (float)(-(Math.atan2(y, Math.sqrt(x * x + y2 * y2)) * Double.longBitsToDouble((long)1629623351 ^ 0x4066800061221437L) / Double.longBitsToDouble(4614256656552045848L))) };
    }
    
    private static float Method6189(final float n, final float n2) {
        final float n3 = Math.abs(n2 - n) % Float.intBitsToFloat(1135869952);
        return (n3 > Float.intBitsToFloat(1127481344)) ? (Float.intBitsToFloat(1135869952) - n3) : n3;
    }
    
    public static float Method6190(final float n) {
        return Method6193(n) * Method6191();
    }
    
    public static float Method6191() {
        return (float)(Method6192() * Double.longBitsToDouble(4594572339843380019L));
    }
    
    public static float Method6192() {
        final float n = (float)(Class2142.Field17803.gameSettings.mouseSensitivity * Double.longBitsToDouble(4603579539098121011L) + Double.longBitsToDouble((long)454163911 ^ 0x3FC999998288645DL));
        return n * n * n * Float.intBitsToFloat(1090519040);
    }
    
    public static float Method6193(final float n) {
        return (float)Math.round(n / Method6191());
    }
    
    private static String Method6194(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xA2F ^ 0x8C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
