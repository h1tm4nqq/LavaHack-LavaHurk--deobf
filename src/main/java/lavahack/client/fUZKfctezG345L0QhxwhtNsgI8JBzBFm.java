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
import lavahack.client.fUZKfctezG345L0QhxwhtNsgI8JBzBFm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldVertexBufferUploader;
import net.minecraft.util.math.Vec3d;

@Deprecated
public class fUZKfctezG345L0QhxwhtNsgI8JBzBFm {
    public static int Field10061 = (int)1783747970L ^ 0x6A51D582;
    public static int Field10062 = (int)627688635L ^ 0x2569C4BA;
    public static int Field10063 = (int)((long)-830648875 ^ (long)-830648876) << 1;
    public static int Field10064 = (int)614235003L ^ 0x249C7B78;
    private static final fUZKfctezG345L0QhxwhtNsgI8JBzBFm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[] Field10065;
    private static final WorldVertexBufferUploader Field10066;
    private final BufferBuilder Field10067;
    private final Map Field10068;
    private double Field10069;
    private double Field10070;
    private double Field10071;
    private Color Field10072;
    private int Field10073;

    private fUZKfctezG345L0QhxwhtNsgI8JBzBFm(BufferBuilder bufferBuilder) {
        Tessellator.getInstance().draw();
        this.Field10067 = bufferBuilder;
        this.Field10068 = new ConcurrentHashMap((int)((long)-1459769637 ^ (long)-1459769638) << 4);
    }

    public static fUZKfctezG345L0QhxwhtNsgI8JBzBFm Method2284(BufferBuilder bufferBuilder) {
        return new fUZKfctezG345L0QhxwhtNsgI8JBzBFm(bufferBuilder);
    }

    public static fUZKfctezG345L0QhxwhtNsgI8JBzBFm Method2285() {
        return new fUZKfctezG345L0QhxwhtNsgI8JBzBFm(Tessellator.getInstance().getBuffer());
    }

    public fUZKfctezG345L0QhxwhtNsgI8JBzBFm Method2286(double d, double d2, double d3) {
        Object[] objectArray = new Object[(int)837772164L ^ 0x31EF6387];
        objectArray[(int)((long)-327705554 ^ (long)-327705554)] = d;
        objectArray[(int)-416840644L ^ 0xE727843D] = d2;
        objectArray[((int)-1371961840L ^ 0xAE398611) << 1] = d3;
        this.Method2292(Field10061, objectArray);
        return this;
    }

    public fUZKfctezG345L0QhxwhtNsgI8JBzBFm Method2287(Vec3d vec3d) {
        Object[] objectArray = new Object[(int)1186481609L ^ 0x46B845C8];
        objectArray[(int)((long)-807204613 ^ (long)-807204613)] = vec3d;
        this.Method2292(Field10062, objectArray);
        return this;
    }

    public fUZKfctezG345L0QhxwhtNsgI8JBzBFm Method2288(double d, double d2) {
        Object[] objectArray = new Object[(int)((long)-861857131 ^ (long)-861857132) << 1];
        objectArray[(int)((long)-927005622 ^ (long)-927005622)] = d;
        objectArray[(int)((long)866208432 ^ (long)866208433)] = d2;
        this.Method2292(Field10063, objectArray);
        return this;
    }

    public fUZKfctezG345L0QhxwhtNsgI8JBzBFm Method2289(Vec2d vec2d) {
        Object[] objectArray = new Object[(int)-1305027318L ^ 0xB236DD0B];
        objectArray[(int)-158836573L ^ 0xF68858A3] = vec2d;
        this.Method2292(Field10064, objectArray);
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

    private static void Method2293(fUZKfctezG345L0QhxwhtNsgI8JBzBFm fUZKfctezG345L0QhxwhtNsgI8JBzBFm2, BufferBuilder bufferBuilder, Object[] objectArray) {
        Vec2d vec2d = (Vec2d)objectArray[(int)((long)934519661 ^ (long)934519661)];
        bufferBuilder.pos(vec2d.x, vec2d.y, 0.0);
    }

    private static void Method2294(fUZKfctezG345L0QhxwhtNsgI8JBzBFm fUZKfctezG345L0QhxwhtNsgI8JBzBFm2, BufferBuilder bufferBuilder, Object[] objectArray) {
        bufferBuilder.pos(((Double)objectArray[(int)2095055539L ^ 0x7CE002B3]).doubleValue(), ((Double)objectArray[(int)((long)-595347264 ^ (long)-595347263)]).doubleValue(), 0.0);
    }

    private static void Method2295(fUZKfctezG345L0QhxwhtNsgI8JBzBFm fUZKfctezG345L0QhxwhtNsgI8JBzBFm2, BufferBuilder bufferBuilder, Object[] objectArray) {
        Vec3d vec3d = (Vec3d)objectArray[(int)((long)246521699 ^ (long)246521699)];
        bufferBuilder.pos(vec3d.x, vec3d.y, vec3d.z);
    }

    private static void Method2296(fUZKfctezG345L0QhxwhtNsgI8JBzBFm fUZKfctezG345L0QhxwhtNsgI8JBzBFm2, BufferBuilder bufferBuilder, Object[] objectArray) {
        bufferBuilder.pos(((Double)objectArray[(int)-1807252169L ^ 0x94478537]).doubleValue(), ((Double)objectArray[(int)((long)-1247487231 ^ (long)-1247487232)]).doubleValue(), ((Double)objectArray[((int)-888541046L ^ 0xCB09F08B) << 1]).doubleValue());
    }

    static {
        Field field = Tessellator.class.getDeclaredField("vboUploader");
        field.setAccessible(((int)56965317L ^ 0x36538C4) != 0);
        Field10066 = (WorldVertexBufferUploader)field.get(Tessellator.getInstance());
        Field10065 = new fUZKfctezG345L0QhxwhtNsgI8JBzBFm$leqS0IyKEB621E1SrHdAcHHAUjScjmKi[((int)-59126547L ^ 0xFC79CCEC) << 5];
        fUZKfctezG345L0QhxwhtNsgI8JBzBFm.Field10065[(int)-494467739L ^ 0xE2870565] = fUZKfctezG345L0QhxwhtNsgI8JBzBFm::Method2296;
        fUZKfctezG345L0QhxwhtNsgI8JBzBFm.Field10065[(int)1728665575L ^ 0x670957E6] = fUZKfctezG345L0QhxwhtNsgI8JBzBFm::Method2295;
        fUZKfctezG345L0QhxwhtNsgI8JBzBFm.Field10065[(int)((long)-379396776 ^ (long)-379396775) << 1] = fUZKfctezG345L0QhxwhtNsgI8JBzBFm::Method2294;
        fUZKfctezG345L0QhxwhtNsgI8JBzBFm.Field10065[(int)((long)323357528 ^ (long)323357531)] = fUZKfctezG345L0QhxwhtNsgI8JBzBFm::Method2293;
    }

    private static String Method2297(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-145307253 ^ (long)-145307253);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1020145084 ^ (long)1020144963);
            int n2 = (int)((long)1616764769 ^ (long)1616764744);
            cArray2[n] = (char)(cArray[n] ^ (((int)2030611199L ^ 0x7908AEC2) << 4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

