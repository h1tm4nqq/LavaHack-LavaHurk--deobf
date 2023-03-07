//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.chunk.ListedRenderChunk
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.BlockRenderLayer
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.util.Iterator;
import lavahack.client.Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy;
import lavahack.client.UOp9aIVeGSZJn6Z2lXodUWEdtB61Dcql;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.BlockRenderLayer;
import org.lwjgl.opengl.GL11;

public class FXIV2uxTxkBHu5oAcCoArKJnBgEZqFSz
extends UOp9aIVeGSZJn6Z2lXodUWEdtB61Dcql {
    private String Field12585 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method4250(BlockRenderLayer blockRenderLayer) {
        if (!this.initialized) return;
        Iterator iterator = this.renderChunks.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GlStateManager.resetColor();
                this.renderChunks.clear();
                return;
            }
            RenderChunk renderChunk = (RenderChunk)iterator.next();
            ListedRenderChunk listedRenderChunk = (ListedRenderChunk)renderChunk;
            GlStateManager.pushMatrix();
            this.preRenderChunk(renderChunk);
            GL11.glCallList((int)listedRenderChunk.getDisplayList(blockRenderLayer, listedRenderChunk.getCompiledChunk()));
            GlStateManager.popMatrix();
        }
    }

    @Override
    public void renderOverlay() {
        if (this.initialized) {
            for (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 : this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
                Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy = (Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy)aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2;
                GlStateManager.pushMatrix();
                this.preRenderChunk(aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2);
                GL11.glCallList((int)tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy.Method7271(BlockRenderLayer.TRANSLUCENT, tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy.getCompiledChunk()));
                GlStateManager.popMatrix();
            }
        }
        GlStateManager.resetColor();
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.clear();
    }
}

