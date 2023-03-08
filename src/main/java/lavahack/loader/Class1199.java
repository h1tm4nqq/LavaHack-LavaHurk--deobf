//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import javax.swing.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B-\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b?\u0006\u0002\u0010\nR\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u0004?\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00028\u0001X\u0082\u0004?\u0006\u0004\n\u0002\u0010\u000b?\u0006\f" }, d2 = { "Lcom/kisman/cc/loader/gui/components/ComponentsPair;", "K", "Ljavax/swing/JComponent;", "V", "Ljavax/swing/JPanel;", "first", "second", "width", "", "height", "(Ljavax/swing/JComponent;Ljavax/swing/JComponent;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljavax/swing/JComponent;", "kisman.cc" })
public final class Class1199 extends JPanel
{
    private final JComponent Field13441;
    private final JComponent Field13442;
    private String Field13443 = "TheKisDevs & LavaHack Development owns you";
    
    public Class1199(@NotNull @NotNull final JComponent field13441, @NotNull @NotNull final JComponent field13442, @Nullable @Nullable final Integer n, @Nullable @Nullable final Integer n2) {
        Intrinsics.checkParameterIsNotNull((Object)field13441, "first");
        Intrinsics.checkParameterIsNotNull((Object)field13442, "second");
        this.Field13441 = field13441;
        this.Field13442 = field13442;
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension((n != null) ? n : this.getPreferredSize().width, (n2 != null) ? n2 : this.getPreferredSize().height));
        this.add(this.Field13441, "West");
        this.add(this.Field13442, "East");
    }
    
    public Class1199(final JComponent component, final JComponent component2, Integer n, Integer n2, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x4) != 0x0) {
            n = null;
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = null;
        }
        this(component, component2, n, n2);
    }
    
    private static String Method4830(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x789 ^ 0x3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
