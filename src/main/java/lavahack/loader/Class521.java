//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import javax.swing.*;
import java.awt.event.*;
import kotlin.jvm.internal.*;
import com.kisman.cc.loader.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed" })
final class Class521 implements ActionListener
{
    final JTextField Field10206;
    final JComboBox Field10207;
    private int Field10208;
    
    @Override
    public final void actionPerformed(final ActionEvent actionEvent) {
        if (Class855.Method3594(this.Field10206.getText())) {
            final String text = this.Field10206.getText();
            Intrinsics.checkExpressionValueIsNotNull((Object)text, "keyTextField.text");
            Class950.Method3914(text, Class1204.Method4839()[this.Field10207.getSelectedIndex()]);
        }
    }
    
    Class521(final JTextField field10206, final JComboBox field10207) {
        this.Field10206 = field10206;
        this.Field10207 = field10207;
    }
    
    private static String Method2388(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x230E ^ 0xC3));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
