//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/render/objects/world/Abstract3dObject$CubicRendering$Companion;", "", "()V", "release", "", "customFont", "", "setup", "kisman.cc" })
public final class Class1001
{
    private int Field12312;
    
    public final void Method4040() {
        this.Method4042(true);
    }
    
    public final void Method4041() {
        this.Method4043(true);
    }
    
    public final void Method4042(final boolean b) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.tryBlendFuncSeparate(770, 771, 0, 1);
        if (b) {
            GlStateManager.enableTexture2D();
        }
        GlStateManager.depthMask(false);
        GL11.glEnable(2848);
        GL11.glHint(3154, 4354);
        GL11.glLineWidth(Float.intBitsToFloat(1069547520));
    }
    
    public final void Method4043(final boolean b) {
        GL11.glDisable(2848);
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        if (b) {
            GlStateManager.disableTexture2D();
        }
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }
    
    private Class1001() {
    }
    
    public Class1001(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
