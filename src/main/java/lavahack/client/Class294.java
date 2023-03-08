//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import java.awt.datatransfer.*;
import org.lwjgl.opengl.*;

public class Class294 implements Class1520
{
    private final Class44 Field9259;
    private Class2027 Field9260;
    private int Field9261;
    private int Field9262;
    private int Field9263;
    private int Field9264;
    private int Field9265;
    private int Field9266;
    public boolean Field9267;
    private boolean Field9268;
    private boolean Field9269;
    private boolean Field9270;
    private boolean Field9271;
    private boolean Field9272;
    private boolean Field9273;
    private int Field9274;
    private int Field9275;
    private Class2027 Field9276;
    private boolean Field9277;
    private boolean Field9278;
    private String Field9279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class294(final Class44 field9259, final int field9260, final int field9261, final int field9262, final int field9263, final int field9264) {
        this.Field9267 = false;
        this.Field9274 = 120;
        this.Field9277 = true;
        this.Field9278 = true;
        this.Field9259 = field9259;
        this.Field9261 = field9260;
        this.Field9262 = field9261;
        this.Field9263 = field9262;
        this.Field9260 = field9259.Method339();
        this.Field9264 = this.Field9274 - Class1419.Field14604;
        this.Field9266 = field9263;
        this.Field9275 = field9264;
        this.Field9274 = Class981.Method3992(field9264, this.Field9274);
        this.Method1534(field9259.Method339());
    }
    
    private void Method1534(final Class2027 class2027) {
        final Class2027 field9276 = new Class2027();
        field9276.Method3614(Color.RGBtoHSB(class2027.Field17321, class2027.Field17322, class2027.Field17323, null)[0]);
        field9276.Method3615(1.0f);
        field9276.Method3611(1.0f);
        this.Field9276 = field9276;
    }
    
