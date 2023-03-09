//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.client.renderer.GlStateManager
 *  org.lwjgl.util.vector.Quaternion
 */
package lavahack.client;

import java.util.Arrays;
import lavahack.client.Class1075;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.util.vector.Quaternion;

public class Class501 {
    public static Quaternion[] Field10082 = new Quaternion[]{new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion()};
    public static int[][][] Field10083 = new int[][][]{new int[][]{{17, 9, 0}, {20, 16, 3}, {23, 15, 6}}, new int[][]{{18, 10, 1}, {21, -1, 4}, {24, 14, 7}}, new int[][]{{19, 11, 2}, {22, 12, 5}, {25, 13, 8}}};
    public static int[][] Field10084 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8}, {19, 18, 17, 22, 21, 20, 25, 24, 23}, {0, 1, 2, 9, 10, 11, 17, 18, 19}, {23, 24, 25, 15, 14, 13, 6, 7, 8}, {17, 9, 0, 20, 16, 3, 23, 15, 6}, {2, 11, 19, 5, 12, 22, 8, 13, 25}};
    public static int[][] Field10085 = new int[][]{{0, 0, 1}, {0, 0, -1}, {0, 1, 0}, {0, -1, 0}, {-1, 0, 0}, {1, 0, 0}};
    private String Field10086 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static double Method2299(double d) {
        double d2;
        if (d < Double.longBitsToDouble((long)1639294305 ^ 0x3FE0000061B5A561L)) {
            d2 = Double.longBitsToDouble((long)844402972 ^ 0x401000003254911CL) * d * d * d;
            return d2;
        }
        d2 = 1.0 - Math.pow(Double.longBitsToDouble((long)5569674 ^ 0xC00000000054FC8AL) * d + Double.longBitsToDouble((long)1381709430 ^ 0x40000000525B3676L), Double.longBitsToDouble((long)598798587 ^ 0x4008000023B0F0FBL)) / Double.longBitsToDouble((long)824149124 ^ 0x40000000311F8484L);
        return d2;
    }

    public static void Method2300(ModelRenderer modelRenderer, float f, int n, int n2, int n3) {
        int n4 = Field10083[n + 1][n2 + 1][n3 + 1];
        if (Arrays.stream(Field10084[Class1075.Field12740]).anyMatch(arg_0 -> Class501.Method2306(n4, arg_0))) {
            return;
        }
        Class501.Method2303(modelRenderer, f, n, n2, n3, n4);
    }

    public static void Method2301(ModelRenderer modelRenderer, float f, int n, int n2, int n3) {
        int n4 = Field10083[n + 1][n2 + 1][n3 + 1];
        if (Arrays.stream(Field10084[Class1075.Field12740]).noneMatch(arg_0 -> Class501.Method2305(n4, arg_0))) {
            return;
        }
        int[] nArray = Field10085[Class1075.Field12740];
        Class501.Method2303(modelRenderer, f, n - nArray[0], n2 - nArray[1], n3 - nArray[2], n4);
    }

    public static void Method2302(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = Field10083[n + 1][n2 + 1][n3 + 1];
        if (Arrays.stream(Field10084[Class1075.Field12740]).noneMatch(arg_0 -> Class501.Method2304(n7, arg_0))) {
            return;
        }
        float f = (float)Math.toRadians(Double.longBitsToDouble((long)1926619931 ^ 0x4056800072D5E31BL));
        float f2 = (float)((double)n4 * Math.sin(f / 2.0f));
        float f3 = (float)((double)n5 * Math.sin(f / 2.0f));
        float f4 = (float)((double)n6 * Math.sin(f / 2.0f));
        float f5 = (float)Math.cos(f / 2.0f);
        Class501.Field10082[n7] = Quaternion.mul((Quaternion)new Quaternion(f2, f3, f4, f5), (Quaternion)Field10082[n7], null);
    }

    public static void Method2303(ModelRenderer modelRenderer, float f, int n, int n2, int n3, int n4) {
        GlStateManager.pushMatrix();
        GlStateManager.translate((double)((double)n * Double.longBitsToDouble(4600877379321698714L)), (double)((double)n2 * Double.longBitsToDouble((long)1007593564 ^ 0x3FD99999A59731C6L)), (double)((double)n3 * Double.longBitsToDouble((long)1017608169 ^ 0x3FD99999A53EEE73L)));
        GlStateManager.rotate((Quaternion)Field10082[n4]);
        modelRenderer.render(f);
        GlStateManager.popMatrix();
    }

    private static boolean Method2304(int n, int n2) {
        if (n2 != n) return false;
        return true;
    }

    private static boolean Method2305(int n, int n2) {
        if (n2 != n) return false;
        return true;
    }

    private static boolean Method2306(int n, int n2) {
        if (n2 != n) return false;
        return true;
    }
}

