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
import lavahack.loader.JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm;
import lavahack.loader.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.loader.QDCXH9agJwY6VzukEM6t94IC3iSpNB1w$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.loader.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import lavahack.loader.x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/kisman/cc/loader/gui/page/pages/MainPage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "init", "", "kisman.cc"})
public final class QDCXH9agJwY6VzukEM6t94IC3iSpNB1w
extends x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk {
    private String Field9303 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method1571() {
        JPanel jPanel = new JPanel();
        jPanel.setBounds((int)-658059915L ^ 0xD8C6CD08, (int)-1817790448L ^ 0x93A6B85B, ((int)-1509098858L ^ 0xA60CFAEB) << 1, (int)((long)227143290 ^ (long)227143217) << 1);
        jPanel.setPreferredSize(new Dimension(((int)-799935868L ^ 0xD051F2F9) << 1, ((int)-472967076L ^ 0xE3CF1817) << 1));
        jPanel.setBorder(new JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm((int)((long)-112597501 ^ (long)-112597498) << 2, vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4799(), 2.0f));
        JLabel jLabel = new JLabel("Key: ");
        jLabel.setPreferredSize(new Dimension(((int)1790931071L ^ 0x6ABF7066) << 1, (int)-273936853L ^ 0xEFAC0E32));
        JTextField jTextField = new JTextField("Key");
        jTextField.setPreferredSize(new Dimension(((int)442268428L ^ 0x1A5C7B15) << 2, (int)-1218478820L ^ 0xB75F7D05));
        JLabel jLabel2 = new JLabel("Version: ");
        jLabel2.setPreferredSize(new Dimension((int)((long)223846792 ^ (long)223846847), (int)((long)112426989 ^ (long)112426996)));
        JComboBox<String> jComboBox = new JComboBox<String>(Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Method3915());
        jComboBox.setPreferredSize(new Dimension((int)((long)-194352580 ^ (long)-194352603) << 2, (int)((long)944187872 ^ (long)944187897)));
        JButton jButton = new JButton("Install");
        jButton.setPreferredSize(new Dimension((int)((long)-1810782951 ^ (long)-1810782976) << 2, (int)((long)110275890 ^ (long)110275883)));
        jButton.addActionListener(new QDCXH9agJwY6VzukEM6t94IC3iSpNB1w$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(jTextField, jComboBox));
        jPanel.add(new vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3(jLabel, jTextField, ((int)-1295014566L ^ 0xB2CFA511) << 1, (int)((long)1121684724 ^ (long)1121684717)));
        jPanel.add(new vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3(jLabel2, jComboBox, (int)((long)980975894 ^ (long)980975965) << 1, (int)-1286739252L ^ 0xB34DEAD5));
        jPanel.add(jButton);
        this.add(jPanel);
        Collection collection = this.Method1569();
        int n = (int)-1710574717L ^ 0x9A0AB383;
        collection.add(jPanel);
        collection = this.Method1570();
        n = (int)-1458140344L ^ 0xA9168B48;
        collection.add(jLabel);
        collection = this.Method1570();
        n = (int)((long)1965747903 ^ (long)1965747903);
        collection.add(jTextField);
        collection = this.Method1570();
        n = (int)-1940945641L ^ 0x8C4F8517;
        collection.add(jLabel2);
        collection = this.Method1570();
        n = (int)793702617L ^ 0x2F4EF0D9;
        collection.add(jComboBox);
        collection = this.Method1570();
        n = (int)-1628855925L ^ 0x9EE9A18B;
        collection.add(jButton);
    }

    public QDCXH9agJwY6VzukEM6t94IC3iSpNB1w() {
        super("Main");
    }

    private static String Method1573(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-155692459 ^ (long)-155692459);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1200049209 ^ (long)-1200049352);
            int n2 = ((int)-1003787695L ^ 0xC42B6A00) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-114347202L ^ 0xF92F6C37 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

