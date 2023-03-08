//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import org.lwjgl.opengl.*;
import java.awt.*;
import net.minecraft.client.renderer.vertex.*;
import net.minecraft.client.renderer.*;
import java.util.concurrent.*;

public class Class1893
{
    public static final int Field16713;
    public static final int Field16714;
    private static final Map Field16715;
    private String Field16716 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method7009(final int a, final int a2, final int b, final int b2) {
        GL11.glScissor(Math.min(a, b), Math.min(a2, b2), Math.abs(a - b), Math.abs(a2 - b2));
    }
    
    public static void Method7010(final double n, final double n2, final double n3, final double n4) {
        Method7009((int)(n * Display.getWidth()), (int)(n2 * Display.getHeight()), (int)(n3 * Display.getWidth()), (int)(n4 * Display.getHeight()));
    }
    
    public static void Method7011(final double n, final double n2, final double n3, final double n4) {
        Method7010((n + 1.0) / Double.longBitsToDouble(4611686018427387904L), (n2 + 1.0) / Double.longBitsToDouble(4611686018427387904L), (n3 + 1.0) / Double.longBitsToDouble((long)637280568 ^ 0x4000000025FC2138L), (n4 + 1.0) / Double.longBitsToDouble(4611686018427387904L));
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
    
    public static void Method7016(final int n, final int n2, final int n3, final int n4, final Color color) {
        Method7019(0, Class435.Method2080(n, n2, n3, n4), color);
    }
    
    public static void Method7017(final int n, final int n2, final int n3, final int n4, final int n5, final Color color) {
        Method7019(n, Class435.Method2080(n2, n3, n4, n5), color);
    }
    
    public static void Method7018(final Class435 class435, final Color color) {
        Method7019(0, class435, color);
    }
    
    public static void Method7019(final int n, final Class435 class435, final Color color) {
        Method7020("shadeModelBegin", n, new Object[0]);
        GL11.glColor4f(color.getRed() / Float.intBitsToFloat(1132396544), color.getGreen() / Float.intBitsToFloat(1132396544), color.getBlue() / Float.intBitsToFloat(1132396544), color.getAlpha() / Float.intBitsToFloat(1132396544));
        final Tessellator getInstance = Tessellator.getInstance();
        final BufferBuilder getBuffer = getInstance.getBuffer();
        getBuffer.begin(7, DefaultVertexFormats.POSITION);
        getBuffer.pos((double)class435.Method2076(), (double)class435.Method2077(), 0.0);
        getBuffer.pos((double)class435.Method2078(), (double)class435.Method2077(), 0.0);
        getBuffer.pos((double)class435.Method2078(), (double)class435.Method2079(), 0.0);
        getBuffer.pos((double)class435.Method2076(), (double)class435.Method2079(), 0.0);
        getInstance.draw();
        Method7020("shadeModelEnd", n, new Object[0]);
    }
    
    private static int Method7020(final String s, final Integer n, final Object... array) {
        return (int)Class1893.Field16715.get(s).get(n).Method1726(array);
    }
    
    private static Integer Method7021(final Class424 class424) {
        Method7014();
        Method7015();
        return 0;
    }
    
    private static Integer Method7022(final Class424 class424) {
        Method7015();
        return 0;
    }
    
    private static Integer Method7023(final Class424 class424) {
        Method7012();
        Method7013();
        return 0;
    }
    
    private static Integer Method7024(final Class424 class424) {
        Method7012();
        return 0;
    }
    
    static {
        Field16714 = 1;
        Field16713 = 0;
        Field16715 = new ConcurrentHashMap();
        final ConcurrentHashMap<Integer, Class1763> concurrentHashMap = new ConcurrentHashMap<Integer, Class1763>();
        concurrentHashMap.put(0, Class1763.Method1727((Class)Integer.class, new Class[0]).Method7663(Class1893::Method7024));
        concurrentHashMap.put(1, Class1763.Method1727((Class)Integer.class, new Class[0]).Method7663(Class1893::Method7023));
        Class1893.Field16715.put("shadeModelBegin", concurrentHashMap);
        final ConcurrentHashMap<Integer, Class1763> concurrentHashMap2 = new ConcurrentHashMap<Integer, Class1763>();
        concurrentHashMap2.put(0, Class1763.Method1727((Class)Integer.class, new Class[0]).Method7663(Class1893::Method7022));
        concurrentHashMap2.put(1, Class1763.Method1727((Class)Integer.class, new Class[0]).Method7663(Class1893::Method7021));
        Class1893.Field16715.put("shadeModelEnd", concurrentHashMap2);
    }
    
    private static String Method7025(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x16F0 ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
