/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.loader;

import java.awt.Dimension;
import java.util.Collection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import kotlin.Metadata;
import lavahack.loader.Class1191;
import lavahack.loader.Class1199;
import lavahack.loader.Class1402;
import lavahack.loader.Class2166;
import lavahack.loader.Class521;
import lavahack.loader.Class950;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/gui/page/pages/MainPage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "init", "", "kisman.cc"})
public final class Class302
extends Class1402 {
    private String Field9303 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method1571() {
        JPanel jPanel = new JPanel();
        jPanel.setBounds(125, 75, 250, 150);
        jPanel.setPreferredSize(new Dimension(250, 150));
        jPanel.setBorder(new Class2166(20, Class1191.Method4799(), 2.0f));
        JLabel jLabel = new JLabel("Key: ");
        jLabel.setPreferredSize(new Dimension(50, 25));
        JTextField jTextField = new JTextField("Key");
        jTextField.setPreferredSize(new Dimension(100, 25));
        JLabel jLabel2 = new JLabel("Version: ");
        jLabel2.setPreferredSize(new Dimension(55, 25));
        JComboBox<String> jComboBox = new JComboBox<String>(Class950.Method3915());
        jComboBox.setPreferredSize(new Dimension(100, 25));
        JButton jButton = new JButton("Install");
        jButton.setPreferredSize(new Dimension(100, 25));
        jButton.addActionListener(new Class521(jTextField, jComboBox));
        jPanel.add(new Class1199(jLabel, jTextField, 150, 25));
        jPanel.add(new Class1199(jLabel2, jComboBox, 150, 25));
        jPanel.add(jButton);
        this.add(jPanel);
        Collection collection = this.Method1569();
        boolean bl = false;
        collection.add(jPanel);
        collection = this.Method1570();
        bl = false;
        collection.add(jLabel);
        collection = this.Method1570();
        bl = false;
        collection.add(jTextField);
        collection = this.Method1570();
        bl = false;
        collection.add(jLabel2);
        collection = this.Method1570();
        bl = false;
        collection.add(jComboBox);
        collection = this.Method1570();
        bl = false;
        collection.add(jButton);
    }

    public Class302() {
        super("Main");
    }

    private static String Method1573(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 162;
            cArray2[n] = (char)(cArray[n] ^ (0x5F09 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

