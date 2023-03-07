/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.texture.DynamicTexture
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import lavahack.client.XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0;
import lavahack.client.otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class otatQ0mdWEQRR0BON28RmSa6RYuIuPcL
extends XFDKv2nzCgumb6lLxnd2S4gp8mbth6i0 {
    private final float Field12228 = Float.intBitsToFloat(0x5B719C94 ^ 0x1F719C94);
    protected otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field12229 = new otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1651808815 ^ (long)1651808850) << 4];
    protected Font Field12230;
    protected boolean Field12231;
    protected boolean Field12232;
    public int Field12233 = (int)((long)-1695577477 ^ (long)1695577476);
    protected int Field12234 = (int)-502786722L ^ 0xE208155E;
    protected DynamicTexture Field12235;
    public int Field12236 = ((int)-660295166L ^ 0xD8A4B203) << 1;
    private String Field12237 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public otatQ0mdWEQRR0BON28RmSa6RYuIuPcL(Font font, boolean bl, boolean bl2) {
        this.Field12230 = font;
        this.Field12231 = bl;
        this.Field12232 = bl2;
        this.Field12235 = this.Method2064(font, bl, bl2, this.Field12229);
    }

    protected DynamicTexture Method2064(Font font, boolean bl, boolean bl2, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray) {
        BufferedImage bufferedImage = this.Method2065(font, bl, bl2, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray);
        return new DynamicTexture(bufferedImage);
    }

    protected BufferedImage Method2065(Font font, boolean bl, boolean bl2, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray) {
        int n = ((int)-1425124292L ^ 0xAB0E543D) << 9;
        BufferedImage bufferedImage = new BufferedImage(n, n, ((int)986863629L ^ 0x3AD2580C) << 1);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(font);
        graphics2D.setColor(new Color((int)((long)-428360375 ^ (long)-428360266), (int)((long)-1835895701 ^ (long)-1835895660), (int)((long)1129870711 ^ (long)1129870728), (int)-902654822L ^ 0xCA32949A));
        graphics2D.fillRect((int)243232377L ^ 0xE7F6E79, (int)-1260421789L ^ 0xB4DF7D63, n, n);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, bl2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bl ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, bl ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = (int)((long)228677900 ^ (long)228677900);
        int n3 = (int)((long)1085097537 ^ (long)1085097537);
        int n4 = (int)-1727805588L ^ 0x9903C76D;
        int n5 = (int)342186622L ^ 0x14655A7E;
        while (n5 < otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray.length) {
            char c = (char)n5;
            otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
            Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c), graphics2D);
            otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17357 = rectangle2D.getBounds().width + ((int)((long)563820746 ^ (long)563820747) << 3);
            otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17358 = rectangle2D.getBounds().height;
            if (n3 + otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17357 >= n) {
                n3 = (int)136396683L ^ 0x8213F8B;
                n4 += n2;
                n2 = (int)1468436090L ^ 0x57868E7A;
            }
            if (otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17358 > n2) {
                n2 = otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17358;
            }
            otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17359 = n3;
            otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17360 = n4;
            if (otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17358 > this.Field12233) {
                this.Field12233 = otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17358;
            }
            otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n5] = otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
            graphics2D.drawString(String.valueOf(c), n3 + ((int)((long)-1803007460 ^ (long)-1803007459) << 1), n4 + fontMetrics.getAscent());
            n3 += otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field17357;
            ++n5;
        }
        return bufferedImage;
    }

    @Override
    public void Method746(otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi @NotNull @NotNull [] otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, char c, float f, float f2) throws ArrayIndexOutOfBoundsException {
        this.Method2066(f, f2, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17357, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17358, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17359, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17360, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17357, otatQ0mdWEQRR0BON28RmSa6RYuIuPcL$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[c].Field17358);
    }

    protected void Method2066(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 / Float.intBitsToFloat((int)((long)1326442631 ^ (long)185591943));
        float f10 = f6 / Float.intBitsToFloat((int)((long)1838234352 ^ (long)697383664));
        float f11 = f7 / Float.intBitsToFloat((int)((long)2006256419 ^ (long)865405731));
        float f12 = f8 / Float.intBitsToFloat((int)((long)106302135 ^ (long)1112935095));
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glTexCoord2f((float)f9, (float)f10);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)(f10 + f12));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
    }

    @Override
    public int Method757(String string) {
        int n = (int)((long)-1052310236 ^ (long)-1052310236);
        char[] cArray = string.toCharArray();
        int n2 = cArray.length;
        int n3 = (int)((long)159603802 ^ (long)159603802);
        while (n3 < n2) {
            char c = cArray[n3];
            if (c < this.Field12229.length) {
                n += this.Field12229[c].Field17357 - ((int)((long)-176414817 ^ (long)-176414818) << 3) + this.Field12234;
            }
            ++n3;
        }
        return n / ((int)((long)-1653348158 ^ (long)-1653348157) << 1);
    }

    @Override
    public void Method751(boolean bl) {
        if (this.Field12231 == bl) return;
        this.Field12231 = bl;
        this.Field12235 = this.Method2064(this.Field12230, bl, this.Field12232, this.Field12229);
    }

    public boolean Method2067() {
        return this.Field12232;
    }

    @Override
    public void Method750(boolean bl) {
        if (this.Field12232 == bl) return;
        this.Field12232 = bl;
        this.Field12235 = this.Method2064(this.Field12230, this.Field12231, bl, this.Field12229);
    }

    public Font Method2068() {
        return this.Field12230;
    }

    @Override
    public void Method754(Font font) {
        this.Field12230 = font;
        this.Field12235 = this.Method2064(font, this.Field12231, this.Field12232, this.Field12229);
    }

    @Override
    public void Method748(@NotNull @NotNull String string, int n, int n2, int n3) {
    }

    @Override
    public void Method749(int n, int n2, int n3, int n4) {
    }

    @Override
    public float Method759(@NotNull @NotNull String string, double d, double d2, int n, boolean bl) {
        return 0.0f;
    }

    @Override
    public void Method761(@NotNull @NotNull String string, float f, float f2, int n) {
    }

    @Override
    public void Method762(@NotNull @NotNull String string, float f, float f2, int n) {
    }

    @Override
    public int Method747() {
        return (int)((long)-1706006195 ^ (long)-1706006195);
    }

    @Override
    public float Method760(@NotNull @NotNull String string, double d, double d2, int n) {
        return 0.0f;
    }

    @Override
    public boolean Method752() {
        return (int)((long)-1291781678 ^ (long)-1291781678) != 0;
    }

    @Override
    public boolean Method753() {
        return (int)((long)1458286922 ^ (long)1458286922) != 0;
    }

    @Override
    public int Method755() {
        return (int)((long)1766878197 ^ (long)1766878197);
    }

    @Override
    public void Method756(int n) {
    }

    @Override
    public int Method758(@NotNull @NotNull String string) {
        return (int)1458588506L ^ 0x56F04B5A;
    }
}

