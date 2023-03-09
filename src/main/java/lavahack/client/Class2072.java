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
import lavahack.client.Class110;
import lavahack.client.Class1283;
import lavahack.client.Class1581;
import lavahack.client.Class1620;
import lavahack.client.Class1933;
import lavahack.client.Class1975;
import lavahack.client.Class1996;
import lavahack.client.Class2008;
import lavahack.client.Class2125;
import lavahack.client.Class224;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class786;
import lavahack.client.Class815;
import net.minecraft.util.math.AxisAlignedBB;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u001dH\u0002J\b\u0010\n\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0014J\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\b\u00a8\u0006'"}, d2={"Lcom/kisman/cc/util/render/cubic/ModuleRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc"})
public final class Class2072
extends Class1283 {
    @NotNull
    private final Class1996 Field17474;
    @NotNull
    private final Class44 Field17475;
    @NotNull
    private final Class44 Field17476;
    @NotNull
    private final Class44 Field17477;
    @NotNull
    private final Class44 Field17478;
    @NotNull
    private final Class44 Field17479;
    @NotNull
    private final Class44 Field17480;
    @NotNull
    private final Class44 Field17481;
    @NotNull
    private final Class44 Field17482;
    @NotNull
    private final Class44 Field17483;
    private int Field17484;

    @NotNull
    @NotNull
    public final Class1996 Method7602() {
        return this.Field17474;
    }

    @NotNull
    @NotNull
    public final Class44 Method7603() {
        return this.Field17475;
    }

    @NotNull
    @NotNull
    public final Class44 Method7604() {
        return this.Field17476;
    }

    @NotNull
    @NotNull
    public final Class44 Method7605() {
        return this.Field17477;
    }

    @NotNull
    @NotNull
    public final Class44 Method7606() {
        return this.Field17478;
    }

    @NotNull
    @NotNull
    public final Class44 Method7607() {
        return this.Field17479;
    }

    @NotNull
    @NotNull
    public final Class44 Method7608() {
        return this.Field17480;
    }

    @NotNull
    @NotNull
    public final Class44 Method7609() {
        return this.Field17481;
    }

    @NotNull
    @NotNull
    public final Class44 Method7610() {
        return this.Field17482;
    }

    @NotNull
    @NotNull
    public final Class44 Method7611() {
        return this.Field17483;
    }

    @Override
    protected void Method2730() {
        this.Method2728("group", this.Field17474);
        this.Method2728("mode", this.Field17475);
        this.Method2728("lineWidth", this.Field17476);
        this.Method2728("rainbow", this.Field17477);
        this.Method2728("rainbowSpeed", this.Field17478);
        this.Method2728("rainbowSat", this.Field17479);
        this.Method2728("rainbowBright", this.Field17480);
        this.Method2728("rainbowGlow", this.Field17481);
        this.Method2728("color1", this.Field17482);
        this.Method2728("color2", this.Field17483);
    }

    @Override
    @NotNull
    @NotNull
    public Class2125 Method2732() {
        Class2027 class2027 = this.Method7612();
        Class2027 class20272 = this.Method7613();
        Enum enum_ = this.Field17475.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        Class2125 class2125 = new Class1975(this).Method7316(((Class786)enum_).Method3273()).Method7314(class2027, class20272).Method7315(this.Field17476.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)class2125, (String)"DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return class2125;
    }

    @Override
    public void Method2733(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull Class1975 class1975) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)class1975, (String)"delegate");
        if (this.Field17481.Method359().equals("None")) {
            class1975.Method7318();
            return;
        }
        AxisAlignedBB axisAlignedBB2 = Class815.Method3447(axisAlignedBB);
        Class2027 class2027 = this.Method7612();
        Class2027 class20272 = this.Method7613();
        int n = 255;
        int n2 = 255;
        boolean bl = this.Field17481.Method359().equals("ReverseGlow");
        if (bl) {
            n = 0;
        } else {
            n2 = 0;
        }
        Class815.Method3446(axisAlignedBB2, this.Field17476.Method368(), class2027, class20272, Class2008.Field17219);
    }

    private final Class2027 Method7612() {
        Class2027 class2027;
        String string = this.Field17481.Method359();
        int n = this.Field17482.Method339().Field17324;
        if (string.equals("ReverseGlow")) {
            n = 0;
        }
        if (this.Field17477.Method365()) {
            Class2027 class20272 = Class845.Method3579(0, this.Field17479.Method335(), this.Field17480.Method335(), n, this.Field17478.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field17482.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"color1.colour");
        return class2027;
    }

    private final Class2027 Method7613() {
        Class2027 class2027;
        String string = this.Field17481.Method359();
        int n = this.Field17483.Method339().Field17324;
        if (string.equals("Glow")) {
            n = 0;
        }
        if (this.Field17477.Method365()) {
            Class2027 class20272 = Class845.Method3579(50, this.Field17479.Method335(), this.Field17480.Method335(), n, this.Field17478.Method367());
            class2027 = class20272;
            Intrinsics.checkExpressionValueIsNotNull((Object)class20272, (String)"RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
            return class2027;
        }
        Class2027 class20273 = this.Field17483.Method339();
        class2027 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"color2.colour");
        return class2027;
    }

    public Class2072(@NotNull @NotNull Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        this.Field17474 = new Class1996(new Class44("Render", class42));
        this.Field17475 = this.Field17474.Method7405(new Class44("Render Mode", class42, Class786.Field11309));
        Class44 class44 = new Class44("Render Line Width", class42, 1.0, Double.longBitsToDouble((long)1423522019 ^ 0x3FB99999CD40A179L), Double.longBitsToDouble(0x4014000000000000L), false).Method313(new Class224(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Render Line Wid\u2026odes.FilledGradient\n    }");
        this.Field17476 = this.Field17474.Method7405(class44);
        this.Field17477 = this.Field17474.Method7405(new Class44("Rainbow", class42, false));
        this.Field17478 = this.Field17474.Method7405(new Class44("RainbowSpeed", class42, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble(0x4014000000000000L), false));
        Class44 class442 = new Class44("Saturation", class42, Double.longBitsToDouble((long)516052103 ^ 0x405900001EC25487L), 0.0, Double.longBitsToDouble((long)528253246 ^ 0x405900001F7C813EL), true).Method313(new Class1620(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Saturation\", mo\u2026sible{rainbow.valBoolean}");
        this.Field17479 = this.Field17474.Method7405(class442);
        Class44 class443 = new Class44("Brightness", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313(new Class1581(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Brightness\", mo\u2026sible{rainbow.valBoolean}");
        this.Field17480 = this.Field17474.Method7405(class443);
        Class44 class444 = new Class44("Glow", class42, "None", CollectionsKt.listOf((Object[])new String[]{"None", "Glow", "ReverseGlow"})).Method313(new Class110(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Glow\", module, \u2026sible{rainbow.valBoolean}");
        this.Field17481 = this.Field17474.Method7405(class444);
        this.Field17482 = this.Field17474.Method7405(new Class44("Render Color", class42, "Render Color", new Class2027(255, 0, 0, 255)));
        Class44 class445 = new Class44("Render Second Color", class42, "Render Second Color", new Class2027(0, 120, 255, 255)).Method313(new Class1933(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Render Second C\u2026w\n                )\n    }");
        this.Field17483 = this.Field17474.Method7405(class445);
    }

    private static String Method7614(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0x650B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

