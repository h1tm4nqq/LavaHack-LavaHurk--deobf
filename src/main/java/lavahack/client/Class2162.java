//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.BlockPos;

public class Class2162
extends Tessellator {
    private static Class2162 Field17877 = null;
    private static double Field17878 = 0.0;
    private double Field17879 = 0.0;
    private int Field17880;

    public Class2162() {
        this(0x200000);
    }

    public Class2162(int n) {
        super(n);
    }

    public static Class2162 getInstance() {
        if (Field17877 != null) return Field17877;
        Field17877 = new Class2162();
        return Field17877;
    }

    public void setTranslation(double d, double d2, double d3) {
        this.getBuffer().setTranslation(d, d2, d3);
    }

    public void beginQuads() {
        this.begin(7);
    }

    public void beginLines() {
        this.begin(1);
    }

    public void begin(int n) {
        this.getBuffer().begin(n, DefaultVertexFormats.POSITION_COLOR);
    }

    public void draw() {
        super.draw();
    }

    public void setDelta(double d) {
        this.Field17879 = d;
    }

    public static void setStaticDelta(double d) {
        Field17878 = d;
    }

    public void drawCuboid(BlockPos blockPos, int n, int n2) {
        this.drawCuboid(blockPos, blockPos, n, n2);
    }

    public void drawCuboid(BlockPos blockPos, BlockPos blockPos2, int n, int n2) {
        Class2162.drawCuboid(this.getBuffer(), blockPos, blockPos2, n, n2, this.Field17879);
    }

    public static void drawCuboid(BufferBuilder bufferBuilder, BlockPos blockPos, int n, int n2) {
        Class2162.drawCuboid(bufferBuilder, blockPos, blockPos, n, n2);
    }

    public static void drawCuboid(BufferBuilder bufferBuilder, BlockPos blockPos, BlockPos blockPos2, int n, int n2) {
        Class2162.drawCuboid(bufferBuilder, blockPos, blockPos2, n, n2, Field17878);
    }

    private static void drawCuboid(BufferBuilder bufferBuilder, BlockPos blockPos, BlockPos blockPos2, int n, int n2, double d) {
        if (bufferBuilder.getDrawMode() == -1) return;
        if (n == 0) {
            return;
        }
        double d2 = (double)blockPos.getX() - d;
        double d3 = (double)blockPos.getY() - d;
        double d4 = (double)blockPos.getZ() - d;
        double d5 = (double)(blockPos2.getX() + 1) + d;
        double d6 = (double)(blockPos2.getY() + 1) + d;
        double d7 = (double)(blockPos2.getZ() + 1) + d;
        switch (bufferBuilder.getDrawMode()) {
            case 7: {
                Class2162.drawQuads(bufferBuilder, d2, d3, d4, d5, d6, d7, n, n2);
                return;
            }
            case 1: {
                Class2162.drawLines(bufferBuilder, d2, d3, d4, d5, d6, d7, n, n2);
                return;
            }
        }
        throw new IllegalStateException("Unsupported mode!");
    }

    public static void drawQuads(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2) {
        int n3 = n2 >>> 24 & 0xFF;
        int n4 = n2 >>> 16 & 0xFF;
        int n5 = n2 >>> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        Class2162.drawQuads(bufferBuilder, d, d2, d3, d4, d5, d6, n, n3, n4, n5, n6);
    }

    public static void drawQuads(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, int n3, int n4, int n5) {
        if ((n & 1) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 2) != 0) {
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 4) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 8) != 0) {
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x10) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x20) == 0) return;
        bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
    }

    public static void drawLines(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2) {
        int n3 = n2 >>> 24 & 0xFF;
        int n4 = n2 >>> 16 & 0xFF;
        int n5 = n2 >>> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        Class2162.drawLines(bufferBuilder, d, d2, d3, d4, d5, d6, n, n3, n4, n5, n6);
    }

    public static void drawLines(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, int n3, int n4, int n5) {
        if ((n & 0x11) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x12) != 0) {
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x21) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x22) != 0) {
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 5) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 6) != 0) {
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 9) != 0) {
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0xA) != 0) {
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x14) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x24) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x18) != 0) {
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & 0x28) == 0) return;
        bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 97;
            cArray2[n] = (char)(cArray[n] ^ (0x4FE9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

