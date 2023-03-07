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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.dHW1jZK49fXgBu9AY91BXDMHsTGGza8u;
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
public class AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y {
    private int Field15321;

    public static float[] Method6163(Entity entity) {
        double d = entity.posX - Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posX;
        double d2 = entity.posZ - Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posZ;
        double d3 = entity instanceof EntityLivingBase ? entity.posY + (double)entity.getEyeHeight() - (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posY + (double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getEyeHeight()) - Double.longBitsToDouble(0x1A1B52F011049953L ^ 0x25C2CB69889D00C9L) : (entity.getEntityBoundingBox().minY + entity.getEntityBoundingBox().maxY) / Double.longBitsToDouble(0x10479BF42F596570L ^ 0x50479BF42F596570L) - (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posY + (double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getEyeHeight());
        double d4 = MathHelper.sqrt((double)(d * d + d2 * d2));
        float f = (float)(Math.atan2(d2, d) * Double.longBitsToDouble((long)780326527 ^ 0x406680002E82D67FL) / Double.longBitsToDouble((long)1360911747 ^ 0x400921FB0559F09BL) - Double.longBitsToDouble((long)3779967 ^ 0x405680000039AD7FL)) + (float)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2113((int)27245261L ^ 0xFE604533, ((int)1206005039L ^ 0x47E22D2E) << 1);
        float f2 = (float)(-(Math.atan2(d3, d4) * Double.longBitsToDouble(0x8958F52B6703D058L ^ 0xC93E752B6703D058L) / Double.longBitsToDouble(0xACDDCFC84897D4F0L ^ 0xECD4EE331CD3F9E8L))) + (float)dHW1jZK49fXgBu9AY91BXDMHsTGGza8u.Method2113((int)((long)-690300318 ^ (long)690300316), ((int)1591522879L ^ 0x5EDCB63E) << 1);
        f = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw + AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6190(MathHelper.wrapDegrees((float)(f - Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw)));
        f2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationPitch + AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6190(MathHelper.wrapDegrees((float)(f2 - Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationPitch)));
        float[] fArray = new float[((int)-1880756649L ^ 0x8FE5EE56) << 1];
        fArray[(int)1874953516L ^ 0x6FC1852C] = f;
        fArray[(int)((long)-309291035 ^ (long)-309291036)] = f2;
        return fArray;
    }

    public static double Method6164(BlockPos blockPos) {
        double d;
        if (blockPos == null) return 0.0;
        Vec3d vec3d = new Vec3d((Vec3i)blockPos).subtract(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getPositionEyes(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.getRenderPartialTicks()));
        double d2 = Math.abs((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw - (Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - Double.longBitsToDouble(0x9DF986AE57F31260L ^ 0xDDAF06AE57F31260L))) % Double.longBitsToDouble(0xFD957E893DADDBF7L ^ 0xBDE3FE893DADDBF7L);
        if (d2 > Double.longBitsToDouble(0x15E83D16CC6FA0ABL ^ 0x558EBD16CC6FA0ABL)) {
            d = Double.longBitsToDouble((long)899432088 ^ 0x40768000359C3E98L) - d2;
            return d;
        }
        d = d2;
        return d;
    }

    public static double Method6165(Entity entity) {
        double d;
        if (entity == null) return 0.0;
        Vec3d vec3d = entity.getPositionVector().add(new Vec3d(0.0, (double)(entity.getEyeHeight() / 2.0f), 0.0)).subtract(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getPositionEyes(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.getRenderPartialTicks()));
        double d2 = Math.abs((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw - (Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - Double.longBitsToDouble(0xEE3F8FD1D8CED3B2L ^ 0xAE690FD1D8CED3B2L))) % Double.longBitsToDouble(0xF30A884A72CC768AL ^ 0xB37C084A72CC768AL);
        if (d2 > Double.longBitsToDouble((long)1606344774 ^ 0x406680005FBEE046L)) {
            d = Double.longBitsToDouble(0x3E1B9DAE776E1D4EL ^ 0x7E6D1DAE776E1D4EL) - d2;
            return d;
        }
        d = d2;
        return d;
    }

    public static boolean Method6166(BlockPos blockPos) {
        int n;
        if (blockPos != null && (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getDistanceSq(blockPos) < Double.longBitsToDouble((long)1883664184 ^ 0x4010000070466F38L) || AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6164(blockPos) < (double)(AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6169() + 2.0f))) {
            n = (int)((long)-1854891096 ^ (long)-1854891095);
            return n != 0;
        }
        n = (int)((long)-1502892007 ^ (long)-1502892007);
        return n != 0;
    }

    public static boolean Method6167(Entity entity) {
        int n;
        if (entity != null && (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getDistanceSq(entity) < Double.longBitsToDouble(0x6A2FEB836726AE31L ^ 0x2A3FEB836726AE31L) || AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6165(entity) < (double)(AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6169() + 2.0f))) {
            n = (int)-910865344L ^ 0xC9B54C41;
            return n != 0;
        }
        n = (int)((long)260765675 ^ (long)260765675);
        return n != 0;
    }

    public static float Method6168() {
        return Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.fovSetting;
    }

    public static float Method6169() {
        return AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6168() / 2.0f;
    }

    public static float[] Method6170(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d2.x - vec3d.x;
        double d2 = (vec3d2.y - vec3d.y) * Double.longBitsToDouble(0x67BD5F9B8140FA32L ^ 0xD84D5F9B8140FA32L);
        double d3 = vec3d2.z - vec3d.z;
        double d4 = MathHelper.sqrt((double)(d * d + d3 * d3));
        float[] fArray = new float[((int)-374455439L ^ 0xE9AE4370) << 1];
        fArray[(int)((long)-370869580 ^ (long)-370869580)] = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(d3, d)) - Double.longBitsToDouble((long)837959044 ^ 0x4056800031F23D84L)));
        fArray[(int)668647523L ^ 0x27DAC062] = (float)MathHelper.wrapDegrees((double)Math.toDegrees(Math.atan2(d2, d4)));
        return fArray;
    }

    public static void Method6171(Vec3d vec3d) {
        float[] fArray = YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4303(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getPositionEyes(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.getRenderPartialTicks()), new Vec3d(vec3d.x, vec3d.y, vec3d.z));
        AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6173(fArray[(int)((long)-33128750 ^ (long)-33128750)], fArray[(int)((long)-2096327146 ^ (long)-2096327145)]);
    }

    public static void Method6172(Entity entity) {
        AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6171(new Vec3d((Vec3i)entity.getPosition()));
    }

    public static void Method6173(float f, float f2) {
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw = f;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYawHead = f;
        Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationPitch = f2;
    }

    public static Vec2f Method6174(Vec3d vec3d, Vec3d vec3d2) {
        return AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6175(vec3d2.subtract(vec3d));
    }

    public static Vec2f Method6175(Vec3d vec3d) {
        double d = Math.hypot(vec3d.x, vec3d.z);
        double d2 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6177(Math.toDegrees(Math.atan2(vec3d.z, vec3d.x)) - Double.longBitsToDouble((long)415907071 ^ 0x4056800018CA3CFFL));
        double d3 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6177(Math.toDegrees(-Math.atan2(vec3d.y, d)));
        return new Vec2f((float)d2, (float)d3);
    }

    public static float[] Method6176(BlockPos blockPos) {
        double d = Math.hypot(blockPos.getX(), blockPos.getZ());
        double d2 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6177(Math.toDegrees(Math.atan2(blockPos.getZ(), blockPos.getX())) - Double.longBitsToDouble(0x52B61F9658290F66L ^ 0x12E09F9658290F66L));
        double d3 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6177(Math.toDegrees(-Math.atan2(blockPos.getY(), d)));
        float[] fArray = new float[((int)1503418540L ^ 0x599C58AD) << 1];
        fArray[(int)-1488737825L ^ 0xA743A9DF] = (float)d2;
        fArray[(int)514074790L ^ 0x1EA428A7] = (float)d3;
        return fArray;
    }

    public static double Method6177(double d) {
        if ((d %= Double.longBitsToDouble(0xEDF1E4975297D2E6L ^ 0xAD8764975297D2E6L)) >= Double.longBitsToDouble((long)1665185934 ^ 0x406680006340B88EL)) {
            d -= Double.longBitsToDouble(0xCBFE2D18AC1833C2L ^ 0x8B88AD18AC1833C2L);
        }
        if (!(d < Double.longBitsToDouble((long)592669629 ^ 0xC066800023536BBDL))) return d;
        d += Double.longBitsToDouble(0x1DD69452D4F0DDFDL ^ 0x5DA01452D4F0DDFDL);
        return d;
    }

    public static float Method6178() {
        float f = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw % Float.intBitsToFloat((int)((long)983189007 ^ (long)2033075727));
        if (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw > 0.0f) {
            if (f > Float.intBitsToFloat(0x50D3FF7D ^ 0x13E7FF7D)) {
                f = Float.intBitsToFloat(0x1F21A6AD ^ 0xDC15A6AD) + (f - Float.intBitsToFloat((int)((long)1619557374 ^ (long)599555070)));
            } else if (f < Float.intBitsToFloat((int)((long)1659158322 ^ (long)-1580155086))) {
                f = Float.intBitsToFloat((int)((long)376519392 ^ (long)1430600416)) + (f + Float.intBitsToFloat((int)((long)779891748 ^ (long)1833448484)));
            }
        }
        if (!(f < 0.0f)) return Float.intBitsToFloat((int)((long)1485692090 ^ (long)-1682318150)) + f;
        return Float.intBitsToFloat((int)994675556L ^ 0x787D8B64) + f;
    }

    public static float[] Method6179(Entity entity) {
        Vec3d vec3d = new Vec3d(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posX, Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posY + (double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getEyeHeight(), Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posZ);
        double d = entity.getPositionVector().x - vec3d.x + Math.random() / Double.longBitsToDouble((long)1579185134 ^ 0x401000005E2073EEL);
        double d2 = entity.getPositionVector().y + (double)entity.getEyeHeight() - vec3d.y + Math.random() / Double.longBitsToDouble(0x325ABF3691B5662AL ^ 0x724ABF3691B5662AL);
        double d3 = entity.getPositionVector().z - vec3d.z + Math.random() / Double.longBitsToDouble((long)505171094 ^ 0x401000001E1C4C96L);
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = MathHelper.wrapDegrees((float)((float)Math.toDegrees(Math.atan2(d3, d)) - Float.intBitsToFloat((int)((long)167527003 ^ (long)1263026779))));
        float f2 = MathHelper.wrapDegrees((float)((float)(-Math.toDegrees(Math.atan2(d2, d4))) + Float.intBitsToFloat((int)((long)1559906950 ^ (long)475679366))));
        float f3 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.mouseSensitivity * Float.intBitsToFloat((int)((long)945092771 ^ (long)122511673)) + Float.intBitsToFloat(0x386AEDCE ^ 0x6262103);
        float f4 = f3 * f3 * f3 * Float.intBitsToFloat((int)2017495986L ^ 0x39608BB2);
        f -= f % f4;
        f2 -= f2 % f4;
        float[] fArray = new float[(int)((long)-1861282092 ^ (long)-1861282091) << 1];
        fArray[(int)2024404917L ^ 0x78A9F7B5] = MathHelper.clamp((float)f, (float)Float.intBitsToFloat(0x5A046CD2 ^ 0x99B06CD2), (float)Float.intBitsToFloat((int)2109919045L ^ 0x3E76CF45));
        fArray[(int)((long)-1793692223 ^ (long)-1793692224)] = MathHelper.clamp((float)f2, (float)Float.intBitsToFloat((int)((long)1187682721 ^ (long)-2072077919)), (float)Float.intBitsToFloat(0x4B352FDC ^ 0x9812FDC));
        return fArray;
    }

    public static float[] Method6180(double d, double d2, double d3) {
        double d4 = d - Minecraft.getMinecraft().player.posX;
        double d5 = d2 - Minecraft.getMinecraft().player.posZ;
        double d6 = d3 - Minecraft.getMinecraft().player.posY - Double.longBitsToDouble(0xD42172E8B6E9A1DL ^ 0x32A1241DB85DA92EL);
        double d7 = MathHelper.sqrt((double)(d4 * d4 + d5 * d5));
        float f = (float)(Math.atan2(d5, d4) * Double.longBitsToDouble((long)1806302687 ^ 0x406680006BA9FDDFL) / Double.longBitsToDouble((long)1189542221 ^ 0x400921FB12A2D455L)) - Float.intBitsToFloat(0xF1FD413 ^ 0x4DABD413);
        float f2 = (float)(-(Math.atan2(d6, d7) * Double.longBitsToDouble(0xECB84D045A088729L ^ 0xACDECD045A088729L) / Double.longBitsToDouble(0x5D0B7268C8C34D1AL ^ 0x1D0253939C876002L)));
        float[] fArray = new float[((int)-444386759L ^ 0xE5833238) << 1];
        fArray[(int)-1976319369L ^ 0x8A33C277] = f;
        fArray[(int)1652103608L ^ 0x627919B9] = f2;
        return fArray;
    }

    public static int Method6181() {
        return MathHelper.floor((double)((double)(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw * Float.intBitsToFloat(0x7D9C7CA9 ^ 0x3D1C7CA9) / Float.intBitsToFloat((int)((long)1309521622 ^ (long)230274774))) + Double.longBitsToDouble(0x13378C42C7A894C2L ^ 0x2CD78C42C7A894C2L))) & (int)((long)122350175 ^ (long)122350172);
    }

    public static String Method6182(boolean bl) {
        Object object;
        int n = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6181();
        if (n == 0) {
            return "South (+Z)";
        }
        if (n == (int)((long)1045661760 ^ (long)1045661761)) {
            return "West (-X)";
        }
        if (n != (int)((long)1435943479 ^ (long)1435943478) << 1) {
            if (n != ((int)-496985423L ^ 0xE2609AB2)) return "Loading...";
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
        float f = (float)(MathHelper.atan2((double)d2, (double)d) * Double.longBitsToDouble((long)578708352 ^ 0x40668000227E6380L) / Double.longBitsToDouble((long)2070314717 ^ 0x400921FB2F2253C5L)) - Float.intBitsToFloat((int)((long)1079587695 ^ (long)49099631));
        float f2 = (float)(-(MathHelper.atan2((double)d3, (double)d4) * Double.longBitsToDouble((long)1375136504 ^ 0x4066800051F6EAF8L) / Double.longBitsToDouble(0xD6B9B08D701D34B4L ^ 0x96B09176245919ACL)));
        float[] fArray = new float[((int)92004461L ^ 0x57BE06C) << 1];
        fArray[(int)-938060232L ^ 0xC8165638] = f;
        fArray[(int)1863844019L ^ 0x6F1800B2] = f2;
        return fArray;
    }

    public static float Method6184(float f) {
        float f2;
        f %= Float.intBitsToFloat(0x2899B89A ^ 0x6B2DB89A);
        if (f2 >= Float.intBitsToFloat((int)((long)1608850471 ^ (long)483466279))) {
            f -= Float.intBitsToFloat((int)((long)1819205199 ^ (long)802872911));
        }
        if (!(f < Float.intBitsToFloat((int)((long)1713443164 ^ (long)-1525345956)))) return f;
        f += Float.intBitsToFloat((int)((long)490445858 ^ (long)1586469922));
        return f;
    }

    public static float[] Method6185(Entity entity, boolean bl) {
        double d;
        double d2 = (bl ? entity.prevPosX : entity.posX) - (bl ? Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.prevPosX : Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posX);
        double d3 = (bl ? entity.prevPosZ : entity.posZ) - (bl ? Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.prevPosZ : Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posZ);
        if (entity instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
            float f = RandomUtils.nextFloat((float)(entityLivingBase.posY + (double)(entityLivingBase.getEyeHeight() / Float.intBitsToFloat((int)414807106L ^ 0x27797442))), (float)(entityLivingBase.posY + (double)entityLivingBase.getEyeHeight() - (double)(entityLivingBase.getEyeHeight() / Float.intBitsToFloat((int)((long)15924046 ^ (long)1085471566)))));
            d = (double)f - (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posY + (double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getEyeHeight());
        } else {
            d = (double)RandomUtils.nextFloat((float)entity.getEntityBoundingBox().minY, (float)entity.getEntityBoundingBox().maxY) - (Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.posY + (double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getEyeHeight());
        }
        double d4 = MathHelper.sqrt((double)(d2 * d2 + d3 * d3));
        float f = (float)(Math.atan2(d3, d2) * Double.longBitsToDouble(0xCE2B375D0223743FL ^ 0x8E4DB75D0223743FL) / Double.longBitsToDouble((long)1241532037 ^ 0x400921FB1E446B9DL) - Double.longBitsToDouble((long)1730008303 ^ 0x40568000671DD4EFL)) + RandomUtils.nextFloat(Float.intBitsToFloat((int)((long)587231495 ^ (long)-486510329)), 2.0f);
        float f2 = (float)(-(Math.atan2(d, d4) * Double.longBitsToDouble((long)1872001608 ^ 0x406680006F947A48L) / Double.longBitsToDouble(0xA82511B7B31F0BDDL ^ 0xE82C304CE75B26C5L))) + RandomUtils.nextFloat(Float.intBitsToFloat((int)1798383331L ^ 0xAB3126E3), 2.0f);
        f = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw + AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6190(MathHelper.wrapDegrees((float)(f - Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationYaw)));
        f2 = Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationPitch + AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6190(MathHelper.wrapDegrees((float)(f2 - Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.rotationPitch)));
        f2 = MathHelper.clamp((float)f2, (float)Float.intBitsToFloat(0x4C4CBBFA ^ 0x8EF8BBFA), (float)Float.intBitsToFloat((int)((long)293460084 ^ (long)1405737076)));
        float[] fArray = new float[((int)-453833284L ^ 0xE4F30DBD) << 1];
        fArray[(int)((long)1166795520 ^ (long)1166795520)] = f;
        fArray[(int)((long)2024823016 ^ (long)2024823017)] = f2;
        return fArray;
    }

    public static boolean Method6186(Entity entity, Entity entity2, double d) {
        int n;
        double d2 = AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6189(entity.rotationYaw, AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6188(entity, entity2.posX, entity2.posY, entity2.posZ)[(int)((long)-417898516 ^ (long)-417898516)]);
        if (d2 > 0.0 && d2 < (d *= Double.longBitsToDouble(0x3D2324202393891L ^ 0x3C32324202393891L)) || -d < d2 && d2 < 0.0) {
            n = (int)((long)545377900 ^ (long)545377901);
            return n != 0;
        }
        n = (int)((long)1554674779 ^ (long)1554674779);
        return n != 0;
    }

    public static boolean Method6187(Entity entity, double d) {
        return AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6186((Entity)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player, entity, d);
    }

    public static float[] Method6188(Entity entity, double d, double d2, double d3) {
        double d4 = d + Double.longBitsToDouble((long)615423711 ^ 0x3FE0000024AE9EDFL) - entity.posX;
        double d5 = d2 - entity.posY;
        double d6 = d3 + Double.longBitsToDouble(0xC6D0EAEA6446652AL ^ 0xF930EAEA6446652AL) - entity.posZ;
        double d7 = Math.sqrt(d4 * d4 + d6 * d6);
        float[] fArray = new float[(int)((long)803818170 ^ (long)803818171) << 1];
        fArray[(int)-62440972L ^ 0xFC4739F4] = (float)(Math.atan2(d6, d4) * Double.longBitsToDouble(0x577259A28D3C53CAL ^ 0x1714D9A28D3C53CAL) / Double.longBitsToDouble(0x3C01C8EE9D59F3E4L ^ 0x7C08E915C91DDEFCL)) - Float.intBitsToFloat((int)((long)810996279 ^ (long)1927467575));
        fArray[(int)-799217461L ^ 0xD05CE8CA] = (float)(-(Math.atan2(d5, d7) * Double.longBitsToDouble((long)1629623351 ^ 0x4066800061221437L) / Double.longBitsToDouble(0x569A0E2D70B79514L ^ 0x16932FD624F3B80CL)));
        return fArray;
    }

    private static float Method6189(float f, float f2) {
        float f3;
        float f4 = Math.abs(f2 - f) % Float.intBitsToFloat((int)1737640632L ^ 0x24264AB8);
        if (f4 > Float.intBitsToFloat(0x3117E02B ^ 0x7223E02B)) {
            f3 = Float.intBitsToFloat((int)1651616477L ^ 0x21C5AADD) - f4;
            return f3;
        }
        f3 = f4;
        return f3;
    }

    public static float Method6190(float f) {
        return AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6193(f) * AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6191();
    }

    public static float Method6191() {
        return (float)((double)AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6192() * Double.longBitsToDouble(0x9B6712B55317066L ^ 0x3675421866024355L));
    }

    public static float Method6192() {
        float f = (float)((double)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.gameSettings.mouseSensitivity * Double.longBitsToDouble(0x6EE81AE7C18D31DL ^ 0x390DB29D4F2BE02EL) + Double.longBitsToDouble((long)454163911 ^ 0x3FC999998288645DL));
        return f * f * f * Float.intBitsToFloat((int)1234369552L ^ 0x892FC10);
    }

    public static float Method6193(float f) {
        return Math.round(f / AlWu33DjLxkaWARnbJBm5B7ao4d6qU9Y.Method6191());
    }

    private static String Method6194(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1446315903L ^ 0xA9CAF881;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2090183341 ^ (long)-2090183252);
            int n2 = (int)((long)438098613 ^ (long)438098582) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1706271386 ^ (long)-1706272951) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

