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
import lavahack.loader.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.loader.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed"})
final class t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
implements ActionListener {
    final t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r Field7833;
    final JComboBox Field7834;
    private int Field7835;

    @Override
    public final void actionPerformed(ActionEvent actionEvent) {
        Object object = this.Field7834.getSelectedItem();
        if (object == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.utils.LoaderFont");
        }
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4803(((IBONRcQCNUBg2NBpVpVQf61ykmVfU03E)object).Method5105());
        FlatLaf.updateUI();
        this.Field7833.updateUI();
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4798();
    }

    t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2, JComboBox jComboBox) {
        this.Field7833 = t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2;
        this.Field7834 = jComboBox;
    }

    private static String Method75(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1821666362L ^ 0x936B93C6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-781136116L ^ 0xD170CFF3);
            int n2 = (int)((long)1100936381 ^ (long)1100936360) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-738947996 ^ (long)-738940427) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

