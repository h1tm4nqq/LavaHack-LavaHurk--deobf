//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import org.lwjgl.opengl.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006?\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J8\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J \u00100\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016J \u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0015H\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u0010@\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e?\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010?\u0006B" }, d2 = { "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/sliders/AlphaSlider;", "Lcom/kisman/cc/gui/api/ColorChanger;", "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/ISlider;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "gradient", "minX", "minY", "maxX", "maxY", "startColor", "endColor", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc" })
public final class Class508 implements Class64, Class648
{
    private Class2027 Field10135;
    private int Field10136;
    private int Field10137;
    private boolean Field10138;
    @NotNull
    private final Class44 Field10139;
    private int Field10140;
    private int Field10141;
    private int Field10142;
    private int Field10143;
    private String Field10144 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method623(final int b, final int n) {
        for (int n2 = this.Method631() / 2, i = -n2; i < this.Field10137; i += n2) {}
        final double n3 = this.Method636();
        final double n4 = this.Field10141;
        final double n5 = this.Method636() + (double)this.Field10137;
        final double n6 = this.Field10141 + (double)this.Method631();
        final Class2027 field10135 = this.Field10135;
        Integer value = null;
        Integer n7 = null;
        Label_0105: {
            if (field10135 != null) {
                final Class2027 method3633 = field10135.Method3633(1);
                if (method3633 != null) {
                    n7 = (value = method3633.Method3626());
                    break Label_0105;
                }
            }
            n7 = (value = null);
        }
        if (value == null) {
            Intrinsics.throwNpe();
        }
        Class753.drawLeftGradientRect(n3, n4, n5, n6, n7, 0);
        final float n8 = (float)(this.Method636() + this.Field10137);
        final float n9 = (float)this.Field10137;
        final Class2027 field10136 = this.Field10135;
        final Float n10 = (field10136 != null) ? Float.valueOf(field10136.Field17328) : null;
        if (n10 == null) {
            Intrinsics.throwNpe();
        }
        final int n11 = (int)(n8 - n9 * n10);
        Class753.drawRect(n11 - 1, this.Field10141, n11 + 1, this.Field10141 + this.Method631(), -1);
        if (this.Method2342(b, n)) {
            final int min = Math.min(Math.max(this.Field10140, b), this.Field10140 + this.Field10137);
            final Class2027 field10137 = this.Field10135;
            if (field10137 != null) {
                field10137.Method3613(1 - (min - this.Field10140) / this.Field10137);
            }
        }
        final float n12 = (float)this.Method636();
        final Class2027 field10138 = this.Field10135;
        final float[] array = (float[])((field10138 != null) ? field10138.Method3623() : null);
        if (array == null) {
            Intrinsics.throwNpe();
        }
        final float n13 = n12 + array[1] * this.Field10137;
        final float n14 = (float)(this.Field10141 + this.Field10142 + this.Field10137);
        final Class2027 field10139 = this.Field10135;
        final float[] array2 = (float[])((field10139 != null) ? field10139.Method3623() : null);
        if (array2 == null) {
            Intrinsics.throwNpe();
        }
        Class753.drawRectWH(n13 - Double.longBitsToDouble((long)778912255 ^ 0x400000002E6D41FFL), n14 - array2[2] * this.Field10137 - Double.longBitsToDouble(4611686018427387904L), Double.longBitsToDouble((long)701480480 ^ 0x4010000029CFBE20L), Double.longBitsToDouble((long)507570030 ^ 0x401000001E40E76EL), -1);
        this.Field10139.Method340(this.Field10135);
    }
    
    private final void Method2341(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
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
        final Class508 class508 = this;
        GL11.glColor4f(n8, n9, n10, n7);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glVertex2f((float)n, (float)n4);
        GL11.glColor4f(n12, n13, n14, n11);
        GL11.glVertex2f((float)n3, (float)n4);
        GL11.glVertex2f((float)n3, (float)n2);
        GL11.glEnd();
        GL11.glShadeModel(7424);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (n3 == 0 && this.Method2342(n, n2)) {
            this.Field10138 = true;
        }
    }
    
    private final boolean Method2342(final int n, final int n2) {
        return n >= this.Field10140 && n <= this.Field10140 + this.Field10137 && n2 >= this.Field10141 + this.Field10142 && n2 <= this.Field10141 + this.Field10142 + this.Method631();
    }
    
    @Override
    public void Method644(final boolean field10138) {
        this.Field10138 = field10138;
    }
    
    public void Method626(final int n, final int n2, final int n3) {
        this.Field10138 = false;
    }
    
    public void Method627(final int field10140, final int field10141) {
        this.Field10140 = field10140;
        this.Field10141 = field10141;
    }
    
    public void Method629(final int field10142) {
        this.Field10142 = field10142;
    }
    
    public void Method630(final int field10143) {
        this.Field10143 = field10143;
    }
    
    public int Method631() {
        return Class1419.Field14604 - 3;
    }
    
    public int Method633() {
        return this.Field10143;
    }
    
    public void Method634(final int field10137) {
        this.Field10137 = field10137;
    }
    
    public void Method635(final int field10140) {
        this.Field10140 = field10140;
    }
    
    public int Method636() {
        return this.Field10140;
    }
    
    public void Method639(final int field10136) {
        this.Field10136 = field10136;
    }
    
    public int Method640() {
        return this.Field10136;
    }
    
    public boolean Method641() {
        return true;
    }
    
    @Override
    public void Method642(@NotNull @NotNull final Class2027 field10135) {
        Intrinsics.checkParameterIsNotNull((Object)field10135, "color");
        this.Field10135 = field10135;
    }
    
    @Nullable
    @Nullable
    @Override
    public Class2027 Method643() {
        return this.Field10135;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2343() {
        return this.Field10139;
    }
    
    public final int Method2344() {
        return this.Field10140;
    }
    
    public final void Method2345(final int field10140) {
        this.Field10140 = field10140;
    }
    
    public final int Method2346() {
        return this.Field10141;
    }
    
    public final void Method2347(final int field10141) {
        this.Field10141 = field10141;
    }
    
    public final int Method2348() {
        return this.Field10142;
    }
    
    public final void Method2349(final int field10142) {
        this.Field10142 = field10142;
    }
    
    public final int Method2350() {
        return this.Field10143;
    }
    
    public final void Method2351(final int field10143) {
        this.Field10143 = field10143;
    }
    
    public Class508(@NotNull @NotNull final Class44 field10139, final int field10140, final int field10141, final int field10142, final int field10143) {
        Intrinsics.checkParameterIsNotNull((Object)field10139, "setting");
        this.Field10139 = field10139;
        this.Field10140 = field10140;
        this.Field10141 = field10141;
        this.Field10142 = field10142;
        this.Field10143 = field10143;
    }
    
    private static String Method2352(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7054 ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
