//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class1763;
import lavahack.client.Class424;
import lavahack.client.Class435;
import lavahack.client.Class815;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class Class1893 {
    public static final int Field16713;
    public static final int Field16714;
    private static final Map Field16715;
    private String Field16716 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method7009(int n, int n2, int n3, int n4) {
        int n5 = Math.min(n, n3);
        int n6 = Math.min(n2, n4);
        int n7 = Math.abs(n - n3);
        int n8 = Math.abs(n2 - n4);
        GL11.glScissor((int)n5, (int)n6, (int)n7, (int)n8);
    }

    public static void Method7010(double d, double d2, double d3, double d4) {
        Class1893.Method7009((int)(d * (double)Display.getWidth()), (int)(d2 * (double)Display.getHeight()), (int)(d3 * (double)Display.getWidth()), (int)(d4 * (double)Display.getHeight()));
    }

    public static void Method7011(double d, double d2, double d3, double d4) {
        Class1893.Method7010((d + 1.0) / Double.longBitsToDouble(0x4000000000000000L), (d2 + 1.0) / Double.longBitsToDouble(0x4000000000000000L), (d3 + 1.0) / Double.longBitsToDouble((long)637280568 ^ 0x4000000025FC2138L), (d4 + 1.0) / Double.longBitsToDouble(0x4000000000000000L));
    }

    public static void Method7012() {
        Class815.Method3433();
    }

    public static void Method7013() {
        Class815.Method3433();
    }

    public static void Method7014() {
        Class815.Method3434();
    }

    public static void Method7015() {
        Class815.Method3434();
    }

    public static void Method7016(int n, int n2, int n3, int n4, Color color) {
        Class1893.Method7019(0, Class435.Method2080(n, n2, n3, n4), color);
    }

    public static void Method7017(int n, int n2, int n3, int n4, int n5, Color color) {
        Class1893.Method7019(n, Class435.Method2080(n2, n3, n4, n5), color);
    }

    public static void Method7018(Class435 class435, Color color) {
        Class1893.Method7019(0, class435, color);
    }

    public static void Method7019(int n, Class435 class435, Color color) {
        Class1893.Method7020("shadeModelBegin", n, new Object[0]);
        GL11.glColor4f((float)((float)color.getRed() / Float.intBitsToFloat(1132396544)), (float)((float)color.getGreen() / Float.intBitsToFloat(1132396544)), (float)((float)color.getBlue() / Float.intBitsToFloat(1132396544)), (float)((float)color.getAlpha() / Float.intBitsToFloat(1132396544)));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin(7, DefaultVertexFormats.POSITION);
        bufferBuilder.pos((double)class435.Method2076(), (double)class435.Method2077(), 0.0);
        bufferBuilder.pos((double)class435.Method2078(), (double)class435.Method2077(), 0.0);
        bufferBuilder.pos((double)class435.Method2078(), (double)class435.Method2079(), 0.0);
        bufferBuilder.pos((double)class435.Method2076(), (double)class435.Method2079(), 0.0);
        tessellator.draw();
        Class1893.Method7020("shadeModelEnd", n, new Object[0]);
    }

    private static int Method7020(String string, Integer n, Object ... objectArray) {
        return (Integer)((Class1763)((Map)Field16715.get(string)).get(n)).Method1726(objectArray);
    }

    private static Integer Method7021(Class424 class424) {
        Class1893.Method7014();
        Class1893.Method7015();
        return 0;
    }

    private static Integer Method7022(Class424 class424) {
        Class1893.Method7015();
        return 0;
    }

    private static Integer Method7023(Class424 class424) {
        Class1893.Method7012();
        Class1893.Method7013();
        return 0;
    }

    private static Integer Method7024(Class424 class424) {
        Class1893.Method7012();
        return 0;
    }

    static {
        Field16714 = 1;
        Field16713 = 0;
        Field16715 = new ConcurrentHashMap();
        ConcurrentHashMap<Integer, Class1763> concurrentHashMap = new ConcurrentHashMap<Integer, Class1763>();
        concurrentHashMap.put(0, Class1763.Method1727(Integer.class, new Class[0]).Method7663(Class1893::Method7024));
        concurrentHashMap.put(1, Class1763.Method1727(Integer.class, new Class[0]).Method7663(Class1893::Method7023));
        Field16715.put("shadeModelBegin", concurrentHashMap);
        ConcurrentHashMap<Integer, Class1763> concurrentHashMap2 = new ConcurrentHashMap<Integer, Class1763>();
        concurrentHashMap2.put(0, Class1763.Method1727(Integer.class, new Class[0]).Method7663(Class1893::Method7022));
        concurrentHashMap2.put(1, Class1763.Method1727(Integer.class, new Class[0]).Method7663(Class1893::Method7021));
        Field16715.put("shadeModelEnd", concurrentHashMap2);
    }

    private static String Method7025(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0x16F0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

