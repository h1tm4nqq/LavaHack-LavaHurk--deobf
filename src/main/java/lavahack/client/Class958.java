//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.util.*;
import java.awt.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\f\n\u0002\b\u0012\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005?\u0006\u0002\u0010\nJ(\u0010&\u001a\u00020\u00052\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\u0005H\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0018\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0002J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u0018\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\u0018\u00107\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0002J\b\u00108\u001a\u00020\u001aH\u0016J\u0018\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0005H\u0016J \u0010=\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0005H\u0016J \u0010?\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005H\u0016J\u0010\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020\u0005H\u0016J\u0010\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020\u0005H\u0016J\u0010\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020\u0005H\u0016J\u0010\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020\u0005H\u0016J\u0010\u0010I\u001a\u00020*2\u0006\u00105\u001a\u00020\u0005H\u0016J\u0010\u0010J\u001a\u00020*2\u0006\u00106\u001a\u00020\u0005H\u0016J\u0018\u0010K\u001a\u00020*2\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005H\u0016J\b\u0010L\u001a\u00020\u001aH\u0016R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014?\u0006M" }, d2 = { "Lcom/kisman/cc/gui/halq/components/sub/GroupButton;", "Lcom/kisman/cc/gui/api/Openable;", "setting", "Lcom/kisman/cc/settings/types/SettingGroup;", "x_", "", "y_", "offset", "count_", "layer_", "(Lcom/kisman/cc/settings/types/SettingGroup;IIIII)V", "comps", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/api/Component;", "Lkotlin/collections/ArrayList;", "getComps", "()Ljava/util/ArrayList;", "getCount_", "()I", "setCount_", "(I)V", "getLayer_", "setLayer_", "getOffset", "setOffset", "open", "", "getOpen", "()Z", "setOpen", "(Z)V", "getSetting", "()Lcom/kisman/cc/settings/types/SettingGroup;", "width_", "getX_", "setX_", "getY_", "setY_", "doIterationFullHeight", "components", "oldHeight", "drawScreen", "", "mouseX", "mouseY", "getComponents", "getCount", "getHeight", "getHeight1", "getLayer", "getX", "getY", "isMouseOnButton", "x", "y", "isMouseOnButton2", "isOpen", "keyTyped", "typedChar", "", "key", "mouseClicked", "button", "mouseReleased", "mouseButton", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setWidth", "width", "setX", "setY", "updateComponent", "visible", "kisman.cc" })
public final class Class958 implements Class337
{
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
    
    public final void Method3931(final boolean field12079) {
        this.Field12079 = field12079;
    }
    
    public boolean Method1668() {
        return this.Field12079;
    }
    
    @NotNull
    @NotNull
    public ArrayList Method1669() {
        return this.Field12077;
    }
    
    public void Method623(final int n, final int n2) {
        super.Method623(n, n2);
        final double n3 = this.Method636();
        final double n4 = this.Field12082 + this.Field12083;
        final double n5 = this.Field12078;
        final double n6 = Class1419.Field14604;
        final Class2027 field14584 = Class1419.Field14584;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14584, "HalqGui.backgroundColor");
        Class753.drawRectWH(n3, n4, n5, n6, field14584.Method3626());
        if (Class1419.Field14590) {
            final Class340 class340 = new Class340(new double[] { this.Method636() + Class1419.Field14601, this.Field12082 + this.Field12083 + Class1419.Field14602 }, new double[] { this.Method636() + this.Field12078 / 2, this.Field12082 + this.Field12083 + Class1419.Field14602 }, new double[] { this.Method636() + this.Field12078 / 2, this.Field12082 + this.Field12083 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Method636() + Class1419.Field14601, this.Field12082 + this.Field12083 + Class1419.Field14604 - Class1419.Field14602 });
            final Class2027 field14585 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14585, "HalqGui.backgroundColor");
            final int method3626 = field14585.Method3626();
            final Class44 field14586 = null.Field16098;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14586, "GuiModule.instance.idkJustAlpha");
            final Color method3627 = Class1172.Method4729(method3626, field14586.Method335());
            final Class2027 method3628 = Class1419.Method1228(this.Method633());
            Intrinsics.checkExpressionValueIsNotNull((Object)method3628, "HalqGui.getGradientColour(count)");
            Class753.drawAbstract(new Class211(class340, method3627, method3628.Method3625()));
            final Class340 class341 = new Class340(new double[] { this.Method636() + this.Field12078 / 2, this.Field12082 + this.Field12083 + Class1419.Field14602 }, new double[] { this.Method636() + this.Field12078 - Class1419.Field14601, this.Field12082 + this.Field12083 + Class1419.Field14602 }, new double[] { this.Method636() + this.Field12078 - Class1419.Field14601, this.Field12082 + this.Field12083 + Class1419.Field14604 - Class1419.Field14602 }, new double[] { this.Method636() + this.Field12078 / 2, this.Field12082 + this.Field12083 + Class1419.Field14604 - Class1419.Field14602 });
            final Class2027 method3629 = Class1419.Method1228(this.Method633());
            Intrinsics.checkExpressionValueIsNotNull((Object)method3629, "HalqGui.getGradientColour(count)");
            final Color method3630 = method3629.Method3625();
            final Class2027 field14587 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14587, "HalqGui.backgroundColor");
            final int method3631 = field14587.Method3626();
            final Class44 field14588 = null.Field16098;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14588, "GuiModule.instance.idkJustAlpha");
            Class753.drawAbstract(new Class211(class341, method3630, Class1172.Method4729(method3631, field14588.Method335())));
        }
        else {
            final double n7 = this.Method636() + Class1419.Field14601;
            final double n8 = this.Field12082 + this.Field12083 + Class1419.Field14602;
            final double n9 = this.Field12078 - Class1419.Field14601 * 2;
            final double n10 = this.Method631() - Class1419.Field14602 * 2;
            final Class2027 method3632 = Class1419.Method1228(this.Method633());
            Intrinsics.checkExpressionValueIsNotNull((Object)method3632, "HalqGui.getGradientColour(count)");
            Class753.drawRectWH(n7, n8, n9, n10, method3632.Method3626());
        }
        Class1419.Method1224(this.Field12080.Method354() + "...", this.Method636(), this.Field12082 + this.Field12083, this.Field12078, Class1419.Field14604);
        if (this.Field12079) {
            if (!this.Field12077.isEmpty()) {}
        }
    }
    
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method3934(n, n2)) {
            if (n3 == 0) {
                this.Field12079 = !this.Field12079;
            }
        }
        else if (this.Method3935(n, n2)) {
            if (!this.Field12077.isEmpty()) {}
        }
    }
    
    public void Method626(final int n, final int n2, final int n3) {
        if (!this.Field12077.isEmpty()) {}
    }
    
    public void Method627(final int field12081, final int field12082) {
        this.Field12081 = field12081;
        this.Field12082 = field12082;
        if (this.Field12079 && !this.Field12077.isEmpty()) {
            final Iterator<Class1520> iterator = this.Field12077.iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().Method641()) {
                    continue;
                }
                return (void)(this.Method640() * 5);
            }
        }
    }
    
    public void Method628(final char c, final int n) {
        if (!this.Field12077.isEmpty()) {}
    }
    
    public void Method629(final int field12083) {
        this.Field12083 = field12083;
    }
    
    public void Method630(final int field12084) {
        this.Field12084 = field12084;
    }
    
    public int Method631() {
        return Class1419.Field14604;
    }
    
    private final int Method3932() {
        final int field14604 = Class1419.Field14604;
        if (this.Field12079) {
            if (!this.Field12077.isEmpty()) {}
        }
        return field14604;
    }
    
    private final int Method3933(final ArrayList list, final int n) {
        int method3933 = n;
        for (final Class1520 class1520 : list) {
            final int n2 = method3933;
            final Class1520 class1521 = class1520;
            Intrinsics.checkExpressionValueIsNotNull((Object)class1521, "component");
            method3933 = n2 + class1521.Method631();
            if (class1520 instanceof Class337) {
                method3933 = this.Method3933(((Class337)class1520).Method1669(), method3933);
            }
        }
        return method3933;
    }
    
    public int Method633() {
        return this.Field12084;
    }
    
    public void Method634(final int field12078) {
        this.Field12078 = field12078;
    }
    
    public void Method635(final int field12081) {
        this.Field12081 = field12081;
    }
    
    public int Method636() {
        return this.Field12081;
    }
    
    public void Method639(final int field12085) {
        this.Field12085 = field12085;
    }
    
    public int Method640() {
        return this.Field12085;
    }
    
    public boolean Method641() {
        return this.Field12080.Method311() && Class1419.Method1233(this.Field12080.Method354()) && Class1419.Method1234((Class337)this);
    }
    
    private final boolean Method3934(final int n, final int n2) {
        return n > this.Field12081 && n < this.Field12081 + this.Field12078 && n2 > this.Field12082 + this.Field12083 && n2 < this.Field12082 + this.Field12083 + Class1419.Field14604;
    }
    
    private final boolean Method3935(final int n, final int n2) {
        return n > this.Field12081 && n < this.Field12081 + this.Field12078 && n2 > this.Field12082 + this.Field12083 && n2 < this.Field12082 + this.Field12083 + this.Method3932();
    }
    
    public void Method637(final int field12082) {
        this.Field12082 = field12082;
    }
    
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
    
    public final void Method3938(final int field12081) {
        this.Field12081 = field12081;
    }
    
    public final int Method3939() {
        return this.Field12082;
    }
    
    public final void Method3940(final int field12082) {
        this.Field12082 = field12082;
    }
    
    public final int Method3941() {
        return this.Field12083;
    }
    
    public final void Method3942(final int field12083) {
        this.Field12083 = field12083;
    }
    
    public final int Method3943() {
        return this.Field12084;
    }
    
    public final void Method3944(final int field12084) {
        this.Field12084 = field12084;
    }
    
    public final int Method3945() {
        return this.Field12085;
    }
    
    public final void Method3946(final int field12085) {
        this.Field12085 = field12085;
    }
    
    public Class958(@NotNull @NotNull final Class1996 field12080, final int field12081, final int field12082, final int field12083, final int field12084, final int field12085) {
        Intrinsics.checkParameterIsNotNull((Object)field12080, "setting");
        this.Field12080 = field12080;
        this.Field12081 = field12081;
        this.Field12082 = field12082;
        this.Field12083 = field12083;
        this.Field12084 = field12084;
        this.Field12085 = field12085;
        this.Field12077 = new ArrayList();
        this.Field12078 = 120;
        this.Field12078 = Class981.Method3992(this.Field12085, this.Field12078);
        if (!this.Field12080.Method7404().isEmpty()) {}
    }
    
    private static String Method3947(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE8E ^ 0x92));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
