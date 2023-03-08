//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.chunk.*;
import net.minecraft.util.*;

public class Class2094 extends CompiledChunk
{
    private int Field17550;
    
    public void setLayerStarted(final BlockRenderLayer blockRenderLayer) {
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT) {
            super.setLayerStarted(blockRenderLayer);
        }
    }
    
    public void setLayerUsed(final BlockRenderLayer blockRenderLayer) {
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT) {
            super.setLayerUsed(blockRenderLayer);
        }
    }
    
    public boolean isLayerStarted(final BlockRenderLayer blockRenderLayer) {
        return blockRenderLayer == BlockRenderLayer.TRANSLUCENT && super.isLayerStarted(blockRenderLayer);
    }
    
    public boolean isLayerEmpty(final BlockRenderLayer blockRenderLayer) {
        return blockRenderLayer == BlockRenderLayer.TRANSLUCENT && super.isLayerEmpty(blockRenderLayer);
    }
}
