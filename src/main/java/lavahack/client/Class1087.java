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

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u001fH\u0002J\b\u0010\f\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u0011\u0010\u0007\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\b?\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\n?\u0006)" }, d2 = { "Lcom/kisman/cc/util/render/cubic/ModuleSuffixRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "suffix", "", "(Lcom/kisman/cc/features/module/Module;Ljava/lang/String;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc" })
public final class Class1087 extends Class1283
{
    @NotNull
    private final Class1996 Field12847;
    @NotNull
    private final Class44 Field12848;
    @NotNull
    private final Class44 Field12849;
    @NotNull
    private final Class44 Field12850;
    @NotNull
    private final Class44 Field12851;
    @NotNull
    private final Class44 Field12852;
    @NotNull
    private final Class44 Field12853;
    @NotNull
    private final Class44 Field12854;
    @NotNull
    private final Class44 Field12855;
    @NotNull
    private final Class44 Field12856;
    private int Field12857;
    
    @NotNull
    @NotNull
    public final Class1996 Method4379() {
        return this.Field12847;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4380() {
        return this.Field12848;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4381() {
        return this.Field12849;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4382() {
        return this.Field12850;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4383() {
        return this.Field12851;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4384() {
        return this.Field12852;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4385() {
        return this.Field12853;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4386() {
        return this.Field12854;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4387() {
        return this.Field12855;
    }
    
    @NotNull
    @NotNull
    public final Class44 Method4388() {
        return this.Field12856;
    }
    
    @Override
    protected void Method2730() {
        this.Method2728("group", this.Field12847);
        this.Method2728("mode", this.Field12848);
        this.Method2728("lineWidth", this.Field12849);
        this.Method2728("rainbow", this.Field12850);
        this.Method2728("rainbowSpeed", this.Field12851);
        this.Method2728("rainbowSat", this.Field12852);
        this.Method2728("rainbowBright", this.Field12853);
        this.Method2728("rainbowGlow", this.Field12854);
        this.Method2728("color1", this.Field12855);
        this.Method2728("color2", this.Field12856);
    }
    
    @NotNull
    @NotNull
    @Override
    public Class2125 Method2732() {
        final Class2027 method4389 = this.Method4389();
        final Class2027 method4390 = this.Method4390();
        final Class1975 class1975 = new Class1975(this);
        final Enum method4391 = this.Field12848.Method341();
        if (method4391 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        final Class2125 method4392 = class1975.Method7316(((Class786)method4391).Method3273()).Method7314(method4389, method4390).Method7315(this.Field12849.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)method4392, "DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return method4392;
    }
    
    @Override
    public void Method2733(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class1975 class1975) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class1975, "delegate");
        if (!this.Field12854.Method359().equals("None")) {
            final AxisAlignedBB method3447 = Class815.Method3447(axisAlignedBB);
            final Class2027 method3448 = this.Method4389();
            final Class2027 method3449 = this.Method4390();
            if (this.Field12854.Method359().equals("ReverseGlow")) {}
            Class815.Method3446(method3447, this.Field12849.Method368(), method3448, method3449, Class2008.Field17219);
            return;
        }
        class1975.Method7318();
    }
    
    private final Class2027 Method4389() {
        final String method359 = this.Field12854.Method359();
        int field17324 = this.Field12855.Method339().Field17324;
        if (method359.equals("ReverseGlow")) {
            field17324 = 0;
        }
        Class2027 class2027;
        if (this.Field12850.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(0, this.Field12852.Method335(), this.Field12853.Method335(), field17324, this.Field12851.Method367())), "RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field12855.Method339()), "color1.colour");
        }
        return class2027;
    }
    
    private final Class2027 Method4390() {
        final String method359 = this.Field12854.Method359();
        int field17324 = this.Field12856.Method339().Field17324;
        if (method359.equals("Glow")) {
            field17324 = 0;
        }
        Class2027 class2027;
        if (this.Field12850.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(50, this.Field12852.Method335(), this.Field12853.Method335(), field17324, this.Field12851.Method367())), "RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field12856.Method339()), "color2.colour");
        }
        return class2027;
    }
    
    public Class1087(@NotNull @NotNull final Class42 class42, @NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        Intrinsics.checkParameterIsNotNull((Object)s, "suffix");
        this.Field12847 = new Class1996(new Class44("Render " + s, class42));
        this.Field12848 = this.Field12847.Method7405(new Class44("Render Mode " + s, class42, Class786.Field11309));
        final Class1996 field12847 = this.Field12847;
        final Class44 method313 = new Class44("Render Line Width " + s, class42, 1.0, Double.longBitsToDouble(4591870180066957722L), Double.longBitsToDouble((long)1683352706 ^ 0x401400006455EC82L), false).Method313(new Class2139(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method313, "Setting(\"Render Line Wid\u2026odes.FilledGradient\n    }");
        this.Field12849 = field12847.Method7405(method313);
        this.Field12850 = this.Field12847.Method7405(new Class44("Rainbow " + s, class42, false));
        this.Field12851 = this.Field12847.Method7405(new Class44("RainbowSpeed " + s, class42, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble((long)1022239173 ^ 0x401400003CEE21C5L), false));
        final Class1996 field12848 = this.Field12847;
        final Class44 method314 = new Class44("Saturation " + s, class42, Double.longBitsToDouble((long)69590590 ^ 0x405900000425DE3EL), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313(new Class1856(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method314, "Setting(\"Saturation $suf\u2026sible{rainbow.valBoolean}");
        this.Field12852 = field12848.Method7405(method314);
        final Class1996 field12849 = this.Field12847;
        final Class44 method315 = new Class44("Brightness " + s, class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble((long)1185398164 ^ 0x4059000046A7BD94L), true).Method313(new Class822(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method315, "Setting(\"Brightness $suf\u2026sible{rainbow.valBoolean}");
        this.Field12853 = field12849.Method7405(method315);
        final Class1996 field12850 = this.Field12847;
        final Class44 method316 = new Class44("Glow " + s, class42, "None", CollectionsKt.listOf((Object[])new String[] { "None", "Glow", "ReverseGlow" })).Method313(new Class620(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method316, "Setting(\"Glow $suffix\", \u2026sible{rainbow.valBoolean}");
        this.Field12854 = field12850.Method7405(method316);
        this.Field12855 = this.Field12847.Method7405(new Class44("Render Color " + s, class42, "Render Color", new Class2027(255, 0, 0, 255)));
        final Class1996 field12851 = this.Field12847;
        final Class44 method317 = new Class44("Render Second Color " + s, class42, "Render Second Color", new Class2027(0, 120, 255, 255)).Method313(new Class1262(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method317, "Setting(\"Render Second C\u2026.Glow\n            )\n    }");
        this.Field12856 = field12851.Method7405(method317);
    }
    
    private static String Method4391(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2385 ^ 0xCC));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
