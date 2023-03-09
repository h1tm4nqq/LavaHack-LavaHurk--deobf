/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lavahack.client.Class1083;
import lavahack.client.Class1251;

class Class1131
implements ActionListener {
    final Class1251 Field13134;
    final Class1083 Field13135;
    private String Field13136 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1131(Class1083 class1083, Class1251 class1251) {
        this.Field13135 = class1083;
        this.Field13134 = class1251;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Field13134.Method5028();
    }
}

