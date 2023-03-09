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
import lavahack.client.Class1172;
import lavahack.client.Class1419;
import lavahack.client.Class1520;
import lavahack.client.Class1996;
import lavahack.client.Class211;
import lavahack.client.Class337;
import lavahack.client.Class340;
import lavahack.client.Class44;
import lavahack.client.Class753;
import lavahack.client.Class981;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\f\n\u0002\b\u0012\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ(\u0010&\u001a\u00020\u00052\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\u0005H\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0018\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0002J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u0018\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\u0018\u00107\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\b\u00108\u001a\u00020\u001aH\u0016J\u0018\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0005H\u0016J \u0010=\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0005H\u0016J \u0010?\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005H\u0016J\u0010\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020\u0005H\u0016J\u0010\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020\u0005H\u0016J\u0010\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020\u0005H\u0016J\u0010\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020\u0005H\u0016J\u0010\u0010I\u001a\u00020*2\u0006\u00105\u001a\u00020\u0005H\u0016J\u0010\u0010J\u001a\u00020*2\u0006\u00106\u001a\u00020\u0005H\u0016J\u0018\u0010K\u001a\u00020*2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0016J\b\u0010L\u001a\u00020\u001aH\u0016R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014\u00a8\u0006M"}, d2={"Lcom/kisman/cc/gui/halq/components/sub/GroupButton;", "Lcom/kisman/cc/gui/api/Openable;", "setting", "Lcom/kisman/cc/settings/types/SettingGroup;", "x_", "", "y_", "offset", "count_", "layer_", "(Lcom/kisman/cc/settings/types/SettingGroup;IIIII)V", "comps", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/api/Component;", "Lkotlin/collections/ArrayList;", "getComps", "()Ljava/util/ArrayList;", "getCount_", "()I", "setCount_", "(I)V", "getLayer_", "setLayer_", "getOffset", "setOffset", "open", "", "getOpen", "()Z", "setOpen", "(Z)V", "getSetting", "()Lcom/kisman/cc/settings/types/SettingGroup;", "width_", "getX_", "setX_", "getY_", "setY_", "doIterationFullHeight", "components", "oldHeight", "drawScreen", "", "mouseX", "mouseY", "getComponents", "getCount", "getHeight", "getHeight1", "getLayer", "getX", "getY", "isMouseOnButton", "x", "y", "isMouseOnButton2", "isOpen", "keyTyped", "typedChar", "", "key", "mouseClicked", "button", "mouseReleased", "mouseButton", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setWidth", "width", "setX", "setY", "updateComponent", "visible", "kisman.cc"})
public final class Class958
implements Class337 {
    @NotNull
    private final ArrayList Field12077;
    private int Field12078;
    private boolean Field12079;
    @NotNull
    private final Class1996 Field12080;
    private int Field12081;
    private int Field12082;
    private int Field12083;
    private int Field12084;
    private int Field12085;
    private String Field12086 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final ArrayList Method3929() {
        return this.Field12077;
    }

    public final boolean Method3930() {
        return this.Field12079;
    }

    public final void Method3931(boolean bl) {
        this.Field12079 = bl;
    }

    @Override
    public boolean Method1668() {
        return this.Field12079;
    }

    @Override
    @NotNull
    @NotNull
    public ArrayList Method1669() {
        return this.Field12077;
    }

    @Override
    public void Method623(int n, int n2) {
        Class337.super.Method623(n, n2);
        double d = this.Method636();
        double d2 = this.Field12082 + this.Field12083;
        double d3 = this.Field12078;
        double d4 = Class1419.Field14604;
        Class2027 class2027 = Class1419.Field14584;
        Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"HalqGui.backgroundColor");
        Class753.drawRectWH(d, d2, d3, d4, class2027.Method3626());
        if (Class1419.Field14590) {
            Class340 class340 = new Class340(new double[]{(double)this.Method636() + Class1419.Field14601, (double)(this.Field12082 + this.Field12083) + Class1419.Field14602}, new double[]{this.Method636() + this.Field12078 / 2, (double)(this.Field12082 + this.Field12083) + Class1419.Field14602}, new double[]{this.Method636() + this.Field12078 / 2, (double)(this.Field12082 + this.Field12083 + Class1419.Field14604) - Class1419.Field14602}, new double[]{(double)this.Method636() + Class1419.Field14601, (double)(this.Field12082 + this.Field12083 + Class1419.Field14604) - Class1419.Field14602});
            Class2027 class20272 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"HalqGui.backgroundColor");
            int n3 = class20272.Method3626();
            Class44 class44 = null.Field16098;
            Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"GuiModule.instance.idkJustAlpha");
            Color color = Class1172.Method4729(n3, class44.Method335());
            Class2027 class20273 = Class1419.Method1228(this.Method633());
            Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"HalqGui.getGradientColour(count)");
            Class753.drawAbstract(new Class211(class340, color, class20273.Method3625()));
            Class340 class3402 = new Class340(new double[]{this.Method636() + this.Field12078 / 2, (double)(this.Field12082 + this.Field12083) + Class1419.Field14602}, new double[]{(double)(this.Method636() + this.Field12078) - Class1419.Field14601, (double)(this.Field12082 + this.Field12083) + Class1419.Field14602}, new double[]{(double)(this.Method636() + this.Field12078) - Class1419.Field14601, (double)(this.Field12082 + this.Field12083 + Class1419.Field14604) - Class1419.Field14602}, new double[]{this.Method636() + this.Field12078 / 2, (double)(this.Field12082 + this.Field12083 + Class1419.Field14604) - Class1419.Field14602});
            Class2027 class20274 = Class1419.Method1228(this.Method633());
            Intrinsics.checkExpressionValueIsNotNull((Object)class20274, (String)"HalqGui.getGradientColour(count)");
            Color color2 = class20274.Method3625();
            Class2027 class20275 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20275, (String)"HalqGui.backgroundColor");
            int n4 = class20275.Method3626();
            Class44 class442 = null.Field16098;
            Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"GuiModule.instance.idkJustAlpha");
            Class753.drawAbstract(new Class211(class3402, color2, Class1172.Method4729(n4, class442.Method335())));
        } else {
            double d5 = (double)this.Method636() + Class1419.Field14601;
            double d6 = (double)(this.Field12082 + this.Field12083) + Class1419.Field14602;
            double d7 = (double)this.Field12078 - Class1419.Field14601 * (double)2;
            double d8 = (double)this.Method631() - Class1419.Field14602 * (double)2;
            Class2027 class20276 = Class1419.Method1228(this.Method633());
            Intrinsics.checkExpressionValueIsNotNull((Object)class20276, (String)"HalqGui.getGradientColour(count)");
            Class753.drawRectWH(d5, d6, d7, d8, class20276.Method3626());
        }
        Class1419.Method1224(this.Field12080.Method354() + "...", this.Method636(), this.Field12082 + this.Field12083, this.Field12078, Class1419.Field14604);
        if (!this.Field12079) return;
        Collection collection = this.Field12077;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @Override
    public void Method625(int n, int n2, int n3) {
        if (this.Method3934(n, n2)) {
            if (n3 != 0) return;
            this.Field12079 = !this.Field12079;
            return;
        }
        if (!this.Method3935(n, n2)) return;
        Collection collection = this.Field12077;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @Override
    public void Method626(int n, int n2, int n3) {
        Collection collection = this.Field12077;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @Override
    public void Method627(int n, int n2) {
        this.Field12081 = n;
        this.Field12082 = n2;
        if (!this.Field12079) return;
        Object object = this.Field12077;
        boolean bl = false;
        if (!(!object.isEmpty())) return;
        Iterator iterator = this.Field12077.iterator();
        do {
            if (!iterator.hasNext()) return;
        } while (!(object = (Class1520)iterator.next()).Method641());
        Object object2 = object;
        int n3 = n;
        int n4 = this.Method640();
        return (void)(n4 * 5);
    }

    @Override
    public void Method628(char c, int n) {
        Collection collection = this.Field12077;
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    @Override
    public void Method629(int n) {
        this.Field12083 = n;
    }

    @Override
    public void Method630(int n) {
        this.Field12084 = n;
    }

    @Override
    public int Method631() {
        return Class1419.Field14604;
    }

    private final int Method3932() {
        boolean bl;
        int n = Class1419.Field14604;
        if (!this.Field12079) return n;
        Collection collection = this.Field12077;
        boolean bl2 = false;
        if (!collection.isEmpty()) {
            bl = true;
            return n;
        }
        bl = false;
        return n;
    }

    private final int Method3933(ArrayList arrayList, int n) {
        int n2 = n;
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Class1520 class1520;
            Class1520 class15202 = class1520 = (Class1520)iterator.next();
            Intrinsics.checkExpressionValueIsNotNull((Object)class15202, (String)"component");
            n2 += class15202.Method631();
            if (!(class1520 instanceof Class337)) continue;
            n2 = this.Method3933(((Class337)class1520).Method1669(), n2);
        }
        return n2;
    }

    @Override
    public int Method633() {
        return this.Field12084;
    }

    @Override
    public void Method634(int n) {
        this.Field12078 = n;
    }

    @Override
    public void Method635(int n) {
        this.Field12081 = n;
    }

    @Override
    public int Method636() {
        return this.Field12081;
    }

    @Override
    public void Method639(int n) {
        this.Field12085 = n;
    }

    @Override
    public int Method640() {
        return this.Field12085;
    }

    @Override
    public boolean Method641() {
        if (!this.Field12080.Method311()) return false;
        if (!Class1419.Method1233(this.Field12080.Method354())) return false;
        if (!Class1419.Method1234(this)) return false;
        return true;
    }

    private final boolean Method3934(int n, int n2) {
        if (n <= this.Field12081) return false;
        if (n >= this.Field12081 + this.Field12078) return false;
        if (n2 <= this.Field12082 + this.Field12083) return false;
        if (n2 >= this.Field12082 + this.Field12083 + Class1419.Field14604) return false;
        return true;
    }

    private final boolean Method3935(int n, int n2) {
        if (n <= this.Field12081) return false;
        if (n >= this.Field12081 + this.Field12078) return false;
        if (n2 <= this.Field12082 + this.Field12083) return false;
        if (n2 >= this.Field12082 + this.Field12083 + this.Method3932()) return false;
        return true;
    }

    @Override
    public void Method637(int n) {
        this.Field12082 = n;
    }

    @Override
    public int Method638() {
        return this.Field12082 + this.Field12083;
    }

    @NotNull
    @NotNull
    public final Class1996 Method3936() {
        return this.Field12080;
    }

    public final int Method3937() {
        return this.Field12081;
    }

    public final void Method3938(int n) {
        this.Field12081 = n;
    }

    public final int Method3939() {
        return this.Field12082;
    }

    public final void Method3940(int n) {
        this.Field12082 = n;
    }

    public final int Method3941() {
        return this.Field12083;
    }

    public final void Method3942(int n) {
        this.Field12083 = n;
    }

    public final int Method3943() {
        return this.Field12084;
    }

    public final void Method3944(int n) {
        this.Field12084 = n;
    }

    public final int Method3945() {
        return this.Field12085;
    }

    public final void Method3946(int n) {
        this.Field12085 = n;
    }

    public Class958(@NotNull @NotNull Class1996 class1996, int n, int n2, int n3, int n4, int n5) {
        Intrinsics.checkParameterIsNotNull((Object)class1996, (String)"setting");
        this.Field12080 = class1996;
        this.Field12081 = n;
        this.Field12082 = n2;
        this.Field12083 = n3;
        this.Field12084 = n4;
        this.Field12085 = n5;
        this.Field12077 = new ArrayList();
        this.Field12078 = 120;
        this.Field12078 = Class981.Method3992(this.Field12085, this.Field12078);
        Collection collection = this.Field12080.Method7404();
        boolean bl = false;
        if (collection.isEmpty()) return;
    }

    private static String Method3947(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 146;
            cArray2[n] = (char)(cArray[n] ^ (0xE8E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

