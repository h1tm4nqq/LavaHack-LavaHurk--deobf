/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.QeolztpRjpncB3tszVXsqv3ELwHJwcXz;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002J \u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0016J \u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0014H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0005H\u0016J\u0018\u00108\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0014H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f\u00a8\u0006:"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/colorpicker/PickerBase;", "Lcom/kisman/cc/gui/api/ColorChanger;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc"})
public final class iWwd2ieZrM38utZyK1IY8QFpLV2J2HFk
implements QeolztpRjpncB3tszVXsqv3ELwHJwcXz {
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field13423;
    private int Field13424;
    private int Field13425;
    private boolean Field13426;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field13427;
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
        GL11.glEnable((int)((int)((long)193562933 ^ (long)193563844) << 1));
        GL11.glDisable((int)((int)((long)-476848945 ^ (long)-476851922)));
        GL11.glBlendFunc((int)(((int)2056132367L ^ 0x7A8E168E) << 1), (int)((int)989854857L ^ 0x3AFFFF8A));
        GL11.glShadeModel((int)((int)-609518098L ^ 0xDBAB60EF));
        GL11.glBegin((int)((int)((long)-2084658218 ^ (long)-2084658209)));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13430));
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13425));
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = this.Field13423;
        Float f = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 != null ? Float.valueOf(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17325) : null;
        if (f == null) {
            Intrinsics.throwNpe();
        }
        float f2 = f.floatValue();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = this.Field13423;
        Float f3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 != null ? Float.valueOf(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Field17326) : null;
        if (f3 == null) {
            Intrinsics.throwNpe();
        }
        float f4 = f3.floatValue();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = this.Field13423;
        Float f5 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 != null ? Float.valueOf(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Field17327) : null;
        if (f5 == null) {
            Intrinsics.throwNpe();
        }
        float f6 = f5.floatValue();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = this.Field13423;
        Float f7 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 != null ? Float.valueOf(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Field17328) : null;
        if (f7 == null) {
            Intrinsics.throwNpe();
        }
        GL11.glColor4f((float)f2, (float)f4, (float)f6, (float)f7.floatValue());
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13425));
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13430));
        GL11.glEnd();
        GL11.glDisable((int)(((int)-604485139L ^ 0xDBF849C2) << 6));
        GL11.glBegin((int)((int)-370961479L ^ 0xE9E393B0));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13430));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13425));
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13425));
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13430));
        GL11.glEnd();
        GL11.glEnable((int)((int)((long)-2010371556 ^ (long)-2010371533) << 6));
        GL11.glShadeModel((int)((int)((long)1263328611 ^ (long)1263328638) << 8));
        GL11.glEnable((int)((int)((long)-938122112 ^ (long)-938120863)));
        GL11.glDisable((int)(((int)-905190403L ^ 0xCA0BE60C) << 1));
        if (this.Method4818(n, n2)) {
            int n3 = this.Field13428;
            int n4 = (int)-1981742815L ^ 0x89E10121;
            n3 = Math.max(n3, n);
            n4 = this.Field13428 + this.Field13425;
            int n5 = (int)-1304300346L ^ 0xB241F4C6;
            int n6 = Math.min(n3, n4);
            n4 = this.Field13429 + this.Field13430;
            n5 = (int)((long)1971848412 ^ (long)1971848412);
            n4 = Math.max(n4, n);
            n5 = this.Field13429 + this.Field13430 + this.Field13425;
            int n7 = (int)-408952787L ^ 0xE79FE02D;
            n3 = Math.min(n4, n5);
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = this.Field13423;
            if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 != null) {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6.Method3615((n6 - this.Field13428) / this.Field13425);
            }
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7 = this.Field13423;
            if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7 != null) {
                vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7.Method3611(1.0f - (float)((n3 - this.Field13429) / this.Field13425));
            }
        }
        float f8 = this.Method636();
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8 = this.Field13423;
        Object object = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8 != null ? vl3icpcdb9cWvH39NKe3weWQwVdWO7AV8.Method3623() : null;
        if (object == null) {
            Intrinsics.throwNpe();
        }
        float f9 = f8 + object[(int)-1579569802L ^ 0xA1D9AD77] * (float)this.Field13425;
        float f10 = this.Field13429 + this.Field13430 + this.Field13425;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9 = this.Field13423;
        Object object2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9 != null ? vl3icpcdb9cWvH39NKe3weWQwVdWO7AV9.Method3623() : null;
        if (object2 == null) {
            Intrinsics.throwNpe();
        }
        float f11 = f10 - object2[((int)-419198663L ^ 0xE7038938) << 1] * (float)this.Field13425;
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH((double)f9 - Double.longBitsToDouble((long)1492150627 ^ 0x4000000058F06963L), (double)f11 - Double.longBitsToDouble((long)2027287506 ^ 0x4000000078D5F3D2L), Double.longBitsToDouble(0x494A0AAD47E7F1B8L ^ 0x95A0AAD47E7F1B8L), Double.longBitsToDouble((long)1135207746 ^ 0x4010000043A9E542L), (int)1818378372L ^ 0x939DBF7B);
        this.Field13427.Method340(this.Field13423);
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (n3 != 0) return;
        if (!this.Method4818(n, n2)) return;
        this.Field13426 = (int)-121503816L ^ 0xF8C1FFB9;
    }

    private final boolean Method4818(int n, int n2) {
        int n3;
        if (n >= this.Field13428 && n <= this.Field13428 + this.Field13425 && n2 >= this.Field13429 + this.Field13430 && n2 <= this.Field13429 + this.Field13430 + this.Method631()) {
            n3 = (int)((long)497498416 ^ (long)497498417);
            return n3 != 0;
        }
        n3 = (int)241404042L ^ 0xE63888A;
        return n3 != 0;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field13426 = (int)-988746252L ^ 0xC510EDF4;
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
        return ((int)21696332L ^ 0x14B0F4D) != 0;
    }

    @Override
    public void Method642(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        this.Field13423 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @Override
    @Nullable
    @Nullable
    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method643() {
        return this.Field13423;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method4819() {
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

    public iWwd2ieZrM38utZyK1IY8QFpLV2J2HFk(@NotNull @NotNull qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"setting");
        this.Field13427 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field13428 = n;
        this.Field13429 = n2;
        this.Field13430 = n3;
        this.Field13431 = n4;
    }

    private static String Method4828(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1249787696 ^ (long)-1249787696);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1739323916 ^ (long)1739324147);
            int n2 = ((int)-2046482568L ^ 0x86052759) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)820996391L ^ 0x30EF63CC) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

