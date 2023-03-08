//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import javax.swing.*;
import java.awt.event.*;
import kotlin.jvm.internal.*;
import com.formdev.flatlaf.*;
import java.util.*;
import com.formdev.flatlaf.intellijthemes.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed" })
final class Class763 implements ActionListener
{
    final JComboBox Field11231;
    private String Field11232 = "TheKisDevs & LavaHack Development owns you";
    
    @Override
    public final void actionPerformed(final ActionEvent actionEvent) {
        final FlatAllIJThemes$FlatIJLookAndFeelInfo[] infos = FlatAllIJThemes.INFOS;
        Intrinsics.checkExpressionValueIsNotNull((Object)infos, "FlatAllIJThemes.INFOS");
        final FlatAllIJThemes$FlatIJLookAndFeelInfo[] array = infos;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final FlatAllIJThemes$FlatIJLookAndFeelInfo flatAllIJThemes$FlatIJLookAndFeelInfo2;
            final FlatAllIJThemes$FlatIJLookAndFeelInfo flatAllIJThemes$FlatIJLookAndFeelInfo = flatAllIJThemes$FlatIJLookAndFeelInfo2 = array[i];
            Intrinsics.checkExpressionValueIsNotNull((Object)flatAllIJThemes$FlatIJLookAndFeelInfo2, "it");
            final String name = flatAllIJThemes$FlatIJLookAndFeelInfo2.getName();
            final Object selectedItem = this.Field11231.getSelectedItem();
            if (selectedItem != null) {
                final String string = selectedItem.toString();
                if (string != null) {
                    if (Intrinsics.areEqual((Object)name, (Object)string)) {
                        final FlatAllIJThemes$FlatIJLookAndFeelInfo flatAllIJThemes$FlatIJLookAndFeelInfo3 = flatAllIJThemes$FlatIJLookAndFeelInfo;
                        Intrinsics.checkExpressionValueIsNotNull((Object)flatAllIJThemes$FlatIJLookAndFeelInfo3, "FlatAllIJThemes.INFOS\n  \u2026                        }");
                        Class.forName(flatAllIJThemes$FlatIJLookAndFeelInfo3.getClassName()).getMethod("setup", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                        FlatLaf.updateUI();
                        return;
                    }
                    ++i;
                    continue;
                }
            }
            return;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
    
    Class763(final JComboBox field11231) {
        this.Field11231 = field11231;
    }
    
    private static String Method3154(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x77A8 ^ 0x73));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
