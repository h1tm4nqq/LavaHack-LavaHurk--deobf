//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import net.minecraft.client.renderer.*;
import java.util.concurrent.*;
import net.minecraft.util.math.*;
import com.sun.javafx.geom.*;
import java.util.*;
import java.lang.reflect.*;

@Deprecated
public class Class497
{
    public static int Field10061;
    public static int Field10062;
    public static int Field10063;
    public static int Field10064;
    private static final Class638[] Field10065;
    private static final WorldVertexBufferUploader Field10066;
    private final BufferBuilder Field10067;
    private final Map Field10068;
    private double Field10069;
    private double Field10070;
    private double Field10071;
    private Color Field10072;
    private int Field10073;
    
    private Class497(final BufferBuilder field10067) {
        Tessellator.getInstance().draw();
        this.Field10067 = field10067;
        this.Field10068 = new ConcurrentHashMap(16);
    }
    
    public static Class497 Method2284(final BufferBuilder bufferBuilder) {
        return new Class497(bufferBuilder);
    }
    
    public static Class497 Method2285() {
        return new Class497(Tessellator.getInstance().getBuffer());
    }
    
    public Class497 Method2286(final double d, final double d2, final double d3) {
        this.Method2292(Class497.Field10061, d, d2, d3);
        return this;
    }
    
    public Class497 Method2287(final Vec3d vec3d) {
        this.Method2292(Class497.Field10062, vec3d);
        return this;
    }
    
    public Class497 Method2288(final double d, final double d2) {
        this.Method2292(Class497.Field10063, d, d2);
        return this;
    }
    
    public Class497 Method2289(final Vec2d vec2d) {
        this.Method2292(Class497.Field10064, vec2d);
        return this;
    }
    
    public void Method2290() {
        for (final Map.Entry<Integer, V> entry : this.Field10068.entrySet()) {
            Class497.Field10065[entry.getKey()].Method2767(this, this.Field10067, (Object[])(Object)entry.getValue());
        }
        this.Field10068.clear();
        this.Field10069 = 0.0;
        this.Field10071 = 0.0;
        this.Field10070 = 0.0;
        this.Field10072 = null;
    }
    
    public void Method2291() {
        this.Field10067.finishDrawing();
        Class497.Field10066.draw(this.Field10067);
    }
    
    private void Method2292(final int i, final Object... array) {
        this.Field10068.put(i, array);
    }
    
    private static void Method2293(final Class497 class497, final BufferBuilder bufferBuilder, final Object[] array) {
        final Vec2d vec2d = (Vec2d)array[0];
        bufferBuilder.pos(vec2d.x, vec2d.y, 0.0);
    }
    
    private static void Method2294(final Class497 class497, final BufferBuilder bufferBuilder, final Object[] array) {
        bufferBuilder.pos((double)array[0], (double)array[1], 0.0);
    }
    
    private static void Method2295(final Class497 class497, final BufferBuilder bufferBuilder, final Object[] array) {
        final Vec3d vec3d = (Vec3d)array[0];
        bufferBuilder.pos(vec3d.x, vec3d.y, vec3d.z);
    }
    
    private static void Method2296(final Class497 class497, final BufferBuilder bufferBuilder, final Object[] array) {
        bufferBuilder.pos((double)array[0], (double)array[1], (double)array[2]);
    }
    
    static {
        Class497.Field10061 = 0;
        Class497.Field10062 = 1;
        Class497.Field10063 = 2;
        Class497.Field10064 = 3;
        final Field declaredField = Tessellator.class.getDeclaredField("vboUploader");
        declaredField.setAccessible(true);
        Field10066 = (WorldVertexBufferUploader)declaredField.get(Tessellator.getInstance());
        (Field10065 = new Class638[32])[0] = Class497::Method2296;
        Class497.Field10065[1] = Class497::Method2295;
        Class497.Field10065[2] = Class497::Method2294;
        Class497.Field10065[3] = Class497::Method2293;
    }
    
    private static String Method2297(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x43D0 ^ 0x29));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
