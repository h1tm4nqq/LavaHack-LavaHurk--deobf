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
public final class Class1001 {
    private int Field12312;

    public final void Method4040() {
        this.Method4042(true);
    }

    public final void Method4041() {
        this.Method4043(true);
    }

    public final void Method4042(boolean bl) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate((int)770, (int)771, (int)0, (int)1);
        if (bl) {
            GlStateManager.enableTexture2D();
        }
        GlStateManager.depthMask((boolean)false);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)Float.intBitsToFloat(1069547520));
    }

    public final void Method4043(boolean bl) {
        GL11.glDisable((int)2848);
        GlStateManager.depthMask((boolean)true);
        GlStateManager.enableDepth();
        if (bl) {
            GlStateManager.disableTexture2D();
        }
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    private Class1001() {
    }

    public Class1001(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

