//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw;
import lavahack.client.ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public final class ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Enum {
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10504 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Sides", (int)961562564L ^ 0x395047C4, (boolean)((long)-887649055 ^ (long)-887649055), ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5744().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        Vec3d vec3d = (Vec3d)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1535086345 ^ (long)1535086345));
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        List list = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method905(blockPos);
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method903(list);
        return null;
    }));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10505 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Square", (int)((long)1045837826 ^ (long)1045837827), (boolean)((long)-229533830 ^ (long)-229533830), ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5744().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        Vec3d vec3d = (Vec3d)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)1799180011 ^ (long)1799180011));
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        List list = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method904(blockPos);
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method903(list);
        return null;
    }));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10506 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("SmartSquare", ((int)-804616181L ^ 0xD00A880A) << 1, ((int)-1049735253L ^ 0xC16E4FAB) != 0, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5744().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        Vec3d vec3d = (Vec3d)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)1789718686L ^ 0x6AACF09E);
        Entity entity = (Entity)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)-110291468L ^ 0xF96D15F5);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        EnumFacing enumFacing = EnumFacing.getFacingFromVector((float)((float)entity.motionX), (float)0.0f, (float)((float)entity.motionZ));
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = (int)((long)765839180 ^ (long)765839180);
        while (true) {
            if (n2 >= n) {
                ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method903(arrayList);
                return null;
            }
            EnumFacing enumFacing2 = enumFacingArray[n2];
            if (enumFacing2 != enumFacing) {
                arrayList.add(blockPos.offset(enumFacing2));
            }
            ++n2;
        }
    }));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10507 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("PlayerPosition", (int)((long)-502193060 ^ (long)-502193057), ((int)-749553677L ^ 0xD352B7F2) != 0, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5744().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        Vec3d vec3d = (Vec3d)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)2103324903L ^ 0x7D5E30E7);
        Entity entity = (Entity)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-1114404194 ^ (long)-1114404193));
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos);
        double d = vec3d.x;
        double d2 = vec3d.y;
        double d3 = vec3d.z;
        int n = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method900(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485).Method335() * ((int)((long)760739206 ^ (long)760739203) << 2) + ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method901(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485).Method335();
        int n2 = (int)((long)-1641478064 ^ (long)-1641478064);
        while (n2 < n) {
            d += entity.motionX;
            if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method902(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485).Method365()) {
                d2 += entity.motionY;
            }
            BlockPos blockPos2 = new BlockPos(d, d2, d3 += entity.motionZ);
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos2);
            ++n2;
        }
        return null;
    }));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10508 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Player", ((int)-503386833L ^ 0xE1FEED2E) << 2, (boolean)((long)384945433 ^ (long)384945432), ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5744().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        Vec3d vec3d = (Vec3d)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)2089679797L ^ 0x7C8DFBB5);
        Entity entity = (Entity)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)759682979L ^ 0x2D47D7A2);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos);
        double d = vec3d.x;
        double d2 = vec3d.y;
        double d3 = vec3d.z;
        int n = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method900(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485).Method335() * (((int)1447663213L ^ 0x56499668) << 2) + ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method901(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485).Method335();
        int n2 = (int)995477017L ^ 0x3B55C619;
        while (n2 < n) {
            d += entity.motionX;
            if (!ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method902(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Field8485).Method365()) {
                d2 += entity.motionY;
            }
            BlockPos blockPos2 = new BlockPos(d + Double.longBitsToDouble(0x4B37D5D4E994915DL ^ 0x74E4E6E7DAA7A26EL), d2, (d3 += entity.motionZ) + Double.longBitsToDouble(0x710E5768790A626DL ^ 0x4EDD645B4A39515EL));
            BlockPos blockPos3 = new BlockPos(d + Double.longBitsToDouble((long)1147542287 ^ 0x3FD333337755283CL), d2, d3 - Double.longBitsToDouble(0x702B1235243F6C81L ^ 0x4FF82106170C5FB2L));
            BlockPos blockPos4 = new BlockPos(d - Double.longBitsToDouble((long)225277774 ^ 0x3FD333333E5E447DL), d2, d3 + Double.longBitsToDouble((long)1157738399 ^ 0x3FD3333376329CACL));
            BlockPos blockPos5 = new BlockPos(d - Double.longBitsToDouble((long)1922183124 ^ 0x3FD3333341A11CE7L), d2, d3 - Double.longBitsToDouble(0x143BECDDD34E8CC5L ^ 0x2BE8DFEEE07DBFF6L));
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos2);
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos3);
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos4);
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos5);
            ++n2;
        }
        return null;
    }));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10509 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("Scaffold", (int)-1903008823L ^ 0x8E9263CC, ((int)-1493929447L ^ 0xA6F47219) != 0, ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5744().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        Vec3d vec3d = (Vec3d)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-370752255 ^ (long)-370752255));
        Entity entity = (Entity)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)((long)-276941347 ^ (long)-276941348));
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        BlockPos blockPos2 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method897(entity, blockPos);
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty() && blockPos2 != null) {
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos2);
        }
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos);
        return null;
    }));
    public static final /* enum */ ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field10510 = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi("ScaffoldDamage", ((int)1635390975L ^ 0x617A15FC) << 1, (boolean)((long)-1677987689 ^ (long)-1677987689), ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5744().Method7663(z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC -> {
        Vec3d vec3d = (Vec3d)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)676978645L ^ 0x2859DFD5);
        Entity entity = (Entity)z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC.Method2054((int)1440885288L ^ 0x55E22A29);
        BlockPos blockPos = new BlockPos(vec3d.x, vec3d.y, vec3d.z);
        BlockPos blockPos2 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method897(entity, blockPos);
        if (h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty() && blockPos2 != null) {
            ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos2);
        }
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos);
        BlockPos blockPos3 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method899(entity, blockPos);
        if (blockPos3 == null) return null;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw.Method898(blockPos);
        return null;
    }));
    private final boolean Field10511;
    private final hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Field10512;
    private static final ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10513;
    private int Field10514;

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] values() {
        return (ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[])Field10513.clone();
    }

    public static ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi valueOf(String string) {
        return Enum.valueOf(ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field10511 = var3_1;
        this.Field10512 = var4_2;
    }

    public boolean Method2555() {
        return this.Field10511;
    }

    public hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs Method2556() {
        return this.Field10512;
    }

    static {
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)-802637562L ^ 0xD028B901];
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)2134866045L ^ 0x7F3F787D] = Field10504;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)1523203028 ^ (long)1523203029)] = Field10505;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1823614787 ^ (long)-1823614788) << 1] = Field10506;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)1767891199L ^ 0x695FE0FC] = Field10507;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-1586296149L ^ 0xA1730AAA) << 2] = Field10508;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[(int)((long)-1300762979 ^ (long)-1300762984)] = Field10509;
        ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[((int)-1372317670L ^ 0xAE341819) << 1] = Field10510;
        Field10513 = ogIRHsvrcoj74EgOYs6KOsxhTZC7XjNw$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray;
    }

    private static String Method2564(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)589708656L ^ 0x23263D70;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1791721261 ^ (long)-1791721428);
            int n2 = (int)1963362754L ^ 0x7506897F;
            cArray2[n] = (char)(cArray[n] ^ ((int)-138843915L ^ 0xF7B93698 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

