//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.WorldVertexBufferUploader
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.sun.javafx.geom.Vec2d;
import java.awt.Color;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.Class638;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.util.math.Vec3d;

@Deprecated
public class Class497 {
    public static int Field10061 = 0;
    public static int Field10062 = 1;
    public static int Field10063 = 2;
    public static int Field10064 = 3;
    private static final Class638[] Field10065;
    private static final WorldVertexBufferUploader Field10066;
    private final BufferBuilder Field10067;
    private final Map Field10068;
    private double Field10069;
    private double Field10070;
    private double Field10071;
    private Color Field10072;
    private int Field10073;

    private Class497(BufferBuilder bufferBuilder) {
        Tessellator.getInstance().draw();
        this.Field10067 = bufferBuilder;
        this.Field10068 = new ConcurrentHashMap(16);
    }

    public static Class497 Method2284(BufferBuilder bufferBuilder) {
        return new Class497(bufferBuilder);
    }

    public static Class497 Method2285() {
        return new Class497(Tessellator.getInstance().getBuffer());
    }

    public Class497 Method2286(double d, double d2, double d3) {
        this.Method2292(Field10061, d, d2, d3);
        return this;
    }

    public Class497 Method2287(Vec3d vec3d) {
        this.Method2292(Field10062, vec3d);
        return this;
    }

    public Class497 Method2288(double d, double d2) {
        this.Method2292(Field10063, d, d2);
        return this;
    }

    public Class497 Method2289(Vec2d vec2d) {
        this.Method2292(Field10064, vec2d);
        return this;
    }

    public void Method2290() {
        Iterator iterator = this.Field10068.entrySet().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.Field10068.clear();
                this.Field10069 = 0.0;
                this.Field10071 = 0.0;
                this.Field10070 = 0.0;
                this.Field10072 = null;
                return;
            }
            Map.Entry entry = iterator.next();
            Field10065[(Integer)entry.getKey()].Method2767(this, this.Field10067, (Object[])entry.getValue());
        }
    }

    public void Method2291() {
        this.Field10067.finishDrawing();
        Field10066.draw(this.Field10067);
    }

    private void Method2292(int n, Object ... objectArray) {
        this.Field10068.put(n, objectArray);
    }

    private static void Method2293(Class497 class497, BufferBuilder bufferBuilder, Object[] objectArray) {
        Vec2d vec2d = (Vec2d)objectArray[0];
        bufferBuilder.pos(vec2d.x, vec2d.y, 0.0);
    }

    private static void Method2294(Class497 class497, BufferBuilder bufferBuilder, Object[] objectArray) {
        bufferBuilder.pos(((Double)objectArray[0]).doubleValue(), ((Double)objectArray[1]).doubleValue(), 0.0);
    }

    private static void Method2295(Class497 class497, BufferBuilder bufferBuilder, Object[] objectArray) {
        Vec3d vec3d = (Vec3d)objectArray[0];
        bufferBuilder.pos(vec3d.x, vec3d.y, vec3d.z);
    }

    private static void Method2296(Class497 class497, BufferBuilder bufferBuilder, Object[] objectArray) {
        bufferBuilder.pos(((Double)objectArray[0]).doubleValue(), ((Double)objectArray[1]).doubleValue(), ((Double)objectArray[2]).doubleValue());
    }

    static {
        Field field = Tessellator.class.getDeclaredField("vboUploader");
        field.setAccessible(true);
        Field10066 = (WorldVertexBufferUploader)field.get(Tessellator.getInstance());
        Field10065 = new Class638[32];
        Class497.Field10065[0] = Class497::Method2296;
        Class497.Field10065[1] = Class497::Method2295;
        Class497.Field10065[2] = Class497::Method2294;
        Class497.Field10065[3] = Class497::Method2293;
    }

    private static String Method2297(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 41;
            cArray2[n] = (char)(cArray[n] ^ (0x43D0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

