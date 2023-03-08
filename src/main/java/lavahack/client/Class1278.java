//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.vertex.*;

public class Class1278 extends Class2078
{
    private String Field13764 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method5115(final BlockRenderLayer blockRenderLayer) {
        this.Method5116();
        if (this.initialized) {
            for (final RenderChunk renderChunk : this.renderChunks) {
                final VertexBuffer getVertexBufferByLayer = renderChunk.getVertexBufferByLayer(blockRenderLayer.ordinal());
                GlStateManager.pushMatrix();
                this.preRenderChunk(renderChunk);
                renderChunk.multModelviewMatrix();
                getVertexBufferByLayer.bindBuffer();
                this.Method5118();
                getVertexBufferByLayer.drawArrays(7);
                GlStateManager.popMatrix();
            }
            OpenGlHelper.glBindBuffer(OpenGlHelper.GL_ARRAY_BUFFER, 0);
            GlStateManager.resetColor();
            this.renderChunks.clear();
        }
        this.Method5117();
    }
    
    private void Method5116() {
        GL11.glEnableClientState(32884);
        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glEnableClientState(32888);
        OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glEnableClientState(32888);
        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glEnableClientState(32886);
    }
    
    private void Method5117() {
        for (final VertexFormatElement vertexFormatElement : DefaultVertexFormats.BLOCK.getElements()) {
            final VertexFormatElement$EnumUsage getUsage = vertexFormatElement.getUsage();
            final int getIndex = vertexFormatElement.getIndex();
            switch (Class1064.Field12692[getUsage.ordinal()]) {
                case 1: {
                    GL11.glDisableClientState(32884);
                    continue;
                }
                case 2: {
                    OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit + getIndex);
                    GL11.glDisableClientState(32888);
                    OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
                    continue;
                }
                case 3: {
                    GL11.glDisableClientState(32886);
                    GlStateManager.resetColor();
                    continue;
                }
            }
        }
    }
    
    private void Method5118() {
        GL11.glVertexPointer(3, 5126, 28, 0L);
        GL11.glColorPointer(4, 5121, 28, 12L);
        GL11.glTexCoordPointer(2, 5126, 28, 16L);
        OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glTexCoordPointer(2, 5122, 28, 24L);
        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    @Override
    public void renderOverlay() {
        if (this.initialized) {
            this.Method5119();
            for (final Class1467 class1467 : this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
                final VertexBuffer getVertexBufferByLayer = class1467.getVertexBufferByLayer(BlockRenderLayer.TRANSLUCENT.ordinal());
                GlStateManager.pushMatrix();
                this.preRenderChunk((RenderChunk)class1467);
                class1467.multModelviewMatrix();
                getVertexBufferByLayer.bindBuffer();
                this.Method5121();
                getVertexBufferByLayer.drawArrays(7);
                GlStateManager.popMatrix();
            }
            OpenGlHelper.glBindBuffer(OpenGlHelper.GL_ARRAY_BUFFER, 0);
            GlStateManager.resetColor();
            this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.clear();
            this.Method5120();
        }
    }
    
    private void Method5119() {
        GL11.glEnableClientState(32884);
        GL11.glEnableClientState(32886);
    }
    
    private void Method5120() {
        GL11.glDisableClientState(32886);
        GL11.glDisableClientState(32884);
    }
    
    private void Method5121() {
        GL11.glVertexPointer(3, 5126, 16, 0L);
        GL11.glColorPointer(4, 5121, 16, 12L);
    }
}
