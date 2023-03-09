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

public class Class2094
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
        if (blockRenderLayer != BlockRenderLayer.TRANSLUCENT) return false;
        if (!super.isLayerStarted(blockRenderLayer)) return false;
        return true;
    }

    public boolean isLayerEmpty(BlockRenderLayer blockRenderLayer) {
        if (blockRenderLayer != BlockRenderLayer.TRANSLUCENT) return false;
        if (!super.isLayerEmpty(blockRenderLayer)) return false;
        return true;
    }
}

