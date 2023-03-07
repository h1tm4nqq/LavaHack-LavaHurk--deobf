/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.border.Border;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J:\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/loader/gui/components/RoundedBorder;", "Ljavax/swing/border/Border;", "radius", "", "color", "Ljava/awt/Color;", "thickness", "", "(ILjava/awt/Color;F)V", "getColor", "()Ljava/awt/Color;", "setColor", "(Ljava/awt/Color;)V", "getBorderInsets", "Ljava/awt/Insets;", "c", "Ljava/awt/Component;", "isBorderOpaque", "", "paintBorder", "", "component", "graphics", "Ljava/awt/Graphics;", "x", "y", "width", "height", "kisman.cc"})
public final class JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm
implements Border {
    private final int Field17906;
    @NotNull
    private Color Field17907;
    private final float Field17908;
    private String Field17909 = "TheKisDevs & LavaHack Development owns you";

    @Override
    @NotNull
    @NotNull
    public Insets getBorderInsets(@Nullable @Nullable Component component) {
        return new Insets(this.Field17906 + (int)((long)-1951487379 ^ (long)-1951487380), this.Field17906 + ((int)778434528L ^ 0x2E65F7E1), this.Field17906 + ((int)((long)2042465285 ^ (long)2042465284) << 1), this.Field17906);
    }

    @Override
    public boolean isBorderOpaque() {
        return ((int)-103488495L ^ 0xF9D4E410) != 0;
    }

    @Override
    public void paintBorder(@Nullable @Nullable Component component, @NotNull @NotNull Graphics graphics, int n, int n2, int n3, int n4) {
        Intrinsics.checkParameterIsNotNull((Object)graphics, (String)"graphics");
        Graphics2D cfr_ignored_0 = (Graphics2D)graphics;
        Color color = ((Graphics2D)graphics).getColor();
        Stroke stroke = ((Graphics2D)graphics).getStroke();
        ((Graphics2D)graphics).setColor(this.Field17907);
        ((Graphics2D)graphics).setStroke(new BasicStroke(this.Field17908));
        ((Graphics2D)graphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.drawRoundRect(n, n2, n3 - ((int)951121498L ^ 0x38B0F65B), n4 - ((int)348943021L ^ 0x14CC72AC), this.Field17906, this.Field17906);
        ((Graphics2D)graphics).setColor(color);
        ((Graphics2D)graphics).setStroke(stroke);
    }

    @NotNull
    @NotNull
    public final Color Method7806() {
        return this.Field17907;
    }

    public final void Method7807(@NotNull @NotNull Color color) {
        Intrinsics.checkParameterIsNotNull((Object)color, (String)"<set-?>");
        this.Field17907 = color;
    }

    public JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm(int n, @NotNull @NotNull Color color, float f) {
        Intrinsics.checkParameterIsNotNull((Object)color, (String)"color");
        this.Field17906 = n;
        this.Field17907 = color;
        this.Field17908 = f;
    }

    private static String Method7808(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-220577281L ^ 0xF2DA41FF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1100379356 ^ (long)1100379171);
            int n2 = (int)1107582735L ^ 0x42045FB8;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1533705786L ^ 0xA495F57B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

