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
import lavahack.client.UOp9aIVeGSZJn6Z2lXodUWEdtB61Dcql;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import lavahack.client.kbuMZ0Vk1NB4aprfqPTBCSEfDcvc4xWX$1;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.util.BlockRenderLayer;
import org.lwjgl.opengl.GL11;

public class kbuMZ0Vk1NB4aprfqPTBCSEfDcvc4xWX
extends UOp9aIVeGSZJn6Z2lXodUWEdtB61Dcql {
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
                vertexBuffer.drawArrays((int)((long)-394605402 ^ (long)-394605407));
                GlStateManager.popMatrix();
            }
            OpenGlHelper.glBindBuffer((int)OpenGlHelper.GL_ARRAY_BUFFER, (int)((int)1029419285L ^ 0x3D5BB115));
            GlStateManager.resetColor();
            this.renderChunks.clear();
        }
        this.Method5117();
    }

    private void Method5116() {
        GL11.glEnableClientState((int)((int)((long)-134396486 ^ (long)-134388313) << 2));
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
        GL11.glEnableClientState((int)(((int)-2108159740L ^ 0x8258190B) << 3));
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glEnableClientState((int)((int)((long)-440945134 ^ (long)-440949219) << 3));
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
        GL11.glEnableClientState((int)((int)((long)1680193827 ^ (long)1680210200) << 1));
    }

    private void Method5117() {
        List list = DefaultVertexFormats.BLOCK.getElements();
        Iterator iterator = list.iterator();
        block5: while (iterator.hasNext()) {
            VertexFormatElement vertexFormatElement = (VertexFormatElement)iterator.next();
            VertexFormatElement.EnumUsage enumUsage = vertexFormatElement.getUsage();
            int n = vertexFormatElement.getIndex();
            switch (kbuMZ0Vk1NB4aprfqPTBCSEfDcvc4xWX$1.Field12692[enumUsage.ordinal()]) {
                case 1: {
                    GL11.glDisableClientState((int)((int)((long)102269960 ^ (long)102278165) << 2));
                    break;
                }
                case 2: {
                    OpenGlHelper.setClientActiveTexture((int)(OpenGlHelper.defaultTexUnit + n));
                    GL11.glDisableClientState((int)(((int)2082134437L ^ 0x7C1AC9AA) << 3));
                    OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
                    break;
                }
                case 3: {
                    GL11.glDisableClientState((int)((int)((long)247122537 ^ (long)247106130) << 1));
                    GlStateManager.resetColor();
                    continue block5;
                }
            }
        }
    }

    private void Method5118() {
        GL11.glVertexPointer((int)((int)-412720522L ^ 0xE7666275), (int)((int)((long)1159710133 ^ (long)1159712694) << 1), (int)(((int)1388271479L ^ 0x52BF5770) << 2), (long)0L);
        GL11.glColorPointer((int)(((int)722429270L ^ 0x2B0F6557) << 2), (int)((int)((long)1202871127 ^ (long)1202868054)), (int)(((int)225429520L ^ 0xD6FC817) << 2), (long)(0x3840512CL & 0x4086268CL));
        GL11.glTexCoordPointer((int)((int)((long)-434295669 ^ (long)-434295670) << 1), (int)(((int)1875612629L ^ 0x6FCB99D6) << 1), (int)(((int)1675411114L ^ 0x63DCBEAD) << 2), (long)(0x1C25B9L & 0x20020250L));
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.lightmapTexUnit);
        GL11.glTexCoordPointer((int)((int)((long)791280431 ^ (long)791280430) << 1), (int)((int)((long)496991147 ^ (long)496988586) << 1), (int)((int)((long)-646639575 ^ (long)-646639570) << 2), (long)(0x7900458L & 0x84253B9L));
        OpenGlHelper.setClientActiveTexture((int)OpenGlHelper.defaultTexUnit);
    }

    @Override
    public void renderOverlay() {
        if (!this.initialized) return;
        this.Method5119();
        Iterator iterator = this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                OpenGlHelper.glBindBuffer((int)OpenGlHelper.GL_ARRAY_BUFFER, (int)((int)1397389991L ^ 0x534A7AA7));
                GlStateManager.resetColor();
                this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.clear();
                this.Method5120();
                return;
            }
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 = (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC)((Object)iterator.next());
            VertexBuffer vertexBuffer = aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.getVertexBufferByLayer(BlockRenderLayer.TRANSLUCENT.ordinal());
            GlStateManager.pushMatrix();
            this.preRenderChunk(aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2);
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.multModelviewMatrix();
            vertexBuffer.bindBuffer();
            this.Method5121();
            vertexBuffer.drawArrays((int)((long)-1486375193 ^ (long)-1486375200));
            GlStateManager.popMatrix();
        }
    }

    private void Method5119() {
        GL11.glEnableClientState((int)(((int)-1024248438L ^ 0xC2F31597) << 2));
        GL11.glEnableClientState((int)((int)((long)1245670453 ^ (long)1245654030) << 1));
    }

    private void Method5120() {
        GL11.glDisableClientState((int)(((int)1923331532L ^ 0x72A3F5F7) << 1));
        GL11.glDisableClientState((int)((int)((long)2125181006 ^ (long)2125172819) << 2));
    }

    private void Method5121() {
        GL11.glVertexPointer((int)((int)((long)-307278180 ^ (long)-307278177)), (int)((int)((long)-1244106252 ^ (long)-1244103689) << 1), (int)((int)((long)1644341243 ^ (long)1644341242) << 4), (long)0L);
        GL11.glColorPointer((int)((int)((long)-43634979 ^ (long)-43634980) << 2), (int)((int)-485082281L ^ 0xE3162F56), (int)(((int)-1942902842L ^ 0x8C31A7C7) << 4), (long)(0x2741058EL & 0x4024000CL));
    }
}

