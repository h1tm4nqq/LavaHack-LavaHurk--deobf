//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import com.kisman.cc.util.Class1055;
import com.kisman.cc.util.Class2142;
import lavahack.client.Class447;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.RandomUtils;

@SideOnly(value=Side.CLIENT)
public class Class1568 {
    private int Field15321;

    public static float[] Method6163(Entity entity) {
        double d = entity.posX - Class2142.Field17803.player.posX;
        double d2 = entity.posZ - Class2142.Field17803.player.posZ;
        double d3 = entity instanceof EntityLivingBase ? entity.posY + (double)entity.getEyeHeight() - (Class2142.Field17803.player.posY + (double)Class2142.Field17803.player.getEyeHeight()) - Double.longBitsToDouble(4600877379321698714L) : (entity.getEntityBoundingBox().minY + entity.getEntityBoundingBox().maxY) / Double.longBitsToDouble(0x4000000000000000L) - (Class2142.Field17803.player.posY + (double)Class2142.Field17803.player.getEyeHeight());
        double d4 = MathHelper.sqrt((double)(d * d + d2 * d2));
        float f = (float)(Math.atan2(d2, d) * Double.longBitsToDouble((long)780326527 ^ 0x406680002E82D67FL) / Double.longBitsToDouble((long)1360911747 ^ 0x400921FB0559F09BL) - Double.longBitsToDouble((long)3779967 ^ 0x405680000039AD7FL)) + (float)Class447.Method2113(-2, 2);
        float f2 = (float)(-(Math.atan2(d3, d4) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L))) + (float)Class447.Method2113(-2, 2);
        f = Class2142.Field17803.player.rotationYaw + Class1568.Method6190(MathHelper.wrapDegrees((float)(f - Class2142.Field17803.player.rotationYaw)));
        f2 = Class2142.Field17803.player.rotationPitch + Class1568.Method6190(MathHelper.wrapDegrees((float)(f2 - Class2142.Field17803.player.rotationPitch)));
        return new float[]{f, f2};
    }

    public static double Method6164(BlockPos blockPos) {
        double d;
        if (blockPos == null) return 0.0;
        Vec3d vec3d = new Vec3d((Vec3i)blockPos).subtract(Class2142.Field17803.player.getPositionEyes(Class2142.Field17803.getRenderPartialTicks()));
        double d2 = Math.abs((double)Class2142.Field17803.player.rotationYaw - (Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - Double.longBitsToDouble(4636033603912859648L))) % Double.longBitsToDouble(4645040803167600640L);
        if (d2 > Double.longBitsToDouble(4640537203540230144L)) {
            d = Double.longBitsToDouble((long)899432088 ^ 0x40768000359C3E98L) - d2;
            return d;
        }
        d = d2;
        return d;
    }

    public static double Method6165(Entity entity) {
        double d;
        if (entity == null) return 0.0;
        Vec3d vec3d = entity.getPositionVector().add(new Vec3d(0.0, (double)(entity.getEyeHeight() / 2.0f), 0.0)).subtract(Class2142.Field17803.player.getPositionEyes(Class2142.Field17803.getRenderPartialTicks()));
        double d2 = Math.abs((double)Class2142.Field17803.player.rotationYaw - (Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - Double.longBitsToDouble(4636033603912859648L))) % Double.longBitsToDouble(4645040803167600640L);
        if (d2 > Double.longBitsToDouble((long)1606344774 ^ 0x406680005FBEE046L)) {
            d = Double.longBitsToDouble(4645040803167600640L) - d2;
            return d;
        }
        d = d2;
        return d;
    }

    public static boolean Method6166(BlockPos blockPos) {
        if (blockPos == null) return false;
        if (Class2142.Field17803.player.getDistanceSq(blockPos) < Double.longBitsToDouble((long)1883664184 ^ 0x4010000070466F38L)) return true;
        if (!(Class1568.Method6164(blockPos) < (double)(Class1568.Method6169() + 2.0f))) return false;
        return true;
    }

    public static boolean Method6167(Entity entity) {
        if (entity == null) return false;
        if (Class2142.Field17803.player.getDistanceSq(entity) < Double.longBitsToDouble(0x4010000000000000L)) return true;
        if (!(Class1568.Method6165(entity) < (double)(Class1568.Method6169() + 2.0f))) return false;
        return true;
    }

    public static float Method6168() {
        return Class2142.Field17803.gameSettings.fovSetting;
    }

    public static float Method6169() {
        return Class1568.Method6168() / 2.0f;
    }

    public static float[] Method6170(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d2.x - vec3d.x;
        double d2 = (vec3d2.y - vec3d.y) * Double.longBitsToDouble(-4616189618054758400L);
        double d3 = vec3d2.z - vec3d.z;
        double d4 = MathHelper.sqrt((double)(d * d + d3 * d3));
        return new float[]{(float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(d3, d)) - Double.longBitsToDouble((long)837959044 ^ 0x4056800031F23D84L))), (float)MathHelper.wrapDegrees((double)Math.toDegrees(Math.atan2(d2, d4)))};
    }

    public static void Method6171(Vec3d vec3d) {
        float[] fArray = Class1055.Method4303(Class2142.Field17803.player.getPositionEyes(Class2142.Field17803.getRenderPartialTicks()), new Vec3d(vec3d.x, vec3d.y, vec3d.z));
        Class1568.Method6173(fArray[0], fArray[1]);
    }

    public static void Method6172(Entity entity) {
        Class1568.Method6171(new Vec3d((Vec3i)entity.getPosition()));
    }

    public static void Method6173(float f, float f2) {
        Class2142.Field17803.player.rotationYaw = f;
        Class2142.Field17803.player.rotationYawHead = f;
        Class2142.Field17803.player.rotationPitch = f2;
    }

    public static Vec2f Method6174(Vec3d vec3d, Vec3d vec3d2) {
        return Class1568.Method6175(vec3d2.subtract(vec3d));
    }

    public static Vec2f Method6175(Vec3d vec3d) {
        double d = Math.hypot(vec3d.x, vec3d.z);
        double d2 = Class1568.Method6177(Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - Double.longBitsToDouble((long)415907071 ^ 0x4056800018CA3CFFL));
        double d3 = Class1568.Method6177(Math.toDegrees(-Math.atan2(vec3d.y, d)));
        return new Vec2f((float)d2, (float)d3);
    }

    public static float[] Method6176(BlockPos blockPos) {
        double d = Math.hypot(blockPos.getX(), blockPos.getZ());
        double d2 = Class1568.Method6177(Math.toDegrees(Math.atan2(blockPos.getZ(), blockPos.getX())) - Double.longBitsToDouble(4636033603912859648L));
        double d3 = Class1568.Method6177(Math.toDegrees(-Math.atan2(blockPos.getY(), d)));
        return new float[]{(float)d2, (float)d3};
    }

    public static double Method6177(double d) {
        if ((d %= Double.longBitsToDouble(4645040803167600640L)) >= Double.longBitsToDouble((long)1665185934 ^ 0x406680006340B88EL)) {
            d -= Double.longBitsToDouble(4645040803167600640L);
        }
        if (!(d < Double.longBitsToDouble((long)592669629 ^ 0xC066800023536BBDL))) return d;
        d += Double.longBitsToDouble(4645040803167600640L);
        return d;
    }

    public static float Method6178() {
        float f = Class2142.Field17803.player.rotationYaw % Float.intBitsToFloat(1135869952);
        if (Class2142.Field17803.player.rotationYaw > 0.0f) {
            if (f > Float.intBitsToFloat(0x43340000)) {
                f = Float.intBitsToFloat(-1020002304) + (f - Float.intBitsToFloat(0x43340000));
            } else if (f < Float.intBitsToFloat(-1020002304)) {
                f = Float.intBitsToFloat(0x43340000) + (f + Float.intBitsToFloat(0x43340000));
            }
        }
        if (!(f < 0.0f)) return Float.intBitsToFloat(-1020002304) + f;
        return Float.intBitsToFloat(0x43340000) + f;
    }

    public static float[] Method6179(Entity entity) {
        Vec3d vec3d = new Vec3d(Class2142.Field17803.player.posX, Class2142.Field17803.player.posY + (double)Class2142.Field17803.player.getEyeHeight(), Class2142.Field17803.player.posZ);
        double d = entity.getPositionVector().x - vec3d.x + Math.random() / Double.longBitsToDouble((long)1579185134 ^ 0x401000005E2073EEL);
        double d2 = entity.getPositionVector().y + (double)entity.getEyeHeight() - vec3d.y + Math.random() / Double.longBitsToDouble(0x4010000000000000L);
        double d3 = entity.getPositionVector().z - vec3d.z + Math.random() / Double.longBitsToDouble((long)505171094 ^ 0x401000001E1C4C96L);
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = MathHelper.wrapDegrees((float)((float)Math.toDegrees(Math.atan2(d3, d)) - Float.intBitsToFloat(1119092736)));
        float f2 = MathHelper.wrapDegrees((float)((float)(-Math.toDegrees(Math.atan2(d2, d4))) + Float.intBitsToFloat(0x40A00000)));
        float f3 = Class2142.Field17803.gameSettings.mouseSensitivity * Float.intBitsToFloat(1058642330) + Float.intBitsToFloat(1045220557);
        float f4 = f3 * f3 * f3 * Float.intBitsToFloat(1092616192);
        f -= f % f4;
        f2 -= f2 % f4;
        return new float[]{MathHelper.clamp((float)f, (float)Float.intBitsToFloat(-1011613696), (float)Float.intBitsToFloat(1135869952)), MathHelper.clamp((float)f2, (float)Float.intBitsToFloat(-1028390912), (float)Float.intBitsToFloat(1119092736))};
    }

    public static float[] Method6180(double d, double d2, double d3) {
        double d4 = d - Minecraft.getMinecraft().player.posX;
        double d5 = d2 - Minecraft.getMinecraft().player.posZ;
        double d6 = d3 - Minecraft.getMinecraft().player.posY - Double.longBitsToDouble(0x3FE3333333333333L);
        double d7 = MathHelper.sqrt((double)(d4 * d4 + d5 * d5));
        float f = (float)(Math.atan2(d5, d4) * Double.longBitsToDouble((long)1806302687 ^ 0x406680006BA9FDDFL) / Double.longBitsToDouble((long)1189542221 ^ 0x400921FB12A2D455L)) - Float.intBitsToFloat(1119092736);
        float f2 = (float)(-(Math.atan2(d6, d7) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L)));
        return new float[]{f, f2};
    }

    public static int Method6181() {
        return MathHelper.floor((double)((double)(Class2142.Field17803.player.rotationYaw * Float.intBitsToFloat(0x40800000) / Float.intBitsToFloat(1135869952)) + Double.longBitsToDouble(4602678819172646912L))) & 3;
    }

    public static String Method6182(boolean bl) {
        Object object;
        int n = Class1568.Method6181();
        if (n == 0) {
            return "South (+Z)";
        }
        if (n == 1) {
            return "West (-X)";
        }
        if (n != 2) {
            if (n != 3) return "Loading...";
            return "East (+X)";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            object = TextFormatting.RED;
            return stringBuilder.append(object).append("North (-Z)").toString();
        }
        object = "";
        return stringBuilder.append(object).append("North (-Z)").toString();
    }

    public static float[] Method6183(Entity entity) {
        double d = entity.posX - Minecraft.getMinecraft().player.posX;
        double d2 = entity.posZ - Minecraft.getMinecraft().player.posZ;
        double d3 = entity.posY + (double)entity.getEyeHeight() - (Minecraft.getMinecraft().player.getEntityBoundingBox().minY + (Minecraft.getMinecraft().player.getEntityBoundingBox().maxY - Minecraft.getMinecraft().player.getEntityBoundingBox().minY));
        double d4 = MathHelper.sqrt((double)(d * d + d2 * d2));
        float f = (float)(MathHelper.atan2((double)d2, (double)d) * Double.longBitsToDouble((long)578708352 ^ 0x40668000227E6380L) / Double.longBitsToDouble((long)2070314717 ^ 0x400921FB2F2253C5L)) - Float.intBitsToFloat(1119092736);
        float f2 = (float)(-(MathHelper.atan2((double)d3, (double)d4) * Double.longBitsToDouble((long)1375136504 ^ 0x4066800051F6EAF8L) / Double.longBitsToDouble(4614256656552045848L)));
        return new float[]{f, f2};
    }

    public static float Method6184(float f) {
        float f2;
        f %= Float.intBitsToFloat(1135869952);
        if (f2 >= Float.intBitsToFloat(0x43340000)) {
            f -= Float.intBitsToFloat(1135869952);
        }
        if (!(f < Float.intBitsToFloat(-1020002304))) return f;
        f += Float.intBitsToFloat(1135869952);
        return f;
    }

    public static float[] Method6185(Entity entity, boolean bl) {
        double d;
        double d2 = (bl ? entity.prevPosX : entity.posX) - (bl ? Class2142.Field17803.player.prevPosX : Class2142.Field17803.player.posX);
        double d3 = (bl ? entity.prevPosZ : entity.posZ) - (bl ? Class2142.Field17803.player.prevPosZ : Class2142.Field17803.player.posZ);
        if (entity instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
            float f = RandomUtils.nextFloat((float)(entityLivingBase.posY + (double)(entityLivingBase.getEyeHeight() / Float.intBitsToFloat(1069547520))), (float)(entityLivingBase.posY + (double)entityLivingBase.getEyeHeight() - (double)(entityLivingBase.getEyeHeight() / Float.intBitsToFloat(0x40400000))));
            d = (double)f - (Class2142.Field17803.player.posY + (double)Class2142.Field17803.player.getEyeHeight());
        } else {
            d = (double)RandomUtils.nextFloat((float)entity.getEntityBoundingBox().minY, (float)entity.getEntityBoundingBox().maxY) - (Class2142.Field17803.player.posY + (double)Class2142.Field17803.player.getEyeHeight());
        }
        double d4 = MathHelper.sqrt((double)(d2 * d2 + d3 * d3));
        float f = (float)(Math.atan2(d3, d2) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble((long)1241532037 ^ 0x400921FB1E446B9DL) - Double.longBitsToDouble((long)1730008303 ^ 0x40568000671DD4EFL)) + RandomUtils.nextFloat(Float.intBitsToFloat(-1073741824), 2.0f);
        float f2 = (float)(-(Math.atan2(d, d4) * Double.longBitsToDouble((long)1872001608 ^ 0x406680006F947A48L) / Double.longBitsToDouble(4614256656552045848L))) + RandomUtils.nextFloat(Float.intBitsToFloat(-1073741824), 2.0f);
        f = Class2142.Field17803.player.rotationYaw + Class1568.Method6190(MathHelper.wrapDegrees((float)(f - Class2142.Field17803.player.rotationYaw)));
        f2 = Class2142.Field17803.player.rotationPitch + Class1568.Method6190(MathHelper.wrapDegrees((float)(f2 - Class2142.Field17803.player.rotationPitch)));
        f2 = MathHelper.clamp((float)f2, (float)Float.intBitsToFloat(-1028390912), (float)Float.intBitsToFloat(1119092736));
        return new float[]{f, f2};
    }

    public static boolean Method6186(Entity entity, Entity entity2, double d) {
        double d2 = Class1568.Method6189(entity.rotationYaw, Class1568.Method6188(entity, entity2.posX, entity2.posY, entity2.posZ)[0]);
        if (d2 > 0.0) {
            if (d2 < (d *= Double.longBitsToDouble(4602678819172646912L))) return true;
        }
        if (!(-d < d2)) return false;
        if (!(d2 < 0.0)) return false;
        return true;
    }

    public static boolean Method6187(Entity entity, double d) {
        return Class1568.Method6186((Entity)Class2142.Field17803.player, entity, d);
    }

    public static float[] Method6188(Entity entity, double d, double d2, double d3) {
        double d4 = d + Double.longBitsToDouble((long)615423711 ^ 0x3FE0000024AE9EDFL) - entity.posX;
        double d5 = d2 - entity.posY;
        double d6 = d3 + Double.longBitsToDouble(4602678819172646912L) - entity.posZ;
        double d7 = Math.sqrt(d4 * d4 + d6 * d6);
        return new float[]{(float)(Math.atan2(d6, d4) * Double.longBitsToDouble(4640537203540230144L) / Double.longBitsToDouble(4614256656552045848L)) - Float.intBitsToFloat(1119092736), (float)(-(Math.atan2(d5, d7) * Double.longBitsToDouble((long)1629623351 ^ 0x4066800061221437L) / Double.longBitsToDouble(4614256656552045848L)))};
    }

    private static float Method6189(float f, float f2) {
        float f3;
        float f4 = Math.abs(f2 - f) % Float.intBitsToFloat(1135869952);
        if (f4 > Float.intBitsToFloat(0x43340000)) {
            f3 = Float.intBitsToFloat(1135869952) - f4;
            return f3;
        }
        f3 = f4;
        return f3;
    }

    public static float Method6190(float f) {
        return Class1568.Method6193(f) * Class1568.Method6191();
    }

    public static float Method6191() {
        return (float)((double)Class1568.Method6192() * Double.longBitsToDouble(0x3FC3333333333333L));
    }

    public static float Method6192() {
        float f = (float)((double)Class2142.Field17803.gameSettings.mouseSensitivity * Double.longBitsToDouble(0x3FE3333333333333L) + Double.longBitsToDouble((long)454163911 ^ 0x3FC999998288645DL));
        return f * f * f * Float.intBitsToFloat(0x41000000);
    }

    public static float Method6193(float f) {
        return Math.round(f / Class1568.Method6191());
    }

    private static String Method6194(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 140;
            cArray2[n] = (char)(cArray[n] ^ (0xA2F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

