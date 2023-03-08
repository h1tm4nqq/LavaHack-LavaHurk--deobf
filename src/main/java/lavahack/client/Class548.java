//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import org.lwjgl.opengl.*;

public class Class548 implements Class1876
{
    private String Field10326 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method2445(final double n, final double n2, final double n3, final double n4, final Color color) {
        Class753.drawRect(7, (int)n / 2, (int)n2 / 2, (int)n / 2 + (int)n3 / 2, (int)n2 / 2 + (int)n4 / 2, color.getRGB());
    }
    
    public void Method2444(final float n, final float n2, final int n3, final int n4) {
        final float n5 = (n4 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n6 = (n4 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n7 = (n4 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        final float n8 = (n4 & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3553);
        GL11.glEnable(2848);
        GL11.glBlendFunc(770, 771);
        GL11.glLineWidth(Float.intBitsToFloat(1077936128));
        GL11.glBegin(3);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glVertex2d(n + n3 - Double.longBitsToDouble(4618722892845154304L), (double)(n2 + Float.intBitsToFloat(1076887552)));
        GL11.glVertex2d(n + n3 - Double.longBitsToDouble(4622663542519103488L), (double)(n2 + Float.intBitsToFloat(1092878336)));
        GL11.glVertex2d((double)(n + n3 - Float.intBitsToFloat(1096548352)), (double)(n2 + Float.intBitsToFloat(1089994752)));
        GL11.glEnd();
        GL11.glLineWidth(Float.intBitsToFloat(1069547520));
        GL11.glBegin(3);
        GL11.glColor4f(n6, n7, n8, n5);
        GL11.glVertex2d(n + n3 - Double.longBitsToDouble((long)1084099192 ^ 0x401A0000409E0A78L), (double)(n2 + Float.intBitsToFloat(1077936128)));
        GL11.glVertex2d(n + n3 - Double.longBitsToDouble((long)1465836142 ^ 0x40270000575EE26EL), (double)(n2 + Float.intBitsToFloat(1092616192)));
        GL11.glVertex2d(n + n3 - Double.longBitsToDouble(4623789442425946112L), (double)(n2 + Float.intBitsToFloat(1090519040)));
        GL11.glEnd();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public void Method2446(final double n, final double n2, final double n3, final double n4, final float n5, final Color color) {
        if (!null.Field11803.Method365()) {
            return;
        }
        GL11.glLineWidth(n5);
        Class753.drawRect(2, (int)n / 2, (int)n2 / 2, (int)n / 2 + (int)n3 / 2, (int)n2 / 2 + (int)n4 / 2, Class1172.Method4719(color));
    }
    
    public void Method2447(final Color color) {
        Class1172.Method4730(color);
    }
    
    public void Method2448(final int n, int n2, final String s, final Color color) {
        ++n2;
        Class1178.Method4743(s, (double)(n / 2.0f), (double)(n2 / 2.0f), Class1172.Method4719(color), true);
    }
    
    public int Method2449(final String s) {
        return Class1178.Method4741(s) * 2;
    }
    
    public int Method2450(final String s) {
        return Class1178.Method4747(true) * 2;
    }
    
    public void Method2451(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Color color) {
    }
    
    public void Method2452() {
        GL41.glClearDepthf(1.0f);
        GL11.glClear(256);
        GL11.glColorMask(false, false, false, false);
        GL11.glDepthFunc(513);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
    }
    
    public void Method2453() {
        GL11.glColorMask(true, true, true, true);
        GL11.glDepthMask(true);
        GL11.glDepthFunc(514);
    }
    
    public void Method2454() {
        GL41.glClearDepthf(1.0f);
        GL11.glClear(1280);
        GL11.glDisable(2929);
        GL11.glDepthFunc(515);
        GL11.glDepthMask(false);
    }
    
    public int Method2455() {
        return Class1172.Method4709(100, 100);
    }
    
    public Color Method2456() {
        return Class1172.Method4711(100, 100);
    }
}
