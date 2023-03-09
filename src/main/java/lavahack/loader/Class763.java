/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.formdev.flatlaf.FlatLaf
 *  com.formdev.flatlaf.intellijthemes.FlatAllIJThemes
 *  com.formdev.flatlaf.intellijthemes.FlatAllIJThemes$FlatIJLookAndFeelInfo
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.intellijthemes.FlatAllIJThemes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;
import javax.swing.JComboBox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed"})
final class Class763
implements ActionListener {
    final JComboBox Field11231;
    private String Field11232 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        Intrinsics.checkExpressionValueIsNotNull((Object)FlatAllIJThemes.INFOS, (String)"FlatAllIJThemes.INFOS");
        FlatAllIJThemes.FlatIJLookAndFeelInfo[] flatIJLookAndFeelInfoArray = FlatAllIJThemes.INFOS;
        boolean bl = false;
        FlatAllIJThemes.FlatIJLookAndFeelInfo[] flatIJLookAndFeelInfoArray2 = flatIJLookAndFeelInfoArray;
        int n = flatIJLookAndFeelInfoArray2.length;
        int n2 = 0;
        while (n2 < n) {
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo;
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo2 = flatIJLookAndFeelInfo = flatIJLookAndFeelInfoArray2[n2];
            boolean bl2 = false;
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo3 = flatIJLookAndFeelInfo2;
            Intrinsics.checkExpressionValueIsNotNull((Object)flatIJLookAndFeelInfo3, (String)"it");
            Object object = this.Field11231.getSelectedItem();
            Object object2 = object;
            if (object == null) return;
            String string = object2.toString();
            object2 = string;
            if (string == null) return;
            if (Intrinsics.areEqual((Object)flatIJLookAndFeelInfo3.getName(), (Object)object2)) {
                FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo4 = flatIJLookAndFeelInfo;
                Intrinsics.checkExpressionValueIsNotNull((Object)flatIJLookAndFeelInfo4, (String)"FlatAllIJThemes.INFOS\n  \u2026                        }");
                Class.forName(flatIJLookAndFeelInfo4.getClassName()).getMethod("setup", new Class[0]).invoke(null, new Object[0]);
                FlatLaf.updateUI();
                return;
            }
            ++n2;
        }
        throw (Throwable)new NoSuchElementException("Array contains no element matching the predicate.");
    }

    Class763(JComboBox jComboBox) {
        this.Field11231 = jComboBox;
    }

    private static String Method3154(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 115;
            cArray2[n] = (char)(cArray[n] ^ (0x77A8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

