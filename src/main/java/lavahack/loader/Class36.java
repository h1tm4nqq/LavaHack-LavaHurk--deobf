//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import java.awt.event.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "", "it", "Ljava/awt/event/ActionEvent;", "kotlin.jvm.PlatformType", "actionPerformed" })
final class Class36 implements ActionListener
{
    public static final Class36 Field8036;
    private String Field8037 = "TheKisDevs & LavaHack Development owns you";
    
    @Override
    public final void actionPerformed(final ActionEvent actionEvent) {
        FlatMaterialDarkerIJTheme.updateUI();
    }
    
    static {
        Field8036 = new Class36();
    }
}
