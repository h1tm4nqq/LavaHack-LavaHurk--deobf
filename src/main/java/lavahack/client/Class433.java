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
import lavahack.client.Class1119;
import lavahack.client.Class2034;
import lavahack.client.Class2167;
import lavahack.client.Class987;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class Class433
extends Class987 {
    protected Class2034[] Field9808 = new Class2034[2000];
    protected Class2034[] Field9809 = new Class2034[2000];
    protected Class2034[] Field9810 = new Class2034[2000];
    private final int[] Field9811 = new int[32];
    protected DynamicTexture Field9812;
    protected DynamicTexture Field9813;
    protected DynamicTexture Field9814;
    private int Field9815;

    public Class433(Font font, boolean bl, boolean bl2) {
        super(font, bl, bl2);
        this.Method2073();
        this.Method2071();
    }

    public float Method2069(String string, double d, double d2, int n) {
        this.Method759(string, d + Class2167.Field17910.Method3263(), d2 + Class2167.Field17910.Method3264(), n, true);
        return this.Method759(string, d, d2, n, false);
    }

    public float Method2070(String string, float f, float f2, int n) {
        return this.Method759(string, f, f2, n, false);
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
        string = Class1119.Field13034.Method4564(string);
        int n2 = n;
        d -= 1.0;
        d2 -= Double.longBitsToDouble((long)2118315861 ^ 0x400000007E42EF55L);
        if (string == null) {
            return 0.0f;
        }
        if (n2 == 0x20FFFFFF) {
            n2 = 0xFFFFFF;
        }
        if ((n2 & 0xFC000000) == 0) {
            n2 |= 0xFF000000;
        }
        if (bl) {
            n2 = (n2 & 0xFCFCFC) >> 2 | n2 & 0xFF000000;
        }
        Class2034[] class2034Array = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        float f = (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        double d3 = d;
        d *= Double.longBitsToDouble((long)1383477021 ^ 0x4000000052762F1DL);
        d2 *= Double.longBitsToDouble((long)773600299 ^ 0x400000002E1C342BL);
        GL11.glPushMatrix();
        GlStateManager.scale((double)Double.longBitsToDouble((long)1036702985 ^ 0x3FE000003DCAD509L), (double)Double.longBitsToDouble(4602678819172646912L), (double)Double.longBitsToDouble((long)703708715 ^ 0x3FE0000029F1BE2BL));
        GlStateManager.enableBlend();
        GlStateManager.blendFunc((int)770, (int)771);
        GlStateManager.color((float)((float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)((float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)((float)(n2 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)f);
        int n3 = string.length();
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture((int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
        GL11.glBindTexture((int)3553, (int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
        int n4 = 0;
        while (true) {
            if (n4 >= n3) {
                GL11.glHint((int)3155, (int)4352);
                GL11.glPopMatrix();
                return (float)d / 2.0f;
            }
            char c = string.charAt(n4);
            if (c == '\n') {
                d = d3;
                d2 += (double)this.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
            } else if (c == '\u00a7') {
                int n5 = 21;
                n5 = "0123456789abcdefklmnor".indexOf(string.charAt(n4 + 1));
                if (n5 < 16) {
                    bl2 = false;
                    bl3 = false;
                    bl5 = false;
                    bl4 = false;
                    GlStateManager.bindTexture((int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
                    class2034Array = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
                    if (n5 < 0) {
                        n5 = 15;
                    }
                    if (bl) {
                        n5 += 16;
                    }
                    int n6 = this.Field9811[n5];
                    GlStateManager.color((float)((float)(n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)((float)(n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)((float)(n6 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)f);
                } else if (n5 == 17) {
                    bl2 = true;
                    GlStateManager.bindTexture((int)this.Field9812.getGlTextureId());
                    class2034Array = this.Field9808;
                } else if (n5 == 18) {
                    bl4 = true;
                } else if (n5 == 19) {
                    bl5 = true;
                } else if (n5 == 20) {
                    bl3 = true;
                    GlStateManager.bindTexture((int)this.Field9813.getGlTextureId());
                    class2034Array = this.Field9809;
                } else if (n5 == 21) {
                    bl2 = false;
                    bl3 = false;
                    bl5 = false;
                    bl4 = false;
                    GlStateManager.color((float)((float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)((float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)((float)(n2 & 0xFF) / Float.intBitsToFloat(1132396544)), (float)f);
                    GlStateManager.bindTexture((int)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
                    class2034Array = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
                }
                ++n4;
            } else if (c < class2034Array.length) {
                GL11.glBegin((int)4);
                this.Method746(class2034Array, c, (float)d, (float)d2);
                GL11.glEnd();
                d += (double)(class2034Array[c].Field17357 - 8 + this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A);
            }
            ++n4;
        }
    }

    @Override
    public int Method757(String string) {
        if (string == null) {
            return 0;
        }
        if (string.contains("\n")) {
            int n = 0;
            String[] stringArray = string.split("\n");
            int n2 = stringArray.length;
            int n3 = 0;
            while (n3 < n2) {
                String string2 = stringArray[n3];
                n = Math.max(n, this.Method757(string2));
                ++n3;
            }
            return n;
        }
        int n = 0;
        Class2034[] class2034Array = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        int n4 = string.length();
        int n5 = 0;
        while (n5 < n4) {
            char c = string.charAt(n5);
            if (c == '\u00a7') {
                ++n5;
            } else if (c < class2034Array.length) {
                n += class2034Array[c].Field17357 - 8 + this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
            }
            ++n5;
        }
        return n / 2;
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
        this.Field9812 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont(1), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9808);
        this.Field9813 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont(2), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9809);
        this.Field9814 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont(3), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9810);
    }

    public void Method2072(double d, double d2, double d3, double d4) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)1.0f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }

    private void Method2073() {
        int n = 0;
        while (true) {
            int n2 = (n >> 3 & 1) * 85;
            int n3 = (n >> 2 & 1) * 170 + n2;
            int n4 = (n >> 1 & 1) * 170 + n2;
            int n5 = (n & 1) * 170 + n2;
            this.Field9811[n] = (n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | n5 & 0xFF;
            ++n;
        }
    }

    private static String Method2074(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 0;
            cArray2[n] = (char)(cArray[n] ^ (0x28B7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

