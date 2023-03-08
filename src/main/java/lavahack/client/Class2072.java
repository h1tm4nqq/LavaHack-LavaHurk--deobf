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

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u001dH\u0002J\b\u0010\n\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0014J\u0018\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0017\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u0019\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u0006?\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\b?\u0006'" }, d2 = { "Lcom/kisman/cc/util/render/cubic/ModuleRenderPattern;", "Lcom/kisman/cc/util/render/cubic/DelegateRenderPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "color1", "Lcom/kisman/cc/settings/Setting;", "getColor1", "()Lcom/kisman/cc/settings/Setting;", "color2", "getColor2", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "getGroup", "()Lcom/kisman/cc/settings/types/SettingGroup;", "lineWidth", "getLineWidth", "mode", "getMode", "rainbow", "getRainbow", "rainbowBright", "getRainbowBright", "rainbowGlow", "getRainbowGlow", "rainbowSat", "getRainbowSat", "rainbowSpeed", "getRainbowSpeed", "Lcom/kisman/cc/util/Colour;", "getRenderBuilder", "Lcom/kisman/cc/util/render/cubic/RenderBuilder;", "initialize", "", "render", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "delegate", "Lcom/kisman/cc/util/render/cubic/DelegateRenderBuilder;", "kisman.cc" })
public final class Class2072 extends Class1283
{
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
    
    protected void Method2730() {
        this.Method2728("group", (Class44)this.Field17474);
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
    
    @NotNull
    @NotNull
    public Class2125 Method2732() {
        final Class2027 method7612 = this.Method7612();
        final Class2027 method7613 = this.Method7613();
        final Class1975 class1975 = new Class1975((Class1283)this);
        final Enum method7614 = this.Field17475.Method341();
        if (method7614 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        final Class2125 method7615 = class1975.Method7316(((Class786)method7614).Method3273()).Method7314(method7612, method7613).Method7315(this.Field17476.Method368());
        Intrinsics.checkExpressionValueIsNotNull((Object)method7615, "DelegateRenderBuilder(th\u2026Width(lineWidth.valFloat)");
        return method7615;
    }
    
    public void Method2733(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, @NotNull @NotNull final Class1975 class1975) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "aabb");
        Intrinsics.checkParameterIsNotNull((Object)class1975, "delegate");
        if (!this.Field17481.Method359().equals("None")) {
            final AxisAlignedBB method3447 = Class815.Method3447(axisAlignedBB);
            final Class2027 method3448 = this.Method7612();
            final Class2027 method3449 = this.Method7613();
            if (this.Field17481.Method359().equals("ReverseGlow")) {}
            Class815.Method3446(method3447, this.Field17476.Method368(), method3448, method3449, Class2008.Field17219);
            return;
        }
        class1975.Method7318();
    }
    
    private final Class2027 Method7612() {
        final String method359 = this.Field17481.Method359();
        int field17324 = this.Field17482.Method339().Field17324;
        if (method359.equals("ReverseGlow")) {
            field17324 = 0;
        }
        Class2027 class2027;
        if (this.Field17477.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(0, this.Field17479.Method335(), this.Field17480.Method335(), field17324, this.Field17478.Method367())), "RainbowUtil.rainbow2(0, \u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field17482.Method339()), "color1.colour");
        }
        return class2027;
    }
    
    private final Class2027 Method7613() {
        final String method359 = this.Field17481.Method359();
        int field17324 = this.Field17483.Method339().Field17324;
        if (method359.equals("Glow")) {
            field17324 = 0;
        }
        Class2027 class2027;
        if (this.Field17477.Method365()) {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = Class845.Method3579(50, this.Field17479.Method335(), this.Field17480.Method335(), field17324, this.Field17478.Method367())), "RainbowUtil.rainbow2(50,\u2026, rainbowSpeed.valDouble)");
        }
        else {
            Intrinsics.checkExpressionValueIsNotNull((Object)(class2027 = this.Field17483.Method339()), "color2.colour");
        }
        return class2027;
    }
    
    public Class2072(@NotNull @NotNull final Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        this.Field17474 = new Class1996(new Class44("Render", class42));
        this.Field17475 = this.Field17474.Method7405(new Class44("Render Mode", class42, Class786.Field11309));
        final Class1996 field17474 = this.Field17474;
        final Class44 method313 = new Class44("Render Line Width", class42, 1.0, Double.longBitsToDouble((long)1423522019 ^ 0x3FB99999CD40A179L), Double.longBitsToDouble(4617315517961601024L), false).Method313(new Class224(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method313, "Setting(\"Render Line Wid\u2026odes.FilledGradient\n    }");
        this.Field17476 = field17474.Method7405(method313);
        this.Field17477 = this.Field17474.Method7405(new Class44("Rainbow", class42, false));
        this.Field17478 = this.Field17474.Method7405(new Class44("RainbowSpeed", class42, 1.0, Double.longBitsToDouble(4598175219545276416L), Double.longBitsToDouble(4617315517961601024L), false));
        final Class1996 field17475 = this.Field17474;
        final Class44 method314 = new Class44("Saturation", class42, Double.longBitsToDouble((long)516052103 ^ 0x405900001EC25487L), 0.0, Double.longBitsToDouble((long)528253246 ^ 0x405900001F7C813EL), true).Method313((Supplier)new Class1620(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method314, "Setting(\"Saturation\", mo\u2026sible{rainbow.valBoolean}");
        this.Field17479 = field17475.Method7405(method314);
        final Class1996 field17476 = this.Field17474;
        final Class44 method315 = new Class44("Brightness", class42, Double.longBitsToDouble(4636737291354636288L), 0.0, Double.longBitsToDouble(4636737291354636288L), true).Method313((Supplier)new Class1581(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method315, "Setting(\"Brightness\", mo\u2026sible{rainbow.valBoolean}");
        this.Field17480 = field17476.Method7405(method315);
        final Class1996 field17477 = this.Field17474;
        final Class44 method316 = new Class44("Glow", class42, "None", CollectionsKt.listOf((Object[])new String[] { "None", "Glow", "ReverseGlow" })).Method313((Supplier)new Class110(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method316, "Setting(\"Glow\", module, \u2026sible{rainbow.valBoolean}");
        this.Field17481 = field17477.Method7405(method316);
        this.Field17482 = this.Field17474.Method7405(new Class44("Render Color", class42, "Render Color", new Class2027(255, 0, 0, 255)));
        final Class1996 field17478 = this.Field17474;
        final Class44 method317 = new Class44("Render Second Color", class42, "Render Second Color", new Class2027(0, 120, 255, 255)).Method313((Supplier)new Class1933(this));
        Intrinsics.checkExpressionValueIsNotNull((Object)method317, "Setting(\"Render Second C\u2026w\n                )\n    }");
        this.Field17483 = field17478.Method7405(method317);
    }
    
    private static String Method7614(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x650B ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
