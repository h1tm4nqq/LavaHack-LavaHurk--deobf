//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.texture.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.geom.*;
import org.lwjgl.opengl.*;
import org.jetbrains.annotations.*;

public class Class987 extends Class88
{
    private final float Field12228 = 512.0f;
    protected Class2034[] Field12229;
    protected Font Field12230;
    protected boolean Field12231;
    protected boolean Field12232;
    public int Field12233;
    protected int Field12234;
    protected DynamicTexture Field12235;
    public int Field12236;
    private String Field12237 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class987(final Font field12230, final boolean field12231, final boolean field12232) {
        this.Field12229 = new Class2034[2000];
        this.Field12233 = -1;
        this.Field12234 = 0;
        this.Field12236 = 2;
        this.Field12230 = field12230;
        this.Field12231 = field12231;
        this.Field12232 = field12232;
        this.Field12235 = this.Method2064(field12230, field12231, field12232, this.Field12229);
    }
    
    protected DynamicTexture Method2064(final Font font, final boolean b, final boolean b2, final Class2034[] array) {
        return new DynamicTexture(this.Method2065(font, b, b2, array));
    }
    
    protected BufferedImage Method2065(final Font font, final boolean b, final boolean b2, final Class2034[] array) {
        final int n = 512;
        final BufferedImage bufferedImage = new BufferedImage(n, n, 2);
        final Graphics2D context = (Graphics2D)bufferedImage.getGraphics();
        context.setFont(font);
        context.setColor(new Color(255, 255, 255, 0));
        context.fillRect(0, 0, n, n);
        context.setColor(Color.WHITE);
        context.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, b2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        context.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, b ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        context.setRenderingHint(RenderingHints.KEY_ANTIALIASING, b ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        final FontMetrics fontMetrics = context.getFontMetrics();
        int field17358 = 0;
        int field17359 = 0;
        int field17360 = 1;
        for (int i = 0; i < array.length; ++i) {
            final char c = (char)i;
            final Class2034 class2034 = new Class2034();
            final Rectangle2D stringBounds = fontMetrics.getStringBounds(String.valueOf(c), context);
            class2034.Field17357 = stringBounds.getBounds().width + 8;
            class2034.Field17358 = stringBounds.getBounds().height;
            if (field17359 + class2034.Field17357 >= n) {
                field17359 = 0;
                field17360 += field17358;
                field17358 = 0;
            }
            if (class2034.Field17358 > field17358) {
                field17358 = class2034.Field17358;
            }
            class2034.Field17359 = field17359;
            class2034.Field17360 = field17360;
            if (class2034.Field17358 > this.Field12233) {
                this.Field12233 = class2034.Field17358;
            }
            array[i] = class2034;
            context.drawString(String.valueOf(c), field17359 + 2, field17360 + fontMetrics.getAscent());
            field17359 += class2034.Field17357;
        }
        return bufferedImage;
    }
    
    public void Method746(final Class2034[] array, final char c, final float n, final float n2) throws ArrayIndexOutOfBoundsException {
        this.Method2066(n, n2, (float)array[c].Field17357, (float)array[c].Field17358, (float)array[c].Field17359, (float)array[c].Field17360, (float)array[c].Field17357, (float)array[c].Field17358);
    }
    
    protected void Method2066(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n5 / Float.intBitsToFloat(1140850688);
        final float n10 = n6 / Float.intBitsToFloat(1140850688);
        final float n11 = n7 / Float.intBitsToFloat(1140850688);
        final float n12 = n8 / Float.intBitsToFloat(1140850688);
        GL11.glTexCoord2f(n9 + n11, n10);
        GL11.glVertex2d((double)(n + n3), (double)n2);
        GL11.glTexCoord2f(n9, n10);
        GL11.glVertex2d((double)n, (double)n2);
        GL11.glTexCoord2f(n9, n10 + n12);
        GL11.glVertex2d((double)n, (double)(n2 + n4));
        GL11.glTexCoord2f(n9, n10 + n12);
        GL11.glVertex2d((double)n, (double)(n2 + n4));
        GL11.glTexCoord2f(n9 + n11, n10 + n12);
        GL11.glVertex2d((double)(n + n3), (double)(n2 + n4));
        GL11.glTexCoord2f(n9 + n11, n10);
        GL11.glVertex2d((double)(n + n3), (double)n2);
    }
    
    public int Method757(final String s) {
        int n = 0;
        for (final char c : s.toCharArray()) {
            if (c < this.Field12229.length) {
                n += this.Field12229[c].Field17357 - 8 + this.Field12234;
            }
        }
        return n / 2;
    }
    
    public void Method751(final boolean field12231) {
        if (this.Field12231 != field12231) {
            this.Field12231 = field12231;
            this.Field12235 = this.Method2064(this.Field12230, field12231, this.Field12232, this.Field12229);
        }
    }
    
    public boolean Method2067() {
        return this.Field12232;
    }
    
    public void Method750(final boolean field12232) {
        if (this.Field12232 != field12232) {
            this.Field12232 = field12232;
            this.Field12235 = this.Method2064(this.Field12230, this.Field12231, field12232, this.Field12229);
        }
    }
    
    public Font Method2068() {
        return this.Field12230;
    }
    
    public void Method754(final Font field12230) {
        this.Field12230 = field12230;
        this.Field12235 = this.Method2064(field12230, this.Field12231, this.Field12232, this.Field12229);
    }
    
    public void Method748(@NotNull @NotNull final String s, final int n, final int n2, final int n3) {
    }
    
    public void Method749(final int n, final int n2, final int n3, final int n4) {
    }
    
    public float Method759(@NotNull @NotNull final String s, final double n, final double n2, final int n3, final boolean b) {
        return 0.0f;
    }
    
    public void Method761(@NotNull @NotNull final String s, final float n, final float n2, final int n3) {
    }
    
    public void Method762(@NotNull @NotNull final String s, final float n, final float n2, final int n3) {
    }
    
    public int Method747() {
        return 0;
    }
    
    public float Method760(@NotNull @NotNull final String s, final double n, final double n2, final int n3) {
        return 0.0f;
    }
    
    public boolean Method752() {
        return false;
    }
    
    public boolean Method753() {
        return false;
    }
    
    public int Method755() {
        return 0;
    }
    
    public void Method756(final int n) {
    }
    
    public int Method758(@NotNull @NotNull final String s) {
        return 0;
    }
}
