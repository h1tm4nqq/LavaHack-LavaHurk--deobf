/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import lavahack.client.Class1083;
import lavahack.client.Class1251;

class Class1152
implements ChangeListener {
    final Class1251 Field13198;
    final JSlider Field13199;
    final Class1083 Field13200;
    private String Field13201 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class1152(Class1083 class1083, Class1251 class1251, JSlider jSlider) {
        this.Field13200 = class1083;
        this.Field13198 = class1251;
        this.Field13199 = jSlider;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.Field13198.Method5030(this.Field13199.getValue());
    }
}

