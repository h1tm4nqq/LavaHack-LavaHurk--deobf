//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.util.vector.*;
import net.minecraft.client.model.*;
import java.util.*;
import net.minecraft.client.renderer.*;

public class Class501
{
    public static Quaternion[] Field10082;
    public static int[][][] Field10083;
    public static int[][] Field10084;
    public static int[][] Field10085;
    private String Field10086 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static double Method2299(final double n) {
        return (n < Double.longBitsToDouble((long)1639294305 ^ 0x3FE0000061B5A561L)) ? (Double.longBitsToDouble((long)844402972 ^ 0x401000003254911CL) * n * n * n) : (1.0 - Math.pow(Double.longBitsToDouble((long)5569674 ^ 0xC00000000054FC8AL) * n + Double.longBitsToDouble((long)1381709430 ^ 0x40000000525B3676L), Double.longBitsToDouble((long)598798587 ^ 0x4008000023B0F0FBL)) / Double.longBitsToDouble((long)824149124 ^ 0x40000000311F8484L));
    }
    
    public static void Method2300(final ModelRenderer modelRenderer, final float n, final int n2, final int n3, final int n4) {
        final int n5 = Class501.Field10083[n2 + 1][n3 + 1][n4 + 1];
        if (Arrays.stream(Class501.Field10084[Class1075.Field12740]).anyMatch(Class501::Method2306)) {
            return;
        }
        Method2303(modelRenderer, n, n2, n3, n4, n5);
    }
    
    public static void Method2301(final ModelRenderer modelRenderer, final float n, final int n2, final int n3, final int n4) {
        final int n5 = Class501.Field10083[n2 + 1][n3 + 1][n4 + 1];
        if (Arrays.stream(Class501.Field10084[Class1075.Field12740]).noneMatch(Class501::Method2305)) {
            return;
        }
        final int[] array = Class501.Field10085[Class1075.Field12740];
        Method2303(modelRenderer, n, n2 - array[0], n3 - array[1], n4 - array[2], n5);
    }
    
    public static void Method2302(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final int n7 = Class501.Field10083[n + 1][n2 + 1][n3 + 1];
        if (Arrays.stream(Class501.Field10084[Class1075.Field12740]).noneMatch(Class501::Method2304)) {
            return;
        }
        final float n8 = (float)Math.toRadians(Double.longBitsToDouble((long)1926619931 ^ 0x4056800072D5E31BL));
        Class501.Field10082[n7] = Quaternion.mul(new Quaternion((float)(n4 * Math.sin(n8 / 2.0f)), (float)(n5 * Math.sin(n8 / 2.0f)), (float)(n6 * Math.sin(n8 / 2.0f)), (float)Math.cos(n8 / 2.0f)), Class501.Field10082[n7], (Quaternion)null);
    }
    
    public static void Method2303(final ModelRenderer modelRenderer, final float n, final int n2, final int n3, final int n4, final int n5) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(n2 * Double.longBitsToDouble(4600877379321698714L), n3 * Double.longBitsToDouble((long)1007593564 ^ 0x3FD99999A59731C6L), n4 * Double.longBitsToDouble((long)1017608169 ^ 0x3FD99999A53EEE73L));
        GlStateManager.rotate(Class501.Field10082[n5]);
        modelRenderer.render(n);
        GlStateManager.popMatrix();
    }
    
    private static boolean Method2304(final int n, final int n2) {
        return n2 == n;
    }
    
    private static boolean Method2305(final int n, final int n2) {
        return n2 == n;
    }
    
    private static boolean Method2306(final int n, final int n2) {
        return n2 == n;
    }
    
    static {
        Class501.Field10082 = new Quaternion[] { new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion(), new Quaternion() };
        Class501.Field10083 = new int[][][] { { { 17, 9, 0 }, { 20, 16, 3 }, { 23, 15, 6 } }, { { 18, 10, 1 }, { 21, -1, 4 }, { 24, 14, 7 } }, { { 19, 11, 2 }, { 22, 12, 5 }, { 25, 13, 8 } } };
        Class501.Field10084 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, { 19, 18, 17, 22, 21, 20, 25, 24, 23 }, { 0, 1, 2, 9, 10, 11, 17, 18, 19 }, { 23, 24, 25, 15, 14, 13, 6, 7, 8 }, { 17, 9, 0, 20, 16, 3, 23, 15, 6 }, { 2, 11, 19, 5, 12, 22, 8, 13, 25 } };
        Class501.Field10085 = new int[][] { { 0, 0, 1 }, { 0, 0, -1 }, { 0, 1, 0 }, { 0, -1, 0 }, { -1, 0, 0 }, { 1, 0, 0 } };
    }
}
