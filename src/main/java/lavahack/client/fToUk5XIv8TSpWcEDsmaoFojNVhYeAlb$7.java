/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb;
import lavahack.client.paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF;

class fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$7
implements ActionListener {
    final paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF Field13224;
    final JCheckBox Field13225;
    final fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb Field13226;
    private String Field13227 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$7(fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb2, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, JCheckBox jCheckBox) {
        this.Field13226 = fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb2;
        this.Field13224 = paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2;
        this.Field13225 = jCheckBox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.Field13224.Method5034(this.Field13225.isSelected());
    }
}

