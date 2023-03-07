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

public class ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU
extends Tessellator {
    private static ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU Field17877 = null;
    private static double Field17878 = 0.0;
    private double Field17879 = 0.0;
    private int Field17880;

    public ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU() {
        this(((int)-2034541489L ^ 0x86BB5C4E) << 21);
    }

    public ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU(int n) {
        super(n);
    }

    public static ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU getInstance() {
        if (Field17877 != null) return Field17877;
        Field17877 = new ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU();
        return Field17877;
    }

    public void setTranslation(double d, double d2, double d3) {
        this.getBuffer().setTranslation(d, d2, d3);
    }

    public void beginQuads() {
        this.begin((int)110594479L ^ 0x69789A8);
    }

    public void beginLines() {
        this.begin((int)-944368546L ^ 0xC7B6145F);
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
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawCuboid(this.getBuffer(), blockPos, blockPos2, n, n2, this.Field17879);
    }

    public static void drawCuboid(BufferBuilder bufferBuilder, BlockPos blockPos, int n, int n2) {
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawCuboid(bufferBuilder, blockPos, blockPos, n, n2);
    }

    public static void drawCuboid(BufferBuilder bufferBuilder, BlockPos blockPos, BlockPos blockPos2, int n, int n2) {
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawCuboid(bufferBuilder, blockPos, blockPos2, n, n2, Field17878);
    }

    private static void drawCuboid(BufferBuilder bufferBuilder, BlockPos blockPos, BlockPos blockPos2, int n, int n2, double d) {
        if (bufferBuilder.getDrawMode() == (int)((long)-1118194661 ^ (long)1118194660)) return;
        if (n == 0) {
            return;
        }
        double d2 = (double)blockPos.getX() - d;
        double d3 = (double)blockPos.getY() - d;
        double d4 = (double)blockPos.getZ() - d;
        double d5 = (double)(blockPos2.getX() + (int)((long)-517229222 ^ (long)-517229221)) + d;
        double d6 = (double)(blockPos2.getY() + ((int)97803672L ^ 0x5D45D99)) + d;
        double d7 = (double)(blockPos2.getZ() + (int)((long)1312112945 ^ (long)1312112944)) + d;
        switch (bufferBuilder.getDrawMode()) {
            case 7: {
                ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawQuads(bufferBuilder, d2, d3, d4, d5, d6, d7, n, n2);
                return;
            }
            case 1: {
                ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawLines(bufferBuilder, d2, d3, d4, d5, d6, d7, n, n2);
                return;
            }
        }
        throw new IllegalStateException("Unsupported mode!");
    }

    public static void drawQuads(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2) {
        int n3 = n2 >>> ((int)((long)-959402285 ^ (long)-959402288) << 3) & (int)((long)-1635718302 ^ (long)-1635718243);
        int n4 = n2 >>> (((int)1316810279L ^ 0x4E7CEE26) << 4) & (int)((long)-770951198 ^ (long)-770951395);
        int n5 = n2 >>> (((int)1580823857L ^ 0x5E397530) << 3) & ((int)1995949051L ^ 0x76F7C304);
        int n6 = n2 & ((int)267575129L ^ 0xFF2DFA6);
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawQuads(bufferBuilder, d, d2, d3, d4, d5, d6, n, n3, n4, n5, n6);
    }

    public static void drawQuads(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, int n3, int n4, int n5) {
        if ((n & ((int)1617662736L ^ 0x606B9311)) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & (int)((long)1764517357 ^ (long)1764517356) << 1) != 0) {
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & (int)((long)-1145865771 ^ (long)-1145865772) << 2) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)-413267363L ^ 0xE75E0A5C) << 3) != 0) {
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)-1222267022L ^ 0xB725AF73) << 4) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)181824387L ^ 0xAD66B82) << 5) == 0) return;
        bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
    }

    public static void drawLines(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2) {
        int n3 = n2 >>> (((int)235360870L ^ 0xE075265) << 3) & (int)((long)-802198749 ^ (long)-802198564);
        int n4 = n2 >>> ((int)((long)-1635465629 ^ (long)-1635465630) << 4) & ((int)-2106973494L ^ 0x826A2235);
        int n5 = n2 >>> ((int)((long)-376244869 ^ (long)-376244870) << 3) & ((int)99922400L ^ 0x5F4B11F);
        int n6 = n2 & ((int)-1909566573L ^ 0x8E2E536C);
        ltO2E5dJ5c6cDscOGKxFbnkHJZ6Z1RqU.drawLines(bufferBuilder, d, d2, d3, d4, d5, d6, n, n3, n4, n5, n6);
    }

    public static void drawLines(BufferBuilder bufferBuilder, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, int n3, int n4, int n5) {
        if ((n & (int)((long)809770794 ^ (long)809770811)) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)-147885092L ^ 0xF72F73D5) << 1) != 0) {
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)118959097L ^ 0x7172BD8)) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)223728962L ^ 0xD55D553) << 1) != 0) {
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & (int)((long)1565299047 ^ (long)1565299042)) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & (int)((long)918334420 ^ (long)918334423) << 1) != 0) {
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & (int)((long)638336529 ^ (long)638336536)) != 0) {
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)94220065L ^ 0x59DAF24) << 1) != 0) {
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)-967946828L ^ 0xC64E4DB1) << 2) != 0) {
            bufferBuilder.pos(d, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & (int)((long)-1647073282 ^ (long)-1647073289) << 2) != 0) {
            bufferBuilder.pos(d4, d2, d3).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d4, d5, d3).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & (int)((long)1608644954 ^ (long)1608644953) << 3) != 0) {
            bufferBuilder.pos(d, d2, d6).color(n3, n4, n5, n2).endVertex();
            bufferBuilder.pos(d, d5, d6).color(n3, n4, n5, n2).endVertex();
        }
        if ((n & ((int)-1391462251L ^ 0xAD0FF890) << 3) == 0) return;
        bufferBuilder.pos(d4, d2, d6).color(n3, n4, n5, n2).endVertex();
        bufferBuilder.pos(d4, d5, d6).color(n3, n4, n5, n2).endVertex();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1686638019 ^ (long)-1686638019);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-373438715 ^ (long)-373438470);
            int n2 = (int)-511625740L ^ 0xE1813595;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1372896857 ^ (long)1372910000) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

