/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lavahack.client.Class1083;
import lavahack.client.Class1251;

class Class1130
implements ActionListener {
    final Class1251 Field13131;
    final Class1083 Field13132;
    private int Field13133;

    Class1130(Class1083 class1083, Class1251 class1251) {
        this.Field13132 = class1083;
        this.Field13131 = class1251;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Field13131.Method5021();
    }
}

