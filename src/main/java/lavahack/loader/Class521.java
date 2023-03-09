/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import com.kisman.cc.loader.Class1204;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.Class855;
import lavahack.loader.Class950;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed"})
final class Class521
implements ActionListener {
    final JTextField Field10206;
    final JComboBox Field10207;
    private int Field10208;

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        if (!Class855.Method3594(this.Field10206.getText())) return;
        String string = this.Field10206.getText();
        Intrinsics.checkExpressionValueIsNotNull((Object)string, (String)"keyTextField.text");
        Class950.Method3914(string, Class1204.Method4839()[this.Field10207.getSelectedIndex()]);
    }

    Class521(JTextField jTextField, JComboBox jComboBox) {
        this.Field10206 = jTextField;
        this.Field10207 = jComboBox;
    }

    private static String Method2388(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 195;
            cArray2[n] = (char)(cArray[n] ^ (0x230E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

