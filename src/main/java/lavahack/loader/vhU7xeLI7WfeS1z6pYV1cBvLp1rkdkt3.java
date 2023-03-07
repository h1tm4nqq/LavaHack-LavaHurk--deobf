/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B-\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nR\u0010\u0010\u0005\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00028\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/loader/gui/components/ComponentsPair;", "K", "Ljavax/swing/JComponent;", "V", "Ljavax/swing/JPanel;", "first", "second", "width", "", "height", "(Ljavax/swing/JComponent;Ljavax/swing/JComponent;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljavax/swing/JComponent;", "kisman.cc"})
public final class vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3
extends JPanel {
    private final JComponent Field13441;
    private final JComponent Field13442;
    private String Field13443 = "TheKisDevs & LavaHack Development owns you";

    public vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3(@NotNull @NotNull JComponent jComponent, @NotNull @NotNull JComponent jComponent2, @Nullable @Nullable Integer n, @Nullable @Nullable Integer n2) {
        Intrinsics.checkParameterIsNotNull((Object)jComponent, (String)"first");
        Intrinsics.checkParameterIsNotNull((Object)jComponent2, (String)"second");
        this.Field13441 = jComponent;
        this.Field13442 = jComponent2;
        this.setLayout(new BorderLayout());
        Integer n3 = n;
        Integer n4 = n2;
        this.setPreferredSize(new Dimension(n3 != null ? n3 : this.getPreferredSize().width, n4 != null ? n4 : this.getPreferredSize().height));
        this.add((Component)this.Field13441, "West");
        this.add((Component)this.Field13442, "East");
    }

    public vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3(JComponent jComponent, JComponent jComponent2, Integer n, Integer n2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & (int)((long)847829239 ^ (long)847829238) << 2) != 0) {
            n = null;
        }
        if ((n3 & ((int)-1563333379L ^ 0xA2D16CFC) << 3) != 0) {
            n2 = null;
        }
        this(jComponent, jComponent2, n, n2);
    }

    private static String Method4830(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1167699229L ^ 0xBA6652E3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-194787278L ^ 0xF463C8CD);
            int n2 = (int)1488032039L ^ 0x58B19124;
            cArray2[n] = (char)(cArray[n] ^ ((int)-582401350L ^ 0xDD494533 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

