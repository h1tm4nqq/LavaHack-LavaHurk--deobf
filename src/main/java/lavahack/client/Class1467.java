//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.vertex.*;
import net.minecraft.world.*;
import net.minecraft.client.renderer.chunk.*;
import net.minecraft.client.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.renderer.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;

public class Class1467 extends RenderChunk
{
    private final VertexBuffer Field14854;
    private String Field14855 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1467(final World world, final RenderGlobal renderGlobal, final int n) {
        super(world, renderGlobal, n);
        this.Field14854 = (OpenGlHelper.useVbo() ? new VertexBuffer(DefaultVertexFormats.POSITION_COLOR) : null);
    }
    
    public VertexBuffer getVertexBufferByLayer(final int n) {
        return this.Field14854;
    }
    
    public void rebuildChunk(final float n, final float n2, final float n3, final ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        final Class2094 class2094 = new Class2094();
        final BlockPos getPosition = this.getPosition();
        final BlockPos add = getPosition.add(15, 15, 15);
        final BlockPos add2 = getPosition.add(-1, -1, -1);
        final BlockPos add3 = add.add(1, 1, 1);
        chunkCompileTaskGenerator.getLock().lock();
        final Class1479 class2095 = (Class1479)this.getWorld();
        if (chunkCompileTaskGenerator.getStatus() != ChunkCompileTaskGenerator$Status.COMPILING) {
            chunkCompileTaskGenerator.getLock().unlock();
            return;
        }
        if (getPosition.getX() < 0 || getPosition.getZ() < 0 || getPosition.getX() >= class2095.getWidth() || getPosition.getZ() >= class2095.getLength()) {
            chunkCompileTaskGenerator.setCompiledChunk(CompiledChunk.DUMMY);
            chunkCompileTaskGenerator.getLock().unlock();
            return;
        }
        final ChunkCache chunkCache = new ChunkCache(this.getWorld(), add2, add3, 1);
        chunkCompileTaskGenerator.setCompiledChunk((CompiledChunk)class2094);
        chunkCompileTaskGenerator.getLock().unlock();
        final VisGraph visGraph = new VisGraph();
        if (!chunkCache.isEmpty()) {
            ++Class1467.renderChunksUpdated;
            final WorldClient world = Minecraft.getMinecraft().world;
            final BlockRenderLayer translucent = BlockRenderLayer.TRANSLUCENT;
            final BufferBuilder getWorldRendererByLayer = chunkCompileTaskGenerator.getRegionRenderCacheBuilder().getWorldRendererByLayer(translucent);
            Class2162.setStaticDelta(Class32.Field7979);
            final aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[][][] array = new aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[18][18][18];
            final BlockPos$MutableBlockPos blockPos$MutableBlockPos = new BlockPos$MutableBlockPos();
            for (final BlockPos$MutableBlockPos blockPos$MutableBlockPos2 : BlockPos.getAllInBoxMutable(add2, add3)) {
                if (class2095.isInside((BlockPos)blockPos$MutableBlockPos2)) {
                    if (!class2095.Field14898.Method1104(class2095, blockPos$MutableBlockPos2.getY())) {
                        continue;
                    }
                    final int n4 = blockPos$MutableBlockPos2.getX() - add2.getX();
                    final int n5 = blockPos$MutableBlockPos2.getY() - add2.getY();
                    final int n6 = blockPos$MutableBlockPos2.getZ() - add2.getZ();
                    final IBlockState getBlockState = class2095.getBlockState((BlockPos)blockPos$MutableBlockPos2);
                    getBlockState.getBlock();
                    if (getBlockState.isOpaqueCube()) {
                        visGraph.setOpaqueCube((BlockPos)blockPos$MutableBlockPos2);
                    }
                    blockPos$MutableBlockPos.setPos(blockPos$MutableBlockPos2.getX() + class2095.Field14896.getX(), blockPos$MutableBlockPos2.getY() + class2095.Field14896.getY(), blockPos$MutableBlockPos2.getZ() + class2095.Field14896.getZ());
                    final Block getBlock = ((World)world).getBlockState((BlockPos)blockPos$MutableBlockPos).getBlock();
                    final boolean isAirBlock = class2095.isAirBlock((BlockPos)blockPos$MutableBlockPos2);
                    final boolean b = ((World)world).isAirBlock((BlockPos)blockPos$MutableBlockPos) || Class32.Method265(getBlock);
                    if (Class32.Field7978) {}
                    if (!Class32.Field7977 || isAirBlock) {
                        continue;
                    }
                    array[n4][n5][n6] = (aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)Class87.Field8296;
                }
            }
            for (final BlockPos$MutableBlockPos blockPos$MutableBlockPos3 : BlockPos.getAllInBoxMutable(getPosition, add)) {
                final int n7 = blockPos$MutableBlockPos3.getX() - add2.getX();
                final int n8 = blockPos$MutableBlockPos3.getY() - add2.getY();
                final int n9 = blockPos$MutableBlockPos3.getZ() - add2.getZ();
                final Class87 class2096 = (Class87)array[n7][n8][n9];
                if (class2096 != null) {
                    if (!class2094.isLayerStarted(translucent)) {
                        class2094.setLayerStarted(translucent);
                        this.preRenderBlocks(getWorldRendererByLayer, getPosition);
                    }
                    Class2162.drawCuboid(getWorldRendererByLayer, (BlockPos)blockPos$MutableBlockPos3, this.getSides((Class87[][][])array, n7, n8, n9), 0x3F000000 | class2096.Field8297);
                    class2094.setLayerUsed(translucent);
                }
            }
            if (class2094.isLayerStarted(translucent)) {
                this.postRenderBlocks(translucent, n, n2, n3, getWorldRendererByLayer, class2094);
            }
        }
        class2094.setVisibility(visGraph.computeVisibility());
    }
    
