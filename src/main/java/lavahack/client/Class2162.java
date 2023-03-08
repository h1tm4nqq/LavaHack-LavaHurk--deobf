//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.renderer.vertex.*;
import net.minecraft.util.math.*;
import net.minecraft.client.renderer.*;

public class Class2162 extends Tessellator
{
    private static Class2162 Field17877;
    private static double Field17878;
    private double Field17879;
    private int Field17880;
    
    public Class2162() {
        this(2097152);
    }
    
    public Class2162(final int n) {
        super(n);
        this.Field17879 = 0.0;
    }
    
    public static Class2162 getInstance() {
        if (Class2162.Field17877 == null) {
            Class2162.Field17877 = new Class2162();
        }
        return Class2162.Field17877;
    }
    
    public void setTranslation(final double n, final double n2, final double n3) {
        this.getBuffer().setTranslation(n, n2, n3);
    }
    
    public void beginQuads() {
        this.begin(7);
    }
    
    public void beginLines() {
        this.begin(1);
    }
    
    public void begin(final int n) {
        this.getBuffer().begin(n, DefaultVertexFormats.POSITION_COLOR);
    }
    
    public void draw() {
        super.draw();
    }
    
    public void setDelta(final double field17879) {
        this.Field17879 = field17879;
    }
    
    public static void setStaticDelta(final double field17878) {
        Class2162.Field17878 = field17878;
    }
    
    public void drawCuboid(final BlockPos blockPos, final int n, final int n2) {
        this.drawCuboid(blockPos, blockPos, n, n2);
    }
    
    public void drawCuboid(final BlockPos blockPos, final BlockPos blockPos2, final int n, final int n2) {
        drawCuboid(this.getBuffer(), blockPos, blockPos2, n, n2, this.Field17879);
    }
    
    public static void drawCuboid(final BufferBuilder bufferBuilder, final BlockPos blockPos, final int n, final int n2) {
        drawCuboid(bufferBuilder, blockPos, blockPos, n, n2);
    }
    
    public static void drawCuboid(final BufferBuilder bufferBuilder, final BlockPos blockPos, final BlockPos blockPos2, final int n, final int n2) {
        drawCuboid(bufferBuilder, blockPos, blockPos2, n, n2, Class2162.Field17878);
    }
    
    private static void drawCuboid(final BufferBuilder bufferBuilder, final BlockPos blockPos, final BlockPos blockPos2, final int n, final int n2, final double n3) {
        if (bufferBuilder.getDrawMode() == -1 || n == 0) {
            return;
        }
        final double n4 = blockPos.getX() - n3;
        final double n5 = blockPos.getY() - n3;
        final double n6 = blockPos.getZ() - n3;
        final double n7 = blockPos2.getX() + 1 + n3;
        final double n8 = blockPos2.getY() + 1 + n3;
        final double n9 = blockPos2.getZ() + 1 + n3;
        switch (bufferBuilder.getDrawMode()) {
            case 7: {
                drawQuads(bufferBuilder, n4, n5, n6, n7, n8, n9, n, n2);
                break;
            }
            case 1: {
                drawLines(bufferBuilder, n4, n5, n6, n7, n8, n9, n, n2);
                break;
            }
            default: {
                throw new IllegalStateException("Unsupported mode!");
            }
        }
    }
    
    public static void drawQuads(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int n7, final int n8) {
        drawQuads(bufferBuilder, n, n2, n3, n4, n5, n6, n7, n8 >>> 24 & 0xFF, n8 >>> 16 & 0xFF, n8 >>> 8 & 0xFF, n8 & 0xFF);
    }
    
    public static void drawQuads(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        if ((n7 & 0x1) != 0x0) {
            bufferBuilder.pos(n4, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n2, n3).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x2) != 0x0) {
            bufferBuilder.pos(n4, n5, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x4) != 0x0) {
            bufferBuilder.pos(n4, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n3).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x8) != 0x0) {
            bufferBuilder.pos(n, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x10) != 0x0) {
            bufferBuilder.pos(n, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n3).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x20) != 0x0) {
            bufferBuilder.pos(n4, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
    }
    
    public static void drawLines(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int n7, final int n8) {
        drawLines(bufferBuilder, n, n2, n3, n4, n5, n6, n7, n8 >>> 24 & 0xFF, n8 >>> 16 & 0xFF, n8 >>> 8 & 0xFF, n8 & 0xFF);
    }
    
    public static void drawLines(final BufferBuilder bufferBuilder, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        if ((n7 & 0x11) != 0x0) {
            bufferBuilder.pos(n, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n2, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x12) != 0x0) {
            bufferBuilder.pos(n, n5, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x21) != 0x0) {
            bufferBuilder.pos(n4, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n2, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x22) != 0x0) {
            bufferBuilder.pos(n4, n5, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x5) != 0x0) {
            bufferBuilder.pos(n, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n2, n3).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x6) != 0x0) {
            bufferBuilder.pos(n, n5, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n3).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x9) != 0x0) {
            bufferBuilder.pos(n, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n2, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0xA) != 0x0) {
            bufferBuilder.pos(n, n5, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x14) != 0x0) {
            bufferBuilder.pos(n, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n3).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x24) != 0x0) {
            bufferBuilder.pos(n4, n2, n3).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n3).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x18) != 0x0) {
            bufferBuilder.pos(n, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
        if ((n7 & 0x28) != 0x0) {
            bufferBuilder.pos(n4, n2, n6).color(n9, n10, n11, n8).endVertex();
            bufferBuilder.pos(n4, n5, n6).color(n9, n10, n11, n8).endVertex();
        }
    }
    
    static {
        Class2162.Field17877 = null;
        Class2162.Field17878 = 0.0;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4FE9 ^ 0x61));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
