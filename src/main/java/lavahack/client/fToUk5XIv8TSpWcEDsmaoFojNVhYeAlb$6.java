/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb;
import lavahack.client.paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF;

class fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$6
implements ChangeListener {
    final paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Field13198;
    final JSlider Field13199;
    final fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb Field13200;
    private String Field13201 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$6(fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb2, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, JSlider jSlider) {
        this.Field13200 = fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb2;
        this.Field13198 = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2;
        this.Field13199 = jSlider;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        this.Field13198.Method5030(this.Field13199.getValue());
    }
}

