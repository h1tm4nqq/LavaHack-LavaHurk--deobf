//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GLAllocation
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.chunk.CompiledChunk
 *  net.minecraft.util.BlockRenderLayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy
extends aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC {
    private final int Field17025 = GLAllocation.generateDisplayLists((int)((int)((long)440588940 ^ (long)440588941)));
    private String Field17026 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Tm0kFEbVFI8OLVdDSLk9WkpQRt7DCYBy(World world, RenderGlobal renderGlobal, BlockPos blockPos, int n) {
        super(world, renderGlobal, n);
    }

    public int Method7271(BlockRenderLayer blockRenderLayer, CompiledChunk compiledChunk) {
        int n;
        if (!compiledChunk.isLayerEmpty(blockRenderLayer)) {
            n = this.Field17025;
            return n;
        }
        n = (int)((long)-416055509 ^ (long)416055508);
        return n;
    }

    @Override
    public void deleteGlResources() {
        super.deleteGlResources();
        GLAllocation.deleteDisplayLists((int)this.Field17025);
    }
}

