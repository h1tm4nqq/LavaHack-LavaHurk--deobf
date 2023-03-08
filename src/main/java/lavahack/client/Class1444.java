//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.util.function.*;
import com.kisman.cc.util.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.awt.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005?\u0006\u0002\u0010\u0007J6\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eJ6\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020$J\u0006\u0010)\u001a\u00020\u0018R\u0019\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t?\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\t0\t?\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0013\u001a\n \n*\u0004\u0018\u00010\t0\t?\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016?\u0006*" }, d2 = { "Lcom/kisman/cc/settings/util/GlowRendererPattern;", "", "module", "Lcom/kisman/cc/features/module/Module;", "visible", "Ljava/util/function/Supplier;", "", "(Lcom/kisman/cc/features/module/Module;Ljava/util/function/Supplier;)V", "boxSize", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getBoxSize", "()Lcom/kisman/cc/settings/Setting;", "mode", "getMode", "getModule", "()Lcom/kisman/cc/features/module/Module;", "offset", "getOffset", "radius", "getRadius", "getVisible", "()Ljava/util/function/Supplier;", "draw", "", "ticks", "", "color", "Lcom/kisman/cc/util/Colour;", "x", "", "y", "width", "height", "drawRoundedRect", "startX", "", "startY", "endX", "endY", "Ljava/awt/Color;", "init", "kisman.cc" })
public final class Class1444
{
    private final Class44 Field14760;
    private final Class44 Field14761;
    private final Class44 Field14762;
    private final Class44 Field14763;
    @NotNull
    private final Class42 Field14764;
    @NotNull
    private final Supplier Field14765;
    private String Field14766 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final Class44 Method5757() {
        return this.Field14760;
    }
    
    public final Class44 Method5758() {
        return this.Field14761;
    }
    
    public final Class44 Method5759() {
        return this.Field14762;
    }
    
    public final Class44 Method5760() {
        return this.Field14763;
    }
    
    public final void Method5761() {
        this.Field14764.Method23(this.Field14760);
        this.Field14764.Method23(this.Field14761);
        this.Field14764.Method23(this.Field14762);
        this.Field14764.Method23(this.Field14763);
    }
    
    public final void Method5762(final float n, @NotNull @NotNull final Class2027 class2027, final int n2, final int n3, final int n4, final int n5) {
        Intrinsics.checkParameterIsNotNull((Object)class2027, "color");
        final Class44 field14760 = this.Field14760;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14760, "mode");
        final Enum method341 = field14760.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.GlowModes");
        }
        switch (Class1454.Field14807[((Class55)method341).ordinal()]) {
            case 1: {
                final Class44 field14761 = this.Field14761;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14761, "this.offset");
                final int method342 = field14761.Method335();
                Class753.drawGlow(n2, n3 - method342, n2 + n4, n3 + n5 + method342, class2027.Method3626());
                break;
            }
            case 2: {
                final double n6 = n2 / 2;
                final double n7 = n3 / 2;
                final double n8 = (n2 + n4) / 2;
                final double n9 = (n3 + n5) / 2;
                final Color method343 = class2027.Method3625();
                Intrinsics.checkExpressionValueIsNotNull((Object)method343, "color.color");
                final Class44 field14762 = this.Field14763;
                Intrinsics.checkExpressionValueIsNotNull((Object)field14762, "boxSize");
                this.Method5763(n6, n7, n8, n9, method343, field14762.Method367());
                break;
            }
        }
    }
    
    public final void Method5763(final double n, final double n2, final double n3, final double n4, @NotNull @NotNull final Color color, final double n5) {
        Intrinsics.checkParameterIsNotNull((Object)color, "color");
        final double n6 = (float)n - n5;
        final double n7 = (float)n2 - n5;
        final double n8 = (float)n3 + n5;
        final double n9 = (float)n4 + n5;
        final int rgb = color.getRGB();
        final Class44 field14762 = this.Field14762;
        Intrinsics.checkExpressionValueIsNotNull((Object)field14762, "this.radius");
        Class753.drawRoundedRect(n6, n7, n8, n9, rgb, field14762.Method368());
    }
    
    @NotNull
    @NotNull
    public final Class42 Method5764() {
        return this.Field14764;
    }
    
    @NotNull
    @NotNull
    public final Supplier Method5765() {
        return this.Field14765;
    }
    
    public Class1444(@NotNull @NotNull final Class42 field14764, @NotNull @NotNull final Supplier field14765) {
        Intrinsics.checkParameterIsNotNull((Object)field14764, "module");
        Intrinsics.checkParameterIsNotNull((Object)field14765, "visible");
        this.Field14764 = field14764;
        this.Field14765 = field14765;
        this.Field14760 = new Class44("Glow Mode", this.Field14764, Class55.Field8170).Method313(new Class360(this));
        this.Field14761 = new Class44("Glow Offset", this.Field14764, Double.longBitsToDouble(4618441417868443648L), 1.0, Double.longBitsToDouble(4626322717216342016L), true).Method313(new Class1721(this));
        this.Field14762 = new Class44("Glow Radius", this.Field14764, Double.longBitsToDouble((long)336089453 ^ 0x402E00001408516DL), 0.0, Double.longBitsToDouble(4626322717216342016L), true).Method313(new Class738(this));
        this.Field14763 = new Class44("Glow Box Size", this.Field14764, 0.0, 0.0, Double.longBitsToDouble(4626322717216342016L), true).Method313(new Class938(this));
    }
    
    private static String Method5766(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x18E8 ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
