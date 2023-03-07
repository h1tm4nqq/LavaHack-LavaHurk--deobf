//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator
 *  net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status
 *  net.minecraft.client.renderer.chunk.CompiledChunk
 *  net.minecraft.client.renderer.chunk.ListedRenderChunk
 *  net.minecraft.client.renderer.chunk.SetVisibility
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.ChunkCache
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import javax.annotation.ParametersAreNonnullByDefault;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.uXWGyY3E4UqFIIGfViLB1sRjvxZ3O8Wg;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.client.renderer.chunk.SetVisibility;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(value=Side.CLIENT)
@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class bTTjLUYiJ1rb5LeaazoxNbmwsWrYVk89
extends ListedRenderChunk {
    private String Field9245 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public bTTjLUYiJ1rb5LeaazoxNbmwsWrYVk89(World world, RenderGlobal renderGlobal, BlockPos blockPos, int n) {
        super(world, renderGlobal, n);
    }

    public void rebuildChunk(float f, float f2, float f3, ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        chunkCompileTaskGenerator.getLock().lock();
        if (chunkCompileTaskGenerator.getStatus() == ChunkCompileTaskGenerator.Status.COMPILING) {
            BlockPos blockPos = this.getPosition();
            OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = (OP4La13R7rceTBm7QSP7XXXyRxZD1Op3)this.getWorld();
            if (blockPos.getX() < 0 || blockPos.getZ() < 0 || blockPos.getX() >= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth() || blockPos.getZ() >= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength()) {
                SetVisibility setVisibility = new SetVisibility();
                setVisibility.setAllVisible(((int)-432101322L ^ 0xE63EA837) != 0);
                CompiledChunk compiledChunk = new CompiledChunk();
                compiledChunk.setVisibility(setVisibility);
                chunkCompileTaskGenerator.setCompiledChunk(compiledChunk);
                chunkCompileTaskGenerator.getLock().unlock();
                return;
            }
        }
        chunkCompileTaskGenerator.getLock().unlock();
        super.rebuildChunk(f, f2, f3, chunkCompileTaskGenerator);
    }

    protected ChunkCache createRegionRenderCache(World world, BlockPos blockPos, BlockPos blockPos2, int n) {
        return new uXWGyY3E4UqFIIGfViLB1sRjvxZ3O8Wg(world, blockPos, blockPos2, n);
    }
}

