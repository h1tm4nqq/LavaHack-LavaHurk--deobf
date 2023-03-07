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

import lavahack.client.a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr;
import lavahack.client.aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC;
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
public class Ab69MuVR4kkxksx2osBQ0WtXZNaXCgoI
extends ViewFrustum {
    public aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC[] Field15495;
    private String Field15496 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Ab69MuVR4kkxksx2osBQ0WtXZNaXCgoI(World world, int n, RenderGlobal renderGlobal, a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr2) {
        super(world, n, renderGlobal, (IRenderChunkFactory)a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr2);
        this.createRenderOverlays(a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr2);
    }

    protected void createRenderOverlays(a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr2) {
        int n = this.countChunksX * this.countChunksY * this.countChunksZ;
        this.Field15495 = new aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC[n];
        int n2 = (int)((long)1270366181 ^ (long)1270366181);
        int n3 = (int)1775903750L ^ 0x69DA2406;
        while (n3 < this.countChunksX) {
            for (int i = (int)1169083453L ^ 0x45AECC3D; i < this.countChunksY; ++i) {
                for (int j = (int)-1305751940L ^ 0xB22BCE7C; j < this.countChunksZ; ++j) {
                    int n4 = (j * this.countChunksY + i) * this.countChunksX + n3;
                    this.Field15495[n4] = a9CGzjfBsN79tJcFsESk8MLpiTk6Tbrr2.makeRenderOverlay(this.world, this.renderGlobal, n2++);
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
        aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC[] aHsp7hHIuzANEyruZeiq3e1ocuEjb7cCArray = this.Field15495;
        int n = aHsp7hHIuzANEyruZeiq3e1ocuEjb7cCArray.length;
        int n2 = (int)((long)-1563640816 ^ (long)-1563640816);
        while (n2 < n) {
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 = aHsp7hHIuzANEyruZeiq3e1ocuEjb7cCArray[n2];
            aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.deleteGlResources();
            ++n2;
        }
    }

    public void updateChunkPositions(double d, double d2) {
        super.updateChunkPositions(d, d2);
        int n = MathHelper.floor((double)d) - (((int)1337995389L ^ 0x4FC0307C) << 3);
        int n2 = MathHelper.floor((double)d2) - ((int)((long)-67341577 ^ (long)-67341578) << 3);
        int n3 = this.countChunksX * (((int)479942285L ^ 0x1C9B568C) << 4);
        int n4 = (int)((long)-653051963 ^ (long)-653051963);
        while (n4 < this.countChunksX) {
            int n5 = this.getPosition(n, n3, n4);
            for (int i = (int)-204716782L ^ 0xF3CC4512; i < this.countChunksZ; ++i) {
                int n6 = this.getPosition(n2, n3, i);
                for (int j = (int)((long)1189778219 ^ (long)1189778219); j < this.countChunksY; ++j) {
                    int n7 = j * (((int)-1255671090L ^ 0xB527FACF) << 4);
                    BlockPos blockPos = new BlockPos(n5, n7, n6);
                    aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 = this.Field15495[(i * this.countChunksY + j) * this.countChunksX + n4];
                    if (blockPos.equals((Object)aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.getPosition())) continue;
                    aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.setPosition(n5, n7, n6);
                }
            }
            ++n4;
        }
    }

    private int getPosition(int n, int n2, int n3) {
        int n4 = n3 * (((int)-161480053L ^ 0xF660028A) << 4);
        int n5 = n4 - n + n2 / ((int)((long)-184174980 ^ (long)-184174979) << 1);
        if (n5 >= 0) return n4 - n5 / n2 * n2;
        n5 -= n2 - (int)((long)1322938191 ^ (long)1322938190);
        return n4 - n5 / n2 * n2;
    }

    public void markBlocksForUpdate(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        super.markBlocksForUpdate(n, n2, n3, n4, n5, n6, bl);
        int n7 = MathHelper.intFloorDiv((int)n, (int)(((int)-1584630403L ^ 0xA18C757C) << 4));
        int n8 = MathHelper.intFloorDiv((int)n2, (int)((int)((long)-780019903 ^ (long)-780019904) << 4));
        int n9 = MathHelper.intFloorDiv((int)n3, (int)(((int)1762817949L ^ 0x6912779C) << 4));
        int n10 = MathHelper.intFloorDiv((int)n4, (int)(((int)-400893956L ^ 0xE81AD7FD) << 4));
        int n11 = MathHelper.intFloorDiv((int)n5, (int)(((int)1475160121L ^ 0x57ED2838) << 4));
        int n12 = MathHelper.intFloorDiv((int)n6, (int)((int)((long)-2112238352 ^ (long)-2112238351) << 4));
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
                    aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2 = this.Field15495[n17];
                    aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC2.setNeedsUpdate(bl);
                }
            }
            ++n13;
        }
    }

    public aHsp7hHIuzANEyruZeiq3e1ocuEjb7cC getRenderOverlay(BlockPos blockPos) {
        int n = MathHelper.intFloorDiv((int)blockPos.getX(), (int)(((int)-1447194843L ^ 0xA9BD8F24) << 4));
        int n2 = MathHelper.intFloorDiv((int)blockPos.getY(), (int)((int)((long)1592016378 ^ (long)1592016379) << 4));
        int n3 = MathHelper.intFloorDiv((int)blockPos.getZ(), (int)((int)((long)365848288 ^ (long)365848289) << 4));
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

