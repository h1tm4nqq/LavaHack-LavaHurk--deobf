/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lavahack.client.Class1083;
import lavahack.client.Class1251;

class Class1128
implements ActionListener {
    final Class1251 Field13124;
    final Class1083 Field13125;
    private int Field13126;

    Class1128(Class1083 class1083, Class1251 class1251) {
        this.Field13125 = class1083;
        this.Field13124 = class1251;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Field13124.Method5023();
    }
}

