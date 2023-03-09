/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL41
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1876;
import lavahack.client.Class753;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL41;

public class Class548
implements Class1876 {
    private String Field10326 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method2445(double d, double d2, double d3, double d4, Color color) {
        Class753.drawRect(7, (int)d / 2, (int)d2 / 2, (int)d / 2 + (int)d3 / 2, (int)d2 / 2 + (int)d4 / 2, color.getRGB());
    }

    @Override
    public void Method2444(float f, float f2, int n, int n2) {
        float f3 = (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f5 = (float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f6 = (float)(n2 & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)Float.intBitsToFloat(0x40400000));
        GL11.glBegin((int)3);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble(4618722892845154304L)), (double)(f2 + Float.intBitsToFloat(0x40300000)));
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble(4622663542519103488L)), (double)(f2 + Float.intBitsToFloat(1092878336)));
        GL11.glVertex2d((double)(f + (float)n - Float.intBitsToFloat(1096548352)), (double)(f2 + Float.intBitsToFloat(1089994752)));
        GL11.glEnd();
        GL11.glLineWidth((float)Float.intBitsToFloat(1069547520));
        GL11.glBegin((int)3);
        GL11.glColor4f((float)f4, (float)f5, (float)f6, (float)f3);
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble((long)1084099192 ^ 0x401A0000409E0A78L)), (double)(f2 + Float.intBitsToFloat(0x40400000)));
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble((long)1465836142 ^ 0x40270000575EE26EL)), (double)(f2 + Float.intBitsToFloat(1092616192)));
        GL11.glVertex2d((double)((double)(f + (float)n) - Double.longBitsToDouble(4623789442425946112L)), (double)(f2 + Float.intBitsToFloat(0x41000000)));
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    @Override
    public void Method2446(double d, double d2, double d3, double d4, float f, Color color) {
        if (!null.Field11803.Method365()) {
            return;
        }
        GL11.glLineWidth((float)f);
        Class753.drawRect(2, (int)d / 2, (int)d2 / 2, (int)d / 2 + (int)d3 / 2, (int)d2 / 2 + (int)d4 / 2, Class1172.Method4719(color));
    }

    @Override
    public void Method2447(Color color) {
        Class1172.Method4730(color);
    }

    @Override
    public void Method2448(int n, int n2, String string, Color color) {
        Class1178.Method4743(string, (float)n / 2.0f, (float)(++n2) / 2.0f, Class1172.Method4719(color), true);
    }

    @Override
    public int Method2449(String string) {
        return Class1178.Method4741(string) * 2;
    }

    @Override
    public int Method2450(String string) {
        return Class1178.Method4747(true) * 2;
    }

    @Override
    public void Method2451(double d, double d2, double d3, double d4, double d5, double d6, Color color) {
    }

    @Override
    public void Method2452() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)256);
        GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
        GL11.glDepthFunc((int)513);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
    }

    @Override
    public void Method2453() {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glDepthMask((boolean)true);
        GL11.glDepthFunc((int)514);
    }

    @Override
    public void Method2454() {
        GL41.glClearDepthf((float)1.0f);
        GL11.glClear((int)1280);
        GL11.glDisable((int)2929);
        GL11.glDepthFunc((int)515);
        GL11.glDepthMask((boolean)false);
    }

    @Override
    public int Method2455() {
        return Class1172.Method4709(100, 100);
    }

    @Override
    public Color Method2456() {
        return Class1172.Method4711(100, 100);
    }
}

