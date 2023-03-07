//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Font;
import lavahack.client.XvP7gS3PLmwH0ZiDETuLnw1fz7IcbIE9;
import lavahack.client.otatQ0mdWEQRR0BON28RmSa6RYuIuPcL;
import lavahack.client.otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1
extends otatQ0mdWEQRR0BON28RmSa6RYuIuPcL {
    protected otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9808 = new otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)271122727L ^ 0x1029015A) << 4];
    protected otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9809 = new otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)-1758946259 ^ (long)-1758946224) << 4];
    protected otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field9810 = new otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)1882373760L ^ 0x7032BEFD) << 4];
    private final int[] Field9811 = new int[((int)-1502662074L ^ 0xA66F3247) << 5];
    protected DynamicTexture Field9812;
    protected DynamicTexture Field9813;
    protected DynamicTexture Field9814;
    private int Field9815;

    public PF13BUM6sWR9K2FnNnaofFXR4ZX8OzZ1(Font font, boolean bl, boolean bl2) {
        super(font, bl, bl2);
        this.Method2073();
        this.Method2071();
    }

    public float Method2069(String string, double d, double d2, int n) {
        this.Method759(string, d + XvP7gS3PLmwH0ZiDETuLnw1fz7IcbIE9.Field17910.Method3263(), d2 + XvP7gS3PLmwH0ZiDETuLnw1fz7IcbIE9.Field17910.Method3264(), n, (boolean)((long)-1534990612 ^ (long)-1534990611));
        return this.Method759(string, d, d2, n, (boolean)((long)-1257707376 ^ (long)-1257707376));
    }

    public float Method2070(String string, float f, float f2, int n) {
        return this.Method759(string, f, f2, n, (boolean)((long)-1938486468 ^ (long)-1938486468));
    }

    @Override
    public void Method762(String string, float f, float f2, int n) {
        this.Method2069(string, f - (float)this.Method757(string) / 2.0f, f2, n);
    }

    @Override
    public void Method761(String string, float f, float f2, int n) {
        this.Method2070(string, f - (float)this.Method757(string) / 2.0f, f2, n);
    }

    @Override
    public float Method759(String string, double d, double d2, int n, boolean bl) {
        string = zHQdBPjO1BAjzEfjRnBTbQ7HFpoZ8zpS.Field13034.Method4564(string);
        int n2 = n;
        d -= 1.0;
        d2 -= Double.longBitsToDouble((long)2118315861 ^ 0x400000007E42EF55L);
        if (string == null) {
            return 0.0f;
        }
        if (n2 == (int)((long)1907712364 ^ (long)1363844755)) {
            n2 = (int)422280254L ^ 0x19D483C1;
        }
        if ((n2 & (int)((long)1124449501 ^ (long)-1090143011)) == 0) {
            n2 |= (int)-63920315L ^ 0x330A745;
        }
        if (bl) {
            n2 = (n2 & ((int)-656262200L ^ 0xD8DD04F7) << 2) >> (((int)1281361099L ^ 0x4C6004CA) << 1) | n2 & (int)((long)1566883392 ^ (long)-1570456000);
        }
        otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        float f = (float)(n2 >> ((int)((long)252981987 ^ (long)252981984) << 3) & ((int)-1884314778L ^ 0x8FAFA399)) / Float.intBitsToFloat(0x1C7B338E ^ 0x5F04338E);
        int n3 = (int)-1010987557L ^ 0xC3BD8DDB;
        int n4 = (int)-1276716711L ^ 0xB3E6D959;
        int n5 = (int)-1228210205L ^ 0xB6CAFFE3;
        int n6 = (int)1862472387L ^ 0x6F0312C3;
        double d3 = d;
        d *= Double.longBitsToDouble((long)1383477021 ^ 0x4000000052762F1DL);
        d2 *= Double.longBitsToDouble((long)773600299 ^ 0x400000002E1C342BL);
        GL11.glPushMatrix();
        GlStateManager.scale((double)Double.longBitsToDouble((long)1036702985 ^ 0x3FE000003DCAD509L), (double)Double.longBitsToDouble(0xC6987CB4217D4C50L ^ 0xF9787CB4217D4C50L), (double)Double.longBitsToDouble((long)703708715 ^ 0x3FE0000029F1BE2BL));
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)((int)((long)2032610654 ^ (long)2032610527) << 1), (int)((int)((long)-1629623360 ^ (long)-1629624125)));
        GlStateManager.color((float)((float)(n2 >> (((int)-1191530995L ^ 0xB8FAAE0C) << 4) & (int)((long)-29276066 ^ (long)-29275999)) / Float.intBitsToFloat((int)((long)629290072 ^ (long)1727870040))), (float)((float)(n2 >> ((int)((long)-40720587 ^ (long)-40720588) << 3) & (int)((long)-1903474588 ^ (long)-1903474533)) / Float.intBitsToFloat((int)1987408365L ^ 0x350A71ED)), (float)((float)(n2 & (int)((long)53910852 ^ (long)53910971)) / Float.intBitsToFloat(0x5BE1BAB1 ^ 0x189EBAB1)), (float)f);
        int n7 = string.length();
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture((int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
        GL11.glBindTexture((int)((int)((long)-1993875085 ^ (long)-1993872238)), (int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
        int n8 = (int)((long)-1905741177 ^ (long)-1905741177);
        while (true) {
            if (n8 >= n7) {
                GL11.glHint((int)((int)-1350689404L ^ 0xAF7E11D7), (int)((int)((long)1187239251 ^ (long)1187239234) << 8));
                GL11.glPopMatrix();
                return (float)d / 2.0f;
            }
            char c = string.charAt(n8);
            if (c == ((int)1076906601L ^ 0x40304A6C) << 1) {
                d = d3;
                d2 += (double)this.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
            } else if (c == ((int)-357093138L ^ 0xEAB73049)) {
                int n9 = (int)1579025656L ^ 0x5E1E04ED;
                n9 = "0123456789abcdefklmnor".indexOf(string.charAt(n8 + (int)((long)-521033935 ^ (long)-521033936)));
                if (n9 < (int)((long)-194141575 ^ (long)-194141576) << 4) {
                    n3 = (int)-702719462L ^ 0xD61D5A1A;
                    n4 = (int)290118664L ^ 0x114ADC08;
                    n6 = (int)176363036L ^ 0xA83161C;
                    n5 = (int)((long)1677374784 ^ (long)1677374784);
                    GlStateManager.bindTexture((int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
                    otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
                    if (n9 < 0) {
                        n9 = (int)((long)-379908289 ^ (long)-379908304);
                    }
                    if (bl) {
                        n9 += 16;
                    }
                    int n10 = this.Field9811[n9];
                    GlStateManager.color((float)((float)(n10 >> (((int)1756396373L ^ 0x68B07B54) << 4) & ((int)1261980246L ^ 0x4B384AA9)) / Float.intBitsToFloat((int)((long)1709310528 ^ (long)647823936))), (float)((float)(n10 >> ((int)((long)1234351682 ^ (long)1234351683) << 3) & ((int)2069671346L ^ 0x7B5CAD4D)) / Float.intBitsToFloat((int)((long)676927474 ^ (long)1797658610))), (float)((float)(n10 & (int)((long)-760855494 ^ (long)-760855355)) / Float.intBitsToFloat(0x54120456 ^ 0x176D0456)), (float)f);
                } else if (n9 == (int)((long)-1809955171 ^ (long)-1809955188)) {
                    n3 = (int)688131054L ^ 0x29040BEF;
                    GlStateManager.bindTexture((int)this.Field9812.getGlTextureId());
                    otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = this.Field9808;
                } else if (n9 == ((int)36409311L ^ 0x22B8FD6) << 1) {
                    n5 = (int)((long)1556102695 ^ (long)1556102694);
                } else if (n9 == ((int)595512549L ^ 0x237ECCF6)) {
                    n6 = (int)-665862593L ^ 0xD84FBE3E;
                } else if (n9 == (int)((long)-1271342073 ^ (long)-1271342078) << 2) {
                    n4 = (int)((long)-760541970 ^ (long)-760541969);
                    GlStateManager.bindTexture((int)this.Field9813.getGlTextureId());
                    otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = this.Field9809;
                } else if (n9 == ((int)555989782L ^ 0x2123BB03)) {
                    n3 = (int)957811342L ^ 0x39170A8E;
                    n4 = (int)((long)-1397789505 ^ (long)-1397789505);
                    n6 = (int)((long)1314027056 ^ (long)1314027056);
                    n5 = (int)1286689752L ^ 0x4CB153D8;
                    GlStateManager.color((float)((float)(n2 >> (((int)389256042L ^ 0x1733936B) << 4) & ((int)199820843L ^ 0xBE906D4)) / Float.intBitsToFloat((int)2055072009L ^ 0x3902E909)), (float)((float)(n2 >> (((int)720971119L ^ 0x2AF9256E) << 3) & ((int)-167896129L ^ 0xF5FE1B40)) / Float.intBitsToFloat((int)((long)35627658 ^ (long)1096852106))), (float)((float)(n2 & ((int)254535385L ^ 0xF2BE626)) / Float.intBitsToFloat((int)((long)1460177805 ^ (long)343378829))), (float)f);
                    GlStateManager.bindTexture((int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
                    otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
                }
                ++n8;
            } else if (c < otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length) {
                GL11.glBegin((int)((int)((long)-622257673 ^ (long)-622257674) << 2));
                this.Method746(otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, c, (float)d, (float)d2);
                GL11.glEnd();
                d += (double)(otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17357 - (((int)-40513533L ^ 0xFD95D002) << 3) + this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A);
            }
            ++n8;
        }
    }

    @Override
    public int Method757(String string) {
        if (string == null) {
            return (int)((long)-154558688 ^ (long)-154558688);
        }
        if (string.contains("\n")) {
            int n = (int)-1367627137L ^ 0xAE7BAA7F;
            String[] stringArray = string.split("\n");
            int n2 = stringArray.length;
            int n3 = (int)((long)204082685 ^ (long)204082685);
            while (n3 < n2) {
                String string2 = stringArray[n3];
                n = Math.max(n, this.Method757(string2));
                ++n3;
            }
            return n;
        }
        int n = (int)((long)176766189 ^ (long)176766189);
        otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        int n4 = string.length();
        int n5 = (int)((long)-926368991 ^ (long)-926368991);
        while (n5 < n4) {
            char c = string.charAt(n5);
            if (c == ((int)-2073702158L ^ 0x8465D055)) {
                ++n5;
            } else if (c < otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length) {
                n += otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17357 - (((int)-1000769488L ^ 0xC4597831) << 3) + this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
            }
            ++n5;
        }
        return n / (((int)631737786L ^ 0x25A78DBB) << 1);
    }

    @Override
    public void Method754(Font font) {
        super.Method754(font);
        this.Method2071();
    }

    @Override
    public void Method751(boolean bl) {
        super.Method751(bl);
        this.Method2071();
    }

    @Override
    public void Method750(boolean bl) {
        super.Method750(bl);
        this.Method2071();
    }

    private void Method2071() {
        this.Field9812 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont((int)402167043L ^ 0x17F89502), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9808);
        this.Field9813 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont(((int)1962892290L ^ 0x74FF5C03) << 1), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9809);
        this.Field9814 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont((int)-1828423089L ^ 0x93047A4C), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9810);
    }

    public void Method2072(double d, double d2, double d3, double d4) {
        GL11.glDisable((int)((int)-1849105459L ^ 0x91C8EE2C));
        GL11.glLineWidth((float)1.0f);
        GL11.glBegin((int)((int)((long)-2134081895 ^ (long)-2134081896)));
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)((int)((long)1840047594 ^ (long)1840048139)));
    }

    private void Method2073() {
        int n = (int)((long)1886517565 ^ (long)1886517565);
        while (true) {
            int cfr_ignored_0 = (int)((long)1422056363 ^ (long)1422056362) << 5;
            int n2 = (n >> ((int)402791900L ^ 0x18021DDF) & (int)((long)-261787600 ^ (long)-261787599)) * (int)((long)-837029654 ^ (long)-837029697);
            int n3 = (n >> ((int)((long)-1839636622 ^ (long)-1839636621) << 1) & (int)((long)-331983688 ^ (long)-331983687)) * ((int)((long)1475080655 ^ (long)1475080602) << 1) + n2;
            int n4 = (n >> ((int)1909136892L ^ 0x71CB1DFD) & (int)((long)888819983 ^ (long)888819982)) * (((int)1713343190L ^ 0x661F8A83) << 1) + n2;
            int n5 = (n & ((int)-1108513950L ^ 0xBDED6B63)) * (((int)-1016066183L ^ 0xC3700F2C) << 1) + n2;
            int cfr_ignored_1 = ((int)-172145688L ^ 0xF5BD43EB) << 1;
            int cfr_ignored_2 = ((int)621972967L ^ 0x25128DE6) << 4;
            this.Field9811[n] = (n3 & (int)((long)1022656856 ^ (long)1022656935)) << (((int)-1272271555L ^ 0xB42AAD3C) << 4) | (n4 & (int)((long)-188162805 ^ (long)-188162572)) << (((int)1579632593L ^ 0x5E2747D0) << 3) | n5 & ((int)1775753285L ^ 0x69D7D8BA);
            ++n;
        }
    }

    private static String Method2074(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1080842604 ^ (long)-1080842604);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-907721968 ^ (long)-907721745);
            int n2 = (int)-1971751992L ^ 0x8A7973C8;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1848808839L ^ 0x91CD42CE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

