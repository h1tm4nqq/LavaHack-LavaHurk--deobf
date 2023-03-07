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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.awt.Color;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
import lavahack.client.Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9;
import lavahack.client.La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh;
import lavahack.client.VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.GuiScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0005J\b\u00103\u001a\u00020\u0013H\u0016J \u00104\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000205H\u0002J\b\u0010;\u001a\u000205H\u0016J\u0018\u0010<\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\r2\u0006\u00100\u001a\u00020\rH\u0002J\u0018\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\rH\u0014J(\u0010A\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020DH\u0014J \u0010E\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010F\u001a\u00020\rH\u0014J \u0010G\u001a\u0002052\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010H\u001a\u00020\rH\u0014J\b\u0010I\u001a\u000205H\u0016R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001a\u0010-\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011\u00a8\u0006K"}, d2={"Lcom/kisman/cc/gui/other/search/SearchGui;", "Lnet/minecraft/client/gui/GuiScreen;", "setting", "Lcom/kisman/cc/settings/Setting;", "lastGui", "(Lcom/kisman/cc/settings/Setting;Lnet/minecraft/client/gui/GuiScreen;)V", "comps", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/api/Component;", "Lkotlin/collections/ArrayList;", "getComps", "()Ljava/util/ArrayList;", "count", "", "getCount", "()I", "setCount", "(I)V", "drag", "", "getDrag", "()Z", "setDrag", "(Z)V", "dragX", "dragY", "height_", "getHeight_", "setHeight_", "getLastGui", "()Lnet/minecraft/client/gui/GuiScreen;", "open", "getOpen", "setOpen", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "textField", "Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "getTextField", "()Lcom/kisman/cc/util/render/gui/TextFieldHandler;", "setTextField", "(Lcom/kisman/cc/util/render/gui/TextFieldHandler;)V", "width_", "getWidth_", "setWidth_", "x", "getX", "setX", "y", "getY", "setY", "doesGuiPauseGame", "drawScreen", "", "mouseX", "mouseY", "partialTicks", "", "init", "initGui", "isMouseOnHeader", "keyTyped", "typedChar", "", "keyCode", "mouseClickMove", "clickedMouseButton", "timeSinceLastClick", "", "mouseClicked", "mouseButton", "mouseReleased", "state", "onGuiClosed", "Companion", "kisman.cc"})
public final class VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6
extends GuiScreen {
    @Nullable
    private Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 Field12295;
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
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field12306;
    @Nullable
    private final GuiScreen Field12307;
    @NotNull
    private static La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh Field12308;
    private static int Field12309;
    public static final VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12310;
    private int Field12311;

    @Nullable
    @Nullable
    public final Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 getTextField() {
        return this.Field12295;
    }

    public final void setTextField(@Nullable @Nullable Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9) {
        this.Field12295 = kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9;
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
        this.Field12295 = new Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9(this.Field12297 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604, this.Field12298 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14605, this.Field12299 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14605 * ((int)((long)-1083357734 ^ (long)-1083357733) << 1), zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604);
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
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field12305);
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"HalqGui.getGradientColour(count)");
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRectWH(d, d2, d3, d4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3626());
        if (zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14590) {
            double[] dArray = new double[(int)((long)231525346 ^ (long)231525347) << 1];
            dArray[(int)157598390L ^ 0x964C2B6] = this.Field12297 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14605;
            dArray[(int)((long)-2019472838 ^ (long)-2019472837)] = this.Field12298;
            double[] dArray2 = new double[((int)-468719472L ^ 0xE40FE891) << 1];
            dArray2[(int)49940708L ^ 0x2FA08E4] = this.Field12297;
            dArray2[(int)-1819860613L ^ 0x9387217A] = this.Field12298;
            double[] dArray3 = new double[(int)((long)-1378925583 ^ (long)-1378925584) << 1];
            dArray3[(int)-1022585415L ^ 0xC30C95B9] = this.Field12297;
            dArray3[(int)((long)1043918031 ^ (long)1043918030)] = (double)this.Field12298 + (double)this.Field12300;
            double[] dArray4 = new double[(int)((long)1171987338 ^ (long)1171987339) << 1];
            dArray4[(int)-160280256L ^ 0xF6725140] = this.Field12297 - zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14605;
            dArray4[(int)((long)100046002 ^ (long)100046003)] = (double)this.Field12298 + (double)this.Field12300;
            Jl14CJNmtWTqlp58umYadtnd800b2Vd0 jl14CJNmtWTqlp58umYadtnd800b2Vd0 = new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray, dArray2, dArray3, dArray4);
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"HalqGui.getGradientColour(count)");
            Color color = zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3.Method3625(), (int)-653375737L ^ 0xD90E4707);
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"HalqGui.getGradientColour(count)");
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(jl14CJNmtWTqlp58umYadtnd800b2Vd0, color, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4.Method3625()));
            double[] dArray5 = new double[((int)1430756275L ^ 0x55479BB2) << 1];
            dArray5[(int)-1891513928L ^ 0x8F41C9B8] = this.Field12297 + this.Field12299;
            dArray5[(int)((long)835385273 ^ (long)835385272)] = this.Field12298;
            double[] dArray6 = new double[((int)443298996L ^ 0x1A6C34B5) << 1];
            dArray6[(int)-337383664L ^ 0xEBE3EF10] = this.Field12297 + this.Field12299 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14605;
            dArray6[(int)-813084292L ^ 0xCF89517D] = this.Field12298;
            double[] dArray7 = new double[((int)1819592068L ^ 0x6C74C585) << 1];
            dArray7[(int)((long)-776713325 ^ (long)-776713325)] = this.Field12297 + this.Field12299 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14605;
            dArray7[(int)-1386884699L ^ 0xAD55D1A4] = (double)this.Field12298 + (double)this.Field12300;
            double[] dArray8 = new double[(int)((long)-60056638 ^ (long)-60056637) << 1];
            dArray8[(int)((long)-1213077785 ^ (long)-1213077785)] = this.Field12297 + this.Field12299;
            dArray8[(int)335043354L ^ 0x13F85B1B] = (double)this.Field12298 + (double)this.Field12300;
            Jl14CJNmtWTqlp58umYadtnd800b2Vd0 jl14CJNmtWTqlp58umYadtnd800b2Vd02 = new Jl14CJNmtWTqlp58umYadtnd800b2Vd0(dArray5, dArray6, dArray7, dArray8);
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"HalqGui.getGradientColour(count)");
            Color color2 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5.Method3625();
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6 = zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1228(this.Field12305);
            Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"HalqGui.getGradientColour(count)");
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawAbstract(new gW0lnlGk2rwQ1EHLEfYvz3h4P3UNvCW3(jl14CJNmtWTqlp58umYadtnd800b2Vd02, color2, zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4728(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6.Method3625(), (int)((long)587510278 ^ (long)587510278))));
        }
        zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Method1224("Items/Blocks of " + this.Field12306.Method356() + ((int)((long)-765672379 ^ (long)-765672366) << 1), this.Field12297, this.Field12298, this.Field12299, this.Field12300);
        if (!this.Field12302) return;
        Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 = this.Field12295;
        if (kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 == null) return;
        kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9.drawTextBox();
    }

    protected void keyTyped(char c, int n) {
        Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 = this.Field12295;
        if (kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 == null) return;
        kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9.textboxKeyTyped(c, n);
    }

    protected void mouseClicked(int n, int n2, int n3) {
        if (this.isMouseOnHeader(n, n2)) {
            this.Field12301 = (int)((long)1855513016 ^ (long)1855513017);
            this.Field12303 = n - this.Field12297;
            this.Field12304 = n2 - this.Field12298;
            this.Field12302 = n3 == (int)((long)1068137371 ^ (long)1068137370) ? (int)((long)390440292 ^ (long)390440293) : (int)-103380728L ^ 0xF9D68908;
        }
        Kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 = this.Field12295;
        if (kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9 == null) return;
        kc29zvQaKc2OFiaXabQxCPdP7V4PuAP9.mouseClicked(n, n2, n3);
    }

    protected void mouseReleased(int n, int n2, int n3) {
        this.Field12301 = (int)((long)-121196502 ^ (long)-121196502);
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
        return (int)((long)1117266014 ^ (long)1117266015) != 0;
    }

    private final boolean isMouseOnHeader(int n, int n2) {
        int n3;
        if (n > this.Field12297 && n < this.Field12297 + this.Field12299 && n2 > this.Field12298 && n2 < this.Field12298 + zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604) {
            n3 = (int)((long)-1768559196 ^ (long)-1768559195);
            return n3 != 0;
        }
        n3 = (int)-1177120678L ^ 0xB9D6905A;
        return n3 != 0;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD getSetting() {
        return this.Field12306;
    }

    @Nullable
    @Nullable
    public final GuiScreen getLastGui() {
        return this.Field12307;
    }

    public VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6(@NotNull @NotNull qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, @Nullable @Nullable GuiScreen guiScreen) {
        Intrinsics.checkParameterIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"setting");
        this.Field12306 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field12307 = guiScreen;
        this.Field12296 = new ArrayList();
        this.Field12297 = (int)((long)-1937969589 ^ (long)-1937969596);
        this.Field12298 = (int)((long)77979420 ^ (long)77979411);
        this.Field12299 = (int)((long)-1250626178 ^ (long)-1250626301) << 2;
        this.Field12300 = ((int)-2015444433L ^ 0x87DEC264) << 2;
        this.Field12302 = (int)592596453L ^ 0x23524DE4;
        this.init();
    }

    static {
        Field12310 = new VQmVPKF3m0DBrMztdxzFem3Zcr0lsNQ6$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(null);
        Field12308 = La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh.Field16538;
        Field12309 = (int)((long)454246001 ^ (long)454246004) << 1;
    }

    public static final /* bridge */ /* synthetic */ La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh access$getNameMode$cp() {
        return Field12308;
    }

    public static final /* bridge */ /* synthetic */ void access$setNameMode$cp(La0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh) {
        Field12308 = la0nJBqjHydXjyrgFJ7ctVy7DtRfmEAh;
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
        int n = (int)((long)555057603 ^ (long)555057603);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1076780802L ^ 0xBFD1A001);
            int n2 = ((int)-2008410238L ^ 0x884A178F) << 3;
            cArray2[n] = (char)(cArray[n] ^ (((int)1023330880L ^ 0x3CFEE7DD) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

