//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.texture.*;
import java.awt.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;

public class Class433 extends Class987
{
    protected Class2034[] Field9808;
    protected Class2034[] Field9809;
    protected Class2034[] Field9810;
    private final int[] Field9811;
    protected DynamicTexture Field9812;
    protected DynamicTexture Field9813;
    protected DynamicTexture Field9814;
    private int Field9815;
    
    public Class433(final Font font, final boolean b, final boolean b2) {
        super(font, b, b2);
        this.Field9808 = new Class2034[2000];
        this.Field9809 = new Class2034[2000];
        this.Field9810 = new Class2034[2000];
        this.Field9811 = new int[32];
        this.Method2073();
        this.Method2071();
    }
    
    public float Method2069(final String s, final double n, final double n2, final int n3) {
        this.Method759(s, n + Class2167.Field17910.Method3263(), n2 + Class2167.Field17910.Method3264(), n3, true);
        return this.Method759(s, n, n2, n3, false);
    }
    
    public float Method2070(final String s, final float n, final float n2, final int n3) {
        return this.Method759(s, n, n2, n3, false);
    }
    
    @Override
    public void Method762(final String s, final float n, final float n2, final int n3) {
        this.Method2069(s, n - this.Method757(s) / 2.0f, n2, n3);
    }
    
    @Override
    public void Method761(final String s, final float n, final float n2, final int n3) {
        this.Method2070(s, n - this.Method757(s) / 2.0f, n2, n3);
    }
    
    @Override
    public float Method759(String method4564, double n, double n2, final int n3, final boolean b) {
        method4564 = Class1119.Field13034.Method4564(method4564);
        int n4 = n3;
        --n;
        n2 -= Double.longBitsToDouble((long)2118315861 ^ 0x400000007E42EF55L);
        if (method4564 == null) {
            return 0.0f;
        }
        if (n4 == 553648127) {
            n4 = 16777215;
        }
        if ((n4 & 0xFC000000) == 0x0) {
            n4 |= 0xFF000000;
        }
        if (b) {
            n4 = ((n4 & 0xFCFCFC) >> 2 | (n4 & 0xFF000000));
        }
        Class2034[] array = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        final float n5 = (n4 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final double n6 = n;
        n *= Double.longBitsToDouble((long)1383477021 ^ 0x4000000052762F1DL);
        n2 *= Double.longBitsToDouble((long)773600299 ^ 0x400000002E1C342BL);
        GL11.glPushMatrix();
        GlStateManager.scale(Double.longBitsToDouble((long)1036702985 ^ 0x3FE000003DCAD509L), Double.longBitsToDouble(4602678819172646912L), Double.longBitsToDouble((long)703708715 ^ 0x3FE0000029F1BE2BL));
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(770, 771);
        GlStateManager.color((n4 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n4 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n4 & 0xFF) / Float.intBitsToFloat(1132396544), n5);
        final int length = method4564.length();
        GlStateManager.enableTexture2D();
        GlStateManager.bindTexture(this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
        GL11.glBindTexture(3553, this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
        for (int i = 0; i < length; ++i) {
            final char char1 = method4564.charAt(i);
            if (char1 == '\n') {
                n = n6;
                n2 += this.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
            }
            else if (char1 == '§') {
                int index = "0123456789abcdefklmnor".indexOf(method4564.charAt(i + 1));
                if (index < 16) {
                    GlStateManager.bindTexture(this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
                    array = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
                    if (index < 0) {
                        index = 15;
                    }
                    if (b) {
                        index += 16;
                    }
                    final int n7 = this.Field9811[index];
                    GlStateManager.color((n7 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n7 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n7 & 0xFF) / Float.intBitsToFloat(1132396544), n5);
                }
                else if (index == 17) {
                    GlStateManager.bindTexture(this.Field9812.getGlTextureId());
                    array = this.Field9808;
                }
                else if (index != 18) {
                    if (index != 19) {
                        if (index == 20) {
                            GlStateManager.bindTexture(this.Field9813.getGlTextureId());
                            array = this.Field9809;
                        }
                        else if (index == 21) {
                            GlStateManager.color((n4 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544), (n4 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544), (n4 & 0xFF) / Float.intBitsToFloat(1132396544), n5);
                            GlStateManager.bindTexture(this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.getGlTextureId());
                            array = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
                        }
                    }
                }
                ++i;
            }
            else if (char1 < array.length) {
                GL11.glBegin(4);
                this.Method746(array, char1, (float)n, (float)n2);
                GL11.glEnd();
                n += array[char1].Field17357 - 8 + this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
            }
        }
        GL11.glHint(3155, 4352);
        GL11.glPopMatrix();
        return (float)n / 2.0f;
    }
    
    @Override
    public int Method757(final String s) {
        if (s == null) {
            return 0;
        }
        if (s.contains("\n")) {
            int max = 0;
            final String[] split = s.split("\n");
            for (int length = split.length, i = 0; i < length; ++i) {
                max = Math.max(max, this.Method757(split[i]));
            }
            return max;
        }
        int n = 0;
        final Class2034[] leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        for (int length2 = s.length(), j = 0; j < length2; ++j) {
            final char char1 = s.charAt(j);
            if (char1 == '§') {
                ++j;
            }
            else if (char1 < leqS0IyKEB621E1SrHdAcHHAUjScjmKi.length) {
                n += leqS0IyKEB621E1SrHdAcHHAUjScjmKi[char1].Field17357 - 8 + this.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
            }
        }
        return n / 2;
    }
    
    @Override
    public void Method754(final Font font) {
        super.Method754(font);
        this.Method2071();
    }
    
    @Override
    public void Method751(final boolean b) {
        super.Method751(b);
        this.Method2071();
    }
    
    @Override
    public void Method750(final boolean b) {
        super.Method750(b);
        this.Method2071();
    }
    
    private void Method2071() {
        this.Field9812 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont(1), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9808);
        this.Field9813 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont(2), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9809);
        this.Field9814 = this.Method2064(this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.deriveFont(3), this.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV, this.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, this.Field9810);
    }
    
    public void Method2072(final double n, final double n2, final double n3, final double n4) {
        GL11.glDisable(3553);
        GL11.glLineWidth(1.0f);
        GL11.glBegin(1);
        GL11.glVertex2d(n, n2);
        GL11.glVertex2d(n3, n4);
        GL11.glEnd();
        GL11.glEnable(3553);
    }
    
    private void Method2073() {
        int n = 0;
        while (true) {
            final int n2 = (n >> 3 & 0x1) * 85;
            this.Field9811[n] = (((n >> 2 & 0x1) * 170 + n2 & 0xFF) << 16 | ((n >> 1 & 0x1) * 170 + n2 & 0xFF) << 8 | ((n & 0x1) * 170 + n2 & 0xFF));
            ++n;
        }
    }
    
    private static String Method2074(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x28B7 ^ 0x0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
