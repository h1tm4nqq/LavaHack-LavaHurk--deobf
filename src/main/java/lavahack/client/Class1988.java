//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import org.lwjgl.util.vector.*;
import java.util.*;
import org.lwjgl.opengl.*;

public class Class1988
{
    private float Field17130;
    public Class2027 Field17131;
    private final Vector2f Field17132;
    private static final Random Field17133;
    private float Field17134;
    private Vector2f Field17135;
    private int Field17136;
    
    public Class1988(final Vector2f field17135, final float n, final float n2, final float field17136) {
        this.Field17135 = field17135;
        this.Field17132 = new Vector2f(n, n2);
        this.Field17134 = field17136;
        this.Field17131 = Class1172.Method4704();
    }
    
    public static Class1988 Method7363() {
        return new Class1988(new Vector2f((float)(Math.random() * Double.longBitsToDouble((long)814275705 ^ 0x400800003088DC79L) - 1.0), (float)(Math.random() * Double.longBitsToDouble(4613937818241073152L) - 1.0)), (float)Class1988.Field17133.nextInt(Math.abs(Display.getWidth())), (float)Class1988.Field17133.nextInt(Math.abs(Display.getHeight())), (float)(Math.random() * Double.longBitsToDouble(4616189618054758400L)) + 2.0f);
    }
    
    public Vector2f Method7364() {
        return this.Field17135;
    }
    
    public void Method7365(final Vector2f field17135) {
        this.Field17135 = field17135;
    }
    
    public float Method7366() {
        return Class2120.Field17651 ? this.Field17130 : this.Field17131.Field17328;
    }
    
    public float Method7367(final Class1988 class1988) {
        return this.Method7368(class1988.Method7370(), class1988.Method7371());
    }
    
    public float Method7368(final float n, final float n2) {
        return (float)Class1882.Method6978(this.Method7370(), this.Method7371(), n, n2);
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
    
    public void Method7372(final float field17134) {
        this.Field17134 = field17134;
    }
    
    public void Method7373(final float x) {
        this.Field17132.setX(x);
    }
    
    public void Method7374(final float y) {
        this.Field17132.setY(y);
    }
    
    public void Method7375(final int n, final float n2) {
        if (null.Field11820.Method365()) {
            this.Field17131.Method3609();
        }
        final Vector2f field17132 = this.Field17132;
        field17132.x += this.Field17135.getX() * n * n2;
        final Vector2f field17133 = this.Field17132;
        field17133.y += this.Field17135.getY() * n * n2;
        if (this.Field17130 < Float.intBitsToFloat(1132396544)) {
            this.Field17130 += Float.intBitsToFloat(1028443341) * n;
        }
        if (this.Field17132.getX() > Display.getWidth()) {
            this.Field17132.setX(0.0f);
        }
        if (this.Field17132.getX() < 0.0f) {
            this.Field17132.setX((float)Display.getWidth());
        }
        if (this.Field17132.getY() > Display.getHeight()) {
            this.Field17132.setY(0.0f);
        }
        if (this.Field17132.getY() < 0.0f) {
            this.Field17132.setY((float)Display.getHeight());
        }
    }
    
    static {
        Field17133 = new Random();
    }
}
