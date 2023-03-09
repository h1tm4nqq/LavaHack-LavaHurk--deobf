//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.client.renderer.vertex.VertexBuffer
 *  net.minecraft.client.renderer.vertex.VertexFormatElement
 *  net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage
 *  net.minecraft.util.BlockRenderLayer
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1064;
import lavahack.client.Class1467;
import lavahack.client.Class2078;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.util.BlockRenderLayer;
import org.lwjgl.opengl.GL11;

public class Class1278
extends Class2078 {
    private String Field13764 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method5115(BlockRenderLayer blockRenderLayer) {
        this.Method5116();
        if (this.initialized) {
            for (RenderChunk renderChunk : this.renderChunks) {
                VertexBuffer vertexBuffer = renderChunk.getVertexBufferByLayer(blockRenderLayer.ordinal());
                GlStateManager.pushMatrix();
                this.preRenderChunk(renderChunk);
                renderChunk.multModelviewMatrix();
                vertexBuffer.bindBuffer();
                this.Method5118();
                vertexBuffer.drawArrays(7);
                GlStateManager.popMatrix();
            }
            OpenGlHelper.glBindBuffer((int)OpenGlHelper.GL_ARRAY_BUFFER, (int)0);
            GlStateManager.resetColor();
            this.renderChunks.clear();
        }
        this.Method5117();
    }

    private void Method5116() {
        GL11.glEnableClientState((int)32884);
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
        GL11.glEnableClientState((int)32888);
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glEnableClientState((int)32888);
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
        GL11.glEnableClientState((int)32886);
    }

    private void Method5117() {
        List list = DefaultVertexFormats.BLOCK.getElements();
        Iterator iterator = list.iterator();
        block5: while (iterator.hasNext()) {
            VertexFormatElement vertexFormatElement = (VertexFormatElement)iterator.next();
            VertexFormatElement.EnumUsage enumUsage = vertexFormatElement.getUsage();
            int n = vertexFormatElement.getIndex();
            switch (Class1064.Field12692[enumUsage.ordinal()]) {
                case 1: {
                    GL11.glDisableClientState((int)32884);
                    break;
                }
                case 2: {
                    OpenGlHelper.setClientActiveTexture((int)(OpenGlHelper.defaultTexUnit + n));
                    GL11.glDisableClientState((int)32888);
                    OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
                    break;
                }
                case 3: {
                    GL11.glDisableClientState((int)32886);
                    GlStateManager.resetColor();
                    continue block5;
                }
            }
        }
    }

    private void Method5118() {
        GL11.glVertexPointer((int)3, (int)5126, (int)28, (long)0L);
        GL11.glColorPointer((int)4, (int)5121, (int)28, (long)12L);
        GL11.glTexCoordPointer((int)2, (int)5126, (int)28, (long)16L);
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glTexCoordPointer((int)2, (int)5122, (int)28, (long)24L);
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    @Override
    public void renderOverlay() {
        if (!this.initialized) return;
        this.Method5119();
        Iterator iterator = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                OpenGlHelper.glBindBuffer((int)OpenGlHelper.GL_ARRAY_BUFFER, (int)0);
                GlStateManager.resetColor();
                this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.clear();
                this.Method5120();
                return;
            }
            Class1467 class1467 = (Class1467)((Object)iterator.next());
            VertexBuffer vertexBuffer = class1467.getVertexBufferByLayer(BlockRenderLayer.TRANSLUCENT.ordinal());
            GlStateManager.pushMatrix();
            this.preRenderChunk(class1467);
            class1467.multModelviewMatrix();
            vertexBuffer.bindBuffer();
            this.Method5121();
            vertexBuffer.drawArrays(7);
            GlStateManager.popMatrix();
        }
    }

    private void Method5119() {
        GL11.glEnableClientState((int)32884);
        GL11.glEnableClientState((int)32886);
    }

    private void Method5120() {
        GL11.glDisableClientState((int)32886);
        GL11.glDisableClientState((int)32884);
    }

    private void Method5121() {
        GL11.glVertexPointer((int)3, (int)5126, (int)16, (long)0L);
        GL11.glColorPointer((int)4, (int)5121, (int)16, (long)12L);
    }
}

