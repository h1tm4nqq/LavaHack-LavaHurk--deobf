/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class845;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class105;
import lavahack.client.Class1060;
import lavahack.client.Class1283;
import lavahack.client.Class1730;
import lavahack.client.Class1975;
import lavahack.client.Class1996;
import lavahack.client.Class2008;
import lavahack.client.Class2041;
import lavahack.client.Class2125;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class72;
import lavahack.client.Class786;
import lavahack.client.Class815;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u001fH\u0002J\b\u0010\f\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\n\u00a8\u0006)"}, d2={"Lcom/kisman/cc/util/render/cubic/ModulePrefixRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "prefix", "", "(Lcom/kisman/cc/features/module/Module;Ljava/lang/String;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc"})
public final class Class631
extends Class1283 {
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

    @Override
    protected void Method2730() {
        this.Method2728("group", this.Field10690);
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

    @Override
    @NotNull
    @NotNull
    public Class2125 Method2732() {
        Class2027 class2027 = this.Method2744();
        Class2027 class20272 = this.Method2745();
        Enum enum_ = this.Field10691.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        Class2125 class2125 = new Class1975(this).Method7316(((Class786)enum_).Method3273()).Method7314(class2027, class20272).Method7315(this.Field10692.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)class2125, (String)"DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return class2125;
    }

    @Override
    public void Method2733(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class1975 class1975) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class1975, (String)"delegate");
        if (this.Field10697.Method359().equals("None")) {
            class1975.Method7318();
            return;
        }
        AxisAlignedBB axisAlignedBB2 = Class815.Method3447(axisAlignedBB);
        Class2027 class2027 = this.Method2744();
        Class2027 class20272 = this.Method2745();
        int n = 255;
        int n2 = 255;
        boolean bl = this.Field10697.Method359().equals("ReverseGlow");
        if (bl) {
            n = 0;
        } else {
            n2 = 0;
        }
        Class815.Method3446(axisAlignedBB2, this.Field10692.Method368(), class2027, class20272, Class2008.Field17219);
    }

    private final Class2027 Method2744() {
        Class2027 class2027;
        String string = this.Field10697.Method359();
        int n = this.Field10698.Method339().Field17324;
        if (string.equals("ReverseGlow")) {
            n = 0;
        }
        if (this.Field10693.Method365()) {
            Class2027 class20272 = Class845.Method3579(0, this.Field10695.Method335(), this.Field10696.Method335(), n, this.Field10694.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field10698.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"color1.colour");
        return class2027;
    }

    private final Class2027 Method2745() {
        Class2027 class2027;
        String string = this.Field10697.Method359();
        int n = this.Field10699.Method339().Field17324;
        if (string.equals("Glow")) {
            n = 0;
        }
        if (this.Field10693.Method365()) {
            Class2027 class20272 = Class845.Method3579(50, this.Field10695.Method335(), this.Field10696.Method335(), n, this.Field10694.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field10699.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"color2.colour");
        return class2027;
    }

    public Class631(@NotNull @NotNull Class42 class42, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        this.Field10690 = new Class1996(new Class44(string, class42));
        this.Field10691 = this.Field10690.Method7405(new Class44(string + "Render Mode", class42, Class786.Field11309));
        Class44 class44 = new Class44(string + "Render Line Width", class42, 1.0, Double.longBitsToDouble((long)2133887238 ^ 0x3FB99999E6A9109CL), Double.longBitsToDouble(0x4014000000000000L), false).Method313(new Class2041(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(prefix + \"Render\u2026odes.FilledGradient\n    }");
        this.Field10692 = this.Field10690.Method7405(class44);
        this.Field10693 = this.Field10690.Method7405(new Class44(string + " Rainbow", class42, false));
        this.Field10694 = this.Field10690.Method7405(new Class44(string + " RainbowSpeed", class42, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble(0x4014000000000000L), false));
        Class44 class442 = new Class44(string + " Saturation", class42, Double.longBitsToDouble((long)1710940075 ^ 0x4059000065FADFABL), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313(new Class1730(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"$prefix Saturat\u2026sible{rainbow.valBoolean}");
        this.Field10695 = this.Field10690.Method7405(class442);
        Class44 class443 = new Class44(string + " Brightness", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313(new Class105(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"$prefix Brightn\u2026sible{rainbow.valBoolean}");
        this.Field10696 = this.Field10690.Method7405(class443);
        Class44 class444 = new Class44(string + "  Glow", class42, "None", CollectionsKt.listOf((Object[])new String[]{"None", "Glow", "ReverseGlow"})).Method313(new Class1060(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"$prefix  Glow\",\u2026sible{rainbow.valBoolean}");
        this.Field10697 = this.Field10690.Method7405(class444);
        this.Field10698 = this.Field10690.Method7405(new Class44(string + "Render Color", class42, "Render Color", new Class2027(255, 0, 0, 255)));
        Class44 class445 = new Class44(string + "Render Second Color", class42, "Render Second Color", new Class2027(0, 120, 255, 255)).Method313(new Class72(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(prefix + \"Render\u2026.Glow\n            )\n    }");
        this.Field10699 = this.Field10690.Method7405(class445);
    }

    private static String Method2746(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 170;
            cArray2[n] = (char)(cArray[n] ^ (0x7046 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

