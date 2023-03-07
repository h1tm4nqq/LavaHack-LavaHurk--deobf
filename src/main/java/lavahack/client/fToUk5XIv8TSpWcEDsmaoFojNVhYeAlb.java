/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import lavahack.client.Yg8ZRBAPin29AirX4rnXRcIHjwxM3Fa3;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$1;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$2;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$3;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$4;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$5;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$6;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$7;
import lavahack.client.fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$8;
import lavahack.client.paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF;

final class fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb
implements Yg8ZRBAPin29AirX4rnXRcIHjwxM3Fa3 {
    private int Field12834;

    fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb() {
    }

    @Override
    public void Method4375(paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2) {
        JButton jButton = new JButton();
        jButton.setText(">");
        jButton.setToolTipText("Play");
        jButton.addActionListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$1(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2));
        JButton jButton2 = new JButton();
        jButton2.setText("||");
        jButton2.setToolTipText("Pause");
        jButton2.addActionListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$2(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2));
        JButton jButton3 = new JButton();
        jButton3.setText("#");
        jButton3.setToolTipText("Stop");
        jButton3.addActionListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$3(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2));
        JButton jButton4 = new JButton();
        jButton4.setText("|<");
        jButton4.setToolTipText("Skip Backward");
        jButton4.addActionListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$4(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2));
        JButton jButton5 = new JButton();
        jButton5.setText(">|");
        jButton5.setToolTipText("Skip Forward");
        jButton5.addActionListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$5(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2));
        JSlider jSlider = new JSlider();
        jSlider.setToolTipText("Volume");
        jSlider.addChangeListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$6(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, jSlider));
        jSlider.setMinimum((int)-665569657L ^ 0xD8543687);
        jSlider.setMaximum((int)((long)-435849993 ^ (long)-435850002) << 2);
        jSlider.setMajorTickSpacing(((int)-1060384260L ^ 0xC0CBD1E5) << 1);
        jSlider.setMinorTickSpacing((int)((long)2024556302 ^ (long)2024556299) << 1);
        jSlider.setPaintTicks(((int)-1872047232L ^ 0x906AD381) != 0);
        jSlider.setPaintTrack(((int)1764840825L ^ 0x69315578) != 0);
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setText("Repeat");
        jCheckBox.addActionListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$7(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, jCheckBox));
        JCheckBox jCheckBox2 = new JCheckBox();
        jCheckBox2.setText("Shuffle");
        jCheckBox2.addActionListener(new fToUk5XIv8TSpWcEDsmaoFojNVhYeAlb$8(this, paYMcmWOiGqKfUxhe7rFt8jRbDJD9ksF2, jCheckBox2));
    }

    private static String Method4376(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1007415394L ^ 0x3C0BF062;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1980615392L ^ 0x89F235DF);
            int n2 = (int)((long)60486788 ^ (long)60486723);
            cArray2[n] = (char)(cArray[n] ^ (((int)1597868852L ^ 0x5F3D96E1) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

