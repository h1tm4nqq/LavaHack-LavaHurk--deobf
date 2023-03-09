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
import lavahack.client.Class44;
import lavahack.client.Class64;
import lavahack.client.Class753;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002J \u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0016J \u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0014H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0005H\u0016J\u0018\u00108\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0014H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f\u00a8\u0006:"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/colorpicker/PickerBase;", "Lcom/kisman/cc/gui/api/ColorChanger;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc"})
public final class Class1196
implements Class64 {
    private Class2027 Field13423;
    private int Field13424;
    private int Field13425;
    private boolean Field13426;
    @NotNull
    private final Class44 Field13427;
    private int Field13428;
    private int Field13429;
    private int Field13430;
    private int Field13431;
    private String Field13432 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method644(boolean bl) {
        this.Field13426 = bl;
    }

    @Override
    public void Method623(int n, int n2) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)9);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13430));
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13425));
        Class2027 class2027 = this.Field13423;
        Float f = class2027 != null ? Float.valueOf(class2027.Field17325) : null;
        if (f == null) {
            Intrinsics.throwNpe();
        }
        float f2 = f.floatValue();
        Class2027 class20272 = this.Field13423;
        Float f3 = class20272 != null ? Float.valueOf(class20272.Field17326) : null;
        if (f3 == null) {
            Intrinsics.throwNpe();
        }
        float f4 = f3.floatValue();
        Class2027 class20273 = this.Field13423;
        Float f5 = class20273 != null ? Float.valueOf(class20273.Field17327) : null;
        if (f5 == null) {
            Intrinsics.throwNpe();
        }
        float f6 = f5.floatValue();
        Class2027 class20274 = this.Field13423;
        Float f7 = class20274 != null ? Float.valueOf(class20274.Field17328) : null;
        if (f7 == null) {
            Intrinsics.throwNpe();
        }
        GL11.glColor4f((float)f2, (float)f4, (float)f6, (float)f7.floatValue());
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13425));
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13430));
        GL11.glEnd();
        GL11.glDisable((int)3008);
        GL11.glBegin((int)9);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13430));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13425));
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13425));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13430));
        GL11.glEnd();
        GL11.glEnable((int)3008);
        GL11.glShadeModel((int)7424);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        if (this.Method4818(n, n2)) {
            int n3 = this.Field13428;
            int n4 = 0;
            n3 = Math.max(n3, n);
            n4 = this.Field13428 + this.Field13425;
            int n5 = 0;
            int n6 = Math.min(n3, n4);
            n4 = this.Field13429 + this.Field13430;
            n5 = 0;
            n4 = Math.max(n4, n);
            n5 = this.Field13429 + this.Field13430 + this.Field13425;
            boolean bl = false;
            n3 = Math.min(n4, n5);
            Class2027 class20275 = this.Field13423;
            if (class20275 != null) {
                class20275.Method3615((n6 - this.Field13428) / this.Field13425);
            }
            Class2027 class20276 = this.Field13423;
            if (class20276 != null) {
                class20276.Method3611(1.0f - (float)((n3 - this.Field13429) / this.Field13425));
            }
        }
        float f8 = this.Method636();
        Class2027 class20277 = this.Field13423;
        Object object = class20277 != null ? class20277.Method3623() : null;
        if (object == null) {
            Intrinsics.throwNpe();
        }
        float f9 = f8 + object[1] * (float)this.Field13425;
        float f10 = this.Field13429 + this.Field13430 + this.Field13425;
        Class2027 class20278 = this.Field13423;
        Object object2 = class20278 != null ? class20278.Method3623() : null;
        if (object2 == null) {
            Intrinsics.throwNpe();
        }
        float f11 = f10 - object2[2] * (float)this.Field13425;
        Class753.drawRectWH((double)f9 - Double.longBitsToDouble((long)1492150627 ^ 0x4000000058F06963L), (double)f11 - Double.longBitsToDouble((long)2027287506 ^ 0x4000000078D5F3D2L), Double.longBitsToDouble(0x4010000000000000L), Double.longBitsToDouble((long)1135207746 ^ 0x4010000043A9E542L), -1);
        this.Field13427.Method340(this.Field13423);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (n3 != 0) return;
        if (!this.Method4818(n, n2)) return;
        this.Field13426 = true;
    }

    private final boolean Method4818(int n, int n2) {
        if (n < this.Field13428) return false;
        if (n > this.Field13428 + this.Field13425) return false;
        if (n2 < this.Field13429 + this.Field13430) return false;
        if (n2 > this.Field13429 + this.Field13430 + this.Method631()) return false;
        return true;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field13426 = false;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field13428 = n;
        this.Field13429 = n2;
    }

    @Override
    public void Method629(int n) {
        this.Field13430 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field13431 = n;
    }

    @Override
    public int Method631() {
        return this.Field13425;
    }

    @Override
    public int Method633() {
        return this.Field13431;
    }

    @Override
    public void Method634(int n) {
        this.Field13425 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field13428 = n;
    }

    @Override
    public int Method636() {
        return this.Field13428;
    }

    @Override
    public void Method639(int n) {
        this.Field13424 = n;
    }

    @Override
    public int Method640() {
        return this.Field13424;
    }

    @Override
    public boolean Method641() {
        return true;
    }

    @Override
    public void Method642(@NotNull @NotNull Class2027 class2027) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        this.Field13423 = class2027;
    }

    @Override
    @Nullable
    @Nullable
    public Class2027 Method643() {
        return this.Field13423;
    }

    @NotNull
    @NotNull
    public final Class44 Method4819() {
        return this.Field13427;
    }

    public final int Method4820() {
        return this.Field13428;
    }

    public final void Method4821(int n) {
        this.Field13428 = n;
    }

    public final int Method4822() {
        return this.Field13429;
    }

    public final void Method4823(int n) {
        this.Field13429 = n;
    }

    public final int Method4824() {
        return this.Field13430;
    }

    public final void Method4825(int n) {
        this.Field13430 = n;
    }

    public final int Method4826() {
        return this.Field13431;
    }

    public final void Method4827(int n) {
        this.Field13431 = n;
    }

    public Class1196(@NotNull @NotNull Class44 class44, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        this.Field13427 = class44;
        this.Field13428 = n;
        this.Field13429 = n2;
        this.Field13430 = n3;
        this.Field13431 = n4;
    }

    private static String Method4828(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 132;
            cArray2[n] = (char)(cArray[n] ^ (0x5758 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

