//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.math.Vec3d
 */
package com.kisman.cc.util;

import java.awt.Color;
import java.io.Serializable;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;

public class vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements Serializable {
    public static final int Field17318 = (int)1341750399L ^ 0x4FF97C7F;
    public static final int Field17319 = (int)((long)-344619264 ^ (long)-344619263);
    public static final int Field17320 = ((int)-1863162939L ^ 0x90F263C4) << 1;
    public int Field17321;
    public int Field17322;
    public int Field17323;
    public int Field17324;
    public float Field17325;
    public float Field17326;
    public float Field17327;
    public float Field17328;
    private boolean Field17329;
    private int Field17330;

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(float[] fArray) {
        this(Color.getHSBColor(fArray[(int)((long)-759595195 ^ (long)-759595195)], fArray[(int)((long)-819672482 ^ (long)-819672481)], fArray[(int)((long)1681034375 ^ (long)1681034374) << 1]));
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV() {
        this(Color.RED);
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(int n, int n2, int n3, int n4) {
        this.Field17329 = (int)8051207L ^ 0x7ADA06;
        this.Field17321 = n;
        this.Field17322 = n2;
        this.Field17323 = n3;
        this.Field17324 = n4;
        this.Field17325 = (float)n / Float.intBitsToFloat((int)((long)222247973 ^ (long)1312832549));
        this.Field17326 = (float)n2 / Float.intBitsToFloat(0x58EEC088 ^ 0x1B91C088);
        this.Field17327 = (float)n3 / Float.intBitsToFloat((int)106523891L ^ 0x45266CF3);
        this.Field17328 = (float)n4 / Float.intBitsToFloat(0x3D113E23 ^ 0x7E6E3E23);
        this.Method3624();
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(double d, double d2, double d3, double d4) {
        this((int)d, (int)d2, (int)d3, (int)d4);
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(int n, int n2, int n3) {
        this.Field17329 = (int)797723422L ^ 0x2F8C4B1F;
        this.Field17321 = n;
        this.Field17322 = n2;
        this.Field17323 = n3;
        this.Field17324 = (int)182870768L ^ 0xAE6620F;
        this.Field17325 = (float)n / Float.intBitsToFloat((int)1137639300L ^ 0xB1FF84);
        this.Field17326 = (float)n2 / Float.intBitsToFloat((int)((long)52057535 ^ (long)1080382911));
        this.Field17327 = (float)n3 / Float.intBitsToFloat(0x5A59CFFB ^ 0x1926CFFB);
        this.Field17328 = 1.0f;
        this.Method3624();
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, int n) {
        this.Field17329 = (int)((long)1889903299 ^ (long)1889903298);
        this.Field17321 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321;
        this.Field17322 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17322;
        this.Field17323 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17323;
        this.Field17324 = n;
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat((int)1048076764L ^ 0x7D0761DC);
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat((int)((long)1540909564 ^ (long)413624828));
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat((int)((long)961959406 ^ (long)2049529326));
        this.Field17328 = (float)n / Float.intBitsToFloat(0x20947E13 ^ 0x63EB7E13);
        this.Method3624();
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color color, float f) {
        this(color);
        this.Field17324 = (int)f * (int)((long)1533465244 ^ (long)1533465187);
        this.Field17328 = f;
        this.Method3624();
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(float f, float f2, float f3) {
        this.Field17329 = (int)((long)-653472719 ^ (long)-653472720);
        this.Field17325 = f;
        this.Field17326 = f2;
        this.Field17327 = f3;
        this.Field17328 = 1.0f;
        this.Field17321 = (int)this.Field17325 * ((int)1036812242L ^ 0x3DCC7F2D);
        this.Field17322 = (int)this.Field17326 * (int)((long)344454494 ^ (long)344454561);
        this.Field17323 = (int)this.Field17327 * (int)((long)-361449202 ^ (long)-361448975);
        this.Field17324 = (int)((long)428821779 ^ (long)428821996);
        this.Field17329 = (int)((long)1612869803 ^ (long)1612869803);
        this.Method3624();
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(float f, float f2, float f3, float f4) {
        this.Field17329 = (int)-404948877L ^ 0xE7DCF872;
        this.Field17325 = f;
        this.Field17326 = f2;
        this.Field17327 = f3;
        this.Field17328 = f4;
        this.Field17321 = (int)this.Field17325 * (int)((long)453610086 ^ (long)453610137);
        this.Field17322 = (int)this.Field17326 * ((int)-571295986L ^ 0xDDF2B7F1);
        this.Field17323 = (int)this.Field17327 * (int)((long)-1376691812 ^ (long)-1376691869);
        this.Field17324 = (int)this.Field17328 * (int)((long)726183385 ^ (long)726183206);
        this.Field17329 = (int)((long)1637772631 ^ (long)1637772631);
        this.Method3624();
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(int n) {
        this.Field17329 = (int)1814249487L ^ 0x6C23400E;
        this.Field17321 = n >> ((int)((long)-734450806 ^ (long)-734450805) << 4) & ((int)519729242L ^ 0x1EFA70A5);
        this.Field17322 = n >> ((int)((long)1331857111 ^ (long)1331857110) << 3) & (int)((long)1275953632 ^ (long)1275953439);
        this.Field17323 = n & ((int)1114469697L ^ 0x426D75BE);
        this.Field17324 = n >> ((int)((long)-24095883 ^ (long)-24095882) << 3) & (int)((long)-1416913101 ^ (long)-1416912948);
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat((int)((long)1535944506 ^ (long)418621242));
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat((int)113395233L ^ 0x45BD4621);
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat((int)1108900555L ^ 0x1677ACB);
        this.Field17328 = (float)this.Field17324 / Float.intBitsToFloat(0x655D5EDC ^ 0x26225EDC);
        this.Method3624();
    }

    public Vec3d Method3608() {
        return new Vec3d((double)this.Field17325, (double)this.Field17326, (double)this.Field17327);
    }

    public void Method3609() {
        float[] fArray = this.Method3623();
        double d = Math.ceil((double)(System.currentTimeMillis() + (0x640A0BCCL & 0x180090F9L)) / Double.longBitsToDouble((long)1363230067 ^ 0x4034000051413D73L));
        fArray[(int)((long)-690908660 ^ (long)-690908660)] = (float)((d %= Double.longBitsToDouble(0x1705C5DDFFC1C4FBL ^ 0x577345DDFFC1C4FBL)) / Double.longBitsToDouble(0x626248574887F4A6L ^ 0x2214C8574887F4A6L));
        this.Method3616(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3617(fArray, this.Field17324));
    }

    public void Method3610(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        this.Field17321 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321;
        this.Field17322 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17322;
        this.Field17323 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17323;
        this.Field17324 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17324;
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat(0xF128A11 ^ 0x4C6D8A11);
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat((int)95938638L ^ 0x46C8E84E);
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat(0x4C9E4D4F ^ 0xFE14D4F);
        this.Field17328 = (float)this.Field17324 / Float.intBitsToFloat((int)((long)1961888504 ^ (long)932121336));
        this.Method3624();
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3611(float f) {
        float[] fArray = this.Method3623();
        float[] fArray2 = new float[(int)-600489696L ^ 0xDC354123];
        fArray2[(int)599910353L ^ 0x23C1E7D1] = fArray[(int)-1265274168L ^ 0xB49572C8];
        fArray2[(int)520531212L ^ 0x1F06AD0D] = fArray[(int)939433670L ^ 0x37FE9EC7];
        fArray2[(int)((long)751163437 ^ (long)751163436) << 1] = f;
        this.Method3616(new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(fArray2));
        return this;
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3612(float f) {
        this.Field17324 = (int)(f * Float.intBitsToFloat((int)((long)685057149 ^ (long)1806312573)));
        this.Field17328 = f;
        this.Method3624();
        return this;
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3613(int n) {
        this.Field17324 = n;
        this.Field17328 = (float)n / Float.intBitsToFloat((int)((long)1806790459 ^ (long)684617531));
        this.Method3624();
        return this;
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3614(float f) {
        float[] fArray = this.Method3623();
        float[] fArray2 = new float[(int)((long)319707216 ^ (long)319707219)];
        fArray2[(int)((long)-509033416 ^ (long)-509033416)] = f;
        fArray2[(int)181797143L ^ 0xAD60116] = fArray[(int)778081046L ^ 0x2E609317];
        fArray2[((int)423728903L ^ 0x19419706) << 1] = fArray[(int)((long)455974949 ^ (long)455974948) << 1];
        this.Method3616(new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(fArray2));
        return this;
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3615(float f) {
        float[] fArray = this.Method3623();
        float[] fArray2 = new float[(int)1384558910L ^ 0x5286B13D];
        fArray2[(int)((long)1305498213 ^ (long)1305498213)] = fArray[(int)((long)461851917 ^ (long)461851917)];
        fArray2[(int)((long)1092828073 ^ (long)1092828072)] = f;
        fArray2[((int)434934548L ^ 0x19EC9315) << 1] = fArray[((int)715865656L ^ 0x2AAB3E39) << 1];
        this.Method3616(new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(fArray2));
        return this;
    }

    private void Method3616(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        this.Field17321 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17321;
        this.Field17322 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17322;
        this.Field17323 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17323;
        this.Field17324 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17324;
        this.Field17325 = (float)this.Field17321 / Float.intBitsToFloat((int)851721571L ^ 0x71BB3D63);
        this.Field17326 = (float)this.Field17322 / Float.intBitsToFloat(0xF784177 ^ 0x4C074177);
        this.Field17327 = (float)this.Field17323 / Float.intBitsToFloat((int)((long)1652640136 ^ (long)570313096));
        this.Field17328 = (float)this.Field17324 / Float.intBitsToFloat((int)((long)1797344910 ^ (long)677269134));
        this.Method3624();
    }

    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3617(float[] fArray, int n) {
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(Color.getHSBColor(fArray[(int)((long)-256775959 ^ (long)-256775959)], fArray[(int)((long)-935468331 ^ (long)-935468332)], fArray[((int)-734010058L ^ 0xD43FE537) << 1]), n));
    }

    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3618(float f, float f2, float f3) {
        float[] fArray = new float[(int)((long)1240797074 ^ (long)1240797073)];
        fArray[(int)((long)-637291289 ^ (long)-637291289)] = f;
        fArray[(int)-1138054398L ^ 0xBC2AAB03] = f2;
        fArray[(int)((long)-530482996 ^ (long)-530482995) << 1] = f3;
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method3619(fArray);
    }

    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3619(float[] fArray) {
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color.getHSBColor(fArray[(int)1332544673L ^ 0x4F6D04A1], fArray[(int)100853361L ^ 0x602E670], fArray[(int)((long)-539949597 ^ (long)-539949598) << 1]));
    }

    public float Method3620() {
        return this.Method3623()[(int)-785373591L ^ 0xD1302669];
    }

    public float Method3621() {
        return this.Method3623()[(int)((long)1291645975 ^ (long)1291645974)];
    }

    public float Method3622() {
        return this.Method3623()[((int)1092923112L ^ 0x4124AEE9) << 1];
    }

    public float[] Method3623() {
        return Color.RGBtoHSB(this.Field17321, this.Field17322, this.Field17323, null);
    }

    private void Method3624() {
        if (this.Field17321 > ((int)643378029L ^ 0x26592B92)) {
            this.Field17321 = (int)-1207563993L ^ 0xB80609D8;
        } else if (this.Field17321 < 0) {
            this.Field17321 = (int)311443919L ^ 0x129041CF;
        }
        if (this.Field17322 > (int)((long)1836103447 ^ (long)1836103656)) {
            this.Field17322 = (int)((long)1100756860 ^ (long)1100756867);
        } else if (this.Field17322 < 0) {
            this.Field17322 = (int)((long)44460592 ^ (long)44460592);
        }
        if (this.Field17323 > ((int)1660938524L ^ 0x62FFE9E3)) {
            this.Field17323 = (int)229682035L ^ 0xDB0AB8C;
        } else if (this.Field17323 < 0) {
            this.Field17323 = (int)((long)-1396867774 ^ (long)-1396867774);
        }
        if (this.Field17324 > (int)((long)236983544 ^ (long)236983303)) {
            this.Field17324 = (int)((long)-1320549908 ^ (long)-1320550125);
        } else if (this.Field17324 < 0) {
            this.Field17324 = (int)967522663L ^ 0x39AB3967;
        }
        if (this.Field17325 > 1.0f) {
            this.Field17325 = 1.0f;
        } else if (this.Field17325 < 0.0f) {
            this.Field17325 = 0.0f;
        }
        if (this.Field17326 > 1.0f) {
            this.Field17326 = 1.0f;
        } else if (this.Field17326 < 0.0f) {
            this.Field17326 = 0.0f;
        }
        if (this.Field17327 > 1.0f) {
            this.Field17327 = 1.0f;
        } else if (this.Field17327 < 0.0f) {
            this.Field17327 = 0.0f;
        }
        if (this.Field17328 > 1.0f) {
            this.Field17328 = 1.0f;
            return;
        }
        if (!(this.Field17328 < 0.0f)) return;
        this.Field17328 = 0.0f;
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(Color color) {
        this(color.getRGB());
    }

    public Color Method3625() {
        return new Color(this.Field17321, this.Field17322, this.Field17323, this.Field17324);
    }

    public int Method3626() {
        return new Color(this.Field17321, this.Field17322, this.Field17323, this.Field17324).getRGB();
    }

    public float Method3627() {
        if (!this.Field17329) return this.Field17325;
        return (float)this.Field17321 / Float.intBitsToFloat((int)((long)1613300837 ^ (long)592839781));
    }

    public float Method3628() {
        if (!this.Field17329) return this.Field17326;
        return (float)this.Field17322 / Float.intBitsToFloat(0x2F723FC0 ^ 0x6C0D3FC0);
    }

    public float Method3629() {
        if (!this.Field17329) return this.Field17327;
        return (float)this.Field17323 / Float.intBitsToFloat((int)((long)1569962124 ^ (long)518830220));
    }

    public float Method3630() {
        if (!this.Field17329) return this.Field17328;
        return (float)this.Field17324 / Float.intBitsToFloat(0x4054EEBB ^ 0x32BEEBB);
    }

    public int Method3631() {
        if (!this.Field17329) return (int)this.Field17328 * ((int)-967073811L ^ 0xC65B9F12);
        return this.Field17324;
    }

    public void Method3632() {
        GlStateManager.color((float)this.Field17325, (float)this.Field17326, (float)this.Field17327, (float)this.Method3630());
    }

    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3633(int n) {
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this, n);
    }

    public int Method3634() {
        return this.Field17321;
    }

    public int Method3635() {
        return this.Field17322;
    }

    public int Method3636() {
        return this.Field17323;
    }
}

