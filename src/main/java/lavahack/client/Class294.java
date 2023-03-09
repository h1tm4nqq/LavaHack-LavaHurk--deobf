//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.Gui
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class1607;
import lavahack.client.Class211;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class753;
import lavahack.client.Class936;
import lavahack.client.Class981;
import net.minecraft.client.gui.Gui;
import org.lwjgl.opengl.GL11;

public class Class294
implements Class1520 {
    private final Class44 Field9259;
    private Class2027 Field9260;
    private int Field9261;
    private int Field9262;
    private int Field9263;
    private int Field9264;
    private int Field9265;
    private int Field9266;
    public boolean Field9267 = false;
    private boolean Field9268;
    private boolean Field9269;
    private boolean Field9270;
    private boolean Field9271;
    private boolean Field9272;
    private boolean Field9273;
    private int Field9274 = 120;
    private int Field9275;
    private Class2027 Field9276;
    private boolean Field9277 = true;
    private boolean Field9278 = true;
    private String Field9279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class294(Class44 class44, int n, int n2, int n3, int n4, int n5) {
        this.Field9259 = class44;
        this.Field9261 = n;
        this.Field9262 = n2;
        this.Field9263 = n3;
        this.Field9260 = class44.Method339();
        this.Field9264 = this.Field9274 - Class1419.Field14604;
        this.Field9266 = n4;
        this.Field9275 = n5;
        this.Field9274 = Class981.Method3992(n5, this.Field9274);
        this.Method1534(class44.Method339());
    }

    private void Method1534(Class2027 class2027) {
        Class2027 class20272 = new Class2027();
        class20272.Method3614(Color.RGBtoHSB(class2027.Field17321, class2027.Field17322, class2027.Field17323, null)[0]);
        class20272.Method3615(1.0f);
        class20272.Method3611(1.0f);
        this.Field9276 = class20272;
    }

    private void Method1535() {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.Method1536()), null);
    }

    private String Method1536() {
        return Integer.toHexString(this.Field9260.Field17321 << 24 | this.Field9260.Field17322 << 16 | this.Field9260.Field17323 << 8 | this.Field9260.Field17324);
    }

    private Class2027 Method1537(String string) {
        int n = Class294.Method1538(string, 16);
        return new Class2027((n & 0xFF) << 24 | n >> 8);
    }

    private static int Method1538(String string, int n) throws NumberFormatException {
        int n2 = 0;
        int n3 = 0;
        if (string.equals("")) {
            throw new NumberFormatException();
        }
        boolean bl = false;
        char c = string.charAt(0);
        if (c == '-') {
            bl = true;
            ++n3;
        } else if (c == '+') {
            ++n3;
        }
        while (n3 < string.length()) {
            int n4 = Class294.Method1539(string.charAt(n3++), n);
            n2 *= n;
            n2 += n4;
        }
        return n2;
    }

    private static int Method1539(char n, int n2) throws NumberFormatException {
        int n3 = n < 65 || n > 90 ? n : n - 32;
        int n4 = n3 < 58 ? n3 - 48 : n3 - 87;
        if (n4 < 0) throw new NumberFormatException();
        if (n4 < n2) return n4;
        throw new NumberFormatException();
    }

    @Override
    public void Method623(int n, int n2) {
        if (!this.Field9259.Method339().equals(this.Field9260)) {
            this.Field9260 = this.Field9259.Method339();
            this.Method1534(this.Field9260);
        }
        this.Field9264 = this.Field9274;
        Class753.drawRectWH(this.Field9261, this.Field9262 + this.Field9263, this.Field9274, this.Method631(), Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[]{(double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263) + Class1419.Field14602}, new double[]{(float)this.Field9261 + (float)this.Field9274 / 2.0f, (double)(this.Field9262 + this.Field9263) + Class1419.Field14602}, new double[]{(float)this.Field9261 + (float)this.Field9274 / 2.0f, (double)(this.Field9262 + this.Field9263 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263 + Class1419.Field14604) - Class1419.Field14602}), this.Field9260.Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
            Class753.drawAbstract(new Class211(new Class340(new double[]{(float)this.Field9261 + (float)this.Field9274 / 2.0f, (double)(this.Field9262 + this.Field9263) + Class1419.Field14602}, new double[]{(double)(this.Field9261 + this.Field9274) - Class1419.Field14601, (double)(this.Field9262 + this.Field9263) + Class1419.Field14602}, new double[]{(double)(this.Field9261 + this.Field9274) - Class1419.Field14601, (double)(this.Field9262 + this.Field9263 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(float)this.Field9261 + (float)this.Field9274 / 2.0f, (double)(this.Field9262 + this.Field9263 + Class1419.Field14604) - Class1419.Field14602}), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), this.Field9260.Method3625()));
        } else {
            Class753.drawRectWH((double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263) + Class1419.Field14602, (double)this.Field9274 - Class1419.Field14601 * Double.longBitsToDouble(0x4000000000000000L), (double)this.Method631() - Class1419.Field14602 * Double.longBitsToDouble(0x4000000000000000L), this.Field9260.Method3626());
        }
        Class1419.Method1224(this.Field9259.Method354(), this.Field9261, this.Field9262 + this.Field9263, this.Field9274, Class1419.Field14604);
        if (this.Field9267) {
            int n3 = Class1419.Field14604;
            if (null.Field16109.Method365()) {
                this.Method1544((double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263 + n3) + Class1419.Field14602, (double)this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble((long)1900597937 ^ 0x400000007148D2B1L), (double)this.Field9264 - Class1419.Field14602 * Double.longBitsToDouble((long)1852602300 ^ 0x400000006E6C77BCL), this.Field9276.Field17325, this.Field9276.Field17326, this.Field9276.Field17327, this.Field9276.Field17328, n, n2);
            } else {
                this.Method1544((double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263 + n3) + Class1419.Field14602, (double)this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble(0x4000000000000000L), (double)this.Field9264 - Class1419.Field14602 * Double.longBitsToDouble(0x4000000000000000L), this.Field9260.Field17325, this.Field9260.Field17326, this.Field9260.Field17327, this.Field9260.Field17328, n, n2);
            }
            this.Method1542((double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263 + (n3 += this.Field9264)) + Class1419.Field14602, (double)this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble((long)228266487 ^ 0x400000000D9B11F7L), (double)(Class1419.Field14604 - 3) - Class1419.Field14602 * Double.longBitsToDouble((long)1576826579 ^ 0x400000005DFC76D3L), this.Field9260.Method3620(), n, n2);
            this.Method1543((double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263 + (n3 += Class1419.Field14604 - 3)) + Class1419.Field14602, (double)this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble((long)444959938 ^ 0x400000001A858CC2L), (double)(Class1419.Field14604 - 3) - Class1419.Field14602 * Double.longBitsToDouble((long)441900120 ^ 0x400000001A56DC58L), this.Field9260.Field17325, this.Field9260.Field17326, this.Field9260.Field17327, this.Field9260.Field17328, n, n2);
            this.Field9265 = n3 + Class1419.Field14604 - 3;
            this.Method1540(n, n2, (double)this.Field9261 + Class1419.Field14601, (double)(this.Field9262 + this.Field9263 + Class1419.Field14604) + Class1419.Field14602);
            int n4 = (int)((float)this.Field9261 + this.Field9260.Method3623()[1] * (float)this.Field9264);
            int n5 = (int)((float)(this.Field9262 + this.Field9263 + Class1419.Field14604 + 5 + this.Field9264) - this.Field9260.Method3623()[2] * (float)this.Field9264);
            if (null.Field16108.Method365() && Class1607.Method6270(0) && this.Field9271) {
                Gui.drawRect((int)(n4 - 8), (int)(n5 - 8), (int)(n4 + 8), (int)(n5 + 8), (int)new Color(0, 0, 0, 255).getRGB());
                Gui.drawRect((int)(n4 - 7), (int)(n5 - 7), (int)(n4 + 7), (int)(n5 + 7), (int)this.Field9260.Method3626());
                Class936.Field11997.Method3868(n4, n5 - 18, Double.longBitsToDouble(0x4030000000000000L), Double.longBitsToDouble(0x4030000000000000L));
            } else {
                Gui.drawRect((int)(n4 - 2), (int)(n5 - 2), (int)(n4 + 2), (int)(n5 + 2), (int)-1);
            }
        }
        this.Field9259.Method340(this.Field9260);
    }

    private void Method1540(int n, int n2, double d, double d2) {
        float f;
        if (this.Field9271) {
            f = (float)Math.min(Math.max(d, (double)n), d + (double)this.Field9264);
            float f2 = (float)Math.min(Math.max(d2, (double)n2), d2 + (double)this.Field9264);
            this.Field9260.Method3615((f - (float)d) / (float)this.Field9264);
            this.Field9260.Method3611(1.0f - (f2 - (float)d2) / (float)this.Field9264);
        }
        if (this.Field9272) {
            f = (float)Math.min(Math.max(d, (double)n), d + (double)this.Field9264);
            this.Field9260.Method3614((f - (float)d) / (float)this.Field9264);
            this.Field9276.Method3614((f - (float)d) / (float)this.Field9264);
        }
        if (!this.Field9273) return;
        f = (float)Math.min(Math.max(d, (double)n), d + (double)this.Field9264);
        this.Field9260.Method3612(1.0f - (f - (float)d) / (float)this.Field9264);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (n3 == 0) {
            if (this.Method1541(n, n2)) {
                this.Field9267 = !this.Field9267;
            }
            this.Field9271 = this.Field9268;
            this.Field9272 = this.Field9269;
            this.Field9273 = this.Field9270;
        }
        if (!null.Field16110.Method365()) {
            return;
        }
        if (n3 == 1 && this.Field9268 && this.Field9277) {
            this.Method1535();
            this.Field9277 = false;
        }
        if (n3 == 1 && !this.Field9268) {
            this.Field9277 = true;
        }
        if (n3 == 2 && this.Field9268 && this.Field9278) {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (!transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return;
            }
            String string = (String)transferable.getTransferData(DataFlavor.stringFlavor);
            Class2027 class2027 = this.Method1537(string);
            if (class2027 == null) {
                return;
            }
            this.Field9260 = class2027;
            this.Method1534(this.Field9260);
            this.Field9278 = false;
        }
        if (n3 != 2) return;
        if (this.Field9268) return;
        this.Field9278 = true;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field9272 = false;
        this.Field9273 = false;
        this.Field9271 = false;
        if (n3 == 1) {
            this.Field9277 = true;
        }
        if (n3 != 2) return;
        this.Field9278 = true;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field9261 = n;
        this.Field9262 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field9263 = n;
    }

    @Override
    public int Method632() {
        int n;
        if (this.Field9267) {
            n = this.Field9265;
            return Class1419.Field14604 + n;
        }
        n = 0;
        return Class1419.Field14604 + n;
    }

    @Override
    public boolean Method641() {
        if (!this.Field9259.Method311()) return false;
        if (!Class1419.Method1233(this.Field9259.Method354())) return false;
        return true;
    }

    @Override
    public void Method630(int n) {
        this.Field9266 = n;
    }

    @Override
    public int Method633() {
        return this.Field9266;
    }

    @Override
    public void Method634(int n) {
        this.Field9274 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field9261 = n;
    }

    @Override
    public int Method636() {
        return this.Field9261;
    }

    @Override
    public void Method639(int n) {
        this.Field9275 = n;
    }

    @Override
    public int Method640() {
        return this.Field9275;
    }

    private boolean Method1541(int n, int n2) {
        if (n <= this.Field9261) return false;
        if (n >= this.Field9261 + this.Field9274) return false;
        if (n2 <= this.Field9262 + this.Field9263) return false;
        if (n2 >= this.Field9262 + this.Field9263 + Class1419.Field14604) return false;
        return true;
    }

    private void Method1542(double d, double d2, double d3, double d4, float f, int n, int n2) {
        this.Field9269 = (double)n > d && (double)n < d + d3 && (double)n2 > d2 && (double)n2 < d2 + d4;
        int n3 = 0;
        if (d4 > d3) {
            Class753.drawRect(d, d2, d + d3, d2 + Double.longBitsToDouble(0x4010000000000000L), -1);
            d2 += Double.longBitsToDouble((long)590606243 ^ 0x401000002333EFA3L);
            int n4 = 0;
            while (true) {
                int n5 = Color.HSBtoRGB((float)n3 / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
                int n6 = Color.HSBtoRGB((float)(n3 + 1) / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
                Class753.drawGradientRect(d, d2 + (double)n3 * (d4 / Double.longBitsToDouble(4618441417868443648L)), d + d3, d2 + (double)(n3 + 1) * (d4 / Double.longBitsToDouble((long)492675575 ^ 0x401800001D5DA1F7L)), n5, n6);
                ++n3;
                ++n4;
            }
        }
        int n7 = 0;
        while (true) {
            int n8 = Color.HSBtoRGB((float)n3 / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
            int n9 = Color.HSBtoRGB((float)(n3 + 1) / Float.intBitsToFloat(0x40C00000), 1.0f, 1.0f);
            this.Method1545(d + (double)n3 * (d3 / Double.longBitsToDouble(4618441417868443648L)), d2, d + (double)(n3 + 1) * (d3 / Double.longBitsToDouble(4618441417868443648L)), d2 + d4, n8, n9, true);
            ++n3;
            ++n7;
        }
    }

    public void Method1543(double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n, int n2) {
        this.Field9270 = (double)n > d && (double)n < d + d3 && (double)n2 > d2 && (double)n2 < d2 + d4;
        boolean bl = true;
        double d5 = d4 / Double.longBitsToDouble(0x4000000000000000L);
        double d6 = -d5;
        while (true) {
            if (!(d6 < d3)) {
                Class753.drawLeftGradientRect(d, d2, d + d3, d2 + d4, new Color(f, f2, f3, 1.0f).getRGB(), 0);
                int n3 = (int)(d + d3 - d3 * (double)f4);
                Class753.drawRect(n3 - 1, d2, n3 + 1, d2 + d4, -1);
                return;
            }
            bl = false;
            d6 += d5;
        }
    }

    private void Method1544(double d, double d2, double d3, double d4, float f, float f2, float f3, float f4, int n, int n2) {
        this.Field9268 = (double)n > d && (double)n < d + d3 && (double)n2 > d2 && (double)n2 < d2 + d4;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)9);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glEnd();
        GL11.glDisable((int)3008);
        GL11.glBegin((int)9);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2d((double)d, (double)(d2 + d4));
        GL11.glVertex2d((double)(d + d3), (double)(d2 + d4));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2d((double)(d + d3), (double)d2);
        GL11.glEnd();
        GL11.glEnable((int)3008);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    protected void Method1545(double d, double d2, double d3, double d4, int n, int n2, boolean bl) {
        if (bl) {
            float f = (float)(n >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f2 = (float)(n >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f3 = (float)(n >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f4 = (float)(n & 0xFF) / Float.intBitsToFloat(1132396544);
            float f5 = (float)(n2 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f6 = (float)(n2 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f7 = (float)(n2 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            float f8 = (float)(n2 & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)9);
            GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
            GL11.glVertex2d((double)d, (double)d2);
            GL11.glVertex2d((double)d, (double)d4);
            GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
            GL11.glVertex2d((double)d3, (double)d4);
            GL11.glVertex2d((double)d3, (double)d2);
            GL11.glEnd();
            GL11.glShadeModel((int)7424);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
            return;
        }
        Class753.drawGradientRect(d, d2, d3, d4, n, n2);
    }

    @Override
    public void Method637(int n) {
        this.Field9262 = n;
    }

    @Override
    public int Method638() {
        return this.Field9262 + this.Field9263;
    }

    private static String Method1546(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 7;
            cArray2[n] = (char)(cArray[n] ^ (0x3013 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

