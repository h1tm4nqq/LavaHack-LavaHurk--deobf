//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import com.kisman.cc.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005?\u0006\u0002\u0010\tJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0016J\u0018\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0002J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\u0018H\u0016J \u0010/\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005H\u0016J \u00101\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0016J\u0010\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u0005H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\u0005H\u0016J\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020\u0005H\u0016J\u0010\u0010;\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0005H\u0016J\u0018\u0010<\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0018H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e?\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004?\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e?\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013?\u0006>" }, d2 = { "Lcom/kisman/cc/gui/halq/components/sub/ColorButtonRewrite;", "Lcom/kisman/cc/gui/api/Openable;", "setting", "Lcom/kisman/cc/settings/Setting;", "x_", "", "y_", "offset", "count_", "(Lcom/kisman/cc/settings/Setting;IIII)V", "color", "Lcom/kisman/cc/util/Colour;", "comps", "Ljava/util/ArrayList;", "Lcom/kisman/cc/gui/api/Component;", "Lkotlin/collections/ArrayList;", "getCount_", "()I", "setCount_", "(I)V", "layer_", "getOffset", "setOffset", "open", "", "getSetting", "()Lcom/kisman/cc/settings/Setting;", "width_", "getX_", "setX_", "getY_", "setY_", "drawScreen", "", "mouseX", "mouseY", "getComponents", "getCount", "getHeight", "getHeight1", "getLayer", "getX", "isMouseOnButton", "x", "y", "isMouseOnButton2", "isOpen", "mouseClicked", "button", "mouseReleased", "mouseButton", "setCount", "count", "setLayer", "layer", "setOff", "newOff", "setWidth", "width", "setX", "updateComponent", "visible", "kisman.cc" })
public final class Class1468 implements Class337
{
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
    public void Method623(final int n, final int n2) {
        final double n3 = this.Method636();
        final double n4 = this.Field14863 + this.Field14864;
        final double n5 = this.Field14860;
        final double n6 = Class1419.Field14604;
        final Class2027 field14584 = Class1419.Field14584;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14584, "HalqGui.backgroundColor");
        Class753.drawRectWH(n3, n4, n5, n6, field14584.Method3626());
        if (Class1419.Field14590) {
            final Class340 class340 = new Class340(new double[] { this.Method636() + Class1419.Field14601, this.Field14863 + this.Field14864 + Class1419.Field14601 }, new double[] { this.Method636() + this.Field14860 / 2, this.Field14863 + this.Field14864 + Class1419.Field14601 }, new double[] { this.Method636() + this.Field14860 / 2, this.Field14863 + this.Field14864 + Class1419.Field14604 - Class1419.Field14601 }, new double[] { this.Method636() + Class1419.Field14601, this.Field14863 + this.Field14864 + Class1419.Field14604 - Class1419.Field14601 });
            final Class2027 field14585 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14585, "HalqGui.backgroundColor");
            final Color color = new Color(field14585.Method3626());
            final Class2027 field14586 = this.Field14856;
            Class753.drawAbstract(new Class211(class340, color, (field14586 != null) ? field14586.Method3625() : null));
            final Class340 class341 = new Class340(new double[] { this.Method636() + this.Field14860 / 2, this.Field14863 + this.Field14864 + Class1419.Field14601 }, new double[] { this.Method636() + this.Field14860 - Class1419.Field14601, this.Field14863 + this.Field14864 + Class1419.Field14601 }, new double[] { this.Method636() + this.Field14860 - Class1419.Field14601, this.Field14863 + this.Field14864 + Class1419.Field14604 - Class1419.Field14601 }, new double[] { this.Method636() + this.Field14860 / 2, this.Field14863 + this.Field14864 + Class1419.Field14604 - Class1419.Field14601 });
            final Class2027 field14587 = this.Field14856;
            final Color color2 = (field14587 != null) ? field14587.Method3625() : null;
            final Class2027 field14588 = Class1419.Field14584;
            Intrinsics.checkExpressionValueIsNotNull((Object)field14588, "HalqGui.backgroundColor");
            Class753.drawAbstract(new Class211(class341, color2, new Color(field14588.Method3626())));
        }
        else {
            final double n7 = this.Method636() + Class1419.Field14601;
            final double n8 = this.Field14863 + this.Field14864 + Class1419.Field14601;
            final double n9 = this.Field14860 - Class1419.Field14601 * 2;
            final double n10 = this.Method631() - Class1419.Field14601 * 2;
            final Class2027 field14589 = this.Field14856;
            final Integer n11 = (field14589 != null) ? Integer.valueOf(field14589.Method3626()) : null;
            if (n11 == null) {
                Intrinsics.throwNpe();
            }
            Class753.drawRectWH(n7, n8, n9, n10, n11);
        }
        Class1419.Method1224(this.Field14861.Method354(), this.Method636(), this.Field14863 + this.Field14864, this.Field14860, Class1419.Field14604);
        if (this.Field14858) {
            if (!this.Field14857.isEmpty()) {}
        }
        this.Field14861.Method340(this.Field14856);
    }
    
    @Override
    public void Method627(final int field14862, final int field14863) {
        this.Field14862 = field14862;
        this.Field14863 = field14863;
        if (this.Field14858 && !this.Field14857.isEmpty()) {
            for (final Class1520 class1520 : this.Field14857) {
                if (!class1520.Method641()) {
                    continue;
                }
                final Class1520 class1521 = class1520;
                Intrinsics.checkExpressionValueIsNotNull((Object)class1521, Method5912("\u6da7\u6dcc\u6d78\u6d40"));
                return (void)(class1521.Method640() * 5);
            }
        }
    }
    
    private final boolean Method5900(final int n, final int n2) {
        return n > this.Field14862 && n < this.Field14862 + this.Field14860 && n2 > this.Field14863 + this.Field14864 && n2 < this.Field14863 + this.Field14864 + Class1419.Field14604;
    }
    
    private final boolean Method5901(final int n, final int n2) {
        return n > this.Field14862 && n < this.Field14862 + this.Field14860 && n2 > this.Field14863 + this.Field14864 && n2 < this.Field14863 + this.Field14864 + this.Method5902();
    }
    
    @Override
    public void Method625(final int n, final int n2, final int n3) {
        if (this.Method5900(n, n2)) {
            if (n3 == 0) {
                this.Field14858 = !this.Field14858;
            }
        }
        else if (this.Method5901(n, n2)) {
            if (!this.Field14857.isEmpty()) {}
        }
    }
    
    @Override
    public void Method626(final int n, final int n2, final int n3) {
        if (!this.Field14857.isEmpty()) {}
    }
    
    @Override
    public void Method629(final int field14864) {
        this.Field14864 = field14864;
    }
    
    @Override
    public void Method630(final int field14865) {
        this.Field14865 = field14865;
    }
    
    @Override
    public int Method631() {
        return Class1419.Field14604;
    }
    
    private final int Method5902() {
        final int field14604 = Class1419.Field14604;
        if (this.Field14858) {
            if (!this.Field14857.isEmpty()) {}
        }
        return field14604;
    }
    
    @Override
    public int Method633() {
        return this.Field14865;
    }
    
    @Override
    public void Method634(final int field14860) {
        this.Field14860 = field14860;
    }
    
    @Override
    public void Method635(final int field14862) {
        this.Field14862 = field14862;
    }
    
    @Override
    public int Method636() {
        return this.Field14862;
    }
    
    @Override
    public void Method639(final int field14859) {
        this.Field14859 = field14859;
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
    
    @NotNull
    @NotNull
    @Override
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
    
    public final void Method5905(final int field14862) {
        this.Field14862 = field14862;
    }
    
    public final int Method5906() {
        return this.Field14863;
    }
    
    public final void Method5907(final int field14863) {
        this.Field14863 = field14863;
    }
    
    public final int Method5908() {
        return this.Field14864;
    }
    
    public final void Method5909(final int field14864) {
        this.Field14864 = field14864;
    }
    
    public final int Method5910() {
        return this.Field14865;
    }
    
    public final void Method5911(final int field14865) {
        this.Field14865 = field14865;
    }
    
    public Class1468(@NotNull @NotNull final Class44 field14861, final int field14862, final int field14863, final int field14864, final int field14865) {
        Intrinsics.checkParameterIsNotNull((Object)field14861, "setting");
        this.Field14861 = field14861;
        this.Field14862 = field14862;
        this.Field14863 = field14863;
        this.Field14864 = field14864;
        this.Field14865 = field14865;
        this.Field14857 = new ArrayList();
        this.Field14856 = this.Field14861.Method339();
        final int n = this.Field14864 + Class1419.Field14604;
        int n2 = 0;
        this.Field14857.add(new Class1196(this.Field14861, this.Field14862, this.Field14863, this.Field14864, n2++));
        final int n3 = n + Class1419.Field14604;
        this.Field14857.add(new Class343(this.Field14861, this.Field14862, this.Field14863, this.Field14864, n2++));
        final int n4 = n3 + Class1419.Field14604;
        this.Field14857.add(new Class508(this.Field14861, this.Field14862, this.Field14863, this.Field14864, n2++));
    }
    
    private static String Method5912(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6D19 ^ 0xDD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