    private int getSides(final Class87[][][] array, final int i, final int j, final int k) {
        if (i <= 0 || i >= 17) {
            throw new IndexOutOfBoundsException("x cannot be in padding: " + i);
        }
        if (j <= 0 || j >= 17) {
            throw new IndexOutOfBoundsException("y cannot be in padding: " + j);
        }
        if (k <= 0 || k >= 17) {
            throw new IndexOutOfBoundsException("z cannot be in padding: " + k);
        }
        int n = 0;
        final Class87 class87 = array[i][j][k];
        if (array[i][j - 1][k] != class87) {
            n |= 0x1;
        }
        if (array[i][j + 1][k] != class87) {
            n |= 0x2;
        }
        if (array[i][j][k - 1] != class87) {
            n |= 0x4;
        }
        if (array[i][j][k + 1] != class87) {
            n |= 0x8;
        }
        if (array[i - 1][j][k] != class87) {
            n |= 0x10;
        }
        if (array[i + 1][j][k] != class87) {
            n |= 0x20;
        }
        return n;
    }
    
    private void postRenderBlocks(final BlockRenderLayer blockRenderLayer, final float n, final float n2, final float n3, final BufferBuilder bufferBuilder, final CompiledChunk compiledChunk) {
        if (blockRenderLayer == BlockRenderLayer.TRANSLUCENT && !compiledChunk.isLayerEmpty(blockRenderLayer)) {
            bufferBuilder.sortVertexData(n, n2, n3);
            compiledChunk.setState(bufferBuilder.getVertexState());
        }
        bufferBuilder.finishDrawing();
    }
    
    public void preRenderBlocks(final BufferBuilder bufferBuilder, final BlockPos blockPos) {
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.setTranslation((double)(-blockPos.getX()), (double)(-blockPos.getY()), (double)(-blockPos.getZ()));
    }
    
    public void deleteGlResources() {
        super.deleteGlResources();
        if (this.Field14854 != null) {
            this.Field14854.deleteGlBuffers();
        }
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1832 ^ 0x63));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
