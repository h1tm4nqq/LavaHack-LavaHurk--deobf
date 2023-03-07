/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb;
import lavahack.client.paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF;

class fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$8
implements ActionListener {
    final paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Field13220;
    final JCheckBox Field13221;
    final fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb Field13222;
    private String Field13223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$8(fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb2, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, JCheckBox jCheckBox) {
        this.Field13222 = fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb2;
        this.Field13220 = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2;
        this.Field13221 = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Field13220.Method5032(this.Field13221.isSelected());
    }
}

