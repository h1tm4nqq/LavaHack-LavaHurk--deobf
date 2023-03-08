//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraftforge.fml.relauncher.*;
import net.minecraft.world.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.chunk.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.math.*;

@SideOnly(Side.CLIENT)
public class Class1601 extends ViewFrustum
{
    public Class1467[] Field15495;
    private String Field15496 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1601(final World world, final int n, final RenderGlobal renderGlobal, final Class1688 class1688) {
        super(world, n, renderGlobal, (IRenderChunkFactory)class1688);
        this.createRenderOverlays(class1688);
    }
    
    protected void createRenderOverlays(final Class1688 class1688) {
        this.Field15495 = new Class1467[this.countChunksX * this.countChunksY * this.countChunksZ];
        int n = 0;
        for (int i = 0; i < this.countChunksX; ++i) {
            for (int j = 0; j < this.countChunksY; ++j) {
                for (int k = 0; k < this.countChunksZ; ++k) {
                    this.Field15495[(k * this.countChunksY + j) * this.countChunksX + i] = class1688.makeRenderOverlay(this.world, this.renderGlobal, n++);
                }
            }
        }
    }
    
    @Nullable
    @Nullable
    protected RenderChunk getRenderChunk(final BlockPos blockPos) {
        return super.getRenderChunk(blockPos);
    }
    
    public void deleteGlResources() {
        super.deleteGlResources();
        final Class1467[] field15495 = this.Field15495;
        for (int length = field15495.length, i = 0; i < length; ++i) {
            field15495[i].deleteGlResources();
        }
    }
    
    public void updateChunkPositions(final double n, final double n2) {
        super.updateChunkPositions(n, n2);
        final int n3 = MathHelper.floor(n) - 8;
        final int n4 = MathHelper.floor(n2) - 8;
        final int n5 = this.countChunksX * 16;
        for (int i = 0; i < this.countChunksX; ++i) {
            final int position = this.getPosition(n3, n5, i);
            for (int j = 0; j < this.countChunksZ; ++j) {
                final int position2 = this.getPosition(n4, n5, j);
                for (int k = 0; k < this.countChunksY; ++k) {
                    final int n6 = k * 16;
                    final Class1467 class1467 = this.Field15495[(j * this.countChunksY + k) * this.countChunksX + i];
                    if (!new BlockPos(position, n6, position2).equals((Object)class1467.getPosition())) {
                        class1467.setPosition(position, n6, position2);
                    }
                }
            }
        }
    }
    
    private int getPosition(final int n, final int n2, final int n3) {
        final int n4 = n3 * 16;
        int n5 = n4 - n + n2 / 2;
        if (n5 < 0) {
            n5 -= n2 - 1;
        }
        return n4 - n5 / n2 * n2;
    }
    
    public void markBlocksForUpdate(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b) {
        super.markBlocksForUpdate(n, n2, n3, n4, n5, n6, b);
        final int intFloorDiv = MathHelper.intFloorDiv(n, 16);
        final int intFloorDiv2 = MathHelper.intFloorDiv(n2, 16);
        final int intFloorDiv3 = MathHelper.intFloorDiv(n3, 16);
        final int intFloorDiv4 = MathHelper.intFloorDiv(n4, 16);
        final int intFloorDiv5 = MathHelper.intFloorDiv(n5, 16);
        final int intFloorDiv6 = MathHelper.intFloorDiv(n6, 16);
        for (int i = intFloorDiv; i <= intFloorDiv4; ++i) {
            int n7 = i % this.countChunksX;
            if (n7 < 0) {
                n7 += this.countChunksX;
            }
            for (int j = intFloorDiv2; j <= intFloorDiv5; ++j) {
                int n8 = j % this.countChunksY;
                if (n8 < 0) {
                    n8 += this.countChunksY;
                }
                for (int k = intFloorDiv3; k <= intFloorDiv6; ++k) {
                    int n9 = k % this.countChunksZ;
                    if (n9 < 0) {
                        n9 += this.countChunksZ;
                    }
                    this.Field15495[(n9 * this.countChunksY + n8) * this.countChunksX + n7].setNeedsUpdate(b);
                }
            }
        }
    }
    
    public Class1467 getRenderOverlay(final BlockPos blockPos) {
        final int intFloorDiv = MathHelper.intFloorDiv(blockPos.getX(), 16);
        final int intFloorDiv2 = MathHelper.intFloorDiv(blockPos.getY(), 16);
        final int intFloorDiv3 = MathHelper.intFloorDiv(blockPos.getZ(), 16);
        if (intFloorDiv2 >= 0 && intFloorDiv2 < this.countChunksY) {
            int n = intFloorDiv % this.countChunksX;
            if (n < 0) {
                n += this.countChunksX;
            }
            int n2 = intFloorDiv3 % this.countChunksZ;
            if (n2 < 0) {
                n2 += this.countChunksZ;
            }
            return this.Field15495[(n2 * this.countChunksY + intFloorDiv2) * this.countChunksX + n];
        }
        return null;
    }
}
