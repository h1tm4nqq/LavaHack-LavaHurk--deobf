//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import javax.swing.*;
import java.awt.event.*;

class Class1158 implements ActionListener
{
    final Class1251 Field13224;
    final JCheckBox Field13225;
    final Class1083 Field13226;
    private String Field13227 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1158(final Class1083 field13226, final Class1251 field13227, final JCheckBox field13228) {
        this.Field13226 = field13226;
        this.Field13224 = field13227;
        this.Field13225 = field13228;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.Field13224.Method5034(this.Field13225.isSelected());
    }
}
