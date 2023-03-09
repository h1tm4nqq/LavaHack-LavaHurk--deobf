//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1178;
import lavahack.client.Class1783;
import lavahack.client.Class1831;
import lavahack.client.Class44;
import lavahack.client.Class88;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\n\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/util/render/customfont/CustomFontUtilKt$Companion;", "", "()V", "getAntiAlias", "", "getCustomFont", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "gui", "getFractionMetrics", "getHeight", "", "getMultiLineOffset", "getShadowX", "", "getShadowY", "getStringWidth", "text", "", "setAntiAlias", "", "antiAlias", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "offset", "kisman.cc"})
public final class Class780 {
    private String Field11293 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class88 Method3253(boolean bl) {
        return Class1178.Method4750().Method5712();
    }

    @NotNull
    @NotNull
    public final Class88 Method3254() {
        return this.Method3253(false);
    }

    public final int Method3255(@NotNull @NotNull String string, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        if (Class1831.Field16464) return this.Method3253(bl).Method757(string);
        return Minecraft.getMinecraft().fontRenderer.getStringWidth(string);
    }

    public final int Method3256(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        return this.Method3255(string, false);
    }

    public final int Method3257(boolean bl) {
        if (Class1831.Field16464) return this.Method3253(bl).Method747();
        return Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT;
    }

    public final int Method3258() {
        return this.Method3257(false);
    }

    public final void Method3259(boolean bl) {
        Class88 class88 = this.Method3254();
        class88.Method751(bl);
    }

    public final void Method3260(boolean bl) {
        Class88 class88 = this.Method3254();
        class88.Method750(bl);
    }

    public final boolean Method3261() {
        Class88 class88 = this.Method3254();
        return class88.Method753();
    }

    public final boolean Method3262() {
        Class88 class88 = this.Method3254();
        return class88.Method752();
    }

    public final double Method3263() {
        Class44 class44 = Class1783.Field16200.Method6746();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Changer.shadowTextModifier");
        if (!class44.Method365()) return 1.0;
        Class44 class442 = Class1783.Field16200.Method6747();
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Changer.shadowX");
        double d = class442.Method367();
        return d;
    }

    public final double Method3264() {
        Class44 class44 = Class1783.Field16200.Method6746();
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Changer.shadowTextModifier");
        if (!class44.Method365()) return 1.0;
        Class44 class442 = Class1783.Field16200.Method6748();
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Changer.shadowY");
        double d = class442.Method367();
        return d;
    }

    public final void Method3265(int n) {
        this.Method3254().Method756(n);
    }

    public final int Method3266() {
        return this.Method3254().Method755();
    }

    private Class780() {
    }

    public Class780(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method3267(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 205;
            cArray2[n] = (char)(cArray[n] ^ (0x1D5C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

