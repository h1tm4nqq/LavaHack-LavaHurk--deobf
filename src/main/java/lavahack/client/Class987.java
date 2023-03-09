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
import lavahack.client.Class2034;
import lavahack.client.Class88;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class Class987
extends Class88 {
    private final float Field12228 = Float.intBitsToFloat(0x44000000);
    protected Class2034[] Field12229 = new Class2034[2000];
    protected Font Field12230;
    protected boolean Field12231;
    protected boolean Field12232;
    public int Field12233 = -1;
    protected int Field12234 = 0;
    protected DynamicTexture Field12235;
    public int Field12236 = 2;
    private String Field12237 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class987(Font font, boolean bl, boolean bl2) {
        this.Field12230 = font;
        this.Field12231 = bl;
        this.Field12232 = bl2;
        this.Field12235 = this.Method2064(font, bl, bl2, this.Field12229);
    }

    protected DynamicTexture Method2064(Font font, boolean bl, boolean bl2, Class2034[] class2034Array) {
        BufferedImage bufferedImage = this.Method2065(font, bl, bl2, class2034Array);
        return new DynamicTexture(bufferedImage);
    }

    protected BufferedImage Method2065(Font font, boolean bl, boolean bl2, Class2034[] class2034Array) {
        int n = 512;
        BufferedImage bufferedImage = new BufferedImage(n, n, 2);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(font);
        graphics2D.setColor(new Color(255, 255, 255, 0));
        graphics2D.fillRect(0, 0, n, n);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, bl2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bl ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, bl ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        int n5 = 0;
        while (n5 < class2034Array.length) {
            char c = (char)n5;
            Class2034 class2034 = new Class2034();
            Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c), graphics2D);
            class2034.Field17357 = rectangle2D.getBounds().width + 8;
            class2034.Field17358 = rectangle2D.getBounds().height;
            if (n3 + class2034.Field17357 >= n) {
                n3 = 0;
                n4 += n2;
                n2 = 0;
            }
            if (class2034.Field17358 > n2) {
                n2 = class2034.Field17358;
            }
            class2034.Field17359 = n3;
            class2034.Field17360 = n4;
            if (class2034.Field17358 > this.Field12233) {
                this.Field12233 = class2034.Field17358;
            }
            class2034Array[n5] = class2034;
            graphics2D.drawString(String.valueOf(c), n3 + 2, n4 + fontMetrics.getAscent());
            n3 += class2034.Field17357;
            ++n5;
        }
        return bufferedImage;
    }

    @Override
    public void Method746(Class2034 @NotNull @NotNull [] class2034Array, char c, float f, float f2) throws ArrayIndexOutOfBoundsException {
        this.Method2066(f, f2, class2034Array[c].Field17357, class2034Array[c].Field17358, class2034Array[c].Field17359, class2034Array[c].Field17360, class2034Array[c].Field17357, class2034Array[c].Field17358);
    }

    protected void Method2066(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 / Float.intBitsToFloat(0x44000000);
        float f10 = f6 / Float.intBitsToFloat(0x44000000);
        float f11 = f7 / Float.intBitsToFloat(0x44000000);
        float f12 = f8 / Float.intBitsToFloat(0x44000000);
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
        int n = 0;
        char[] cArray = string.toCharArray();
        int n2 = cArray.length;
        int n3 = 0;
        while (n3 < n2) {
            char c = cArray[n3];
            if (c < this.Field12229.length) {
                n += this.Field12229[c].Field17357 - 8 + this.Field12234;
            }
            ++n3;
        }
        return n / 2;
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
        return 0;
    }

    @Override
    public float Method760(@NotNull @NotNull String string, double d, double d2, int n) {
        return 0.0f;
    }

    @Override
    public boolean Method752() {
        return false;
    }

    @Override
    public boolean Method753() {
        return false;
    }

    @Override
    public int Method755() {
        return 0;
    }

    @Override
    public void Method756(int n) {
    }

    @Override
    public int Method758(@NotNull @NotNull String string) {
        return 0;
    }
}

