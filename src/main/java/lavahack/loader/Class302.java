//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/loader/gui/page/pages/MainPage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "init", "", "kisman.cc" })
public final class Class302 extends Class1402
{
    private String Field9303 = "TheKisDevs & LavaHack Development owns you";
    
    public void Method1571() {
        final JPanel panel = new JPanel();
        panel.setBounds(125, 75, 250, 150);
        panel.setPreferredSize(new Dimension(250, 150));
        panel.setBorder((Border)new Class2166(20, Class1191.Method4799(), 2.0f));
        final JLabel label = new JLabel("Key: ");
        label.setPreferredSize(new Dimension(50, 25));
        final JTextField textField = new JTextField("Key");
        textField.setPreferredSize(new Dimension(100, 25));
        final JLabel label2 = new JLabel("Version: ");
        label2.setPreferredSize(new Dimension(55, 25));
        final JComboBox<String> comboBox = new JComboBox<String>(Class950.Method3915());
        comboBox.setPreferredSize(new Dimension(100, 25));
        final JButton button = new JButton("Install");
        button.setPreferredSize(new Dimension(100, 25));
        button.addActionListener(new Class521(textField, comboBox));
        panel.add((Component)new Class1199((JComponent)label, (JComponent)textField, Integer.valueOf(150), Integer.valueOf(25)));
        panel.add((Component)new Class1199((JComponent)label2, (JComponent)comboBox, Integer.valueOf(150), Integer.valueOf(25)));
        panel.add(button);
        this.add((Component)panel);
        this.Method1569().add(panel);
        this.Method1570().add(label);
        this.Method1570().add(textField);
        this.Method1570().add(label2);
        this.Method1570().add(comboBox);
        this.Method1570().add(button);
    }
    
    public Class302() {
        super("Main");
    }
    
    private static String Method1573(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5F09 ^ 0xA2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
