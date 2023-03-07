//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.PUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU;
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

public class aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC
extends RenderChunk {
    private final VertexBuffer Field14854 = OpenGlHelper.useVbo() ? new VertexBuffer(DefaultVertexFormats.POSITION_COLOR) : null;
    private String Field14855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC(World world, RenderGlobal renderGlobal, int n) {
        super(world, renderGlobal, n);
    }

    public VertexBuffer getVertexBufferByLayer(int n) {
        return this.Field14854;
    }

    public void rebuildChunk(float f, float f2, float f3, ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        PUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf = new PUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf();
        BlockPos blockPos = this.getPosition();
        BlockPos blockPos2 = blockPos.add((int)((long)-337126278 ^ (long)-337126283), (int)-1170666730L ^ 0xBA390B19, (int)-1378993857L ^ 0xADCE3930);
        BlockPos blockPos3 = blockPos.add((int)-1076423250L ^ 0x4028EA51, (int)-295235028L ^ 0x1198EDD3, (int)-1406962468L ^ 0x53DC8B23);
        BlockPos blockPos4 = blockPos2.add((int)((long)1033939716 ^ (long)1033939717), (int)((long)1246352030 ^ (long)1246352031), (int)-1940851342L ^ 0x8C50F573);
        chunkCompileTaskGenerator.getLock().lock();
        OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 = (OP4La13R7rceTBm7QSP7XXXyRxZD1Op3)this.getWorld();
        if (chunkCompileTaskGenerator.getStatus() != ChunkCompileTaskGenerator.Status.COMPILING) {
            chunkCompileTaskGenerator.getLock().unlock();
            return;
        }
        if (blockPos.getX() < 0 || blockPos.getZ() < 0 || blockPos.getX() >= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth() || blockPos.getZ() >= oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength()) {
            chunkCompileTaskGenerator.setCompiledChunk(CompiledChunk.DUMMY);
            chunkCompileTaskGenerator.getLock().unlock();
            return;
        }
        ChunkCache chunkCache = new ChunkCache(this.getWorld(), blockPos3, blockPos4, (int)241951860L ^ 0xE6BE475);
        chunkCompileTaskGenerator.setCompiledChunk((CompiledChunk)pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf);
        chunkCompileTaskGenerator.getLock().unlock();
        VisGraph visGraph = new VisGraph();
        if (!chunkCache.isEmpty()) {
            Object object;
            int n;
            int n2;
            int n3;
            renderChunksUpdated += (int)((long)-770722937 ^ (long)-770722938);
            WorldClient worldClient = Minecraft.getMinecraft().world;
            BlockRenderLayer blockRenderLayer = BlockRenderLayer.TRANSLUCENT;
            BufferBuilder bufferBuilder = chunkCompileTaskGenerator.getRegionRenderCacheBuilder().getWorldRendererByLayer(blockRenderLayer);
            ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.setStaticDelta(Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7979);
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[][][] aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray = new aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[(int)((long)1640098107 ^ (long)1640098098) << 1][((int)173837249L ^ 0xA5C8BC8) << 1][((int)-1003914119L ^ 0xC4297C70) << 1];
            BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
            for (BlockPos.MutableBlockPos mutableBlockPos2 : BlockPos.getAllInBoxMutable((BlockPos)blockPos3, (BlockPos)blockPos4)) {
                int n4;
                if (!oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.isInside((BlockPos)mutableBlockPos2) || !oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14898.Method1104(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, mutableBlockPos2.getY())) continue;
                n3 = mutableBlockPos2.getX() - blockPos3.getX();
                n2 = mutableBlockPos2.getY() - blockPos3.getY();
                n = mutableBlockPos2.getZ() - blockPos3.getZ();
                object = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getBlockState((BlockPos)mutableBlockPos2);
                Block block = object.getBlock();
                if (object.isOpaqueCube()) {
                    visGraph.setOpaqueCube((BlockPos)mutableBlockPos2);
                }
                mutableBlockPos.setPos(mutableBlockPos2.getX() + oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.getX(), mutableBlockPos2.getY() + oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.getY(), mutableBlockPos2.getZ() + oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.getZ());
                IBlockState iBlockState = worldClient.getBlockState((BlockPos)mutableBlockPos);
                Block block2 = iBlockState.getBlock();
                boolean bl = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.isAirBlock((BlockPos)mutableBlockPos2);
                int n5 = n4 = worldClient.isAirBlock((BlockPos)mutableBlockPos) || Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method265(block2) ? (int)((long)-1307999751 ^ (long)-1307999752) : (int)((long)2135505582 ^ (long)2135505582);
                if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7978) {
                }
                if (!Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Field7977) continue;
                if (bl) continue;
                aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n3][n2][n] = aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8296;
            }
            for (BlockPos.MutableBlockPos mutableBlockPos2 : BlockPos.getAllInBoxMutable((BlockPos)blockPos, (BlockPos)blockPos2)) {
                n3 = mutableBlockPos2.getX() - blockPos3.getX();
                object = aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n3][n2 = mutableBlockPos2.getY() - blockPos3.getY()][n = mutableBlockPos2.getZ() - blockPos3.getZ()];
                if (object == null) continue;
                if (!pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf.isLayerStarted(blockRenderLayer)) {
                    pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf.setLayerStarted(blockRenderLayer);
                    this.preRenderBlocks(bufferBuilder, blockPos);
                }
                int n6 = this.getSides(aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, n3, n2, n);
                ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawCuboid(bufferBuilder, (BlockPos)mutableBlockPos2, n6, ((int)-38009391L ^ 0xFDBC05EE) << 24 | object.Field8297);
                pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf.setLayerUsed(blockRenderLayer);
            }
            if (pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf.isLayerStarted(blockRenderLayer)) {
                this.postRenderBlocks(blockRenderLayer, f, f2, f3, bufferBuilder, pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf);
            }
        }
        pUhzOpiKPeFPXpBWvuL86eZ2e3M3o9bf.setVisibility(visGraph.computeVisibility());
    }

    private int getSides(aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[][][] aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray, int n, int n2, int n3) {
        if (n <= 0) throw new IndexOutOfBoundsException("x cannot be in padding: " + n);
        if (n >= ((int)-914961858L ^ 0xC976CA2F)) {
            throw new IndexOutOfBoundsException("x cannot be in padding: " + n);
        }
        if (n2 <= 0) throw new IndexOutOfBoundsException("y cannot be in padding: " + n2);
        if (n2 >= ((int)1691346272L ^ 0x64CFE571)) {
            throw new IndexOutOfBoundsException("y cannot be in padding: " + n2);
        }
        if (n3 <= 0) throw new IndexOutOfBoundsException("z cannot be in padding: " + n3);
        if (n3 >= (int)((long)94216670 ^ (long)94216655)) {
            throw new IndexOutOfBoundsException("z cannot be in padding: " + n3);
        }
        int n4 = (int)1547274560L ^ 0x5C398940;
        aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n][n2][n3];
        if (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n][n2 - ((int)-1172190917L ^ 0xBA21C93A)][n3] != aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
            n4 |= (int)((long)970689232 ^ (long)970689233);
        }
        if (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n][n2 + ((int)1804369657L ^ 0x6B8C7EF8)][n3] != aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
            n4 |= (int)((long)-406229909 ^ (long)-406229910) << 1;
        }
        if (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n][n2][n3 - ((int)-835476291L ^ 0xCE33A4BC)] != aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
            n4 |= ((int)1908624929L ^ 0x71C34E20) << 2;
        }
        if (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n][n2][n3 + (int)((long)1677867632 ^ (long)1677867633)] != aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
            n4 |= (int)((long)-1942478901 ^ (long)-1942478902) << 3;
        }
        if (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n - ((int)1493611058L ^ 0x5906B233)][n2][n3] != aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
            n4 |= (int)((long)-2002125896 ^ (long)-2002125895) << 4;
        }
        if (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKiArray[n + (int)((long)752324381 ^ (long)752324380)][n2][n3] == aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) return n4;
        n4 |= ((int)1350909163L ^ 0x50853CEA) << 5;
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
        bufferBuilder.begin((int)-1496623318L ^ 0xA6CB572D, DefaultVertexFormats.POSITION_COLOR);
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
        int n = (int)951920177L ^ 0x38BD2631;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1576287486L ^ 0x5DF43C01);
            int n2 = (int)1539123625L ^ 0x5BBD29CA;
            cArray2[n] = (char)(cArray[n] ^ (((int)-350723897L ^ 0xEB186CDE) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

