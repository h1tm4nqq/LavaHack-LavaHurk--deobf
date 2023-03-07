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
import lavahack.client.XHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO;
import lavahack.client.Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import lavahack.client.hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class XOu74v224lqSTQs7rEivUfpfdaXI1IJR {
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
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7009((int)(d * (double)Display.getWidth()), (int)(d2 * (double)Display.getHeight()), (int)(d3 * (double)Display.getWidth()), (int)(d4 * (double)Display.getHeight()));
    }

    public static void Method7011(double d, double d2, double d3, double d4) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7010((d + 1.0) / Double.longBitsToDouble(0xDF419DD3169649AEL ^ 0x9F419DD3169649AEL), (d2 + 1.0) / Double.longBitsToDouble(0xE8190A08E5A6C8AAL ^ 0xA8190A08E5A6C8AAL), (d3 + 1.0) / Double.longBitsToDouble((long)637280568 ^ 0x4000000025FC2138L), (d4 + 1.0) / Double.longBitsToDouble(0x3AEC1F863FDB29A8L ^ 0x7AEC1F863FDB29A8L));
    }

    public static void Method7012() {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
    }

    public static void Method7013() {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3433();
    }

    public static void Method7014() {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method7015() {
        exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Method3434();
    }

    public static void Method7016(int n, int n2, int n3, int n4, Color color) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7019((int)((long)-947807295 ^ (long)-947807295), XHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2080(n, n2, n3, n4), color);
    }

    public static void Method7017(int n, int n2, int n3, int n4, int n5, Color color) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7019(n, XHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2080(n2, n3, n4, n5), color);
    }

    public static void Method7018(XHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO, Color color) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7019((int)-1386102235L ^ 0xAD61C225, xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO, color);
    }

    public static void Method7019(int n, XHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO, Color color) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7020("shadeModelBegin", n, new Object[(int)((long)693276883 ^ (long)693276883)]);
        GL11.glColor4f((float)((float)color.getRed() / Float.intBitsToFloat((int)((long)87048712 ^ (long)1179599368))), (float)((float)color.getGreen() / Float.intBitsToFloat(0x2CE246E6 ^ 0x6F9D46E6)), (float)((float)color.getBlue() / Float.intBitsToFloat((int)709750290L ^ 0x6932EE12)), (float)((float)color.getAlpha() / Float.intBitsToFloat((int)1195901091L ^ 0x43700A3)));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        bufferBuilder.begin((int)-2015779447L ^ 0x87D9A58E, DefaultVertexFormats.POSITION);
        bufferBuilder.pos((double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2076(), (double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2077(), 0.0);
        bufferBuilder.pos((double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2078(), (double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2077(), 0.0);
        bufferBuilder.pos((double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2078(), (double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2079(), 0.0);
        bufferBuilder.pos((double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2076(), (double)xHGYEHWp0YPQGI4mAfrlPbEMtZWduHwO.Method2079(), 0.0);
        tessellator.draw();
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7020("shadeModelEnd", n, new Object[(int)1072805303L ^ 0x3FF1B5B7]);
    }

    private static int Method7020(String string, Integer n, Object ... objectArray) {
        return (Integer)((hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs)((Map)Field16715.get(string)).get(n)).Method1726(objectArray);
    }

    private static Integer Method7021(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7014();
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7015();
        return (int)((long)-700055307 ^ (long)-700055307);
    }

    private static Integer Method7022(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7015();
        return (int)((long)1205845805 ^ (long)1205845805);
    }

    private static Integer Method7023(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7012();
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7013();
        return (int)-1348478803L ^ 0xAF9FD8AD;
    }

    private static Integer Method7024(Z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC z557Xkt0AW4jCvkPSKwfIN0oRCjfHldC) {
        XOu74v224lqSTQs7rEivUfpfdaXI1IJR.Method7012();
        return (int)400564653L ^ 0x17E021AD;
    }

    static {
        Field16714 = (int)1601967890L ^ 0x5F7C1713;
        Field16713 = (int)((long)-1792868579 ^ (long)-1792868579);
        Field16715 = new ConcurrentHashMap();
        ConcurrentHashMap<Integer, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs> concurrentHashMap = new ConcurrentHashMap<Integer, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs>();
        concurrentHashMap.put((int)931451303L ^ 0x3784D1A7, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs.Method1727(Integer.class, new Class[(int)((long)928871728 ^ (long)928871728)]).Method7663(XOu74v224lqSTQs7rEivUfpfdaXI1IJR::Method7024));
        concurrentHashMap.put((int)1346429165L ^ 0x5040E0EC, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs.Method1727(Integer.class, new Class[(int)-1498531162L ^ 0xA6AE3AA6]).Method7663(XOu74v224lqSTQs7rEivUfpfdaXI1IJR::Method7023));
        Field16715.put("shadeModelBegin", concurrentHashMap);
        ConcurrentHashMap<Integer, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs> concurrentHashMap2 = new ConcurrentHashMap<Integer, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs>();
        concurrentHashMap2.put((int)999310627L ^ 0x3B904523, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs.Method1727(Integer.class, new Class[(int)-540760100L ^ 0xDFC4A7DC]).Method7663(XOu74v224lqSTQs7rEivUfpfdaXI1IJR::Method7022));
        concurrentHashMap2.put((int)1125927083L ^ 0x431C48AA, hFi9sJW27NhKFOb6I9Bpx6sOKiwsbeRs.Method1727(Integer.class, new Class[(int)2046980800L ^ 0x7A0272C0]).Method7663(XOu74v224lqSTQs7rEivUfpfdaXI1IJR::Method7021));
        Field16715.put("shadeModelEnd", concurrentHashMap2);
    }

    private static String Method7025(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-685702557 ^ (long)-685702557);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-769429555L ^ 0xD2236F32);
            int n2 = (int)-1937693197L ^ 0x8C8125F8;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2055261213 ^ (long)-2055261556) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

