//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/util/render/GlStateUtils;", "", "()V", "bindProgram", "", "alpha", "", "state", "", "blend", "cull", "depth", "lighting", "lineSmooth", "popMatrixAll", "pushMatrixAll", "rescale", "width", "", "height", "smooth", "texture2d", "useProgram", "id", "useProgramForce", "kisman.cc" })
public final class Class605
{
    private static int Field10580;
    public static final Class605 Field10581;
    private int Field10582;
    
    public final void Method2614(final int field10580) {
        GL20.glUseProgram(field10580);
        Class605.Field10580 = field10580;
    }
    
    public final void Method2615(final int field10580) {
        if (field10580 != Class605.Field10580) {
            GL20.glUseProgram(field10580);
            Class605.Field10580 = field10580;
        }
    }
    
    public final void Method2616(final boolean b) {
        if (b) {
            GlStateManager.enableAlpha();
        }
        else {
            GlStateManager.disableAlpha();
        }
    }
    
    public final void Method2617(final boolean b) {
        if (b) {
            GlStateManager.enableBlend();
        }
        else {
            GlStateManager.disableBlend();
        }
    }
    
    public final void Method2618(final boolean b) {
        if (b) {
            GlStateManager.shadeModel(7425);
        }
        else {
            GlStateManager.shadeModel(7424);
        }
    }
    
    public final void Method2619(final boolean b) {
        if (b) {
            GL11.glEnable(2848);
            GL11.glHint(3154, 4354);
        }
        else {
            GL11.glDisable(2848);
        }
    }
    
    public final void Method2620(final boolean b) {
        if (b) {
            GlStateManager.enableDepth();
        }
        else {
            GlStateManager.disableDepth();
        }
    }
    
    public final void Method2621(final boolean b) {
        if (b) {
            GlStateManager.enableTexture2D();
        }
        else {
            GlStateManager.disableTexture2D();
        }
    }
    
    public final void Method2622(final boolean b) {
        if (b) {
            GlStateManager.enableCull();
        }
        else {
            GlStateManager.disableCull();
        }
    }
    
    public final void Method2623(final boolean b) {
        if (b) {
            GlStateManager.enableLighting();
        }
        else {
            GlStateManager.disableLighting();
        }
    }
    
    public final void Method2624() {
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPushMatrix();
    }
    
    public final void Method2625() {
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
    }
    
    public final void Method2626(final double n, final double n2) {
        GlStateManager.clear(256);
        GlStateManager.matrixMode(5889);
        GlStateManager.loadIdentity();
        GlStateManager.ortho(0.0, n, n2, 0.0, Double.longBitsToDouble((long)1834299217 ^ 0x408F40006D552F51L), Double.longBitsToDouble((long)1733379939 ^ 0x40A7700067514763L));
        GlStateManager.matrixMode(5888);
        GlStateManager.loadIdentity();
        GlStateManager.translate(0.0f, 0.0f, Float.intBitsToFloat(-990248960));
    }
    
    private Class605() {
    }
    
    static {
        Field10581 = new Class605();
    }
}
