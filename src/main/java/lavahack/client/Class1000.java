//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;
import java.awt.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001?\u0006\u0002\u0010\u0005J\b\u00103\u001a\u00020\u0013H\u0016J \u00104\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000205H\u0002J\b\u0010;\u001a\u000205H\u0016J\u0018\u0010<\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\r2\u0006\u00100\u001a\u00020\rH\u0002J\u0018\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\rH\u0014J(\u0010A\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020DH\u0014J \u0010E\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010F\u001a\u00020\rH\u0014J \u0010G\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0014J\b\u0010I\u001a\u000205H\u0016R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001?\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\rX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\rX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\rX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011?\u0006K" }, d2 = { "Lcom/kisman/cc/gui/other/search/SearchGui;", "Lnet/minecraft/client/gui/GuiScreen;", "setting", "Lcom/kisman/cc/settings/Setting;", "lastGui", "(Lcom/kisman/cc/settings/Setting;Lnet/minecraft/client/gui/GuiScreen;)V", "comps", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/api/Component;", "Lkotlin/collections/ArrayList;", "getComps", "()Ljava/util/ArrayList;", "count", "", "getCount", "()I", "setCount", "(I)V", "drag", "", "getDrag", "()Z", "setDrag", "(Z)V", "dragX", "dragY", "height_", "getHeight_", "setHeight_", "getLastGui", "()Lnet/minecraft/client/gui/GuiScreen;", "open", "getOpen", "setOpen", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "textField", "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "getTextField", "()Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "setTextField", "(Lcom/kisman/cc/util/render/gui/TextFieldHandler;)V", "width_", "getWidth_", "setWidth_", "x", "getX", "setX", "y", "getY", "setY", "doesGuiPauseGame", "drawScreen", "", "mouseX", "mouseY", "partialTicks", "", "init", "initGui", "isMouseOnHeader", "keyTyped", "typedChar", "", "keyCode", "mouseClickMove", "clickedMouseButton", "timeSinceLastClick", "", "mouseClicked", "mouseButton", "mouseReleased", "state", "onGuiClosed", "Companion", "kisman.cc" })
public final class Class1000 extends GuiScreen
{
    @Nullable
    private Class1025 Field12295;
    @NotNull
    private final ArrayList Field12296;
    private int Field12297;
    private int Field12298;
    private int Field12299;
    private int Field12300;
    private boolean Field12301;
    private boolean Field12302;
    private int Field12303;
    private int Field12304;
    private int Field12305;
    @NotNull
    private final Class44 Field12306;
    @Nullable
    private final GuiScreen Field12307;
    @NotNull
    private static Class1854 Field12308;
    private static int Field12309;
    public static final Class201 Field12310;
    private int Field12311;
    
    @Nullable
    @Nullable
    public final Class1025 getTextField() {
        return this.Field12295;
    }
    
    public final void setTextField(@Nullable @Nullable final Class1025 field12295) {
        this.Field12295 = field12295;
    }
    
    @NotNull
    @NotNull
    public final ArrayList getComps() {
        return this.Field12296;
    }
    
    public final int getX() {
        return this.Field12297;
    }
    
    public final void setX(final int field12297) {
        this.Field12297 = field12297;
    }
    
    public final int getY() {
        return this.Field12298;
    }
    
    public final void setY(final int field12298) {
        this.Field12298 = field12298;
    }
    
    public final int getWidth_() {
        return this.Field12299;
    }
    
    public final void setWidth_(final int field12299) {
        this.Field12299 = field12299;
    }
    
    public final int getHeight_() {
        return this.Field12300;
    }
    
    public final void setHeight_(final int field12300) {
        this.Field12300 = field12300;
    }
    
    public final boolean getDrag() {
        return this.Field12301;
    }
    
    public final void setDrag(final boolean field12301) {
        this.Field12301 = field12301;
    }
    
    public final boolean getOpen() {
        return this.Field12302;
    }
    
    public final void setOpen(final boolean field12302) {
        this.Field12302 = field12302;
    }
    
    public final int getCount() {
        return this.Field12305;
    }
    
    public final void setCount(final int field12305) {
        this.Field12305 = field12305;
    }
    
