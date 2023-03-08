//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

final class Class1083 implements Class1326
{
    private int Field12834;
    
    @Override
    public void Method4375(final Class1251 class1251) {
        final JButton button = new JButton();
        button.setText(">");
        button.setToolTipText("Play");
        button.addActionListener(new Class1130(this, class1251));
        final JButton button2 = new JButton();
        button2.setText("||");
        button2.setToolTipText("Pause");
        button2.addActionListener(new Class1128(this, class1251));
        final JButton button3 = new JButton();
        button3.setText("#");
        button3.setToolTipText("Stop");
        button3.addActionListener(new Class1134(this, class1251));
        final JButton button4 = new JButton();
        button4.setText("|<");
        button4.setToolTipText("Skip Backward");
        button4.addActionListener(new Class1131(this, class1251));
        final JButton button5 = new JButton();
        button5.setText(">|");
        button5.setToolTipText("Skip Forward");
        button5.addActionListener(new Class1154(this, class1251));
        final JSlider slider = new JSlider();
        slider.setToolTipText("Volume");
        slider.addChangeListener(new Class1152(this, class1251, slider));
        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        final JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Repeat");
        checkBox.addActionListener(new Class1158(this, class1251, checkBox));
        final JCheckBox checkBox2 = new JCheckBox();
        checkBox2.setText("Shuffle");
        checkBox2.addActionListener(new Class1157(this, class1251, checkBox2));
    }
    
    private static String Method4376(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7754 ^ 0xC7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
