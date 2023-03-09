/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme
 *  kotlin.Metadata
 */
package lavahack.loader;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import kotlin.Metadata;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed"})
final class Class1385
implements ActionListener {
    public static final Class1385 Field14269 = new Class1385();
    private String Field14270 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        FlatMaterialDarkerIJTheme.updateUI();
    }

    Class1385() {
    }
}

