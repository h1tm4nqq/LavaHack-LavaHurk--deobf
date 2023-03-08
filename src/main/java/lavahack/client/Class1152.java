//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import javax.swing.*;
import javax.swing.event.*;

class Class1152 implements ChangeListener
{
    final Class1251 Field13198;
    final JSlider Field13199;
    final Class1083 Field13200;
    private String Field13201 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class1152(final Class1083 field13200, final Class1251 field13201, final JSlider field13202) {
        this.Field13200 = field13200;
        this.Field13198 = field13201;
        this.Field13199 = field13202;
    }
    
    @Override
    public void stateChanged(final ChangeEvent changeEvent) {
        this.Field13198.Method5030(this.Field13199.getValue());
    }
}
