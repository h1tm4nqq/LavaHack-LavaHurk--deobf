/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.formdev.flatlaf.FlatLaf
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 */
package lavahack.loader;

import com.formdev.flatlaf.FlatLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import kotlin.Metadata;
import kotlin.TypeCastException;
import lavahack.loader.Class1027;
import lavahack.loader.Class1191;
import lavahack.loader.Class1272;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed"})
final class Class6
implements ActionListener {
    final Class1027 Field7833;
    final JComboBox Field7834;
    private int Field7835;

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        Object object = this.Field7834.getSelectedItem();
        if (object == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.utils.LoaderFont");
        }
        Class1191.Method4803(((Class1272)object).Method5105());
        FlatLaf.updateUI();
        this.Field7833.updateUI();
        Class1191.Method4798();
    }

    Class6(Class1027 class1027, JComboBox jComboBox) {
        this.Field7833 = class1027;
        this.Field7834 = jComboBox;
    }

    private static String Method75(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 42;
            cArray2[n] = (char)(cArray[n] ^ (0x2591 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

