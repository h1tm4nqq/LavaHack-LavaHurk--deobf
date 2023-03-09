/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import lavahack.client.Class1083;
import lavahack.client.Class1251;

class Class1158
implements ActionListener {
    final Class1251 Field13224;
    final JCheckBox Field13225;
    final Class1083 Field13226;
    private String Field13227 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1158(Class1083 class1083, Class1251 class1251, JCheckBox jCheckBox) {
        this.Field13226 = class1083;
        this.Field13224 = class1251;
        this.Field13225 = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Field13224.Method5034(this.Field13225.isSelected());
    }
}

