//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;
import org.lwjgl.input.*;

public class Class1882
{
    private static final float Field16677;
    private final List Field16678;
    private String Field16679 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1882(final int n) {
        this.Field16678 = new ArrayList();
        this.Method6977(n);
    }
    
    public Class1882() {
        this(Class2120.Field17654);
    }
    
    public void Method6977(final int n) {
        for (int i = 0; i < n; ++i) {
            this.Field16678.add(Class1988.Method7363());
        }
    }
    
    public static double Method6978(final float n, final float n2, final float n3, final float n4) {
        return Math.sqrt((n - n3) * (n - n3) + (n2 - n4) * (n2 - n4));
    }
    
    public void Method6979(final int n) {
        final Iterator<Class1988> iterator = this.Field16678.iterator();
        while (iterator.hasNext()) {
            iterator.next().Method7375(n, Float.intBitsToFloat(1036831949));
        }
    }
    
    private void Method6980(final float n, final float n2, final float n3, final float n4, final Class2027 class2027, final float n5) {
        GL11.glColor4f(class2027.Field17325, class2027.Field17326, class2027.Field17327, class2027.Field17328);
        GL11.glLineWidth(n5);
        GL11.glBegin(1);
        GL11.glVertex2f(n, n2);
        GL11.glVertex2f(n3, n4);
        GL11.glEnd();
    }
    
    private void Method6981(final float n, final float n2, final float n3, final float n4, final Class2027 class2027, final Class2027 class2028, final float n5) {
        GL11.glPushMatrix();
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        GL11.glColor4f(class2027.Field17325, class2027.Field17326, class2027.Field17327, class2027.Field17328);
        GL11.glLineWidth(n5);
        GL11.glBegin(1);
        GL11.glVertex2f(n, n2);
        GL11.glColor4f(class2028.Field17325, class2028.Field17326, class2028.Field17327, class2028.Field17328);
        GL11.glVertex2f(n3, n4);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glEnd();
        GL11.glPopMatrix();
    }
    
    private void Method6982(final float n, final float n2, final float n3, final float n4, final Class2027 class2027, final Class2027 class2028, final Class2027 class2029, final float n5) {
        GL11.glPushMatrix();
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        GL11.glColor4f(class2027.Field17325, class2027.Field17326, class2027.Field17327, class2027.Field17328);
        GL11.glLineWidth(n5);
        GL11.glBegin(1);
        GL11.glVertex2f(n, n2);
        GL11.glColor4f(class2028.Field17325, class2028.Field17326, class2028.Field17327, class2028.Field17328);
        float n6;
        if (n2 >= n4) {
            n6 = n4 + (n2 - n4) / 2.0f;
        }
        else {
            n6 = n2 + (n4 - n2) / 2.0f;
        }
        float n7;
        if (n >= n3) {
            n7 = n3 + (n - n3) / 2.0f;
        }
        else {
            n7 = n + (n3 - n) / 2.0f;
        }
        GL11.glVertex2f(n7, n6);
        GL11.glEnd();
        GL11.glBegin(1);
        GL11.glColor4f(class2028.Field17325, class2028.Field17326, class2028.Field17327, class2028.Field17328);
        GL11.glVertex2f(n7, n6);
        GL11.glColor4f(class2029.Field17325, class2029.Field17326, class2029.Field17327, class2029.Field17328);
        GL11.glVertex2f(n3, n4);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glEnd();
        GL11.glPopMatrix();
    }
    
    private void Method6983(final float n, final float n2, final float n3, final float n4, final Class2027 class2027, final Class2027 class2028, final float n5) {
        GL11.glPushMatrix();
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        GL11.glColor4f(class2027.Field17325, class2027.Field17326, class2027.Field17327, Float.intBitsToFloat(1107296256));
        GL11.glLineWidth(n5 + Float.intBitsToFloat(1082130432));
        GL11.glBegin(1);
        GL11.glVertex2f(n, n2);
        GL11.glColor4f(class2028.Field17325, class2028.Field17326, class2028.Field17327, Float.intBitsToFloat(1107296256));
        GL11.glVertex2f(n3, n4);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glEnd();
        GL11.glPopMatrix();
    }
    
    public void Method6984() {
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(2884);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        if (Minecraft.getMinecraft().currentScreen == null) {
            return;
        }
        for (final Class1988 class1988 : this.Field16678) {
            if (null.Field11814.Method359().equals(Class1527.Field15140.name())) {
                class1988.Field17131.Method3632();
            }
            else {
                GL11.glColor4f(Class2120.Field17641.Field17325, Class2120.Field17641.Field17326, Class2120.Field17641.Field17327, class1988.Method7366());
            }
            if (Class2120.Field17653) {
                GL11.glPointSize(class1988.Method7369() * Class2120.Field17652);
                GL11.glBegin(0);
                GL11.glVertex2f(class1988.Method7370(), class1988.Method7371());
                GL11.glEnd();
            }
            final int n = Mouse.getEventX() * Minecraft.getMinecraft().currentScreen.width / Minecraft.getMinecraft().displayWidth;
            final int n2 = Minecraft.getMinecraft().currentScreen.height - Mouse.getEventY() * Minecraft.getMinecraft().currentScreen.height / Minecraft.getMinecraft().displayHeight - 1;
            float f1 = 0.0f;
            Class1988 class1989 = null;
            for (final Class1988 class1990 : this.Field16678) {
                final float method7367 = class1988.Method7367(class1990);
                if (method7367 <= Float.intBitsToFloat(1120403456) && (Method6978((float)n, (float)n2, class1988.Method7370(), class1988.Method7371()) <= Double.longBitsToDouble(4636737291354636288L) || Method6978((float)n, (float)n2, class1990.Method7370(), class1990.Method7371()) <= Double.longBitsToDouble((long)1184297759 ^ 0x405900004696F31FL))) {
                    Float.compare(f1, 0.0f);
                    f1 = method7367;
                    class1989 = class1990;
                }
            }
            if (class1989 == null) {
                continue;
            }
            if (!Class2120.Field17650) {
                continue;
            }
            if (Class2120.Field17645) {
                if (Class2120.Field17647.equals(Class2120.Field17648)) {
                    this.Method6981(class1988.Method7370(), class1988.Method7371(), class1989.Method7370(), class1989.Method7371(), Class2120.Field17642, Class2120.Field17643, Class2120.Field17646);
                }
                else if (Class2120.Field17647.equals(Class2120.Field17649)) {
                    this.Method6982(class1988.Method7370(), class1988.Method7371(), class1989.Method7370(), class1989.Method7371(), Class2120.Field17642, Class2120.Field17644, Class2120.Field17643, Class2120.Field17646);
                }
                else {
                    this.Method6980(class1988.Method7370(), class1988.Method7371(), class1989.Method7370(), class1989.Method7371(), Class2120.Field17641, Class2120.Field17646);
                }
            }
            else {
                this.Method6980(class1988.Method7370(), class1988.Method7371(), class1989.Method7370(), class1989.Method7371(), Class2120.Field17641, Class2120.Field17646);
            }
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1056964608), Float.intBitsToFloat(1056964608));
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        GL11.glEnable(3553);
        GL11.glPopMatrix();
        GL11.glDepthMask(true);
        GL11.glEnable(2884);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public void Method6985() {
        Class2120.Method7657();
    }
    
    static {
        Field16677 = 0.0f;
    }
}
