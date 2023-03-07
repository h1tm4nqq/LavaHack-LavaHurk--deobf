//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import kotlin.Metadata;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/util/render/GlStateUtils;", "", "()V", "bindProgram", "", "alpha", "", "state", "", "blend", "cull", "depth", "lighting", "lineSmooth", "popMatrixAll", "pushMatrixAll", "rescale", "width", "", "height", "smooth", "texture2d", "useProgram", "id", "useProgramForce", "kisman.cc"})
public final class DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi {
    private static int Field10580;
    public static final DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi Field10581;
    private int Field10582;

    public final void Method2614(int n) {
        GL20.glUseProgram((int)n);
        Field10580 = n;
    }

    public final void Method2615(int n) {
        if (n == Field10580) return;
        GL20.glUseProgram((int)n);
        Field10580 = n;
    }

    public final void Method2616(boolean bl) {
        if (bl) {
            GlStateManager.enableAlpha();
            return;
        }
        GlStateManager.disableAlpha();
    }

    public final void Method2617(boolean bl) {
        if (bl) {
            GlStateManager.enableBlend();
            return;
        }
        GlStateManager.disableBlend();
    }

    public final void Method2618(boolean bl) {
        if (bl) {
            GlStateManager.shadeModel((int)((int)779698050L ^ 0x2E792283));
            return;
        }
        GlStateManager.shadeModel((int)(((int)-477755890L ^ 0xE3860613) << 8));
    }

    public final void Method2619(boolean bl) {
        if (bl) {
            GL11.glEnable((int)((int)((long)1834158653 ^ (long)1834158692) << 5));
            GL11.glHint((int)((int)((long)-484209096 ^ (long)-484210671) << 1), (int)(((int)-1966666351L ^ 0x8AC70510) << 1));
            return;
        }
        GL11.glDisable((int)((int)((long)389795087 ^ (long)389795158) << 5));
    }

    public final void Method2620(boolean bl) {
        if (bl) {
            GlStateManager.enableDepth();
            return;
        }
        GlStateManager.disableDepth();
    }

    public final void Method2621(boolean bl) {
        if (bl) {
            GlStateManager.enableTexture2D();
            return;
        }
        GlStateManager.disableTexture2D();
    }

    public final void Method2622(boolean bl) {
        if (bl) {
            GlStateManager.enableCull();
            return;
        }
        GlStateManager.disableCull();
    }

    public final void Method2623(boolean bl) {
        if (bl) {
            GlStateManager.enableLighting();
            return;
        }
        GlStateManager.disableLighting();
    }

    public final void Method2624() {
        GL11.glMatrixMode((int)((int)-1262251302L ^ 0xB4C385DB));
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)((int)((long)1203719807 ^ (long)1203719784) << 8));
        GL11.glPushMatrix();
    }

    public final void Method2625() {
        GL11.glMatrixMode((int)((int)((long)517597844 ^ (long)517602709)));
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)((int)((long)1591694301 ^ (long)1591694282) << 8));
        GL11.glPopMatrix();
    }

    public final void Method2626(double d, double d2) {
        GlStateManager.clear((int)((int)((long)1401589207 ^ (long)1401589206) << 8));
        GlStateManager.matrixMode((int)((int)((long)1571745090 ^ (long)1571748419)));
        GlStateManager.loadIdentity();
        GlStateManager.ortho((double)0.0, (double)d, (double)d2, (double)0.0, (double)Double.longBitsToDouble((long)1834299217 ^ 0x408F40006D552F51L), (double)Double.longBitsToDouble((long)1733379939 ^ 0x40A7700067514763L));
        GlStateManager.matrixMode((int)((int)((long)-1887036357 ^ (long)-1887036372) << 8));
        GlStateManager.loadIdentity();
        GlStateManager.translate((float)0.0f, (float)0.0f, (float)Float.intBitsToFloat((int)652717602L ^ 0xE21DAE22));
    }

    private DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi() {
    }

    static {
        DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi dmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi;
        Field10581 = dmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi = new DmYwqHIIQtd46qUH4AIVD9T7oQXk9Lpi();
    }
}

