//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.jvm.internal.*;
import kotlin.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import com.formdev.flatlaf.intellijthemes.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/loader/gui/page/pages/SettingsPage;", "Lcom/kisman/cc/loader/gui/page/Page;", "()V", "init", "", "kisman.cc" })
public final class Class1027 extends Class1402
{
    private String Field12516 = "TheKisDevs & LavaHack Development owns you";
    
    @Override
    public void Method1571() {
        final JLabel label = new JLabel("Theme: ");
        label.setPreferredSize(new Dimension(50, 25));
        final FlatAllIJThemes$FlatIJLookAndFeelInfo[] infos = FlatAllIJThemes.INFOS;
        Intrinsics.checkExpressionValueIsNotNull((Object)infos, "FlatAllIJThemes.INFOS");
        final FlatAllIJThemes$FlatIJLookAndFeelInfo[] array;
        final ArrayList<String> list = new ArrayList<String>((array = infos).length);
        for (final FlatAllIJThemes$FlatIJLookAndFeelInfo flatAllIJThemes$FlatIJLookAndFeelInfo : array) {
            final ArrayList<String> list2 = list;
            final FlatAllIJThemes$FlatIJLookAndFeelInfo flatAllIJThemes$FlatIJLookAndFeelInfo2 = flatAllIJThemes$FlatIJLookAndFeelInfo;
            final ArrayList<String> list3 = list2;
            final FlatAllIJThemes$FlatIJLookAndFeelInfo flatAllIJThemes$FlatIJLookAndFeelInfo3 = flatAllIJThemes$FlatIJLookAndFeelInfo2;
            Intrinsics.checkExpressionValueIsNotNull((Object)flatAllIJThemes$FlatIJLookAndFeelInfo3, "it");
            list3.add(flatAllIJThemes$FlatIJLookAndFeelInfo3.getName());
        }
        final String[] array3 = list.toArray(new String[0]);
        if (array3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        final JComboBox comboBox = new JComboBox<String>(array3);
        comboBox.setPreferredSize(new Dimension(200, 25));
        comboBox.addActionListener(new Class763(comboBox));
        this.Method1570().add(label);
        this.Method1570().add(comboBox);
        final Class1199 class1199 = new Class1199(label, comboBox, 250, 25);
        class1199.setBounds(5, 5, 250, 25);
        this.add(class1199);
        final JCheckBox checkBox = new JCheckBox("Overwriting");
        checkBox.setBounds(5, 30, 250, 25);
        checkBox.setPreferredSize(new Dimension(200, 25));
        checkBox.addMouseListener(new Class1953());
        checkBox.addActionListener(Class36.Field8036);
        this.Method1570().add(checkBox);
        this.add(checkBox);
        final JCheckBox checkBox2 = new JCheckBox("Ping Bypass Server");
        checkBox2.setBounds(5, 55, 250, 25);
        checkBox2.setPreferredSize(new Dimension(200, 25));
        checkBox2.addMouseListener(new Class1953());
        checkBox2.addActionListener(Class1385.Field14269);
        this.Method1570().add(checkBox2);
        this.add(checkBox2);
        final JLabel label2 = new JLabel("Font: ");
        label2.setPreferredSize(new Dimension(50, 25));
        final Object[] array4 = Class1191.Method4788().toArray(new Class1272[0]);
        if (array4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        final JComboBox comboBox2 = new JComboBox<Object>(array4);
        comboBox2.setPreferredSize(new Dimension(200, 25));
        comboBox2.addActionListener(new Class6(this, comboBox2));
        this.Method1570().add(label2);
        this.Method1570().add(comboBox2);
        final Class1199 class1200 = new Class1199(label2, comboBox2, 250, 25);
        class1200.setBounds(5, 80, 250, 25);
        this.add(class1200);
    }
    
    public Class1027() {
        super("Settings");
    }
    
    private static String Method1573(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x605A ^ 0x4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
