//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.OpenGlHelper
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator
 *  net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status
 *  net.minecraft.client.renderer.chunk.CompiledChunk
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.client.renderer.chunk.VisGraph
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.client.renderer.vertex.VertexBuffer
 *  net.minecraft.util.BlockRenderLayer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$MutableBlockPos
 *  net.minecraft.world.ChunkCache
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.Class1479;
import lavahack.client.Class2094;
import lavahack.client.Class2162;
import lavahack.client.Class32;
import lavahack.client.Class87;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.World;

public class Class1467
extends RenderChunk {
    private final VertexBuffer Field14854 = OpenGlHelper.useVbo() ? new VertexBuffer(DefaultVertexFormats.POSITION_COLOR) : null;
    private String Field14855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1467(World world, RenderGlobal renderGlobal, int n) {
        super(world, renderGlobal, n);
    }

    public VertexBuffer getVertexBufferByLayer(int n) {
        return this.Field14854;
    }

    public void rebuildChunk(float f, float f2, float f3, ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        Class2094 class2094 = new Class2094();
        BlockPos blockPos = this.getPosition();
        BlockPos blockPos2 = blockPos.add(15, 15, 15);
        BlockPos blockPos3 = blockPos.add(-1, -1, -1);
        BlockPos blockPos4 = blockPos2.add(1, 1, 1);
        chunkCompileTaskGenerator.getLock().lock();
        Class1479 class1479 = (Class1479)this.getWorld();
        if (chunkCompileTaskGenerator.getStatus() != ChunkCompileTaskGenerator.Status.COMPILING) {
            chunkCompileTaskGenerator.getLock().unlock();
            return;
        }
        if (blockPos.getX() < 0 || blockPos.getZ() < 0 || blockPos.getX() >= class1479.getWidth() || blockPos.getZ() >= class1479.getLength()) {
            chunkCompileTaskGenerator.setCompiledChunk(CompiledChunk.DUMMY);
            chunkCompileTaskGenerator.getLock().unlock();
            return;
        }
        ChunkCache chunkCache = new ChunkCache(this.getWorld(), blockPos3, blockPos4, 1);
        chunkCompileTaskGenerator.setCompiledChunk((CompiledChunk)class2094);
        chunkCompileTaskGenerator.getLock().unlock();
        VisGraph visGraph = new VisGraph();
        if (!chunkCache.isEmpty()) {
            IBlockState iBlockState;
            int n;
            int n2;
            int n3;
            ++renderChunksUpdated;
            WorldClient worldClient = Minecraft.getMinecraft().world;
            BlockRenderLayer blockRenderLayer = BlockRenderLayer.TRANSLUCENT;
            BufferBuilder bufferBuilder = chunkCompileTaskGenerator.getRegionRenderCacheBuilder().getWorldRendererByLayer(blockRenderLayer);
            Class2162.setStaticDelta(Class32.Field7979);
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[][][] leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC.leqS0IyKEB621E1SrHdAcHHAUjScjmKi[18][18][18];
            BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
            for (BlockPos.MutableBlockPos mutableBlockPos2 : BlockPos.getAllInBoxMutable((BlockPos)blockPos3, (BlockPos)blockPos4)) {
                boolean bl;
                if (!class1479.isInside((BlockPos)mutableBlockPos2) || !class1479.Field14898.Method1104(class1479, mutableBlockPos2.getY())) continue;
                n3 = mutableBlockPos2.getX() - blockPos3.getX();
                n2 = mutableBlockPos2.getY() - blockPos3.getY();
                n = mutableBlockPos2.getZ() - blockPos3.getZ();
                iBlockState = class1479.getBlockState((BlockPos)mutableBlockPos2);
                Block block = iBlockState.getBlock();
                if (iBlockState.isOpaqueCube()) {
                    visGraph.setOpaqueCube((BlockPos)mutableBlockPos2);
                }
                mutableBlockPos.setPos(mutableBlockPos2.getX() + class1479.Field14896.getX(), mutableBlockPos2.getY() + class1479.Field14896.getY(), mutableBlockPos2.getZ() + class1479.Field14896.getZ());
                IBlockState iBlockState2 = worldClient.getBlockState((BlockPos)mutableBlockPos);
                Block block2 = iBlockState2.getBlock();
                boolean bl2 = class1479.isAirBlock((BlockPos)mutableBlockPos2);
                boolean bl3 = bl = worldClient.isAirBlock((BlockPos)mutableBlockPos) || Class32.Method265(block2);
                if (Class32.Field7978) {
                }
                if (!Class32.Field7977) continue;
                if (bl2) continue;
                leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n3][n2][n] = Class87.Field8296;
            }
            for (BlockPos.MutableBlockPos mutableBlockPos2 : BlockPos.getAllInBoxMutable((BlockPos)blockPos, (BlockPos)blockPos2)) {
                n3 = mutableBlockPos2.getX() - blockPos3.getX();
                iBlockState = leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n3][n2 = mutableBlockPos2.getY() - blockPos3.getY()][n = mutableBlockPos2.getZ() - blockPos3.getZ()];
                if (iBlockState == null) continue;
                if (!class2094.isLayerStarted(blockRenderLayer)) {
                    class2094.setLayerStarted(blockRenderLayer);
                    this.preRenderBlocks(bufferBuilder, blockPos);
                }
                int n4 = this.getSides((Class87[][][])leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, n3, n2, n);
                Class2162.drawCuboid(bufferBuilder, (BlockPos)mutableBlockPos2, n4, 0x3F000000 | iBlockState.Field8297);
                class2094.setLayerUsed(blockRenderLayer);
            }
            if (class2094.isLayerStarted(blockRenderLayer)) {
                this.postRenderBlocks(blockRenderLayer, f, f2, f3, bufferBuilder, class2094);
            }
        }
        class2094.setVisibility(visGraph.computeVisibility());
    }

    private int getSides(Class87[][][] class87Array, int n, int n2, int n3) {
        if (n <= 0) throw new IndexOutOfBoundsException("x cannot be in padding: " + n);
        if (n >= 17) {
            throw new IndexOutOfBoundsException("x cannot be in padding: " + n);
        }
        if (n2 <= 0) throw new IndexOutOfBoundsException("y cannot be in padding: " + n2);
        if (n2 >= 17) {
            throw new IndexOutOfBoundsException("y cannot be in padding: " + n2);
        }
        if (n3 <= 0) throw new IndexOutOfBoundsException("z cannot be in padding: " + n3);
        if (n3 >= 17) {
            throw new IndexOutOfBoundsException("z cannot be in padding: " + n3);
        }
        int n4 = 0;
        Class87 class87 = class87Array[n][n2][n3];
        if (class87Array[n][n2 - 1][n3] != class87) {
            n4 |= 1;
        }
        if (class87Array[n][n2 + 1][n3] != class87) {
            n4 |= 2;
        }
        if (class87Array[n][n2][n3 - 1] != class87) {
            n4 |= 4;
        }
        if (class87Array[n][n2][n3 + 1] != class87) {
            n4 |= 8;
        }
        if (class87Array[n - 1][n2][n3] != class87) {
            n4 |= 0x10;
        }
        if (class87Array[n + 1][n2][n3] == class87) return n4;
        n4 |= 0x20;
        return n4;
    }

    private void postRenderBlocks(BlockRenderLayer blockRenderLayer, float f, float f2, float f3, BufferBuilder bufferBuilder, CompiledChunk compiledChunk) {
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT && !compiledChunk.isLayerEmpty(blockRenderLayer)) {
            bufferBuilder.sortVertexData(f, f2, f3);
            compiledChunk.setState(bufferBuilder.getVertexState());
        }
        bufferBuilder.finishDrawing();
    }

    public void preRenderBlocks(BufferBuilder bufferBuilder, BlockPos blockPos) {
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.setTranslation((double)(-blockPos.getX()), (double)(-blockPos.getY()), (double)(-blockPos.getZ()));
    }

    public void deleteGlResources() {
        super.deleteGlResources();
        if (this.Field14854 == null) return;
        this.Field14854.deleteGlBuffers();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 99;
            cArray2[n] = (char)(cArray[n] ^ (0x1832 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

