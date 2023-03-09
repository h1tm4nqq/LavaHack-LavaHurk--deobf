/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import lavahack.client.Class1128;
import lavahack.client.Class1130;
import lavahack.client.Class1131;
import lavahack.client.Class1134;
import lavahack.client.Class1152;
import lavahack.client.Class1154;
import lavahack.client.Class1157;
import lavahack.client.Class1158;
import lavahack.client.Class1251;
import lavahack.client.Class1326;

final class Class1083
implements Class1326 {
    private int Field12834;

    Class1083() {
    }

    @Override
    public void Method4375(Class1251 class1251) {
        JButton jButton = new JButton();
        jButton.setText(">");
        jButton.setToolTipText("Play");
        jButton.addActionListener(new Class1130(this, class1251));
        JButton jButton2 = new JButton();
        jButton2.setText("||");
        jButton2.setToolTipText("Pause");
        jButton2.addActionListener(new Class1128(this, class1251));
        JButton jButton3 = new JButton();
        jButton3.setText("#");
        jButton3.setToolTipText("Stop");
        jButton3.addActionListener(new Class1134(this, class1251));
        JButton jButton4 = new JButton();
        jButton4.setText("|<");
        jButton4.setToolTipText("Skip Backward");
        jButton4.addActionListener(new Class1131(this, class1251));
        JButton jButton5 = new JButton();
        jButton5.setText(">|");
        jButton5.setToolTipText("Skip Forward");
        jButton5.addActionListener(new Class1154(this, class1251));
        JSlider jSlider = new JSlider();
        jSlider.setToolTipText("Volume");
        jSlider.addChangeListener(new Class1152(this, class1251, jSlider));
        jSlider.setMinimum(0);
        jSlider.setMaximum(100);
        jSlider.setMajorTickSpacing(50);
        jSlider.setMinorTickSpacing(10);
        jSlider.setPaintTicks(true);
        jSlider.setPaintTrack(true);
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setText("Repeat");
        jCheckBox.addActionListener(new Class1158(this, class1251, jCheckBox));
        JCheckBox jCheckBox2 = new JCheckBox();
        jCheckBox2.setText("Shuffle");
        jCheckBox2.addActionListener(new Class1157(this, class1251, jCheckBox2));
    }

    private static String Method4376(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 199;
            cArray2[n] = (char)(cArray[n] ^ (0x7754 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

