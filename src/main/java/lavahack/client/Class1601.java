//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.RenderGlobal
 *  net.minecraft.client.renderer.ViewFrustum
 *  net.minecraft.client.renderer.chunk.IRenderChunkFactory
 *  net.minecraft.client.renderer.chunk.RenderChunk
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.World
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 */
package lavahack.client;

import lavahack.client.Class1467;
import lavahack.client.Class1688;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.Nullable;

@SideOnly(value=Side.CLIENT)
public class Class1601
extends ViewFrustum {
    public Class1467[] Field15495;
    private String Field15496 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1601(World world, int n, RenderGlobal renderGlobal, Class1688 class1688) {
        super(world, n, renderGlobal, (IRenderChunkFactory)class1688);
        this.createRenderOverlays(class1688);
    }

    protected void createRenderOverlays(Class1688 class1688) {
        int n = this.countChunksX * this.countChunksY * this.countChunksZ;
        this.Field15495 = new Class1467[n];
        int n2 = 0;
        int n3 = 0;
        while (n3 < this.countChunksX) {
            for (int i = 0; i < this.countChunksY; ++i) {
                for (int j = 0; j < this.countChunksZ; ++j) {
                    int n4 = (j * this.countChunksY + i) * this.countChunksX + n3;
                    this.Field15495[n4] = class1688.makeRenderOverlay(this.world, this.renderGlobal, n2++);
                }
            }
            ++n3;
        }
    }

    @Nullable
    @Nullable
    protected RenderChunk getRenderChunk(BlockPos blockPos) {
        return super.getRenderChunk(blockPos);
    }

    public void deleteGlResources() {
        super.deleteGlResources();
        Class1467[] class1467Array = this.Field15495;
        int n = class1467Array.length;
        int n2 = 0;
        while (n2 < n) {
            Class1467 class1467 = class1467Array[n2];
            class1467.deleteGlResources();
            ++n2;
        }
    }

    public void updateChunkPositions(double d, double d2) {
        super.updateChunkPositions(d, d2);
        int n = MathHelper.floor((double)d) - 8;
        int n2 = MathHelper.floor((double)d2) - 8;
        int n3 = this.countChunksX * 16;
        int n4 = 0;
        while (n4 < this.countChunksX) {
            int n5 = this.getPosition(n, n3, n4);
            for (int i = 0; i < this.countChunksZ; ++i) {
                int n6 = this.getPosition(n2, n3, i);
                for (int j = 0; j < this.countChunksY; ++j) {
                    int n7 = j * 16;
                    BlockPos blockPos = new BlockPos(n5, n7, n6);
                    Class1467 class1467 = this.Field15495[(i * this.countChunksY + j) * this.countChunksX + n4];
                    if (blockPos.equals((Object)class1467.getPosition())) continue;
                    class1467.setPosition(n5, n7, n6);
                }
            }
            ++n4;
        }
    }

    private int getPosition(int n, int n2, int n3) {
        int n4 = n3 * 16;
        int n5 = n4 - n + n2 / 2;
        if (n5 >= 0) return n4 - n5 / n2 * n2;
        n5 -= n2 - 1;
        return n4 - n5 / n2 * n2;
    }

    public void markBlocksForUpdate(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        super.markBlocksForUpdate(n, n2, n3, n4, n5, n6, bl);
        int n7 = MathHelper.intFloorDiv((int)n, (int)16);
        int n8 = MathHelper.intFloorDiv((int)n2, (int)16);
        int n9 = MathHelper.intFloorDiv((int)n3, (int)16);
        int n10 = MathHelper.intFloorDiv((int)n4, (int)16);
        int n11 = MathHelper.intFloorDiv((int)n5, (int)16);
        int n12 = MathHelper.intFloorDiv((int)n6, (int)16);
        int n13 = n7;
        while (n13 <= n10) {
            int n14 = n13 % this.countChunksX;
            if (n14 < 0) {
                n14 += this.countChunksX;
            }
            for (int i = n8; i <= n11; ++i) {
                int n15 = i % this.countChunksY;
                if (n15 < 0) {
                    n15 += this.countChunksY;
                }
                for (int j = n9; j <= n12; ++j) {
                    int n16 = j % this.countChunksZ;
                    if (n16 < 0) {
                        n16 += this.countChunksZ;
                    }
                    int n17 = (n16 * this.countChunksY + n15) * this.countChunksX + n14;
                    Class1467 class1467 = this.Field15495[n17];
                    class1467.setNeedsUpdate(bl);
                }
            }
            ++n13;
        }
    }

    public Class1467 getRenderOverlay(BlockPos blockPos) {
        int n = MathHelper.intFloorDiv((int)blockPos.getX(), (int)16);
        int n2 = MathHelper.intFloorDiv((int)blockPos.getY(), (int)16);
        int n3 = MathHelper.intFloorDiv((int)blockPos.getZ(), (int)16);
        if (n2 < 0) return null;
        if (n2 >= this.countChunksY) return null;
        if ((n %= this.countChunksX) < 0) {
            n += this.countChunksX;
        }
        if ((n3 %= this.countChunksZ) < 0) {
            n3 += this.countChunksZ;
        }
        int n4 = (n3 * this.countChunksY + n2) * this.countChunksX + n;
        return this.Field15495[n4];
    }
}

