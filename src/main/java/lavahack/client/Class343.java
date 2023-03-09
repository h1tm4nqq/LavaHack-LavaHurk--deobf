/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1419;
import lavahack.client.Class44;
import lavahack.client.Class64;
import lavahack.client.Class648;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J8\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J \u00100\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016J \u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0015H\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u0010@\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010\u00a8\u0006B"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/sliders/HueSlider;", "Lcom/kisman/cc/gui/api/ColorChanger;", "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/ISlider;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "gradient", "minX", "minY", "maxX", "maxY", "startColor", "endColor", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc"})
public final class Class343
implements Class64,
Class648 {
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
    public void Method644(boolean bl) {
        this.Field9425 = bl;
    }

    @Override
    public void Method623(int n, int n2) {
        int n3 = 0;
        int n4 = 5;
        while (true) {
            int n5 = Color.HSBtoRGB((float)n3 / (float)6, 1.0f, 1.0f);
            int n6 = Color.HSBtoRGB((float)(n3 + 1) / (float)6, 1.0f, 1.0f);
            GL11.glPushMatrix();
            this.Method1686(this.Method636() + n3 * (this.Field9424 / 6), this.Field9428 + this.Field9429, this.Method636() + (n3 + 1) * (this.Field9424 / 6), this.Field9428 + this.Field9429 + this.Method631(), n5, n6);
            GL11.glPopMatrix();
            ++n3;
        }
    }

    private final void Method1686(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = (float)(n5 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f2 = (float)(n5 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f3 = (float)(n5 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f4 = (float)(n5 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f5 = (float)(n6 >> 24 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f6 = (float)(n6 >> 16 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f7 = (float)(n6 >> 8 & 0xFF) / Float.intBitsToFloat(1132396544);
        float f8 = (float)(n6 & 0xFF) / Float.intBitsToFloat(1132396544);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)9);
        Class343 class343 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class343 class3432 = class343;
        boolean bl3 = false;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glVertex2f((float)n, (float)n4);
        GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
        GL11.glVertex2f((float)n3, (float)n4);
        GL11.glVertex2f((float)n3, (float)n2);
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (n3 != 0) return;
        if (!this.Method1687(n, n2)) return;
        this.Field9425 = true;
    }

    private final boolean Method1687(int n, int n2) {
        if (n < this.Field9427) return false;
        if (n > this.Field9427 + this.Field9424) return false;
        if (n2 < this.Field9428 + this.Field9429) return false;
        if (n2 > this.Field9428 + this.Field9429 + this.Method631()) return false;
        return true;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field9425 = false;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field9427 = n;
        this.Field9428 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field9429 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field9430 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604 - 3;
    }

    @Override
    public int Method633() {
        return this.Field9430;
    }

    @Override
    public void Method634(int n) {
        this.Field9424 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field9427 = n;
    }

    @Override
    public int Method636() {
        return this.Field9427;
    }

    @Override
    public void Method639(int n) {
        this.Field9423 = n;
    }

    @Override
    public int Method640() {
        return this.Field9423;
    }

    @Override
    public boolean Method641() {
        return true;
    }

    @Override
    public void Method642(@NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this.Field9422 = class2027;
    }

    @Override
    @Nullable
    @Nullable
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

    public final void Method1690(int n) {
        this.Field9427 = n;
    }

    public final int Method1691() {
        return this.Field9428;
    }

    public final void Method1692(int n) {
        this.Field9428 = n;
    }

    public final int Method1693() {
        return this.Field9429;
    }

    public final void Method1694(int n) {
        this.Field9429 = n;
    }

    public final int Method1695() {
        return this.Field9430;
    }

    public final void Method1696(int n) {
        this.Field9430 = n;
    }

    public Class343(@NotNull @NotNull Class44 class44, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        this.Field9426 = class44;
        this.Field9427 = n;
        this.Field9428 = n2;
        this.Field9429 = n3;
        this.Field9430 = n4;
    }

    private static String Method1697(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 44;
            cArray2[n] = (char)(cArray[n] ^ (0x3CA8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

