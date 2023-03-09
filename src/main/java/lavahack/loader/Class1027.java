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
import lavahack.loader.Class1191;
import lavahack.loader.Class1199;
import lavahack.loader.Class1272;
import lavahack.loader.Class1385;
import lavahack.loader.Class1402;
import lavahack.loader.Class1953;
import lavahack.loader.Class36;
import lavahack.loader.Class6;
import lavahack.loader.Class763;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/gui/page/pages/SettingsPage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "init", "", "kisman.cc"})
public final class Class1027
extends Class1402 {
    private String Field12516 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method1571() {
        Object[] objectArray;
        JLabel jLabel = new JLabel("Theme: ");
        jLabel.setPreferredSize(new Dimension(50, 25));
        Intrinsics.checkExpressionValueIsNotNull((Object)FlatAllIJThemes.INFOS, (String)"FlatAllIJThemes.INFOS");
        Object object = FlatAllIJThemes.INFOS;
        boolean bl = false;
        Object object2 = object;
        Collection collection = new ArrayList(((FlatAllIJThemes.FlatIJLookAndFeelInfo[])object).length);
        boolean bl2 = false;
        Object object3 = object2;
        int n = ((FlatAllIJThemes.FlatIJLookAndFeelInfo[])object3).length;
        for (int i = 0; i < n; ++i) {
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo;
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo2 = flatIJLookAndFeelInfo = object3[i];
            objectArray = collection;
            boolean bl3 = false;
            FlatAllIJThemes.FlatIJLookAndFeelInfo flatIJLookAndFeelInfo3 = flatIJLookAndFeelInfo2;
            Intrinsics.checkExpressionValueIsNotNull((Object)flatIJLookAndFeelInfo3, (String)"it");
            String string = flatIJLookAndFeelInfo3.getName();
            objectArray.add(string);
        }
        objectArray = (List)collection;
        object = (Collection)objectArray;
        bl = false;
        object2 = object;
        String[] stringArray = object2.toArray(new String[0]);
        if (stringArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        objectArray = stringArray;
        String[] stringArray2 = objectArray;
        JComboBox<String> jComboBox = new JComboBox<String>(stringArray2);
        jComboBox.setPreferredSize(new Dimension(200, 25));
        jComboBox.addActionListener(new Class763(jComboBox));
        object = this.Method1570();
        bl = false;
        object.add(jLabel);
        object = this.Method1570();
        bl = false;
        object.add(jComboBox);
        object = new Class1199(jLabel, jComboBox, 250, 25);
        ((Component)object).setBounds(5, 5, 250, 25);
        this.add((Component)object);
        JCheckBox jCheckBox = new JCheckBox("Overwriting");
        jCheckBox.setBounds(5, 30, 250, 25);
        jCheckBox.setPreferredSize(new Dimension(200, 25));
        jCheckBox.addMouseListener(new Class1953());
        jCheckBox.addActionListener(Class36.Field8036);
        object2 = this.Method1570();
        boolean bl4 = false;
        object2.add(jCheckBox);
        this.add(jCheckBox);
        object2 = new JCheckBox("Ping Bypass Server");
        ((Component)object2).setBounds(5, 55, 250, 25);
        ((JComponent)object2).setPreferredSize(new Dimension(200, 25));
        ((Component)object2).addMouseListener(new Class1953());
        ((AbstractButton)object2).addActionListener(Class1385.Field14269);
        Object object4 = this.Method1570();
        bl2 = false;
        object4.add(object2);
        this.add((Component)object2);
        object4 = new JLabel("Font: ");
        ((JComponent)object4).setPreferredSize(new Dimension(50, 25));
        object3 = Class1191.Method4788();
        n = 0;
        Object object5 = object3;
        Class1272[] class1272Array = object5.toArray(new Class1272[0]);
        if (class1272Array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Object[] objectArray2 = objectArray = class1272Array;
        JComboBox<Object> jComboBox2 = new JComboBox<Object>(objectArray2);
        jComboBox2.setPreferredSize(new Dimension(200, 25));
        jComboBox2.addActionListener(new Class6(this, jComboBox2));
        object3 = this.Method1570();
        n = 0;
        object3.add(object4);
        object3 = this.Method1570();
        n = 0;
        object3.add(jComboBox2);
        object3 = new Class1199((JComponent)object4, jComboBox2, 250, 25);
        ((Component)object3).setBounds(5, 80, 250, 25);
        this.add((Component)object3);
    }

    public Class1027() {
        super("Settings");
    }

    private static String Method1573(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 4;
            cArray2[n] = (char)(cArray[n] ^ (0x605A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

