//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import javax.swing.border.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007?\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J:\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/loader/gui/components/RoundedBorder;", "Ljavax/swing/border/Border;", "radius", "", "color", "Ljava/awt/Color;", "thickness", "", "(ILjava/awt/Color;F)V", "getColor", "()Ljava/awt/Color;", "setColor", "(Ljava/awt/Color;)V", "getBorderInsets", "Ljava/awt/Insets;", "c", "Ljava/awt/Component;", "isBorderOpaque", "", "paintBorder", "", "component", "graphics", "Ljava/awt/Graphics;", "x", "y", "width", "height", "kisman.cc" })
public final class Class2166 implements Border
{
    private final int Field17906;
    @NotNull
    private Color Field17907;
    private final float Field17908;
    private String Field17909 = "TheKisDevs & LavaHack Development owns you";
    
    @NotNull
    @NotNull
    @Override
    public Insets getBorderInsets(@Nullable @Nullable final Component component) {
        return new Insets(this.Field17906 + 1, this.Field17906 + 1, this.Field17906 + 2, this.Field17906);
    }
    
    @Override
    public boolean isBorderOpaque() {
        return true;
    }
    
    @Override
    public void paintBorder(@Nullable @Nullable final Component component, @NotNull @NotNull final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        Intrinsics.checkParameterIsNotNull((Object)graphics, "graphics");
        final Graphics2D graphics2D = (Graphics2D)graphics;
        final Color color = ((Graphics2D)graphics).getColor();
        final Stroke stroke = ((Graphics2D)graphics).getStroke();
        ((Graphics2D)graphics).setColor(this.Field17907);
        ((Graphics2D)graphics).setStroke(new BasicStroke(this.Field17908));
        ((Graphics2D)graphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.drawRoundRect(n, n2, n3 - 1, n4 - 1, this.Field17906, this.Field17906);
        ((Graphics2D)graphics).setColor(color);
        ((Graphics2D)graphics).setStroke(stroke);
    }
    
    @NotNull
    @NotNull
    public final Color Method7806() {
        return this.Field17907;
    }
    
    public final void Method7807(@NotNull @NotNull final Color field17907) {
        Intrinsics.checkParameterIsNotNull((Object)field17907, "<set-?>");
        this.Field17907 = field17907;
    }
    
    public Class2166(final int field17906, @NotNull @NotNull final Color field17907, final float field17908) {
        Intrinsics.checkParameterIsNotNull((Object)field17907, "color");
        this.Field17906 = field17906;
        this.Field17907 = field17907;
        this.Field17908 = field17908;
    }
    
    private static String Method7808(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x74BD ^ 0xB7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
