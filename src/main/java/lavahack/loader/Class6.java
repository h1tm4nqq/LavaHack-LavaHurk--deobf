//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import javax.swing.*;
import java.awt.event.*;
import kotlin.*;
import com.formdev.flatlaf.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed" })
final class Class6 implements ActionListener
{
    final Class1027 Field7833;
    final JComboBox Field7834;
    private int Field7835;
    
    @Override
    public final void actionPerformed(final ActionEvent actionEvent) {
        final Object selectedItem = this.Field7834.getSelectedItem();
        if (selectedItem == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.loader.gui.utils.LoaderFont");
        }
        Class1191.Method4803(((Class1272)selectedItem).Method5105());
        FlatLaf.updateUI();
        this.Field7833.updateUI();
        Class1191.Method4798();
    }
    
    Class6(final Class1027 field7833, final JComboBox field7834) {
        this.Field7833 = field7833;
        this.Field7834 = field7834;
    }
    
    private static String Method75(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2591 ^ 0x2A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
