/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1196;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class211;
import lavahack.client.Class337;
import lavahack.client.Class340;
import lavahack.client.Class343;
import lavahack.client.Class44;
import lavahack.client.Class508;
import lavahack.client.Class753;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0016J\u0018\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0002J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\u0018H\u0016J \u0010/\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0016J \u00101\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\u0005H\u0016J\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020\u0005H\u0016J\u0010\u0010;\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0018\u0010<\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0018H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013\u00a8\u0006>"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/ColorButtonRewrite;", "Lcom/kisman/cc/gui/api/Openable;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "comps", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/api/Component;", "Lkotlin/collections/ArrayList;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "open", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getComponents", "getCount", "getHeight", "getHeight1", "getLayer", "getX", "isMouseOnButton", "x", "y", "isMouseOnButton2", "isOpen", "mouseClicked", "button", "mouseReleased", "mouseButton", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc"})
public final class Class1468
implements Class337 {
    private Class2027 Field14856;
    private final ArrayList Field14857;
    private boolean Field14858;
    private int Field14859;
    private int Field14860;
    @NotNull
    private final Class44 Field14861;
    private int Field14862;
    private int Field14863;
    private int Field14864;
    private int Field14865;
    private int Field14866;

    @Override
    public void Method623(int n, int n2) {
        double d = this.Method636();
        double d2 = this.Field14863 + this.Field14864;
        double d3 = this.Field14860;
        double d4 = Class1419.Field14604;
        Class2027 class2027 = Class1419.Field14584;
        Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"HalqGui.backgroundColor");
        Class753.drawRectWH(d, d2, d3, d4, class2027.Method3626());
        if (Class1419.Field14590) {
            Class340 class340 = new Class340(new double[]{(double)this.Method636() + Class1419.Field14601, (double)(this.Field14863 + this.Field14864) + Class1419.Field14601}, new double[]{this.Method636() + this.Field14860 / 2, (double)(this.Field14863 + this.Field14864) + Class1419.Field14601}, new double[]{this.Method636() + this.Field14860 / 2, (double)(this.Field14863 + this.Field14864 + Class1419.Field14604) - Class1419.Field14601}, new double[]{(double)this.Method636() + Class1419.Field14601, (double)(this.Field14863 + this.Field14864 + Class1419.Field14604) - Class1419.Field14601});
            Class2027 class20272 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"HalqGui.backgroundColor");
            Class2027 class20273 = this.Field14856;
            Class753.drawAbstract(new Class211(class340, new Color(class20272.Method3626()), class20273 != null ? class20273.Method3625() : null));
            Class340 class3402 = new Class340(new double[]{this.Method636() + this.Field14860 / 2, (double)(this.Field14863 + this.Field14864) + Class1419.Field14601}, new double[]{(double)(this.Method636() + this.Field14860) - Class1419.Field14601, (double)(this.Field14863 + this.Field14864) + Class1419.Field14601}, new double[]{(double)(this.Method636() + this.Field14860) - Class1419.Field14601, (double)(this.Field14863 + this.Field14864 + Class1419.Field14604) - Class1419.Field14601}, new double[]{this.Method636() + this.Field14860 / 2, (double)(this.Field14863 + this.Field14864 + Class1419.Field14604) - Class1419.Field14601});
            Class2027 class20274 = this.Field14856;
            Color color = class20274 != null ? class20274.Method3625() : null;
            Class2027 class20275 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20275, (String)"HalqGui.backgroundColor");
            Class753.drawAbstract(new Class211(class3402, color, new Color(class20275.Method3626())));
        } else {
            double d5 = (double)this.Method636() + Class1419.Field14601;
            double d6 = (double)(this.Field14863 + this.Field14864) + Class1419.Field14601;
            double d7 = (double)this.Field14860 - Class1419.Field14601 * (double)2;
            double d8 = (double)this.Method631() - Class1419.Field14601 * (double)2;
            Class2027 class20276 = this.Field14856;
            Integer n3 = class20276 != null ? Integer.valueOf(class20276.Method3626()) : null;
            if (n3 == null) {
                Intrinsics.throwNpe();
            }
            Class753.drawRectWH(d5, d6, d7, d8, n3);
        }
        Class1419.Method1224(this.Field14861.Method354(), this.Method636(), this.Field14863 + this.Field14864, this.Field14860, Class1419.Field14604);
        if (this.Field14858) {
            Collection collection = this.Field14857;
            boolean bl = false;
            boolean bl2 = !collection.isEmpty();
        }
        this.Field14861.Method340(this.Field14856);
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field14862 = n;
        this.Field14863 = n2;
        if (!this.Field14858) return;
        Object object = this.Field14857;
        boolean bl = false;
        if (!(!object.isEmpty())) return;
        Iterator iterator = this.Field14857.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!(object = (Class1520)iterator.next()).Method641());
        Object object2 = object;
        int n3 = n;
        Object object3 = object;
        Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)Class1468.Method5912("\u6da7\u6dcc\u6d78\u6d40"));
        int n4 = object3.Method640();
        return (void)(n4 * 5);
    }

    private final boolean Method5900(int n, int n2) {
        if (n <= this.Field14862) return false;
        if (n >= this.Field14862 + this.Field14860) return false;
        if (n2 <= this.Field14863 + this.Field14864) return false;
        if (n2 >= this.Field14863 + this.Field14864 + Class1419.Field14604) return false;
        return true;
    }

    private final boolean Method5901(int n, int n2) {
        if (n <= this.Field14862) return false;
        if (n >= this.Field14862 + this.Field14860) return false;
        if (n2 <= this.Field14863 + this.Field14864) return false;
        if (n2 >= this.Field14863 + this.Field14864 + this.Method5902()) return false;
        return true;
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method5900(n, n2)) {
            if (n3 != 0) return;
            this.Field14858 = !this.Field14858;
            return;
        }
        if (!this.Method5901(n, n2)) return;
        Collection collection = this.Field14857;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        Collection collection = this.Field14857;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @Override
    public void Method629(int n) {
        this.Field14864 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field14865 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604;
    }

    private final int Method5902() {
        boolean bl;
        int n = Class1419.Field14604;
        if (!this.Field14858) return n;
        Collection collection = this.Field14857;
        boolean bl2 = false;
        if (!collection.isEmpty()) {
            bl = true;
            return n;
        }
        bl = false;
        return n;
    }

    @Override
    public int Method633() {
        return this.Field14865;
    }

    @Override
    public void Method634(int n) {
        this.Field14860 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field14862 = n;
    }

    @Override
    public int Method636() {
        return this.Field14862;
    }

    @Override
    public void Method639(int n) {
        this.Field14859 = n;
    }

    @Override
    public int Method640() {
        return this.Field14859;
    }

    @Override
    public boolean Method641() {
        return this.Field14861.Method311();
    }

    @Override
    public boolean Method1668() {
        return this.Field14858;
    }

    @Override
    @NotNull
    @NotNull
    public ArrayList Method1669() {
        return this.Field14857;
    }

    @NotNull
    @NotNull
    public final Class44 Method5903() {
        return this.Field14861;
    }

    public final int Method5904() {
        return this.Field14862;
    }

    public final void Method5905(int n) {
        this.Field14862 = n;
    }

    public final int Method5906() {
        return this.Field14863;
    }

    public final void Method5907(int n) {
        this.Field14863 = n;
    }

    public final int Method5908() {
        return this.Field14864;
    }

    public final void Method5909(int n) {
        this.Field14864 = n;
    }

    public final int Method5910() {
        return this.Field14865;
    }

    public final void Method5911(int n) {
        this.Field14865 = n;
    }

    public Class1468(@NotNull @NotNull Class44 class44, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)class44, (String)"setting");
        this.Field14861 = class44;
        this.Field14862 = n;
        this.Field14863 = n2;
        this.Field14864 = n3;
        this.Field14865 = n4;
        this.Field14857 = new ArrayList();
        this.Field14856 = this.Field14861.Method339();
        int n5 = this.Field14864 + Class1419.Field14604;
        int n6 = 0;
        this.Field14857.add(new Class1196(this.Field14861, this.Field14862, this.Field14863, this.Field14864, n6++));
        n5 += Class1419.Field14604;
        this.Field14857.add(new Class343(this.Field14861, this.Field14862, this.Field14863, this.Field14864, n6++));
        n5 += Class1419.Field14604;
        this.Field14857.add(new Class508(this.Field14861, this.Field14862, this.Field14863, this.Field14864, n6++));
    }

    private static String Method5912(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 221;
            cArray2[n] = (char)(cArray[n] ^ (0x6D19 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

