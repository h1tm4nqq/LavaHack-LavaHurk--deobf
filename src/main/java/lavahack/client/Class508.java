//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1419;
import lavahack.client.Class44;
import lavahack.client.Class64;
import lavahack.client.Class648;
import lavahack.client.Class753;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J8\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J \u00100\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016J \u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0015H\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u0010@\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010\u00a8\u0006B"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/sliders/AlphaSlider;", "Lcom/kisman/cc/gui/api/ColorChanger;", "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/ISlider;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "gradient", "minX", "minY", "maxX", "maxY", "startColor", "endColor", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc"})
public final class Class508
implements Class64,
Class648 {
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

    @Override
    public void Method623(int n, int n2) {
        boolean bl = true;
        int n3 = this.Method631() / 2;
        for (int i = -n3; i < this.Field10137; i += n3) {
            bl = false;
        }
        double d = this.Method636();
        double d2 = this.Field10141;
        double d3 = (double)this.Method636() + (double)this.Field10137;
        double d4 = (double)this.Field10141 + (double)this.Method631();
        Class2027 class2027 = this.Field10135;
        Integer n4 = class2027 != null && (class2027 = class2027.Method3633(1)) != null ? Integer.valueOf(class2027.Method3626()) : null;
        if (n4 == null) {
            Intrinsics.throwNpe();
        }
        Class753.drawLeftGradientRect(d, d2, d3, d4, n4, 0);
        float f = this.Method636() + this.Field10137;
        float f2 = this.Field10137;
        Class2027 class20272 = this.Field10135;
        Float f3 = class20272 != null ? Float.valueOf(class20272.Field17328) : null;
        if (f3 == null) {
            Intrinsics.throwNpe();
        }
        int n5 = (int)(f - f2 * f3.floatValue());
        Class753.drawRect((int)(n5 - 1), (int)this.Field10141, (int)(n5 + 1), (int)(this.Field10141 + this.Method631()), (int)-1);
        if (this.Method2342(n, n2)) {
            int n6 = this.Field10140;
            int n7 = 0;
            n6 = Math.max(n6, n);
            n7 = this.Field10140 + this.Field10137;
            boolean bl2 = false;
            int n8 = Math.min(n6, n7);
            Class2027 class20273 = this.Field10135;
            if (class20273 != null) {
                class20273.Method3613(1 - (n8 - this.Field10140) / this.Field10137);
            }
        }
        float f4 = this.Method636();
        Class2027 class20274 = this.Field10135;
        Object object = class20274 != null ? class20274.Method3623() : null;
        if (object == null) {
            Intrinsics.throwNpe();
        }
        float f5 = f4 + object[1] * (float)this.Field10137;
        float f6 = this.Field10141 + this.Field10142 + this.Field10137;
        Class2027 class20275 = this.Field10135;
        Object object2 = class20275 != null ? class20275.Method3623() : null;
        if (object2 == null) {
            Intrinsics.throwNpe();
        }
        float f7 = f6 - object2[2] * (float)this.Field10137;
        Class753.drawRectWH((double)f5 - Double.longBitsToDouble((long)778912255 ^ 0x400000002E6D41FFL), (double)f7 - Double.longBitsToDouble(0x4000000000000000L), Double.longBitsToDouble((long)701480480 ^ 0x4010000029CFBE20L), Double.longBitsToDouble((long)507570030 ^ 0x401000001E40E76EL), -1);
        this.Field10139.Method340(this.Field10135);
    }

    private final void Method2341(int n, int n2, int n3, int n4, int n5, int n6) {
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
        Class508 class508 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class508 class5082 = class508;
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
        if (!this.Method2342(n, n2)) return;
        this.Field10138 = true;
    }

    private final boolean Method2342(int n, int n2) {
        if (n < this.Field10140) return false;
        if (n > this.Field10140 + this.Field10137) return false;
        if (n2 < this.Field10141 + this.Field10142) return false;
        if (n2 > this.Field10141 + this.Field10142 + this.Method631()) return false;
        return true;
    }

    @Override
    public void Method644(boolean bl) {
        this.Field10138 = bl;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field10138 = false;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field10140 = n;
        this.Field10141 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field10142 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field10143 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604 - 3;
    }

    @Override
    public int Method633() {
        return this.Field10143;
    }

    @Override
    public void Method634(int n) {
        this.Field10137 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field10140 = n;
    }

    @Override
    public int Method636() {
        return this.Field10140;
    }

    @Override
    public void Method639(int n) {
        this.Field10136 = n;
    }

    @Override
    public int Method640() {
        return this.Field10136;
    }

    @Override
    public boolean Method641() {
        return true;
    }

    @Override
    public void Method642(@NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this.Field10135 = class2027;
    }

    @Override
    @Nullable
    @Nullable
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

    public final void Method2345(int n) {
        this.Field10140 = n;
    }

    public final int Method2346() {
        return this.Field10141;
    }

    public final void Method2347(int n) {
        this.Field10141 = n;
    }

    public final int Method2348() {
        return this.Field10142;
    }

    public final void Method2349(int n) {
        this.Field10142 = n;
    }

    public final int Method2350() {
        return this.Field10143;
    }

    public final void Method2351(int n) {
        this.Field10143 = n;
    }

    public Class508(@NotNull @NotNull Class44 class44, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        this.Field10139 = class44;
        this.Field10140 = n;
        this.Field10141 = n2;
        this.Field10142 = n3;
        this.Field10143 = n4;
    }

    private static String Method2352(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x7054 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

