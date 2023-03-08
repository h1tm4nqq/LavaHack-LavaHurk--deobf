//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.client.renderer.*;
import org.lwjgl.opengl.*;
import java.util.*;

public class Class1040 extends Class2078
{
    private String Field12585 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method4250(final BlockRenderLayer blockRenderLayer) {
        if (this.initialized) {
            for (final RenderChunk renderChunk : this.renderChunks) {
                final ListedRenderChunk listedRenderChunk = (ListedRenderChunk)renderChunk;
                GlStateManager.pushMatrix();
                this.preRenderChunk(renderChunk);
                GL11.glCallList(listedRenderChunk.getDisplayList(blockRenderLayer, listedRenderChunk.getCompiledChunk()));
                GlStateManager.popMatrix();
            }
            GlStateManager.resetColor();
            this.renderChunks.clear();
        }
    }
    
    @Override
    public void renderOverlay() {
        if (this.initialized) {
            for (final Class1467 class1467 : this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
                final Class1957 class1468 = (Class1957)class1467;
                GlStateManager.pushMatrix();
                this.preRenderChunk((RenderChunk)class1467);
                GL11.glCallList(class1468.Method7271(BlockRenderLayer.TRANSLUCENT, class1468.getCompiledChunk()));
                GlStateManager.popMatrix();
            }
        }
        GlStateManager.resetColor();
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.clear();
    }
}
