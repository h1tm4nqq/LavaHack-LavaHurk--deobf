/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import lavahack.client.Class1083;
import lavahack.client.Class1251;

class Class1157
implements ActionListener {
    final Class1251 Field13220;
    final JCheckBox Field13221;
    final Class1083 Field13222;
    private String Field13223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1157(Class1083 class1083, Class1251 class1251, JCheckBox jCheckBox) {
        this.Field13222 = class1083;
        this.Field13220 = class1251;
        this.Field13221 = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Field13220.Method5032(this.Field13221.isSelected());
    }
}

