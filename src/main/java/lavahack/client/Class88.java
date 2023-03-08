//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J3\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&?\u0006\u0002\u0010\u0013J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH&J(\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bH&J0\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH&J(\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u001c\u001a\u00020\u001aH&J\b\u0010\u001d\u001a\u00020\u001aH&J\b\u0010\u001e\u001a\u00020\u000bH&J\b\u0010\u001f\u001a\u00020\u000bH&J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001aH&J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H&J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u001aH&J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u000bH&?\u0006+" }, d2 = { "Lcom/kisman/cc/util/render/customfont/AbstractFontRenderer;", "", "()V", "drawCenteredString", "", "text", "", "x", "", "y", "color", "", "drawCenteredStringWithShadow", "drawChar", "data", "", "Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;", "c", "", "([Lcom/kisman/cc/util/render/customfont/CustomFont$CharData;CFF)V", "drawLine", "x1", "y1", "drawString", "", "shadow", "", "drawStringWithShadow", "getAntiAlias", "getFractionMetrics", "getHeight", "getMultiLineOffset", "getStringHeight", "getStringWidth", "setAntiAlias", "antiAlias", "setFont", "font", "Ljava/awt/Font;", "setFractionalMetrics", "fractionalMetrics", "setMultiLineOffset", "offset", "kisman.cc" })
public abstract class Class88
{
    private String Field8300 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public abstract void Method746(@NotNull @NotNull final Class2034[] p0, final char p1, final float p2, final float p3) throws ArrayIndexOutOfBoundsException;
    
    public abstract int Method747();
    
    public abstract void Method748(@NotNull @NotNull final String p0, final int p1, final int p2, final int p3);
    
    public abstract void Method749(final int p0, final int p1, final int p2, final int p3);
    
    public abstract void Method750(final boolean p0);
    
    public abstract void Method751(final boolean p0);
    
    public abstract boolean Method752();
    
    public abstract boolean Method753();
    
    public abstract void Method754(@NotNull @NotNull final Font p0);
    
    public abstract int Method755();
    
    public abstract void Method756(final int p0);
    
    public abstract int Method757(@NotNull @NotNull final String p0);
    
    public abstract int Method758(@NotNull @NotNull final String p0);
    
    public abstract float Method759(@NotNull @NotNull final String p0, final double p1, final double p2, final int p3, final boolean p4);
    
    public abstract float Method760(@NotNull @NotNull final String p0, final double p1, final double p2, final int p3);
    
    public abstract void Method761(@NotNull @NotNull final String p0, final float p1, final float p2, final int p3);
    
    public abstract void Method762(@NotNull @NotNull final String p0, final float p1, final float p2, final int p3);
}
