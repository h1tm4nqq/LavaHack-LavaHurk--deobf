//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.chunk.CompiledChunk
 *  net.minecraft.util.BlockRenderLayer
 */
package lavahack.client;

import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.BlockRenderLayer;

public class PUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf
extends CompiledChunk {
    private int Field17550;

    public void setLayerStarted(BlockRenderLayer blockRenderLayer) {
        if (blockRenderLayer != BlockRenderLayer.TRANSLUCENT) return;
        super.setLayerStarted(blockRenderLayer);
    }

    public void setLayerUsed(BlockRenderLayer blockRenderLayer) {
        if (blockRenderLayer != BlockRenderLayer.TRANSLUCENT) return;
        super.setLayerUsed(blockRenderLayer);
    }

    public boolean isLayerStarted(BlockRenderLayer blockRenderLayer) {
        int n;
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT && super.isLayerStarted(blockRenderLayer)) {
            n = (int)714478701L ^ 0x2A96146C;
            return n != 0;
        }
        n = (int)1807910142L ^ 0x6BC284FE;
        return n != 0;
    }

    public boolean isLayerEmpty(BlockRenderLayer blockRenderLayer) {
        int n;
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT && super.isLayerEmpty(blockRenderLayer)) {
            n = (int)((long)-29897254 ^ (long)-29897253);
            return n != 0;
        }
        n = (int)((long)1219566305 ^ (long)1219566305);
        return n != 0;
    }
}

