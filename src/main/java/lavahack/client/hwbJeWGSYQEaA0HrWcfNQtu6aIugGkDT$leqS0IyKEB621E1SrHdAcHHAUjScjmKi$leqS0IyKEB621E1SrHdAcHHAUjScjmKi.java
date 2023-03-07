//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/render/objects/world/Abstract3dObject$CubicRendering$Companion;", "", "()V", "release", "", "customFont", "", "setup", "kisman.cc"})
public final class hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private int Field12312;

    public final void Method4040() {
        this.Method4042(((int)2064040611L ^ 0x7B06C2A2) != 0);
    }

    public final void Method4041() {
        this.Method4043(((int)-69323558L ^ 0xFBDE34DB) != 0);
    }

    public final void Method4042(boolean bl) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)(((int)510741604L ^ 0x1E714DE5) << 1), (int)((int)-815428332L ^ 0xCF658E17), (int)((int)1672185618L ^ 0x63AB8712), (int)((int)((long)74109070 ^ (long)74109071)));
        if (bl) {
            GlStateManager.enableTexture2D();
        }
        GlStateManager.depthMask(((int)-1310730182L ^ 0xB1DFD83A) != 0);
        GL11.glEnable((int)(((int)-1172569619L ^ 0xBA1C01B4) << 5));
        GL11.glHint((int)(((int)-1274532987L ^ 0xB4082DAC) << 1), (int)(((int)61892900L ^ 0x3B061A5) << 1));
        GL11.glLineWidth((float)Float.intBitsToFloat((int)137184198L ^ 0x37ED43C6));
    }

    public final void Method4043(boolean bl) {
        GL11.glDisable((int)(((int)-2009829453L ^ 0x88346FEA) << 5));
        GlStateManager.depthMask(((int)207789393L ^ 0xC629D50) != 0);
        GlStateManager.enableDepth();
        if (bl) {
            GlStateManager.disableTexture2D();
        }
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    private hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public hwbJeWGSYQEaA0HrWcfNQtu6aIugGkDT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

