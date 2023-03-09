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
import lavahack.client.Class1467;
import lavahack.client.Class1957;
import lavahack.client.Class2078;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.BlockRenderLayer;
import org.lwjgl.opengl.GL11;

public class Class1040
extends Class2078 {
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
            for (Class1467 class1467 : this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
                Class1957 class1957 = (Class1957)class1467;
                GlStateManager.pushMatrix();
                this.preRenderChunk(class1467);
                GL11.glCallList((int)class1957.Method7271(BlockRenderLayer.TRANSLUCENT, class1957.getCompiledChunk()));
                GlStateManager.popMatrix();
            }
        }
        GlStateManager.resetColor();
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.clear();
    }
}

