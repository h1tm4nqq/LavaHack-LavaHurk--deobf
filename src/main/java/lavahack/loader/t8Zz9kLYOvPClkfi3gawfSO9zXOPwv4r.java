/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.formdev.flatlaf.intellijthemes.FlatAllIJThemes
 *  com.formdev.flatlaf.intellijthemes.FlatAllIJThemes$FlatIJLookAndFeelInfo
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import com.formdev.flatlaf.intellijthemes.FlatAllIJThemes;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.loader.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
import lavahack.loader.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.loader.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.loader.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.loader.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.loader.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.loader.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/gui/page/pages/SettingsPage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "init", "", "kisman.cc"})
public final class t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r
extends x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk {
    private String Field12516 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method1571() {
        Collection<String> collection;
        JLabel jLabel = new JLabel("Theme: ");
        jLabel.setPreferredSize(new Dimension((int)((long)-661373202 ^ (long)-661373193) << 1, (int)1405257269L ^ 0x53C2862C));
        Intrinsics.checkExpressionValueIsNotNull((Object)FlatAllIJThemes.INFOS, (String)"FlatAllIJThemes.INFOS");
        Object object = FlatAllIJThemes.INFOS;
        int n = (int)((long)-444539954 ^ (long)-444539954);
        Object object2 = object;
        Collection collection2 = new ArrayList(((FlatAllIJThemes.FlatIJLookAndFeelInfo[])object).length);
        int n2 = (int)((long)1814616810 ^ (long)1814616810);
        Object object3 = object2;
        int n3 = ((FlatAllIJThemes.FlatIJLookAndFeelInfo[])object3).length;
        for (int i = (int)((long)2034751552 ^ (long)2034751552); i < n3; ++i) {
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo;
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo2 = flatIJLookAndFeelInfo = object3[i];
            collection = collection2;
            int n4 = (int)((long)-912076947 ^ (long)-912076947);
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo3 = flatIJLookAndFeelInfo2;
            Intrinsics.checkExpressionValueIsNotNull((Object)flatIJLookAndFeelInfo3, (String)"it");
            String string = flatIJLookAndFeelInfo3.getName();
            collection.add(string);
        }
        collection = (List)collection2;
        object = collection;
        n = (int)((long)897494222 ^ (long)897494222);
        object2 = object;
        String[] stringArray = object2.toArray(new String[(int)693215928L ^ 0x2951A2B8]);
        if (stringArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Collection<String> collection3 = collection = stringArray;
        JComboBox jComboBox = new JComboBox((E[])collection3);
        jComboBox.setPreferredSize(new Dimension(((int)1655450169L ^ 0x62AC2A20) << 3, (int)1975088674L ^ 0x75B9763B));
        jComboBox.addActionListener(new t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(jComboBox));
        object = this.Method1570();
        n = (int)-1984009790L ^ 0x89BE69C2;
        object.add(jLabel);
        object = this.Method1570();
        n = (int)((long)1030147922 ^ (long)1030147922);
        object.add(jComboBox);
        object = new vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3(jLabel, jComboBox, (int)((long)829421607 ^ (long)829421658) << 1, (int)1279866303L ^ 0x4C4935A6);
        ((Component)object).setBounds((int)1287125980L ^ 0x4CB7FBD9, (int)((long)1734240972 ^ (long)1734240969), ((int)-488625913L ^ 0xE2E0297A) << 1, (int)((long)-1245424531 ^ (long)-1245424524));
        this.add((Component)object);
        JCheckBox jCheckBox = new JCheckBox("Overwriting");
        jCheckBox.setBounds((int)336717277L ^ 0x1411E5D8, (int)((long)-159300716 ^ (long)-159300709) << 1, (int)((long)1717306172 ^ (long)1717306177) << 1, (int)-84273148L ^ 0xFAFA181D);
        jCheckBox.setPreferredSize(new Dimension(((int)1899503416L ^ 0x71381F21) << 3, (int)((long)-797489850 ^ (long)-797489825)));
        jCheckBox.addMouseListener(new Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro());
        jCheckBox.addActionListener(t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field8036);
        object2 = this.Method1570();
        int n5 = (int)-414182756L ^ 0xE750129C;
        object2.add(jCheckBox);
        this.add(jCheckBox);
        object2 = new JCheckBox("Ping Bypass Server");
        ((Component)object2).setBounds((int)((long)326230737 ^ (long)326230740), (int)((long)-627113160 ^ (long)-627113201), ((int)658845184L ^ 0x27452E7D) << 1, (int)-1638612728L ^ 0x9E54C111);
        ((JComponent)object2).setPreferredSize(new Dimension((int)((long)176405419 ^ (long)176405426) << 3, (int)((long)1169719118 ^ (long)1169719127)));
        ((Component)object2).addMouseListener(new Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro());
        ((AbstractButton)object2).addActionListener(t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field14269);
        Object object4 = this.Method1570();
        n2 = (int)((long)1886887550 ^ (long)1886887550);
        object4.add(object2);
        this.add((Component)object2);
        object4 = new JLabel("Font: ");
        ((JComponent)object4).setPreferredSize(new Dimension(((int)-1466458986L ^ 0xA8979C8F) << 1, (int)-835670878L ^ 0xCE30ACBB));
        object3 = vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4788();
        n3 = (int)-1247170050L ^ 0xB5A9B1FE;
        Object object5 = object3;
        IBONRcQCNUBg2NBpVpVQf61ykmVfU03E[] iBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray = object5.toArray(new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E[(int)((long)-1378867073 ^ (long)-1378867073)]);
        if (iBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Collection<String> collection4 = collection = iBONRcQCNUBg2NBpVpVQf61ykmVfU03EArray;
        JComboBox jComboBox2 = new JComboBox((E[])collection4);
        jComboBox2.setPreferredSize(new Dimension(((int)-752289752L ^ 0xD328F831) << 3, (int)941690387L ^ 0x38210E0A));
        jComboBox2.addActionListener(new t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(this, jComboBox2));
        object3 = this.Method1570();
        n3 = (int)781532251L ^ 0x2E953C5B;
        object3.add(object4);
        object3 = this.Method1570();
        n3 = (int)-745949764L ^ 0xD389B5BC;
        object3.add(jComboBox2);
        object3 = new vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3((JComponent)object4, jComboBox2, ((int)2016476172L ^ 0x7830FC71) << 1, (int)((long)860039135 ^ (long)860039110));
        ((Component)object3).setBounds((int)124720200L ^ 0x76F144D, ((int)151085387L ^ 0x901614E) << 4, ((int)320211377L ^ 0x131609CC) << 1, (int)((long)1959637291 ^ (long)1959637298));
        this.add((Component)object3);
    }

    public t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r() {
        super("Settings");
    }

    private static String Method1573(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1675924289 ^ (long)-1675924289);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1554077754L ^ 0x5CA158C5);
            int n2 = (int)((long)218595365 ^ (long)218595364) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)441827536 ^ (long)441839869) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

