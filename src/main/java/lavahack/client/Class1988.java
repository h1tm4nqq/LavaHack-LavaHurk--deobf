/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.util.vector.Vector2f
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.Random;
import lavahack.client.Class1172;
import lavahack.client.Class1882;
import lavahack.client.Class2120;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Vector2f;

public class Class1988 {
    private float Field17130;
    public Class2027 Field17131;
    private final Vector2f Field17132;
    private static final Random Field17133 = new Random();
    private float Field17134;
    private Vector2f Field17135;
    private int Field17136;

    public Class1988(Vector2f vector2f, float f, float f2, float f3) {
        this.Field17135 = vector2f;
        this.Field17132 = new Vector2f(f, f2);
        this.Field17134 = f3;
        this.Field17131 = Class1172.Method4704();
    }

    public static Class1988 Method7363() {
        Vector2f vector2f = new Vector2f((float)(Math.random() * Double.longBitsToDouble((long)814275705 ^ 0x400800003088DC79L) - 1.0), (float)(Math.random() * Double.longBitsToDouble(0x4008000000000000L) - 1.0));
        float f = Field17133.nextInt(Math.abs(Display.getWidth()));
        float f2 = Field17133.nextInt(Math.abs(Display.getHeight()));
        float f3 = (float)(Math.random() * Double.longBitsToDouble(0x4010000000000000L)) + 2.0f;
        return new Class1988(vector2f, f, f2, f3);
    }

    public Vector2f Method7364() {
        return this.Field17135;
    }

    public void Method7365(Vector2f vector2f) {
        this.Field17135 = vector2f;
    }

    public float Method7366() {
        float f;
        if (Class2120.Field17651) {
            f = this.Field17130;
            return f;
        }
        f = this.Field17131.Field17328;
        return f;
    }

    public float Method7367(Class1988 class1988) {
        return this.Method7368(class1988.Method7370(), class1988.Method7371());
    }

    public float Method7368(float f, float f2) {
        return (float)Class1882.Method6978(this.Method7370(), this.Method7371(), f, f2);
    }

    public float Method7369() {
        return this.Field17134;
    }

    public float Method7370() {
        return this.Field17132.getX();
    }

    public float Method7371() {
        return this.Field17132.getY();
    }

    public void Method7372(float f) {
        this.Field17134 = f;
    }

    public void Method7373(float f) {
        this.Field17132.setX(f);
    }

    public void Method7374(float f) {
        this.Field17132.setY(f);
    }

    public void Method7375(int n, float f) {
        if (null.Field11820.Method365()) {
            this.Field17131.Method3609();
        }
        Vector2f vector2f = this.Field17132;
        vector2f.x += this.Field17135.getX() * (float)n * f;
        Vector2f vector2f2 = this.Field17132;
        vector2f2.y += this.Field17135.getY() * (float)n * f;
        if (this.Field17130 < Float.intBitsToFloat(1132396544)) {
            this.Field17130 += Float.intBitsToFloat(1028443341) * (float)n;
        }
        if (this.Field17132.getX() > (float)Display.getWidth()) {
            this.Field17132.setX(0.0f);
        }
        if (this.Field17132.getX() < 0.0f) {
            this.Field17132.setX((float)Display.getWidth());
        }
        if (this.Field17132.getY() > (float)Display.getHeight()) {
            this.Field17132.setY(0.0f);
        }
        if (!(this.Field17132.getY() < 0.0f)) return;
        this.Field17132.setY((float)Display.getHeight());
    }
}

