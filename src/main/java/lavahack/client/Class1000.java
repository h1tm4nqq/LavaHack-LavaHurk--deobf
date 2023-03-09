//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.gui.GuiScreen
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1025;
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1854;
import lavahack.client.Class201;
import lavahack.client.Class211;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class753;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0005J\b\u00103\u001a\u00020\u0013H\u0016J \u00104\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000205H\u0002J\b\u0010;\u001a\u000205H\u0016J\u0018\u0010<\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\r2\u0006\u00100\u001a\u00020\rH\u0002J\u0018\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\rH\u0014J(\u0010A\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020DH\u0014J \u0010E\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010F\u001a\u00020\rH\u0014J \u0010G\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0014J\b\u0010I\u001a\u000205H\u0016R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011\u00a8\u0006K"}, d2={"Lcom/kisman/cc/gui/other/search/SearchGui;", "Lnet/minecraft/client/gui/GuiScreen;", "setting", "Lcom/kisman/cc/settings/Setting;", "lastGui", "(Lcom/kisman/cc/settings/Setting;Lnet/minecraft/client/gui/GuiScreen;)V", "comps", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/api/Component;", "Lkotlin/collections/ArrayList;", "getComps", "()Ljava/util/ArrayList;", "count", "", "getCount", "()I", "setCount", "(I)V", "drag", "", "getDrag", "()Z", "setDrag", "(Z)V", "dragX", "dragY", "height_", "getHeight_", "setHeight_", "getLastGui", "()Lnet/minecraft/client/gui/GuiScreen;", "open", "getOpen", "setOpen", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "textField", "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "getTextField", "()Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "setTextField", "(Lcom/kisman/cc/util/render/gui/TextFieldHandler;)V", "width_", "getWidth_", "setWidth_", "x", "getX", "setX", "y", "getY", "setY", "doesGuiPauseGame", "drawScreen", "", "mouseX", "mouseY", "partialTicks", "", "init", "initGui", "isMouseOnHeader", "keyTyped", "typedChar", "", "keyCode", "mouseClickMove", "clickedMouseButton", "timeSinceLastClick", "", "mouseClicked", "mouseButton", "mouseReleased", "state", "onGuiClosed", "Companion", "kisman.cc"})
public final class Class1000
extends GuiScreen {
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

    public final void setTextField(@Nullable @Nullable Class1025 class1025) {
        this.Field12295 = class1025;
    }

    @NotNull
    @NotNull
    public final ArrayList getComps() {
        return this.Field12296;
    }

    public final int getX() {
        return this.Field12297;
    }

    public final void setX(int n) {
        this.Field12297 = n;
    }

    public final int getY() {
        return this.Field12298;
    }

    public final void setY(int n) {
        this.Field12298 = n;
    }

    public final int getWidth_() {
        return this.Field12299;
    }

    public final void setWidth_(int n) {
        this.Field12299 = n;
    }

    public final int getHeight_() {
        return this.Field12300;
    }

    public final void setHeight_(int n) {
        this.Field12300 = n;
    }

    public final boolean getDrag() {
        return this.Field12301;
    }

    public final void setDrag(boolean bl) {
        this.Field12301 = bl;
    }

    public final boolean getOpen() {
        return this.Field12302;
    }

    public final void setOpen(boolean bl) {
        this.Field12302 = bl;
    }

    public final int getCount() {
        return this.Field12305;
    }

    public final void setCount(int n) {
        this.Field12305 = n;
    }

    private final void init() {
        this.Field12295 = new Class1025(this.Field12297 + Class1419.Field14604, this.Field12298 + Class1419.Field14605, this.Field12299 - Class1419.Field14605 * 2, Class1419.Field14604);
    }

    public void drawScreen(int n, int n2, float f) {
        if (this.Field12301) {
            this.Field12297 = n - this.Field12303;
            this.Field12298 = n2 - this.Field12304;
        }
        double d = this.Field12297;
        double d2 = this.Field12298;
        double d3 = this.Field12299;
        double d4 = this.Field12300;
        Class2027 class2027 = Class1419.Method1228(this.Field12305);
        Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"HalqGui.getGradientColour(count)");
        Class753.drawRectWH(d, d2, d3, d4, class2027.Method3626());
        if (Class1419.Field14590) {
            Class340 class340 = new Class340(new double[]{this.Field12297 - Class1419.Field14605, this.Field12298}, new double[]{this.Field12297, this.Field12298}, new double[]{this.Field12297, (double)this.Field12298 + (double)this.Field12300}, new double[]{this.Field12297 - Class1419.Field14605, (double)this.Field12298 + (double)this.Field12300});
            Class2027 class20272 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"HalqGui.getGradientColour(count)");
            Color color = Class1172.Method4728(class20272.Method3625(), 0);
            Class2027 class20273 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"HalqGui.getGradientColour(count)");
            Class753.drawAbstract(new Class211(class340, color, class20273.Method3625()));
            Class340 class3402 = new Class340(new double[]{this.Field12297 + this.Field12299, this.Field12298}, new double[]{this.Field12297 + this.Field12299 + Class1419.Field14605, this.Field12298}, new double[]{this.Field12297 + this.Field12299 + Class1419.Field14605, (double)this.Field12298 + (double)this.Field12300}, new double[]{this.Field12297 + this.Field12299, (double)this.Field12298 + (double)this.Field12300});
            Class2027 class20274 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)class20274, (String)"HalqGui.getGradientColour(count)");
            Color color2 = class20274.Method3625();
            Class2027 class20275 = Class1419.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)class20275, (String)"HalqGui.getGradientColour(count)");
            Class753.drawAbstract(new Class211(class3402, color2, Class1172.Method4728(class20275.Method3625(), 0)));
        }
        Class1419.Method1224("Items/Blocks of " + this.Field12306.Method356() + '.', this.Field12297, this.Field12298, this.Field12299, this.Field12300);
        if (!this.Field12302) return;
        Class1025 class1025 = this.Field12295;
        if (class1025 == null) return;
        class1025.drawTextBox();
    }

    protected void keyTyped(char c, int n) {
        Class1025 class1025 = this.Field12295;
        if (class1025 == null) return;
        class1025.textboxKeyTyped(c, n);
    }

    protected void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnHeader(n, n2)) {
            this.Field12301 = true;
            this.Field12303 = n - this.Field12297;
            this.Field12304 = n2 - this.Field12298;
            this.Field12302 = n3 == 1;
        }
        Class1025 class1025 = this.Field12295;
        if (class1025 == null) return;
        class1025.mouseClicked(n, n2, n3);
    }

    protected void mouseReleased(int n, int n2, int n3) {
        this.Field12301 = false;
    }

    protected void mouseClickMove(int n, int n2, int n3, long l) {
        super.mouseClickMove(n, n2, n3, l);
    }

    public void initGui() {
        this.init();
    }

    public void onGuiClosed() {
        if (this.Field12307 == null) return;
        this.mc.displayGuiScreen(this.Field12307);
    }

    public boolean doesGuiPauseGame() {
        return true;
    }

    private final boolean isMouseOnHeader(int n, int n2) {
        if (n <= this.Field12297) return false;
        if (n >= this.Field12297 + this.Field12299) return false;
        if (n2 <= this.Field12298) return false;
        if (n2 >= this.Field12298 + Class1419.Field14604) return false;
        return true;
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

    public Class1000(@NotNull @NotNull Class44 class44, @Nullable @Nullable GuiScreen guiScreen) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        this.Field12306 = class44;
        this.Field12307 = guiScreen;
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
        Field12308 = Class1854.Field16538;
        Field12309 = 10;
    }

    public static final /* bridge */ /* synthetic */ Class1854 access$getNameMode$cp() {
        return Field12308;
    }

    public static final /* bridge */ /* synthetic */ void access$setNameMode$cp(Class1854 class1854) {
        Field12308 = class1854;
    }

    public static final /* bridge */ /* synthetic */ int access$getResolutionX$cp() {
        return Field12309;
    }

    public static final /* bridge */ /* synthetic */ void access$setResolutionX$cp(int n) {
        Field12309 = n;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 104;
            cArray2[n] = (char)(cArray[n] ^ (0x5B3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

