//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\n?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/util/render/customfont/CustomFontUtilKt$Companion;", "", "()V", "getAntiAlias", "", "getCustomFont", "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "gui", "getFractionMetrics", "getHeight", "", "getMultiLineOffset", "getShadowX", "", "getShadowY", "getStringWidth", "text", "", "setAntiAlias", "", "antiAlias", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "offset", "kisman.cc" })
public final class Class780
{
    private String Field11293 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class88 Method3253(final boolean b) {
        return Class1178.Method4750().Method5712();
    }
    
    @NotNull
    @NotNull
    public final Class88 Method3254() {
        return this.Method3253(false);
    }
    
    public final int Method3255(@NotNull @NotNull final String s, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        if (!Class1831.Field16464) {
            return Minecraft.getMinecraft().fontRenderer.getStringWidth(s);
        }
        return this.Method3253(b).Method757(s);
    }
    
    public final int Method3256(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        return this.Method3255(s, false);
    }
    
    public final int Method3257(final boolean b) {
        if (!Class1831.Field16464) {
            return Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT;
        }
        return this.Method3253(b).Method747();
    }
    
    public final int Method3258() {
        return this.Method3257(false);
    }
    
    public final void Method3259(final boolean b) {
        this.Method3254().Method751(b);
    }
    
    public final void Method3260(final boolean b) {
        this.Method3254().Method750(b);
    }
    
    public final boolean Method3261() {
        return this.Method3254().Method753();
    }
    
    public final boolean Method3262() {
        return this.Method3254().Method752();
    }
    
    public final double Method3263() {
        final Class44 method6746 = Class1783.Field16200.Method6746();
        Intrinsics.checkExpressionValueIsNotNull((Object)method6746, "Changer.shadowTextModifier");
        double method6748;
        if (method6746.Method365()) {
            final Class44 method6747 = Class1783.Field16200.Method6747();
            Intrinsics.checkExpressionValueIsNotNull((Object)method6747, "Changer.shadowX");
            method6748 = method6747.Method367();
        }
        else {
            method6748 = 1.0;
        }
        return method6748;
    }
    
    public final double Method3264() {
        final Class44 method6746 = Class1783.Field16200.Method6746();
        Intrinsics.checkExpressionValueIsNotNull((Object)method6746, "Changer.shadowTextModifier");
        double method6748;
        if (method6746.Method365()) {
            final Class44 method6747 = Class1783.Field16200.Method6748();
            Intrinsics.checkExpressionValueIsNotNull((Object)method6747, "Changer.shadowY");
            method6748 = method6747.Method367();
        }
        else {
            method6748 = 1.0;
        }
        return method6748;
    }
    
    public final void Method3265(final int n) {
        this.Method3254().Method756(n);
    }
    
    public final int Method3266() {
        return this.Method3254().Method755();
    }
    
    private Class780() {
    }
    
    public Class780(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    private static String Method3267(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1D5C ^ 0xCD));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