    private final void init() {
        this.Field12295 = new Class1025(this.Field12297 + Class1419.Field14604, this.Field12298 + Class1419.Field14605, this.Field12299 - Class1419.Field14605 * 2, Class1419.Field14604);
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        if (this.Field12301) {
            this.Field12297 = n - this.Field12303;
            this.Field12298 = n2 - this.Field12304;
        }
        final double n4 = this.Field12297;
        final double n5 = this.Field12298;
        final double n6 = this.Field12299;
        final double n7 = this.Field12300;
        final Class2027 method1228 = Class1419.Method1228(this.Field12305);
        Intrinsics.checkExpressionValueIsNotNull((Object)method1228, "HalqGui.getGradientColour(count)");
        Class753.drawRectWH(n4, n5, n6, n7, method1228.Method3626());
        if (Class1419.Field14590) {
            final Class340 class340 = new Class340(new double[] { this.Field12297 - Class1419.Field14605, this.Field12298 }, new double[] { this.Field12297, this.Field12298 }, new double[] { this.Field12297, this.Field12298 + (double)this.Field12300 }, new double[] { this.Field12297 - Class1419.Field14605, this.Field12298 + (double)this.Field12300 });
            final Class2027 method1229 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)method1229, "HalqGui.getGradientColour(count)");
            final Color method1230 = Class1172.Method4728(method1229.Method3625(), 0);
            final Class2027 method1231 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)method1231, "HalqGui.getGradientColour(count)");
            Class753.drawAbstract(new Class211(class340, method1230, method1231.Method3625()));
            final Class340 class341 = new Class340(new double[] { this.Field12297 + this.Field12299, this.Field12298 }, new double[] { this.Field12297 + this.Field12299 + Class1419.Field14605, this.Field12298 }, new double[] { this.Field12297 + this.Field12299 + Class1419.Field14605, this.Field12298 + (double)this.Field12300 }, new double[] { this.Field12297 + this.Field12299, this.Field12298 + (double)this.Field12300 });
            final Class2027 method1232 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)method1232, "HalqGui.getGradientColour(count)");
            final Color method1233 = method1232.Method3625();
            final Class2027 method1234 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)method1234, "HalqGui.getGradientColour(count)");
            Class753.drawAbstract(new Class211(class341, method1233, Class1172.Method4728(method1234.Method3625(), 0)));
        }
        Class1419.Method1224("Items/Blocks of " + this.Field12306.Method356() + '.', this.Field12297, this.Field12298, this.Field12299, this.Field12300);
        if (this.Field12302) {
            final Class1025 field12295 = this.Field12295;
            if (field12295 != null) {
                field12295.drawTextBox();
            }
        }
    }
    
    protected void keyTyped(final char c, final int n) {
        final Class1025 field12295 = this.Field12295;
        if (field12295 != null) {
            field12295.textboxKeyTyped(c, n);
        }
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) {
        if (this.isMouseOnHeader(n, n2)) {
            this.Field12301 = true;
            this.Field12303 = n - this.Field12297;
            this.Field12304 = n2 - this.Field12298;
            this.Field12302 = (n3 == 1);
        }
        final Class1025 field12295 = this.Field12295;
        if (field12295 != null) {
            field12295.mouseClicked(n, n2, n3);
        }
    }
    
    protected void mouseReleased(final int n, final int n2, final int n3) {
        this.Field12301 = false;
    }
    
    protected void mouseClickMove(final int n, final int n2, final int n3, final long n4) {
        super.mouseClickMove(n, n2, n3, n4);
    }
    
    public void initGui() {
        this.init();
    }
    
    public void onGuiClosed() {
        if (this.Field12307 != null) {
            this.mc.displayGuiScreen(this.Field12307);
        }
    }
    
    public boolean doesGuiPauseGame() {
        return true;
    }
    
    private final boolean isMouseOnHeader(final int n, final int n2) {
        return n > this.Field12297 && n < this.Field12297 + this.Field12299 && n2 > this.Field12298 && n2 < this.Field12298 + Class1419.Field14604;
    }
    
    @NotNull
    @NotNull
    public final Class44 getSetting() {
        return this.Field12306;
    }
    
    @Nullable
    @Nullable
    public final GuiScreen getLastGui() {
        return this.Field12307;
    }
    
    public Class1000(@NotNull @NotNull final Class44 field12306, @Nullable @Nullable final GuiScreen field12307) {
        Intrinsics.checkParameterIsNotNull((Object)field12306, "setting");
        this.Field12306 = field12306;
        this.Field12307 = field12307;
        this.Field12296 = new ArrayList();
        this.Field12297 = 15;
        this.Field12298 = 15;
        this.Field12299 = 500;
        this.Field12300 = 300;
        this.Field12302 = true;
        this.init();
    }
    
    static {
        Field12310 = new Class201(null);
        Class1000.Field12308 = Class1854.Field16538;
        Class1000.Field12309 = 10;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B3A ^ 0x68));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