    private void Method1535() {
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(this.Method1536()), null);
    }
    
    private String Method1536() {
        return Integer.toHexString(this.Field9260.Field17321 << 24 | this.Field9260.Field17322 << 16 | this.Field9260.Field17323 << 8 | this.Field9260.Field17324);
    }
    
    private Class2027 Method1537(final String s) {
        final int method1538 = Method1538(s, 16);
        return new Class2027((method1538 & 0xFF) << 24 | method1538 >> 8);
    }
    
    private static int Method1538(final String s, final int n) throws NumberFormatException {
        int n2 = 0;
        int i = 0;
        if (s.equals("")) {
            throw new NumberFormatException();
        }
        final char char1 = s.charAt(0);
        if (char1 == '-') {
            ++i;
        }
        else if (char1 == '+') {
            ++i;
        }
        while (i < s.length()) {
            n2 = n2 * n + Method1539(s.charAt(i++), n);
        }
        return n2;
    }
    
    private static int Method1539(final char c, final int n) throws NumberFormatException {
        final int n2 = (c < 'A' || c > 'Z') ? c : (c - ' ');
        final int n3 = (n2 < 58) ? (n2 - 48) : (n2 - 87);
        if (n3 < 0 || n3 >= n) {
            throw new NumberFormatException();
        }
        return n3;
    }
    
    public void Method623(final int n, final int n2) {
        if (!this.Field9259.Method339().equals(this.Field9260)) {
            this.Method1534(this.Field9260 = this.Field9259.Method339());
        }
        this.Field9264 = this.Field9274;
        Class753.drawRectWH(this.Field9261, this.Field9262 + this.Field9263, this.Field9274, this.Method631(), Class1419.Field14584.Method3626());
        if (Class1419.Field14590) {
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + Class1419.Field14602 }, new double[] { this.Field9261 + this.Field9274 / 2.0f, this.Field9262 + this.Field9263 + Class1419.Field14602 }, new double[] { this.Field9261 + this.Field9274 / 2.0f, this.Field9262 + this.Field9263 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + Class1419.Field14604 - Class1419.Field14602 }), this.Field9260.Method3625(), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335())));
            Class753.drawAbstract(new Class211(new Class340(new double[] { this.Field9261 + this.Field9274 / 2.0f, this.Field9262 + this.Field9263 + Class1419.Field14602 }, new double[] { this.Field9261 + this.Field9274 - Class1419.Field14601, this.Field9262 + this.Field9263 + Class1419.Field14602 }, new double[] { this.Field9261 + this.Field9274 - Class1419.Field14601, this.Field9262 + this.Field9263 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Field9261 + this.Field9274 / 2.0f, this.Field9262 + this.Field9263 + Class1419.Field14604 - Class1419.Field14602 }), Class1172.Method4729(Class1419.Field14584.Method3626(), null.Field16098.Method335()), this.Field9260.Method3625()));
        }
        else {
            Class753.drawRectWH(this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + Class1419.Field14602, this.Field9274 - Class1419.Field14601 * Double.longBitsToDouble(4611686018427387904L), this.Method631() - Class1419.Field14602 * Double.longBitsToDouble(4611686018427387904L), this.Field9260.Method3626());
        }
        Class1419.Method1224(this.Field9259.Method354(), this.Field9261, this.Field9262 + this.Field9263, this.Field9274, Class1419.Field14604);
        if (this.Field9267) {
            final int field14604 = Class1419.Field14604;
            if (null.Field16109.Method365()) {
                this.Method1544(this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + field14604 + Class1419.Field14602, this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble((long)1900597937 ^ 0x400000007148D2B1L), this.Field9264 - Class1419.Field14602 * Double.longBitsToDouble((long)1852602300 ^ 0x400000006E6C77BCL), this.Field9276.Field17325, this.Field9276.Field17326, this.Field9276.Field17327, this.Field9276.Field17328, n, n2);
            }
            else {
                this.Method1544(this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + field14604 + Class1419.Field14602, this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble(4611686018427387904L), this.Field9264 - Class1419.Field14602 * Double.longBitsToDouble(4611686018427387904L), this.Field9260.Field17325, this.Field9260.Field17326, this.Field9260.Field17327, this.Field9260.Field17328, n, n2);
            }
            final int n3 = field14604 + this.Field9264;
            this.Method1542(this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + n3 + Class1419.Field14602, this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble((long)228266487 ^ 0x400000000D9B11F7L), Class1419.Field14604 - 3 - Class1419.Field14602 * Double.longBitsToDouble((long)1576826579 ^ 0x400000005DFC76D3L), this.Field9260.Method3620(), n, n2);
            final int n4 = n3 + (Class1419.Field14604 - 3);
            this.Method1543(this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + n4 + Class1419.Field14602, this.Field9264 - Class1419.Field14601 * Double.longBitsToDouble((long)444959938 ^ 0x400000001A858CC2L), Class1419.Field14604 - 3 - Class1419.Field14602 * Double.longBitsToDouble((long)441900120 ^ 0x400000001A56DC58L), this.Field9260.Field17325, this.Field9260.Field17326, this.Field9260.Field17327, this.Field9260.Field17328, n, n2);
            this.Field9265 = n4 + Class1419.Field14604 - 3;
            this.Method1540(n, n2, this.Field9261 + Class1419.Field14601, this.Field9262 + this.Field9263 + Class1419.Field14604 + Class1419.Field14602);
            final int n5 = (int)(this.Field9261 + this.Field9260.Method3623()[1] * this.Field9264);
            final int n6 = (int)(this.Field9262 + this.Field9263 + Class1419.Field14604 + 5 + this.Field9264 - this.Field9260.Method3623()[2] * this.Field9264);
            if (null.Field16108.Method365() && Class1607.Method6270(0) && this.Field9271) {
                Gui.drawRect(n5 - 8, n6 - 8, n5 + 8, n6 + 8, new Color(0, 0, 0, 255).getRGB());
                Gui.drawRect(n5 - 7, n6 - 7, n5 + 7, n6 + 7, this.Field9260.Method3626());
                Class936.Field11997.Method3868(n5, n6 - 18, Double.longBitsToDouble(4625196817309499392L), Double.longBitsToDouble(4625196817309499392L));
            }
            else {
                Gui.drawRect(n5 - 2, n6 - 2, n5 + 2, n6 + 2, -1);
            }
        }
        this.Field9259.Method340(this.Field9260);
    }
    
    private void Method1540(final int n, final int n2, final double a, final double a2) {
        if (this.Field9271) {
            final float n3 = (float)Math.min(Math.max(a, n), a + this.Field9264);
            final float n4 = (float)Math.min(Math.max(a2, n2), a2 + this.Field9264);
            this.Field9260.Method3615((n3 - (float)a) / this.Field9264);
            this.Field9260.Method3611(1.0f - (n4 - (float)a2) / this.Field9264);
        }
        if (this.Field9272) {
            final float n5 = (float)Math.min(Math.max(a, n), a + this.Field9264);
            this.Field9260.Method3614((n5 - (float)a) / this.Field9264);
            this.Field9276.Method3614((n5 - (float)a) / this.Field9264);
        }
        if (this.Field9273) {
            this.Field9260.Method3612(1.0f - ((float)Math.min(Math.max(a, n), a + this.Field9264) - (float)a) / this.Field9264);
        }
    }
    
    public void Method625(final int n, final int n2, final int n3) {
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
            final Transferable contents = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (!contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return;
            }
            final Class2027 method1537 = this.Method1537((String)contents.getTransferData(DataFlavor.stringFlavor));
            if (method1537 == null) {
                return;
            }
            this.Method1534(this.Field9260 = method1537);
            this.Field9278 = false;
        }
        if (n3 == 2 && !this.Field9268) {
            this.Field9278 = true;
        }
    }
    
    public void Method626(final int n, final int n2, final int n3) {
        final boolean field9271 = false;
        this.Field9272 = field9271;
        this.Field9273 = field9271;
        this.Field9271 = field9271;
        if (n3 == 1) {
            this.Field9277 = true;
        }
        if (n3 == 2) {
            this.Field9278 = true;
        }
    }
    
    public void Method627(final int field9261, final int field9262) {
        this.Field9261 = field9261;
        this.Field9262 = field9262;
    }
    
    public void Method629(final int field9263) {
        this.Field9263 = field9263;
    }
    
    public int Method632() {
        return Class1419.Field14604 + (this.Field9267 ? this.Field9265 : 0);
    }
    
    public boolean Method641() {
        return this.Field9259.Method311() && Class1419.Method1233(this.Field9259.Method354());
    }
    
    public void Method630(final int field9266) {
        this.Field9266 = field9266;
    }
    
    public int Method633() {
        return this.Field9266;
    }
    
    public void Method634(final int field9274) {
        this.Field9274 = field9274;
    }
    
    public void Method635(final int field9261) {
        this.Field9261 = field9261;
    }
    
    public int Method636() {
        return this.Field9261;
    }
    
    public void Method639(final int field9275) {
        this.Field9275 = field9275;
    }
    
    public int Method640() {
        return this.Field9275;
    }
    
    private boolean Method1541(final int n, final int n2) {
        return n > this.Field9261 && n < this.Field9261 + this.Field9274 && n2 > this.Field9262 + this.Field9263 && n2 < this.Field9262 + this.Field9263 + Class1419.Field14604;
    }
    
    private void Method1542(final double n, double n2, final double n3, final double n4, final float n5, final int n6, final int n7) {
        this.Field9269 = (n6 > n && n6 < n + n3 && n7 > n2 && n7 < n2 + n4);
        int n8 = 0;
        if (n4 > n3) {
            Class753.drawRect(n, n2, n + n3, n2 + Double.longBitsToDouble(4616189618054758400L), -1);
            n2 += Double.longBitsToDouble((long)590606243 ^ 0x401000002333EFA3L);
            int n9 = 0;
            while (true) {
                Class753.drawGradientRect(n, n2 + n8 * (n4 / Double.longBitsToDouble(4618441417868443648L)), n + n3, n2 + (n8 + 1) * (n4 / Double.longBitsToDouble((long)492675575 ^ 0x401800001D5DA1F7L)), Color.HSBtoRGB(n8 / Float.intBitsToFloat(1086324736), 1.0f, 1.0f), Color.HSBtoRGB((n8 + 1) / Float.intBitsToFloat(1086324736), 1.0f, 1.0f));
                ++n8;
                ++n9;
            }
        }
        else {
            int n10 = 0;
            while (true) {
                this.Method1545(n + n8 * (n3 / Double.longBitsToDouble(4618441417868443648L)), n2, n + (n8 + 1) * (n3 / Double.longBitsToDouble(4618441417868443648L)), n2 + n4, Color.HSBtoRGB(n8 / Float.intBitsToFloat(1086324736), 1.0f, 1.0f), Color.HSBtoRGB((n8 + 1) / Float.intBitsToFloat(1086324736), 1.0f, 1.0f), true);
                ++n8;
                ++n10;
            }
        }
    }
    
    public void Method1543(final double n, final double n2, final double n3, final double n4, final float r, final float g, final float b, final float n5, final int n6, final int n7) {
        this.Field9270 = (n6 > n && n6 < n + n3 && n7 > n2 && n7 < n2 + n4);
        for (double n8 = n4 / Double.longBitsToDouble(4611686018427387904L), n9 = -n8; n9 < n3; n9 += n8) {}
        Class753.drawLeftGradientRect(n, n2, n + n3, n2 + n4, new Color(r, g, b, 1.0f).getRGB(), 0);
        final int n10 = (int)(n + n3 - n3 * n5);
        Class753.drawRect(n10 - 1, n2, n10 + 1, n2 + n4, -1);
    }
    
    private void Method1544(final double n, final double n2, final double n3, final double n4, final float n5, final float n6, final float n7, final float n8, final int n9, final int n10) {
        this.Field9268 = (n9 > n && n9 < n + n3 && n10 > n2 && n10 < n2 + n4);
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        GL11.glBegin(9);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glVertex2d(n, n2);
        GL11.glVertex2d(n, n2 + n4);
        GL11.glColor4f(n5, n6, n7, n8);
        GL11.glVertex2d(n + n3, n2 + n4);
        GL11.glVertex2d(n + n3, n2);
        GL11.glEnd();
        GL11.glDisable(3008);
        GL11.glBegin(9);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glVertex2d(n, n2);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glVertex2d(n, n2 + n4);
        GL11.glVertex2d(n + n3, n2 + n4);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glVertex2d(n + n3, n2);
        GL11.glEnd();
        GL11.glEnable(3008);
        GL11.glShadeModel(7424);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }
    
    protected void Method1545(final double n, final double n2, final double n3, final double n4, final int n5, final int n6, final boolean b) {
        if (b) {
            final float n7 = (n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n8 = (n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n9 = (n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n10 = (n5 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n11 = (n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n12 = (n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n13 = (n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
            final float n14 = (n6 & 0xFF) / Float.intBitsToFloat(1132396544);
            GL11.glPushMatrix();
            GL11.glEnable(3042);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glShadeModel(7425);
            GL11.glBegin(9);
            GL11.glColor4f(n8, n9, n10, n7);
            GL11.glVertex2d(n, n2);
            GL11.glVertex2d(n, n4);
            GL11.glColor4f(n12, n13, n14, n11);
            GL11.glVertex2d(n3, n4);
            GL11.glVertex2d(n3, n2);
            GL11.glEnd();
            GL11.glShadeModel(7424);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
            GL11.glPopMatrix();
        }
        else {
            Class753.drawGradientRect(n, n2, n3, n4, n5, n6);
        }
    }
    
    public void Method637(final int field9262) {
        this.Field9262 = field9262;
    }
    
    public int Method638() {
        return this.Field9262 + this.Field9263;
    }
    
    private static String Method1546(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3013 ^ 0x7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
