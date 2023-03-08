//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;
import com.kisman.cc.util.*;
import java.util.function.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u001fH\u0002J\b\u0010\f\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u0011\u0010\u0007\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\n?\u0006)" }, d2 = { "Lcom/kisman/cc/util/render/cubic/ModulePrefixRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "prefix", "", "(Lcom/kisman/cc/features/module/Module;Ljava/lang/String;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc" })
public final class Class631 extends Class1283
{
    @NotNull
    private final Class1996 Field10690;
    @NotNull
    private final Class44 Field10691;
    @NotNull
    private final Class44 Field10692;
    @NotNull
    private final Class44 Field10693;
    @NotNull
    private final Class44 Field10694;
    @NotNull
    private final Class44 Field10695;
    @NotNull
    private final Class44 Field10696;
    @NotNull
    private final Class44 Field10697;
    @NotNull
    private final Class44 Field10698;
    @NotNull
    private final Class44 Field10699;
    private int Field10700;
    
    @NotNull
    @NotNull
    public final Class1996 Method2734() {
        return this.Field10690;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2735() {
        return this.Field10691;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2736() {
        return this.Field10692;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2737() {
        return this.Field10693;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2738() {
        return this.Field10694;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2739() {
        return this.Field10695;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2740() {
        return this.Field10696;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2741() {
        return this.Field10697;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2742() {
        return this.Field10698;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method2743() {
        return this.Field10699;
    }
    
    protected void Method2730() {
        this.Method2728("group", (Class44)this.Field10690);
        this.Method2728("mode", this.Field10691);
        this.Method2728("lineWidth", this.Field10692);
        this.Method2728("rainbow", this.Field10693);
        this.Method2728("rainbowSpeed", this.Field10694);
        this.Method2728("rainbowSat", this.Field10695);
        this.Method2728("rainbowBright", this.Field10696);
        this.Method2728("rainbowGlow", this.Field10697);
        this.Method2728("color1", this.Field10698);
        this.Method2728("color2", this.Field10699);
    }
    
    @NotNull
    @NotNull
    public Class2125 Method2732() {
        final Class2027 method2744 = this.Method2744();
        final Class2027 method2745 = this.Method2745();
        final Class1975 class1975 = new Class1975((Class1283)this);
        final Enum method2746 = this.Field10691.Method341();
        if (method2746 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        final Class2125 method2747 = class1975.Method7316(((Class786)method2746).Method3273()).Method7314(method2744, method2745).Method7315(this.Field10692.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)method2747, "DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return method2747;
    }
    
    public void Method2733(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class1975 class1975) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class1975, "delegate");
        if (!this.Field10697.Method359().equals("None")) {
            final AxisAlignedBB method3447 = Class815.Method3447(axisAlignedBB);
            final Class2027 method3448 = this.Method2744();
            final Class2027 method3449 = this.Method2745();
            if (this.Field10697.Method359().equals("ReverseGlow")) {}
            Class815.Method3446(method3447, this.Field10692.Method368(), method3448, method3449, Class2008.Field17219);
            return;
        }
        class1975.Method7318();
    }
    
    private final Class2027 Method2744() {
        final String method359 = this.Field10697.Method359();
        int field17324 = this.Field10698.Method339().Field17324;
        if (method359.equals("ReverseGlow")) {
            field17324 = 0;
        }
        Class2027 class2027;
        if (this.Field10693.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(0, this.Field10695.Method335(), this.Field10696.Method335(), field17324, this.Field10694.Method367())), "RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field10698.Method339()), "color1.colour");
        }
        return class2027;
    }
    
    private final Class2027 Method2745() {
        final String method359 = this.Field10697.Method359();
        int field17324 = this.Field10699.Method339().Field17324;
        if (method359.equals("Glow")) {
            field17324 = 0;
        }
        Class2027 class2027;
        if (this.Field10693.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(50, this.Field10695.Method335(), this.Field10696.Method335(), field17324, this.Field10694.Method367())), "RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field10699.Method339()), "color2.colour");
        }
        return class2027;
    }
    
    public Class631(@NotNull @NotNull final Class42 class42, @NotNull @NotNull final String str) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        Intrinsics.checkParameterIsNotNull((Object)str, "prefix");
        this.Field10690 = new Class1996(new Class44(str, class42));
        this.Field10691 = this.Field10690.Method7405(new Class44(str + "Render Mode", class42, (Enum)Class786.Field11309));
        final Class1996 field10690 = this.Field10690;
        final Class44 method313 = new Class44(str + "Render Line Width", class42, 1.0, Double.longBitsToDouble((long)2133887238 ^ 0x3FB99999E6A9109CL), Double.longBitsToDouble(4617315517961601024L), false).Method313((Supplier)new Class2041(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method313, "Setting(prefix + \"Render\u2026odes.FilledGradient\n    }");
        this.Field10692 = field10690.Method7405(method313);
        this.Field10693 = this.Field10690.Method7405(new Class44(str + " Rainbow", class42, false));
        this.Field10694 = this.Field10690.Method7405(new Class44(str + " RainbowSpeed", class42, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble(4617315517961601024L), false));
        final Class1996 field10691 = this.Field10690;
        final Class44 method314 = new Class44(str + " Saturation", class42, Double.longBitsToDouble((long)1710940075 ^ 0x4059000065FADFABL), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313((Supplier)new Class1730(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method314, "Setting(\"$prefix Saturat\u2026sible{rainbow.valBoolean}");
        this.Field10695 = field10691.Method7405(method314);
        final Class1996 field10692 = this.Field10690;
        final Class44 method315 = new Class44(str + " Brightness", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313((Supplier)new Class105(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method315, "Setting(\"$prefix Brightn\u2026sible{rainbow.valBoolean}");
        this.Field10696 = field10692.Method7405(method315);
        final Class1996 field10693 = this.Field10690;
        final Class44 method316 = new Class44(str + "  Glow", class42, "None", CollectionsKt.listOf((Object[])new String[] { "None", "Glow", "ReverseGlow" })).Method313((Supplier)new Class1060(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method316, "Setting(\"$prefix  Glow\",\u2026sible{rainbow.valBoolean}");
        this.Field10697 = field10693.Method7405(method316);
        this.Field10698 = this.Field10690.Method7405(new Class44(str + "Render Color", class42, "Render Color", new Class2027(255, 0, 0, 255)));
        final Class1996 field10694 = this.Field10690;
        final Class44 method317 = new Class44(str + "Render Second Color", class42, "Render Second Color", new Class2027(0, 120, 255, 255)).Method313((Supplier)new Class72(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method317, "Setting(prefix + \"Render\u2026.Glow\n            )\n    }");
        this.Field10699 = field10694.Method7405(method317);
    }
    
    private static String Method2746(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7046 ^ 0xAA));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
