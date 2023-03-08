//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import java.awt.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006?\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J8\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J \u00100\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016J \u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0015H\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u0010@\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e?\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010?\u0006B" }, d2 = { "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/sliders/HueSlider;", "Lcom/kisman/cc/gui/api/ColorChanger;", "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/ISlider;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "gradient", "minX", "minY", "maxX", "maxY", "startColor", "endColor", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc" })
public final class Class343 implements Class64, Class648
{
    private Class2027 Field9422;
    private int Field9423;
    private int Field9424;
    private boolean Field9425;
    @NotNull
    private final Class44 Field9426;
    private int Field9427;
    private int Field9428;
    private int Field9429;
    private int Field9430;
    private int Field9431;
    
    @Override
    public void Method644(final boolean field9425) {
        this.Field9425 = field9425;
    }
    
    public void Method623(final int n, final int n2) {
        int n3 = 0;
        while (true) {
            final int hsBtoRGB = Color.HSBtoRGB(n3 / (float)6, 1.0f, 1.0f);
            final int hsBtoRGB2 = Color.HSBtoRGB((n3 + 1) / (float)6, 1.0f, 1.0f);
            GL11.glPushMatrix();
            this.Method1686(this.Method636() + n3 * (this.Field9424 / 6), this.Field9428 + this.Field9429, this.Method636() + (n3 + 1) * (this.Field9424 / 6), this.Field9428 + this.Field9429 + this.Method631(), hsBtoRGB, hsBtoRGB2);
            GL11.glPopMatrix();
            ++n3;
        }
    }
    
    private final void Method1686(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
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
        final Class343 class343 = this;
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
        if (n3 == 0 && this.Method1687(n, n2)) {
            this.Field9425 = true;
        }
    }
    
    private final boolean Method1687(final int n, final int n2) {
        return n >= this.Field9427 && n <= this.Field9427 + this.Field9424 && n2 >= this.Field9428 + this.Field9429 && n2 <= this.Field9428 + this.Field9429 + this.Method631();
    }
    
    public void Method626(final int n, final int n2, final int n3) {
        this.Field9425 = false;
    }
    
    public void Method627(final int field9427, final int field9428) {
        this.Field9427 = field9427;
        this.Field9428 = field9428;
    }
    
    public void Method629(final int field9429) {
        this.Field9429 = field9429;
    }
    
    public void Method630(final int field9430) {
        this.Field9430 = field9430;
    }
    
    public int Method631() {
        return Class1419.Field14604 - 3;
    }
    
    public int Method633() {
        return this.Field9430;
    }
    
    public void Method634(final int field9424) {
        this.Field9424 = field9424;
    }
    
    public void Method635(final int field9427) {
        this.Field9427 = field9427;
    }
    
    public int Method636() {
        return this.Field9427;
    }
    
    public void Method639(final int field9423) {
        this.Field9423 = field9423;
    }
    
    public int Method640() {
        return this.Field9423;
    }
    
    public boolean Method641() {
        return true;
    }
    
    @Override
    public void Method642(@NotNull @NotNull final Class2027 field9422) {
        Intrinsics.checkParameterIsNotNull((Object)field9422, "color");
        this.Field9422 = field9422;
    }
    
    @Nullable
    @Nullable
    @Override
    public Class2027 Method643() {
        return this.Field9422;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method1688() {
        return this.Field9426;
    }
    
    public final int Method1689() {
        return this.Field9427;
    }
    
    public final void Method1690(final int field9427) {
        this.Field9427 = field9427;
    }
    
    public final int Method1691() {
        return this.Field9428;
    }
    
    public final void Method1692(final int field9428) {
        this.Field9428 = field9428;
    }
    
    public final int Method1693() {
        return this.Field9429;
    }
    
    public final void Method1694(final int field9429) {
        this.Field9429 = field9429;
    }
    
    public final int Method1695() {
        return this.Field9430;
    }
    
    public final void Method1696(final int field9430) {
        this.Field9430 = field9430;
    }
    
    public Class343(@NotNull @NotNull final Class44 field9426, final int field9427, final int field9428, final int field9429, final int field9430) {
        Intrinsics.checkParameterIsNotNull((Object)field9426, "setting");
        this.Field9426 = field9426;
        this.Field9427 = field9427;
        this.Field9428 = field9428;
        this.Field9429 = field9429;
        this.Field9430 = field9430;
    }
    
    private static String Method1697(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3CA8 ^ 0x2C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
