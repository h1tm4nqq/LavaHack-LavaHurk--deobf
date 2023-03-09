//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1527;
import lavahack.client.Class1988;
import lavahack.client.Class2120;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class Class1882 {
    private static final float Field16677 = 0.0f;
    private final List Field16678 = new ArrayList();
    private String Field16679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1882(int n) {
        this.Method6977(n);
    }

    public Class1882() {
        this(Class2120.Field17654);
    }

    public void Method6977(int n) {
        int n2 = 0;
        while (n2 < n) {
            this.Field16678.add(Class1988.Method7363());
            ++n2;
        }
    }

    public static double Method6978(float f, float f2, float f3, float f4) {
        return Math.sqrt((f - f3) * (f - f3) + (f2 - f4) * (f2 - f4));
    }

    public void Method6979(int n) {
        Iterator iterator = this.Field16678.iterator();
        while (iterator.hasNext()) {
            Class1988 class1988 = (Class1988)iterator.next();
            class1988.Method7375(n, Float.intBitsToFloat(0x3DCCCCCD));
        }
    }

    private void Method6980(float f, float f2, float f3, float f4, Class2027 class2027, float f5) {
        GL11.glColor4f((float)class2027.Field17325, (float)class2027.Field17326, (float)class2027.Field17327, (float)class2027.Field17328);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)1);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnd();
    }

    private void Method6981(float f, float f2, float f3, float f4, Class2027 class2027, Class2027 class20272, float f5) {
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glColor4f((float)class2027.Field17325, (float)class2027.Field17326, (float)class2027.Field17327, (float)class2027.Field17328);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)1);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glColor4f((float)class20272.Field17325, (float)class20272.Field17326, (float)class20272.Field17327, (float)class20272.Field17328);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void Method6982(float f, float f2, float f3, float f4, Class2027 class2027, Class2027 class20272, Class2027 class20273, float f5) {
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glColor4f((float)class2027.Field17325, (float)class2027.Field17326, (float)class2027.Field17327, (float)class2027.Field17328);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)1);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glColor4f((float)class20272.Field17325, (float)class20272.Field17326, (float)class20272.Field17327, (float)class20272.Field17328);
        float f6 = f2 >= f4 ? f4 + (f2 - f4) / 2.0f : f2 + (f4 - f2) / 2.0f;
        float f7 = f >= f3 ? f3 + (f - f3) / 2.0f : f + (f3 - f) / 2.0f;
        GL11.glVertex2f((float)f7, (float)f6);
        GL11.glEnd();
        GL11.glBegin((int)1);
        GL11.glColor4f((float)class20272.Field17325, (float)class20272.Field17326, (float)class20272.Field17327, (float)class20272.Field17328);
        GL11.glVertex2f((float)f7, (float)f6);
        GL11.glColor4f((float)class20273.Field17325, (float)class20273.Field17326, (float)class20273.Field17327, (float)class20273.Field17328);
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    private void Method6983(float f, float f2, float f3, float f4, Class2027 class2027, Class2027 class20272, float f5) {
        GL11.glPushMatrix();
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glColor4f((float)class2027.Field17325, (float)class2027.Field17326, (float)class2027.Field17327, (float)Float.intBitsToFloat(0x42000000));
        GL11.glLineWidth((float)(f5 + Float.intBitsToFloat(0x40800000)));
        GL11.glBegin((int)1);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glColor4f((float)class20272.Field17325, (float)class20272.Field17326, (float)class20272.Field17327, (float)Float.intBitsToFloat(0x42000000));
        GL11.glVertex2f((float)f3, (float)f4);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnd();
        GL11.glPopMatrix();
    }

    public void Method6984() {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2884);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        if (Minecraft.getMinecraft().currentScreen == null) {
            return;
        }
        Iterator iterator = this.Field16678.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)Float.intBitsToFloat(0x3F000000), (float)Float.intBitsToFloat(0x3F000000), (float)Float.intBitsToFloat(0x3F000000));
                GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glEnable((int)3553);
                GL11.glPopMatrix();
                GL11.glDepthMask((boolean)true);
                GL11.glEnable((int)2884);
                GL11.glEnable((int)3553);
                GL11.glEnable((int)2929);
                GL11.glEnable((int)3553);
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
                return;
            }
            Class1988 class1988 = (Class1988)iterator.next();
            if (null.Field11814.Method359().equals(Class1527.Field15140.name())) {
                class1988.Field17131.Method3632();
            } else {
                GL11.glColor4f((float)Class2120.Field17641.Field17325, (float)Class2120.Field17641.Field17326, (float)Class2120.Field17641.Field17327, (float)class1988.Method7366());
            }
            if (Class2120.Field17653) {
                GL11.glPointSize((float)(class1988.Method7369() * Class2120.Field17652));
                GL11.glBegin((int)0);
                GL11.glVertex2f((float)class1988.Method7370(), (float)class1988.Method7371());
                GL11.glEnd();
            }
            int n = Mouse.getEventX() * Minecraft.getMinecraft().currentScreen.width / Minecraft.getMinecraft().displayWidth;
            int n2 = Minecraft.getMinecraft().currentScreen.height - Mouse.getEventY() * Minecraft.getMinecraft().currentScreen.height / Minecraft.getMinecraft().displayHeight - 1;
            float f = 0.0f;
            Class1988 class19882 = null;
            int n3 = 100;
            for (Class1988 class19883 : this.Field16678) {
                float f2 = class1988.Method7367(class19883);
                if (!(f2 <= Float.intBitsToFloat(1120403456)) || !(Class1882.Method6978(n, n2, class1988.Method7370(), class1988.Method7371()) <= Double.longBitsToDouble(4636737291354636288L)) && !(Class1882.Method6978(n, n2, class19883.Method7370(), class19883.Method7371()) <= Double.longBitsToDouble((long)1184297759 ^ 0x405900004696F31FL))) continue;
                Float.compare(f, 0.0f);
                f = f2;
                class19882 = class19883;
            }
            if (class19882 == null || !Class2120.Field17650) continue;
            if (Class2120.Field17645) {
                if (Class2120.Field17647.equals(Class2120.Field17648)) {
                    this.Method6981(class1988.Method7370(), class1988.Method7371(), class19882.Method7370(), class19882.Method7371(), Class2120.Field17642, Class2120.Field17643, Class2120.Field17646);
                    continue;
                }
                if (Class2120.Field17647.equals(Class2120.Field17649)) {
                    this.Method6982(class1988.Method7370(), class1988.Method7371(), class19882.Method7370(), class19882.Method7371(), Class2120.Field17642, Class2120.Field17644, Class2120.Field17643, Class2120.Field17646);
                    continue;
                }
                this.Method6980(class1988.Method7370(), class1988.Method7371(), class19882.Method7370(), class19882.Method7371(), Class2120.Field17641, Class2120.Field17646);
                continue;
            }
            this.Method6980(class1988.Method7370(), class1988.Method7371(), class19882.Method7370(), class19882.Method7371(), Class2120.Field17641, Class2120.Field17646);
        }
    }

    public void Method6985() {
        Class2120.Method7657();
    }
}

