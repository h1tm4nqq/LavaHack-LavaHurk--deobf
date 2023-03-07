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
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.QeolztpRjpncB3tszVXsqv3ELwHJwcXz;
import lavahack.client.dqTkpmmq89rRBpUdPNcOcncCLTD1oZgH;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J8\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002J \u00100\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0016J \u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0006H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0006H\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0015H\u0016J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0006H\u0016J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0006H\u0016J\u0018\u0010@\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0016J\b\u0010A\u001a\u00020\u0015H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010\u00a8\u0006B"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/sliders/HueSlider;", "Lcom/kisman/cc/gui/api/ColorChanger;", "Lcom/kisman/cc/gui/halq/components/sub/colorpicker/slider/ISlider;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "picking_", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getColor", "getCount", "getHeight", "getLayer", "getX", "gradient", "minX", "minY", "maxX", "maxY", "startColor", "endColor", "isMouseOnButton", "x", "y", "mouseClicked", "button", "mouseReleased", "mouseButton", "setColor", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setPicking", "picking", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc"})
public final class VtgVOT1Zqoc0R23jNQa4pjML2TknBjll
implements QeolztpRjpncB3tszVXsqv3ELwHJwcXz,
dqTkpmmq89rRBpUdPNcOcncCLTD1oZgH {
    private vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field9422;
    private int Field9423;
    private int Field9424;
    private boolean Field9425;
    @NotNull
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9426;
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
        int n3 = (int)((long)1188038340 ^ (long)1188038340);
        int n4 = (int)-1299351454L ^ 0xB28D7867;
        while (true) {
            int n5 = Color.HSBtoRGB((float)n3 / (float)(((int)-1854171887L ^ 0x917B9512) << 1), 1.0f, 1.0f);
            int n6 = Color.HSBtoRGB((float)(n3 + ((int)991406848L ^ 0x3B17AB01)) / (float)(((int)804010806L ^ 0x2FEC3B35) << 1), 1.0f, 1.0f);
            GL11.glPushMatrix();
            this.Method1686(this.Method636() + n3 * (this.Field9424 / (((int)-680524620L ^ 0xD77004B7) << 1)), this.Field9428 + this.Field9429, this.Method636() + (n3 + (int)((long)-106409603 ^ (long)-106409604)) * (this.Field9424 / (((int)-669088013L ^ 0xD81E86F0) << 1)), this.Field9428 + this.Field9429 + this.Method631(), n5, n6);
            GL11.glPopMatrix();
            ++n3;
        }
    }

    private final void Method1686(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = (float)(n5 >> (((int)1663795484L ^ 0x632B811F) << 3) & (int)((long)-1323294700 ^ (long)-1323294485)) / Float.intBitsToFloat((int)((long)1690059627 ^ (long)667108203));
        float f2 = (float)(n5 >> (((int)-392463201L ^ 0xE89B7C9E) << 4) & (int)((long)-493865790 ^ (long)-493865923)) / Float.intBitsToFloat(0x5B6AABF1 ^ 0x1815ABF1);
        float f3 = (float)(n5 >> ((int)((long)917302571 ^ (long)917302570) << 3) & (int)((long)2073085007 ^ (long)2073085104)) / Float.intBitsToFloat(0x172AF65 ^ 0x420DAF65);
        float f4 = (float)(n5 & ((int)869087852L ^ 0x33CD3A93)) / Float.intBitsToFloat((int)((long)556255898 ^ (long)1649986202));
        float f5 = (float)(n6 >> (((int)-780694803L ^ 0xD1778AEE) << 3) & ((int)-958277408L ^ 0xC6E1D81F)) / Float.intBitsToFloat((int)((long)1343189048 ^ (long)326135864));
        float f6 = (float)(n6 >> ((int)((long)488157699 ^ (long)488157698) << 4) & ((int)1102533764L ^ 0x41B7547B)) / Float.intBitsToFloat((int)((long)1906283688 ^ (long)853578920));
        float f7 = (float)(n6 >> (((int)724521774L ^ 0x2B2F532F) << 3) & ((int)-796330687L ^ 0xD088F5BE)) / Float.intBitsToFloat(0x2CA7F74E ^ 0x6FD8F74E);
        float f8 = (float)(n6 & ((int)-1991841580L ^ 0x8946E82B)) / Float.intBitsToFloat((int)((long)1618614774 ^ (long)587536886));
        GL11.glPushMatrix();
        GL11.glEnable((int)(((int)161673311L ^ 0x9A2F5AE) << 1));
        GL11.glDisable((int)((int)-1129622927L ^ 0xBCAB5F90));
        GL11.glBlendFunc((int)(((int)-704553596L ^ 0xD6015C05) << 1), (int)((int)((long)-1268633909 ^ (long)-1268634168)));
        GL11.glShadeModel((int)((int)-1410325713L ^ 0xABF03E2E));
        GL11.glBegin((int)((int)((long)-1275103161 ^ (long)-1275103154)));
        VtgVOT1Zqoc0R23jNQa4pjML2TknBjll vtgVOT1Zqoc0R23jNQa4pjML2TknBjll = this;
        int n7 = (int)275333507L ^ 0x10694183;
        int n8 = (int)-1054793891L ^ 0xC1211F5D;
        VtgVOT1Zqoc0R23jNQa4pjML2TknBjll vtgVOT1Zqoc0R23jNQa4pjML2TknBjll2 = vtgVOT1Zqoc0R23jNQa4pjML2TknBjll;
        int n9 = (int)((long)-411203556 ^ (long)-411203556);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glVertex2f((float)n, (float)n2);
        GL11.glVertex2f((float)n, (float)n4);
        GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
        GL11.glVertex2f((float)n3, (float)n4);
        GL11.glVertex2f((float)n3, (float)n2);
        GL11.glEnd();
        GL11.glShadeModel((int)((int)((long)-1602374037 ^ (long)-1602374026) << 8));
        GL11.glEnable((int)((int)-1711851918L ^ 0x99F73B93));
        GL11.glDisable((int)((int)((long)1270684287 ^ (long)1270685582) << 1));
        GL11.glPopMatrix();
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (n3 != 0) return;
        if (!this.Method1687(n, n2)) return;
        this.Field9425 = (int)-323991789L ^ 0xECB04712;
    }

    private final boolean Method1687(int n, int n2) {
        int n3;
        if (n >= this.Field9427 && n <= this.Field9427 + this.Field9424 && n2 >= this.Field9428 + this.Field9429 && n2 <= this.Field9428 + this.Field9429 + this.Method631()) {
            n3 = (int)((long)-1816790889 ^ (long)-1816790890);
            return n3 != 0;
        }
        n3 = (int)-516194357L ^ 0xE13B7FCB;
        return n3 != 0;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        this.Field9425 = (int)2117327875L ^ 0x7E33DC03;
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
        return zU4JHFzU3TzRhHwHm4yw1gyHDTNJkZT4.Field14604 - (int)((long)-1576577201 ^ (long)-1576577204);
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
        return (int)((long)-789457493 ^ (long)-789457494) != 0;
    }

    @Override
    public void Method642(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        this.Field9422 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
    }

    @Override
    @Nullable
    @Nullable
    public vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method643() {
        return this.Field9422;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method1688() {
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

    public VtgVOT1Zqoc0R23jNQa4pjML2TknBjll(@NotNull @NotNull qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"setting");
        this.Field9426 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        this.Field9427 = n;
        this.Field9428 = n2;
        this.Field9429 = n3;
        this.Field9430 = n4;
    }

    private static String Method1697(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)2063648485L ^ 0x7B00C6E5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1842693688L ^ 0x6DD546C7);
            int n2 = (int)((long)-479333297 ^ (long)-479333308) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)590272448 ^ (long)590270549) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

