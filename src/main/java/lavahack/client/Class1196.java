//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005?\u0006\u0002\u0010\tJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002J \u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0016J \u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0014H\u0016J\u0010\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0005H\u0016J\u0018\u00108\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0016J\b\u00109\u001a\u00020\u0014H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e?\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f?\u0006:" }, d2 = { "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/PickerBase;", "Lcom/kisman/cc/gui/api/ColorChanger;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc" })
public final class Class1196 implements Class64
{
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
    public void Method644(final boolean field13426) {
        this.Field13426 = field13426;
    }
    
    @Override
    public void Method623(final int n, final int n2) {
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        GL11.glBegin(9);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13430));
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13425));
        final Class2027 field13423 = this.Field13423;
        final Float n3 = (field13423 != null) ? Float.valueOf(field13423.Field17325) : null;
        if (n3 == null) {
            Intrinsics.throwNpe();
        }
        final float floatValue = n3;
        final Class2027 field13424 = this.Field13423;
        final Float n4 = (field13424 != null) ? Float.valueOf(field13424.Field17326) : null;
        if (n4 == null) {
            Intrinsics.throwNpe();
        }
        final float floatValue2 = n4;
        final Class2027 field13425 = this.Field13423;
        final Float n5 = (field13425 != null) ? Float.valueOf(field13425.Field17327) : null;
        if (n5 == null) {
            Intrinsics.throwNpe();
        }
        final float floatValue3 = n5;
        final Class2027 field13426 = this.Field13423;
        final Float n6 = (field13426 != null) ? Float.valueOf(field13426.Field17328) : null;
        if (n6 == null) {
            Intrinsics.throwNpe();
        }
        GL11.glColor4f(floatValue, floatValue2, floatValue3, (float)n6);
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13425));
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13430));
        GL11.glEnd();
        GL11.glDisable(3008);
        GL11.glBegin(9);
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13430));
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 1.0f);
        GL11.glVertex2f((float)this.Field13428, (float)(this.Field13429 + this.Field13425));
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13425));
        GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glVertex2f((float)(this.Field13428 + this.Field13425), (float)(this.Field13429 + this.Field13430));
        GL11.glEnd();
        GL11.glEnable(3008);
        GL11.glShadeModel(7424);
        GL11.glEnable(3553);
        GL11.glDisable(3042);
        if (this.Method4818(n, n2)) {
            final int min = Math.min(Math.max(this.Field13428, n), this.Field13428 + this.Field13425);
            final int min2 = Math.min(Math.max(this.Field13429 + this.Field13430, n), this.Field13429 + this.Field13430 + this.Field13425);
            final Class2027 field13427 = this.Field13423;
            if (field13427 != null) {
                field13427.Method3615((float)((min - this.Field13428) / this.Field13425));
            }
            final Class2027 field13428 = this.Field13423;
            if (field13428 != null) {
                field13428.Method3611(1.0f - (min2 - this.Field13429) / this.Field13425);
            }
        }
        final float n7 = (float)this.Method636();
        final Class2027 field13429 = this.Field13423;
        final float[] array = (float[])((field13429 != null) ? field13429.Method3623() : null);
        if (array == null) {
            Intrinsics.throwNpe();
        }
        final float n8 = n7 + array[1] * this.Field13425;
        final float n9 = (float)(this.Field13429 + this.Field13430 + this.Field13425);
        final Class2027 field13430 = this.Field13423;
        final float[] array2 = (float[])((field13430 != null) ? field13430.Method3623() : null);
        if (array2 == null) {
            Intrinsics.throwNpe();
        }
        Class753.drawRectWH(n8 - Double.longBitsToDouble((long)1492150627 ^ 0x4000000058F06963L), n9 - array2[2] * this.Field13425 - Double.longBitsToDouble((long)2027287506 ^ 0x4000000078D5F3D2L), Double.longBitsToDouble(4616189618054758400L), Double.longBitsToDouble((long)1135207746 ^ 0x4010000043A9E542L), -1);
        this.Field13427.Method340(this.Field13423);
    }
    
    @Override
    public void Method625(final int n, final int n2, final int n3) {
        if (n3 == 0 && this.Method4818(n, n2)) {
            this.Field13426 = true;
        }
    }
    
    private final boolean Method4818(final int n, final int n2) {
        return n >= this.Field13428 && n <= this.Field13428 + this.Field13425 && n2 >= this.Field13429 + this.Field13430 && n2 <= this.Field13429 + this.Field13430 + this.Method631();
    }
    
    @Override
    public void Method626(final int n, final int n2, final int n3) {
        this.Field13426 = false;
    }
    
    @Override
    public void Method627(final int field13428, final int field13429) {
        this.Field13428 = field13428;
        this.Field13429 = field13429;
    }
    
    @Override
    public void Method629(final int field13430) {
        this.Field13430 = field13430;
    }
    
    @Override
    public void Method630(final int field13431) {
        this.Field13431 = field13431;
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
    public void Method634(final int field13425) {
        this.Field13425 = field13425;
    }
    
    @Override
    public void Method635(final int field13428) {
        this.Field13428 = field13428;
    }
    
    @Override
    public int Method636() {
        return this.Field13428;
    }
    
    @Override
    public void Method639(final int field13424) {
        this.Field13424 = field13424;
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
    public void Method642(@NotNull @NotNull final Class2027 field13423) {
        Intrinsics.checkParameterIsNotNull((Object)field13423, "color");
        this.Field13423 = field13423;
    }
    
    @Nullable
    @Nullable
    @Override
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
    
    public final void Method4821(final int field13428) {
        this.Field13428 = field13428;
    }
    
    public final int Method4822() {
        return this.Field13429;
    }
    
    public final void Method4823(final int field13429) {
        this.Field13429 = field13429;
    }
    
    public final int Method4824() {
        return this.Field13430;
    }
    
    public final void Method4825(final int field13430) {
        this.Field13430 = field13430;
    }
    
    public final int Method4826() {
        return this.Field13431;
    }
    
    public final void Method4827(final int field13431) {
        this.Field13431 = field13431;
    }
    
    public Class1196(@NotNull @NotNull final Class44 field13427, final int field13428, final int field13429, final int field13430, final int field13431) {
        Intrinsics.checkParameterIsNotNull((Object)field13427, "setting");
        this.Field13427 = field13427;
        this.Field13428 = field13428;
        this.Field13429 = field13429;
        this.Field13430 = field13430;
        this.Field13431 = field13431;
    }
    
    private static String Method4828(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5758 ^ 0x84));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
