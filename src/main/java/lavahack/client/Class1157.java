//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import javax.swing.*;
import java.awt.event.*;

class Class1157 implements ActionListener
{
    final Class1251 Field13220;
    final JCheckBox Field13221;
    final Class1083 Field13222;
    private String Field13223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1157(final Class1083 field13222, final Class1251 field13223, final JCheckBox field13224) {
        this.Field13222 = field13222;
        this.Field13220 = field13223;
        this.Field13221 = field13224;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.Field13220.Method5032(this.Field13221.isSelected());
    }
}
